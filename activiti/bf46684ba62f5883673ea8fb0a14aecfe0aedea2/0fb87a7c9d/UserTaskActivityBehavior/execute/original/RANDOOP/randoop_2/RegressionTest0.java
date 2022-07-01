import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl4 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setProcessDefinition(processDefinitionImpl4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity3.signal("hi!", (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(executionEntity3);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity2.removeVariablesLocal((java.util.Collection<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteVariablesInstanceForLeavingScope();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList3 = executionEntity2.getExecutions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl2);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity3.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity3.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity4);
        org.junit.Assert.assertNull(executionEntity5);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity4 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addJob(jobEntity4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity1.getVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        java.lang.Class<?> wildcardClass4 = executionEntity1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = executionEntity1.hasVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteCascade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity5 = executionEntity2.addIdentityLink("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity2.setProcessDefinitionId("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        org.activiti.engine.impl.pvm.PvmProcessDefinition pvmProcessDefinition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.PvmProcessInstance pvmProcessInstance5 = executionEntity1.createSubProcessInstance(pvmProcessDefinition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity6 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addTask(taskEntity6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = executionEntity4.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity4);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.initialize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteCascade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = null;
        executionEntity1.setCachedElContext(eLContext3);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity1.getVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity3.getReplacedBy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(executionEntity3);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmTransition[] pvmTransitionArray5 = new org.activiti.engine.impl.pvm.PvmTransition[] {};
        java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition> pvmTransitionList6 = new java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList6, pvmTransitionArray5);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setDeleteReason("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setRevision(100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity17.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext19 = null;
        executionEntity17.setCachedElContext(eLContext19);
        executionEntity17.setExecutionListenerIndex((java.lang.Integer) 10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity24.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext26 = null;
        executionEntity24.setCachedElContext(eLContext26);
        executionEntity24.setExecutionListenerIndex((java.lang.Integer) 10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl30 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl30);
        executionEntity31.setRevision(100);
        executionEntity31.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl36 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity37 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl36);
        executionEntity37.setDeleteReason("hi!");
        executionEntity37.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl42 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl42);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity44 = executionEntity43.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity45 = executionEntity43.getReplacedBy();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl46 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity47 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl46);
        executionEntity47.setDeleteReason("hi!");
        java.lang.String str50 = executionEntity47.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement51 = null;
        executionEntity47.setEventSource(pvmProcessElement51);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl53 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity54 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl53);
        executionEntity54.setRevision(100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl57 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity58 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl57);
        executionEntity58.setDeleteReason("hi!");
        org.activiti.engine.impl.pvm.delegate.ActivityExecution[] activityExecutionArray61 = new org.activiti.engine.impl.pvm.delegate.ActivityExecution[] { executionEntity9, executionEntity13, executionEntity17, executionEntity24, executionEntity31, executionEntity37, executionEntity45, executionEntity47, executionEntity54, executionEntity58 };
        java.util.ArrayList<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList62 = new java.util.ArrayList<org.activiti.engine.impl.pvm.delegate.ActivityExecution>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.pvm.delegate.ActivityExecution>) activityExecutionList62, activityExecutionArray61);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.takeAll((java.util.List<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList6, (java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution>) activityExecutionList62);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.impl.pvm.PvmException; message: joining scope executions is not allowed");
        } catch (org.activiti.engine.impl.pvm.PvmException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(pvmTransitionArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(executionEntity18);
        org.junit.Assert.assertNull(executionEntity25);
        org.junit.Assert.assertNull(executionEntity44);
        org.junit.Assert.assertNull(executionEntity45);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(activityExecutionArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity3.setId("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(executionEntity3);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = executionEntity1.setVariableLocal("hi!", (java.lang.Object) activityImpl5);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.end();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.pvm.PvmProcessDefinition pvmProcessDefinition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.PvmProcessInstance pvmProcessInstance7 = executionEntity1.createSubProcessInstance(pvmProcessDefinition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl3);
        executionEntity4.setDeleteReason("hi!");
        executionEntity4.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray9 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10, variableInstanceEntityArray9);
        executionEntity4.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity14.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = null;
        executionEntity14.setCachedElContext(eLContext16);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity19.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = null;
        executionEntity19.setCachedElContext(eLContext21);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        executionEntity24.setRevision(100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        executionEntity28.setRevision(100);
        executionEntity28.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        executionEntity34.setDeleteReason("hi!");
        java.lang.String str37 = executionEntity34.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement38 = null;
        executionEntity34.setEventSource(pvmProcessElement38);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl40);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = executionEntity41.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = executionEntity41.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray44 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity4, executionEntity14, executionEntity19, executionEntity24, executionEntity28, executionEntity34, executionEntity43 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList45 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList45, executionEntityArray44);
        executionEntity1.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList45);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroyScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(executionEntity15);
        org.junit.Assert.assertNull(executionEntity20);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(executionEntity42);
        org.junit.Assert.assertNull(executionEntity43);
        org.junit.Assert.assertNotNull(executionEntityArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl3);
        executionEntity4.setDeleteReason("hi!");
        executionEntity4.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray9 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10, variableInstanceEntityArray9);
        executionEntity4.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity14.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = null;
        executionEntity14.setCachedElContext(eLContext16);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity19.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = null;
        executionEntity19.setCachedElContext(eLContext21);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        executionEntity24.setRevision(100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        executionEntity28.setRevision(100);
        executionEntity28.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        executionEntity34.setDeleteReason("hi!");
        java.lang.String str37 = executionEntity34.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement38 = null;
        executionEntity34.setEventSource(pvmProcessElement38);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl40);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = executionEntity41.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = executionEntity41.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray44 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity4, executionEntity14, executionEntity19, executionEntity24, executionEntity28, executionEntity34, executionEntity43 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList45 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList45, executionEntityArray44);
        executionEntity1.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = executionEntity1.updateProcessBusinessKey("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(executionEntity15);
        org.junit.Assert.assertNull(executionEntity20);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(executionEntity42);
        org.junit.Assert.assertNull(executionEntity43);
        org.junit.Assert.assertNotNull(executionEntityArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.end();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = executionEntity1.getVariable("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList10 = executionEntity1.getIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.findExecution("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = null;
        executionEntity1.setCachedElContext(eLContext3);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariable("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl3);
        executionEntity4.setDeleteReason("hi!");
        executionEntity4.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray9 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10, variableInstanceEntityArray9);
        executionEntity4.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity14.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = null;
        executionEntity14.setCachedElContext(eLContext16);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity19.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = null;
        executionEntity19.setCachedElContext(eLContext21);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        executionEntity24.setRevision(100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        executionEntity28.setRevision(100);
        executionEntity28.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        executionEntity34.setDeleteReason("hi!");
        java.lang.String str37 = executionEntity34.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement38 = null;
        executionEntity34.setEventSource(pvmProcessElement38);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl40);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = executionEntity41.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = executionEntity41.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray44 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity4, executionEntity14, executionEntity19, executionEntity24, executionEntity28, executionEntity34, executionEntity43 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList45 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList45, executionEntityArray44);
        executionEntity1.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList45);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = executionEntity1.hasVariableLocal("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(executionEntity15);
        org.junit.Assert.assertNull(executionEntity20);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(executionEntity42);
        org.junit.Assert.assertNull(executionEntity43);
        org.junit.Assert.assertNotNull(executionEntityArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList4 = executionEntity1.getTasks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = executionEntity1.setVariableLocal("hi!", (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap3 = executionEntity2.getVariables();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getSubProcessInstance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = executionEntity3.getCurrentActivityName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(executionEntity3);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = executionEntity1.hasVariable("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity4);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList4 = executionEntity1.getQueryVariables();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setVariable("hi!", obj6);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(variableInstanceEntityList4);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = null;
        executionEntity1.setCachedElContext(eLContext3);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity1.getTransitionBeingTaken();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.createVariableLocal("hi!", (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(transitionImpl5);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.findExecution("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        int int4 = executionEntity1.getRevisionNext();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity7 = executionEntity1.addIdentityLink("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity1.createExecution();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(executionEntity3);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList4 = executionEntity3.findActiveActivityIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(executionEntity3);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        executionEntity1.forceUpdate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList8 = executionEntity1.getTasks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity1.getTransitionBeingTaken();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.initialize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(transitionImpl9);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList6 = executionEntity1.getEventSubscriptionsInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity1.getCompensateEventSubscriptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl3);
        executionEntity4.setDeleteReason("hi!");
        executionEntity4.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray9 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10, variableInstanceEntityArray9);
        executionEntity4.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity14.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = null;
        executionEntity14.setCachedElContext(eLContext16);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity19.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = null;
        executionEntity19.setCachedElContext(eLContext21);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        executionEntity24.setRevision(100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        executionEntity28.setRevision(100);
        executionEntity28.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        executionEntity34.setDeleteReason("hi!");
        java.lang.String str37 = executionEntity34.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement38 = null;
        executionEntity34.setEventSource(pvmProcessElement38);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl40);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = executionEntity41.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = executionEntity41.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray44 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity4, executionEntity14, executionEntity19, executionEntity24, executionEntity28, executionEntity34, executionEntity43 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList45 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList45, executionEntityArray44);
        executionEntity1.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList45);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity48 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.executeActivity(pvmActivity48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(executionEntity15);
        org.junit.Assert.assertNull(executionEntity20);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(executionEntity42);
        org.junit.Assert.assertNull(executionEntity43);
        org.junit.Assert.assertNotNull(executionEntityArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = null;
        executionEntity1.setCachedElContext(eLContext3);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = executionEntity1.hasVariable("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.PvmTransition[] pvmTransitionArray8 = new org.activiti.engine.impl.pvm.PvmTransition[] {};
        java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition> pvmTransitionList9 = new java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList9, pvmTransitionArray8);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        executionEntity12.setRevision(100);
        executionEntity12.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity17 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList18 = executionEntity12.findInactiveConcurrentExecutions(pvmActivity17);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.takeAll((java.util.List<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList9, activityExecutionList18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(pvmTransitionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(activityExecutionList18);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity3.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(executionEntity3);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteVariablesInstanceForLeavingScope();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl2);
        executionEntity3.setDeleteReason("hi!");
        java.lang.String str6 = executionEntity3.getEventName();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroyScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity1.getProcessInstance();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity6.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity4.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity4);
        org.junit.Assert.assertNull(executionEntity9);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity1.getTransitionBeingTaken();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(transitionImpl9);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.remove();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        java.lang.String str3 = executionEntity1.getDeleteReason();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal((java.util.Collection<java.lang.String>) strList6);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        executionEntity1.setScope(true);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl3);
        executionEntity4.setDeleteReason("hi!");
        executionEntity4.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray9 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10, variableInstanceEntityArray9);
        executionEntity4.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity14.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = null;
        executionEntity14.setCachedElContext(eLContext16);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity19.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = null;
        executionEntity19.setCachedElContext(eLContext21);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        executionEntity24.setRevision(100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        executionEntity28.setRevision(100);
        executionEntity28.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        executionEntity34.setDeleteReason("hi!");
        java.lang.String str37 = executionEntity34.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement38 = null;
        executionEntity34.setEventSource(pvmProcessElement38);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl40);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = executionEntity41.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = executionEntity41.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray44 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity4, executionEntity14, executionEntity19, executionEntity24, executionEntity28, executionEntity34, executionEntity43 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList45 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList45, executionEntityArray44);
        executionEntity1.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList45);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList48 = executionEntity1.getJobs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(executionEntity15);
        org.junit.Assert.assertNull(executionEntity20);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(executionEntity42);
        org.junit.Assert.assertNull(executionEntity43);
        org.junit.Assert.assertNotNull(executionEntityArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        executionEntity1.setActive(false);
        executionEntity1.inactivate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = executionEntity1.getVariableLocal("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl7);
        java.lang.String str9 = executionEntity1.getTenantId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity12.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = executionEntity1.setVariableLocal("", (java.lang.Object) executionEntity12);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(executionEntity13);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = executionEntity1.getVariableLocal("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl7);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariable("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList4 = executionEntity2.findInactiveConcurrentExecutions(pvmActivity3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity9 = executionEntity1.involveUser("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity8.getVariablesLocal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        java.lang.Object obj7 = executionEntity1.getPersistentState();
        java.lang.String str8 = executionEntity1.getId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList9 = executionEntity1.getExecutions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl2);
        executionEntity3.setRevision(100);
        int int6 = executionEntity3.getRevisionNext();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition8);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity3, "hi!", (java.lang.Object) userTaskActivityBehavior9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl2);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity3.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity3.setCachedElContext(eLContext5);
        executionEntity3.setExecutionListenerIndex((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity4);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.initialize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        java.lang.Object obj7 = executionEntity1.getPersistentState();
        java.lang.String str8 = executionEntity1.getId();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = executionEntity1.updateProcessBusinessKey("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity6 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addTask(taskEntity6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariableLocal("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        boolean boolean11 = executionEntity1.isActive();
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity12 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeEventSubscription(eventSubscriptionEntity12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity11 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList12 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity11);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity1.findExecution("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertNotNull(activityExecutionList12);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.createExecution();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        java.lang.String str12 = executionEntity1.getCurrentActivityId();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl13 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setProcessDefinition(processDefinitionImpl13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        executionEntity1.forceUpdate();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal((java.util.Collection<java.lang.String>) strList12);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity1.getCompensateEventSubscriptions("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = executionEntity2.getProcessDefinitionId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = executionEntity1.hasVariableLocal("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity1.getStartingExecution();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteVariablesInstanceForLeavingScope();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(startingExecution7);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        java.lang.String str4 = executionEntity1.getId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        executionEntity1.setScope(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList13 = executionEntity1.getTasks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity1.getCompensateEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        executionEntity1.setRevision((int) (short) 0);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal((java.util.Collection<java.lang.String>) strList14);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = null;
        executionEntity1.setCachedElContext(eLContext3);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str7 = executionEntity1.getId();
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity8 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeEventSubscription(eventSubscriptionEntity8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.createExecution();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        executionEntity1.forceUpdate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList13 = executionEntity1.getJobs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity11 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList12 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity11);
        boolean boolean13 = executionEntity1.isEnded();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertNotNull(activityExecutionList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity1.getTransitionBeingTaken();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet10 = executionEntity1.getVariableNamesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(transitionImpl9);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        int int1 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity2 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity0.addEventSubscription(eventSubscriptionEntity2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        java.lang.String str12 = executionEntity1.getCurrentActivityId();
        java.lang.String str13 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmTransition pvmTransition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.take(pvmTransition14);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.impl.pvm.PvmException; message: transition is null");
        } catch (org.activiti.engine.impl.pvm.PvmException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        java.lang.String str3 = executionEntity1.getDeleteReason();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl3);
        executionEntity4.setDeleteReason("hi!");
        executionEntity4.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray9 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10, variableInstanceEntityArray9);
        executionEntity4.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity14.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = null;
        executionEntity14.setCachedElContext(eLContext16);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity19.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = null;
        executionEntity19.setCachedElContext(eLContext21);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        executionEntity24.setRevision(100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        executionEntity28.setRevision(100);
        executionEntity28.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        executionEntity34.setDeleteReason("hi!");
        java.lang.String str37 = executionEntity34.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement38 = null;
        executionEntity34.setEventSource(pvmProcessElement38);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl40);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = executionEntity41.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = executionEntity41.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray44 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity4, executionEntity14, executionEntity19, executionEntity24, executionEntity28, executionEntity34, executionEntity43 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList45 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList45, executionEntityArray44);
        executionEntity1.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList45);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity49 = executionEntity1.findExecution("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(executionEntity15);
        org.junit.Assert.assertNull(executionEntity20);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(executionEntity42);
        org.junit.Assert.assertNull(executionEntity43);
        org.junit.Assert.assertNotNull(executionEntityArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        java.lang.String str8 = executionEntity1.getCurrentActivityName();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        executionEntity1.setActive(false);
        executionEntity1.inactivate();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior11.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity15.getSuperExecution();
        executionEntity15.inactivate();
        java.lang.String str18 = executionEntity15.getBusinessKey();
        executionEntity15.setBusinessKey("");
        boolean boolean21 = executionEntity15.isScope();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = executionEntity1.setVariableLocal("", (java.lang.Object) userTaskActivityBehavior11, executionEntity15);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity10 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeEventSubscription(eventSubscriptionEntity10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = executionEntity1.getActivity();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal((java.util.Collection<java.lang.String>) strList11);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertNull(activityImpl8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = executionEntity1.hasVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity9 = executionEntity1.involveUser("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        executionEntity1.forceUpdate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = executionEntity1.isActive("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList4 = executionEntity3.getTasks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(executionEntity3);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity11.setId("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity11);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        executionEntity1.setProcessDefinitionId("");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroyScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        executionEntity1.forceUpdate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = executionEntity1.hasVariable("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setDeleteReason("hi!");
        java.lang.String str10 = executionEntity7.getEventName();
        java.lang.Object obj11 = executionEntity7.getPersistentState();
        executionEntity7.setProcessDefinitionId("");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setVariable("", (java.lang.Object) executionEntity7);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList6 = executionEntity1.getTasks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray4 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5, variableInstanceEntityArray4);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.initialize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        java.lang.String str12 = executionEntity1.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity1.getProcessInstance();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal((java.util.Collection<java.lang.String>) strList17);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(executionEntity13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity8.setScope(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity6.forceUpdate();
        java.lang.Class<?> wildcardClass12 = executionEntity6.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl3);
        executionEntity4.setDeleteReason("hi!");
        executionEntity4.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray9 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10, variableInstanceEntityArray9);
        executionEntity4.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity14.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = null;
        executionEntity14.setCachedElContext(eLContext16);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity19.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = null;
        executionEntity19.setCachedElContext(eLContext21);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        executionEntity24.setRevision(100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        executionEntity28.setRevision(100);
        executionEntity28.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        executionEntity34.setDeleteReason("hi!");
        java.lang.String str37 = executionEntity34.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement38 = null;
        executionEntity34.setEventSource(pvmProcessElement38);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl40);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = executionEntity41.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = executionEntity41.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray44 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity4, executionEntity14, executionEntity19, executionEntity24, executionEntity28, executionEntity34, executionEntity43 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList45 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList45, executionEntityArray44);
        executionEntity1.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList45);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList48 = executionEntity1.getTasks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(executionEntity15);
        org.junit.Assert.assertNull(executionEntity20);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(executionEntity42);
        org.junit.Assert.assertNull(executionEntity43);
        org.junit.Assert.assertNotNull(executionEntityArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroyScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        java.lang.String str5 = executionEntity1.getEventName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = executionEntity1.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.setProcessDefinitionId("");
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal((java.util.Collection<java.lang.String>) strList7);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        executionEntity1.setRevision((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteVariablesInstanceForLeavingScope();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.remove();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setDeleteReason("hi!");
        java.lang.String str10 = executionEntity7.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = null;
        executionEntity7.setEventSource(pvmProcessElement11);
        java.lang.Object obj13 = executionEntity7.getPersistentState();
        java.lang.String str14 = executionEntity7.getId();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity7.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap15);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl17);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables((java.util.Collection<java.lang.String>) strList21);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        boolean boolean11 = executionEntity1.isActive();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        boolean boolean10 = executionEntity1.isActive();
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity11 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addEventSubscription(eventSubscriptionEntity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getProcessInstanceId();
        executionEntity1.setTenantId("");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteCascade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity11.getSuperExecution();
        executionEntity11.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = null;
        executionEntity11.setTransitionBeingTaken(transitionImpl14);
        java.lang.String str16 = executionEntity11.getProcessInstanceId();
        int int17 = executionEntity11.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setRevision(100);
        executionEntity19.setBusinessKey("");
        executionEntity19.setActive(false);
        executionEntity11.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl28 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl28);
        executionEntity29.setDeleteReason("hi!");
        java.lang.String str32 = executionEntity29.getCurrentActivityId();
        int int33 = executionEntity29.getRevisionNext();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(executionEntity12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity11 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList12 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity11);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl13);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertNotNull(activityExecutionList12);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl3);
        executionEntity4.setDeleteReason("hi!");
        executionEntity4.setSuspensionState((int) (byte) 10);
        java.lang.String str9 = executionEntity4.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = executionEntity4.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity11 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList12 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity11);
        boolean boolean13 = executionEntity1.isEnded();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.initialize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertNotNull(activityExecutionList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity11 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList12 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity11);
        boolean boolean13 = executionEntity1.isEnded();
        boolean boolean14 = executionEntity1.isSuspended();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertNotNull(activityExecutionList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity6.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity6);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setRevision(100);
        executionEntity9.setBusinessKey("");
        executionEntity9.setActive(false);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.PvmProcessDefinition pvmProcessDefinition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.PvmProcessInstance pvmProcessInstance19 = executionEntity1.createSubProcessInstance(pvmProcessDefinition18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity13 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addJob(jobEntity13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        java.lang.Class<?> wildcardClass8 = activityExecutionList7.getClass();
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        boolean boolean5 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = null;
        executionEntity7.setCachedElContext(eLContext9);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity12 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addTask(taskEntity12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setRevision(100);
        executionEntity9.setBusinessKey("");
        executionEntity9.setActive(false);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = executionEntity1.getTransition();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity1.getCompensateEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(transitionImpl17);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = executionEntity6.getTransition();
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation12 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity6.performOperation(atomicOperation12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(transitionImpl11);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        executionEntity1.setActive(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = executionEntity1.hasVariableLocal("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray4 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5, variableInstanceEntityArray4);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity1.getEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = executionEntity1.getVariable("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        java.lang.String str12 = executionEntity1.getCurrentActivityId();
        java.lang.String str13 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution14 = executionEntity1.getStartingExecution();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity1.getSubProcessInstance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(startingExecution14);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getProcessInstance();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement12 = null;
        executionEntity1.setEventSource(pvmProcessElement12);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        executionEntity1.setActivity(activityImpl14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = executionEntity1.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity11);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        executionEntity1.forceUpdate();
        int int10 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity11 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeJob(jobEntity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity1.getStartingExecution();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariableLocal("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(startingExecution7);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getProcessInstance();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement12 = null;
        executionEntity1.setEventSource(pvmProcessElement12);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        executionEntity1.setActivity(activityImpl14);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity18 = executionEntity1.addIdentityLink("hi!", "ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity11);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        boolean boolean5 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = null;
        executionEntity7.setCachedElContext(eLContext9);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteCascade("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        executionEntity1.setActive(false);
        executionEntity1.inactivate();
        executionEntity1.setProcessDefinitionId("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList11 = executionEntity1.getIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity11 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList12 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList13 = executionEntity1.getCompensateEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertNotNull(activityExecutionList12);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity7.removeVariableLocal("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = executionEntity1.getQueryVariables();
        boolean boolean6 = executionEntity1.isProcessInstanceType();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "ProcessInstance[null]", "ProcessInstance[null]" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal((java.util.Collection<java.lang.String>) strList11);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(variableInstanceEntityList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setDeleteReason("hi!");
        java.lang.String str10 = executionEntity7.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = null;
        executionEntity7.setEventSource(pvmProcessElement11);
        java.lang.Object obj13 = executionEntity7.getPersistentState();
        java.lang.String str14 = executionEntity7.getId();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity7.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap15);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl17);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = executionEntity19.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(executionEntity19);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList4 = executionEntity1.getJobs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.setParentId("hi!");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroyScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        java.lang.String str12 = executionEntity1.getCurrentActivityId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity1.getEventSubscriptionsInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        executionEntity12.setDeleteReason("hi!");
        java.lang.String str15 = executionEntity12.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement16 = null;
        executionEntity12.setEventSource(pvmProcessElement16);
        java.lang.Object obj18 = executionEntity12.getPersistentState();
        java.lang.String str19 = executionEntity12.getId();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = executionEntity12.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = executionEntity1.setVariableLocal("", (java.lang.Object) strMap20);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl7);
        java.lang.String str9 = executionEntity1.getTenantId();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity10 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.executeActivity(pvmActivity10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity11 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList12 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity11);
        boolean boolean13 = executionEntity1.isEnded();
        boolean boolean14 = executionEntity1.isSuspended();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity1.getSubProcessInstance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertNotNull(activityExecutionList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = executionEntity6.getTransition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = executionEntity6.isActive("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(transitionImpl11);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        executionEntity1.forceUpdate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList8 = executionEntity1.findActiveActivityIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet2 = executionEntity1.getVariableNamesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity7 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addJob(jobEntity7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = null;
        executionEntity1.setCachedElContext(eLContext3);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity1.getTransitionBeingTaken();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(transitionImpl5);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl2 = executionEntity1.getTransitionBeingTaken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = executionEntity1.updateProcessBusinessKey("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl2);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList8 = executionEntity1.getExecutions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = null;
        executionEntity1.setCachedElContext(eLContext3);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str7 = executionEntity1.getId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariable("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        boolean boolean5 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = null;
        executionEntity7.setCachedElContext(eLContext9);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        executionEntity7.setTenantId("");
        executionEntity7.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity17.getSuperExecution();
        executionEntity17.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl20 = null;
        executionEntity17.setTransitionBeingTaken(transitionImpl20);
        java.lang.String str22 = executionEntity17.getProcessInstanceId();
        int int23 = executionEntity17.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl24 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl24);
        executionEntity25.setRevision(100);
        executionEntity25.setBusinessKey("");
        executionEntity25.setActive(false);
        executionEntity17.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity25);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl33 = executionEntity17.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = executionEntity7.setVariableLocal("", (java.lang.Object) executionEntity17, executionEntity34);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertNull(executionEntity18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNull(transitionImpl33);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = executionEntity7.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        int int4 = executionEntity1.getRevisionNext();
        executionEntity1.setCachedEntityState((int) (short) 0);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity1.getEventSubscriptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity1.getVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(eventSubscriptionEntityList7);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        executionEntity1.setScope(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity1.getQueryVariables();
        boolean boolean8 = executionEntity1.isScope();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertNull(variableInstanceEntityList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        executionEntity1.forceUpdate();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 7);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.end();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = null;
        executionEntity1.setCachedElContext(eLContext3);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str7 = executionEntity1.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = executionEntity8.getProcessInstanceId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        boolean boolean10 = executionEntity1.isActive();
        executionEntity1.setDeleteReason("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity15.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.createVariableLocal("", (java.lang.Object) executionEntity15);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(executionEntity16);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        executionEntity1.setScope(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity1.getQueryVariables();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariable("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertNull(variableInstanceEntityList7);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet4 = executionEntity1.getVariableNamesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity1.getEventSource();
        org.activiti.engine.EngineServices engineServices5 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setRevision(100);
        executionEntity8.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setDeleteReason("hi!");
        java.lang.String str17 = executionEntity14.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement18 = null;
        executionEntity14.setEventSource(pvmProcessElement18);
        java.lang.Object obj20 = executionEntity14.getPersistentState();
        java.lang.String str21 = executionEntity14.getId();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = executionEntity14.getProcessVariables();
        executionEntity8.setVariablesLocal(strMap22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = executionEntity1.setVariableLocal("", (java.lang.Object) executionEntity8);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(pvmProcessElement4);
        org.junit.Assert.assertNull(engineServices5);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity7 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addEventSubscription(eventSubscriptionEntity7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity1.getProcessVariables();
        int int8 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity9 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addEventSubscription(eventSubscriptionEntity9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        boolean boolean6 = executionEntity1.isDeleteRoot();
        java.lang.String[] strArray10 = new java.lang.String[] { "ProcessInstance[null]", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables((java.util.Collection<java.lang.String>) strList11);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity6.removeIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity11.getSuperExecution();
        executionEntity11.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = null;
        executionEntity11.setTransitionBeingTaken(transitionImpl14);
        java.lang.String str16 = executionEntity11.getProcessInstanceId();
        int int17 = executionEntity11.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setRevision(100);
        executionEntity19.setBusinessKey("");
        executionEntity19.setActive(false);
        executionEntity11.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity11.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(executionEntity12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmTransition pvmTransition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.take(pvmTransition6);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.impl.pvm.PvmException; message: transition is null");
        } catch (org.activiti.engine.impl.pvm.PvmException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity8.setScope(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity11 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList12 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity11);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = executionEntity1.isActive("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertNotNull(activityExecutionList12);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        int int10 = executionEntity1.getRevisionNext();
        boolean boolean11 = executionEntity1.isEnded();
        java.lang.String str12 = executionEntity1.getId();
        java.lang.String str13 = executionEntity1.getParentId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        boolean boolean10 = executionEntity1.isActive();
        executionEntity1.setDeleteReason("hi!");
        boolean boolean13 = executionEntity1.isProcessInstanceType();
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation14 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.performOperation(atomicOperation14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getReplacedBy();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity4 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList5 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity4);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity6 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeEventSubscription(eventSubscriptionEntity6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(executionEntity3);
        org.junit.Assert.assertNotNull(activityExecutionList5);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        executionEntity1.setScope(false);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteVariablesInstanceForLeavingScope();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        executionEntity1.forceUpdate();
        executionEntity1.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getReplacedBy();
        java.lang.String str11 = executionEntity1.getTenantId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.end();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.performOperation(atomicOperation9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getProcessInstance();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement12 = null;
        executionEntity1.setEventSource(pvmProcessElement12);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        executionEntity1.setActivity(activityImpl14);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement16 = null;
        executionEntity1.setEventSource(pvmProcessElement16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = executionEntity1.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity11);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setDeleteReason("hi!");
        java.lang.String str10 = executionEntity7.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = null;
        executionEntity7.setEventSource(pvmProcessElement11);
        java.lang.Object obj13 = executionEntity7.getPersistentState();
        java.lang.String str14 = executionEntity7.getId();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity7.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap15);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl17);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.initialize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity7.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList10 = executionEntity7.getIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroyScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity13.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext15 = null;
        executionEntity13.setCachedElContext(eLContext15);
        executionEntity13.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str19 = executionEntity13.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity13.getParent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity13.getParent();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setVariable("ProcessInstance[null]", (java.lang.Object) executionEntity21);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(executionEntity20);
        org.junit.Assert.assertNull(executionEntity21);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior2);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setRevision(100);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray11 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList12 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList12, variableInstanceEntityArray11);
        executionEntity8.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList12);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity11.getSuperExecution();
        executionEntity11.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = null;
        executionEntity11.setTransitionBeingTaken(transitionImpl14);
        java.lang.String str16 = executionEntity11.getProcessInstanceId();
        int int17 = executionEntity11.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setRevision(100);
        executionEntity19.setBusinessKey("");
        executionEntity19.setActive(false);
        executionEntity11.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity30 = executionEntity1.addIdentityLink("ProcessInstance[null]", "ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(executionEntity12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        java.lang.String str12 = executionEntity1.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = executionEntity13.getProcessDefinitionId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(executionEntity13);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl10);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariableLocal("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl7);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setProcessDefinition(processDefinitionImpl9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setRevision(100);
        executionEntity9.setBusinessKey("");
        executionEntity9.setActive(false);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        executionEntity1.forceUpdate();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariableLocal("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        executionEntity1.setProcessDefinitionId("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList8 = executionEntity1.getJobs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        boolean boolean5 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = null;
        executionEntity7.setCachedElContext(eLContext9);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity7.deleteCascade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        executionEntity1.forceUpdate();
        executionEntity1.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet11 = executionEntity1.getVariableNamesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(executionEntity10);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.EngineServices engineServices5 = executionEntity4.getEngineServices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity4);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        java.lang.Object obj7 = executionEntity1.getPersistentState();
        java.lang.String str8 = executionEntity1.getId();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity1.getCompensateEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl7);
        java.lang.String str9 = executionEntity1.getTenantId();
        executionEntity1.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity11 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addTask(taskEntity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity1.getEventSource();
        org.activiti.engine.EngineServices engineServices5 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.pvm.PvmProcessDefinition pvmProcessDefinition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.PvmProcessInstance pvmProcessInstance7 = executionEntity1.createSubProcessInstance(pvmProcessDefinition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(pvmProcessElement4);
        org.junit.Assert.assertNull(engineServices5);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        java.lang.String str6 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity7 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.executeActivity(pvmActivity7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity6.getParent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        java.lang.String str15 = executionEntity14.getProcessInstanceId();
        executionEntity14.setTenantId("");
        executionEntity14.setExecutionListenerIndex((java.lang.Integer) 10);
        executionEntity14.setCachedEntityState(2);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity6.setVariable("ProcessInstance[null]", (java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity7.getTransition();
        java.lang.String str10 = executionEntity7.getDeleteReason();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = executionEntity7.setVariableLocal("", (java.lang.Object) (byte) 1, executionEntity13);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(transitionImpl9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        java.lang.String str12 = executionEntity1.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList15 = executionEntity1.getCompensateEventSubscriptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(executionEntity13);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getProcessInstance();
        java.lang.String str12 = executionEntity1.getTenantId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.end();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setRevision(100);
        executionEntity9.setBusinessKey("");
        executionEntity9.setActive(false);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity18 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addEventSubscription(eventSubscriptionEntity18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity11.getSuperExecution();
        executionEntity11.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = null;
        executionEntity11.setTransitionBeingTaken(transitionImpl14);
        java.lang.String str16 = executionEntity11.getProcessInstanceId();
        int int17 = executionEntity11.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setRevision(100);
        executionEntity19.setBusinessKey("");
        executionEntity19.setActive(false);
        executionEntity11.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList28 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation29 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.performOperation(atomicOperation29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(executionEntity12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNull(variableInstanceEntityList28);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList9 = executionEntity8.getTasks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(startingExecution7);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = null;
        executionEntity1.setCachedElContext(eLContext3);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str7 = executionEntity1.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = executionEntity8.getBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        executionEntity1.forceUpdate();
        executionEntity1.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getReplacedBy();
        java.lang.String str11 = executionEntity1.getTenantId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.initialize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getReplacedBy();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity12.getSuperExecution();
        executionEntity12.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = null;
        executionEntity12.setTransitionBeingTaken(transitionImpl15);
        java.lang.String str17 = executionEntity12.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl18 = null;
        executionEntity12.setTransition(transitionImpl18);
        boolean boolean20 = executionEntity12.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl21 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl21);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = executionEntity22.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl24 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl24);
        executionEntity25.setDeleteReason("hi!");
        executionEntity25.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray30 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList31 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList31, variableInstanceEntityArray30);
        executionEntity25.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList31);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl34 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl34);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = executionEntity35.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext37 = null;
        executionEntity35.setCachedElContext(eLContext37);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl39 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl39);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = executionEntity40.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext42 = null;
        executionEntity40.setCachedElContext(eLContext42);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl44 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity45 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl44);
        executionEntity45.setRevision(100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl48 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity49 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl48);
        executionEntity49.setRevision(100);
        executionEntity49.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl54 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity55 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl54);
        executionEntity55.setDeleteReason("hi!");
        java.lang.String str58 = executionEntity55.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement59 = null;
        executionEntity55.setEventSource(pvmProcessElement59);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl61 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity62 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl61);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity63 = executionEntity62.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity64 = executionEntity62.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray65 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity25, executionEntity35, executionEntity40, executionEntity45, executionEntity49, executionEntity55, executionEntity64 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList66 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList66, executionEntityArray65);
        executionEntity22.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList66);
        executionEntity12.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList66);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity10.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertNull(executionEntity13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(executionEntity23);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(executionEntity36);
        org.junit.Assert.assertNull(executionEntity41);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(executionEntity63);
        org.junit.Assert.assertNull(executionEntity64);
        org.junit.Assert.assertNotNull(executionEntityArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = executionEntity8.isDeleteRoot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(startingExecution7);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = executionEntity1.hasVariable("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        java.lang.String str12 = executionEntity1.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList14 = executionEntity1.getTasks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(executionEntity13);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        boolean boolean5 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = null;
        executionEntity7.setCachedElContext(eLContext9);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        executionEntity1.setActive(false);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariableLocal("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        java.lang.String str6 = executionEntity1.getEventName();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.getSubProcessInstance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl3);
        executionEntity4.setDeleteReason("hi!");
        executionEntity4.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray9 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10, variableInstanceEntityArray9);
        executionEntity4.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity14.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = null;
        executionEntity14.setCachedElContext(eLContext16);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity19.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = null;
        executionEntity19.setCachedElContext(eLContext21);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        executionEntity24.setRevision(100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        executionEntity28.setRevision(100);
        executionEntity28.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        executionEntity34.setDeleteReason("hi!");
        java.lang.String str37 = executionEntity34.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement38 = null;
        executionEntity34.setEventSource(pvmProcessElement38);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl40);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = executionEntity41.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = executionEntity41.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray44 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity4, executionEntity14, executionEntity19, executionEntity24, executionEntity28, executionEntity34, executionEntity43 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList45 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList45, executionEntityArray44);
        executionEntity1.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList45);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity48 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeEventSubscription(eventSubscriptionEntity48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(executionEntity15);
        org.junit.Assert.assertNull(executionEntity20);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(executionEntity42);
        org.junit.Assert.assertNull(executionEntity43);
        org.junit.Assert.assertNotNull(executionEntityArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        java.lang.String str4 = executionEntity1.getId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariableLocal("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        int int10 = executionEntity1.getRevisionNext();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.createExecution();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        boolean boolean5 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = null;
        executionEntity7.setCachedElContext(eLContext9);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity7.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity1.getEventSource();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setRevision(100);
        executionEntity7.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity12 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList13 = executionEntity7.findInactiveConcurrentExecutions(pvmActivity12);
        int int14 = executionEntity7.getSuspensionState();
        executionEntity7.setActive(true);
        executionEntity7.setScope(true);
        java.lang.String str19 = executionEntity7.getSuperExecutionId();
        java.lang.String str20 = executionEntity7.getId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = executionEntity1.setVariableLocal("hi!", (java.lang.Object) executionEntity7);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(pvmProcessElement4);
        org.junit.Assert.assertNotNull(activityExecutionList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity11.getSuperExecution();
        executionEntity11.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = null;
        executionEntity11.setTransitionBeingTaken(transitionImpl14);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setDeleteReason("hi!");
        executionEntity17.setSuspensionState((int) (byte) 10);
        java.lang.String str22 = executionEntity17.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity23);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = executionEntity23.getProcessVariables();
        executionEntity11.createVariablesLocal(strMap25);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.createVariableLocal("hi!", (java.lang.Object) executionEntity11);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity12);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl7);
        java.lang.String str9 = executionEntity1.getTenantId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getReplacedBy();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = null;
        executionEntity1.setEventSource(pvmProcessElement11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap13 = executionEntity1.getVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(executionEntity10);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl7);
        java.lang.String str9 = executionEntity1.getTenantId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList11 = executionEntity1.getCompensateEventSubscriptions("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = executionEntity1.getTransition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = executionEntity1.hasVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(transitionImpl11);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getProcessInstanceId();
        executionEntity1.setTenantId("");
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = executionEntity1.hasVariableLocal("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        java.lang.String str12 = executionEntity1.getCurrentActivityId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteVariablesInstanceForLeavingScope();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity4.setExecutionListenerIndex((java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity4);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        executionEntity1.forceUpdate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList10 = executionEntity1.findActiveActivityIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str11 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement12 = executionEntity1.getEventSource();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity14.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(pvmProcessElement12);
        org.junit.Assert.assertNull(executionEntity15);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        executionEntity1.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity8.getVariables();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = null;
        executionEntity1.setTransition(transitionImpl7);
        boolean boolean9 = executionEntity1.isConcurrent();
        int int10 = executionEntity1.getSuspensionState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = executionEntity1.getVariableLocal("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        java.lang.Object obj7 = executionEntity1.getPersistentState();
        java.lang.String str8 = executionEntity1.getId();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariable("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl16 = executionEntity13.getTransition();
        java.lang.String str17 = executionEntity13.getEventName();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = executionEntity13.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setVariable("hi!", (java.lang.Object) executionEntity13);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(transitionImpl16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet3 = executionEntity2.getVariableNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        executionEntity1.forceUpdate();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        executionEntity1.forceUpdate();
        executionEntity1.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl11 = executionEntity10.getProcessDefinition();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(executionEntity10);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        int int10 = executionEntity1.getRevisionNext();
        boolean boolean11 = executionEntity1.isEnded();
        java.lang.String str12 = executionEntity1.getId();
        boolean boolean13 = executionEntity1.isProcessInstanceType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = executionEntity1.isActive("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        executionEntity1.setProcessDefinitionId("");
        executionEntity1.setEventName("hi!");
        int int10 = executionEntity1.getCachedEntityState();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.remove();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        int int11 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity12 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeEventSubscription(eventSubscriptionEntity12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl7);
        java.lang.String str9 = executionEntity1.getTenantId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getReplacedBy();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = null;
        executionEntity1.setEventSource(pvmProcessElement11);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.initialize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(executionEntity10);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap11 = executionEntity10.getVariablesLocal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl7);
        java.lang.String str9 = executionEntity1.getTenantId();
        executionEntity1.disposeStartingExecution();
        java.lang.Class<?> wildcardClass11 = executionEntity1.getClass();
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = null;
        executionEntity1.setCachedElContext(eLContext3);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity1.getTransitionBeingTaken();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "ProcessInstance[null]", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables((java.util.Collection<java.lang.String>) strList10);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(transitionImpl5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        java.lang.String str9 = executionEntity1.getDeleteReason();
        org.activiti.engine.impl.pvm.PvmProcessDefinition pvmProcessDefinition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.PvmProcessInstance pvmProcessInstance11 = executionEntity1.createSubProcessInstance(pvmProcessDefinition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        int int10 = executionEntity1.getRevisionNext();
        boolean boolean11 = executionEntity1.isEnded();
        java.lang.String str12 = executionEntity1.getId();
        java.lang.String str13 = executionEntity1.getParentId();
        executionEntity1.setParentId("ProcessInstance[null]");
        java.lang.Object obj16 = executionEntity1.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity17 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.executeActivity(pvmActivity17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=ProcessInstance[null]}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=ProcessInstance[null]}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=ProcessInstance[null]}");
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList10 = executionEntity1.getIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior2);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setDeleteReason("hi!");
        executionEntity7.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray12 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList13 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList13, variableInstanceEntityArray12);
        executionEntity7.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList13);
        executionEntity7.setRevision((int) (short) 0);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl19);
        executionEntity20.setRevision(100);
        int int23 = executionEntity20.getRevisionNext();
        executionEntity20.setCachedEntityState((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity7, "", (java.lang.Object) executionEntity20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity4.getProcessVariables();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity4);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        java.lang.Object obj7 = executionEntity1.getPersistentState();
        java.lang.String str8 = executionEntity1.getId();
        executionEntity1.setBusinessKey("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet11 = executionEntity1.getVariableNames();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str11 = executionEntity1.getProcessInstanceId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet12 = executionEntity1.getVariableNames();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity6 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addJob(jobEntity6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(variableInstanceEntityList5);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = executionEntity1.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str11 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement12 = executionEntity1.getEventSource();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap13 = executionEntity1.getVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(pvmProcessElement12);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        executionEntity1.forceUpdate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = executionEntity1.getVariableLocal("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        java.lang.String str6 = executionEntity1.getEventName();
        executionEntity1.disposeStartingExecution();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList8 = executionEntity1.findActiveActivityIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getProcessInstance();
        java.lang.String str12 = executionEntity1.getTenantId();
        boolean boolean13 = executionEntity1.isProcessInstanceType();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity1.getVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getProcessInstance();
        java.lang.String str12 = executionEntity1.getTenantId();
        boolean boolean13 = executionEntity1.isProcessInstanceType();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariableLocal("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity9 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeTask(taskEntity9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray4 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5, variableInstanceEntityArray4);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5);
        boolean boolean8 = executionEntity1.isEventScope();
        boolean boolean9 = executionEntity1.isDeleteRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = executionEntity1.getVariable("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl3);
        executionEntity4.setRevision(100);
        executionEntity4.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity9 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList10 = executionEntity4.findInactiveConcurrentExecutions(pvmActivity9);
        int int11 = executionEntity4.getSuspensionState();
        executionEntity4.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity4.getProcessInstance();
        java.lang.String str15 = executionEntity4.getTenantId();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        org.junit.Assert.assertNotNull(activityExecutionList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(executionEntity14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getProcessInstanceId();
        executionEntity1.setCachedEntityState((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList5 = executionEntity1.findActiveActivityIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        boolean boolean10 = executionEntity1.isActive();
        executionEntity1.setDeleteReason("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = executionEntity1.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getProcessInstance();
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity12 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeEventSubscription(eventSubscriptionEntity12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity11);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity6.forceUpdate();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity6.destroyScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = executionEntity1.isActive("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        java.lang.String str9 = executionEntity1.getDeleteReason();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList10 = executionEntity1.getExecutions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = null;
        executionEntity1.setTransition(transitionImpl7);
        boolean boolean9 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity11.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setDeleteReason("hi!");
        executionEntity14.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray19 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList20 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList20, variableInstanceEntityArray19);
        executionEntity14.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList20);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity24.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext26 = null;
        executionEntity24.setCachedElContext(eLContext26);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl28 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl28);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = executionEntity29.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext31 = null;
        executionEntity29.setCachedElContext(eLContext31);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        executionEntity34.setRevision(100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl37 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity38 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl37);
        executionEntity38.setRevision(100);
        executionEntity38.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl43 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity44 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl43);
        executionEntity44.setDeleteReason("hi!");
        java.lang.String str47 = executionEntity44.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement48 = null;
        executionEntity44.setEventSource(pvmProcessElement48);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl50 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity51 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl50);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity52 = executionEntity51.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity53 = executionEntity51.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray54 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity14, executionEntity24, executionEntity29, executionEntity34, executionEntity38, executionEntity44, executionEntity53 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList55 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList55, executionEntityArray54);
        executionEntity11.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList55);
        executionEntity1.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList55);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroyScope("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(executionEntity12);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(executionEntity25);
        org.junit.Assert.assertNull(executionEntity30);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(executionEntity52);
        org.junit.Assert.assertNull(executionEntity53);
        org.junit.Assert.assertNotNull(executionEntityArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        java.lang.String str10 = executionEntity1.getParentId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariableLocal("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        java.lang.String str3 = executionEntity1.getDeleteReason();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.initialize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity11.getSuperExecution();
        executionEntity11.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = null;
        executionEntity11.setTransitionBeingTaken(transitionImpl14);
        java.lang.String str16 = executionEntity11.getProcessInstanceId();
        int int17 = executionEntity11.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setRevision(100);
        executionEntity19.setBusinessKey("");
        executionEntity19.setActive(false);
        executionEntity11.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl28 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl28);
        executionEntity29.setActive(false);
        java.lang.String str32 = executionEntity29.getId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        executionEntity34.setRevision(100);
        executionEntity34.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl39 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl39);
        executionEntity40.setDeleteReason("hi!");
        java.lang.String str43 = executionEntity40.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement44 = null;
        executionEntity40.setEventSource(pvmProcessElement44);
        java.lang.Object obj46 = executionEntity40.getPersistentState();
        java.lang.String str47 = executionEntity40.getId();
        java.util.Map<java.lang.String, java.lang.Object> strMap48 = executionEntity40.getProcessVariables();
        executionEntity34.setVariablesLocal(strMap48);
        executionEntity29.setVariablesLocal(strMap48);
        executionEntity1.setVariablesLocal(strMap48);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity52 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeTask(taskEntity52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(executionEntity12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(strMap48);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.setProcessDefinitionId("");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroyScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl10);
        java.lang.String str12 = executionEntity1.getParentId();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "ProcessInstance[null]", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables((java.util.Collection<java.lang.String>) strList17);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        int int10 = executionEntity1.getRevisionNext();
        boolean boolean11 = executionEntity1.isEnded();
        java.lang.String str12 = executionEntity1.getId();
        java.lang.String str13 = executionEntity1.getParentId();
        org.activiti.engine.EngineServices engineServices14 = executionEntity1.getEngineServices();
        executionEntity1.setRevision((int) '4');
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity19.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = null;
        executionEntity19.setCachedElContext(eLContext21);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        executionEntity24.setRevision(100);
        executionEntity24.setBusinessKey("");
        executionEntity24.setActive(false);
        executionEntity24.inactivate();
        executionEntity24.setProcessDefinitionId("hi!");
        java.lang.String str34 = executionEntity24.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = executionEntity1.setVariableLocal("ProcessInstance[null]", (java.lang.Object) eLContext21, executionEntity24);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(engineServices14);
        org.junit.Assert.assertNull(executionEntity20);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ProcessInstance[null]" + "'", str34, "ProcessInstance[null]");
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity7.getTransition();
        java.lang.String str10 = executionEntity7.getDeleteReason();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity11 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity7.addTask(taskEntity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(transitionImpl9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        executionEntity1.forceUpdate();
        executionEntity1.setEventScope(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity11 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeJob(jobEntity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = executionEntity6.getTransition();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet12 = executionEntity6.getVariableNames();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(transitionImpl11);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity1.getProcessVariables();
        int int8 = executionEntity1.getSuspensionState();
        java.lang.String str9 = executionEntity1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = executionEntity1.hasVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ProcessInstance[null]" + "'", str9, "ProcessInstance[null]");
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        java.lang.Object obj10 = null;
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        executionEntity12.setDeleteReason("hi!");
        java.lang.String str15 = executionEntity12.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement16 = null;
        executionEntity12.setEventSource(pvmProcessElement16);
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = executionEntity12.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = executionEntity1.setVariableLocal("ProcessInstance[null]", obj10, executionEntity12);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmProcessDefinition pvmProcessDefinition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.PvmProcessInstance pvmProcessInstance8 = executionEntity1.createSubProcessInstance(pvmProcessDefinition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray4 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5, variableInstanceEntityArray4);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5);
        boolean boolean8 = executionEntity1.isEventScope();
        boolean boolean9 = executionEntity1.isDeleteRoot();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = executionEntity1.isActive("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity1.getStartingExecution();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables((java.util.Collection<java.lang.String>) strList11);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(startingExecution8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        java.lang.String str3 = executionEntity1.getDeleteReason();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.end();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray4 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5, variableInstanceEntityArray4);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5);
        boolean boolean8 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setDeleteReason("hi!");
        executionEntity11.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray16 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList17 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList17, variableInstanceEntityArray16);
        executionEntity11.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList17);
        executionEntity11.setRevision((int) (short) 0);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl22 = executionEntity11.getActivity();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.createVariableLocal("ProcessInstance[null]", (java.lang.Object) executionEntity11);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(activityImpl22);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray4 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5, variableInstanceEntityArray4);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5);
        boolean boolean8 = executionEntity1.isEventScope();
        boolean boolean9 = executionEntity1.isDeleteRoot();
        org.activiti.engine.impl.pvm.PvmTransition[] pvmTransitionArray10 = new org.activiti.engine.impl.pvm.PvmTransition[] {};
        java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition> pvmTransitionList11 = new java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList11, pvmTransitionArray10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity14.getSuperExecution();
        executionEntity14.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = null;
        executionEntity14.setTransitionBeingTaken(transitionImpl17);
        java.lang.String str19 = executionEntity14.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl20 = null;
        executionEntity14.setTransitionBeingTaken(transitionImpl20);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl22 = null;
        executionEntity14.setTransitionBeingTaken(transitionImpl22);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity24 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList25 = executionEntity14.findInactiveConcurrentExecutions(pvmActivity24);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.takeAll((java.util.List<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList11, activityExecutionList25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(pvmTransitionArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(executionEntity15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(activityExecutionList25);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity7 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addJob(jobEntity7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        java.lang.String str4 = executionEntity1.getId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity1.getCompensateEventSubscriptions("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getProcessInstanceId();
        executionEntity1.setCachedEntityState((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity7 = executionEntity1.involveUser("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity11.getSuperExecution();
        executionEntity11.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = null;
        executionEntity11.setTransitionBeingTaken(transitionImpl14);
        java.lang.String str16 = executionEntity11.getProcessInstanceId();
        int int17 = executionEntity11.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setRevision(100);
        executionEntity19.setBusinessKey("");
        executionEntity19.setActive(false);
        executionEntity11.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl28 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl28);
        executionEntity29.setActive(false);
        java.lang.String str32 = executionEntity29.getId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        executionEntity34.setRevision(100);
        executionEntity34.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl39 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl39);
        executionEntity40.setDeleteReason("hi!");
        java.lang.String str43 = executionEntity40.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement44 = null;
        executionEntity40.setEventSource(pvmProcessElement44);
        java.lang.Object obj46 = executionEntity40.getPersistentState();
        java.lang.String str47 = executionEntity40.getId();
        java.util.Map<java.lang.String, java.lang.Object> strMap48 = executionEntity40.getProcessVariables();
        executionEntity34.setVariablesLocal(strMap48);
        executionEntity29.setVariablesLocal(strMap48);
        executionEntity1.setVariablesLocal(strMap48);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet52 = executionEntity1.getVariableNamesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(executionEntity12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(strMap48);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        int int4 = executionEntity1.getRevisionNext();
        executionEntity1.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity7 = null;
        executionEntity1.removeTask(taskEntity7);
        java.lang.String str9 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = executionEntity1.getProcessDefinition();
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.createVariableLocal("hi!", obj12);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(processDefinitionImpl10);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        executionEntity1.setActive(false);
        executionEntity1.inactivate();
        executionEntity1.setProcessDefinitionId("hi!");
        java.lang.String str11 = executionEntity1.toString();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity12 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addJob(jobEntity12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ProcessInstance[null]" + "'", str11, "ProcessInstance[null]");
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList8 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = null;
        executionEntity1.setTransition(transitionImpl9);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity13.getSuperExecution();
        executionEntity13.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl16 = null;
        executionEntity13.setTransitionBeingTaken(transitionImpl16);
        java.lang.String str18 = executionEntity13.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = null;
        executionEntity13.setTransition(transitionImpl19);
        boolean boolean21 = executionEntity13.isConcurrent();
        int int22 = executionEntity13.getSuspensionState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity24.getSuperExecution();
        executionEntity24.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl27 = null;
        executionEntity24.setTransitionBeingTaken(transitionImpl27);
        java.lang.String str29 = executionEntity24.getProcessInstanceId();
        executionEntity24.setParentId("hi!");
        executionEntity24.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = executionEntity34.getSuperExecution();
        executionEntity34.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl37 = null;
        executionEntity34.setTransitionBeingTaken(transitionImpl37);
        java.lang.String str39 = executionEntity34.getProcessInstanceId();
        int int40 = executionEntity34.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl41 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl41);
        executionEntity42.setRevision(100);
        executionEntity42.setBusinessKey("");
        executionEntity42.setActive(false);
        executionEntity34.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity42);
        executionEntity24.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity34);
        executionEntity34.setActive(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = executionEntity1.setVariableLocal("ProcessInstance[null]", (java.lang.Object) executionEntity13, executionEntity34);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(variableInstanceEntityList8);
        org.junit.Assert.assertNull(executionEntity14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(executionEntity25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(executionEntity35);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        java.lang.String str4 = executionEntity1.getId();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroyScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = null;
        executionEntity1.setCachedElContext(eLContext3);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setDeleteReason("hi!");
        java.lang.String str12 = executionEntity9.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = null;
        executionEntity9.setEventSource(pvmProcessElement13);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity9.getProcessVariables();
        executionEntity1.createVariablesLocal(strMap15);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariable("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        java.lang.String str3 = executionEntity1.getDeleteReason();
        java.lang.String str4 = executionEntity1.toString();
        java.lang.String str5 = executionEntity1.getSuperExecutionId();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = executionEntity1.hasVariableLocal("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ProcessInstance[null]" + "'", str4, "ProcessInstance[null]");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        boolean boolean5 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = null;
        executionEntity7.setCachedElContext(eLContext9);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        executionEntity7.setTenantId("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setDeleteReason("hi!");
        executionEntity17.setSuspensionState((int) (byte) 10);
        java.lang.String str22 = executionEntity17.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity23);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = executionEntity17.getProcessVariables();
        boolean boolean26 = executionEntity17.isActive();
        executionEntity17.setDeleteReason("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = executionEntity7.setVariableLocal("", (java.lang.Object) '#', executionEntity17);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setDeleteReason("hi!");
        java.lang.String str10 = executionEntity7.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = null;
        executionEntity7.setEventSource(pvmProcessElement11);
        java.lang.Object obj13 = executionEntity7.getPersistentState();
        java.lang.String str14 = executionEntity7.getId();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity7.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap15);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl17);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity1.getReplacedBy();
        java.lang.Class<?> wildcardClass20 = executionEntity1.getClass();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(executionEntity19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        java.lang.Object obj10 = executionEntity1.getPersistentState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        executionEntity12.setActive(false);
        executionEntity12.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setDeleteReason("hi!");
        java.lang.String str20 = executionEntity17.getEventName();
        executionEntity12.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList22 = executionEntity17.getQueryVariables();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(variableInstanceEntityList22);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        int int10 = executionEntity1.getRevisionNext();
        boolean boolean11 = executionEntity1.isEnded();
        java.lang.String str12 = executionEntity1.getId();
        java.lang.String str13 = executionEntity1.getParentId();
        org.activiti.engine.EngineServices engineServices14 = executionEntity1.getEngineServices();
        executionEntity1.setRevision((int) '4');
        org.activiti.engine.impl.pvm.PvmProcessDefinition pvmProcessDefinition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.PvmProcessInstance pvmProcessInstance18 = executionEntity1.createSubProcessInstance(pvmProcessDefinition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(engineServices14);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity2.setCachedEntityState((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl7);
        executionEntity1.setEventScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setRevision(100);
        executionEntity13.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl18 = null;
        executionEntity13.setTransitionBeingTaken(transitionImpl18);
        java.lang.String str20 = executionEntity13.getBusinessKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = executionEntity1.setVariableLocal("hi!", (java.lang.Object) executionEntity13);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        java.lang.String str4 = executionEntity1.getId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setRevision(100);
        executionEntity6.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        executionEntity12.setDeleteReason("hi!");
        java.lang.String str15 = executionEntity12.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement16 = null;
        executionEntity12.setEventSource(pvmProcessElement16);
        java.lang.Object obj18 = executionEntity12.getPersistentState();
        java.lang.String str19 = executionEntity12.getId();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = executionEntity12.getProcessVariables();
        executionEntity6.setVariablesLocal(strMap20);
        executionEntity1.setVariablesLocal(strMap20);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity26 = executionEntity1.involveUser("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(executionEntity23);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        executionEntity1.forceUpdate();
        executionEntity1.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = executionEntity10.isEnded();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(executionEntity10);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        executionEntity1.forceUpdate();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 7);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.remove();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getProcessInstanceId();
        java.lang.String str3 = executionEntity1.getCurrentActivityName();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity1.createExecution();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        java.lang.String str4 = executionEntity1.getId();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity7 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addEventSubscription(eventSubscriptionEntity7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        boolean boolean5 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.executeActivity(pvmActivity6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        java.lang.String str4 = executionEntity1.getId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = null;
        executionEntity1.setTransition(transitionImpl5);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity8.getSuperExecution();
        executionEntity8.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = null;
        executionEntity8.setTransitionBeingTaken(transitionImpl11);
        java.lang.String str13 = executionEntity8.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = null;
        executionEntity8.setTransition(transitionImpl14);
        boolean boolean16 = executionEntity8.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity18.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl20);
        executionEntity21.setDeleteReason("hi!");
        executionEntity21.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray26 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList27 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList27, variableInstanceEntityArray26);
        executionEntity21.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList27);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl30 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl30);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = executionEntity31.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext33 = null;
        executionEntity31.setCachedElContext(eLContext33);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl35 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl35);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity37 = executionEntity36.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext38 = null;
        executionEntity36.setCachedElContext(eLContext38);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl40);
        executionEntity41.setRevision(100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl44 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity45 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl44);
        executionEntity45.setRevision(100);
        executionEntity45.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl50 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity51 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl50);
        executionEntity51.setDeleteReason("hi!");
        java.lang.String str54 = executionEntity51.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement55 = null;
        executionEntity51.setEventSource(pvmProcessElement55);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl57 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity58 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl57);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity59 = executionEntity58.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity60 = executionEntity58.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray61 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity21, executionEntity31, executionEntity36, executionEntity41, executionEntity45, executionEntity51, executionEntity60 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList62 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList62, executionEntityArray61);
        executionEntity18.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList62);
        executionEntity8.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList62);
        executionEntity1.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList62);
        executionEntity1.setActive(false);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(executionEntity9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(executionEntity19);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(executionEntity32);
        org.junit.Assert.assertNull(executionEntity37);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(executionEntity59);
        org.junit.Assert.assertNull(executionEntity60);
        org.junit.Assert.assertNotNull(executionEntityArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getProcessInstanceId();
        executionEntity1.setTenantId("");
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.findExecution("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setDeleteReason("hi!");
        java.lang.String str10 = executionEntity7.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = null;
        executionEntity7.setEventSource(pvmProcessElement11);
        java.lang.Object obj13 = executionEntity7.getPersistentState();
        java.lang.String str14 = executionEntity7.getId();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity7.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap15);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl17);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.EngineServices engineServices20 = executionEntity19.getEngineServices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(executionEntity19);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList11 = executionEntity6.getQueryVariables();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity6.getSubProcessInstance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(variableInstanceEntityList11);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = executionEntity6.getTransition();
        executionEntity6.setId("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity14 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity6.removeEventSubscription(eventSubscriptionEntity14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(transitionImpl11);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        java.lang.String str8 = executionEntity1.getCurrentActivityName();
        java.lang.String str9 = executionEntity1.getActivityId();
        boolean boolean10 = executionEntity1.isProcessInstanceType();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity1.getEventSubscriptionsInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity11 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity10.removeJob(jobEntity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setDeleteReason("hi!");
        java.lang.String str10 = executionEntity7.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = null;
        executionEntity7.setEventSource(pvmProcessElement11);
        java.lang.Object obj13 = executionEntity7.getPersistentState();
        java.lang.String str14 = executionEntity7.getId();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity7.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap15);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl17);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity1.getReplacedBy();
        int int20 = executionEntity1.getRevisionNext();
        executionEntity1.setConcurrent(true);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(executionEntity19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str11 = executionEntity6.getSuperExecutionId();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity12 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity6.removeJob(jobEntity12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setDeleteReason("hi!");
        java.lang.String str12 = executionEntity9.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = null;
        executionEntity9.setEventSource(pvmProcessElement13);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution15 = executionEntity9.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity9.getParent();
        executionEntity1.setSuperExecution(executionEntity9);
        boolean boolean18 = executionEntity1.isProcessInstanceType();
        int int19 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity20 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addJob(jobEntity20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(startingExecution7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(startingExecution15);
        org.junit.Assert.assertNull(executionEntity16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getProcessInstance();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement12 = null;
        executionEntity1.setEventSource(pvmProcessElement12);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        executionEntity1.setActivity(activityImpl14);
        boolean boolean16 = executionEntity1.isSuspended();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.remove();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        int int4 = executionEntity1.getRevisionNext();
        executionEntity1.setCachedEntityState((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = executionEntity1.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        executionEntity1.setScope(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity1.getQueryVariables();
        boolean boolean8 = executionEntity1.isScope();
        java.lang.String str9 = executionEntity1.toString();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity11.getSuperExecution();
        executionEntity11.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = null;
        executionEntity11.setTransitionBeingTaken(transitionImpl14);
        java.lang.String str16 = executionEntity11.getProcessInstanceId();
        int int17 = executionEntity11.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setRevision(100);
        executionEntity19.setBusinessKey("");
        executionEntity19.setActive(false);
        executionEntity11.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        executionEntity28.setRevision(100);
        executionEntity28.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity33 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList34 = executionEntity28.findInactiveConcurrentExecutions(pvmActivity33);
        int int35 = executionEntity28.getSuspensionState();
        executionEntity11.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity28);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet38 = executionEntity1.getVariableNames();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertNull(variableInstanceEntityList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ProcessInstance[null]" + "'", str9, "ProcessInstance[null]");
        org.junit.Assert.assertNull(executionEntity12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(activityExecutionList34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        executionEntity1.setProcessDefinitionId("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList8 = executionEntity1.findActiveActivityIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        boolean boolean10 = executionEntity1.isActive();
        executionEntity1.setDeleteReason("hi!");
        boolean boolean13 = executionEntity1.isProcessInstanceType();
        java.lang.String str14 = executionEntity1.getEventName();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        executionEntity1.forceUpdate();
        int int10 = executionEntity1.getCachedEntityState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = executionEntity1.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior2);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setDeleteReason("hi!");
        executionEntity8.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray13 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList14 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList14, variableInstanceEntityArray13);
        executionEntity8.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList14);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity8.getParent();
        boolean boolean18 = executionEntity8.isSuspended();
        executionEntity8.forceUpdate();
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 2);
        java.lang.Object obj22 = executionEntity8.getPersistentState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl24 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl24);
        executionEntity25.setRevision(100);
        executionEntity25.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity30 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList31 = executionEntity25.findInactiveConcurrentExecutions(pvmActivity30);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity8, "hi!", (java.lang.Object) pvmActivity30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(taskDefinition6);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(executionEntity17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, forcedUpdate=true, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, forcedUpdate=true, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, forcedUpdate=true, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList31);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        int int10 = executionEntity1.getRevisionNext();
        boolean boolean11 = executionEntity1.isEnded();
        java.lang.String str12 = executionEntity1.getId();
        boolean boolean13 = executionEntity1.isProcessInstanceType();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        executionEntity15.setRevision(100);
        executionEntity15.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity20 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList21 = executionEntity15.findInactiveConcurrentExecutions(pvmActivity20);
        int int22 = executionEntity15.getSuspensionState();
        executionEntity15.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity15.getProcessInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = executionEntity15.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap26);
        executionEntity1.setEventScope(true);
        org.activiti.engine.impl.pvm.PvmTransition[] pvmTransitionArray30 = new org.activiti.engine.impl.pvm.PvmTransition[] {};
        java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition> pvmTransitionList31 = new java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList31, pvmTransitionArray30);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        executionEntity34.setDeleteReason("hi!");
        java.lang.String str37 = executionEntity34.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement38 = null;
        executionEntity34.setEventSource(pvmProcessElement38);
        java.lang.Object obj40 = executionEntity34.getPersistentState();
        java.lang.String str41 = executionEntity34.getId();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity42 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList43 = executionEntity34.findInactiveConcurrentExecutions(pvmActivity42);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.takeAll((java.util.List<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList31, activityExecutionList43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(activityExecutionList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(executionEntity25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(pvmTransitionArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(activityExecutionList43);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setRevision(100);
        executionEntity9.setBusinessKey("");
        executionEntity9.setActive(false);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = executionEntity1.getTransition();
        executionEntity1.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int21 = executionEntity20.getExecutionListenerIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(transitionImpl17);
        org.junit.Assert.assertNull(executionEntity20);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = executionEntity1.getActivity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setDeleteReason("hi!");
        executionEntity11.setSuspensionState((int) (byte) 10);
        java.lang.String str16 = executionEntity11.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = executionEntity17.getTransition();
        java.lang.String str20 = executionEntity17.getDeleteReason();
        boolean boolean21 = executionEntity17.isEnded();
        executionEntity17.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        executionEntity24.setRevision(100);
        executionEntity24.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity29 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList30 = executionEntity24.findInactiveConcurrentExecutions(pvmActivity29);
        int int31 = executionEntity24.getSuspensionState();
        executionEntity24.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = executionEntity24.getProcessInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = executionEntity24.getProcessVariables();
        executionEntity17.createVariablesLocal(strMap35);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.signal("ProcessInstance[null]", (java.lang.Object) executionEntity17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertNull(activityImpl8);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(transitionImpl19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(activityExecutionList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(executionEntity34);
        org.junit.Assert.assertNotNull(strMap35);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        boolean boolean5 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = null;
        executionEntity7.setCachedElContext(eLContext9);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        executionEntity7.setTenantId("");
        executionEntity7.forceUpdate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList15 = executionEntity7.getEventSubscriptionsInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        java.lang.String str12 = executionEntity1.getCurrentActivityId();
        java.lang.String str13 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution14 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution15 = executionEntity1.getStartingExecution();
        java.lang.Class<?> wildcardClass16 = startingExecution15.getClass();
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(startingExecution14);
        org.junit.Assert.assertNotNull(startingExecution15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        boolean boolean11 = executionEntity1.isActive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet12 = executionEntity1.getVariableNames();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        int int10 = executionEntity1.getRevisionNext();
        boolean boolean11 = executionEntity1.isEnded();
        java.lang.String str12 = executionEntity1.getId();
        java.lang.String str13 = executionEntity1.getParentId();
        org.activiti.engine.EngineServices engineServices14 = executionEntity1.getEngineServices();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = executionEntity1.updateProcessBusinessKey("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(engineServices14);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity1.getStartingExecution();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity1.involveUser("hi!", "ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(startingExecution7);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = null;
        executionEntity1.setCachedElContext(eLContext3);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str7 = executionEntity1.getId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = executionEntity1.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        executionEntity1.setScope(true);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = executionEntity1.getTransition();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity12 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addTask(taskEntity12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(transitionImpl11);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str11 = executionEntity1.getProcessInstanceId();
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.signal("ProcessInstance[null]", obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = executionEntity1.getVariable("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity6);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroyScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity11);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.insert();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        executionEntity1.setScope(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity1.getQueryVariables();
        boolean boolean8 = executionEntity1.isScope();
        java.lang.String str9 = executionEntity1.toString();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity11.getSuperExecution();
        executionEntity11.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = null;
        executionEntity11.setTransitionBeingTaken(transitionImpl14);
        java.lang.String str16 = executionEntity11.getProcessInstanceId();
        int int17 = executionEntity11.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setRevision(100);
        executionEntity19.setBusinessKey("");
        executionEntity19.setActive(false);
        executionEntity11.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        executionEntity28.setRevision(100);
        executionEntity28.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity33 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList34 = executionEntity28.findInactiveConcurrentExecutions(pvmActivity33);
        int int35 = executionEntity28.getSuspensionState();
        executionEntity11.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity28);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertNull(variableInstanceEntityList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ProcessInstance[null]" + "'", str9, "ProcessInstance[null]");
        org.junit.Assert.assertNull(executionEntity12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(activityExecutionList34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        executionEntity1.setActivity(activityImpl6);
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.performOperation(atomicOperation8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        int int10 = executionEntity1.getRevisionNext();
        boolean boolean11 = executionEntity1.isEnded();
        java.lang.String str12 = executionEntity1.getId();
        java.lang.String str13 = executionEntity1.getParentId();
        executionEntity1.setParentId("ProcessInstance[null]");
        java.lang.Object obj16 = executionEntity1.getPersistentState();
        executionEntity1.setEventName("ProcessInstance[null]");
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity21 = executionEntity1.addIdentityLink("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=ProcessInstance[null]}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=ProcessInstance[null]}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=ProcessInstance[null]}");
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList3 = executionEntity1.getIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        boolean boolean10 = executionEntity1.isActive();
        executionEntity1.setDeleteReason("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity1.findExecution("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = executionEntity11.isEventScope();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity11);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        java.lang.Object obj7 = executionEntity1.getPersistentState();
        java.lang.String str8 = executionEntity1.getId();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.PvmProcessDefinition pvmProcessDefinition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.PvmProcessInstance pvmProcessInstance11 = executionEntity1.createSubProcessInstance(pvmProcessDefinition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity11 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList12 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity11);
        executionEntity1.inactivate();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertNotNull(activityExecutionList12);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str11 = executionEntity1.getProcessInstanceId();
        boolean boolean12 = executionEntity1.isScope();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl10);
        java.lang.String str12 = executionEntity1.getParentId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet13 = executionEntity1.getVariableNamesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior2);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity10.getSuperExecution();
        executionEntity10.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = null;
        executionEntity10.setTransitionBeingTaken(transitionImpl13);
        java.lang.String str15 = executionEntity10.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl16 = null;
        executionEntity10.setTransitionBeingTaken(transitionImpl16);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl18 = null;
        executionEntity10.setTransitionBeingTaken(transitionImpl18);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(taskDefinition6);
        org.junit.Assert.assertNull(taskDefinition7);
        org.junit.Assert.assertNull(taskDefinition8);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        java.lang.String str8 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity9 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeJob(jobEntity9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        int int4 = executionEntity1.getRevisionNext();
        executionEntity1.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity7 = null;
        executionEntity1.removeTask(taskEntity7);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity9 = null;
        executionEntity1.removeJob(jobEntity9);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.insert();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement9 = null;
        executionEntity1.setEventSource(pvmProcessElement9);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity11 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addJob(jobEntity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        boolean boolean5 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = null;
        executionEntity7.setCachedElContext(eLContext9);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        org.activiti.engine.impl.pvm.PvmTransition[] pvmTransitionArray12 = new org.activiti.engine.impl.pvm.PvmTransition[] {};
        java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition> pvmTransitionList13 = new java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList13, pvmTransitionArray12);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        executionEntity16.setDeleteReason("hi!");
        java.lang.String str19 = executionEntity16.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement20 = null;
        executionEntity16.setEventSource(pvmProcessElement20);
        java.lang.Object obj22 = executionEntity16.getPersistentState();
        java.lang.String str23 = executionEntity16.getId();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity24 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList25 = executionEntity16.findInactiveConcurrentExecutions(pvmActivity24);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity7.takeAll((java.util.List<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList13, activityExecutionList25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertNotNull(pvmTransitionArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(activityExecutionList25);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        int int4 = executionEntity1.getRevisionNext();
        executionEntity1.setCachedEntityState((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = executionEntity1.hasVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        java.lang.String str3 = executionEntity1.getDeleteReason();
        java.lang.String str4 = executionEntity1.getDeleteReason();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList5 = executionEntity1.getIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str11 = executionEntity1.getProcessInstanceId();
        boolean boolean12 = executionEntity1.isScope();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = executionEntity1.getVariableLocal("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity6 = executionEntity1.addIdentityLink("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        boolean boolean10 = executionEntity1.isActive();
        executionEntity1.setDeleteReason("hi!");
        boolean boolean13 = executionEntity1.isProcessInstanceType();
        java.lang.String str14 = executionEntity1.getEventName();
        int int15 = executionEntity1.getCachedEntityState();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet16 = executionEntity1.getVariableNamesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList9 = executionEntity1.getIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        executionEntity1.setScope(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity1.getQueryVariables();
        boolean boolean8 = executionEntity1.isScope();
        java.lang.String str9 = executionEntity1.toString();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity11.getSuperExecution();
        executionEntity11.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = null;
        executionEntity11.setTransitionBeingTaken(transitionImpl14);
        java.lang.String str16 = executionEntity11.getProcessInstanceId();
        int int17 = executionEntity11.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setRevision(100);
        executionEntity19.setBusinessKey("");
        executionEntity19.setActive(false);
        executionEntity11.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        executionEntity28.setRevision(100);
        executionEntity28.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity33 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList34 = executionEntity28.findInactiveConcurrentExecutions(pvmActivity33);
        int int35 = executionEntity28.getSuspensionState();
        executionEntity11.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity28);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity11.removeVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertNull(variableInstanceEntityList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ProcessInstance[null]" + "'", str9, "ProcessInstance[null]");
        org.junit.Assert.assertNull(executionEntity12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(activityExecutionList34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        java.lang.String str4 = executionEntity1.getId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = null;
        executionEntity1.setTransition(transitionImpl5);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity8.getSuperExecution();
        executionEntity8.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = null;
        executionEntity8.setTransitionBeingTaken(transitionImpl11);
        java.lang.String str13 = executionEntity8.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = null;
        executionEntity8.setTransition(transitionImpl14);
        boolean boolean16 = executionEntity8.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity18.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl20);
        executionEntity21.setDeleteReason("hi!");
        executionEntity21.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray26 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList27 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList27, variableInstanceEntityArray26);
        executionEntity21.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList27);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl30 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl30);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = executionEntity31.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext33 = null;
        executionEntity31.setCachedElContext(eLContext33);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl35 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl35);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity37 = executionEntity36.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext38 = null;
        executionEntity36.setCachedElContext(eLContext38);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl40);
        executionEntity41.setRevision(100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl44 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity45 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl44);
        executionEntity45.setRevision(100);
        executionEntity45.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl50 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity51 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl50);
        executionEntity51.setDeleteReason("hi!");
        java.lang.String str54 = executionEntity51.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement55 = null;
        executionEntity51.setEventSource(pvmProcessElement55);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl57 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity58 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl57);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity59 = executionEntity58.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity60 = executionEntity58.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray61 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity21, executionEntity31, executionEntity36, executionEntity41, executionEntity45, executionEntity51, executionEntity60 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList62 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList62, executionEntityArray61);
        executionEntity18.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList62);
        executionEntity8.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList62);
        executionEntity1.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList62);
        executionEntity1.setActive(false);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariable("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(executionEntity9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(executionEntity19);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(executionEntity32);
        org.junit.Assert.assertNull(executionEntity37);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(executionEntity59);
        org.junit.Assert.assertNull(executionEntity60);
        org.junit.Assert.assertNotNull(executionEntityArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl2 = executionEntity1.getTransitionBeingTaken();
        boolean boolean3 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.PvmTransition pvmTransition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.take(pvmTransition4);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.impl.pvm.PvmException; message: transition is null");
        } catch (org.activiti.engine.impl.pvm.PvmException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        java.lang.String str5 = executionEntity1.getEventName();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity1.getProcessVariables();
        executionEntity1.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity9 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeTask(taskEntity9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        java.lang.String str12 = executionEntity1.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity1.getProcessInstance();
        java.lang.String str14 = executionEntity1.getParentId();
        int int15 = executionEntity1.getRevision();
        java.lang.Class<?> wildcardClass16 = executionEntity1.getClass();
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(executionEntity13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity11.getSuperExecution();
        executionEntity11.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = null;
        executionEntity11.setTransitionBeingTaken(transitionImpl14);
        java.lang.String str16 = executionEntity11.getProcessInstanceId();
        int int17 = executionEntity11.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setRevision(100);
        executionEntity19.setBusinessKey("");
        executionEntity19.setActive(false);
        executionEntity11.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity11.destroyScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(executionEntity12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = null;
        executionEntity1.setCachedElContext(eLContext3);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str7 = executionEntity1.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity8.setParentId("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        java.lang.String str3 = executionEntity1.getDeleteReason();
        java.lang.String str4 = executionEntity1.toString();
        java.lang.String str5 = executionEntity1.getSuperExecutionId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity1.getVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ProcessInstance[null]" + "'", str4, "ProcessInstance[null]");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        executionEntity1.forceUpdate();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = executionEntity1.hasVariableLocal("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        int int5 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.PvmTransition[] pvmTransitionArray6 = new org.activiti.engine.impl.pvm.PvmTransition[] {};
        java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition> pvmTransitionList7 = new java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList7, pvmTransitionArray6);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        executionEntity10.setRevision(100);
        executionEntity10.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity15 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList16 = executionEntity10.findInactiveConcurrentExecutions(pvmActivity15);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.takeAll((java.util.List<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList7, activityExecutionList16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(pvmTransitionArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(activityExecutionList16);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.PvmTransition pvmTransition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.take(pvmTransition10);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.impl.pvm.PvmException; message: transition is null");
        } catch (org.activiti.engine.impl.pvm.PvmException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        java.lang.String str10 = executionEntity1.getParentId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        executionEntity1.forceUpdate();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 2);
        java.lang.Object obj15 = executionEntity1.getPersistentState();
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity16 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeEventSubscription(eventSubscriptionEntity16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, forcedUpdate=true, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, forcedUpdate=true, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, forcedUpdate=true, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        java.lang.String str4 = executionEntity1.getId();
        executionEntity1.setRevision(2);
        java.lang.String str7 = executionEntity1.getId();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity8 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addTask(taskEntity8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        boolean boolean5 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = null;
        executionEntity7.setCachedElContext(eLContext9);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.insert();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getProcessInstance();
        java.lang.String str6 = executionEntity1.getEventName();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.findExecution("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(executionEntity5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        boolean boolean11 = executionEntity1.isActive();
        java.lang.Object obj12 = executionEntity1.getPersistentState();
        executionEntity1.setDeleteReason("");
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity15 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addJob(jobEntity15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        executionEntity1.forceUpdate();
        int int10 = executionEntity1.getCachedEntityState();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        executionEntity1.setActive(false);
        executionEntity1.inactivate();
        java.lang.String str9 = executionEntity1.getCurrentActivityName();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        executionEntity1.forceUpdate();
        executionEntity1.setEventScope(false);
        java.lang.String str15 = executionEntity1.getParentId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet16 = executionEntity1.getVariableNamesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity11 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList12 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity11);
        executionEntity1.inactivate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = executionEntity1.hasVariableLocal("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertNotNull(activityExecutionList12);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setDeleteReason("hi!");
        java.lang.String str10 = executionEntity7.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = null;
        executionEntity7.setEventSource(pvmProcessElement11);
        java.lang.Object obj13 = executionEntity7.getPersistentState();
        java.lang.String str14 = executionEntity7.getId();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity7.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap15);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity1.getReplacedBy();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity18 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.executeActivity(pvmActivity18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(executionEntity17);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setRevision(100);
        executionEntity9.setBusinessKey("");
        executionEntity9.setActive(false);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setRevision(100);
        executionEntity18.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity23 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList24 = executionEntity18.findInactiveConcurrentExecutions(pvmActivity23);
        int int25 = executionEntity18.getSuspensionState();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteCascade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(activityExecutionList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        boolean boolean10 = executionEntity1.isActive();
        executionEntity1.setDeleteReason("hi!");
        boolean boolean13 = executionEntity1.isProcessInstanceType();
        java.lang.String str14 = executionEntity1.getEventName();
        int int15 = executionEntity1.getCachedEntityState();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.end();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        executionEntity10.setDeleteReason("hi!");
        executionEntity10.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray15 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList16 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList16, variableInstanceEntityArray15);
        executionEntity10.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList16);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity10.getParent();
        boolean boolean20 = executionEntity10.isSuspended();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(startingExecution8);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(executionEntity19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        java.lang.Object obj7 = executionEntity1.getPersistentState();
        java.lang.String str8 = executionEntity1.getId();
        java.lang.String str9 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setRevision(100);
        executionEntity11.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity16 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList17 = executionEntity11.findInactiveConcurrentExecutions(pvmActivity16);
        java.lang.String str18 = executionEntity11.getParentId();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet20 = executionEntity11.getVariableNamesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(activityExecutionList17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity6.forceUpdate();
        executionEntity6.setBusinessKey("ProcessInstance[null]");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList14 = executionEntity6.getEventSubscriptionsInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        java.lang.String str12 = executionEntity1.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity1.getProcessInstance();
        java.lang.String str14 = executionEntity1.getParentId();
        int int15 = executionEntity1.getRevision();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setDeleteReason("hi!");
        java.lang.String str21 = executionEntity18.getCurrentActivityId();
        int int22 = executionEntity18.getRevisionNext();
        java.lang.String str23 = executionEntity18.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = executionEntity18.getParent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl25);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = executionEntity26.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext28 = null;
        executionEntity26.setCachedElContext(eLContext28);
        executionEntity26.setExecutionListenerIndex((java.lang.Integer) 10);
        executionEntity26.inactivate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = executionEntity1.setVariableLocal("", (java.lang.Object) executionEntity24, executionEntity26);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(executionEntity13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(executionEntity24);
        org.junit.Assert.assertNull(executionEntity27);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl3);
        executionEntity4.setDeleteReason("hi!");
        executionEntity4.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray9 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10, variableInstanceEntityArray9);
        executionEntity4.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity14.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = null;
        executionEntity14.setCachedElContext(eLContext16);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity19.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = null;
        executionEntity19.setCachedElContext(eLContext21);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        executionEntity24.setRevision(100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        executionEntity28.setRevision(100);
        executionEntity28.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        executionEntity34.setDeleteReason("hi!");
        java.lang.String str37 = executionEntity34.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement38 = null;
        executionEntity34.setEventSource(pvmProcessElement38);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl40);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = executionEntity41.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = executionEntity41.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray44 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity4, executionEntity14, executionEntity19, executionEntity24, executionEntity28, executionEntity34, executionEntity43 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList45 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList45, executionEntityArray44);
        executionEntity1.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList45);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity48 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addJob(jobEntity48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(executionEntity15);
        org.junit.Assert.assertNull(executionEntity20);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(executionEntity42);
        org.junit.Assert.assertNull(executionEntity43);
        org.junit.Assert.assertNotNull(executionEntityArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray4 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5, variableInstanceEntityArray4);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5);
        boolean boolean8 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity9 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList10 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity9);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity11 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeEventSubscription(eventSubscriptionEntity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(activityExecutionList10);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = executionEntity1.getEventSource();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList14 = executionEntity1.getQueryVariables();
        java.lang.Object obj15 = executionEntity1.getPersistentState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setRevision(100);
        executionEntity18.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity23 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList24 = executionEntity18.findInactiveConcurrentExecutions(pvmActivity23);
        int int25 = executionEntity18.getSuspensionState();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl26 = executionEntity18.getTransitionBeingTaken();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setVariable("hi!", (java.lang.Object) executionEntity18);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(pvmProcessElement13);
        org.junit.Assert.assertNotNull(variableInstanceEntityList14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, forcedUpdate=true, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, forcedUpdate=true, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, forcedUpdate=true, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(transitionImpl26);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        executionEntity1.forceUpdate();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 2);
        java.lang.Object obj15 = executionEntity1.getPersistentState();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList16 = executionEntity1.getExecutions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, forcedUpdate=true, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, forcedUpdate=true, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, forcedUpdate=true, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        boolean boolean6 = executionEntity1.isDeleteRoot();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity8.getSuperExecution();
        executionEntity8.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = null;
        executionEntity8.setTransitionBeingTaken(transitionImpl11);
        java.lang.String str13 = executionEntity8.getProcessInstanceId();
        executionEntity8.setParentId("hi!");
        executionEntity8.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity18.getSuperExecution();
        executionEntity18.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl21 = null;
        executionEntity18.setTransitionBeingTaken(transitionImpl21);
        java.lang.String str23 = executionEntity18.getProcessInstanceId();
        int int24 = executionEntity18.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl25);
        executionEntity26.setRevision(100);
        executionEntity26.setBusinessKey("");
        executionEntity26.setActive(false);
        executionEntity18.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity26);
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        java.lang.String str35 = executionEntity18.getParentId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(executionEntity9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(executionEntity19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        executionEntity1.setActive(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity8.setTransition(transitionImpl9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setRevision(100);
        executionEntity9.setBusinessKey("");
        executionEntity9.setActive(false);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.lang.String str17 = executionEntity1.toString();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setRevision(100);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray22 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList23 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList23, variableInstanceEntityArray22);
        executionEntity19.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList23);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList23);
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation27 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.performOperation(atomicOperation27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ProcessInstance[null]" + "'", str17, "ProcessInstance[null]");
        org.junit.Assert.assertNotNull(variableInstanceEntityArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        int int10 = executionEntity1.getRevisionNext();
        boolean boolean11 = executionEntity1.isEnded();
        java.lang.String str12 = executionEntity1.getId();
        java.lang.String str13 = executionEntity1.getParentId();
        executionEntity1.setParentId("ProcessInstance[null]");
        executionEntity1.inactivate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList17 = executionEntity1.findActiveActivityIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = executionEntity2.getParentId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = executionEntity1.getActivity();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariable("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertNull(activityImpl8);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = executionEntity1.getActivity();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertNull(activityImpl8);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        java.lang.String str4 = executionEntity1.getId();
        executionEntity1.setRevision(2);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity1.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = executionEntity1.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getProcessInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity13 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeJob(jobEntity13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setDeleteReason("hi!");
        java.lang.String str12 = executionEntity9.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = null;
        executionEntity9.setEventSource(pvmProcessElement13);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution15 = executionEntity9.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity9.getParent();
        executionEntity1.setSuperExecution(executionEntity9);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl19);
        executionEntity20.setRevision(100);
        executionEntity20.setBusinessKey("");
        executionEntity20.setActive(false);
        executionEntity20.inactivate();
        executionEntity20.setProcessDefinitionId("hi!");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setVariable("ProcessInstance[null]", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(startingExecution7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(startingExecution15);
        org.junit.Assert.assertNull(executionEntity16);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        executionEntity1.forceUpdate();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 2);
        int int15 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.PvmProcessDefinition pvmProcessDefinition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.PvmProcessInstance pvmProcessInstance17 = executionEntity1.createSubProcessInstance(pvmProcessDefinition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getProcessInstance();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement12 = null;
        executionEntity1.setEventSource(pvmProcessElement12);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        executionEntity1.setActivity(activityImpl14);
        boolean boolean16 = executionEntity1.isSuspended();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement6 = executionEntity1.getEventSource();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList7 = executionEntity1.getExecutions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(pvmProcessElement6);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        executionEntity1.setScope(true);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList4 = executionEntity3.getCompensateEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(executionEntity3);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        java.lang.String str12 = executionEntity1.getCurrentActivityId();
        java.lang.String str13 = executionEntity1.getEventName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList15 = executionEntity1.getCompensateEventSubscriptions("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity5 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeTask(taskEntity5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getReplacedBy();
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity8.setCachedElContext(eLContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        boolean boolean2 = executionEntity1.isEventScope();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity5 = executionEntity1.involveUser("ProcessInstance[null]", "ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity6.forceUpdate();
        executionEntity6.setActive(false);
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation14 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity6.performOperation(atomicOperation14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = null;
        executionEntity1.setCachedElContext(eLContext3);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str7 = executionEntity1.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = executionEntity8.getVariableLocal("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity6.forceUpdate();
        executionEntity6.setBusinessKey("ProcessInstance[null]");
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity16 = executionEntity6.addIdentityLink("", "ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        boolean boolean5 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = null;
        executionEntity7.setCachedElContext(eLContext9);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList12 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity13 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeJob(jobEntity13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertNull(variableInstanceEntityList12);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        java.lang.String str4 = executionEntity1.getId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setRevision(100);
        executionEntity6.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        executionEntity12.setDeleteReason("hi!");
        java.lang.String str15 = executionEntity12.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement16 = null;
        executionEntity12.setEventSource(pvmProcessElement16);
        java.lang.Object obj18 = executionEntity12.getPersistentState();
        java.lang.String str19 = executionEntity12.getId();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = executionEntity12.getProcessVariables();
        executionEntity6.setVariablesLocal(strMap20);
        executionEntity1.setVariablesLocal(strMap20);
        executionEntity1.setTenantId("");
        java.lang.String str25 = executionEntity1.getActivityId();
        executionEntity1.inactivate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = executionEntity1.hasVariableLocal("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList8 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = null;
        executionEntity1.setTransition(transitionImpl9);
        org.activiti.engine.impl.pvm.PvmProcessDefinition pvmProcessDefinition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.PvmProcessInstance pvmProcessInstance12 = executionEntity1.createSubProcessInstance(pvmProcessDefinition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(variableInstanceEntityList8);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        executionEntity1.setRevision((int) (short) 0);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = executionEntity1.getActivity();
        executionEntity1.disposeStartingExecution();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal((java.util.Collection<java.lang.String>) strList17);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(activityImpl12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setRevision(100);
        int int9 = executionEntity6.getRevisionNext();
        executionEntity6.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity12 = null;
        executionEntity6.removeTask(taskEntity12);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity14 = null;
        executionEntity6.addEventSubscription(eventSubscriptionEntity14);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setRevision(100);
        executionEntity18.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity23 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList24 = executionEntity18.findInactiveConcurrentExecutions(pvmActivity23);
        int int25 = executionEntity18.getSuspensionState();
        executionEntity18.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = executionEntity18.getProcessInstance();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement29 = null;
        executionEntity18.setEventSource(pvmProcessElement29);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl31 = null;
        executionEntity18.setActivity(activityImpl31);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement33 = null;
        executionEntity18.setEventSource(pvmProcessElement33);
        int int35 = executionEntity18.getRevisionNext();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity6, "hi!", (java.lang.Object) int35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(taskDefinition2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(activityExecutionList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(executionEntity28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        java.lang.String str12 = executionEntity1.getCurrentActivityId();
        java.lang.String str13 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution14 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution15 = executionEntity1.getStartingExecution();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap16 = executionEntity1.getVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(startingExecution14);
        org.junit.Assert.assertNotNull(startingExecution15);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        int int9 = executionEntity1.getSuspensionState();
        boolean boolean10 = executionEntity1.isActive();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity11 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addTask(taskEntity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        executionEntity1.forceUpdate();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 7);
        boolean boolean15 = executionEntity1.isActive();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl7);
        java.lang.String str9 = executionEntity1.getTenantId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity11 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeEventSubscription(eventSubscriptionEntity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(executionEntity10);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        java.lang.String str4 = executionEntity1.getId();
        executionEntity1.setRevision(2);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl8 = executionEntity1.getProcessDefinition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = executionEntity1.isActive("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(processDefinitionImpl8);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement9 = null;
        executionEntity1.setEventSource(pvmProcessElement9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = executionEntity1.getVariableLocal("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity11 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList12 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity11);
        executionEntity1.inactivate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList14 = executionEntity1.getTasks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertNotNull(activityExecutionList12);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str11 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setDeleteReason("hi!");
        java.lang.String str17 = executionEntity14.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement18 = null;
        executionEntity14.setEventSource(pvmProcessElement18);
        java.lang.Object obj20 = executionEntity14.getPersistentState();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.createVariableLocal("ProcessInstance[null]", (java.lang.Object) executionEntity14);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity11.getSuperExecution();
        executionEntity11.inactivate();
        java.lang.String str14 = executionEntity11.getBusinessKey();
        boolean boolean15 = executionEntity11.isEnded();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.createVariableLocal("ProcessInstance[null]", (java.lang.Object) executionEntity11);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertNull(executionEntity12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior2);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setDeleteReason("hi!");
        executionEntity9.setSuspensionState((int) (byte) 10);
        java.lang.String str14 = executionEntity9.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity9.getProcessVariables();
        int int18 = executionEntity9.getRevisionNext();
        boolean boolean19 = executionEntity9.isEnded();
        java.lang.String str20 = executionEntity9.getId();
        boolean boolean21 = executionEntity9.isProcessInstanceType();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl22 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl22);
        executionEntity23.setRevision(100);
        executionEntity23.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity28 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList29 = executionEntity23.findInactiveConcurrentExecutions(pvmActivity28);
        int int30 = executionEntity23.getSuspensionState();
        executionEntity23.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = executionEntity23.getProcessInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = executionEntity23.getProcessVariables();
        executionEntity9.setVariablesLocal(strMap34);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl37 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity38 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl37);
        executionEntity38.setDeleteReason("hi!");
        java.lang.String str41 = executionEntity38.getEventName();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity9, "ProcessInstance[null]", (java.lang.Object) str41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(taskDefinition6);
        org.junit.Assert.assertNull(taskDefinition7);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(activityExecutionList29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(executionEntity33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        java.lang.String str12 = executionEntity1.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl14 = executionEntity13.getProcessDefinition();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(executionEntity13);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray4 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5, variableInstanceEntityArray4);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity10.getSuperExecution();
        executionEntity10.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = null;
        executionEntity10.setTransitionBeingTaken(transitionImpl13);
        java.lang.String str15 = executionEntity10.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl16 = null;
        executionEntity10.setTransitionBeingTaken(transitionImpl16);
        java.lang.String str18 = executionEntity10.getTenantId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity10.getReplacedBy();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl20);
        executionEntity21.setDeleteReason("hi!");
        executionEntity21.setSuspensionState((int) (byte) 10);
        java.lang.String str26 = executionEntity21.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity21.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity27);
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = executionEntity21.getProcessVariables();
        boolean boolean30 = executionEntity21.isActive();
        executionEntity21.setDeleteReason("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = executionEntity1.setVariableLocal("hi!", (java.lang.Object) executionEntity19, executionEntity21);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(executionEntity19);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity1.getTransition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = executionEntity1.getVariableLocal("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(transitionImpl12);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = executionEntity1.getActivity();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.end();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertNull(activityImpl8);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        java.lang.String str4 = executionEntity1.getId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setRevision(100);
        executionEntity6.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        executionEntity12.setDeleteReason("hi!");
        java.lang.String str15 = executionEntity12.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement16 = null;
        executionEntity12.setEventSource(pvmProcessElement16);
        java.lang.Object obj18 = executionEntity12.getPersistentState();
        java.lang.String str19 = executionEntity12.getId();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = executionEntity12.getProcessVariables();
        executionEntity6.setVariablesLocal(strMap20);
        executionEntity1.setVariablesLocal(strMap20);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteVariablesInstanceForLeavingScope();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(executionEntity23);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        int int10 = executionEntity1.getRevisionNext();
        boolean boolean11 = executionEntity1.isEnded();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList12 = executionEntity1.getTasks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        java.lang.String str6 = executionEntity1.getParentId();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.createExecution();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        java.lang.String str4 = executionEntity1.getId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = executionEntity1.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        java.lang.String str12 = executionEntity1.getCurrentActivityId();
        java.lang.String str13 = executionEntity1.getEventName();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "ProcessInstance[null]" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal((java.util.Collection<java.lang.String>) strList17);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        executionEntity1.setScope(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity1.getQueryVariables();
        boolean boolean8 = executionEntity1.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap10 = executionEntity1.getVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertNull(variableInstanceEntityList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(executionEntity9);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setDeleteReason("hi!");
        java.lang.String str10 = executionEntity7.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = null;
        executionEntity7.setEventSource(pvmProcessElement11);
        java.lang.Object obj13 = executionEntity7.getPersistentState();
        java.lang.String str14 = executionEntity7.getId();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity7.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap15);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl17);
        org.activiti.engine.impl.javax.el.ELContext eLContext19 = null;
        executionEntity1.setCachedElContext(eLContext19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = executionEntity1.getVariable("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity6.removeVariableLocal("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity6);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getProcessInstance();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement12 = null;
        executionEntity1.setEventSource(pvmProcessElement12);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = executionEntity1.getTransitionBeingTaken();
        executionEntity1.disposeStartingExecution();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariableLocal("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertNull(transitionImpl14);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str11 = executionEntity1.getProcessInstanceId();
        boolean boolean12 = executionEntity1.isScope();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap13 = executionEntity1.getVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = null;
        executionEntity1.setCachedElContext(eLContext3);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str7 = executionEntity1.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getParent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity1.getParent();
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity10 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeEventSubscription(eventSubscriptionEntity10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertNull(executionEntity9);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getProcessInstance();
        java.lang.String str3 = executionEntity1.getCurrentActivityId();
        int int4 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setDeleteReason("hi!");
        java.lang.String str10 = executionEntity7.getCurrentActivityId();
        int int11 = executionEntity7.getRevisionNext();
        java.lang.String str12 = executionEntity7.getCurrentActivityId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.signal("hi!", (java.lang.Object) executionEntity7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity11 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList12 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity11);
        boolean boolean13 = executionEntity1.isEnded();
        executionEntity1.setBusinessKey("");
        java.lang.String str16 = executionEntity1.getActivityId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariableLocal("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertNotNull(activityExecutionList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl3);
        executionEntity4.setDeleteReason("hi!");
        executionEntity4.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray9 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10, variableInstanceEntityArray9);
        executionEntity4.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity14.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = null;
        executionEntity14.setCachedElContext(eLContext16);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity19.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = null;
        executionEntity19.setCachedElContext(eLContext21);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        executionEntity24.setRevision(100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        executionEntity28.setRevision(100);
        executionEntity28.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        executionEntity34.setDeleteReason("hi!");
        java.lang.String str37 = executionEntity34.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement38 = null;
        executionEntity34.setEventSource(pvmProcessElement38);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl40);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = executionEntity41.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = executionEntity41.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray44 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity4, executionEntity14, executionEntity19, executionEntity24, executionEntity28, executionEntity34, executionEntity43 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList45 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList45, executionEntityArray44);
        executionEntity1.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList45);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl48 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity49 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl48);
        executionEntity49.setDeleteReason("hi!");
        executionEntity49.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray54 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList55 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList55, variableInstanceEntityArray54);
        executionEntity49.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList55);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity58 = executionEntity49.getParent();
        boolean boolean59 = executionEntity49.isSuspended();
        executionEntity49.forceUpdate();
        executionEntity49.setExecutionListenerIndex((java.lang.Integer) 7);
        boolean boolean63 = executionEntity49.isActive();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(executionEntity15);
        org.junit.Assert.assertNull(executionEntity20);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(executionEntity42);
        org.junit.Assert.assertNull(executionEntity43);
        org.junit.Assert.assertNotNull(executionEntityArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(executionEntity58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity1.getStartingExecution();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity1.createExecution();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(startingExecution8);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        boolean boolean11 = executionEntity1.isActive();
        java.lang.Object obj12 = executionEntity1.getPersistentState();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.end();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = null;
        executionEntity1.setCachedElContext(eLContext3);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setDeleteReason("hi!");
        java.lang.String str12 = executionEntity9.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = null;
        executionEntity9.setEventSource(pvmProcessElement13);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity9.getProcessVariables();
        executionEntity1.createVariablesLocal(strMap15);
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.performOperation(atomicOperation17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.pvm.PvmProcessDefinition pvmProcessDefinition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.PvmProcessInstance pvmProcessInstance8 = executionEntity1.createSubProcessInstance(pvmProcessDefinition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = null;
        executionEntity1.setCachedElContext(eLContext3);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str7 = executionEntity1.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = executionEntity1.updateProcessBusinessKey("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity1.getStartingExecution();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteCascade("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(startingExecution7);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getProcessInstance();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement12 = null;
        executionEntity1.setEventSource(pvmProcessElement12);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = executionEntity1.getTransitionBeingTaken();
        executionEntity1.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity16.setBusinessKey("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertNull(transitionImpl14);
        org.junit.Assert.assertNull(executionEntity16);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        executionEntity1.forceUpdate();
        executionEntity1.setEventScope(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = executionEntity1.hasVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl10);
        java.lang.String str12 = executionEntity1.getParentId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        executionEntity1.forceUpdate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = executionEntity1.hasVariableLocal("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        java.lang.String str7 = executionEntity1.getId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariableLocal("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setRevision(100);
        executionEntity9.setBusinessKey("");
        executionEntity9.setActive(false);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        boolean boolean17 = executionEntity1.isEnded();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteCascade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        executionEntity1.forceUpdate();
        executionEntity1.setEventScope(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = executionEntity1.getVariable("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        executionEntity1.forceUpdate();
        executionEntity1.setEventScope(false);
        java.lang.String str10 = executionEntity1.getTenantId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap11 = executionEntity1.getVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity1.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity1.getVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str11 = executionEntity1.getProcessInstanceId();
        boolean boolean12 = executionEntity1.isScope();
        executionEntity1.setConcurrent(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = executionEntity1.hasVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        int int4 = executionEntity1.getRevisionNext();
        executionEntity1.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity7 = null;
        executionEntity1.removeTask(taskEntity7);
        java.lang.String str9 = executionEntity1.getParentId();
        java.lang.Class<?> wildcardClass10 = executionEntity1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = null;
        executionEntity1.setCachedElContext(eLContext3);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity1.getTransitionBeingTaken();
        int int6 = executionEntity1.getRevisionNext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = executionEntity1.updateProcessBusinessKey("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(transitionImpl5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity11.getSuperExecution();
        executionEntity11.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = null;
        executionEntity11.setTransitionBeingTaken(transitionImpl14);
        java.lang.String str16 = executionEntity11.getProcessInstanceId();
        int int17 = executionEntity11.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setRevision(100);
        executionEntity19.setBusinessKey("");
        executionEntity19.setActive(false);
        executionEntity11.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList28 = executionEntity1.getQueryVariables();
        java.lang.String str29 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl31 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl31);
        executionEntity32.setDeleteReason("hi!");
        java.lang.String str35 = executionEntity32.getEventName();
        java.lang.Object obj36 = executionEntity32.getPersistentState();
        executionEntity32.setProcessDefinitionId("");
        executionEntity32.setEventName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = executionEntity1.setVariableLocal("hi!", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(executionEntity12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNull(variableInstanceEntityList28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        java.lang.String str6 = executionEntity1.toString();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity9.getTransition();
        executionEntity9.setScope(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = executionEntity1.setVariableLocal("", (java.lang.Object) executionEntity9);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ProcessInstance[null]" + "'", str6, "ProcessInstance[null]");
        org.junit.Assert.assertNull(transitionImpl12);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setDeleteReason("hi!");
        java.lang.String str10 = executionEntity7.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = null;
        executionEntity7.setEventSource(pvmProcessElement11);
        java.lang.Object obj13 = executionEntity7.getPersistentState();
        java.lang.String str14 = executionEntity7.getId();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity7.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap15);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl17);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity1.getParent();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity20 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity19.addJob(jobEntity20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(executionEntity19);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = executionEntity1.getEventSource();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList14 = executionEntity1.getQueryVariables();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = executionEntity1.updateProcessBusinessKey("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(pvmProcessElement13);
        org.junit.Assert.assertNotNull(variableInstanceEntityList14);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        java.lang.String str8 = executionEntity1.getCurrentActivityName();
        java.lang.String str9 = executionEntity1.getActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setDeleteReason("hi!");
        executionEntity11.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray16 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList17 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList17, variableInstanceEntityArray16);
        executionEntity11.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList17);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity11.getParent();
        boolean boolean21 = executionEntity11.isSuspended();
        executionEntity11.forceUpdate();
        executionEntity11.setEventScope(false);
        java.lang.String str25 = executionEntity11.getParentId();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList27 = executionEntity1.findActiveActivityIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(executionEntity20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        int int10 = executionEntity1.getRevisionNext();
        boolean boolean11 = executionEntity1.isEnded();
        java.lang.String str12 = executionEntity1.getId();
        java.lang.String str13 = executionEntity1.getParentId();
        org.activiti.engine.EngineServices engineServices14 = executionEntity1.getEngineServices();
        int int15 = executionEntity1.getSuspensionState();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariable("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(engineServices14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity7.getTransition();
        java.lang.String str10 = executionEntity7.getDeleteReason();
        boolean boolean11 = executionEntity7.isEnded();
        executionEntity7.forceUpdate();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity7.removeVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(transitionImpl9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        java.lang.String str12 = executionEntity1.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity1.getProcessInstance();
        java.lang.String str14 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setDeleteReason("hi!");
        executionEntity17.setSuspensionState((int) (byte) 10);
        java.lang.String str22 = executionEntity17.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity23);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl25 = executionEntity23.getTransition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = executionEntity1.setVariableLocal("hi!", (java.lang.Object) executionEntity23);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(executionEntity13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(transitionImpl25);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        java.lang.String str4 = executionEntity1.getId();
        executionEntity1.setRevision(2);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        boolean boolean11 = executionEntity1.isSuspended();
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = executionEntity1.getEventSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = executionEntity1.updateProcessBusinessKey("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(pvmProcessElement13);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getProcessInstanceId();
        executionEntity1.setTenantId("");
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteCascade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        java.lang.String str6 = executionEntity1.getEventName();
        executionEntity1.setCachedEntityState((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity1.addIdentityLink("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str11 = executionEntity1.getProcessInstanceId();
        boolean boolean12 = executionEntity1.isScope();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity1.getEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl6);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteVariablesInstanceForLeavingScope();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        boolean boolean5 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = null;
        executionEntity7.setCachedElContext(eLContext9);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity12 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity7.addEventSubscription(eventSubscriptionEntity12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(executionEntity8);
    }
}

