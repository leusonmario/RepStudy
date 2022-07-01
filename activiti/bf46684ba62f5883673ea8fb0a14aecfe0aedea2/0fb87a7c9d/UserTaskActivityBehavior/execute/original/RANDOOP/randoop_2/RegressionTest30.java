import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest30 {

    public static boolean debug = false;

    @Test
    public void test15001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15001");
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
        boolean boolean16 = executionEntity1.isProcessInstanceType();
        executionEntity1.setProcessDefinitionId("");
        org.activiti.engine.impl.javax.el.ELContext eLContext19 = null;
        executionEntity1.setCachedElContext(eLContext19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = executionEntity1.updateProcessBusinessKey("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertNull(transitionImpl14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test15002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15002");
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
        executionEntity1.forceUpdate();
        boolean boolean31 = executionEntity1.isDeleteRoot();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = executionEntity1.hasVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test15003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15003");
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
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = null;
        executionEntity1.setEventSource(pvmProcessElement13);
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = executionEntity1.setVariableLocal("ProcessInstance[]", obj16);
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
    public void test15004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15004");
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
        executionEntity1.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = null;
        executionEntity1.setTransition(transitionImpl19);
        java.lang.String str21 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl22 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl22);
        executionEntity23.setDeleteReason("hi!");
        executionEntity23.setEventName("ProcessInstance[null]");
        executionEntity23.setEventName("ScopeExecution[null]");
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList31 = executionEntity1.getEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test15005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15005");
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
        java.lang.String str13 = executionEntity1.getTenantId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution14 = executionEntity1.getStartingExecution();
        executionEntity1.setId("hi!");
        executionEntity1.setDeleteReason("hi!");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList19 = executionEntity1.getQueryVariables();
        boolean boolean20 = executionEntity1.isDeleteRoot();
        executionEntity1.setActive(false);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(activityImpl12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(startingExecution14);
        org.junit.Assert.assertNotNull(variableInstanceEntityList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test15006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15006");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setDeleteReason("hi!");
        executionEntity7.setSuspensionState((int) (byte) 10);
        java.lang.String str12 = executionEntity7.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity13.getProcessVariables();
        executionEntity1.createVariablesLocal(strMap15);
        boolean boolean17 = executionEntity1.isActive();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity19.getSuperExecution();
        executionEntity19.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl22 = null;
        executionEntity19.setTransitionBeingTaken(transitionImpl22);
        java.lang.String str24 = executionEntity19.getProcessInstanceId();
        executionEntity19.setParentId("hi!");
        executionEntity19.forceUpdate();
        java.lang.String str28 = executionEntity19.getSuperExecutionId();
        boolean boolean29 = executionEntity19.isEnded();
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = executionEntity19.getProcessVariables();
        executionEntity1.createVariablesLocal(strMap30);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteVariablesInstanceForLeavingScope();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(executionEntity20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strMap30);
    }

    @Test
    public void test15007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15007");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        boolean boolean7 = executionEntity1.isActive();
        java.lang.Object obj8 = executionEntity1.getPersistentState();
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
        executionEntity10.forceUpdate();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement22 = executionEntity10.getEventSource();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList23 = executionEntity10.getQueryVariables();
        executionEntity1.setQueryVariables(variableInstanceEntityList23);
        java.lang.String str25 = executionEntity1.getSuperExecutionId();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 4);
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertNotNull(variableInstanceEntityArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(executionEntity19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(pvmProcessElement22);
        org.junit.Assert.assertNotNull(variableInstanceEntityList23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test15008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15008");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getProcessInstance();
        java.lang.String str3 = executionEntity1.getCurrentActivityId();
        int int4 = executionEntity1.getCachedEntityState();
        java.lang.String str5 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.executeActivity(pvmActivity6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test15009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15009");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        int int4 = executionEntity1.getRevisionNext();
        executionEntity1.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity7 = null;
        executionEntity1.removeTask(taskEntity7);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity9 = null;
        executionEntity1.removeJob(jobEntity9);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity1.getEventSubscriptions();
        int int12 = executionEntity1.getCachedEntityState();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity14 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList15 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity14);
        executionEntity1.setParentId("ProcessInstance[null]");
        org.activiti.engine.EngineServices engineServices18 = executionEntity1.getEngineServices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList19 = executionEntity1.getExecutions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(eventSubscriptionEntityList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(activityExecutionList15);
        org.junit.Assert.assertNull(engineServices18);
    }

    @Test
    public void test15010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15010");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        java.lang.String str8 = executionEntity1.getParentId();
        executionEntity1.setSuspensionState((int) (byte) -1);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity11 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList12 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity11);
        org.activiti.engine.EngineServices engineServices13 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        executionEntity16.setDeleteReason("hi!");
        executionEntity16.setSuspensionState((int) (byte) 10);
        java.lang.String str21 = executionEntity16.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity16.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity22);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = executionEntity16.getProcessVariables();
        boolean boolean25 = executionEntity16.isActive();
        executionEntity16.setDeleteReason("hi!");
        boolean boolean28 = executionEntity16.isProcessInstanceType();
        java.lang.String str29 = executionEntity16.getEventName();
        int int30 = executionEntity16.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl31 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl31);
        executionEntity32.setDeleteReason("hi!");
        executionEntity32.setSuspensionState((int) (byte) 10);
        java.lang.String str37 = executionEntity32.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity38 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity32.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity38);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl40 = executionEntity38.getTransition();
        java.lang.String str41 = executionEntity38.getDeleteReason();
        boolean boolean42 = executionEntity38.isEnded();
        executionEntity38.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl44 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity45 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl44);
        executionEntity45.setRevision(100);
        executionEntity45.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity50 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList51 = executionEntity45.findInactiveConcurrentExecutions(pvmActivity50);
        int int52 = executionEntity45.getSuspensionState();
        executionEntity45.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity55 = executionEntity45.getProcessInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap56 = executionEntity45.getProcessVariables();
        executionEntity38.createVariablesLocal(strMap56);
        executionEntity38.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl60 = executionEntity38.getProcessDefinition();
        java.util.Map<java.lang.String, java.lang.Object> strMap61 = executionEntity38.getProcessVariables();
        executionEntity16.createVariablesLocal(strMap61);
        boolean boolean63 = executionEntity16.isDeleteRoot();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl64 = executionEntity16.getTransition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj65 = executionEntity1.setVariableLocal("ConcurrentScopeExecution[null]", (java.lang.Object) transitionImpl64);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(activityExecutionList12);
        org.junit.Assert.assertNull(engineServices13);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(transitionImpl40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(activityExecutionList51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNull(executionEntity55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNull(processDefinitionImpl60);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(transitionImpl64);
    }

    @Test
    public void test15011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15011");
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
        java.lang.String str14 = executionEntity1.getBusinessKey();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15012");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = null;
        executionEntity1.setCachedElContext(eLContext3);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        executionEntity1.disposeStartingExecution();
        executionEntity1.setActive(false);
        executionEntity1.setId("ProcessInstance[]");
        boolean boolean12 = executionEntity1.isDeleteRoot();
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15013");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        java.lang.String str6 = executionEntity1.getEventName();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setRevision(100);
        java.lang.String str12 = executionEntity9.getId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = null;
        executionEntity9.setTransition(transitionImpl13);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        int int16 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext17 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setDeleteReason("hi!");
        executionEntity19.setSuspensionState((int) (byte) 10);
        java.lang.String str24 = executionEntity19.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity19.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity25);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl27 = executionEntity25.getTransition();
        java.lang.String str28 = executionEntity25.getDeleteReason();
        int int29 = executionEntity25.getSuspensionState();
        int int30 = executionEntity25.getSuspensionState();
        java.lang.String str31 = executionEntity25.getCurrentActivityName();
        executionEntity25.setActive(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl34 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl34);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = executionEntity35.getSuperExecution();
        executionEntity35.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl38 = null;
        executionEntity35.setTransitionBeingTaken(transitionImpl38);
        java.lang.String str40 = executionEntity35.getProcessInstanceId();
        executionEntity35.setParentId("hi!");
        executionEntity35.forceUpdate();
        java.lang.String str44 = executionEntity35.getSuperExecutionId();
        boolean boolean45 = executionEntity35.isEnded();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl46 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity47 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl46);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity48 = executionEntity47.getSuperExecution();
        executionEntity47.setParentId("hi!");
        java.lang.String str51 = executionEntity47.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl52 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity53 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl52);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity54 = executionEntity53.getSuperExecution();
        executionEntity53.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl56 = null;
        executionEntity53.setTransitionBeingTaken(transitionImpl56);
        java.lang.String str58 = executionEntity53.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl59 = null;
        executionEntity53.setTransitionBeingTaken(transitionImpl59);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl61 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity62 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl61);
        executionEntity62.setDeleteReason("hi!");
        executionEntity62.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray67 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList68 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList68, variableInstanceEntityArray67);
        executionEntity62.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList68);
        executionEntity53.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList68);
        executionEntity47.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList68);
        executionEntity35.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList68);
        executionEntity25.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList68);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList68);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(eLContext17);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(transitionImpl27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(executionEntity36);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(executionEntity48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(executionEntity54);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test15014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15014");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        executionEntity1.setScope(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity1.getQueryVariables();
        boolean boolean8 = executionEntity1.isScope();
        java.lang.String str9 = executionEntity1.toString();
        java.lang.String str10 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution11 = executionEntity1.getStartingExecution();
        java.lang.Object obj12 = executionEntity1.getPersistentState();
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertNull(variableInstanceEntityList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ProcessInstance[null]" + "'", str9, "ProcessInstance[null]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(startingExecution11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
    }

    @Test
    public void test15015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15015");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        executionEntity1.forceUpdate();
        java.lang.String str10 = executionEntity1.getSuperExecutionId();
        int int11 = executionEntity1.getCachedEntityState();
        java.lang.String str12 = executionEntity1.toString();
        executionEntity1.disposeStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = executionEntity1.getActivity();
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ScopeExecution[null]" + "'", str12, "ScopeExecution[null]");
        org.junit.Assert.assertNull(activityImpl14);
    }

    @Test
    public void test15016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15016");
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
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity1.getTransitionBeingTaken();
        java.lang.String str16 = executionEntity1.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity18.getSuperExecution();
        java.lang.String str20 = executionEntity18.getDeleteReason();
        java.lang.String str21 = executionEntity18.toString();
        executionEntity18.disposeStartingExecution();
        executionEntity1.setSuperExecution(executionEntity18);
        java.lang.String[] strArray25 = new java.lang.String[] { "ProcessInstance[ProcessInstance[null]]" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal((java.util.Collection<java.lang.String>) strList26);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(transitionImpl15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(executionEntity19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ProcessInstance[null]" + "'", str21, "ProcessInstance[null]");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test15017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15017");
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
        java.lang.Object obj11 = executionEntity1.getPersistentState();
        java.lang.String str12 = executionEntity1.getProcessDefinitionId();
        boolean boolean13 = executionEntity1.isScope();
        int int14 = executionEntity1.getRevisionNext();
        java.lang.String str15 = executionEntity1.getBusinessKey();
        java.lang.String str16 = executionEntity1.getBusinessKey();
        int int17 = executionEntity1.getSuspensionState();
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=true, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=true, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=true, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test15018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15018");
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
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.forceUpdate();
        java.lang.String str23 = executionEntity1.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl24 = null;
        executionEntity1.setTransition(transitionImpl24);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteCascade("ProcessInstance[]");
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(activityExecutionList17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test15019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15019");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        boolean boolean10 = executionEntity1.isActive();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = null;
        executionEntity1.setEventSource(pvmProcessElement11);
        executionEntity1.setConcurrent(true);
        java.lang.String str15 = executionEntity1.getTenantId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setDeleteReason("hi!");
        executionEntity17.setSuspensionState((int) (byte) 10);
        java.lang.String str22 = executionEntity17.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity23);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = executionEntity17.getProcessVariables();
        int int26 = executionEntity17.getRevisionNext();
        boolean boolean27 = executionEntity17.isEnded();
        java.lang.String str28 = executionEntity17.getId();
        java.lang.String str29 = executionEntity17.getParentId();
        org.activiti.engine.EngineServices engineServices30 = executionEntity17.getEngineServices();
        executionEntity17.setRevision((int) '4');
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        executionEntity34.setDeleteReason("hi!");
        executionEntity34.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray39 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList40 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList40, variableInstanceEntityArray39);
        executionEntity34.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList40);
        executionEntity34.setRevision((int) (short) 0);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl45 = executionEntity34.getActivity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl46 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity47 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl46);
        executionEntity47.setRevision(100);
        executionEntity47.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl52 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity53 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl52);
        executionEntity53.setDeleteReason("hi!");
        java.lang.String str56 = executionEntity53.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement57 = null;
        executionEntity53.setEventSource(pvmProcessElement57);
        java.lang.Object obj59 = executionEntity53.getPersistentState();
        java.lang.String str60 = executionEntity53.getId();
        java.util.Map<java.lang.String, java.lang.Object> strMap61 = executionEntity53.getProcessVariables();
        executionEntity47.setVariablesLocal(strMap61);
        executionEntity34.setVariables(strMap61);
        executionEntity17.setVariables(strMap61);
        executionEntity1.createVariablesLocal(strMap61);
        executionEntity1.setEventScope(false);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement68 = null;
        executionEntity1.setEventSource(pvmProcessElement68);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(engineServices30);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(activityImpl45);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertEquals(obj59.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj59), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj59), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(strMap61);
    }

    @Test
    public void test15020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15020");
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
        java.lang.String str13 = executionEntity1.getDeleteReason();
        executionEntity1.setRevision((int) (byte) 0);
        executionEntity1.setBusinessKey("ProcessInstance[]");
        org.activiti.engine.impl.javax.el.ELContext eLContext18 = null;
        executionEntity1.setCachedElContext(eLContext18);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test15021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15021");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity1.getSuperExecution();
        int int10 = executionEntity1.getRevision();
        executionEntity1.setRevision(1);
        org.activiti.engine.impl.javax.el.ELContext eLContext13 = executionEntity1.getCachedElContext();
        java.lang.String str14 = executionEntity1.getParentId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList15 = executionEntity1.getTasks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(executionEntity9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(eLContext13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test15022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15022");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        int int10 = executionEntity1.getRevisionNext();
        java.lang.String str11 = executionEntity1.getParentId();
        java.lang.String str12 = executionEntity1.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity1.getSubProcessInstance();
        int int14 = executionEntity1.getCachedEntityState();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList15 = executionEntity1.getCompensateEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ProcessInstance[null]" + "'", str12, "ProcessInstance[null]");
        org.junit.Assert.assertNotNull(executionEntity13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test15023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15023");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        java.lang.String str8 = executionEntity1.getParentId();
        executionEntity1.setSuspensionState((int) (byte) -1);
        executionEntity1.setCachedEntityState(1);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setActive(false);
        executionEntity14.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setDeleteReason("hi!");
        java.lang.String str22 = executionEntity19.getEventName();
        executionEntity14.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        executionEntity14.inactivate();
        executionEntity14.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl26 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl26);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = executionEntity27.getSuperExecution();
        executionEntity27.inactivate();
        java.lang.String str30 = executionEntity27.getBusinessKey();
        executionEntity27.setBusinessKey("");
        org.activiti.engine.impl.javax.el.ELContext eLContext33 = executionEntity27.getCachedElContext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl34 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl34);
        executionEntity35.setRevision(100);
        int int38 = executionEntity35.getRevisionNext();
        executionEntity35.setCachedEntityState((int) (short) 0);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList41 = executionEntity35.getEventSubscriptions();
        executionEntity27.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity35);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl43 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity44 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl43);
        executionEntity44.setRevision(100);
        executionEntity44.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity49 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList50 = executionEntity44.findInactiveConcurrentExecutions(pvmActivity49);
        int int51 = executionEntity44.getSuspensionState();
        executionEntity44.setActive(true);
        executionEntity44.setScope(true);
        java.lang.String str56 = executionEntity44.getSuperExecutionId();
        java.lang.String str57 = executionEntity44.getId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl58 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity59 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl58);
        executionEntity59.setDeleteReason("hi!");
        java.lang.String str62 = executionEntity59.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement63 = null;
        executionEntity59.setEventSource(pvmProcessElement63);
        executionEntity59.forceUpdate();
        executionEntity59.setEventScope(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap68 = executionEntity59.getProcessVariables();
        executionEntity44.createVariablesLocal(strMap68);
        executionEntity35.setVariables(strMap68);
        executionEntity14.createVariablesLocal(strMap68);
        executionEntity1.setVariablesLocal(strMap68);
        boolean boolean73 = executionEntity1.isEnded();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl74 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl74);
        java.lang.Object obj77 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setVariable("ProcessInstance[null]", obj77);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(executionEntity28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(eLContext33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 101 + "'", int38 == 101);
        org.junit.Assert.assertNotNull(eventSubscriptionEntityList41);
        org.junit.Assert.assertNotNull(activityExecutionList50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test15024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15024");
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
        java.lang.String str14 = executionEntity1.getProcessDefinitionId();
        executionEntity1.setCachedEntityState((int) (short) 100);
        java.lang.String str17 = executionEntity1.getCurrentActivityId();
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(executionEntity13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15025");
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
        executionEntity1.setRevision(2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList17 = executionEntity1.getEventSubscriptions();
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
    public void test15026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15026");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity1.getTransitionBeingTaken();
        java.lang.String str9 = executionEntity1.getActivityId();
        java.lang.String str10 = executionEntity1.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution11 = executionEntity1.getStartingExecution();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 11);
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(transitionImpl8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(startingExecution11);
    }

    @Test
    public void test15027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15027");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getProcessInstanceId();
        java.lang.String str3 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = null;
        executionEntity1.setEventSource(pvmProcessElement4);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setDeleteReason("hi!");
        executionEntity7.setSuspensionState((int) (byte) 10);
        java.lang.String str12 = executionEntity7.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity13.getTransition();
        java.lang.String str16 = executionEntity13.getDeleteReason();
        boolean boolean17 = executionEntity13.isEnded();
        executionEntity13.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl19);
        executionEntity20.setRevision(100);
        executionEntity20.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity25 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList26 = executionEntity20.findInactiveConcurrentExecutions(pvmActivity25);
        int int27 = executionEntity20.getSuspensionState();
        executionEntity20.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = executionEntity20.getProcessInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = executionEntity20.getProcessVariables();
        executionEntity13.createVariablesLocal(strMap31);
        executionEntity13.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl35 = executionEntity13.getProcessDefinition();
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = executionEntity13.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap36);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(transitionImpl15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(activityExecutionList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(executionEntity30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNull(processDefinitionImpl35);
        org.junit.Assert.assertNotNull(strMap36);
    }

    @Test
    public void test15028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15028");
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
        java.lang.String str15 = executionEntity1.getId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setRevision(100);
        executionEntity17.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity22 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList23 = executionEntity17.findInactiveConcurrentExecutions(pvmActivity22);
        java.lang.String str24 = executionEntity17.getParentId();
        executionEntity17.setSuspensionState((int) (byte) -1);
        java.lang.String str27 = executionEntity17.getSuperExecutionId();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = executionEntity17.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap28);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl30 = executionEntity1.getProcessDefinition();
        boolean boolean31 = executionEntity1.isProcessInstanceType();
        executionEntity1.setActive(false);
        executionEntity1.setCachedEntityState(36);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteCascade("ProcessInstance[ProcessInstance[null]]");
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(activityExecutionList23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(processDefinitionImpl30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test15029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15029");
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
        int int12 = executionEntity1.getRevision();
        executionEntity1.setBusinessKey("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity15 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList16 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity15);
        org.activiti.engine.impl.javax.el.ELContext eLContext17 = executionEntity1.getCachedElContext();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(activityExecutionList16);
        org.junit.Assert.assertNull(eLContext17);
    }

    @Test
    public void test15030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15030");
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
        executionEntity1.forceUpdate();
        java.lang.String str15 = executionEntity1.getCurrentActivityId();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 2);
        java.lang.String str18 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl19);
        executionEntity20.setDeleteReason("hi!");
        java.lang.String str23 = executionEntity20.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement24 = null;
        executionEntity20.setEventSource(pvmProcessElement24);
        java.lang.Object obj26 = executionEntity20.getPersistentState();
        java.lang.String str27 = executionEntity20.getId();
        java.lang.String str28 = executionEntity20.getEventName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl29 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl29);
        executionEntity30.setDeleteReason("hi!");
        java.lang.String str33 = executionEntity30.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement34 = null;
        executionEntity30.setEventSource(pvmProcessElement34);
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = executionEntity30.getProcessVariables();
        executionEntity20.setVariables(strMap36);
        executionEntity1.setVariablesLocal(strMap36);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = executionEntity1.findExecution("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(strMap36);
    }

    @Test
    public void test15031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15031");
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
        executionEntity10.setEventName("ProcessInstance[null]");
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        executionEntity1.setSuspensionState((int) '4');
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList18 = executionEntity1.getQueryVariables();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = executionEntity1.hasVariable("ConcurrentScopeExecution[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(startingExecution8);
        org.junit.Assert.assertNull(variableInstanceEntityList18);
    }

    @Test
    public void test15032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15032");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        int int4 = executionEntity1.getRevisionNext();
        executionEntity1.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity7 = null;
        executionEntity1.removeTask(taskEntity7);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity9 = null;
        executionEntity1.removeJob(jobEntity9);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity1.getEventSubscriptions();
        int int12 = executionEntity1.getCachedEntityState();
        java.lang.String str13 = executionEntity1.getBusinessKey();
        executionEntity1.setEventName("");
        java.lang.String str16 = executionEntity1.getActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setDeleteReason("hi!");
        executionEntity18.setSuspensionState((int) (byte) 10);
        java.lang.String str23 = executionEntity18.getCurrentActivityName();
        executionEntity18.setTenantId("");
        java.lang.Object obj26 = executionEntity18.getPersistentState();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement27 = executionEntity18.getEventSource();
        executionEntity18.disposeStartingExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext29 = null;
        executionEntity18.setCachedElContext(eLContext29);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl31 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl31);
        executionEntity32.setRevision(100);
        int int35 = executionEntity32.getRevisionNext();
        executionEntity32.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity38 = null;
        executionEntity32.removeTask(taskEntity38);
        java.lang.String str40 = executionEntity32.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl41 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl41);
        executionEntity42.setRevision(100);
        int int45 = executionEntity42.getRevisionNext();
        executionEntity42.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity48 = null;
        executionEntity42.removeTask(taskEntity48);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity50 = null;
        executionEntity42.removeJob(jobEntity50);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList52 = executionEntity42.getEventSubscriptions();
        executionEntity32.setSuperExecution(executionEntity42);
        java.lang.String str54 = executionEntity42.getCurrentActivityName();
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList55 = executionEntity42.getTasks();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl56 = null;
        executionEntity42.setActivity(activityImpl56);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl58 = executionEntity42.getTransition();
        java.util.Map<java.lang.String, java.lang.Object> strMap59 = executionEntity42.getProcessVariables();
        executionEntity18.createVariablesLocal(strMap59);
        executionEntity1.setVariables(strMap59);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(eventSubscriptionEntityList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(pvmProcessElement27);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 101 + "'", int45 == 101);
        org.junit.Assert.assertNotNull(eventSubscriptionEntityList52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(taskEntityList55);
        org.junit.Assert.assertNull(transitionImpl58);
        org.junit.Assert.assertNotNull(strMap59);
    }

    @Test
    public void test15033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15033");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        int int4 = executionEntity1.getRevisionNext();
        executionEntity1.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity7 = null;
        executionEntity1.removeTask(taskEntity7);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity9 = null;
        executionEntity1.removeJob(jobEntity9);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity1.getEventSubscriptions();
        int int12 = executionEntity1.getCachedEntityState();
        executionEntity1.setProcessDefinitionId("");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList15 = executionEntity1.getEventSubscriptionsInternal();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList16 = executionEntity1.getCompensateEventSubscriptions();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(eventSubscriptionEntityList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(eventSubscriptionEntityList15);
        org.junit.Assert.assertNotNull(compensateEventSubscriptionEntityList16);
    }

    @Test
    public void test15034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15034");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getProcessInstance();
        org.activiti.engine.impl.javax.el.ELContext eLContext4 = null;
        executionEntity1.setCachedElContext(eLContext4);
        java.lang.String str6 = executionEntity1.getId();
        executionEntity1.setTenantId("ProcessInstance[hi!]");
        executionEntity1.setEventScope(false);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = null;
        executionEntity1.setEventSource(pvmProcessElement11);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        executionEntity15.setRevision(100);
        executionEntity15.setBusinessKey("");
        java.lang.String str20 = executionEntity15.getParentId();
        boolean boolean21 = executionEntity15.isScope();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl22 = null;
        executionEntity15.setTransition(transitionImpl22);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = executionEntity15.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.signal("ScopeExecution[null]", (java.lang.Object) executionEntity15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(executionEntity3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(executionEntity24);
    }

    @Test
    public void test15035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15035");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        java.lang.String str9 = executionEntity1.getTenantId();
        executionEntity1.setProcessDefinitionId("ScopeExecution[null]");
        java.lang.String str12 = executionEntity1.getSuperExecutionId();
        boolean boolean13 = executionEntity1.isSuspended();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        executionEntity15.setActive(false);
        executionEntity15.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl19);
        executionEntity20.setDeleteReason("hi!");
        java.lang.String str23 = executionEntity20.getEventName();
        executionEntity15.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
        java.lang.String str25 = executionEntity15.getProcessInstanceId();
        executionEntity15.setEventScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = executionEntity15.getProcessInstance();
        executionEntity1.setSuperExecution(executionEntity15);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = executionEntity15.getParent();
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(executionEntity28);
        org.junit.Assert.assertNull(executionEntity30);
    }

    @Test
    public void test15036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15036");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList13 = null;
        executionEntity1.setQueryVariables(variableInstanceEntityList13);
        executionEntity1.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity18.getSuperExecution();
        executionEntity18.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl21 = null;
        executionEntity18.setTransitionBeingTaken(transitionImpl21);
        java.lang.String str23 = executionEntity18.getProcessInstanceId();
        executionEntity18.setParentId("hi!");
        executionEntity18.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = executionEntity28.getSuperExecution();
        executionEntity28.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl31 = null;
        executionEntity28.setTransitionBeingTaken(transitionImpl31);
        java.lang.String str33 = executionEntity28.getProcessInstanceId();
        int int34 = executionEntity28.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl35 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl35);
        executionEntity36.setRevision(100);
        executionEntity36.setBusinessKey("");
        executionEntity36.setActive(false);
        executionEntity28.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity36);
        executionEntity18.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity28);
        executionEntity1.setSuperExecution(executionEntity18);
        executionEntity18.setRevision((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = executionEntity18.hasVariable("ConcurrentScopeExecution[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(executionEntity19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(executionEntity29);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
    }

    @Test
    public void test15037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15037");
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
        executionEntity1.setParentId("ProcessInstance[null]");
        boolean boolean16 = executionEntity1.isConcurrent();
        boolean boolean17 = executionEntity1.isSuspended();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity18 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList19 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity18);
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = executionEntity1.getProcessVariables();
        executionEntity1.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl23 = executionEntity1.getProcessDefinition();
        executionEntity1.setId("ProcessInstance[hi!]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(activityExecutionList19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(processDefinitionImpl23);
    }

    @Test
    public void test15038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15038");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        int int9 = executionEntity1.getSuspensionState();
        java.lang.String str10 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getParent();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity1.getTransition();
        executionEntity1.setDeleteReason("ProcessInstance[]");
        boolean boolean15 = executionEntity1.isSuspended();
        executionEntity1.setId("ProcessInstance[]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = executionEntity1.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertNull(transitionImpl12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15039");
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
        boolean boolean16 = executionEntity1.isProcessInstanceType();
        org.activiti.engine.impl.javax.el.ELContext eLContext17 = null;
        executionEntity1.setCachedElContext(eLContext17);
        executionEntity1.setActive(true);
        org.activiti.engine.EngineServices engineServices21 = executionEntity1.getEngineServices();
        java.lang.String str22 = executionEntity1.getId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList24 = executionEntity1.getCompensateEventSubscriptions("");
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
        org.junit.Assert.assertNotNull(startingExecution15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(engineServices21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test15040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15040");
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
        executionEntity1.setBusinessKey("ProcessInstance[null]");
        java.lang.Object obj16 = executionEntity1.getPersistentState();
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=ProcessInstance[null], superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=ProcessInstance[null], superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=ProcessInstance[null], superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
    }

    @Test
    public void test15041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15041");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        boolean boolean10 = executionEntity1.isActive();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = null;
        executionEntity1.setEventSource(pvmProcessElement11);
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity16.getSuperExecution();
        executionEntity16.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = null;
        executionEntity16.setTransitionBeingTaken(transitionImpl19);
        java.lang.String str21 = executionEntity16.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl22 = null;
        executionEntity16.setTransitionBeingTaken(transitionImpl22);
        java.lang.String str24 = executionEntity16.getTenantId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity16.getReplacedBy();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement26 = null;
        executionEntity16.setEventSource(pvmProcessElement26);
        executionEntity16.setActive(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = executionEntity16.getSuperExecution();
        java.lang.String str31 = executionEntity16.getCurrentActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl32 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl32);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = executionEntity33.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl35 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl35);
        executionEntity36.setDeleteReason("hi!");
        executionEntity36.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray41 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList42 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList42, variableInstanceEntityArray41);
        executionEntity36.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList42);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl45 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity46 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl45);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity47 = executionEntity46.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext48 = null;
        executionEntity46.setCachedElContext(eLContext48);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl50 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity51 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl50);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity52 = executionEntity51.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext53 = null;
        executionEntity51.setCachedElContext(eLContext53);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl55 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity56 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl55);
        executionEntity56.setRevision(100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl59 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity60 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl59);
        executionEntity60.setRevision(100);
        executionEntity60.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl65 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity66 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl65);
        executionEntity66.setDeleteReason("hi!");
        java.lang.String str69 = executionEntity66.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement70 = null;
        executionEntity66.setEventSource(pvmProcessElement70);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl72 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity73 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl72);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity74 = executionEntity73.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity75 = executionEntity73.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray76 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity36, executionEntity46, executionEntity51, executionEntity56, executionEntity60, executionEntity66, executionEntity75 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList77 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList77, executionEntityArray76);
        executionEntity33.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList77);
        executionEntity16.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList77);
        executionEntity1.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList77);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(executionEntity17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(executionEntity25);
        org.junit.Assert.assertNull(executionEntity30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(executionEntity34);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(executionEntity47);
        org.junit.Assert.assertNull(executionEntity52);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(executionEntity74);
        org.junit.Assert.assertNull(executionEntity75);
        org.junit.Assert.assertNotNull(executionEntityArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test15042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15042");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        executionEntity1.setTenantId("");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement9 = null;
        executionEntity1.setEventSource(pvmProcessElement9);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getSuperExecution();
        executionEntity1.forceUpdate();
        boolean boolean13 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity1.getSuperExecution();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(executionEntity14);
    }

    @Test
    public void test15043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15043");
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
        boolean boolean12 = executionEntity1.isDeleteRoot();
        executionEntity1.setCachedEntityState((-1));
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15044");
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
        executionEntity11.setDeleteReason("hi!");
        executionEntity11.setSuspensionState((int) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = executionEntity11.getProcessVariables();
        executionEntity1.setVariables(strMap16);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setActive(false);
        executionEntity19.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        executionEntity24.setDeleteReason("hi!");
        java.lang.String str27 = executionEntity24.getEventName();
        executionEntity19.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        java.lang.String str29 = executionEntity19.getProcessInstanceId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement30 = executionEntity19.getEventSource();
        java.lang.String str31 = executionEntity19.getCurrentActivityName();
        int int32 = executionEntity19.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        executionEntity34.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl37 = executionEntity34.getTransition();
        executionEntity34.setScope(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList40 = executionEntity34.getQueryVariables();
        boolean boolean41 = executionEntity34.isScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl42 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl42);
        executionEntity43.setRevision(100);
        executionEntity43.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity48 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList49 = executionEntity43.findInactiveConcurrentExecutions(pvmActivity48);
        int int50 = executionEntity43.getSuspensionState();
        executionEntity43.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity53 = executionEntity43.getProcessInstance();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement54 = null;
        executionEntity43.setEventSource(pvmProcessElement54);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl56 = null;
        executionEntity43.setActivity(activityImpl56);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl58 = null;
        executionEntity43.setTransition(transitionImpl58);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray60 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList61 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList61, variableInstanceEntityArray60);
        executionEntity43.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList61);
        executionEntity34.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList61);
        executionEntity19.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList61);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList61);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution67 = executionEntity1.getStartingExecution();
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertNull(variableInstanceEntityList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ProcessInstance[null]" + "'", str9, "ProcessInstance[null]");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(pvmProcessElement30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 7 + "'", int32 == 7);
        org.junit.Assert.assertNull(transitionImpl37);
        org.junit.Assert.assertNull(variableInstanceEntityList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(activityExecutionList49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNull(executionEntity53);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(startingExecution67);
    }

    @Test
    public void test15045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15045");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getReplacedBy();
        java.lang.String str9 = executionEntity1.getActivityId();
        executionEntity1.setProcessDefinitionId("");
        executionEntity1.setActive(true);
        java.lang.String str14 = executionEntity1.getProcessInstanceId();
        executionEntity1.setDeleteReason("");
        java.lang.String str17 = executionEntity1.getActivityId();
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15046");
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
        executionEntity1.setActive(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList15 = executionEntity1.getJobs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15047");
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
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl16 = executionEntity13.getTransition();
        executionEntity13.setScope(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList19 = executionEntity13.getQueryVariables();
        boolean boolean20 = executionEntity13.isScope();
        java.lang.String str21 = executionEntity13.toString();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl22 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl22);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = executionEntity23.getSuperExecution();
        executionEntity23.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl26 = null;
        executionEntity23.setTransitionBeingTaken(transitionImpl26);
        java.lang.String str28 = executionEntity23.getProcessInstanceId();
        int int29 = executionEntity23.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl30 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl30);
        executionEntity31.setRevision(100);
        executionEntity31.setBusinessKey("");
        executionEntity31.setActive(false);
        executionEntity23.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity31);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl39 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl39);
        executionEntity40.setRevision(100);
        executionEntity40.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity45 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList46 = executionEntity40.findInactiveConcurrentExecutions(pvmActivity45);
        int int47 = executionEntity40.getSuspensionState();
        executionEntity23.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity40);
        executionEntity13.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity23);
        executionEntity6.setSuperExecution(executionEntity13);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl51 = executionEntity6.getProcessDefinition();
        java.lang.String str52 = executionEntity6.getBusinessKey();
        java.lang.String str53 = executionEntity6.getSuperExecutionId();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity54 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList55 = executionEntity6.findInactiveConcurrentExecutions(pvmActivity54);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(variableInstanceEntityList11);
        org.junit.Assert.assertNull(transitionImpl16);
        org.junit.Assert.assertNull(variableInstanceEntityList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ProcessInstance[null]" + "'", str21, "ProcessInstance[null]");
        org.junit.Assert.assertNull(executionEntity24);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(activityExecutionList46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNull(processDefinitionImpl51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(activityExecutionList55);
    }

    @Test
    public void test15048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15048");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        int int4 = executionEntity1.getRevisionNext();
        executionEntity1.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity7 = null;
        executionEntity1.removeTask(taskEntity7);
        java.lang.String str9 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setRevision(100);
        int int14 = executionEntity11.getRevisionNext();
        executionEntity11.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity17 = null;
        executionEntity11.removeTask(taskEntity17);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity19 = null;
        executionEntity11.removeJob(jobEntity19);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList21 = executionEntity11.getEventSubscriptions();
        executionEntity1.setSuperExecution(executionEntity11);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList24 = executionEntity1.getCompensateEventSubscriptions("ProcessInstance[hi!]");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList25 = executionEntity1.getEventSubscriptionsInternal();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity26 = null;
        executionEntity1.removeTask(taskEntity26);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertNotNull(eventSubscriptionEntityList21);
        org.junit.Assert.assertNotNull(compensateEventSubscriptionEntityList24);
        org.junit.Assert.assertNotNull(eventSubscriptionEntityList25);
    }

    @Test
    public void test15049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15049");
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
        boolean boolean11 = executionEntity1.isEnded();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        executionEntity1.setActivity(activityImpl12);
        int int14 = executionEntity1.getCachedEntityState();
        boolean boolean15 = executionEntity1.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity1.getSuperExecution();
        java.lang.String str17 = executionEntity1.getDeleteReason();
        org.activiti.engine.EngineServices engineServices18 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl19);
        executionEntity20.setActive(false);
        executionEntity20.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl24 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl24);
        executionEntity25.setDeleteReason("hi!");
        java.lang.String str28 = executionEntity25.getEventName();
        executionEntity20.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity25);
        java.lang.String str30 = executionEntity20.getProcessInstanceId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement31 = executionEntity20.getEventSource();
        java.lang.String str32 = executionEntity20.getTenantId();
        java.lang.String str33 = executionEntity20.getTenantId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(executionEntity16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(engineServices18);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(pvmProcessElement31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test15050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15050");
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
        executionEntity1.setEventScope(true);
        boolean boolean14 = executionEntity1.isProcessInstanceType();
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList15 = null;
        executionEntity1.setExecutions(executionEntityList15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = executionEntity1.updateProcessBusinessKey("ProcessInstance[]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test15051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15051");
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
        executionEntity1.forceUpdate();
        java.lang.String str15 = executionEntity1.getCurrentActivityName();
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15052");
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
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity1.getTransitionBeingTaken();
        boolean boolean16 = executionEntity1.isEventScope();
        executionEntity1.forceUpdate();
        java.lang.String str18 = executionEntity1.getProcessInstanceId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity1.getEventSubscriptionsInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(transitionImpl15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15053");
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
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 1);
        executionEntity1.setSuspensionState(10);
        executionEntity1.setProcessDefinitionId("ScopeExecution[null]");
        boolean boolean19 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl21 = executionEntity20.getTransition();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(activityImpl12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(executionEntity20);
    }

    @Test
    public void test15054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15054");
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
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setActive(false);
        java.lang.String str21 = executionEntity18.getId();
        executionEntity18.setRevision(2);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = executionEntity18.getProcessVariables();
        executionEntity1.createVariablesLocal(strMap24);
        org.activiti.engine.impl.javax.el.ELContext eLContext26 = null;
        executionEntity1.setCachedElContext(eLContext26);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl28 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl28);
        executionEntity29.setDeleteReason("hi!");
        executionEntity29.setSuspensionState((int) (byte) 10);
        java.lang.String str34 = executionEntity29.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity29.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity35);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl37 = executionEntity35.getTransition();
        java.lang.String str38 = executionEntity35.getDeleteReason();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl39 = executionEntity35.getTransitionBeingTaken();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl40);
        executionEntity41.setRevision(100);
        java.lang.String str44 = executionEntity41.getId();
        executionEntity35.setSuperExecution(executionEntity41);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement46 = executionEntity41.getEventSource();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl47 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity48 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl47);
        executionEntity48.setDeleteReason("hi!");
        executionEntity48.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray53 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList54 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList54, variableInstanceEntityArray53);
        executionEntity48.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList54);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity57 = executionEntity48.getParent();
        boolean boolean58 = executionEntity48.isSuspended();
        java.lang.String str59 = executionEntity48.getCurrentActivityId();
        executionEntity41.setSuperExecution(executionEntity48);
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity41);
        java.util.Map<java.lang.String, java.lang.Object> strMap62 = executionEntity41.getProcessVariables();
        java.lang.String str63 = executionEntity41.toString();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(transitionImpl37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(transitionImpl39);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(pvmProcessElement46);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(executionEntity57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "ProcessInstance[null]" + "'", str63, "ProcessInstance[null]");
    }

    @Test
    public void test15055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15055");
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
        executionEntity1.setTenantId("hi!");
        java.lang.String str18 = executionEntity1.getEventName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = executionEntity1.hasVariable("ProcessInstance[]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertNotNull(activityExecutionList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15056");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        int int4 = executionEntity1.getRevisionNext();
        executionEntity1.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity7 = null;
        executionEntity1.removeTask(taskEntity7);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity9 = null;
        executionEntity1.removeJob(jobEntity9);
        executionEntity1.setEventScope(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void test15057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15057");
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
        executionEntity1.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity16.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext18 = null;
        executionEntity16.setCachedElContext(eLContext18);
        executionEntity16.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str22 = executionEntity16.getActivityId();
        java.lang.String str23 = executionEntity16.getActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl24 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl24);
        java.lang.String str26 = executionEntity25.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = executionEntity25.getProcessInstance();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement28 = null;
        executionEntity25.setEventSource(pvmProcessElement28);
        executionEntity16.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity25);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl31 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl31);
        executionEntity32.setRevision(100);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray35 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList36 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList36, variableInstanceEntityArray35);
        executionEntity32.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList36);
        boolean boolean39 = executionEntity32.isEventScope();
        boolean boolean40 = executionEntity32.isDeleteRoot();
        org.activiti.engine.impl.pvm.runtime.InterpretableExecution interpretableExecution41 = null;
        executionEntity32.setProcessInstance(interpretableExecution41);
        executionEntity32.setConcurrent(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList45 = executionEntity32.getQueryVariables();
        executionEntity16.setQueryVariables(variableInstanceEntityList45);
        executionEntity1.setQueryVariables(variableInstanceEntityList45);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity48 = null;
        executionEntity1.addTask(taskEntity48);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 7);
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(executionEntity17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(executionEntity27);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(variableInstanceEntityList45);
    }

    @Test
    public void test15058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15058");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        java.lang.String str9 = executionEntity1.getTenantId();
        executionEntity1.setProcessDefinitionId("ScopeExecution[null]");
        java.lang.String str12 = executionEntity1.getSuperExecutionId();
        java.lang.Object obj13 = executionEntity1.getPersistentState();
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{processDefinitionId=ScopeExecution[null], activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{processDefinitionId=ScopeExecution[null], activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{processDefinitionId=ScopeExecution[null], activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test15059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15059");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        java.lang.String str9 = executionEntity1.getDeleteReason();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = executionEntity1.getProcessDefinition();
        int int11 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = null;
        executionEntity1.setTransition(transitionImpl12);
        executionEntity1.setRevision(36);
        java.lang.String str16 = executionEntity1.getTenantId();
        boolean boolean17 = executionEntity1.isProcessInstanceType();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList18 = executionEntity1.getEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(processDefinitionImpl10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test15060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15060");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity1.getQueryVariables();
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity9 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.executeActivity(pvmActivity9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(variableInstanceEntityList7);
    }

    @Test
    public void test15061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15061");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = null;
        executionEntity1.setCachedElContext(eLContext3);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        executionEntity1.inactivate();
        java.lang.Object obj8 = executionEntity1.getPersistentState();
        boolean boolean9 = executionEntity1.isScope();
        java.lang.String str10 = executionEntity1.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = executionEntity1.hasVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(executionEntity11);
    }

    @Test
    public void test15062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15062");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getProcessInstance();
        java.lang.String str6 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity8.getSuperExecution();
        executionEntity8.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = null;
        executionEntity8.setTransitionBeingTaken(transitionImpl11);
        java.lang.String str13 = executionEntity8.getProcessInstanceId();
        int int14 = executionEntity8.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        executionEntity16.setRevision(100);
        executionEntity16.setBusinessKey("");
        executionEntity16.setActive(false);
        executionEntity8.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        executionEntity8.forceUpdate();
        executionEntity8.forceUpdate();
        executionEntity1.setSuperExecution(executionEntity8);
        int int27 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl28 = executionEntity1.getActivity();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement29 = executionEntity1.getEventSource();
        java.lang.String str30 = executionEntity1.getParentId();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity33 = executionEntity1.addIdentityLink("ProcessInstance[null]", "ConcurrentScopeExecution[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(executionEntity5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(executionEntity9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(activityImpl28);
        org.junit.Assert.assertNull(pvmProcessElement29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test15063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15063");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        executionEntity1.setScope(true);
        int int12 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity13 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList14 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList15 = executionEntity1.getEventSubscriptionsInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(activityExecutionList14);
    }

    @Test
    public void test15064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15064");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = null;
        executionEntity1.setCachedElContext(eLContext3);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        executionEntity1.setSuspensionState((-1));
        org.activiti.engine.EngineServices engineServices9 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getProcessInstance();
        executionEntity1.setId("ProcessInstance[null]");
        boolean boolean13 = executionEntity1.isActive();
        executionEntity1.forceUpdate();
        java.lang.String str15 = executionEntity1.getSuperExecutionId();
        executionEntity1.setTenantId("ProcessInstance[ProcessInstance[null]]");
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(engineServices9);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15065");
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
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity12.getSuperExecution();
        executionEntity12.inactivate();
        java.lang.String str15 = executionEntity12.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity12.getParent();
        java.lang.String str17 = executionEntity12.getSuperExecutionId();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = null;
        executionEntity1.setTransition(transitionImpl19);
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(executionEntity13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(executionEntity16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15066");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        java.lang.String str7 = executionEntity1.getDeleteReason();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = null;
        executionEntity1.setTransition(transitionImpl8);
        java.lang.String str10 = executionEntity1.getBusinessKey();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList11 = executionEntity1.getJobs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15067");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        boolean boolean5 = executionEntity1.isProcessInstanceType();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setDeleteReason("hi!");
        executionEntity7.setSuspensionState((int) (byte) 10);
        java.lang.String str12 = executionEntity7.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity7.getProcessVariables();
        java.lang.String str16 = executionEntity7.getParentId();
        boolean boolean17 = executionEntity7.isEnded();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity7.getSubProcessInstance();
        java.lang.String str20 = executionEntity7.getDeleteReason();
        executionEntity7.setExecutionListenerIndex((java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList23 = executionEntity7.getJobs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(executionEntity19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test15068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15068");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        executionEntity1.forceUpdate();
        executionEntity1.setEventScope(false);
        java.lang.String str10 = executionEntity1.getTenantId();
        boolean boolean11 = executionEntity1.isDeleteRoot();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity1.getTransition();
        org.activiti.engine.impl.javax.el.ELContext eLContext13 = null;
        executionEntity1.setCachedElContext(eLContext13);
        java.lang.String str15 = executionEntity1.getActivityId();
        executionEntity1.setId("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl18 = executionEntity1.getTransitionBeingTaken();
        java.lang.String str19 = executionEntity1.toString();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(transitionImpl12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(transitionImpl18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ProcessInstance[ProcessInstance[null]]" + "'", str19, "ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test15069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15069");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl6);
        java.lang.String str8 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        executionEntity1.setActivity(activityImpl9);
        java.lang.String str11 = executionEntity1.getParentId();
        java.lang.Object obj12 = executionEntity1.getPersistentState();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test15070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15070");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getProcessInstance();
        executionEntity1.setDeleteReason("ScopeExecution[null]");
        java.lang.String str5 = executionEntity1.getTenantId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.getProcessInstance();
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(executionEntity6);
    }

    @Test
    public void test15071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15071");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        int int9 = executionEntity1.getSuspensionState();
        java.lang.String str10 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity12.getSuperExecution();
        executionEntity12.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = null;
        executionEntity12.setTransitionBeingTaken(transitionImpl15);
        java.lang.String str17 = executionEntity12.getProcessInstanceId();
        executionEntity12.setParentId("hi!");
        executionEntity12.forceUpdate();
        java.lang.String str21 = executionEntity12.getSuperExecutionId();
        boolean boolean22 = executionEntity12.isEnded();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = executionEntity12.getProcessVariables();
        executionEntity1.setVariables(strMap23);
        executionEntity1.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = executionEntity27.hasVariablesLocal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(executionEntity13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(executionEntity27);
    }

    @Test
    public void test15072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15072");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        boolean boolean6 = executionEntity1.isDeleteRoot();
        executionEntity1.setScope(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity1.getTransitionBeingTaken();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList11 = executionEntity10.getIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(transitionImpl9);
        org.junit.Assert.assertNull(executionEntity10);
    }

    @Test
    public void test15073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15073");
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
        executionEntity1.setParentId("hi!");
        executionEntity1.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = executionEntity1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.insert();
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
        org.junit.Assert.assertNotNull(executionEntity32);
    }

    @Test
    public void test15074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15074");
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
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity12.getSuperExecution();
        executionEntity12.inactivate();
        java.lang.String str15 = executionEntity12.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity12.getParent();
        java.lang.String str17 = executionEntity12.getSuperExecutionId();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution19 = executionEntity1.getStartingExecution();
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(executionEntity13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(executionEntity16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(startingExecution19);
    }

    @Test
    public void test15075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15075");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        executionEntity1.forceUpdate();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteCascade("ProcessInstance[]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test15076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15076");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getProcessInstance();
        java.lang.String str6 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity8.getSuperExecution();
        executionEntity8.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = null;
        executionEntity8.setTransitionBeingTaken(transitionImpl11);
        java.lang.String str13 = executionEntity8.getProcessInstanceId();
        int int14 = executionEntity8.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        executionEntity16.setRevision(100);
        executionEntity16.setBusinessKey("");
        executionEntity16.setActive(false);
        executionEntity8.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        executionEntity8.forceUpdate();
        executionEntity8.forceUpdate();
        executionEntity1.setSuperExecution(executionEntity8);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement27 = executionEntity1.getEventSource();
        java.lang.Object obj28 = executionEntity1.getPersistentState();
        executionEntity1.setId("ScopeExecution[null]");
        executionEntity1.setCachedEntityState(52);
        executionEntity1.setParentId("");
        java.lang.String str35 = executionEntity1.getBusinessKey();
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(executionEntity5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(executionEntity9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNull(pvmProcessElement27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test15077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15077");
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
        executionEntity1.forceUpdate();
        java.lang.String str15 = executionEntity1.getCurrentActivityId();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 2);
        java.lang.String str18 = executionEntity1.getSuperExecutionId();
        java.lang.String str19 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement20 = null;
        executionEntity1.setEventSource(pvmProcessElement20);
        boolean boolean22 = executionEntity1.isSuspended();
        executionEntity1.setProcessDefinitionId("ConcurrentScopeExecution[null]");
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test15078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15078");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getProcessInstance();
        org.activiti.engine.impl.javax.el.ELContext eLContext4 = null;
        executionEntity1.setCachedElContext(eLContext4);
        java.lang.String str6 = executionEntity1.getId();
        executionEntity1.setTenantId("hi!");
        executionEntity1.setCachedEntityState(7);
        java.lang.String str11 = executionEntity1.getDeleteReason();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity1.getCompensateEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(executionEntity3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15079");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity1.getStartingExecution();
        boolean boolean8 = executionEntity1.isActive();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(startingExecution7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test15080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15080");
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
        java.lang.String str10 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity12.getSuperExecution();
        java.lang.String str14 = executionEntity12.getDeleteReason();
        java.lang.String str15 = executionEntity12.toString();
        java.lang.String str16 = executionEntity12.getSuperExecutionId();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        executionEntity1.setBusinessKey("ProcessInstance[null]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = executionEntity1.hasVariable("ConcurrentScopeExecution[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(executionEntity13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ProcessInstance[null]" + "'", str15, "ProcessInstance[null]");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15081");
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
        boolean boolean11 = executionEntity1.isEnded();
        executionEntity1.setEventName("ProcessInstance[hi!]");
        executionEntity1.setSuspensionState(98);
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15082");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity6.getActivity();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity6);
    }

    @Test
    public void test15083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15083");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity1.getEventSource();
        org.activiti.engine.EngineServices engineServices5 = executionEntity1.getEngineServices();
        executionEntity1.setParentId("ProcessInstance[null]");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity1.getEventSubscriptionsInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(pvmProcessElement4);
        org.junit.Assert.assertNull(engineServices5);
    }

    @Test
    public void test15084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15084");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        executionEntity1.setConcurrent(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = executionEntity1.getTransitionBeingTaken();
        java.lang.Class<?> wildcardClass14 = executionEntity1.getClass();
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertNull(transitionImpl13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test15085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15085");
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
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity1.getTransitionBeingTaken();
        executionEntity1.setBusinessKey("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity19.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = null;
        executionEntity19.setCachedElContext(eLContext21);
        executionEntity19.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str25 = executionEntity19.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = executionEntity19.getParent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = executionEntity19.getParent();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        boolean boolean29 = executionEntity19.isEventScope();
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity30 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity19.addEventSubscription(eventSubscriptionEntity30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(transitionImpl15);
        org.junit.Assert.assertNull(executionEntity20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(executionEntity26);
        org.junit.Assert.assertNull(executionEntity27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test15086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15086");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setScope(false);
        java.lang.String str11 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl12);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity14 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList15 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity14);
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(activityExecutionList15);
    }

    @Test
    public void test15087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15087");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = executionEntity1.getQueryVariables();
        boolean boolean6 = executionEntity1.isEventScope();
        java.lang.String str7 = executionEntity1.getProcessDefinitionId();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity1.getProcessVariables();
        executionEntity1.setId("hi!");
        boolean boolean11 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setDeleteReason("hi!");
        executionEntity13.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray18 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList19 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList19, variableInstanceEntityArray18);
        executionEntity13.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList19);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = executionEntity13.getParent();
        boolean boolean23 = executionEntity13.isSuspended();
        java.lang.String str24 = executionEntity13.getCurrentActivityId();
        java.lang.String str25 = executionEntity13.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement26 = null;
        executionEntity13.setEventSource(pvmProcessElement26);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl28 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl28);
        executionEntity29.setRevision(100);
        executionEntity29.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity34 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList35 = executionEntity29.findInactiveConcurrentExecutions(pvmActivity34);
        int int36 = executionEntity29.getSuspensionState();
        executionEntity29.setScope(false);
        executionEntity29.setScope(true);
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = executionEntity29.getProcessVariables();
        executionEntity13.createVariablesLocal(strMap41);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = executionEntity1.getVariableLocal("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(variableInstanceEntityList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(executionEntity22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(activityExecutionList35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(strMap41);
    }

    @Test
    public void test15088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15088");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        executionEntity1.forceUpdate();
        executionEntity1.setEventScope(false);
        java.lang.String str10 = executionEntity1.getTenantId();
        boolean boolean11 = executionEntity1.isDeleteRoot();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setRevision(100);
        executionEntity13.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity18 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList19 = executionEntity13.findInactiveConcurrentExecutions(pvmActivity18);
        int int20 = executionEntity13.getSuspensionState();
        executionEntity13.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = executionEntity13.getProcessInstance();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement24 = null;
        executionEntity13.setEventSource(pvmProcessElement24);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        executionEntity28.setDeleteReason("hi!");
        executionEntity28.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray33 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList34 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList34, variableInstanceEntityArray33);
        executionEntity28.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList34);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity37 = executionEntity28.getParent();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity38 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList39 = executionEntity28.findInactiveConcurrentExecutions(pvmActivity38);
        java.lang.String str40 = executionEntity28.getTenantId();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl41 = executionEntity28.getProcessDefinition();
        executionEntity1.setSuperExecution(executionEntity28);
        executionEntity28.setSuspensionState((int) (short) -1);
        executionEntity28.setActive(false);
        executionEntity28.setTenantId("ConcurrentScopeExecution[null]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(activityExecutionList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(executionEntity23);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(executionEntity37);
        org.junit.Assert.assertNotNull(activityExecutionList39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(processDefinitionImpl41);
    }

    @Test
    public void test15089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15089");
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
        executionEntity1.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = null;
        executionEntity1.setTransition(transitionImpl19);
        java.lang.String str21 = executionEntity1.getParentId();
        java.lang.String str22 = executionEntity1.getParentId();
        executionEntity1.setConcurrent(true);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 7);
        java.lang.String str27 = executionEntity1.getCurrentActivityName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = executionEntity1.hasVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test15090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15090");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        executionEntity1.forceUpdate();
        boolean boolean10 = executionEntity1.isScope();
        executionEntity1.inactivate();
        executionEntity1.setCachedEntityState(0);
        boolean boolean14 = executionEntity1.isConcurrent();
        int int15 = executionEntity1.getCachedEntityState();
        executionEntity1.setScope(true);
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test15091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15091");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        boolean boolean9 = executionEntity1.isProcessInstanceType();
        boolean boolean10 = executionEntity1.isProcessInstanceType();
        java.lang.String str11 = executionEntity1.getCurrentActivityName();
        java.lang.String str12 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl13);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.EngineServices engineServices16 = executionEntity15.getEngineServices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(executionEntity15);
    }

    @Test
    public void test15092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15092");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        int int4 = executionEntity1.getRevisionNext();
        boolean boolean5 = executionEntity1.isActive();
        java.lang.String str6 = executionEntity1.getTenantId();
        int int7 = executionEntity1.getRevision();
        executionEntity1.setActive(true);
        org.activiti.engine.impl.javax.el.ELContext eLContext10 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = null;
        executionEntity1.setEventSource(pvmProcessElement11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(eLContext10);
    }

    @Test
    public void test15093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15093");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior2);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        org.junit.Assert.assertNull(taskDefinition10);
        org.junit.Assert.assertNull(taskDefinition13);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
    }

    @Test
    public void test15094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15094");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        executionEntity1.setRevision((int) (short) 0);
        boolean boolean12 = executionEntity1.isActive();
        java.lang.String str13 = executionEntity1.getId();
        java.lang.String str14 = executionEntity1.getProcessInstanceId();
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15095");
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
        executionEntity1.setParentId("hi!");
        java.lang.String str31 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl32 = null;
        executionEntity1.setTransition(transitionImpl32);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl34 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl34);
        executionEntity35.setDeleteReason("hi!");
        executionEntity35.setSuspensionState((int) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = executionEntity35.getProcessVariables();
        executionEntity1.createVariablesLocal(strMap40);
        java.lang.String str42 = executionEntity1.getCurrentActivityId();
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(executionEntity12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNull(variableInstanceEntityList28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test15096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15096");
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
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = executionEntity1.getEventSource();
        java.lang.String str14 = executionEntity1.getTenantId();
        executionEntity1.setParentId("ConcurrentScopeExecution[null]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = executionEntity1.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(pvmProcessElement13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test15097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15097");
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
        executionEntity1.setParentId("hi!");
        java.lang.String str31 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl32 = null;
        executionEntity1.setTransition(transitionImpl32);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl34 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl34);
        executionEntity35.setDeleteReason("hi!");
        executionEntity35.setSuspensionState((int) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = executionEntity35.getProcessVariables();
        executionEntity1.createVariablesLocal(strMap40);
        java.lang.String str42 = executionEntity1.getSuperExecutionId();
        int int43 = executionEntity1.getRevision();
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(executionEntity12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNull(variableInstanceEntityList28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test15098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15098");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity1.getTransitionBeingTaken();
        java.lang.String str9 = executionEntity1.getActivityId();
        java.lang.Class<?> wildcardClass10 = executionEntity1.getClass();
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(transitionImpl8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test15099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15099");
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
        int int18 = executionEntity1.getRevisionNext();
        executionEntity1.inactivate();
        java.lang.String str20 = executionEntity1.getDeleteReason();
        executionEntity1.setConcurrent(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        executionEntity24.setDeleteReason("hi!");
        executionEntity24.setSuspensionState((int) (byte) 10);
        java.lang.String str29 = executionEntity24.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity24.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity30);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl32 = executionEntity30.getTransition();
        java.lang.String str33 = executionEntity30.getDeleteReason();
        int int34 = executionEntity30.getSuspensionState();
        int int35 = executionEntity30.getSuspensionState();
        java.lang.String str36 = executionEntity30.getCurrentActivityName();
        executionEntity30.setActive(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl39 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl39);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = executionEntity40.getSuperExecution();
        executionEntity40.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl43 = null;
        executionEntity40.setTransitionBeingTaken(transitionImpl43);
        java.lang.String str45 = executionEntity40.getProcessInstanceId();
        executionEntity40.setParentId("hi!");
        executionEntity40.forceUpdate();
        java.lang.String str49 = executionEntity40.getSuperExecutionId();
        boolean boolean50 = executionEntity40.isEnded();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl51 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity52 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl51);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity53 = executionEntity52.getSuperExecution();
        executionEntity52.setParentId("hi!");
        java.lang.String str56 = executionEntity52.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl57 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity58 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl57);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity59 = executionEntity58.getSuperExecution();
        executionEntity58.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl61 = null;
        executionEntity58.setTransitionBeingTaken(transitionImpl61);
        java.lang.String str63 = executionEntity58.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl64 = null;
        executionEntity58.setTransitionBeingTaken(transitionImpl64);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl66 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity67 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl66);
        executionEntity67.setDeleteReason("hi!");
        executionEntity67.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray72 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList73 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList73, variableInstanceEntityArray72);
        executionEntity67.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList73);
        executionEntity58.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList73);
        executionEntity52.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList73);
        executionEntity40.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList73);
        executionEntity30.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList73);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList73);
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(transitionImpl32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(executionEntity41);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(executionEntity53);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(executionEntity59);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test15100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15100");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        int int9 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = executionEntity11.getTransition();
        boolean boolean15 = executionEntity11.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity17.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext19 = null;
        executionEntity17.setCachedElContext(eLContext19);
        executionEntity11.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        executionEntity17.setTenantId("");
        executionEntity17.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity17.getParent();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        executionEntity17.setActive(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList29 = executionEntity17.getQueryVariables();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(transitionImpl14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(executionEntity18);
        org.junit.Assert.assertNull(executionEntity25);
        org.junit.Assert.assertNull(variableInstanceEntityList29);
    }

    @Test
    public void test15101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15101");
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
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = executionEntity1.getEventSource();
        java.lang.String str12 = executionEntity1.getActivityId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = executionEntity1.getVariable("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(pvmProcessElement11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15102");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        java.lang.String str5 = executionEntity1.getEventName();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity1.getProcessVariables();
        executionEntity1.setEventName("ProcessInstance[null]");
        java.lang.String str9 = executionEntity1.getDeleteReason();
        boolean boolean10 = executionEntity1.isEnded();
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test15103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15103");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity1.getParent();
        boolean boolean15 = executionEntity1.isEventScope();
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(activityImpl12);
        org.junit.Assert.assertNull(executionEntity14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15104");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity1.inactivate();
        executionEntity1.forceUpdate();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteVariablesInstanceForLeavingScope();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15105");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getProcessInstance();
        java.lang.String str3 = executionEntity1.getCurrentActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setRevision(100);
        java.lang.String str8 = executionEntity5.getId();
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 2);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = null;
        executionEntity5.setTransition(transitionImpl11);
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = executionEntity5.getTransition();
        boolean boolean15 = executionEntity5.isActive();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = executionEntity5.getActivity();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = executionEntity5.getTransitionBeingTaken();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity5.findExecution("ScopeExecution[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(transitionImpl14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(activityImpl16);
        org.junit.Assert.assertNull(transitionImpl17);
    }

    @Test
    public void test15106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15106");
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
        java.lang.String str17 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setDeleteReason("hi!");
        executionEntity19.setSuspensionState((int) (byte) 10);
        java.lang.String str24 = executionEntity19.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity19.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity25);
        int int27 = executionEntity19.getSuspensionState();
        java.lang.String str28 = executionEntity19.getTenantId();
        executionEntity19.forceUpdate();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity30 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList31 = executionEntity19.findInactiveConcurrentExecutions(pvmActivity30);
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        executionEntity34.setActive(false);
        executionEntity34.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl38 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity39 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl38);
        executionEntity39.setDeleteReason("hi!");
        java.lang.String str42 = executionEntity39.getEventName();
        executionEntity34.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity39);
        java.lang.String str44 = executionEntity34.getProcessInstanceId();
        executionEntity1.setSuperExecution(executionEntity34);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = executionEntity34.hasVariablesLocal();
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(activityExecutionList31);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test15107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15107");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setDeleteReason("hi!");
        executionEntity7.setSuspensionState((int) (byte) 10);
        java.lang.String str12 = executionEntity7.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity13.getProcessVariables();
        executionEntity1.createVariablesLocal(strMap15);
        executionEntity1.inactivate();
        boolean boolean18 = executionEntity1.isActive();
        boolean boolean19 = executionEntity1.isEventScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext20 = executionEntity1.getCachedElContext();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(eLContext20);
    }

    @Test
    public void test15108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15108");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl7);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl9);
        java.lang.Object obj11 = executionEntity1.getPersistentState();
        executionEntity1.setDeleteReason("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        executionEntity15.setDeleteReason("hi!");
        executionEntity15.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray20 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList21 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList21, variableInstanceEntityArray20);
        executionEntity15.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList21);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl24 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl24);
        executionEntity25.setRevision(100);
        executionEntity25.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity30 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList31 = executionEntity25.findInactiveConcurrentExecutions(pvmActivity30);
        int int32 = executionEntity25.getSuspensionState();
        executionEntity25.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = executionEntity25.getProcessInstance();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement36 = null;
        executionEntity25.setEventSource(pvmProcessElement36);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl38 = null;
        executionEntity25.setActivity(activityImpl38);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl40 = null;
        executionEntity25.setTransition(transitionImpl40);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray42 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList43 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList43, variableInstanceEntityArray42);
        executionEntity25.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList43);
        executionEntity15.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList43);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList43);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet48 = executionEntity1.getVariableNamesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertNotNull(variableInstanceEntityArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(activityExecutionList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(executionEntity35);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test15109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15109");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        java.lang.String str5 = executionEntity1.getEventName();
        executionEntity1.setRevision((int) '#');
        executionEntity1.setTenantId("ProcessInstance[null]");
        int int10 = executionEntity1.getRevisionNext();
        executionEntity1.setRevision((int) (byte) 0);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity13 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.executeActivity(pvmActivity13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
    }

    @Test
    public void test15110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15110");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        java.lang.String str6 = executionEntity1.getParentId();
        boolean boolean7 = executionEntity1.isScope();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = null;
        executionEntity1.setTransition(transitionImpl8);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getProcessInstance();
        executionEntity1.inactivate();
        java.lang.String str12 = executionEntity1.getTenantId();
        executionEntity1.setEventName("ConcurrentScopeExecution[null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test15111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15111");
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
        org.activiti.engine.impl.javax.el.ELContext eLContext11 = null;
        executionEntity1.setCachedElContext(eLContext11);
        executionEntity1.setDeleteReason("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        executionEntity16.setDeleteReason("hi!");
        java.lang.String str19 = executionEntity16.getEventName();
        java.lang.Object obj20 = executionEntity16.getPersistentState();
        executionEntity16.setTenantId("");
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test15112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15112");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        executionEntity1.setRevision((int) (short) 0);
        int int12 = executionEntity1.getRevision();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity14.getSuperExecution();
        java.lang.String str16 = executionEntity14.getDeleteReason();
        java.lang.String str17 = executionEntity14.getDeleteReason();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        executionEntity1.setRevision((-1));
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity24.getSuperExecution();
        executionEntity24.inactivate();
        java.lang.String str27 = executionEntity24.getBusinessKey();
        boolean boolean28 = executionEntity24.isEnded();
        boolean boolean29 = executionEntity24.isProcessInstanceType();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity30 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList31 = executionEntity24.findInactiveConcurrentExecutions(pvmActivity30);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        executionEntity1.setCachedEntityState((int) (short) -1);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(executionEntity15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(eLContext21);
        org.junit.Assert.assertNull(executionEntity25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(activityExecutionList31);
    }

    @Test
    public void test15113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15113");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        executionEntity1.inactivate();
        java.lang.String str8 = executionEntity1.getParentId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test15114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15114");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getProcessInstance();
        java.lang.String str6 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity8.getSuperExecution();
        executionEntity8.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = null;
        executionEntity8.setTransitionBeingTaken(transitionImpl11);
        java.lang.String str13 = executionEntity8.getProcessInstanceId();
        int int14 = executionEntity8.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        executionEntity16.setRevision(100);
        executionEntity16.setBusinessKey("");
        executionEntity16.setActive(false);
        executionEntity8.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        executionEntity8.forceUpdate();
        executionEntity8.forceUpdate();
        executionEntity1.setSuperExecution(executionEntity8);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        executionEntity28.setRevision(100);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray31 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList32 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList32, variableInstanceEntityArray31);
        executionEntity28.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList32);
        executionEntity28.setTenantId("hi!");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList37 = executionEntity28.getQueryVariables();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = executionEntity28.getVariableLocal("ProcessInstance[hi!]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(executionEntity5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(executionEntity9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(variableInstanceEntityList37);
    }

    @Test
    public void test15115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15115");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        int int4 = executionEntity1.getRevisionNext();
        executionEntity1.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity7 = null;
        executionEntity1.removeTask(taskEntity7);
        java.lang.String str9 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setRevision(100);
        int int14 = executionEntity11.getRevisionNext();
        executionEntity11.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity17 = null;
        executionEntity11.removeTask(taskEntity17);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity19 = null;
        executionEntity11.removeJob(jobEntity19);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList21 = executionEntity11.getEventSubscriptions();
        executionEntity1.setSuperExecution(executionEntity11);
        java.lang.String str23 = executionEntity11.getSuperExecutionId();
        executionEntity11.inactivate();
        executionEntity11.setSuspensionState(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertNotNull(eventSubscriptionEntityList21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test15116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15116");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        int int4 = executionEntity1.getRevisionNext();
        executionEntity1.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity7 = null;
        executionEntity1.removeTask(taskEntity7);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity9 = null;
        executionEntity1.addEventSubscription(eventSubscriptionEntity9);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getParent();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity1.getTransitionBeingTaken();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList13 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity15.getSuperExecution();
        executionEntity15.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl18 = null;
        executionEntity15.setTransitionBeingTaken(transitionImpl18);
        java.lang.String str20 = executionEntity15.getProcessInstanceId();
        executionEntity15.setParentId("hi!");
        executionEntity15.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl24 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl24);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = executionEntity25.getSuperExecution();
        executionEntity25.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl28 = null;
        executionEntity25.setTransitionBeingTaken(transitionImpl28);
        java.lang.String str30 = executionEntity25.getProcessInstanceId();
        int int31 = executionEntity25.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl32 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl32);
        executionEntity33.setRevision(100);
        executionEntity33.setBusinessKey("");
        executionEntity33.setActive(false);
        executionEntity25.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity33);
        executionEntity15.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity25);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl42 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl42);
        executionEntity43.setActive(false);
        java.lang.String str46 = executionEntity43.getId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl47 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity48 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl47);
        executionEntity48.setRevision(100);
        executionEntity48.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl53 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity54 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl53);
        executionEntity54.setDeleteReason("hi!");
        java.lang.String str57 = executionEntity54.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement58 = null;
        executionEntity54.setEventSource(pvmProcessElement58);
        java.lang.Object obj60 = executionEntity54.getPersistentState();
        java.lang.String str61 = executionEntity54.getId();
        java.util.Map<java.lang.String, java.lang.Object> strMap62 = executionEntity54.getProcessVariables();
        executionEntity48.setVariablesLocal(strMap62);
        executionEntity43.setVariablesLocal(strMap62);
        executionEntity15.setVariablesLocal(strMap62);
        java.util.Map<java.lang.String, java.lang.Object> strMap66 = executionEntity15.getProcessVariables();
        executionEntity1.createVariablesLocal(strMap66);
        java.lang.String str68 = executionEntity1.getTenantId();
        executionEntity1.setScope(true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertNull(transitionImpl12);
        org.junit.Assert.assertNull(variableInstanceEntityList13);
        org.junit.Assert.assertNull(executionEntity16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(executionEntity26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj60), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test15117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15117");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList13 = null;
        executionEntity1.setQueryVariables(variableInstanceEntityList13);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity16.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext18 = null;
        executionEntity16.setCachedElContext(eLContext18);
        executionEntity16.setExecutionListenerIndex((java.lang.Integer) 10);
        executionEntity16.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        executionEntity24.setDeleteReason("hi!");
        java.lang.String str27 = executionEntity24.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement28 = null;
        executionEntity24.setEventSource(pvmProcessElement28);
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = executionEntity24.getProcessVariables();
        executionEntity16.createVariablesLocal(strMap30);
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        boolean boolean33 = executionEntity16.isProcessInstanceType();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl34 = null;
        executionEntity16.setTransition(transitionImpl34);
        boolean boolean36 = executionEntity16.isSuspended();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity16.insert();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(executionEntity17);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test15118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15118");
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
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl16 = null;
        executionEntity1.setTransition(transitionImpl16);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray18 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList19 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList19, variableInstanceEntityArray18);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList19);
        executionEntity1.setScope(false);
        executionEntity1.setProcessDefinitionId("ProcessInstance[hi!]");
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test15119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15119");
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
        java.lang.Object obj16 = executionEntity1.getPersistentState();
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(startingExecution14);
        org.junit.Assert.assertNotNull(startingExecution15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test15120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15120");
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
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl27 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl27);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl29 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl29);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = executionEntity30.getSuperExecution();
        executionEntity30.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl33 = null;
        executionEntity30.setTransitionBeingTaken(transitionImpl33);
        java.lang.String str35 = executionEntity30.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl36 = null;
        executionEntity30.setTransitionBeingTaken(transitionImpl36);
        java.lang.String str38 = executionEntity30.getTenantId();
        executionEntity30.disposeStartingExecution();
        boolean boolean40 = executionEntity30.isSuspended();
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = executionEntity30.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap41);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = executionEntity1.getProcessInstance();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution44 = executionEntity1.getStartingExecution();
        executionEntity1.setCachedEntityState((int) (byte) 1);
        java.lang.String str47 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.EngineServices engineServices48 = executionEntity1.getEngineServices();
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
        org.junit.Assert.assertNull(executionEntity31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNull(executionEntity43);
        org.junit.Assert.assertNotNull(startingExecution44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(engineServices48);
    }

    @Test
    public void test15121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15121");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior2);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setDeleteReason("hi!");
        executionEntity13.setSuspensionState((int) (byte) 10);
        java.lang.String str18 = executionEntity13.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = executionEntity13.getProcessVariables();
        boolean boolean22 = executionEntity13.isActive();
        executionEntity13.setDeleteReason("hi!");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList25 = null;
        executionEntity13.setQueryVariables(variableInstanceEntityList25);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = executionEntity28.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext30 = null;
        executionEntity28.setCachedElContext(eLContext30);
        executionEntity28.setExecutionListenerIndex((java.lang.Integer) 10);
        executionEntity28.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl35 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl35);
        executionEntity36.setDeleteReason("hi!");
        java.lang.String str39 = executionEntity36.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement40 = null;
        executionEntity36.setEventSource(pvmProcessElement40);
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = executionEntity36.getProcessVariables();
        executionEntity28.createVariablesLocal(strMap42);
        executionEntity13.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity28);
        executionEntity13.setDeleteReason("ProcessInstance[]");
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        org.junit.Assert.assertNull(taskDefinition11);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(executionEntity29);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(strMap42);
    }

    @Test
    public void test15122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15122");
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
        executionEntity1.setCachedEntityState((int) (short) 10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity18.getSuperExecution();
        executionEntity18.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl21 = null;
        executionEntity18.setTransitionBeingTaken(transitionImpl21);
        java.lang.String str23 = executionEntity18.getProcessInstanceId();
        int int24 = executionEntity18.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity18.getReplacedBy();
        java.lang.String str26 = executionEntity18.getActivityId();
        executionEntity18.setProcessDefinitionId("");
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl30 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl30);
        executionEntity31.setDeleteReason("hi!");
        java.lang.String str34 = executionEntity31.getEventName();
        java.lang.Object obj35 = executionEntity31.getPersistentState();
        java.lang.String str36 = executionEntity31.getEventName();
        executionEntity31.disposeStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl38 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity39 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl38);
        executionEntity39.setDeleteReason("hi!");
        executionEntity39.setSuspensionState((int) (byte) 10);
        java.lang.String str44 = executionEntity39.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity45 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity39.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity45);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl47 = executionEntity45.getTransition();
        java.lang.String str48 = executionEntity45.getDeleteReason();
        boolean boolean49 = executionEntity45.isEnded();
        executionEntity45.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl51 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity52 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl51);
        executionEntity52.setRevision(100);
        executionEntity52.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity57 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList58 = executionEntity52.findInactiveConcurrentExecutions(pvmActivity57);
        int int59 = executionEntity52.getSuspensionState();
        executionEntity52.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity62 = executionEntity52.getProcessInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap63 = executionEntity52.getProcessVariables();
        executionEntity45.createVariablesLocal(strMap63);
        java.util.Map<java.lang.String, java.lang.Object> strMap65 = executionEntity45.getProcessVariables();
        executionEntity31.createVariablesLocal(strMap65);
        executionEntity18.setVariables(strMap65);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity68 = executionEntity18.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity71 = executionEntity68.addIdentityLink("ScopeExecution[null]", "ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(executionEntity19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNull(executionEntity25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(transitionImpl47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(activityExecutionList58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNull(executionEntity62);
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNull(executionEntity68);
    }

    @Test
    public void test15123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15123");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        java.lang.String str3 = executionEntity1.getDeleteReason();
        java.lang.String str4 = executionEntity1.toString();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setDeleteReason("hi!");
        java.lang.String str9 = executionEntity6.getEventName();
        java.lang.Object obj10 = executionEntity6.getPersistentState();
        java.lang.String str11 = executionEntity6.getEventName();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = executionEntity6.getProcessVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setRevision(100);
        java.lang.String str17 = executionEntity14.getId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl18 = null;
        executionEntity14.setTransition(transitionImpl18);
        executionEntity6.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        java.lang.String str21 = executionEntity6.getDeleteReason();
        executionEntity1.setSuperExecution(executionEntity6);
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
        executionEntity1.setSuperExecution(executionEntity24);
        java.lang.String str37 = executionEntity24.getId();
        java.lang.String str38 = executionEntity24.getTenantId();
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ProcessInstance[null]" + "'", str4, "ProcessInstance[null]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(activityExecutionList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(executionEntity34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test15124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15124");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        executionEntity1.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = executionEntity1.getQueryVariables();
        boolean boolean6 = executionEntity1.isEventScope();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = executionEntity1.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(variableInstanceEntityList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test15125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15125");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        java.lang.String str4 = executionEntity1.getId();
        executionEntity1.forceUpdate();
        java.lang.String str6 = executionEntity1.getBusinessKey();
        java.lang.String str7 = executionEntity1.getActivityId();
        java.lang.String str8 = executionEntity1.getId();
        boolean boolean9 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = executionEntity1.getTransitionBeingTaken();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(transitionImpl10);
    }

    @Test
    public void test15126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15126");
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
        java.lang.String str14 = executionEntity1.getProcessDefinitionId();
        boolean boolean15 = executionEntity1.isProcessInstanceType();
        boolean boolean16 = executionEntity1.isProcessInstanceType();
        int int17 = executionEntity1.getSuspensionState();
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(executionEntity13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test15127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15127");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl2 = executionEntity1.getTransitionBeingTaken();
        boolean boolean3 = executionEntity1.isEventScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext4 = null;
        executionEntity1.setCachedElContext(eLContext4);
        java.lang.String str6 = executionEntity1.getBusinessKey();
        org.junit.Assert.assertNull(transitionImpl2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test15128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15128");
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
        executionEntity1.forceUpdate();
        java.lang.String str15 = executionEntity1.getBusinessKey();
        java.lang.String str16 = executionEntity1.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        executionEntity1.createVariablesLocal(strMap17);
        executionEntity1.disposeStartingExecution();
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15129");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getProcessInstanceId();
        executionEntity1.setTenantId("");
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        executionEntity1.setCachedEntityState(2);
        java.lang.String str9 = executionEntity1.getTenantId();
        executionEntity1.setEventScope(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList12 = executionEntity1.getQueryVariables();
        boolean boolean13 = executionEntity1.isProcessInstanceType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(variableInstanceEntityList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test15130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15130");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        executionEntity12.setDeleteReason("hi!");
        executionEntity12.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray17 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList18 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList18, variableInstanceEntityArray17);
        executionEntity12.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList18);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity12.getParent();
        boolean boolean22 = executionEntity12.isSuspended();
        executionEntity12.forceUpdate();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement24 = executionEntity12.getEventSource();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList25 = executionEntity12.getQueryVariables();
        executionEntity1.setQueryVariables(variableInstanceEntityList25);
        boolean boolean27 = executionEntity1.isActive();
        executionEntity1.forceUpdate();
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(executionEntity21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(pvmProcessElement24);
        org.junit.Assert.assertNotNull(variableInstanceEntityList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test15131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15131");
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
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = null;
        executionEntity1.setEventSource(pvmProcessElement13);
        java.lang.String str15 = executionEntity1.getDeleteReason();
        java.lang.String str16 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity18.getSuperExecution();
        executionEntity18.inactivate();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement21 = executionEntity18.getEventSource();
        org.activiti.engine.EngineServices engineServices22 = executionEntity18.getEngineServices();
        java.util.Collection<java.lang.String> strCollection23 = null;
        executionEntity18.removeVariablesLocal(strCollection23);
        org.activiti.engine.impl.javax.el.ELContext eLContext25 = executionEntity18.getCachedElContext();
        boolean boolean26 = executionEntity18.isConcurrent();
        executionEntity18.setRevision((int) (byte) -1);
        org.activiti.engine.impl.javax.el.ELContext eLContext29 = null;
        executionEntity18.setCachedElContext(eLContext29);
        executionEntity1.setSuperExecution(executionEntity18);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList32 = executionEntity18.getQueryVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        executionEntity34.setDeleteReason("hi!");
        java.lang.String str37 = executionEntity34.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement38 = null;
        executionEntity34.setEventSource(pvmProcessElement38);
        executionEntity34.forceUpdate();
        executionEntity34.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = executionEntity34.getReplacedBy();
        java.lang.String str44 = executionEntity34.getTenantId();
        executionEntity18.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity34);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl46 = null;
        executionEntity34.setActivity(activityImpl46);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity34.removeVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(executionEntity19);
        org.junit.Assert.assertNull(pvmProcessElement21);
        org.junit.Assert.assertNull(engineServices22);
        org.junit.Assert.assertNull(eLContext25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(variableInstanceEntityList32);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(executionEntity43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test15132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15132");
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
        boolean boolean12 = executionEntity1.isEnded();
        executionEntity1.setTenantId("ScopeExecution[null]");
        executionEntity1.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity1.getReplacedBy();
        java.lang.String str17 = executionEntity1.getEventName();
        java.lang.String str18 = executionEntity1.getBusinessKey();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(executionEntity16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15133");
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
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl13);
        java.lang.String str15 = executionEntity1.getCurrentActivityId();
        org.activiti.engine.EngineServices engineServices16 = executionEntity1.getEngineServices();
        boolean boolean17 = executionEntity1.isScope();
        int int18 = executionEntity1.getCachedEntityState();
        executionEntity1.setEventName("ProcessInstance[]");
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(activityImpl12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(engineServices16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test15134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15134");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior3);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
    }

    @Test
    public void test15135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15135");
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
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity1.getTransitionBeingTaken();
        executionEntity1.setBusinessKey("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity19.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = null;
        executionEntity19.setCachedElContext(eLContext21);
        executionEntity19.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str25 = executionEntity19.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = executionEntity19.getParent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = executionEntity19.getParent();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        int int29 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.javax.el.ELContext eLContext30 = executionEntity1.getCachedElContext();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList31 = executionEntity1.findActiveActivityIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(transitionImpl15);
        org.junit.Assert.assertNull(executionEntity20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(executionEntity26);
        org.junit.Assert.assertNull(executionEntity27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNull(eLContext30);
    }

    @Test
    public void test15136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15136");
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
        java.lang.String str14 = executionEntity1.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity1.getParent();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl16 = executionEntity1.getTransition();
        java.lang.String str17 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.PvmTransition[] pvmTransitionArray18 = new org.activiti.engine.impl.pvm.PvmTransition[] {};
        java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition> pvmTransitionList19 = new java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList19, pvmTransitionArray18);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl21 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl21);
        executionEntity22.setDeleteReason("hi!");
        java.lang.String str25 = executionEntity22.getCurrentActivityId();
        int int26 = executionEntity22.getRevisionNext();
        java.lang.String str27 = executionEntity22.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = executionEntity22.getParent();
        org.activiti.engine.impl.javax.el.ELContext eLContext29 = executionEntity22.getCachedElContext();
        org.activiti.engine.impl.javax.el.ELContext eLContext30 = null;
        executionEntity22.setCachedElContext(eLContext30);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity32 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList33 = executionEntity22.findInactiveConcurrentExecutions(pvmActivity32);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.takeAll((java.util.List<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList19, activityExecutionList33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ProcessInstance[null]" + "'", str14, "ProcessInstance[null]");
        org.junit.Assert.assertNull(executionEntity15);
        org.junit.Assert.assertNull(transitionImpl16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(pvmTransitionArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(executionEntity28);
        org.junit.Assert.assertNull(eLContext29);
        org.junit.Assert.assertNotNull(activityExecutionList33);
    }

    @Test
    public void test15137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15137");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        java.lang.String str10 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = executionEntity1.getTransitionBeingTaken();
        java.lang.String str12 = executionEntity1.getTenantId();
        executionEntity1.setId("ScopeExecution[null]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = executionEntity1.getVariable("ProcessInstance[]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(transitionImpl11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test15138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15138");
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
        java.lang.String str10 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = null;
        executionEntity1.setTransition(transitionImpl11);
        java.lang.String str13 = executionEntity1.getTenantId();
        executionEntity1.setParentId("hi!");
        executionEntity1.setBusinessKey("ScopeExecution[null]");
        boolean boolean18 = executionEntity1.isSuspended();
        int int19 = executionEntity1.getRevision();
        java.lang.String str20 = executionEntity1.getEventName();
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test15139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15139");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getParentId();
        boolean boolean7 = executionEntity1.isProcessInstanceType();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setDeleteReason("hi!");
        executionEntity9.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray14 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15, variableInstanceEntityArray14);
        executionEntity9.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity9.getParent();
        boolean boolean19 = executionEntity9.isSuspended();
        executionEntity9.forceUpdate();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement21 = executionEntity9.getEventSource();
        org.activiti.engine.impl.javax.el.ELContext eLContext22 = executionEntity9.getCachedElContext();
        executionEntity9.inactivate();
        int int24 = executionEntity9.getRevisionNext();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        executionEntity1.setEventName("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity28 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.executeActivity(pvmActivity28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(executionEntity18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(pvmProcessElement21);
        org.junit.Assert.assertNull(eLContext22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test15140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15140");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        boolean boolean5 = executionEntity1.isConcurrent();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity1.getActivity();
        java.lang.String str8 = executionEntity1.getCurrentActivityName();
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(activityImpl7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test15141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15141");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList8 = executionEntity1.getQueryVariables();
        executionEntity1.setTenantId("ScopeExecution[null]");
        int int11 = executionEntity1.getRevision();
        org.activiti.engine.impl.pvm.PvmProcessDefinition pvmProcessDefinition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.PvmProcessInstance pvmProcessInstance13 = executionEntity1.createSubProcessInstance(pvmProcessDefinition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(variableInstanceEntityList8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test15142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15142");
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
        executionEntity1.setParentId("hi!");
        executionEntity1.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setDeleteReason("hi!");
        executionEntity17.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray22 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList23 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList23, variableInstanceEntityArray22);
        executionEntity17.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList23);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = executionEntity17.getParent();
        boolean boolean27 = executionEntity17.isSuspended();
        executionEntity17.forceUpdate();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement29 = executionEntity17.getEventSource();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList30 = executionEntity17.getQueryVariables();
        java.lang.String str31 = executionEntity17.getDeleteReason();
        java.lang.String str32 = executionEntity17.getId();
        org.activiti.engine.impl.javax.el.ELContext eLContext33 = executionEntity17.getCachedElContext();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        java.lang.String str35 = executionEntity17.getDeleteReason();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity17.insert();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(executionEntity26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(pvmProcessElement29);
        org.junit.Assert.assertNotNull(variableInstanceEntityList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(eLContext33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test15143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15143");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray4 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5, variableInstanceEntityArray4);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5);
        boolean boolean8 = executionEntity1.isEventScope();
        boolean boolean9 = executionEntity1.isDeleteRoot();
        executionEntity1.setEventScope(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution12 = executionEntity1.getStartingExecution();
        java.lang.String str13 = executionEntity1.getDeleteReason();
        org.junit.Assert.assertNotNull(variableInstanceEntityArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(startingExecution12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15144");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        int int1 = executionEntity0.getRevisionNext();
        boolean boolean2 = executionEntity0.isEventScope();
        java.lang.String str3 = executionEntity0.getEventName();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.Class<?> wildcardClass5 = strMap4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test15145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15145");
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
        boolean boolean14 = executionEntity1.isActive();
        int int15 = executionEntity1.getRevision();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext17 = executionEntity1.getCachedElContext();
        executionEntity1.setActive(true);
        executionEntity1.setEventScope(false);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertNotNull(activityExecutionList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(executionEntity16);
        org.junit.Assert.assertNull(eLContext17);
    }

    @Test
    public void test15146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15146");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        java.lang.String str8 = executionEntity1.getParentId();
        executionEntity1.setSuspensionState((int) (byte) -1);
        executionEntity1.setCachedEntityState(1);
        executionEntity1.setTenantId("ScopeExecution[null]");
        boolean boolean15 = executionEntity1.isActive();
        executionEntity1.inactivate();
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test15147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15147");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        int int4 = executionEntity1.getRevisionNext();
        executionEntity1.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity7 = null;
        executionEntity1.removeTask(taskEntity7);
        java.lang.String str9 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        executionEntity1.setActivity(activityImpl10);
        java.lang.String str12 = executionEntity1.getTenantId();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity1.getCompensateEventSubscriptions("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity15 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList16 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity15);
        java.lang.String str17 = executionEntity1.getParentId();
        java.lang.String str18 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl19);
        executionEntity20.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl23 = executionEntity20.getTransition();
        boolean boolean24 = executionEntity20.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl25);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = executionEntity26.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext28 = null;
        executionEntity26.setCachedElContext(eLContext28);
        executionEntity20.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity26);
        executionEntity20.setActive(false);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl33 = executionEntity20.getProcessDefinition();
        java.lang.String str34 = executionEntity20.getSuperExecutionId();
        boolean boolean35 = executionEntity20.isDeleteRoot();
        executionEntity20.setSuspensionState((int) (short) 1);
        executionEntity20.setId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = executionEntity20.getSubProcessInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = executionEntity40.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap41);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(compensateEventSubscriptionEntityList14);
        org.junit.Assert.assertNotNull(activityExecutionList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(transitionImpl23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(executionEntity27);
        org.junit.Assert.assertNull(processDefinitionImpl33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(executionEntity40);
        org.junit.Assert.assertNotNull(strMap41);
    }

    @Test
    public void test15148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15148");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        int int4 = executionEntity1.getRevisionNext();
        executionEntity1.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity7 = null;
        executionEntity1.removeTask(taskEntity7);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity9 = null;
        executionEntity1.addEventSubscription(eventSubscriptionEntity9);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getParent();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity1.getTransitionBeingTaken();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList13 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = null;
        executionEntity1.setTransition(transitionImpl14);
        java.lang.String str16 = executionEntity1.getSuperExecutionId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertNull(transitionImpl12);
        org.junit.Assert.assertNull(variableInstanceEntityList13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15149");
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
            java.lang.String str17 = executionEntity16.getBusinessKey();
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
    public void test15150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15150");
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
        java.lang.String str48 = executionEntity1.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl49 = executionEntity1.getActivity();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl50 = null;
        executionEntity1.setTransition(transitionImpl50);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.end();
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
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(activityImpl49);
    }

    @Test
    public void test15151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15151");
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
        executionEntity7.setId("ProcessInstance[null]");
        executionEntity7.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity7.setProcessDefinitionId("hi!");
        java.lang.String str20 = executionEntity7.getParentId();
        java.lang.String[] strArray28 = new java.lang.String[] { "ScopeExecution[null]", "ProcessInstance[]", "ProcessInstance[ProcessInstance[null]]", "ProcessInstance[]", "ProcessInstance[ProcessInstance[null]]", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity7.removeVariables((java.util.Collection<java.lang.String>) strList29);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test15152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15152");
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
        int int17 = executionEntity1.getCachedEntityState();
        java.lang.String str18 = executionEntity1.getEventName();
        boolean boolean19 = executionEntity1.isScope();
        executionEntity1.inactivate();
        java.lang.String str21 = executionEntity1.getActivityId();
        int int22 = executionEntity1.getSuspensionState();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test15153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15153");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getReplacedBy();
        java.lang.String str9 = executionEntity1.getActivityId();
        executionEntity1.setProcessDefinitionId("");
        executionEntity1.setActive(true);
        java.lang.String str14 = executionEntity1.getProcessInstanceId();
        executionEntity1.setActive(false);
        boolean boolean17 = executionEntity1.isProcessInstanceType();
        executionEntity1.setSuspensionState((int) (byte) 1);
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test15154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15154");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        executionEntity1.setEventScope(false);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.createExecution();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
    }

    @Test
    public void test15155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15155");
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
        executionEntity1.setParentId("");
        org.activiti.engine.impl.javax.el.ELContext eLContext14 = null;
        executionEntity1.setCachedElContext(eLContext14);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity17.getSuperExecution();
        executionEntity17.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl20 = null;
        executionEntity17.setTransitionBeingTaken(transitionImpl20);
        java.lang.String str22 = executionEntity17.getProcessInstanceId();
        executionEntity17.setParentId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity17.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl26 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl26);
        executionEntity27.setRevision(100);
        java.lang.String str30 = executionEntity27.getId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl31 = null;
        executionEntity27.setTransition(transitionImpl31);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = executionEntity34.getSuperExecution();
        executionEntity34.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl37 = null;
        executionEntity34.setTransitionBeingTaken(transitionImpl37);
        java.lang.String str39 = executionEntity34.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl40 = null;
        executionEntity34.setTransition(transitionImpl40);
        boolean boolean42 = executionEntity34.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl43 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity44 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl43);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity45 = executionEntity44.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl46 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity47 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl46);
        executionEntity47.setDeleteReason("hi!");
        executionEntity47.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray52 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList53 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList53, variableInstanceEntityArray52);
        executionEntity47.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList53);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl56 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity57 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl56);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity58 = executionEntity57.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext59 = null;
        executionEntity57.setCachedElContext(eLContext59);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl61 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity62 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl61);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity63 = executionEntity62.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext64 = null;
        executionEntity62.setCachedElContext(eLContext64);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl66 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity67 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl66);
        executionEntity67.setRevision(100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl70 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity71 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl70);
        executionEntity71.setRevision(100);
        executionEntity71.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl76 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity77 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl76);
        executionEntity77.setDeleteReason("hi!");
        java.lang.String str80 = executionEntity77.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement81 = null;
        executionEntity77.setEventSource(pvmProcessElement81);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl83 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity84 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl83);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity85 = executionEntity84.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity86 = executionEntity84.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray87 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity47, executionEntity57, executionEntity62, executionEntity67, executionEntity71, executionEntity77, executionEntity86 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList88 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList88, executionEntityArray87);
        executionEntity44.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList88);
        executionEntity34.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList88);
        executionEntity27.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList88);
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList93 = executionEntity27.getExecutions();
        executionEntity17.setExecutions(executionEntityList93);
        executionEntity1.setExecutions(executionEntityList93);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl96 = null;
        executionEntity1.setActivity(activityImpl96);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(executionEntity18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(executionEntity25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(executionEntity35);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(executionEntity45);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(executionEntity58);
        org.junit.Assert.assertNull(executionEntity63);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNull(executionEntity85);
        org.junit.Assert.assertNull(executionEntity86);
        org.junit.Assert.assertNotNull(executionEntityArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(executionEntityList93);
    }

    @Test
    public void test15156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15156");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        boolean boolean10 = executionEntity1.isActive();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = null;
        executionEntity1.setEventSource(pvmProcessElement11);
        java.lang.String str13 = executionEntity1.getParentId();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15157");
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
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl14 = executionEntity1.getProcessDefinition();
        java.lang.String str15 = executionEntity1.getSuperExecutionId();
        java.util.Collection<java.lang.String> strCollection16 = null;
        executionEntity1.removeVariablesLocal(strCollection16);
        java.lang.String str18 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement19 = executionEntity1.getEventSource();
        java.lang.String str20 = executionEntity1.getSuperExecutionId();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity23 = executionEntity1.addIdentityLink("ProcessInstance[hi!]", "ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertNull(processDefinitionImpl14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(pvmProcessElement19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test15158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15158");
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
        boolean boolean14 = executionEntity6.isConcurrent();
        executionEntity6.setBusinessKey("hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15159");
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
        executionEntity1.setBusinessKey("ProcessInstance[null]");
        org.activiti.engine.EngineServices engineServices17 = executionEntity1.getEngineServices();
        java.lang.String str18 = executionEntity1.getSuperExecutionId();
        executionEntity1.setSuspensionState((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(engineServices17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15160");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        int int4 = executionEntity1.getRevisionNext();
        executionEntity1.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity7 = null;
        executionEntity1.removeTask(taskEntity7);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity9 = null;
        executionEntity1.removeJob(jobEntity9);
        java.lang.String str11 = executionEntity1.getActivityId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement12 = null;
        executionEntity1.setEventSource(pvmProcessElement12);
        java.lang.Object obj14 = executionEntity1.getPersistentState();
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity15 = null;
        executionEntity1.addEventSubscription(eventSubscriptionEntity15);
        java.lang.Object obj17 = executionEntity1.getPersistentState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity19.getSuperExecution();
        executionEntity19.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl22 = null;
        executionEntity19.setTransitionBeingTaken(transitionImpl22);
        java.lang.String str24 = executionEntity19.getProcessInstanceId();
        int int25 = executionEntity19.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = executionEntity19.getReplacedBy();
        java.lang.String str27 = executionEntity19.getActivityId();
        executionEntity19.setProcessDefinitionId("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl30 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl30);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = executionEntity31.getSuperExecution();
        executionEntity31.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl34 = null;
        executionEntity31.setTransitionBeingTaken(transitionImpl34);
        java.lang.String str36 = executionEntity31.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl37 = null;
        executionEntity31.setTransition(transitionImpl37);
        boolean boolean39 = executionEntity31.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl40);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = executionEntity41.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl43 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity44 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl43);
        executionEntity44.setDeleteReason("hi!");
        executionEntity44.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray49 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList50 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList50, variableInstanceEntityArray49);
        executionEntity44.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList50);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl53 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity54 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl53);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity55 = executionEntity54.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext56 = null;
        executionEntity54.setCachedElContext(eLContext56);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl58 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity59 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl58);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity60 = executionEntity59.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext61 = null;
        executionEntity59.setCachedElContext(eLContext61);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl63 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity64 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl63);
        executionEntity64.setRevision(100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl67 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity68 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl67);
        executionEntity68.setRevision(100);
        executionEntity68.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl73 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity74 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl73);
        executionEntity74.setDeleteReason("hi!");
        java.lang.String str77 = executionEntity74.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement78 = null;
        executionEntity74.setEventSource(pvmProcessElement78);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl80 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity81 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl80);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity82 = executionEntity81.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity83 = executionEntity81.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray84 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity44, executionEntity54, executionEntity59, executionEntity64, executionEntity68, executionEntity74, executionEntity83 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList85 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList85, executionEntityArray84);
        executionEntity41.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList85);
        executionEntity31.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList85);
        executionEntity19.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList85);
        executionEntity19.setEventScope(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap92 = executionEntity19.getProcessVariables();
        java.lang.String str93 = executionEntity19.getBusinessKey();
        executionEntity19.setEventName("hi!");
        java.lang.String str96 = executionEntity19.getDeleteReason();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        executionEntity19.setRevision(36);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(executionEntity20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNull(executionEntity26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(executionEntity32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(executionEntity42);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(executionEntity55);
        org.junit.Assert.assertNull(executionEntity60);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNull(executionEntity82);
        org.junit.Assert.assertNull(executionEntity83);
        org.junit.Assert.assertNotNull(executionEntityArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(strMap92);
        org.junit.Assert.assertNull(str93);
        org.junit.Assert.assertNull(str96);
    }

    @Test
    public void test15161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15161");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        executionEntity1.setTenantId("");
        executionEntity1.setActive(false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test15162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15162");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl18 = null;
        executionEntity1.setTransition(transitionImpl18);
        executionEntity1.setCachedEntityState((int) ' ');
        int int22 = executionEntity1.getRevisionNext();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList23 = executionEntity1.getCompensateEventSubscriptions();
        boolean boolean24 = executionEntity1.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity1.getReplacedBy();
        boolean boolean26 = executionEntity1.isEventScope();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.end();
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
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
        org.junit.Assert.assertNotNull(compensateEventSubscriptionEntityList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(executionEntity25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test15163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15163");
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
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl14 = executionEntity1.getProcessDefinition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = executionEntity15.getPersistentState();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertNotNull(activityExecutionList12);
        org.junit.Assert.assertNull(processDefinitionImpl14);
        org.junit.Assert.assertNull(executionEntity15);
    }

    @Test
    public void test15164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15164");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("hi!");
        executionEntity1.forceUpdate();
        java.lang.String str10 = executionEntity1.getSuperExecutionId();
        int int11 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = null;
        executionEntity1.setTransition(transitionImpl12);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        executionEntity15.setDeleteReason("hi!");
        executionEntity15.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray20 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList21 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList21, variableInstanceEntityArray20);
        executionEntity15.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList21);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = executionEntity15.getParent();
        boolean boolean25 = executionEntity15.isSuspended();
        executionEntity15.forceUpdate();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement27 = executionEntity15.getEventSource();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList28 = executionEntity15.getQueryVariables();
        java.lang.String str29 = executionEntity15.getDeleteReason();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement30 = null;
        executionEntity15.setEventSource(pvmProcessElement30);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(executionEntity24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(pvmProcessElement27);
        org.junit.Assert.assertNotNull(variableInstanceEntityList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test15165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15165");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        int int4 = executionEntity1.getRevisionNext();
        boolean boolean5 = executionEntity1.isActive();
        java.lang.String str6 = executionEntity1.getTenantId();
        int int7 = executionEntity1.getRevisionNext();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
    }

    @Test
    public void test15166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15166");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        executionEntity1.setScope(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity1.getQueryVariables();
        boolean boolean8 = executionEntity1.isScope();
        java.lang.String str9 = executionEntity1.getBusinessKey();
        java.lang.String str10 = executionEntity1.getBusinessKey();
        executionEntity1.setEventScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = executionEntity1.getTransition();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity15.getSuperExecution();
        executionEntity15.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl18 = null;
        executionEntity15.setTransitionBeingTaken(transitionImpl18);
        java.lang.String str20 = executionEntity15.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl21 = null;
        executionEntity15.setTransitionBeingTaken(transitionImpl21);
        java.lang.String str23 = executionEntity15.getTenantId();
        executionEntity15.disposeStartingExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext25 = null;
        executionEntity15.setCachedElContext(eLContext25);
        executionEntity15.setDeleteReason("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl29 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl29);
        executionEntity30.setActive(false);
        java.lang.String str33 = executionEntity30.getId();
        executionEntity30.setRevision(2);
        boolean boolean36 = executionEntity30.isSuspended();
        boolean boolean37 = executionEntity30.isDeleteRoot();
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = executionEntity30.getProcessVariables();
        executionEntity15.createVariablesLocal(strMap38);
        executionEntity1.createVariablesLocal(strMap38);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = executionEntity1.createExecution();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertNull(variableInstanceEntityList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(transitionImpl13);
        org.junit.Assert.assertNull(executionEntity16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strMap38);
    }

    @Test
    public void test15167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15167");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList13 = null;
        executionEntity1.setQueryVariables(variableInstanceEntityList13);
        executionEntity1.setCachedEntityState((int) (byte) -1);
        int int17 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl18 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setProcessDefinition(processDefinitionImpl18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test15168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15168");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = null;
        executionEntity1.setTransition(transitionImpl7);
        java.lang.Object obj9 = executionEntity1.getPersistentState();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        executionEntity1.setEventName("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        executionEntity15.setRevision(100);
        int int18 = executionEntity15.getRevisionNext();
        executionEntity15.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity21 = null;
        executionEntity15.removeTask(taskEntity21);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity23 = null;
        executionEntity15.removeJob(jobEntity23);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList25 = executionEntity15.getEventSubscriptions();
        int int26 = executionEntity15.getCachedEntityState();
        java.lang.String str27 = executionEntity15.getBusinessKey();
        executionEntity15.setEventName("");
        java.lang.String str30 = executionEntity15.getActivityId();
        executionEntity1.setSuperExecution(executionEntity15);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(eventSubscriptionEntityList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test15169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15169");
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
        executionEntity1.forceUpdate();
        boolean boolean31 = executionEntity1.isDeleteRoot();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity32 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList33 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity32);
        java.lang.String str34 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl35 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl35);
        executionEntity36.setRevision(100);
        executionEntity36.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl41 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl41);
        executionEntity42.setDeleteReason("hi!");
        java.lang.String str45 = executionEntity42.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement46 = null;
        executionEntity42.setEventSource(pvmProcessElement46);
        java.lang.Object obj48 = executionEntity42.getPersistentState();
        java.lang.String str49 = executionEntity42.getId();
        java.util.Map<java.lang.String, java.lang.Object> strMap50 = executionEntity42.getProcessVariables();
        executionEntity36.setVariablesLocal(strMap50);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity52 = executionEntity36.getReplacedBy();
        org.activiti.engine.impl.javax.el.ELContext eLContext53 = null;
        executionEntity36.setCachedElContext(eLContext53);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement55 = executionEntity36.getEventSource();
        executionEntity36.setScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity58 = executionEntity36.getReplacedBy();
        executionEntity1.setSuperExecution(executionEntity58);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(activityExecutionList33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNull(executionEntity52);
        org.junit.Assert.assertNull(pvmProcessElement55);
        org.junit.Assert.assertNull(executionEntity58);
    }

    @Test
    public void test15170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15170");
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
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 1);
        executionEntity1.setSuspensionState(10);
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
        java.lang.String str65 = executionEntity18.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl66 = executionEntity18.getActivity();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl67 = null;
        executionEntity18.setTransition(transitionImpl67);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        java.lang.String str70 = executionEntity1.getCurrentActivityId();
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(activityImpl12);
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
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(activityImpl66);
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test15171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15171");
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
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 1);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = executionEntity1.getActivity();
        java.lang.Object obj16 = executionEntity1.getPersistentState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = executionEntity1.updateProcessBusinessKey("ConcurrentScopeExecution[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(activityImpl12);
        org.junit.Assert.assertNull(activityImpl15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=10, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test15172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15172");
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
        executionEntity1.setBusinessKey("ProcessInstance[null]");
        boolean boolean23 = executionEntity1.isProcessInstanceType();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test15173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15173");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        int int4 = executionEntity1.getRevisionNext();
        executionEntity1.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity7 = null;
        executionEntity1.removeTask(taskEntity7);
        java.lang.String str9 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setRevision(100);
        int int14 = executionEntity11.getRevisionNext();
        executionEntity11.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity17 = null;
        executionEntity11.removeTask(taskEntity17);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity19 = null;
        executionEntity11.removeJob(jobEntity19);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList21 = executionEntity11.getEventSubscriptions();
        executionEntity1.setSuperExecution(executionEntity11);
        java.lang.String str23 = executionEntity11.getCurrentActivityName();
        java.lang.Object obj24 = executionEntity11.getPersistentState();
        executionEntity11.setConcurrent(false);
        int int27 = executionEntity11.getSuspensionState();
        boolean boolean28 = executionEntity11.isEventScope();
        executionEntity11.setRevision(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertNotNull(eventSubscriptionEntityList21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test15174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15174");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        int int4 = executionEntity1.getRevisionNext();
        executionEntity1.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity7 = null;
        executionEntity1.removeTask(taskEntity7);
        java.lang.String str9 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setRevision(100);
        int int14 = executionEntity11.getRevisionNext();
        executionEntity11.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity17 = null;
        executionEntity11.removeTask(taskEntity17);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity19 = null;
        executionEntity11.removeJob(jobEntity19);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList21 = executionEntity11.getEventSubscriptions();
        executionEntity1.setSuperExecution(executionEntity11);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement23 = null;
        executionEntity1.setEventSource(pvmProcessElement23);
        java.lang.String str25 = executionEntity1.getBusinessKey();
        boolean boolean26 = executionEntity1.isProcessInstanceType();
        executionEntity1.setBusinessKey("ScopeExecution[null]");
        executionEntity1.setSuspensionState(36);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertNotNull(eventSubscriptionEntityList21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test15175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15175");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        boolean boolean7 = executionEntity1.isActive();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setDeleteReason("hi!");
        executionEntity9.setSuspensionState((int) (byte) 10);
        java.lang.String str14 = executionEntity9.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = executionEntity15.getTransition();
        java.lang.String str18 = executionEntity15.getDeleteReason();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = executionEntity15.getTransitionBeingTaken();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl20);
        executionEntity21.setRevision(100);
        java.lang.String str24 = executionEntity21.getId();
        executionEntity15.setSuperExecution(executionEntity21);
        executionEntity1.setSuperExecution(executionEntity21);
        java.lang.String str27 = executionEntity1.getDeleteReason();
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(transitionImpl17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(transitionImpl19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test15176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15176");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getProcessInstanceId();
        java.lang.String str3 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.javax.el.ELContext eLContext4 = executionEntity1.getCachedElContext();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.setTenantId("ProcessInstance[]");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList8 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = null;
        executionEntity1.setCachedElContext(eLContext9);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(eLContext4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(variableInstanceEntityList8);
    }

    @Test
    public void test15177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15177");
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
        boolean boolean16 = executionEntity1.isProcessInstanceType();
        org.activiti.engine.impl.javax.el.ELContext eLContext17 = null;
        executionEntity1.setCachedElContext(eLContext17);
        executionEntity1.setActive(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl21 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl21);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = executionEntity22.getSuperExecution();
        executionEntity22.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl25 = null;
        executionEntity22.setTransitionBeingTaken(transitionImpl25);
        java.lang.String str27 = executionEntity22.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl28 = null;
        executionEntity22.setTransitionBeingTaken(transitionImpl28);
        java.lang.String str30 = executionEntity22.getTenantId();
        executionEntity22.disposeStartingExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext32 = null;
        executionEntity22.setCachedElContext(eLContext32);
        org.activiti.engine.impl.javax.el.ELContext eLContext34 = null;
        executionEntity22.setCachedElContext(eLContext34);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity22);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement37 = executionEntity1.getEventSource();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl38 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity39 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl38);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = executionEntity39.getSuperExecution();
        executionEntity39.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl42 = null;
        executionEntity39.setTransitionBeingTaken(transitionImpl42);
        java.lang.String str44 = executionEntity39.getProcessInstanceId();
        int int45 = executionEntity39.getRevisionNext();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList46 = executionEntity39.getQueryVariables();
        java.lang.String str47 = executionEntity39.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement48 = null;
        executionEntity39.setEventSource(pvmProcessElement48);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity39);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution51 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl52 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity53 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl52);
        executionEntity53.setRevision(100);
        int int56 = executionEntity53.getRevisionNext();
        executionEntity53.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity59 = null;
        executionEntity53.removeTask(taskEntity59);
        java.lang.String str61 = executionEntity53.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl62 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity63 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl62);
        executionEntity63.setRevision(100);
        int int66 = executionEntity63.getRevisionNext();
        executionEntity63.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity69 = null;
        executionEntity63.removeTask(taskEntity69);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity71 = null;
        executionEntity63.removeJob(jobEntity71);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList73 = executionEntity63.getEventSubscriptions();
        executionEntity53.setSuperExecution(executionEntity63);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement75 = null;
        executionEntity53.setEventSource(pvmProcessElement75);
        java.lang.String str77 = executionEntity53.getBusinessKey();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity53);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap79 = executionEntity53.getVariables();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(executionEntity23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(pvmProcessElement37);
        org.junit.Assert.assertNull(executionEntity40);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNull(variableInstanceEntityList46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(startingExecution51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 101 + "'", int56 == 101);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 101 + "'", int66 == 101);
        org.junit.Assert.assertNotNull(eventSubscriptionEntityList73);
        org.junit.Assert.assertNull(str77);
    }

    @Test
    public void test15178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15178");
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
        executionEntity1.setParentId("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setDeleteReason("hi!");
        executionEntity17.setSuspensionState((int) (byte) 10);
        java.lang.String str22 = executionEntity17.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity23);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = executionEntity17.getProcessVariables();
        int int26 = executionEntity17.getRevisionNext();
        boolean boolean27 = executionEntity17.isEnded();
        java.lang.String str28 = executionEntity17.getId();
        boolean boolean29 = executionEntity17.isProcessInstanceType();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl30 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl30);
        executionEntity31.setRevision(100);
        executionEntity31.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity36 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList37 = executionEntity31.findInactiveConcurrentExecutions(pvmActivity36);
        int int38 = executionEntity31.getSuspensionState();
        executionEntity31.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = executionEntity31.getProcessInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = executionEntity31.getProcessVariables();
        executionEntity17.setVariablesLocal(strMap42);
        executionEntity17.setEventScope(true);
        executionEntity17.forceUpdate();
        boolean boolean47 = executionEntity17.isDeleteRoot();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity51 = executionEntity17.involveUser("hi!", "");
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(activityExecutionList37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNull(executionEntity41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test15179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15179");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        int int9 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = executionEntity11.getTransition();
        boolean boolean15 = executionEntity11.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity17.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext19 = null;
        executionEntity17.setCachedElContext(eLContext19);
        executionEntity11.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        executionEntity17.setTenantId("");
        executionEntity17.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity17.getParent();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        executionEntity17.setActive(true);
        org.activiti.engine.impl.javax.el.ELContext eLContext29 = executionEntity17.getCachedElContext();
        java.lang.String str30 = executionEntity17.getDeleteReason();
        executionEntity17.disposeStartingExecution();
        java.lang.String str32 = executionEntity17.getCurrentActivityId();
        boolean boolean33 = executionEntity17.isEnded();
        java.lang.String str34 = executionEntity17.getParentId();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(transitionImpl14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(executionEntity18);
        org.junit.Assert.assertNull(executionEntity25);
        org.junit.Assert.assertNull(eLContext29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test15180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15180");
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
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList22 = executionEntity1.findActiveActivityIds();
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(activityExecutionList17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15181");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        boolean boolean2 = executionEntity1.isDeleteRoot();
        executionEntity1.forceUpdate();
        executionEntity1.setEventName("");
        java.lang.String str6 = executionEntity1.getId();
        java.lang.Object obj7 = executionEntity1.getPersistentState();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, forcedUpdate=true, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, forcedUpdate=true, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, forcedUpdate=true, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test15182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15182");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        boolean boolean9 = executionEntity1.isProcessInstanceType();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = executionEntity1.getProcessVariables();
        java.lang.String str11 = executionEntity1.getProcessDefinitionId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList12 = executionEntity1.getQueryVariables();
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(variableInstanceEntityList12);
    }

    @Test
    public void test15183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15183");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getProcessInstanceId();
        executionEntity1.setTenantId("");
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        executionEntity1.setCachedEntityState(2);
        java.lang.String str9 = executionEntity1.getTenantId();
        executionEntity1.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity1.getSuperExecution();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(executionEntity12);
    }

    @Test
    public void test15184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15184");
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
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setActive(false);
        java.lang.String str21 = executionEntity18.getId();
        executionEntity18.setRevision(2);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = executionEntity18.getProcessVariables();
        executionEntity1.createVariablesLocal(strMap24);
        executionEntity1.setSuspensionState((int) (short) -1);
        executionEntity1.setId("ProcessInstance[hi!]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test15185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15185");
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
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity1.getTransitionBeingTaken();
        boolean boolean16 = executionEntity1.isEventScope();
        executionEntity1.forceUpdate();
        executionEntity1.setBusinessKey("ScopeExecution[null]");
        org.activiti.engine.impl.javax.el.ELContext eLContext20 = executionEntity1.getCachedElContext();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(transitionImpl15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(eLContext20);
    }

    @Test
    public void test15186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15186");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior2);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
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
        executionEntity16.setEventScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl28 = executionEntity16.getActivity();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity29 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList30 = executionEntity16.findInactiveConcurrentExecutions(pvmActivity29);
        boolean boolean31 = executionEntity16.isEnded();
        executionEntity16.setActive(true);
        executionEntity16.setParentId("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl37 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity38 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl37);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity39 = executionEntity38.getSuperExecution();
        executionEntity38.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl41 = null;
        executionEntity38.setTransitionBeingTaken(transitionImpl41);
        java.lang.String str43 = executionEntity38.getProcessInstanceId();
        int int44 = executionEntity38.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity45 = executionEntity38.getReplacedBy();
        java.lang.String str46 = executionEntity38.getActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl47 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity48 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl47);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity49 = executionEntity48.getSuperExecution();
        executionEntity48.inactivate();
        java.lang.String str51 = executionEntity48.getBusinessKey();
        executionEntity48.setBusinessKey("");
        org.activiti.engine.impl.javax.el.ELContext eLContext54 = executionEntity48.getCachedElContext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl55 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity56 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl55);
        executionEntity56.setRevision(100);
        int int59 = executionEntity56.getRevisionNext();
        executionEntity56.setCachedEntityState((int) (short) 0);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList62 = executionEntity56.getEventSubscriptions();
        executionEntity48.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity56);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl64 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity65 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl64);
        executionEntity65.setRevision(100);
        executionEntity65.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity70 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList71 = executionEntity65.findInactiveConcurrentExecutions(pvmActivity70);
        int int72 = executionEntity65.getSuspensionState();
        executionEntity65.setActive(true);
        executionEntity65.setScope(true);
        java.lang.String str77 = executionEntity65.getSuperExecutionId();
        java.lang.String str78 = executionEntity65.getId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl79 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity80 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl79);
        executionEntity80.setDeleteReason("hi!");
        java.lang.String str83 = executionEntity80.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement84 = null;
        executionEntity80.setEventSource(pvmProcessElement84);
        executionEntity80.forceUpdate();
        executionEntity80.setEventScope(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap89 = executionEntity80.getProcessVariables();
        executionEntity65.createVariablesLocal(strMap89);
        executionEntity56.setVariables(strMap89);
        executionEntity38.createVariablesLocal(strMap89);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity16, "ScopeExecution[null]", (java.lang.Object) strMap89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(taskDefinition6);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        org.junit.Assert.assertNull(taskDefinition8);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(activityExecutionList25);
        org.junit.Assert.assertNull(activityImpl28);
        org.junit.Assert.assertNotNull(activityExecutionList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(executionEntity39);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNull(executionEntity45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(executionEntity49);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(eLContext54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 101 + "'", int59 == 101);
        org.junit.Assert.assertNotNull(eventSubscriptionEntityList62);
        org.junit.Assert.assertNotNull(activityExecutionList71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(strMap89);
    }

    @Test
    public void test15187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15187");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity6 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList7 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity6);
        int int8 = executionEntity1.getSuspensionState();
        java.lang.String str9 = executionEntity1.getDeleteReason();
        java.lang.Object obj10 = executionEntity1.getPersistentState();
        executionEntity1.setDeleteReason("ProcessInstance[null]");
        executionEntity1.setConcurrent(true);
        java.lang.String str15 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl16 = executionEntity1.getTransition();
        boolean boolean17 = executionEntity1.isActive();
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(transitionImpl16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test15188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15188");
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
        java.lang.Object obj23 = executionEntity1.getPersistentState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl24 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl24);
        executionEntity25.setRevision(100);
        executionEntity25.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity30 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList31 = executionEntity25.findInactiveConcurrentExecutions(pvmActivity30);
        int int32 = executionEntity25.getSuspensionState();
        java.lang.String str33 = executionEntity25.getDeleteReason();
        java.lang.Object obj34 = executionEntity25.getPersistentState();
        executionEntity25.setDeleteReason("ProcessInstance[null]");
        int int37 = executionEntity25.getCachedEntityState();
        boolean boolean38 = executionEntity25.isEnded();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl39 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl39);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = executionEntity40.getSuperExecution();
        executionEntity40.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl43 = null;
        executionEntity40.setTransitionBeingTaken(transitionImpl43);
        java.lang.String str45 = executionEntity40.getProcessInstanceId();
        int int46 = executionEntity40.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl47 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity48 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl47);
        executionEntity48.setRevision(100);
        executionEntity48.setBusinessKey("");
        executionEntity48.setActive(false);
        executionEntity40.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity48);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl56 = null;
        executionEntity48.setTransition(transitionImpl56);
        executionEntity25.setSuperExecution(executionEntity48);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity48);
        executionEntity48.setCachedEntityState(11);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl62 = null;
        executionEntity48.setTransition(transitionImpl62);
        executionEntity48.setRevision(11);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity66 = executionEntity48.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity67 = executionEntity66.getSubProcessInstance();
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
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 7 + "'", int37 == 7);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(executionEntity41);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNull(executionEntity66);
    }

    @Test
    public void test15189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15189");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList8 = executionEntity1.getQueryVariables();
        java.lang.String str9 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement10 = null;
        executionEntity1.setEventSource(pvmProcessElement10);
        java.lang.String str12 = executionEntity1.getDeleteReason();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap13 = executionEntity1.getVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(variableInstanceEntityList8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15190");
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
        java.lang.String str28 = executionEntity11.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = executionEntity11.getProcessInstance();
        executionEntity11.disposeStartingExecution();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = executionEntity11.getVariableLocal("ProcessInstance[hi!]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(executionEntity12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(executionEntity29);
    }

    @Test
    public void test15191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15191");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setRevision(100);
        int int4 = executionEntity1.getRevisionNext();
        executionEntity1.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity7 = null;
        executionEntity1.removeTask(taskEntity7);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity9 = null;
        executionEntity1.addEventSubscription(eventSubscriptionEntity9);
        executionEntity1.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setRevision(100);
        executionEntity14.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity19 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList20 = executionEntity14.findInactiveConcurrentExecutions(pvmActivity19);
        int int21 = executionEntity14.getSuspensionState();
        java.lang.String str22 = executionEntity14.getDeleteReason();
        java.lang.Object obj23 = executionEntity14.getPersistentState();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        java.lang.String str25 = executionEntity14.getCurrentActivityName();
        java.lang.String str26 = executionEntity14.toString();
        executionEntity14.setConcurrent(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution29 = executionEntity14.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl30 = executionEntity14.getProcessDefinition();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList31 = executionEntity14.getCompensateEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(activityExecutionList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ProcessInstance[null]" + "'", str26, "ProcessInstance[null]");
        org.junit.Assert.assertNotNull(startingExecution29);
        org.junit.Assert.assertNull(processDefinitionImpl30);
    }

    @Test
    public void test15192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15192");
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
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement14 = executionEntity1.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity15.insert();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(activityImpl12);
        org.junit.Assert.assertNull(pvmProcessElement14);
        org.junit.Assert.assertNull(executionEntity15);
    }

    @Test
    public void test15193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15193");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity7.getTransition();
        java.lang.String str10 = executionEntity7.getDeleteReason();
        executionEntity7.setProcessDefinitionId("hi!");
        java.lang.String str13 = executionEntity7.getActivityId();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(transitionImpl9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15194");
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
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl14 = executionEntity1.getProcessDefinition();
        java.lang.String str15 = executionEntity1.getSuperExecutionId();
        boolean boolean16 = executionEntity1.isDeleteRoot();
        boolean boolean17 = executionEntity1.isActive();
        java.lang.String[] strArray20 = new java.lang.String[] { "ConcurrentScopeExecution[null]", "ProcessInstance[hi!]" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables((java.util.Collection<java.lang.String>) strList21);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertNull(processDefinitionImpl14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test15195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15195");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getParent();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity1.getTransitionBeingTaken();
        executionEntity1.setSuspensionState(52);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(startingExecution7);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertNull(transitionImpl9);
    }

    @Test
    public void test15196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15196");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setRevision(100);
        executionEntity18.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity23 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList24 = executionEntity18.findInactiveConcurrentExecutions(pvmActivity23);
        int int25 = executionEntity18.getSuspensionState();
        executionEntity18.setActive(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl28 = executionEntity18.getTransition();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl29 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl29);
        executionEntity30.setDeleteReason("hi!");
        executionEntity30.setSuspensionState((int) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = executionEntity30.getProcessVariables();
        executionEntity18.setVariablesLocal(strMap35);
        java.lang.String str37 = executionEntity18.getEventName();
        boolean boolean38 = executionEntity18.isConcurrent();
        int int39 = executionEntity18.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl41 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl41);
        executionEntity42.setDeleteReason("hi!");
        java.lang.String str45 = executionEntity42.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement46 = null;
        executionEntity42.setEventSource(pvmProcessElement46);
        java.lang.Object obj48 = executionEntity42.getPersistentState();
        java.lang.String str49 = executionEntity42.getId();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity50 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList51 = executionEntity42.findInactiveConcurrentExecutions(pvmActivity50);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl52 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity53 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl52);
        executionEntity53.setRevision(100);
        executionEntity53.setBusinessKey("");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity58 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList59 = executionEntity53.findInactiveConcurrentExecutions(pvmActivity58);
        java.lang.String str60 = executionEntity53.getParentId();
        executionEntity53.setSuspensionState((int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> strMap63 = executionEntity53.getProcessVariables();
        executionEntity42.setVariables(strMap63);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity18, "ProcessInstance[ProcessInstance[null]]", (java.lang.Object) executionEntity42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        org.junit.Assert.assertNull(taskDefinition5);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        org.junit.Assert.assertNull(taskDefinition12);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        org.junit.Assert.assertNull(taskDefinition14);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        org.junit.Assert.assertNull(taskDefinition16);
        org.junit.Assert.assertNotNull(activityExecutionList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(transitionImpl28);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 7 + "'", int39 == 7);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(activityExecutionList51);
        org.junit.Assert.assertNotNull(activityExecutionList59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(strMap63);
    }

    @Test
    public void test15197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15197");
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
        org.activiti.engine.impl.javax.el.ELContext eLContext13 = null;
        executionEntity1.setCachedElContext(eLContext13);
        java.lang.String str15 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setRevision(100);
        java.lang.String str21 = executionEntity18.getId();
        org.activiti.engine.impl.javax.el.ELContext eLContext22 = null;
        executionEntity18.setCachedElContext(eLContext22);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement24 = null;
        executionEntity18.setEventSource(pvmProcessElement24);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity26 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList27 = executionEntity18.findInactiveConcurrentExecutions(pvmActivity26);
        java.lang.Object obj28 = executionEntity18.getPersistentState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = executionEntity1.setVariableLocal("hi!", obj28);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(activityExecutionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(activityExecutionList27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test15198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15198");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setSuspensionState((int) (byte) 10);
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        executionEntity1.setTenantId("");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement9 = null;
        executionEntity1.setEventSource(pvmProcessElement9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = executionEntity1.getVariable("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test15199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15199");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        executionEntity1.forceUpdate();
        executionEntity1.setEventScope(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = executionEntity1.getProcessVariables();
        boolean boolean11 = executionEntity1.isActive();
        java.lang.String str12 = executionEntity1.getProcessDefinitionId();
        executionEntity1.setRevision(100);
        java.lang.String str15 = executionEntity1.getActivityId();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15200");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessInstanceId();
        int int7 = executionEntity1.getRevisionNext();
        executionEntity1.setConcurrent(false);
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
        java.lang.String str27 = executionEntity11.toString();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl28 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl28);
        executionEntity29.setRevision(100);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray32 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList33 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList33, variableInstanceEntityArray32);
        executionEntity29.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList33);
        executionEntity11.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList33);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl37 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity38 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl37);
        executionEntity38.setRevision(100);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray41 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList42 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList42, variableInstanceEntityArray41);
        executionEntity38.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList42);
        boolean boolean45 = executionEntity38.isEventScope();
        boolean boolean46 = executionEntity38.isDeleteRoot();
        org.activiti.engine.impl.pvm.runtime.InterpretableExecution interpretableExecution47 = null;
        executionEntity38.setProcessInstance(interpretableExecution47);
        executionEntity38.setConcurrent(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList51 = executionEntity38.getQueryVariables();
        executionEntity11.setQueryVariables(variableInstanceEntityList51);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList53 = executionEntity11.getQueryVariables();
        executionEntity1.setQueryVariables(variableInstanceEntityList53);
        boolean boolean55 = executionEntity1.isSuspended();
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(executionEntity12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ProcessInstance[null]" + "'", str27, "ProcessInstance[null]");
        org.junit.Assert.assertNotNull(variableInstanceEntityArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(variableInstanceEntityList51);
        org.junit.Assert.assertNotNull(variableInstanceEntityList53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test15201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15201");
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
        boolean boolean13 = executionEntity7.isActive();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl14 = executionEntity7.getProcessDefinition();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(transitionImpl9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(processDefinitionImpl14);
    }

    @Test
    public void test15202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15202");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setDeleteReason("hi!");
        java.lang.String str4 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = null;
        executionEntity1.setEventSource(pvmProcessElement5);
        java.lang.Object obj7 = executionEntity1.getPersistentState();
        executionEntity1.setProcessDefinitionId("");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = executionEntity1.getQueryVariables();
        int int11 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setRevision(100);
        java.lang.String str16 = executionEntity13.getId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = null;
        executionEntity13.setTransition(transitionImpl17);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl19);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity20.getSuperExecution();
        executionEntity20.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl23 = null;
        executionEntity20.setTransitionBeingTaken(transitionImpl23);
        java.lang.String str25 = executionEntity20.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl26 = null;
        executionEntity20.setTransition(transitionImpl26);
        boolean boolean28 = executionEntity20.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl29 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl29);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = executionEntity30.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl32 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl32);
        executionEntity33.setDeleteReason("hi!");
        executionEntity33.setSuspensionState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray38 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList39 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList39, variableInstanceEntityArray38);
        executionEntity33.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList39);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl42 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl42);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity44 = executionEntity43.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext45 = null;
        executionEntity43.setCachedElContext(eLContext45);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl47 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity48 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl47);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity49 = executionEntity48.getSuperExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext50 = null;
        executionEntity48.setCachedElContext(eLContext50);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl52 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity53 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl52);
        executionEntity53.setRevision(100);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl56 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity57 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl56);
        executionEntity57.setRevision(100);
        executionEntity57.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl62 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity63 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl62);
        executionEntity63.setDeleteReason("hi!");
        java.lang.String str66 = executionEntity63.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement67 = null;
        executionEntity63.setEventSource(pvmProcessElement67);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl69 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity70 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl69);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity71 = executionEntity70.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity72 = executionEntity70.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray73 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity33, executionEntity43, executionEntity48, executionEntity53, executionEntity57, executionEntity63, executionEntity72 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList74 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList74, executionEntityArray73);
        executionEntity30.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList74);
        executionEntity20.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList74);
        executionEntity13.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList74);
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList79 = executionEntity13.getExecutions();
        executionEntity1.setExecutions(executionEntityList79);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(variableInstanceEntityList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(executionEntity21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(executionEntity31);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(executionEntity44);
        org.junit.Assert.assertNull(executionEntity49);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(executionEntity71);
        org.junit.Assert.assertNull(executionEntity72);
        org.junit.Assert.assertNotNull(executionEntityArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(executionEntityList79);
    }
}

