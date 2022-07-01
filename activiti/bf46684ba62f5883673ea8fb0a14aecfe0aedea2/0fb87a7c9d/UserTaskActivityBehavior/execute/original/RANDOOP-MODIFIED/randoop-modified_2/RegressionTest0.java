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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList2 = executionEntity1.getEventSubscriptions();
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList2 = executionEntity1.findActiveActivityIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        org.activiti.engine.impl.pvm.PvmProcessDefinition pvmProcessDefinition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.PvmProcessInstance pvmProcessInstance4 = executionEntity1.createSubProcessInstance(pvmProcessDefinition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity3 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.executeActivity(pvmActivity3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity1.setDeleteReason("");
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity10 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addJob(jobEntity10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList9 = executionEntity1.getExecutions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl12 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.setProcessDefinition(processDefinitionImpl12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.PvmProcessDefinition pvmProcessDefinition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.PvmProcessInstance pvmProcessInstance9 = executionEntity1.createSubProcessInstance(pvmProcessDefinition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity1.setDeleteReason("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity10 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.executeActivity(pvmActivity10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.findExecution("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity5 = executionEntity1.involveUser("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity1.getEventSubscriptionsInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.createVariableLocal("hi!", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity1.getVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList2 = executionEntity1.getIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.getSubProcessInstance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity1.setDeleteReason("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = executionEntity1.getVariableLocal("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity5.setTransition(transitionImpl10);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl12 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.setProcessDefinition(processDefinitionImpl12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity1.getSubProcessInstance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.pvm.PvmProcessDefinition pvmProcessDefinition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.PvmProcessInstance pvmProcessInstance2 = executionEntity0.createSubProcessInstance(pvmProcessDefinition1);
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
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.signal("hi!", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = executionEntity5.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity0.removeVariable("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        boolean boolean4 = executionEntity1.isActive();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = executionEntity1.isActive("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity8 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.removeEventSubscription(eventSubscriptionEntity8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity1.setDeleteReason("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = executionEntity1.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.performOperation(atomicOperation8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.initialize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(executionEntity5);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl2 = null;
        executionEntity1.setTransition(transitionImpl2);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl11 = executionEntity10.getProcessDefinition();
        executionEntity6.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        java.lang.String str13 = executionEntity6.getSuperExecutionId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.signal("", (java.lang.Object) executionEntity6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity5.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = executionEntity5.hasVariable("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(executionEntity14);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = executionEntity5.isActive("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(executionEntity5);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet6 = executionEntity1.getVariableNamesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        executionEntity1.setRevision((int) '4');
        boolean boolean6 = executionEntity1.isScope();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.signal("", (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.PvmTransition pvmTransition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.take(pvmTransition8);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.impl.pvm.PvmException; message: transition is null");
        } catch (org.activiti.engine.impl.pvm.PvmException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.insert();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        int int5 = executionEntity1.getRevisionNext();
        java.lang.Class<?> wildcardClass6 = executionEntity1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity5.getCompensateEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.toString();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "ProcessInstance[null]" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity0.removeVariables((java.util.Collection<java.lang.String>) strList6);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ProcessInstance[null]" + "'", str1, "ProcessInstance[null]");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = executionEntity9.getProcessDefinition();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        executionEntity5.setDeleteReason("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity14 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList15 = executionEntity5.findInactiveConcurrentExecutions(pvmActivity14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = executionEntity0.setVariableLocal("", (java.lang.Object) executionEntity5);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(processDefinitionImpl10);
        org.junit.Assert.assertNotNull(activityExecutionList15);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList6 = executionEntity1.getIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl2 = null;
        executionEntity1.setTransition(transitionImpl2);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity4 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addTask(taskEntity4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        boolean boolean4 = executionEntity1.isActive();
        boolean boolean5 = executionEntity1.isSuspended();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity8 = executionEntity1.addIdentityLink("hi!", "ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        int int8 = executionEntity5.getRevisionNext();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity5.createExecution();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        executionEntity5.setProcessDefinitionId("hi!");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.remove();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList6 = executionEntity1.getTasks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(executionEntity5);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity1.setDeleteReason("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity10 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList11 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity10);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity12 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addEventSubscription(eventSubscriptionEntity12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNotNull(activityExecutionList11);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = executionEntity2.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl2 = null;
        executionEntity1.setTransition(transitionImpl2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList4 = executionEntity1.findActiveActivityIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity5.setTransition(transitionImpl10);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity12 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.executeActivity(pvmActivity12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity1.setDeleteReason("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity10 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList11 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity10);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNotNull(activityExecutionList11);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        boolean boolean4 = executionEntity1.isActive();
        executionEntity1.setSuspensionState((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = executionEntity1.hasVariable("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity9 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeJob(jobEntity9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = executionEntity1.hasVariableLocal("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(executionEntity5);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl2);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity3.setTransition(transitionImpl4);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity3, "ProcessInstance[null]", (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl3);
        executionEntity4.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity8.getProcessDefinition();
        executionEntity4.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity4.setDeleteReason("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity13 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList14 = executionEntity4.findInactiveConcurrentExecutions(pvmActivity13);
        int int15 = executionEntity4.getRevisionNext();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        org.junit.Assert.assertNull(processDefinitionImpl9);
        org.junit.Assert.assertNotNull(activityExecutionList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        boolean boolean5 = executionEntity1.isProcessInstanceType();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroyScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.end();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity5.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList15 = executionEntity14.getExecutions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(executionEntity14);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity5.setTransition(transitionImpl10);
        java.lang.String str12 = executionEntity5.getEventName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setEventName("hi!");
        boolean boolean21 = executionEntity18.isActive();
        executionEntity14.setSuperExecution(executionEntity18);
        executionEntity18.setId("");
        executionEntity18.setEventScope(false);
        org.activiti.engine.EngineServices engineServices27 = executionEntity18.getEngineServices();
        executionEntity5.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList29 = executionEntity18.getCompensateEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(engineServices27);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        executionEntity5.setProcessDefinitionId("hi!");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = executionEntity5.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity11 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.removeJob(jobEntity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(variableInstanceEntityList10);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setProcessDefinition(processDefinitionImpl10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getParentId();
        executionEntity1.setProcessDefinitionId("hi!");
        org.activiti.engine.impl.pvm.PvmTransition pvmTransition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.take(pvmTransition11);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.impl.pvm.PvmException; message: transition is null");
        } catch (org.activiti.engine.impl.pvm.PvmException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap3 = executionEntity2.getVariablesLocal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        executionEntity1.setActive(true);
        executionEntity1.setCachedEntityState(0);
        org.activiti.engine.impl.pvm.PvmTransition pvmTransition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.take(pvmTransition9);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.impl.pvm.PvmException; message: transition is null");
        } catch (org.activiti.engine.impl.pvm.PvmException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        executionEntity1.inactivate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str7 = executionEntity6.getProcessInstanceId();
        boolean boolean8 = executionEntity6.isConcurrent();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity6.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap11 = executionEntity1.getVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = executionEntity1.hasVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        int int8 = executionEntity5.getRevisionNext();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList9 = executionEntity5.getExecutions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl2);
        executionEntity3.setEventName("hi!");
        int int6 = executionEntity3.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = null;
        executionEntity3.setCachedElContext(eLContext7);
        int int9 = executionEntity3.getSuspensionState();
        java.lang.String str10 = executionEntity3.getParentId();
        java.lang.String str11 = executionEntity3.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl19 = executionEntity18.getProcessDefinition();
        executionEntity14.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        int int21 = executionEntity18.getRevisionNext();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity3, "", (java.lang.Object) int21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(processDefinitionImpl19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getParentId();
        executionEntity1.setProcessDefinitionId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables((java.util.Collection<java.lang.String>) strList13);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = executionEntity1.getQueryVariables();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = executionEntity1.updateProcessBusinessKey("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList10);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity11 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addTask(taskEntity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList10);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        executionEntity1.setActivity(activityImpl6);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariableLocal("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = executionEntity8.getVariableLocal("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariableLocal("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getReplacedBy();
        executionEntity1.setRevision(1);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setVariable("", (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(executionEntity3);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.setProcessDefinition(processDefinitionImpl10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        int int5 = executionEntity1.getRevisionNext();
        boolean boolean6 = executionEntity1.isDeleteRoot();
        java.lang.String[] strArray8 = new java.lang.String[] { "ProcessInstance[null]" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal((java.util.Collection<java.lang.String>) strList9);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getParentId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList4 = executionEntity1.getCompensateEventSubscriptions("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity8.getVariables();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity5.getCompensateEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteVariablesInstanceForLeavingScope();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(executionEntity5);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setEventScope(false);
        executionEntity5.setParentId("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet16 = executionEntity5.getVariableNames();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setEventName("hi!");
        boolean boolean12 = executionEntity9.isActive();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = null;
        executionEntity9.setTransition(transitionImpl14);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getSuperExecutionId();
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str5 = executionEntity1.getCurrentActivityName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList6 = executionEntity1.getJobs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity0.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity1.setDeleteReason("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity10 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList11 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet12 = executionEntity1.getVariableNamesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNotNull(activityExecutionList11);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        executionEntity5.setParentId("ProcessInstance[null]");
        java.lang.String[] strArray13 = new java.lang.String[] { "ProcessInstance[null]" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.removeVariables((java.util.Collection<java.lang.String>) strList14);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = executionEntity5.getQueryVariables();
        org.activiti.engine.impl.pvm.PvmTransition pvmTransition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.take(pvmTransition11);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.impl.pvm.PvmException; message: transition is null");
        } catch (org.activiti.engine.impl.pvm.PvmException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(variableInstanceEntityList10);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity0.removeVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getSuperExecutionId();
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str5 = executionEntity1.getCurrentActivityName();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.findExecution("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = executionEntity5.hasVariableLocal("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList12 = executionEntity5.getJobs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity5.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList15 = executionEntity5.getEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(executionEntity14);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = executionEntity5.getQueryVariables();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = executionEntity5.getEventSource();
        executionEntity5.forceUpdate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList13 = executionEntity5.getTasks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(variableInstanceEntityList10);
        org.junit.Assert.assertNull(pvmProcessElement11);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList11 = executionEntity1.getCompensateEventSubscriptions("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = executionEntity1.getVariable("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = executionEntity5.getQueryVariables();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = executionEntity5.getEventSource();
        executionEntity5.forceUpdate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity5.getEventSubscriptionsInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(variableInstanceEntityList10);
        org.junit.Assert.assertNull(pvmProcessElement11);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        executionEntity5.setConcurrent(true);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.removeVariableLocal("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.setEventName("ProcessInstance[null]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = executionEntity1.updateProcessBusinessKey("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        int int5 = executionEntity1.getRevisionNext();
        boolean boolean6 = executionEntity1.isDeleteRoot();
        boolean boolean7 = executionEntity1.isScope();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity8 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addJob(jobEntity8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = executionEntity1.getActivity();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity9 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addTask(taskEntity9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(activityImpl8);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        executionEntity15.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl20 = executionEntity19.getProcessDefinition();
        executionEntity15.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        executionEntity19.setActive(false);
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = executionEntity19.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = executionEntity19.findExecution("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(processDefinitionImpl20);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = executionEntity1.getEventSource();
        int int14 = executionEntity1.getRevisionNext();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.createVariableLocal("", (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(pvmProcessElement13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity5.setTransition(transitionImpl10);
        java.lang.String str12 = executionEntity5.getEventName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setEventName("hi!");
        boolean boolean21 = executionEntity18.isActive();
        executionEntity14.setSuperExecution(executionEntity18);
        executionEntity18.setId("");
        executionEntity18.setEventScope(false);
        org.activiti.engine.EngineServices engineServices27 = executionEntity18.getEngineServices();
        executionEntity5.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        executionEntity18.setParentId("ProcessInstance[null]");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity18.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(engineServices27);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getParentId();
        executionEntity1.setProcessDefinitionId("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList11 = executionEntity1.getJobs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        executionEntity1.inactivate();
        executionEntity1.setConcurrent(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = executionEntity1.updateProcessBusinessKey("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        boolean boolean4 = executionEntity1.isActive();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = executionEntity1.hasVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        boolean boolean4 = executionEntity1.isActive();
        boolean boolean5 = executionEntity1.isSuspended();
        java.lang.String str6 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmTransition[] pvmTransitionArray7 = new org.activiti.engine.impl.pvm.PvmTransition[] {};
        java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition> pvmTransitionList8 = new java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList8, pvmTransitionArray7);
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList10 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.takeAll((java.util.List<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList8, activityExecutionList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(pvmTransitionArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution10 = executionEntity9.getStartingExecution();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(executionEntity9);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        executionEntity10.setEventName("hi!");
        boolean boolean13 = executionEntity10.isActive();
        executionEntity6.setSuperExecution(executionEntity10);
        executionEntity10.setId("");
        executionEntity10.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl19);
        executionEntity20.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl25 = executionEntity24.getProcessDefinition();
        executionEntity20.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        executionEntity24.setActive(false);
        executionEntity10.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        int int30 = executionEntity10.getRevisionNext();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList32 = executionEntity1.getEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(processDefinitionImpl25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setEventScope(false);
        executionEntity5.setParentId("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = executionEntity5.hasVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        int int5 = executionEntity1.getRevisionNext();
        boolean boolean6 = executionEntity1.isDeleteRoot();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroyScope("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity5.getReplacedBy();
        executionEntity5.setRevision(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = executionEntity5.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(executionEntity14);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String[] strArray11 = new java.lang.String[] { "ProcessInstance[null]", "hi!", "ProcessInstance[null]" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal((java.util.Collection<java.lang.String>) strList12);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        executionEntity1.inactivate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = executionEntity1.hasVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity1.getActivity();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.remove();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(activityImpl7);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        executionEntity1.setActivity(activityImpl5);
        org.activiti.engine.impl.pvm.PvmTransition[] pvmTransitionArray7 = new org.activiti.engine.impl.pvm.PvmTransition[] {};
        java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition> pvmTransitionList8 = new java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList8, pvmTransitionArray7);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl16 = executionEntity15.getProcessDefinition();
        executionEntity11.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        java.lang.String str18 = executionEntity11.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl19);
        java.lang.String str21 = executionEntity20.getSuperExecutionId();
        executionEntity11.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = executionEntity20.getReplacedBy();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity24 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList25 = executionEntity20.findInactiveConcurrentExecutions(pvmActivity24);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.takeAll((java.util.List<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList8, activityExecutionList25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(pvmTransitionArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(processDefinitionImpl16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(executionEntity23);
        org.junit.Assert.assertNotNull(activityExecutionList25);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        int int5 = executionEntity1.getRevisionNext();
        boolean boolean6 = executionEntity1.isDeleteRoot();
        boolean boolean7 = executionEntity1.isScope();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        executionEntity15.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl20 = executionEntity19.getProcessDefinition();
        executionEntity15.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        executionEntity19.setActive(false);
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap25 = executionEntity19.getVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(processDefinitionImpl20);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        boolean boolean14 = executionEntity5.isEnded();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = executionEntity5.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity5.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity16.getParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(variableInstanceEntityList15);
        org.junit.Assert.assertNull(executionEntity16);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        executionEntity15.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl20 = executionEntity19.getProcessDefinition();
        executionEntity15.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        executionEntity19.setActive(false);
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        java.lang.String[] strArray27 = new java.lang.String[] { "ProcessInstance[null]", "ProcessInstance[null]" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity19.removeVariables((java.util.Collection<java.lang.String>) strList28);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(processDefinitionImpl20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl16 = executionEntity15.getProcessDefinition();
        executionEntity11.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        executionEntity15.setActive(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList20 = executionEntity15.getQueryVariables();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement21 = executionEntity15.getEventSource();
        executionEntity5.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList23 = executionEntity15.getCompensateEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(processDefinitionImpl16);
        org.junit.Assert.assertNull(variableInstanceEntityList20);
        org.junit.Assert.assertNull(pvmProcessElement21);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        executionEntity10.setEventName("hi!");
        boolean boolean13 = executionEntity10.isActive();
        executionEntity6.setSuperExecution(executionEntity10);
        executionEntity10.setId("");
        executionEntity10.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl19);
        executionEntity20.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl25 = executionEntity24.getProcessDefinition();
        executionEntity20.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        executionEntity24.setActive(false);
        executionEntity10.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        int int30 = executionEntity10.getRevisionNext();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity32 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeTask(taskEntity32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(processDefinitionImpl25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        boolean boolean4 = executionEntity1.isActive();
        executionEntity1.setSuspensionState((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList7 = executionEntity1.getJobs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.setActive(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity1.getVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity9.end();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(executionEntity9);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        executionEntity5.setProcessDefinitionId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = null;
        executionEntity5.setSuperExecution(executionEntity16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = executionEntity5.getVariableLocal("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        executionEntity15.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl20 = executionEntity19.getProcessDefinition();
        executionEntity15.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        executionEntity19.setActive(false);
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity19.removeVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(processDefinitionImpl20);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariableLocal("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        int int8 = executionEntity5.getRevisionNext();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.end();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isEnded();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement3 = null;
        executionEntity0.setEventSource(pvmProcessElement3);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setEventName("hi!");
        int int11 = executionEntity8.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext12 = null;
        executionEntity8.setCachedElContext(eLContext12);
        int int14 = executionEntity8.getSuspensionState();
        java.lang.String str15 = executionEntity8.getParentId();
        java.lang.String str16 = executionEntity8.getProcessInstanceId();
        executionEntity8.forceUpdate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = executionEntity0.setVariableLocal("", (java.lang.Object) 100.0d, executionEntity8);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = executionEntity1.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroyScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        executionEntity5.setProcessDefinitionId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = null;
        executionEntity5.setSuperExecution(executionEntity16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap18 = executionEntity5.getVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(executionEntity3);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        executionEntity1.inactivate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str7 = executionEntity6.getProcessInstanceId();
        boolean boolean8 = executionEntity6.isConcurrent();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity6.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap9);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroyScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        int int5 = executionEntity1.getRevisionNext();
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity1.getEventSubscriptionsInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        executionEntity5.setProcessDefinitionId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str18 = executionEntity17.toString();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl19);
        executionEntity20.setEventName("hi!");
        int int23 = executionEntity20.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext24 = null;
        executionEntity20.setCachedElContext(eLContext24);
        int int26 = executionEntity20.getSuspensionState();
        java.lang.String str27 = executionEntity20.getParentId();
        java.lang.String str28 = executionEntity20.getProcessInstanceId();
        executionEntity20.forceUpdate();
        executionEntity17.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = executionEntity5.setVariableLocal("", (java.lang.Object) executionEntity17);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ProcessInstance[null]" + "'", str18, "ProcessInstance[null]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.setActive(false);
        executionEntity1.disposeStartingExecution();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity9 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.executeActivity(pvmActivity9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.setEventName("ProcessInstance[null]");
        boolean boolean8 = executionEntity1.isActive();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity1.getSubProcessInstance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl2 = null;
        executionEntity1.setTransition(transitionImpl2);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity4 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList5 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = executionEntity1.isActive("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList5);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        int int5 = executionEntity1.getRevisionNext();
        boolean boolean6 = executionEntity1.isDeleteRoot();
        boolean boolean7 = executionEntity1.isScope();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList8 = executionEntity1.findActiveActivityIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.deleteCascade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getParentId();
        java.lang.String str9 = executionEntity1.getProcessInstanceId();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity12 = executionEntity1.addIdentityLink("ProcessInstance[null]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getParentId();
        executionEntity1.setProcessDefinitionId("hi!");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.end();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity10.getReplacedBy();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior16 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition15);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setEventName("hi!");
        java.lang.String str21 = executionEntity18.getCurrentActivityId();
        int int22 = executionEntity18.getRevisionNext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = executionEntity10.setVariableLocal("ProcessInstance[null]", (java.lang.Object) taskDefinition15, executionEntity18);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(executionEntity13);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        int int5 = executionEntity1.getRevisionNext();
        boolean boolean6 = executionEntity1.isDeleteRoot();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables((java.util.Collection<java.lang.String>) strList11);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getSuperExecutionId();
        executionEntity1.setDeleteReason("hi!");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.end();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity14 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addEventSubscription(eventSubscriptionEntity14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        int int5 = executionEntity1.getRevisionNext();
        boolean boolean6 = executionEntity1.isDeleteRoot();
        boolean boolean7 = executionEntity1.isScope();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.end();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = executionEntity1.getActivity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl16 = executionEntity15.getProcessDefinition();
        executionEntity11.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        java.lang.String str18 = executionEntity11.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl19);
        java.lang.String str21 = executionEntity20.getSuperExecutionId();
        executionEntity11.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = executionEntity20.getReplacedBy();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity24 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList25 = executionEntity20.findInactiveConcurrentExecutions(pvmActivity24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = executionEntity1.setVariableLocal("hi!", (java.lang.Object) executionEntity20);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(activityImpl8);
        org.junit.Assert.assertNull(processDefinitionImpl16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(executionEntity23);
        org.junit.Assert.assertNotNull(activityExecutionList25);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl2 = null;
        executionEntity1.setTransition(transitionImpl2);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity4 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList5 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity4);
        executionEntity1.setEventScope(true);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity1.involveUser("ProcessInstance[null]", "ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList5);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setEventName("hi!");
        boolean boolean14 = executionEntity11.isActive();
        executionEntity7.setSuperExecution(executionEntity11);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl16 = null;
        executionEntity11.setTransition(transitionImpl16);
        executionEntity11.setBusinessKey("hi!");
        java.lang.String str20 = executionEntity11.getSuperExecutionId();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl22 = null;
        executionEntity11.setTransitionBeingTaken(transitionImpl22);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity11.removeVariable("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        executionEntity10.setEventName("hi!");
        boolean boolean13 = executionEntity10.isActive();
        executionEntity6.setSuperExecution(executionEntity10);
        executionEntity10.setId("");
        executionEntity10.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl19);
        executionEntity20.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl25 = executionEntity24.getProcessDefinition();
        executionEntity20.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        executionEntity24.setActive(false);
        executionEntity10.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        int int30 = executionEntity10.getRevisionNext();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.impl.pvm.PvmTransition[] pvmTransitionArray32 = new org.activiti.engine.impl.pvm.PvmTransition[] {};
        java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition> pvmTransitionList33 = new java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList33, pvmTransitionArray32);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl35 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl35);
        executionEntity36.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl39 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl39);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl41 = executionEntity40.getProcessDefinition();
        executionEntity36.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity40);
        executionEntity36.setDeleteReason("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity45 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList46 = executionEntity36.findInactiveConcurrentExecutions(pvmActivity45);
        int int47 = executionEntity36.getRevisionNext();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity48 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList49 = executionEntity36.findInactiveConcurrentExecutions(pvmActivity48);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.takeAll((java.util.List<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList33, activityExecutionList49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(processDefinitionImpl25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(pvmTransitionArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(processDefinitionImpl41);
        org.junit.Assert.assertNotNull(activityExecutionList46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(activityExecutionList49);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        executionEntity5.setScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl18 = executionEntity17.getProcessDefinition();
        executionEntity13.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        executionEntity13.setDeleteReason("");
        java.lang.String str22 = executionEntity13.getBusinessKey();
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList24 = executionEntity5.getIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(processDefinitionImpl18);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution10 = executionEntity1.getStartingExecution();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(startingExecution10);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setEventScope(false);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity5.createExecution();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        boolean boolean4 = executionEntity1.isActive();
        int int5 = executionEntity1.getRevision();
        java.lang.String[] strArray9 = new java.lang.String[] { "ProcessInstance[null]", "", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal((java.util.Collection<java.lang.String>) strList10);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        executionEntity1.setActive(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setEventName("hi!");
        executionEntity9.setRevision((int) '4');
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity9.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = executionEntity1.setVariableLocal("ProcessInstance[null]", (java.lang.Object) executionEntity9);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(executionEntity14);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.setEventName("ProcessInstance[null]");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroyScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setVariable("", obj10);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.setActive(false);
        executionEntity1.disposeStartingExecution();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.insert();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getParentId();
        executionEntity1.setProcessDefinitionId("hi!");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal((java.util.Collection<java.lang.String>) strList14);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity14 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.executeActivity(pvmActivity14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setEventName("hi!");
        boolean boolean14 = executionEntity11.isActive();
        executionEntity7.setSuperExecution(executionEntity11);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl16 = null;
        executionEntity11.setTransition(transitionImpl16);
        executionEntity11.setBusinessKey("hi!");
        java.lang.String str20 = executionEntity11.getSuperExecutionId();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity11.removeVariablesLocal((java.util.Collection<java.lang.String>) strList24);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = executionEntity10.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.javax.el.ELContext eLContext14 = null;
        executionEntity5.setCachedElContext(eLContext14);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setEventName("hi!");
        int int20 = executionEntity17.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = null;
        executionEntity17.setCachedElContext(eLContext21);
        int int23 = executionEntity17.getSuspensionState();
        executionEntity5.setSuperExecution(executionEntity17);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement25 = executionEntity5.getEventSource();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl29 = executionEntity28.getProcessDefinition();
        boolean boolean30 = executionEntity28.isActive();
        java.lang.String str31 = executionEntity28.getBusinessKey();
        executionEntity28.setActive(true);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.setVariable("ProcessInstance[null]", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(pvmProcessElement25);
        org.junit.Assert.assertNull(processDefinitionImpl29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity5.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet11 = executionEntity5.getVariableNamesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(executionEntity10);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        executionEntity1.setRevision((int) '4');
        boolean boolean6 = executionEntity1.isScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl13 = executionEntity12.getProcessDefinition();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity8.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(processDefinitionImpl13);
        org.junit.Assert.assertNull(executionEntity15);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity1.getEventSubscriptionsInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getEventName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity1.getCompensateEventSubscriptions("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        int int5 = executionEntity1.getRevisionNext();
        boolean boolean6 = executionEntity1.isDeleteRoot();
        java.lang.String str7 = executionEntity1.getProcessInstanceId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity1.getActivity();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal((java.util.Collection<java.lang.String>) strList12);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(activityImpl7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        executionEntity1.inactivate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str7 = executionEntity6.getProcessInstanceId();
        boolean boolean8 = executionEntity6.isConcurrent();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity6.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap9);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity11 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeEventSubscription(eventSubscriptionEntity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        boolean boolean10 = executionEntity1.isDeleteRoot();
        java.lang.String str11 = executionEntity1.getDeleteReason();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteVariablesInstanceForLeavingScope();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity2.end();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.remove();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl14 = executionEntity1.getProcessDefinition();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.initialize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(processDefinitionImpl14);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        executionEntity1.inactivate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList6 = executionEntity1.getIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = executionEntity5.getQueryVariables();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = executionEntity5.getEventSource();
        executionEntity5.forceUpdate();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.destroyScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(variableInstanceEntityList10);
        org.junit.Assert.assertNull(pvmProcessElement11);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = executionEntity1.getEventSource();
        int int14 = executionEntity1.getRevisionNext();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.initialize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(pvmProcessElement13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        executionEntity1.setRevision((int) '4');
        boolean boolean6 = executionEntity1.isScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity1.getQueryVariables();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = executionEntity1.hasVariable("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList7);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        boolean boolean4 = executionEntity1.isActive();
        boolean boolean5 = executionEntity1.isSuspended();
        java.lang.String str6 = executionEntity1.getParentId();
        boolean boolean7 = executionEntity1.isEventScope();
        java.lang.Object obj8 = executionEntity1.getPersistentState();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity1.involveUser("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.EngineServices engineServices13 = executionEntity1.getEngineServices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet14 = executionEntity1.getVariableNamesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(engineServices13);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        boolean boolean10 = executionEntity1.isDeleteRoot();
        java.lang.String str11 = executionEntity1.getDeleteReason();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = executionEntity1.updateProcessBusinessKey("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity1.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList5 = executionEntity1.getTasks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = executionEntity1.getQueryVariables();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = executionEntity1.hasVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList10);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.javax.el.ELContext eLContext14 = null;
        executionEntity5.setCachedElContext(eLContext14);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setEventName("hi!");
        int int20 = executionEntity17.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = null;
        executionEntity17.setCachedElContext(eLContext21);
        int int23 = executionEntity17.getSuspensionState();
        executionEntity5.setSuperExecution(executionEntity17);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement25 = executionEntity5.getEventSource();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList26 = executionEntity5.getJobs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(pvmProcessElement25);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        executionEntity1.setActive(true);
        executionEntity1.setEventScope(false);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity1.addIdentityLink("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = executionEntity8.getBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        executionEntity15.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl20 = executionEntity19.getProcessDefinition();
        executionEntity15.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        executionEntity19.setActive(false);
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl26 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl26);
        executionEntity27.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl30 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl30);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl32 = executionEntity31.getProcessDefinition();
        executionEntity27.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity31);
        executionEntity27.setDeleteReason("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity36 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList37 = executionEntity27.findInactiveConcurrentExecutions(pvmActivity36);
        int int38 = executionEntity27.getRevisionNext();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity39 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList40 = executionEntity27.findInactiveConcurrentExecutions(pvmActivity39);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.signal("ProcessInstance[null]", (java.lang.Object) activityExecutionList40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(processDefinitionImpl20);
        org.junit.Assert.assertNull(processDefinitionImpl32);
        org.junit.Assert.assertNotNull(activityExecutionList37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(activityExecutionList40);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariableLocal("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setEventScope(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList14 = executionEntity5.getJobs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        executionEntity1.inactivate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str7 = executionEntity6.getProcessInstanceId();
        boolean boolean8 = executionEntity6.isConcurrent();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity6.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap9);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteCascade("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        boolean boolean14 = executionEntity5.isEnded();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = executionEntity5.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity5.getProcessInstance();
        org.activiti.engine.EngineServices engineServices17 = executionEntity5.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str19 = executionEntity18.getProcessInstanceId();
        executionEntity5.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        org.activiti.engine.impl.pvm.PvmTransition pvmTransition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.take(pvmTransition21);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.impl.pvm.PvmException; message: transition is null");
        } catch (org.activiti.engine.impl.pvm.PvmException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(variableInstanceEntityList15);
        org.junit.Assert.assertNull(executionEntity16);
        org.junit.Assert.assertNull(engineServices17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        boolean boolean10 = executionEntity1.isDeleteRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap11 = executionEntity1.getVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getProcessInstance();
        executionEntity1.setRevision((int) (short) 0);
        java.lang.String str11 = executionEntity1.getProcessInstanceId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList12 = executionEntity1.getTasks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution10 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity11 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addJob(jobEntity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(startingExecution10);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        executionEntity1.setActive(true);
        executionEntity1.setCachedEntityState(0);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity1.getCompensateEventSubscriptions();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariable("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(compensateEventSubscriptionEntityList9);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariableLocal("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.setActive(false);
        executionEntity1.disposeStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = null;
        executionEntity11.setTransition(transitionImpl12);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity14 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList15 = executionEntity11.findInactiveConcurrentExecutions(pvmActivity14);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.createVariableLocal("ProcessInstance[null]", (java.lang.Object) pvmActivity14);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(activityExecutionList15);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = executionEntity2.hasVariables();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(executionEntity2);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity5.setTransition(transitionImpl10);
        java.lang.String str12 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity13 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.removeTask(taskEntity13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getParentId();
        executionEntity1.setProcessDefinitionId("hi!");
        org.activiti.engine.EngineServices engineServices11 = executionEntity1.getEngineServices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList12 = executionEntity1.getTasks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(engineServices11);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isConcurrent();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = executionEntity0.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity0.removeVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        boolean boolean12 = executionEntity5.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        executionEntity5.setActivity(activityImpl13);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.destroyScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet6 = executionEntity5.getVariableNamesLocal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(executionEntity5);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = executionEntity1.getEventSource();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(pvmProcessElement13);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = executionEntity1.updateProcessBusinessKey("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        boolean boolean10 = executionEntity1.isDeleteRoot();
        java.lang.String str11 = executionEntity1.getDeleteReason();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteCascade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getParentId();
        java.lang.String str3 = executionEntity1.getCurrentActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl11 = executionEntity10.getProcessDefinition();
        executionEntity6.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        java.lang.String str13 = executionEntity6.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        java.lang.String str16 = executionEntity15.getSuperExecutionId();
        executionEntity6.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl22 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl22);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl24 = executionEntity23.getProcessDefinition();
        executionEntity19.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity23);
        executionEntity23.setActive(false);
        executionEntity23.setScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl30 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl30);
        executionEntity31.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl34 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl34);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl36 = executionEntity35.getProcessDefinition();
        executionEntity31.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity35);
        executionEntity31.setDeleteReason("");
        java.lang.String str40 = executionEntity31.getBusinessKey();
        executionEntity23.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity31);
        executionEntity15.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = executionEntity1.setVariableLocal("ProcessInstance[null]", (java.lang.Object) executionEntity15);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(processDefinitionImpl11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(processDefinitionImpl24);
        org.junit.Assert.assertNull(processDefinitionImpl36);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.setActive(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity1.getEventSubscriptionsInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isConcurrent();
        boolean boolean3 = executionEntity0.isSuspended();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet4 = executionEntity0.getVariableNamesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity1.setDeleteReason("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity10 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList11 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity10);
        int int12 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity13.removeIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNotNull(activityExecutionList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNull(executionEntity13);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = executionEntity10.updateProcessBusinessKey("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        executionEntity1.setRevision((int) '4');
        boolean boolean6 = executionEntity1.isScope();
        java.lang.String str7 = executionEntity1.getDeleteReason();
        boolean boolean8 = executionEntity1.isEnded();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroyScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        boolean boolean10 = executionEntity1.isDeleteRoot();
        org.activiti.engine.impl.pvm.PvmTransition[] pvmTransitionArray11 = new org.activiti.engine.impl.pvm.PvmTransition[] {};
        java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition> pvmTransitionList12 = new java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList12, pvmTransitionArray11);
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList14 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.takeAll((java.util.List<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList12, activityExecutionList14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(pvmTransitionArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity1.setDeleteReason("");
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.findExecution("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.toString();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl2);
        executionEntity3.setEventName("hi!");
        int int6 = executionEntity3.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = null;
        executionEntity3.setCachedElContext(eLContext7);
        int int9 = executionEntity3.getSuspensionState();
        java.lang.String str10 = executionEntity3.getParentId();
        java.lang.String str11 = executionEntity3.getProcessInstanceId();
        executionEntity3.forceUpdate();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        java.lang.String str14 = executionEntity3.getActivityId();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = executionEntity3.hasVariable("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ProcessInstance[null]" + "'", str1, "ProcessInstance[null]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity10.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        executionEntity5.setScope(true);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.insert();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        executionEntity5.setConcurrent(true);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.remove();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity5.setTransition(transitionImpl10);
        executionEntity5.setBusinessKey("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity16 = executionEntity5.involveUser("hi!", "ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getProcessDefinitionId();
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity1.getStartingExecution();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.createExecution();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(startingExecution7);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setEventName("hi!");
        boolean boolean14 = executionEntity11.isActive();
        executionEntity7.setSuperExecution(executionEntity11);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl16 = null;
        executionEntity11.setTransition(transitionImpl16);
        executionEntity11.setBusinessKey("hi!");
        java.lang.String str20 = executionEntity11.getSuperExecutionId();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl22 = null;
        executionEntity11.setTransitionBeingTaken(transitionImpl22);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity11.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl14 = executionEntity1.getProcessDefinition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = executionEntity1.hasVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(processDefinitionImpl14);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        executionEntity1.setActive(true);
        executionEntity1.inactivate();
        executionEntity1.setProcessDefinitionId("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = executionEntity1.hasVariableLocal("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setEventName("hi!");
        boolean boolean14 = executionEntity11.isActive();
        executionEntity7.setSuperExecution(executionEntity11);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl16 = null;
        executionEntity11.setTransition(transitionImpl16);
        executionEntity11.setBusinessKey("hi!");
        java.lang.String str20 = executionEntity11.getSuperExecutionId();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity22 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity11.addJob(jobEntity22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getProcessDefinitionId();
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        java.lang.String str10 = executionEntity9.getSuperExecutionId();
        executionEntity9.setDeleteReason("hi!");
        java.lang.String str13 = executionEntity9.getCurrentActivityName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = executionEntity1.setVariableLocal("hi!", (java.lang.Object) executionEntity9);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        boolean boolean4 = executionEntity1.isActive();
        int int5 = executionEntity1.getRevision();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.findExecution("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        boolean boolean14 = executionEntity5.isEnded();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = executionEntity5.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity5.getProcessInstance();
        org.activiti.engine.EngineServices engineServices17 = executionEntity5.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str19 = executionEntity18.getProcessInstanceId();
        executionEntity5.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = executionEntity5.hasVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(variableInstanceEntityList15);
        org.junit.Assert.assertNull(executionEntity16);
        org.junit.Assert.assertNull(engineServices17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.forceUpdate();
        java.lang.String str7 = executionEntity1.getId();
        executionEntity1.setRevision((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteVariablesInstanceForLeavingScope();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.toString();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl2);
        executionEntity3.setEventName("hi!");
        int int6 = executionEntity3.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = null;
        executionEntity3.setCachedElContext(eLContext7);
        int int9 = executionEntity3.getSuspensionState();
        java.lang.String str10 = executionEntity3.getParentId();
        java.lang.String str11 = executionEntity3.getProcessInstanceId();
        executionEntity3.forceUpdate();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        boolean boolean14 = executionEntity3.isSuspended();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity3.deleteVariablesInstanceForLeavingScope();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ProcessInstance[null]" + "'", str1, "ProcessInstance[null]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getDeleteReason();
        executionEntity1.setDeleteReason("");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteCascade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setEventName("hi!");
        int int10 = executionEntity7.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext11 = null;
        executionEntity7.setCachedElContext(eLContext11);
        int int13 = executionEntity7.getSuspensionState();
        java.lang.String str14 = executionEntity7.getParentId();
        java.lang.Object obj15 = executionEntity7.getPersistentState();
        boolean boolean16 = executionEntity7.isConcurrent();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity10 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.removeEventSubscription(eventSubscriptionEntity10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity0.removeVariables((java.util.Collection<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getProcessDefinitionId();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = executionEntity1.isActive("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = null;
        executionEntity1.setTransition(transitionImpl5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = executionEntity1.getVariable("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        boolean boolean4 = executionEntity1.isActive();
        executionEntity1.setSuspensionState((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet7 = executionEntity1.getVariableNames();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = executionEntity1.getEventSource();
        boolean boolean14 = executionEntity1.isActive();
        java.lang.String str15 = executionEntity1.getEventName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = executionEntity1.isActive("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(pvmProcessElement13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        boolean boolean12 = executionEntity5.isConcurrent();
        java.lang.String str13 = executionEntity5.getEventName();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList14 = executionEntity5.getQueryVariables();
        org.activiti.engine.EngineServices engineServices15 = executionEntity5.getEngineServices();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity16 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.addTask(taskEntity16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(variableInstanceEntityList14);
        org.junit.Assert.assertNull(engineServices15);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = executionEntity1.getEventSource();
        boolean boolean14 = executionEntity1.isActive();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = executionEntity1.getQueryVariables();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity18 = executionEntity1.addIdentityLink("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(pvmProcessElement13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList15);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        executionEntity1.setActive(true);
        executionEntity1.setEventScope(false);
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.performOperation(atomicOperation9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str8 = executionEntity7.getProcessInstanceId();
        boolean boolean9 = executionEntity7.isConcurrent();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = executionEntity7.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior3);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = executionEntity5.getQueryVariables();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = executionEntity5.getEventSource();
        executionEntity5.forceUpdate();
        java.lang.Class<?> wildcardClass13 = executionEntity5.getClass();
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(variableInstanceEntityList10);
        org.junit.Assert.assertNull(pvmProcessElement11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        executionEntity5.setScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl18 = executionEntity17.getProcessDefinition();
        executionEntity13.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        executionEntity13.setDeleteReason("");
        java.lang.String str22 = executionEntity13.getBusinessKey();
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity26 = executionEntity13.addIdentityLink("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(processDefinitionImpl18);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        int int5 = executionEntity1.getRevisionNext();
        executionEntity1.setCachedEntityState(0);
        java.lang.Class<?> wildcardClass8 = executionEntity1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity1.getActivity();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl8);
        org.activiti.engine.impl.javax.el.ELContext eLContext10 = null;
        executionEntity1.setCachedElContext(eLContext10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList12 = executionEntity1.getIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(activityImpl7);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setEventName("hi!");
        int int10 = executionEntity7.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext11 = null;
        executionEntity7.setCachedElContext(eLContext11);
        int int13 = executionEntity7.getSuspensionState();
        java.lang.String str14 = executionEntity7.getParentId();
        java.lang.Object obj15 = executionEntity7.getPersistentState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl21 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl21);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl23 = executionEntity22.getProcessDefinition();
        executionEntity18.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity22);
        int int25 = executionEntity22.getRevisionNext();
        boolean boolean26 = executionEntity22.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = executionEntity22.getParent();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity7, "", (java.lang.Object) executionEntity27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(processDefinitionImpl23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(executionEntity27);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        executionEntity5.setConcurrent(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity5.getSuperExecution();
        executionEntity5.disposeStartingExecution();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList14 = executionEntity5.getEventSubscriptionsInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(executionEntity12);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        executionEntity5.setConcurrent(true);
        executionEntity5.setId("ProcessInstance[null]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = executionEntity5.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = executionEntity5.getQueryVariables();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = executionEntity5.getEventSource();
        executionEntity5.forceUpdate();
        org.activiti.engine.impl.pvm.PvmTransition pvmTransition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.take(pvmTransition13);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.impl.pvm.PvmException; message: transition is null");
        } catch (org.activiti.engine.impl.pvm.PvmException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(variableInstanceEntityList10);
        org.junit.Assert.assertNull(pvmProcessElement11);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList9 = executionEntity8.getIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        boolean boolean12 = executionEntity5.isConcurrent();
        java.lang.String str13 = executionEntity5.getEventName();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList14 = executionEntity5.getQueryVariables();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.initialize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(variableInstanceEntityList14);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution10 = executionEntity1.getStartingExecution();
        java.lang.String str11 = executionEntity1.getParentId();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "ProcessInstance[null]", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal((java.util.Collection<java.lang.String>) strList16);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(startingExecution10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl19 = executionEntity18.getProcessDefinition();
        executionEntity14.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        executionEntity18.setActive(false);
        executionEntity18.setScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl25);
        executionEntity26.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl29 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl29);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl31 = executionEntity30.getProcessDefinition();
        executionEntity26.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity30);
        executionEntity26.setDeleteReason("");
        java.lang.String str35 = executionEntity26.getBusinessKey();
        executionEntity18.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity26);
        executionEntity10.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = executionEntity26.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(processDefinitionImpl19);
        org.junit.Assert.assertNull(processDefinitionImpl31);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.forceUpdate();
        java.lang.String str7 = executionEntity1.getId();
        executionEntity1.setRevision((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet10 = executionEntity1.getVariableNamesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl19 = executionEntity18.getProcessDefinition();
        executionEntity14.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        executionEntity18.setActive(false);
        executionEntity18.setScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl25);
        executionEntity26.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl29 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl29);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl31 = executionEntity30.getProcessDefinition();
        executionEntity26.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity30);
        executionEntity26.setDeleteReason("");
        java.lang.String str35 = executionEntity26.getBusinessKey();
        executionEntity18.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity26);
        executionEntity10.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = executionEntity10.getVariableLocal("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(processDefinitionImpl19);
        org.junit.Assert.assertNull(processDefinitionImpl31);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        boolean boolean5 = executionEntity1.isProcessInstanceType();
        executionEntity1.setCachedEntityState((int) '#');
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl8 = executionEntity1.getProcessDefinition();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(processDefinitionImpl8);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity1.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        boolean boolean4 = executionEntity1.isActive();
        boolean boolean5 = executionEntity1.isSuspended();
        executionEntity1.setActive(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getReplacedBy();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        executionEntity10.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setEventName("hi!");
        boolean boolean17 = executionEntity14.isActive();
        executionEntity10.setSuperExecution(executionEntity14);
        executionEntity14.setId("");
        executionEntity14.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        executionEntity24.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl29 = executionEntity28.getProcessDefinition();
        executionEntity24.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity28);
        executionEntity28.setActive(false);
        executionEntity14.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity28);
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = executionEntity28.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity8.setVariables(strMap34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(processDefinitionImpl29);
        org.junit.Assert.assertNotNull(strMap34);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getProcessInstance();
        executionEntity1.setRevision((int) (short) 0);
        java.lang.String str11 = executionEntity1.getProcessInstanceId();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity1.getSubProcessInstance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setEventScope(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        executionEntity15.setEventName("hi!");
        int int18 = executionEntity15.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext19 = null;
        executionEntity15.setCachedElContext(eLContext19);
        int int21 = executionEntity15.getSuspensionState();
        java.lang.String str22 = executionEntity15.getParentId();
        java.lang.String str23 = executionEntity15.getProcessInstanceId();
        executionEntity15.forceUpdate();
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation26 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.performOperation(atomicOperation26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.setEventName("ProcessInstance[null]");
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getSubProcessInstance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity5.getReplacedBy();
        executionEntity5.setRevision(1);
        boolean boolean17 = executionEntity5.isProcessInstanceType();
        java.lang.String str18 = executionEntity5.getCurrentActivityId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = executionEntity5.updateProcessBusinessKey("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(executionEntity14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        executionEntity1.forceUpdate();
        executionEntity1.setRevision((int) (short) 100);
        executionEntity1.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity10 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeTask(taskEntity10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setEventScope(false);
        executionEntity5.setParentId("hi!");
        boolean boolean16 = executionEntity5.isSuspended();
        java.lang.String str17 = executionEntity5.getTenantId();
        int int18 = executionEntity5.getSuspensionState();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.destroyScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl14 = executionEntity1.getProcessDefinition();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "ProcessInstance[null]", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables((java.util.Collection<java.lang.String>) strList19);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(processDefinitionImpl14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getParentId();
        java.lang.String str9 = executionEntity1.getProcessInstanceId();
        executionEntity1.forceUpdate();
        boolean boolean11 = executionEntity1.isProcessInstanceType();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl15 = executionEntity14.getProcessDefinition();
        boolean boolean16 = executionEntity14.isActive();
        java.lang.String str17 = executionEntity14.getBusinessKey();
        java.lang.String str18 = executionEntity14.getDeleteReason();
        executionEntity14.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = executionEntity1.setVariableLocal("ProcessInstance[null]", (java.lang.Object) executionEntity14, executionEntity20);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(processDefinitionImpl15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getParentId();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity3 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addTask(taskEntity3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        executionEntity10.setEventName("hi!");
        boolean boolean13 = executionEntity10.isActive();
        executionEntity6.setSuperExecution(executionEntity10);
        executionEntity10.setId("");
        executionEntity10.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl19);
        executionEntity20.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl25 = executionEntity24.getProcessDefinition();
        executionEntity20.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        executionEntity24.setActive(false);
        executionEntity10.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = executionEntity24.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(processDefinitionImpl25);
        org.junit.Assert.assertNotNull(strMap30);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        boolean boolean14 = executionEntity5.isEnded();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = executionEntity5.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity5.getProcessInstance();
        org.activiti.engine.EngineServices engineServices17 = executionEntity5.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str19 = executionEntity18.getProcessInstanceId();
        executionEntity5.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl21 = executionEntity5.getTransition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = executionEntity5.hasVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(variableInstanceEntityList15);
        org.junit.Assert.assertNull(executionEntity16);
        org.junit.Assert.assertNull(engineServices17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(transitionImpl21);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        int int5 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity1.getTransition();
        java.lang.Object obj8 = null;
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        executionEntity10.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setEventName("hi!");
        boolean boolean17 = executionEntity14.isActive();
        executionEntity10.setSuperExecution(executionEntity14);
        executionEntity14.setId("");
        executionEntity14.setEventScope(false);
        executionEntity14.setParentId("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = executionEntity1.setVariableLocal("ProcessInstance[null]", obj8, executionEntity14);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNull(transitionImpl6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity5.getActivityId();
        org.activiti.engine.impl.pvm.PvmProcessDefinition pvmProcessDefinition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.PvmProcessInstance pvmProcessInstance10 = executionEntity5.createSubProcessInstance(pvmProcessDefinition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setEventScope(false);
        org.activiti.engine.EngineServices engineServices14 = executionEntity5.getEngineServices();
        executionEntity5.setDeleteReason("");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(engineServices14);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity1.setDeleteReason("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity10 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList11 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity10);
        int int12 = executionEntity1.getRevisionNext();
        executionEntity1.setActive(true);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity1.findExecution("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNotNull(activityExecutionList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        boolean boolean4 = executionEntity1.isActive();
        int int5 = executionEntity1.getRevision();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity1.getVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        boolean boolean4 = executionEntity1.isActive();
        boolean boolean5 = executionEntity1.isSuspended();
        executionEntity1.setActive(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity1.getVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        executionEntity1.setRevision((int) '4');
        boolean boolean6 = executionEntity1.isScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity1.getQueryVariables();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteCascade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList7);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity6 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeJob(jobEntity6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(executionEntity5);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        int int5 = executionEntity1.getRevisionNext();
        boolean boolean6 = executionEntity1.isDeleteRoot();
        java.lang.String str7 = executionEntity1.getProcessInstanceId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.initialize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.forceUpdate();
        java.lang.String str7 = executionEntity1.getId();
        executionEntity1.setActive(true);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity10 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addJob(jobEntity10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        boolean boolean5 = executionEntity1.isProcessInstanceType();
        int int6 = executionEntity1.getCachedEntityState();
        java.lang.String str7 = executionEntity1.toString();
        executionEntity1.inactivate();
        java.lang.String str9 = executionEntity1.getSuperExecutionId();
        java.lang.String[] strArray13 = new java.lang.String[] { "ProcessInstance[null]", "ProcessInstance[null]", "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables((java.util.Collection<java.lang.String>) strList14);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ProcessInstance[null]" + "'", str7, "ProcessInstance[null]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.javax.el.ELContext eLContext14 = null;
        executionEntity5.setCachedElContext(eLContext14);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setEventName("hi!");
        int int20 = executionEntity17.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = null;
        executionEntity17.setCachedElContext(eLContext21);
        int int23 = executionEntity17.getSuspensionState();
        executionEntity5.setSuperExecution(executionEntity17);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement25 = executionEntity5.getEventSource();
        java.lang.String str26 = executionEntity5.getBusinessKey();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = executionEntity5.hasVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(pvmProcessElement25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setEventScope(false);
        executionEntity5.setParentId("hi!");
        boolean boolean16 = executionEntity5.isSuspended();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = executionEntity5.hasVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl19 = executionEntity18.getProcessDefinition();
        executionEntity14.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        executionEntity18.setActive(false);
        executionEntity18.setScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl25);
        executionEntity26.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl29 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl29);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl31 = executionEntity30.getProcessDefinition();
        executionEntity26.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity30);
        executionEntity26.setDeleteReason("");
        java.lang.String str35 = executionEntity26.getBusinessKey();
        executionEntity18.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity26);
        executionEntity10.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity26);
        java.util.List<org.activiti.engine.impl.pvm.PvmTransition> pvmTransitionList38 = null;
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl39 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl39);
        executionEntity40.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl43 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity44 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl43);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl45 = executionEntity44.getProcessDefinition();
        executionEntity40.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity44);
        java.lang.String str47 = executionEntity40.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl48 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity49 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl48);
        java.lang.String str50 = executionEntity49.getSuperExecutionId();
        executionEntity40.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity49);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity52 = executionEntity49.getReplacedBy();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity53 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList54 = executionEntity49.findInactiveConcurrentExecutions(pvmActivity53);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity26.takeAll(pvmTransitionList38, activityExecutionList54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(processDefinitionImpl19);
        org.junit.Assert.assertNull(processDefinitionImpl31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(processDefinitionImpl45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(executionEntity52);
        org.junit.Assert.assertNotNull(activityExecutionList54);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getSuperExecutionId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        boolean boolean4 = executionEntity1.isActive();
        executionEntity1.setSuspensionState((int) '#');
        java.lang.String str7 = executionEntity1.getProcessInstanceId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = executionEntity1.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = executionEntity1.getEventSource();
        boolean boolean14 = executionEntity1.isActive();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.createVariableLocal("hi!", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(pvmProcessElement13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity5.setTransition(transitionImpl10);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = executionEntity5.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.removeVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity5.setTransition(transitionImpl10);
        java.lang.String str12 = executionEntity5.getCurrentActivityId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.setVariable("hi!", (java.lang.Object) "ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        boolean boolean14 = executionEntity5.isEnded();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity16 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity15.addEventSubscription(eventSubscriptionEntity16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(executionEntity15);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        executionEntity5.setParentId("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.PvmProcessDefinition pvmProcessDefinition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.PvmProcessInstance pvmProcessInstance13 = executionEntity5.createSubProcessInstance(pvmProcessDefinition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getParentId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap3 = executionEntity1.getVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        boolean boolean5 = executionEntity1.isProcessInstanceType();
        int int6 = executionEntity1.getCachedEntityState();
        java.lang.String str7 = executionEntity1.toString();
        executionEntity1.inactivate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity1.getCompensateEventSubscriptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ProcessInstance[null]" + "'", str7, "ProcessInstance[null]");
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        boolean boolean12 = executionEntity5.isConcurrent();
        java.lang.String str13 = executionEntity5.getEventName();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList14 = executionEntity5.getQueryVariables();
        org.activiti.engine.EngineServices engineServices15 = executionEntity5.getEngineServices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = executionEntity5.hasVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(variableInstanceEntityList14);
        org.junit.Assert.assertNull(engineServices15);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setEventScope(false);
        executionEntity5.setParentId("hi!");
        boolean boolean16 = executionEntity5.isSuspended();
        java.lang.String str17 = executionEntity5.getCurrentActivityId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        executionEntity1.setRevision((int) '4');
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = null;
        executionEntity1.setCachedElContext(eLContext6);
        java.lang.String str8 = executionEntity1.getDeleteReason();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet9 = executionEntity1.getVariableNames();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity8.setTenantId("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        java.lang.String str13 = executionEntity1.getCurrentActivityName();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity8 = executionEntity1.involveUser("ProcessInstance[null]", "ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setEventScope(false);
        executionEntity5.setParentId("hi!");
        boolean boolean16 = executionEntity5.isSuspended();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity5.createExecution();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = executionEntity5.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.toString();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl2);
        executionEntity3.setEventName("hi!");
        int int6 = executionEntity3.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = null;
        executionEntity3.setCachedElContext(eLContext7);
        int int9 = executionEntity3.getSuspensionState();
        java.lang.String str10 = executionEntity3.getParentId();
        java.lang.String str11 = executionEntity3.getProcessInstanceId();
        executionEntity3.forceUpdate();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "ProcessInstance[null]", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity3.removeVariablesLocal((java.util.Collection<java.lang.String>) strList18);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ProcessInstance[null]" + "'", str1, "ProcessInstance[null]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setEventName("hi!");
        boolean boolean14 = executionEntity11.isActive();
        executionEntity7.setSuperExecution(executionEntity11);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl16 = null;
        executionEntity11.setTransition(transitionImpl16);
        executionEntity11.setBusinessKey("hi!");
        java.lang.String str20 = executionEntity11.getSuperExecutionId();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        boolean boolean14 = executionEntity5.isEnded();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = executionEntity5.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity5.getProcessInstance();
        org.activiti.engine.EngineServices engineServices17 = executionEntity5.getEngineServices();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.destroyScope("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(variableInstanceEntityList15);
        org.junit.Assert.assertNull(executionEntity16);
        org.junit.Assert.assertNull(engineServices17);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        executionEntity5.setProcessDefinitionId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = null;
        executionEntity5.setSuperExecution(executionEntity16);
        executionEntity5.disposeStartingExecution();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity2 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity0.removeJob(jobEntity2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity5.setTransition(transitionImpl10);
        java.lang.String str12 = executionEntity5.getEventName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setEventName("hi!");
        boolean boolean21 = executionEntity18.isActive();
        executionEntity14.setSuperExecution(executionEntity18);
        executionEntity18.setId("");
        executionEntity18.setEventScope(false);
        org.activiti.engine.EngineServices engineServices27 = executionEntity18.getEngineServices();
        executionEntity5.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        executionEntity18.setParentId("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity18.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity31);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity33 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity31.removeTask(taskEntity33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(engineServices27);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity3.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(executionEntity3);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariableLocal("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        executionEntity5.setScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl18 = executionEntity17.getProcessDefinition();
        executionEntity13.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        executionEntity13.setDeleteReason("");
        java.lang.String str22 = executionEntity13.getBusinessKey();
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        java.lang.String str24 = executionEntity5.getTenantId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.deleteVariablesInstanceForLeavingScope();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(processDefinitionImpl18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setProcessDefinitionId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity5.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity12.setCachedEntityState((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(executionEntity12);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        executionEntity10.setEventName("hi!");
        boolean boolean13 = executionEntity10.isActive();
        executionEntity6.setSuperExecution(executionEntity10);
        executionEntity10.setId("");
        executionEntity10.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl19);
        executionEntity20.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl25 = executionEntity24.getProcessDefinition();
        executionEntity20.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        executionEntity24.setActive(false);
        executionEntity10.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        int int30 = executionEntity10.getRevisionNext();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity32 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity10.removeEventSubscription(eventSubscriptionEntity32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(processDefinitionImpl25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.toString();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl2);
        executionEntity3.setEventName("hi!");
        int int6 = executionEntity3.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = null;
        executionEntity3.setCachedElContext(eLContext7);
        int int9 = executionEntity3.getSuspensionState();
        java.lang.String str10 = executionEntity3.getParentId();
        java.lang.String str11 = executionEntity3.getProcessInstanceId();
        executionEntity3.forceUpdate();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        boolean boolean14 = executionEntity3.isSuspended();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = executionEntity3.getActivity();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity16 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity3.executeActivity(pvmActivity16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ProcessInstance[null]" + "'", str1, "ProcessInstance[null]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(activityImpl15);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getProcessInstance();
        executionEntity1.setRevision((int) (short) 0);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setEventName("hi!");
        boolean boolean20 = executionEntity17.isActive();
        executionEntity13.setSuperExecution(executionEntity17);
        executionEntity17.setId("");
        executionEntity17.setExecutionListenerIndex((java.lang.Integer) 100);
        boolean boolean26 = executionEntity17.isEnded();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList27 = executionEntity17.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = executionEntity17.getProcessInstance();
        org.activiti.engine.EngineServices engineServices29 = executionEntity17.getEngineServices();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setVariable("ProcessInstance[]", (java.lang.Object) engineServices29);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(variableInstanceEntityList27);
        org.junit.Assert.assertNull(executionEntity28);
        org.junit.Assert.assertNull(engineServices29);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = executionEntity5.getQueryVariables();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = executionEntity5.getEventSource();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet12 = executionEntity5.getVariableNamesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(variableInstanceEntityList10);
        org.junit.Assert.assertNull(pvmProcessElement11);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.PvmProcessDefinition pvmProcessDefinition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.PvmProcessInstance pvmProcessInstance9 = executionEntity5.createSubProcessInstance(pvmProcessDefinition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        boolean boolean14 = executionEntity5.isEnded();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = executionEntity5.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity5.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity5.getVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(variableInstanceEntityList15);
        org.junit.Assert.assertNull(executionEntity16);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity5.getReplacedBy();
        executionEntity5.setRevision(1);
        boolean boolean17 = executionEntity5.isProcessInstanceType();
        java.lang.String str18 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.javax.el.ELContext eLContext19 = null;
        executionEntity5.setCachedElContext(eLContext19);
        org.activiti.engine.impl.pvm.PvmTransition pvmTransition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.take(pvmTransition21);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.impl.pvm.PvmException; message: transition is null");
        } catch (org.activiti.engine.impl.pvm.PvmException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(executionEntity14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.performOperation(atomicOperation5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getParentId();
        java.lang.Object obj9 = executionEntity1.getPersistentState();
        boolean boolean10 = executionEntity1.isConcurrent();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity1.findExecution("ProcessInstance[]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        boolean boolean4 = executionEntity1.isActive();
        boolean boolean5 = executionEntity1.isSuspended();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity1.getCompensateEventSubscriptions("ProcessInstance[]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.setEventName("ProcessInstance[null]");
        boolean boolean8 = executionEntity1.isActive();
        int int9 = executionEntity1.getRevision();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet10 = executionEntity1.getVariableNamesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        boolean boolean14 = executionEntity5.isEnded();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = executionEntity5.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity5.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = executionEntity16.getVariableLocal("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(variableInstanceEntityList15);
        org.junit.Assert.assertNull(executionEntity16);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.initialize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl2 = null;
        executionEntity1.setTransition(transitionImpl2);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity4 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList5 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity4);
        executionEntity1.setEventScope(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = executionEntity1.hasVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList5);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        executionEntity1.inactivate();
        boolean boolean6 = executionEntity1.isScope();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = executionEntity1.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        boolean boolean4 = executionEntity1.isActive();
        boolean boolean5 = executionEntity1.isSuspended();
        java.lang.String str6 = executionEntity1.getParentId();
        boolean boolean7 = executionEntity1.isEventScope();
        java.lang.Object obj8 = executionEntity1.getPersistentState();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity1.addIdentityLink("ProcessInstance[]", "ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        int int5 = executionEntity1.getRevisionNext();
        boolean boolean6 = executionEntity1.isDeleteRoot();
        boolean boolean7 = executionEntity1.isScope();
        boolean boolean8 = executionEntity1.isConcurrent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = executionEntity1.hasVariable("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = executionEntity8.isSuspended();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        boolean boolean10 = executionEntity1.isDeleteRoot();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = executionEntity1.getTransitionBeingTaken();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList12 = executionEntity1.findActiveActivityIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(transitionImpl11);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        boolean boolean4 = executionEntity1.isActive();
        boolean boolean5 = executionEntity1.isSuspended();
        executionEntity1.setActive(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = executionEntity1.isActive("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        boolean boolean4 = executionEntity1.isActive();
        executionEntity1.setSuspensionState((int) '#');
        java.lang.String str7 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        executionEntity1.setActivity(activityImpl8);
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.performOperation(atomicOperation10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        executionEntity5.setScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl18 = executionEntity17.getProcessDefinition();
        executionEntity13.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        executionEntity13.setDeleteReason("");
        java.lang.String str22 = executionEntity13.getBusinessKey();
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        int int24 = executionEntity13.getRevisionNext();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity13.removeVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(processDefinitionImpl18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution10 = executionEntity1.getStartingExecution();
        boolean boolean11 = executionEntity1.isScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setEventName("hi!");
        boolean boolean20 = executionEntity17.isActive();
        executionEntity13.setSuperExecution(executionEntity17);
        executionEntity17.setId("");
        executionEntity17.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl26 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl26);
        executionEntity27.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl30 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl30);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl32 = executionEntity31.getProcessDefinition();
        executionEntity27.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity31);
        executionEntity31.setActive(false);
        executionEntity17.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity31);
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = executionEntity31.getProcessVariables();
        executionEntity1.setVariables(strMap37);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList39 = executionEntity1.getEventSubscriptionsInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(startingExecution10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(processDefinitionImpl32);
        org.junit.Assert.assertNotNull(strMap37);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        boolean boolean4 = executionEntity1.isActive();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl5);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteVariablesInstanceForLeavingScope();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity1.setDeleteReason("");
        java.lang.String[] strArray12 = new java.lang.String[] { "ProcessInstance[]", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables((java.util.Collection<java.lang.String>) strList13);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl14 = executionEntity1.getProcessDefinition();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet15 = executionEntity1.getVariableNames();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(processDefinitionImpl14);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getParentId();
        java.lang.String str6 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl7 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setProcessDefinition(processDefinitionImpl7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        executionEntity5.setScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl18 = executionEntity17.getProcessDefinition();
        executionEntity13.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        executionEntity13.setDeleteReason("");
        java.lang.String str22 = executionEntity13.getBusinessKey();
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        java.lang.String str24 = executionEntity5.getTenantId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.initialize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(processDefinitionImpl18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        executionEntity1.setActive(true);
        executionEntity1.setEventScope(false);
        java.lang.String str9 = executionEntity1.getSuperExecutionId();
        executionEntity1.setCachedEntityState((-1));
        java.lang.String str12 = executionEntity1.getProcessInstanceId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity10.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity13.setTransition(transitionImpl14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(executionEntity13);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        int int5 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity1.getTransition();
        java.lang.String str7 = executionEntity1.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        executionEntity10.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setEventName("hi!");
        boolean boolean17 = executionEntity14.isActive();
        executionEntity10.setSuperExecution(executionEntity14);
        executionEntity14.setId("");
        executionEntity14.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = executionEntity14.getReplacedBy();
        executionEntity14.setRevision(1);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity26 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList27 = executionEntity14.findInactiveConcurrentExecutions(pvmActivity26);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.signal("", (java.lang.Object) activityExecutionList27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNull(transitionImpl6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(executionEntity23);
        org.junit.Assert.assertNotNull(activityExecutionList27);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getProcessInstance();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl3);
        executionEntity4.setEventName("hi!");
        executionEntity4.setRevision((int) '4');
        boolean boolean9 = executionEntity4.isScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = executionEntity4.getQueryVariables();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity0.removeVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList10);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation2 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity0.performOperation(atomicOperation2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity1.getActivity();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(activityImpl7);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl16 = executionEntity15.getProcessDefinition();
        executionEntity11.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        executionEntity15.setActive(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList20 = executionEntity15.getQueryVariables();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement21 = executionEntity15.getEventSource();
        executionEntity5.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        executionEntity5.setId("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet25 = executionEntity5.getVariableNamesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(processDefinitionImpl16);
        org.junit.Assert.assertNull(variableInstanceEntityList20);
        org.junit.Assert.assertNull(pvmProcessElement21);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        boolean boolean4 = executionEntity1.isActive();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl5);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity7 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addEventSubscription(eventSubscriptionEntity7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.removeVariable("ProcessInstance[]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getProcessInstance();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl3);
        executionEntity4.setEventName("hi!");
        executionEntity4.setRevision((int) '4');
        boolean boolean9 = executionEntity4.isScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = executionEntity4.getQueryVariables();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity4.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList10);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity5.setTransition(transitionImpl10);
        java.lang.String str12 = executionEntity5.getEventName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setEventName("hi!");
        boolean boolean21 = executionEntity18.isActive();
        executionEntity14.setSuperExecution(executionEntity18);
        executionEntity18.setId("");
        executionEntity18.setEventScope(false);
        org.activiti.engine.EngineServices engineServices27 = executionEntity18.getEngineServices();
        executionEntity5.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.remove();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(engineServices27);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getParentId();
        java.lang.Object obj9 = executionEntity1.getPersistentState();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet10 = executionEntity1.getVariableNames();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        executionEntity5.setScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl18 = executionEntity17.getProcessDefinition();
        executionEntity13.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        executionEntity13.setDeleteReason("");
        java.lang.String str22 = executionEntity13.getBusinessKey();
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity13.destroyScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(processDefinitionImpl18);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        boolean boolean5 = executionEntity1.isProcessInstanceType();
        executionEntity1.setCachedEntityState((int) '#');
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl8 = executionEntity1.getProcessDefinition();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList9 = executionEntity1.getExecutions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(processDefinitionImpl8);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.forceUpdate();
        java.lang.String str7 = executionEntity1.getId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getParentId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setVariable("ProcessInstance[null]", (java.lang.Object) executionEntity10);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getSuperExecutionId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.initialize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        executionEntity1.inactivate();
        executionEntity1.setConcurrent(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = executionEntity1.getVariable("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        executionEntity15.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl20 = executionEntity19.getProcessDefinition();
        executionEntity15.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        executionEntity19.setActive(false);
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity25 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.addTask(taskEntity25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(processDefinitionImpl20);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl13 = executionEntity12.getProcessDefinition();
        boolean boolean14 = executionEntity12.isActive();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity12.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.signal("ProcessInstance[]", (java.lang.Object) executionEntity12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(processDefinitionImpl13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        executionEntity5.setScope(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet12 = executionEntity5.getVariableNamesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getProcessInstanceId();
        boolean boolean6 = executionEntity4.isEnded();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity11 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeEventSubscription(eventSubscriptionEntity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList10);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        executionEntity5.setConcurrent(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList12 = executionEntity5.getIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.javax.el.ELContext eLContext14 = null;
        executionEntity5.setCachedElContext(eLContext14);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setEventName("hi!");
        int int20 = executionEntity17.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = null;
        executionEntity17.setCachedElContext(eLContext21);
        int int23 = executionEntity17.getSuspensionState();
        executionEntity5.setSuperExecution(executionEntity17);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement25 = executionEntity5.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = executionEntity5.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity29 = executionEntity5.addIdentityLink("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(pvmProcessElement25);
        org.junit.Assert.assertNotNull(executionEntity26);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        boolean boolean14 = executionEntity5.isEnded();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = executionEntity5.getQueryVariables();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity5.findExecution("ProcessInstance[]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(variableInstanceEntityList15);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        executionEntity1.forceUpdate();
        executionEntity1.setRevision((int) (short) 100);
        executionEntity1.setRevision(2);
        executionEntity1.setParentId("hi!");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteCascade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl2 = null;
        executionEntity1.setTransition(transitionImpl2);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity4 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList5 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity4);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity1.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariable("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getParentId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        executionEntity15.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setEventName("hi!");
        boolean boolean22 = executionEntity19.isActive();
        executionEntity15.setSuperExecution(executionEntity19);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution24 = executionEntity15.getStartingExecution();
        boolean boolean25 = executionEntity15.isScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl26 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl26);
        executionEntity27.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl30 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl30);
        executionEntity31.setEventName("hi!");
        boolean boolean34 = executionEntity31.isActive();
        executionEntity27.setSuperExecution(executionEntity31);
        executionEntity31.setId("");
        executionEntity31.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl40);
        executionEntity41.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl44 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity45 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl44);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl46 = executionEntity45.getProcessDefinition();
        executionEntity41.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity45);
        executionEntity45.setActive(false);
        executionEntity31.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity45);
        java.util.Map<java.lang.String, java.lang.Object> strMap51 = executionEntity45.getProcessVariables();
        executionEntity15.setVariables(strMap51);
        executionEntity5.setVariablesLocal(strMap51);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet54 = executionEntity5.getVariableNamesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(startingExecution24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(processDefinitionImpl46);
        org.junit.Assert.assertNotNull(strMap51);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setEventName("hi!");
        java.lang.String str10 = executionEntity7.getCurrentActivityId();
        executionEntity7.forceUpdate();
        executionEntity7.setRevision((int) (short) 100);
        executionEntity7.setRevision(2);
        executionEntity7.setParentId("hi!");
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        boolean boolean5 = executionEntity1.isProcessInstanceType();
        int int6 = executionEntity1.getCachedEntityState();
        java.lang.String str7 = executionEntity1.toString();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setEventName("hi!");
        boolean boolean16 = executionEntity13.isActive();
        executionEntity9.setSuperExecution(executionEntity13);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl18 = null;
        executionEntity13.setTransition(transitionImpl18);
        java.lang.String str20 = executionEntity13.getEventName();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity22 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeJob(jobEntity22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ProcessInstance[null]" + "'", str7, "ProcessInstance[null]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        executionEntity5.setScope(true);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.removeVariable("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        executionEntity5.setProcessDefinitionId("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl16 = executionEntity5.getProcessDefinition();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        boolean boolean10 = executionEntity1.isDeleteRoot();
        java.lang.String str11 = executionEntity1.getDeleteReason();
        boolean boolean12 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.PvmTransition[] pvmTransitionArray13 = new org.activiti.engine.impl.pvm.PvmTransition[] {};
        java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition> pvmTransitionList14 = new java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList14, pvmTransitionArray13);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl20);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl22 = executionEntity21.getProcessDefinition();
        executionEntity17.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
        executionEntity17.setDeleteReason("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity26 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList27 = executionEntity17.findInactiveConcurrentExecutions(pvmActivity26);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.takeAll((java.util.List<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList14, activityExecutionList27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(pvmTransitionArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(processDefinitionImpl22);
        org.junit.Assert.assertNotNull(activityExecutionList27);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        executionEntity1.inactivate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str7 = executionEntity6.getProcessInstanceId();
        boolean boolean8 = executionEntity6.isConcurrent();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity6.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap9);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) (-1));
        executionEntity1.setEventName("");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariable("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        executionEntity15.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl20 = executionEntity19.getProcessDefinition();
        executionEntity15.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        executionEntity19.setActive(false);
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        boolean boolean25 = executionEntity5.isProcessInstanceType();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.initialize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(processDefinitionImpl20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setEventName("hi!");
        boolean boolean16 = executionEntity13.isActive();
        executionEntity9.setSuperExecution(executionEntity13);
        executionEntity13.setId("");
        executionEntity13.setExecutionListenerIndex((java.lang.Integer) 100);
        executionEntity13.setProcessDefinitionId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = null;
        executionEntity13.setSuperExecution(executionEntity24);
        int int26 = executionEntity13.getRevisionNext();
        java.lang.String str27 = executionEntity13.getParentId();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getParentId();
        java.lang.Object obj9 = executionEntity1.getPersistentState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        executionEntity12.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        executionEntity16.setEventName("hi!");
        boolean boolean19 = executionEntity16.isActive();
        executionEntity12.setSuperExecution(executionEntity16);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl21 = null;
        executionEntity16.setTransition(transitionImpl21);
        executionEntity16.setBusinessKey("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = executionEntity1.setVariableLocal("", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution7 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution7, "ProcessInstance[]", (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        int int8 = executionEntity5.getRevisionNext();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.removeVariable("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity5.getReplacedBy();
        executionEntity5.setRevision(1);
        boolean boolean17 = executionEntity5.isProcessInstanceType();
        java.lang.String str18 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.javax.el.ELContext eLContext19 = null;
        executionEntity5.setCachedElContext(eLContext19);
        java.lang.Object obj21 = executionEntity5.getPersistentState();
        java.lang.Object obj23 = null;
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl24 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl24);
        executionEntity25.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl28 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl28);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl30 = executionEntity29.getProcessDefinition();
        executionEntity25.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity29);
        executionEntity29.setActive(false);
        executionEntity29.setScope(true);
        boolean boolean36 = executionEntity29.isProcessInstanceType();
        int int37 = executionEntity29.getSuspensionState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = executionEntity5.setVariableLocal("hi!", obj23, executionEntity29);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(executionEntity14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(processDefinitionImpl30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        boolean boolean5 = executionEntity1.isProcessInstanceType();
        int int6 = executionEntity1.getCachedEntityState();
        java.lang.String str7 = executionEntity1.toString();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setEventName("hi!");
        boolean boolean16 = executionEntity13.isActive();
        executionEntity9.setSuperExecution(executionEntity13);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl18 = null;
        executionEntity13.setTransition(transitionImpl18);
        java.lang.String str20 = executionEntity13.getEventName();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = executionEntity13.isActive("ProcessInstance[]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ProcessInstance[null]" + "'", str7, "ProcessInstance[null]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        int int10 = executionEntity5.getRevision();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = null;
        executionEntity5.setTransition(transitionImpl11);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity13 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.executeActivity(pvmActivity13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = executionEntity9.getProcessDefinition();
        boolean boolean11 = executionEntity9.isActive();
        java.lang.String str12 = executionEntity9.getBusinessKey();
        executionEntity9.setActive(true);
        executionEntity9.setExecutionListenerIndex((java.lang.Integer) 2);
        boolean boolean17 = executionEntity9.isSuspended();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior3);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        org.junit.Assert.assertNull(processDefinitionImpl10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getParentId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList3 = executionEntity1.getTasks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity1.getProcessVariables();
        java.lang.String str6 = executionEntity1.toString();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.insert();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ProcessInstance[null]" + "'", str6, "ProcessInstance[null]");
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity5.getReplacedBy();
        executionEntity5.setRevision(1);
        boolean boolean17 = executionEntity5.isProcessInstanceType();
        java.lang.String str18 = executionEntity5.getBusinessKey();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap19 = executionEntity5.getVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(executionEntity14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getProcessDefinitionId();
        int int5 = executionEntity1.getCachedEntityState();
        java.lang.String str6 = executionEntity1.getBusinessKey();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.initialize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setEventScope(false);
        executionEntity5.setParentId("hi!");
        boolean boolean16 = executionEntity5.isSuspended();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setEventName("hi!");
        int int21 = executionEntity18.getSuspensionState();
        executionEntity18.inactivate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str24 = executionEntity23.getProcessInstanceId();
        boolean boolean25 = executionEntity23.isConcurrent();
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = executionEntity23.getProcessVariables();
        executionEntity18.setVariablesLocal(strMap26);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl28 = executionEntity18.getActivity();
        java.lang.String str29 = executionEntity18.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl30 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl30);
        executionEntity31.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl34 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl34);
        executionEntity35.setEventName("hi!");
        boolean boolean38 = executionEntity35.isActive();
        executionEntity31.setSuperExecution(executionEntity35);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution40 = executionEntity31.getStartingExecution();
        boolean boolean41 = executionEntity31.isScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl42 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl42);
        executionEntity43.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl46 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity47 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl46);
        executionEntity47.setEventName("hi!");
        boolean boolean50 = executionEntity47.isActive();
        executionEntity43.setSuperExecution(executionEntity47);
        executionEntity47.setId("");
        executionEntity47.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl56 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity57 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl56);
        executionEntity57.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl60 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity61 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl60);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl62 = executionEntity61.getProcessDefinition();
        executionEntity57.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity61);
        executionEntity61.setActive(false);
        executionEntity47.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity61);
        java.util.Map<java.lang.String, java.lang.Object> strMap67 = executionEntity61.getProcessVariables();
        executionEntity31.setVariables(strMap67);
        executionEntity18.setVariablesLocal(strMap67);
        executionEntity5.createVariablesLocal(strMap67);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity73 = executionEntity5.involveUser("ProcessInstance[]", "ProcessInstance[]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNull(activityImpl28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(startingExecution40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(processDefinitionImpl62);
        org.junit.Assert.assertNotNull(strMap67);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        boolean boolean14 = executionEntity5.isEnded();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity5.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = executionEntity15.getRevisionNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(executionEntity15);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = executionEntity1.getActivity();
        java.lang.Object obj9 = executionEntity1.getPersistentState();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity1.getEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(activityImpl8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        boolean boolean5 = executionEntity1.isProcessInstanceType();
        executionEntity1.setCachedEntityState((int) '#');
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.remove();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        executionEntity1.disposeStartingExecution();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity1.getProcessInstance();
        boolean boolean10 = executionEntity1.isSuspended();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity11.setTransition(transitionImpl12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(executionEntity9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(executionEntity11);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        boolean boolean12 = executionEntity5.isConcurrent();
        java.lang.String str13 = executionEntity5.getEventName();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList14 = executionEntity5.getQueryVariables();
        org.activiti.engine.EngineServices engineServices15 = executionEntity5.getEngineServices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList16 = executionEntity5.getExecutions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(variableInstanceEntityList14);
        org.junit.Assert.assertNull(engineServices15);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        boolean boolean12 = executionEntity5.isConcurrent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList13 = executionEntity5.getExecutions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity5.setTransition(transitionImpl10);
        java.lang.String str12 = executionEntity5.getEventName();
        java.lang.String str13 = executionEntity5.getCurrentActivityId();
        boolean boolean14 = executionEntity5.isConcurrent();
        org.activiti.engine.impl.javax.el.ELContext eLContext15 = null;
        executionEntity5.setCachedElContext(eLContext15);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.removeVariableLocal("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = executionEntity1.isActive("ProcessInstance[]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        executionEntity1.setRevision((int) '4');
        java.lang.String str6 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setEventName("hi!");
        boolean boolean16 = executionEntity13.isActive();
        executionEntity9.setSuperExecution(executionEntity13);
        executionEntity13.setId("");
        executionEntity13.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.javax.el.ELContext eLContext22 = null;
        executionEntity13.setCachedElContext(eLContext22);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl24 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl24);
        executionEntity25.setEventName("hi!");
        int int28 = executionEntity25.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext29 = null;
        executionEntity25.setCachedElContext(eLContext29);
        int int31 = executionEntity25.getSuspensionState();
        executionEntity13.setSuperExecution(executionEntity25);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        executionEntity34.setEventName("hi!");
        int int37 = executionEntity34.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext38 = null;
        executionEntity34.setCachedElContext(eLContext38);
        int int40 = executionEntity34.getSuspensionState();
        executionEntity34.setExecutionListenerIndex((java.lang.Integer) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = executionEntity1.setVariableLocal("ProcessInstance[]", (java.lang.Object) executionEntity25, executionEntity34);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        boolean boolean5 = executionEntity1.isProcessInstanceType();
        int int6 = executionEntity1.getCachedEntityState();
        java.lang.String str7 = executionEntity1.toString();
        executionEntity1.inactivate();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteCascade("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ProcessInstance[null]" + "'", str7, "ProcessInstance[null]");
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        boolean boolean13 = executionEntity10.isEnded();
        java.lang.String str14 = executionEntity10.getProcessInstanceId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity10.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        executionEntity5.setConcurrent(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = executionEntity5.getActivity();
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.performOperation(atomicOperation13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(activityImpl12);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        boolean boolean10 = executionEntity1.isDeleteRoot();
        java.lang.String str11 = executionEntity1.getDeleteReason();
        boolean boolean12 = executionEntity1.isConcurrent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity1.getCompensateEventSubscriptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.javax.el.ELContext eLContext14 = null;
        executionEntity5.setCachedElContext(eLContext14);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setEventName("hi!");
        int int20 = executionEntity17.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = null;
        executionEntity17.setCachedElContext(eLContext21);
        int int23 = executionEntity17.getSuspensionState();
        executionEntity5.setSuperExecution(executionEntity17);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement25 = executionEntity5.getEventSource();
        java.lang.String str26 = executionEntity5.getBusinessKey();
        executionEntity5.disposeStartingExecution();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = executionEntity5.hasVariableLocal("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(pvmProcessElement25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        boolean boolean5 = executionEntity1.isProcessInstanceType();
        executionEntity1.setCachedEntityState((int) '#');
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl8 = executionEntity1.getProcessDefinition();
        executionEntity1.disposeStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        executionEntity12.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl17 = executionEntity16.getProcessDefinition();
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = executionEntity12.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.createVariableLocal("ProcessInstance[]", (java.lang.Object) strMap19);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(processDefinitionImpl8);
        org.junit.Assert.assertNull(processDefinitionImpl17);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = executionEntity1.getEventSource();
        boolean boolean14 = executionEntity1.isActive();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        executionEntity1.setActivity(activityImpl15);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity17 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addEventSubscription(eventSubscriptionEntity17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(pvmProcessElement13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity1.setDeleteReason("");
        java.lang.String str10 = executionEntity1.getBusinessKey();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet11 = executionEntity1.getVariableNamesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl19 = executionEntity18.getProcessDefinition();
        executionEntity14.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        executionEntity18.setActive(false);
        executionEntity18.setScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl25);
        executionEntity26.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl29 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl29);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl31 = executionEntity30.getProcessDefinition();
        executionEntity26.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity30);
        executionEntity26.setDeleteReason("");
        java.lang.String str35 = executionEntity26.getBusinessKey();
        executionEntity18.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity26);
        executionEntity10.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity26);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity38 = executionEntity10.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList39 = executionEntity38.getEventSubscriptionsInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(processDefinitionImpl19);
        org.junit.Assert.assertNull(processDefinitionImpl31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(executionEntity38);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.javax.el.ELContext eLContext14 = null;
        executionEntity5.setCachedElContext(eLContext14);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setEventName("hi!");
        int int20 = executionEntity17.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = null;
        executionEntity17.setCachedElContext(eLContext21);
        int int23 = executionEntity17.getSuspensionState();
        executionEntity5.setSuperExecution(executionEntity17);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement25 = executionEntity5.getEventSource();
        java.lang.String str26 = executionEntity5.getBusinessKey();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.removeIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(pvmProcessElement25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getEventName();
        java.lang.Object obj9 = executionEntity1.getPersistentState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = executionEntity1.updateProcessBusinessKey("ProcessInstance[]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = executionEntity5.getQueryVariables();
        executionEntity5.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity12 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.removeJob(jobEntity12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(variableInstanceEntityList10);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setEventScope(false);
        executionEntity5.setParentId("hi!");
        boolean boolean16 = executionEntity5.isSuspended();
        java.lang.String str17 = executionEntity5.getTenantId();
        java.lang.String str18 = executionEntity5.getSuperExecutionId();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity5.getSubProcessInstance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        boolean boolean5 = executionEntity1.isProcessInstanceType();
        int int6 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = executionEntity7.updateProcessBusinessKey("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertNull(executionEntity7);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity5.setTransition(transitionImpl10);
        java.lang.String str12 = executionEntity5.getEventName();
        java.lang.String str13 = executionEntity5.getCurrentActivityId();
        executionEntity5.setTenantId("ProcessInstance[null]");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList16 = executionEntity5.getIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl16 = executionEntity15.getProcessDefinition();
        executionEntity11.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        executionEntity15.setActive(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList20 = executionEntity15.getQueryVariables();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement21 = executionEntity15.getEventSource();
        executionEntity5.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity25 = executionEntity15.involveUser("", "ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(processDefinitionImpl16);
        org.junit.Assert.assertNull(variableInstanceEntityList20);
        org.junit.Assert.assertNull(pvmProcessElement21);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        executionEntity15.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl20 = executionEntity19.getProcessDefinition();
        executionEntity15.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        executionEntity19.setActive(false);
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = executionEntity19.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = executionEntity19.getVariable("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(processDefinitionImpl20);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity1.getProcessInstance();
        boolean boolean10 = executionEntity1.isSuspended();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = executionEntity11.getTenantId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(executionEntity9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(executionEntity11);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        executionEntity5.setConcurrent(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity5.getTransition();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity15 = executionEntity5.involveUser("ProcessInstance[null]", "ProcessInstance[]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(transitionImpl12);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        boolean boolean5 = executionEntity1.isProcessInstanceType();
        executionEntity1.setCachedEntityState((int) '#');
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity8.setTenantId("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.EngineServices engineServices13 = executionEntity10.getEngineServices();
        executionEntity10.setCachedEntityState((-1));
        // The following exception was thrown during execution in test generation
        try {
            executionEntity10.initialize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(engineServices13);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getParentId();
        boolean boolean9 = executionEntity1.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.javax.el.ELContext eLContext11 = executionEntity10.getCachedElContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(executionEntity10);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity5.getReplacedBy();
        executionEntity5.setRevision(1);
        boolean boolean17 = executionEntity5.isProcessInstanceType();
        java.lang.String str18 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.javax.el.ELContext eLContext19 = null;
        executionEntity5.setCachedElContext(eLContext19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = executionEntity5.hasVariableLocal("ProcessInstance[]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(executionEntity14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getSuperExecutionId();
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str5 = executionEntity1.getCurrentActivityName();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.PvmProcessDefinition pvmProcessDefinition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.PvmProcessInstance pvmProcessInstance8 = executionEntity1.createSubProcessInstance(pvmProcessDefinition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        boolean boolean10 = executionEntity1.isDeleteRoot();
        java.lang.String str11 = executionEntity1.getDeleteReason();
        boolean boolean12 = executionEntity1.isConcurrent();
        java.lang.String[] strArray15 = new java.lang.String[] { "ProcessInstance[]", "ProcessInstance[]" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal((java.util.Collection<java.lang.String>) strList16);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.setEventName("ProcessInstance[null]");
        boolean boolean8 = executionEntity1.isActive();
        int int9 = executionEntity1.getRevision();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.remove();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        boolean boolean14 = executionEntity5.isEnded();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = executionEntity5.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity5.getProcessInstance();
        org.activiti.engine.EngineServices engineServices17 = executionEntity5.getEngineServices();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(variableInstanceEntityList15);
        org.junit.Assert.assertNull(executionEntity16);
        org.junit.Assert.assertNull(engineServices17);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        executionEntity5.setScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl18 = executionEntity17.getProcessDefinition();
        executionEntity13.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        executionEntity13.setDeleteReason("");
        java.lang.String str22 = executionEntity13.getBusinessKey();
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        java.lang.String str24 = executionEntity5.getTenantId();
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 2);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = executionEntity5.getSubProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity27.deleteVariablesInstanceForLeavingScope();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(processDefinitionImpl18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(executionEntity27);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity5.setTransition(transitionImpl10);
        java.lang.String str12 = executionEntity5.getCurrentActivityName();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = executionEntity5.getTransitionBeingTaken();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(transitionImpl13);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity1.setDeleteReason("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity10 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList11 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity10);
        int int12 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity13 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeEventSubscription(eventSubscriptionEntity13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNotNull(activityExecutionList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getParentId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = executionEntity1.getVariableLocal("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.toString();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl2);
        executionEntity3.setEventName("hi!");
        int int6 = executionEntity3.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = null;
        executionEntity3.setCachedElContext(eLContext7);
        int int9 = executionEntity3.getSuspensionState();
        java.lang.String str10 = executionEntity3.getParentId();
        java.lang.String str11 = executionEntity3.getProcessInstanceId();
        executionEntity3.forceUpdate();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        boolean boolean14 = executionEntity3.isSuspended();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = executionEntity3.getActivity();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement16 = null;
        executionEntity3.setEventSource(pvmProcessElement16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList18 = executionEntity3.getTasks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ProcessInstance[null]" + "'", str1, "ProcessInstance[null]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(activityImpl15);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        executionEntity5.setScope(true);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.createVariableLocal("", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isEnded();
        boolean boolean3 = executionEntity0.isEventScope();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity0.removeVariableLocal("ScopeExecution[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getParentId();
        java.lang.String str9 = executionEntity1.getProcessInstanceId();
        executionEntity1.forceUpdate();
        boolean boolean11 = executionEntity1.isProcessInstanceType();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList12 = executionEntity1.getEventSubscriptionsInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity5.getTransition();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList13 = executionEntity5.getIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(transitionImpl12);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity5.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = executionEntity14.isConcurrent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(executionEntity14);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getParentId();
        java.lang.String str9 = executionEntity1.getProcessInstanceId();
        executionEntity1.forceUpdate();
        boolean boolean11 = executionEntity1.isProcessInstanceType();
        int int12 = executionEntity1.getCachedEntityState();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 7);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity15 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeEventSubscription(eventSubscriptionEntity15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 2);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = executionEntity1.getTransitionBeingTaken();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setEventName("hi!");
        boolean boolean20 = executionEntity17.isActive();
        executionEntity13.setSuperExecution(executionEntity17);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl22 = null;
        executionEntity17.setTransition(transitionImpl22);
        java.lang.String str24 = executionEntity17.getEventName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl25);
        executionEntity26.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl29 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl29);
        executionEntity30.setEventName("hi!");
        boolean boolean33 = executionEntity30.isActive();
        executionEntity26.setSuperExecution(executionEntity30);
        executionEntity30.setId("");
        executionEntity30.setEventScope(false);
        org.activiti.engine.EngineServices engineServices39 = executionEntity30.getEngineServices();
        executionEntity17.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity30);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean42 = executionEntity41.isSuspended();
        java.lang.String str43 = executionEntity41.getEventName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = executionEntity1.setVariableLocal("", (java.lang.Object) executionEntity17, executionEntity41);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(transitionImpl10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(engineServices39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity5.setTransition(transitionImpl10);
        java.lang.String str12 = executionEntity5.getEventName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setEventName("hi!");
        boolean boolean21 = executionEntity18.isActive();
        executionEntity14.setSuperExecution(executionEntity18);
        executionEntity18.setId("");
        executionEntity18.setEventScope(false);
        org.activiti.engine.EngineServices engineServices27 = executionEntity18.getEngineServices();
        executionEntity5.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        executionEntity18.setParentId("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity18.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = executionEntity18.getVariableLocal("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(engineServices27);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = executionEntity1.getEventSource();
        boolean boolean14 = executionEntity1.isActive();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = executionEntity1.getQueryVariables();
        java.lang.String str16 = executionEntity1.getId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList17 = executionEntity1.getTasks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(pvmProcessElement13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = executionEntity1.getEventSource();
        boolean boolean14 = executionEntity1.isActive();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.end();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(pvmProcessElement13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        executionEntity1.setTenantId("");
        java.lang.String str7 = executionEntity1.getParentId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl12 = executionEntity11.getProcessDefinition();
        executionEntity7.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        java.lang.String str14 = executionEntity7.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        java.lang.String str17 = executionEntity16.getSuperExecutionId();
        executionEntity7.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement19 = executionEntity7.getEventSource();
        int int20 = executionEntity7.getRevisionNext();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior3);
        org.junit.Assert.assertNull(processDefinitionImpl12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(pvmProcessElement19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        boolean boolean14 = executionEntity5.isEnded();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = executionEntity5.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity5.getProcessInstance();
        org.activiti.engine.EngineServices engineServices17 = executionEntity5.getEngineServices();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.deleteVariablesInstanceForLeavingScope();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(variableInstanceEntityList15);
        org.junit.Assert.assertNull(executionEntity16);
        org.junit.Assert.assertNull(engineServices17);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        executionEntity1.setActive(true);
        executionEntity1.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity1.getSuperExecution();
        java.lang.String str10 = executionEntity1.getDeleteReason();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.remove();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(executionEntity9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        java.lang.Class<?> wildcardClass6 = executionEntity1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        int int5 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity1.getTransition();
        java.lang.String str7 = executionEntity1.getProcessDefinitionId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity1.getVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNull(transitionImpl6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl19 = executionEntity18.getProcessDefinition();
        executionEntity14.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        executionEntity18.setActive(false);
        executionEntity18.setScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl25);
        executionEntity26.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl29 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl29);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl31 = executionEntity30.getProcessDefinition();
        executionEntity26.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity30);
        executionEntity26.setDeleteReason("");
        java.lang.String str35 = executionEntity26.getBusinessKey();
        executionEntity18.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity26);
        executionEntity10.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity26);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity38 = executionEntity10.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            int int39 = executionEntity38.getSuspensionState();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(processDefinitionImpl19);
        org.junit.Assert.assertNull(processDefinitionImpl31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(executionEntity38);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity5.getProcessInstance();
        org.activiti.engine.impl.pvm.PvmTransition[] pvmTransitionArray15 = new org.activiti.engine.impl.pvm.PvmTransition[] {};
        java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition> pvmTransitionList16 = new java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList16, pvmTransitionArray15);
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList18 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.takeAll((java.util.List<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList16, activityExecutionList18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(executionEntity14);
        org.junit.Assert.assertNotNull(pvmTransitionArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getProcessDefinitionId();
        int int5 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement6 = null;
        executionEntity1.setEventSource(pvmProcessElement6);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity1.involveUser("hi!", "ProcessInstance[]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setEventName("hi!");
        boolean boolean14 = executionEntity11.isActive();
        executionEntity7.setSuperExecution(executionEntity11);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl16 = null;
        executionEntity11.setTransition(transitionImpl16);
        executionEntity11.setBusinessKey("hi!");
        java.lang.String str20 = executionEntity11.getSuperExecutionId();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl22 = null;
        executionEntity11.setTransitionBeingTaken(transitionImpl22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList24 = executionEntity11.getTasks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.runtime.InterpretableExecution interpretableExecution9 = null;
        executionEntity1.setParent(interpretableExecution9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList11 = executionEntity1.findActiveActivityIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        executionEntity5.setScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl18 = executionEntity17.getProcessDefinition();
        executionEntity13.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        executionEntity13.setDeleteReason("");
        java.lang.String str22 = executionEntity13.getBusinessKey();
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl24 = executionEntity5.getProcessDefinition();
        executionEntity5.setBusinessKey("");
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(processDefinitionImpl18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(processDefinitionImpl24);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getEventName();
        executionEntity1.setEventScope(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity1.getCompensateEventSubscriptions("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl2);
        executionEntity3.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl8 = executionEntity7.getProcessDefinition();
        executionEntity3.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        executionEntity7.setActive(false);
        executionEntity7.setScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        executionEntity15.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl20 = executionEntity19.getProcessDefinition();
        executionEntity15.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        executionEntity15.setDeleteReason("");
        java.lang.String str24 = executionEntity15.getBusinessKey();
        executionEntity7.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        java.lang.String str26 = executionEntity7.getTenantId();
        executionEntity7.setExecutionListenerIndex((java.lang.Integer) 2);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = executionEntity7.getSubProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl8);
        org.junit.Assert.assertNull(processDefinitionImpl20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(executionEntity29);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        executionEntity1.setActive(true);
        executionEntity1.setCachedEntityState(0);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity1.getCompensateEventSubscriptions();
        java.lang.Class<?> wildcardClass10 = compensateEventSubscriptionEntityList9.getClass();
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(compensateEventSubscriptionEntityList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getSuperExecutionId();
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str5 = executionEntity1.getCurrentActivityName();
        java.lang.String str6 = executionEntity1.getSuperExecutionId();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = executionEntity1.hasVariableLocal("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity5.getReplacedBy();
        executionEntity5.setRevision(1);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity17 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList18 = executionEntity5.findInactiveConcurrentExecutions(pvmActivity17);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl20);
        executionEntity21.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl24 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl24);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl26 = executionEntity25.getProcessDefinition();
        executionEntity21.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity25);
        java.lang.String str28 = executionEntity21.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl29 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl29);
        java.lang.String str31 = executionEntity30.getSuperExecutionId();
        executionEntity21.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity30);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        executionEntity34.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl37 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity38 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl37);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl39 = executionEntity38.getProcessDefinition();
        executionEntity34.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity38);
        executionEntity38.setActive(false);
        executionEntity38.setScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl45 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity46 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl45);
        executionEntity46.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl49 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity50 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl49);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl51 = executionEntity50.getProcessDefinition();
        executionEntity46.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity50);
        executionEntity46.setDeleteReason("");
        java.lang.String str55 = executionEntity46.getBusinessKey();
        executionEntity38.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity46);
        executionEntity30.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity46);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl58 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity59 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl58);
        executionEntity59.setEventName("hi!");
        int int62 = executionEntity59.getSuspensionState();
        executionEntity59.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl64 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity65 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl64);
        executionEntity65.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl68 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity69 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl68);
        executionEntity69.setEventName("hi!");
        boolean boolean72 = executionEntity69.isActive();
        executionEntity65.setSuperExecution(executionEntity69);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl74 = null;
        executionEntity69.setTransition(transitionImpl74);
        executionEntity69.setBusinessKey("hi!");
        java.lang.String str78 = executionEntity69.getSuperExecutionId();
        executionEntity59.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity69);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj80 = executionEntity5.setVariableLocal("ProcessInstance[null]", (java.lang.Object) executionEntity46, executionEntity59);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(executionEntity14);
        org.junit.Assert.assertNotNull(activityExecutionList18);
        org.junit.Assert.assertNull(processDefinitionImpl26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(processDefinitionImpl39);
        org.junit.Assert.assertNull(processDefinitionImpl51);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(str78);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = executionEntity9.getProcessDefinition();
        boolean boolean11 = executionEntity9.isActive();
        java.lang.String str12 = executionEntity9.getBusinessKey();
        java.lang.String str13 = executionEntity9.getDeleteReason();
        executionEntity9.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = executionEntity9.getActivity();
        java.lang.Object obj17 = executionEntity9.getPersistentState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl19);
        executionEntity20.setEventName("hi!");
        int int23 = executionEntity20.getSuspensionState();
        executionEntity20.inactivate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str26 = executionEntity25.getProcessInstanceId();
        boolean boolean27 = executionEntity25.isConcurrent();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = executionEntity25.getProcessVariables();
        executionEntity20.setVariablesLocal(strMap28);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl30 = executionEntity20.getActivity();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity9, "ScopeExecution[null]", (java.lang.Object) executionEntity20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior3);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        org.junit.Assert.assertNull(processDefinitionImpl10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(activityImpl16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(activityImpl30);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariableLocal("ScopeExecution[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity5.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity10.createExecution();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(executionEntity10);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        executionEntity1.disposeStartingExecution();
        boolean boolean8 = executionEntity1.isEventScope();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = executionEntity1.hasVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity1.getActivity();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl8);
        org.activiti.engine.impl.javax.el.ELContext eLContext10 = null;
        executionEntity1.setCachedElContext(eLContext10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList12 = executionEntity1.getEventSubscriptionsInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(activityImpl7);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.runtime.InterpretableExecution interpretableExecution9 = null;
        executionEntity1.setParent(interpretableExecution9);
        java.lang.String str11 = executionEntity1.getBusinessKey();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = executionEntity1.hasVariable("ProcessInstance[]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity5.setTransition(transitionImpl10);
        java.lang.String str12 = executionEntity5.getEventName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setEventName("hi!");
        boolean boolean21 = executionEntity18.isActive();
        executionEntity14.setSuperExecution(executionEntity18);
        executionEntity18.setId("");
        executionEntity18.setEventScope(false);
        org.activiti.engine.EngineServices engineServices27 = executionEntity18.getEngineServices();
        executionEntity5.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        executionEntity18.setParentId("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity18.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity31);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList33 = executionEntity31.getEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(engineServices27);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity5.getTransition();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setEventName("hi!");
        boolean boolean21 = executionEntity18.isActive();
        executionEntity14.setSuperExecution(executionEntity18);
        executionEntity18.setId("");
        executionEntity18.setExecutionListenerIndex((java.lang.Integer) 100);
        executionEntity18.setProcessDefinitionId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = null;
        executionEntity18.setSuperExecution(executionEntity29);
        int int31 = executionEntity18.getRevisionNext();
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity33 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.removeTask(taskEntity33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(transitionImpl12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getSuperExecutionId();
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str5 = executionEntity1.getCurrentActivityName();
        executionEntity1.inactivate();
        int int7 = executionEntity1.getSuspensionState();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.remove();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        boolean boolean4 = executionEntity1.isActive();
        boolean boolean5 = executionEntity1.isSuspended();
        java.lang.String str6 = executionEntity1.getParentId();
        boolean boolean7 = executionEntity1.isEventScope();
        java.lang.Object obj8 = executionEntity1.getPersistentState();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariableLocal("ProcessInstance[]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        executionEntity1.setTenantId("");
        boolean boolean7 = executionEntity1.isScope();
        int int8 = executionEntity1.getRevisionNext();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 7);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariable("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        boolean boolean14 = executionEntity5.isEnded();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = executionEntity5.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity5.getProcessInstance();
        org.activiti.engine.EngineServices engineServices17 = executionEntity5.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str19 = executionEntity18.getProcessInstanceId();
        executionEntity5.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        org.activiti.engine.EngineServices engineServices21 = executionEntity5.getEngineServices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = executionEntity5.hasVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(variableInstanceEntityList15);
        org.junit.Assert.assertNull(executionEntity16);
        org.junit.Assert.assertNull(engineServices17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(engineServices21);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getDeleteReason();
        executionEntity1.setDeleteReason("");
        executionEntity1.setEventScope(false);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl13 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setProcessDefinition(processDefinitionImpl13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getReplacedBy();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.executeActivity(pvmActivity6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(executionEntity5);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getCurrentActivityId();
        int int5 = executionEntity1.getRevisionNext();
        executionEntity1.setCachedEntityState(0);
        java.lang.String str8 = executionEntity1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = executionEntity1.getVariableLocal("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ProcessInstance[null]" + "'", str8, "ProcessInstance[null]");
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getSuperExecutionId();
        executionEntity1.setDeleteReason("hi!");
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity5 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addTask(taskEntity5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        int int4 = executionEntity1.getSuspensionState();
        executionEntity1.inactivate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str7 = executionEntity6.getProcessInstanceId();
        boolean boolean8 = executionEntity6.isConcurrent();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity6.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap9);
        java.lang.String str11 = executionEntity1.getTenantId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        executionEntity5.setProcessDefinitionId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = null;
        executionEntity5.setSuperExecution(executionEntity16);
        int int18 = executionEntity5.getRevisionNext();
        java.lang.String str19 = executionEntity5.getParentId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList20 = executionEntity5.getTasks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        org.activiti.engine.impl.javax.el.ELContext eLContext14 = null;
        executionEntity5.setCachedElContext(eLContext14);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setEventName("hi!");
        int int20 = executionEntity17.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = null;
        executionEntity17.setCachedElContext(eLContext21);
        int int23 = executionEntity17.getSuspensionState();
        executionEntity5.setSuperExecution(executionEntity17);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement25 = executionEntity5.getEventSource();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList26 = executionEntity5.getCompensateEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(pvmProcessElement25);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity5.setTransition(transitionImpl10);
        java.lang.String str12 = executionEntity5.getEventName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setEventName("hi!");
        boolean boolean21 = executionEntity18.isActive();
        executionEntity14.setSuperExecution(executionEntity18);
        executionEntity18.setId("");
        executionEntity18.setEventScope(false);
        org.activiti.engine.EngineServices engineServices27 = executionEntity18.getEngineServices();
        executionEntity5.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        int int29 = executionEntity5.getSuspensionState();
        java.lang.String str30 = executionEntity5.getEventName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap31 = executionEntity5.getVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(engineServices27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.toString();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl2);
        executionEntity3.setEventName("hi!");
        int int6 = executionEntity3.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = null;
        executionEntity3.setCachedElContext(eLContext7);
        int int9 = executionEntity3.getSuspensionState();
        java.lang.String str10 = executionEntity3.getParentId();
        java.lang.String str11 = executionEntity3.getProcessInstanceId();
        executionEntity3.forceUpdate();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        java.lang.String str14 = executionEntity3.getActivityId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution15 = executionEntity3.getStartingExecution();
        executionEntity3.inactivate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet17 = executionEntity3.getVariableNames();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ProcessInstance[null]" + "'", str1, "ProcessInstance[null]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(startingExecution15);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        executionEntity5.setScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl18 = executionEntity17.getProcessDefinition();
        executionEntity13.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        executionEntity13.setDeleteReason("");
        java.lang.String str22 = executionEntity13.getBusinessKey();
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = executionEntity13.getProcessInstance();
        java.lang.String[] strArray26 = new java.lang.String[] { "ProcessInstance[null]" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity13.removeVariables((java.util.Collection<java.lang.String>) strList27);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(processDefinitionImpl18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(executionEntity24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity5.setTransition(transitionImpl10);
        java.lang.String str12 = executionEntity5.getEventName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setEventName("hi!");
        boolean boolean21 = executionEntity18.isActive();
        executionEntity14.setSuperExecution(executionEntity18);
        executionEntity18.setId("");
        executionEntity18.setEventScope(false);
        org.activiti.engine.EngineServices engineServices27 = executionEntity18.getEngineServices();
        executionEntity5.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = executionEntity18.getVariableLocal("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(engineServices27);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity5.getReplacedBy();
        executionEntity5.setRevision(1);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity17 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList18 = executionEntity5.findInactiveConcurrentExecutions(pvmActivity17);
        java.lang.String str19 = executionEntity5.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity20 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.addTask(taskEntity20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(executionEntity14);
        org.junit.Assert.assertNotNull(activityExecutionList18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setActive(false);
        executionEntity5.setConcurrent(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = executionEntity5.getActivity();
        java.lang.Class<?> wildcardClass13 = executionEntity5.getClass();
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(activityImpl12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.getProcessDefinition();
        boolean boolean3 = executionEntity1.isActive();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        executionEntity1.setTenantId("");
        boolean boolean7 = executionEntity1.isActive();
        org.activiti.engine.impl.pvm.PvmProcessDefinition pvmProcessDefinition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.PvmProcessInstance pvmProcessInstance9 = executionEntity1.createSubProcessInstance(pvmProcessDefinition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setEventScope(false);
        org.activiti.engine.EngineServices engineServices14 = executionEntity5.getEngineServices();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.removeIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(engineServices14);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setEventScope(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        executionEntity15.setEventName("hi!");
        int int18 = executionEntity15.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext19 = null;
        executionEntity15.setCachedElContext(eLContext19);
        int int21 = executionEntity15.getSuspensionState();
        java.lang.String str22 = executionEntity15.getParentId();
        java.lang.String str23 = executionEntity15.getProcessInstanceId();
        executionEntity15.forceUpdate();
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl26 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl26);
        executionEntity27.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl30 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl30);
        executionEntity31.setEventName("hi!");
        boolean boolean34 = executionEntity31.isActive();
        executionEntity27.setSuperExecution(executionEntity31);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl36 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity37 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl36);
        executionEntity37.setEventName("hi!");
        int int40 = executionEntity37.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext41 = null;
        executionEntity37.setCachedElContext(eLContext41);
        int int43 = executionEntity37.getSuspensionState();
        executionEntity31.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity37);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl45 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity46 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl45);
        executionEntity46.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl49 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity50 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl49);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl51 = executionEntity50.getProcessDefinition();
        executionEntity46.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity50);
        executionEntity50.setActive(false);
        executionEntity50.setScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl57 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity58 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl57);
        executionEntity58.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl61 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity62 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl61);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl63 = executionEntity62.getProcessDefinition();
        executionEntity58.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity62);
        executionEntity58.setDeleteReason("");
        java.lang.String str67 = executionEntity58.getBusinessKey();
        executionEntity50.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity58);
        java.lang.String str69 = executionEntity50.getDeleteReason();
        executionEntity37.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity50);
        boolean boolean71 = executionEntity37.isActive();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl72 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity73 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl72);
        executionEntity73.setEventName("hi!");
        java.lang.String str76 = executionEntity73.getCurrentActivityId();
        int int77 = executionEntity73.getRevisionNext();
        java.lang.String str78 = executionEntity73.getCurrentActivityName();
        executionEntity37.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity73);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNull(processDefinitionImpl51);
        org.junit.Assert.assertNull(processDefinitionImpl63);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
        org.junit.Assert.assertNull(str78);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        executionEntity1.setRevision((int) '4');
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = executionEntity6.getActivityId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity6);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity1.setDeleteReason("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity10 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList11 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity10);
        int int12 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity13 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList14 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity13);
        executionEntity1.setSuspensionState(2);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.insert();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNotNull(activityExecutionList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(activityExecutionList14);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        executionEntity5.setId("");
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 100);
        executionEntity5.setProcessDefinitionId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = null;
        executionEntity5.setSuperExecution(executionEntity16);
        int int18 = executionEntity5.getRevisionNext();
        java.lang.String str19 = executionEntity5.getParentId();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity22 = executionEntity5.involveUser("ScopeExecution[null]", "ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity5.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getSuperExecutionId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.EngineServices engineServices13 = executionEntity1.getEngineServices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList14 = executionEntity1.findActiveActivityIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(engineServices13);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setEventName("hi!");
        int int14 = executionEntity11.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext15 = null;
        executionEntity11.setCachedElContext(eLContext15);
        int int17 = executionEntity11.getSuspensionState();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl19);
        executionEntity20.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl25 = executionEntity24.getProcessDefinition();
        executionEntity20.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        executionEntity24.setActive(false);
        executionEntity24.setScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl31 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl31);
        executionEntity32.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl35 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl35);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl37 = executionEntity36.getProcessDefinition();
        executionEntity32.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity36);
        executionEntity32.setDeleteReason("");
        java.lang.String str41 = executionEntity32.getBusinessKey();
        executionEntity24.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity32);
        java.lang.String str43 = executionEntity24.getDeleteReason();
        executionEntity11.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        boolean boolean45 = executionEntity11.isActive();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity46 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity11.removeJob(jobEntity46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(processDefinitionImpl25);
        org.junit.Assert.assertNull(processDefinitionImpl37);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setEventName("hi!");
        boolean boolean8 = executionEntity5.isActive();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity5.setTransition(transitionImpl10);
        java.lang.String str12 = executionEntity5.getEventName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setEventName("hi!");
        boolean boolean21 = executionEntity18.isActive();
        executionEntity14.setSuperExecution(executionEntity18);
        executionEntity18.setId("");
        executionEntity18.setEventScope(false);
        org.activiti.engine.EngineServices engineServices27 = executionEntity18.getEngineServices();
        executionEntity5.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        executionEntity18.setParentId("ProcessInstance[null]");
        boolean boolean31 = executionEntity18.isProcessInstanceType();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity18.insert();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(engineServices27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setEventName("hi!");
        java.lang.String str4 = executionEntity1.getProcessDefinitionId();
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity1.getTransitionBeingTaken();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity9 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addTask(taskEntity9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(startingExecution7);
        org.junit.Assert.assertNull(transitionImpl8);
    }
}

