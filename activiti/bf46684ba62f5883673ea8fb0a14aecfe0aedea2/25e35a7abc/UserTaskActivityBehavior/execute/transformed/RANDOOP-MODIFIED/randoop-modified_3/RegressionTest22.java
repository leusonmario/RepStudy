import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22 {

    public static boolean debug = false;

    @Test
    public void test11001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11001");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        java.lang.String str7 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj9 = executionEntity8.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        java.lang.String str13 = executionEntity10.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        java.lang.String str16 = executionEntity15.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        boolean boolean20 = executionEntity17.isConcurrent();
        executionEntity17.setEventScope(true);
        executionEntity15.setSuperExecution(executionEntity17);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = executionEntity15.getProcessVariables();
        executionEntity10.setVariablesLocal(strMap24);
        executionEntity8.setVariables(strMap24);
        boolean boolean27 = executionEntity8.isEnded();
        java.lang.String str28 = executionEntity8.getCurrentActivityName();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity29 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList30 = executionEntity8.findInactiveConcurrentExecutions(pvmActivity29);
        executionEntity0.setSuperExecution(executionEntity8);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity32.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity33);
        java.lang.String str35 = executionEntity32.getProcessDefinitionId();
        boolean boolean36 = executionEntity32.isDeleteRoot();
        executionEntity32.setCachedEntityState(100);
        executionEntity32.setConcurrent(true);
        executionEntity32.setRevision(10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj44 = executionEntity43.getPersistentState();
        executionEntity43.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement47 = executionEntity43.getEventSource();
        executionEntity43.setSuspensionState((int) (byte) 100);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl50 = null;
        executionEntity43.setTransitionBeingTaken(transitionImpl50);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity52 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj53 = executionEntity52.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity54 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList55 = executionEntity52.findInactiveConcurrentExecutions(pvmActivity54);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement56 = executionEntity52.getEventSource();
        boolean boolean57 = executionEntity52.isConcurrent();
        java.lang.String str58 = executionEntity52.getCurrentActivityId();
        executionEntity52.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity61 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity62 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity61.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity62);
        java.lang.String str64 = executionEntity61.getProcessInstanceId();
        int int65 = executionEntity61.getRevision();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray66 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList67 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList67, variableInstanceEntityArray66);
        executionEntity61.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList67);
        executionEntity52.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList67);
        executionEntity43.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList67);
        executionEntity32.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList67);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList67);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity0.removeVariable("ProcessInstance[ScopeExecution[null]]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ProcessInstance[null]" + "'", str7, "ProcessInstance[null]");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(activityExecutionList30);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(pvmProcessElement47);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList55);
        org.junit.Assert.assertNull(pvmProcessElement56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity2 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList3 = executionEntity0.findInactiveConcurrentExecutions(pvmActivity2);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        boolean boolean5 = executionEntity0.isActive();
        boolean boolean6 = executionEntity0.isConcurrent();
        int int7 = executionEntity0.getRevisionNext();
        executionEntity0.setCachedEntityState(2);
        executionEntity0.setParentId("");
        org.activiti.engine.EngineServices engineServices12 = executionEntity0.getEngineServices();
        executionEntity0.setEventName("");
        java.lang.String str15 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = executionEntity0.getCachedElContext();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList17 = null;
        executionEntity0.setQueryVariables(variableInstanceEntityList17);
        executionEntity0.forceUpdate();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList3);
        org.junit.Assert.assertNull(pvmProcessElement4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(engineServices12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(eLContext16);
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = null;
        executionEntity0.setTransitionBeingTaken(transitionImpl6);
        java.lang.String str8 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj10 = executionEntity9.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity11 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList12 = executionEntity9.findInactiveConcurrentExecutions(pvmActivity11);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = executionEntity9.getEventSource();
        boolean boolean14 = executionEntity9.isActive();
        boolean boolean15 = executionEntity9.isConcurrent();
        int int16 = executionEntity9.getRevisionNext();
        executionEntity9.setScope(false);
        executionEntity0.setSuperExecution(executionEntity9);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
        boolean boolean23 = executionEntity20.isConcurrent();
        executionEntity20.setEventScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = executionEntity20.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj28 = executionEntity27.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity29 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList30 = executionEntity27.findInactiveConcurrentExecutions(pvmActivity29);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement31 = executionEntity27.getEventSource();
        boolean boolean32 = executionEntity27.isConcurrent();
        executionEntity20.setSuperExecution(executionEntity27);
        java.lang.Object obj34 = executionEntity20.getPersistentState();
        java.lang.String str35 = executionEntity20.getName();
        org.activiti.engine.impl.javax.el.ELContext eLContext36 = executionEntity20.getCachedElContext();
        executionEntity0.setSuperExecution(executionEntity20);
        java.lang.String str38 = executionEntity0.getId();
        executionEntity0.setSuspensionState(33);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ProcessInstance[null]" + "'", str8, "ProcessInstance[null]");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList12);
        org.junit.Assert.assertNull(pvmProcessElement13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(executionEntity26);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList30);
        org.junit.Assert.assertNull(pvmProcessElement31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=true, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=true, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=true, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(eLContext36);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setTenantId("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        executionEntity0.setActivity(activityImpl8);
        executionEntity0.disposeStartingExecution();
        boolean boolean11 = executionEntity0.isEnded();
        boolean boolean12 = executionEntity0.isDeleteRoot();
        boolean boolean13 = executionEntity0.isSuspended();
        java.lang.String str14 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity0.getParent();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity0.createExecution();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(executionEntity15);
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        java.lang.String str6 = executionEntity5.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        boolean boolean10 = executionEntity7.isConcurrent();
        executionEntity7.setEventScope(true);
        executionEntity5.setSuperExecution(executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity5.getProcessVariables();
        executionEntity0.setVariablesLocal(strMap14);
        java.lang.String str16 = executionEntity0.getTenantId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity0.getProcessInstance();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement18 = null;
        executionEntity0.setEventSource(pvmProcessElement18);
        boolean boolean20 = executionEntity0.isEnded();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = executionEntity0.getSuperExecution();
        int int23 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity24.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity25);
        boolean boolean27 = executionEntity24.isConcurrent();
        java.lang.String str28 = executionEntity24.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj30 = executionEntity29.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity31.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity32);
        java.lang.String str34 = executionEntity31.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl35 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl35);
        java.lang.String str37 = executionEntity36.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity38 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity39 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity38.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity39);
        boolean boolean41 = executionEntity38.isConcurrent();
        executionEntity38.setEventScope(true);
        executionEntity36.setSuperExecution(executionEntity38);
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = executionEntity36.getProcessVariables();
        executionEntity31.setVariablesLocal(strMap45);
        executionEntity29.setVariables(strMap45);
        executionEntity24.createVariablesLocal(strMap45);
        boolean boolean49 = executionEntity24.isEnded();
        executionEntity24.setProcessDefinitionId("ProcessInstance[null]");
        boolean boolean52 = executionEntity24.isActive();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution53 = executionEntity24.getStartingExecution();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity54 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList55 = executionEntity24.findInactiveConcurrentExecutions(pvmActivity54);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl56 = executionEntity24.getTransition();
        boolean boolean57 = executionEntity24.isEnded();
        java.lang.String str58 = executionEntity24.getTenantId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl59 = null;
        executionEntity24.setActivity(activityImpl59);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        boolean boolean62 = executionEntity0.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity64 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity65 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity64.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity65);
        java.lang.String str67 = executionEntity64.getProcessInstanceId();
        int int68 = executionEntity64.getRevision();
        java.lang.String str69 = executionEntity64.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl70 = null;
        executionEntity64.setTransitionBeingTaken(transitionImpl70);
        java.lang.String str72 = executionEntity64.getProcessDefinitionId();
        org.activiti.engine.impl.javax.el.ELContext eLContext73 = executionEntity64.getCachedElContext();
        java.lang.Object obj74 = executionEntity64.getPersistentState();
        int int75 = executionEntity64.getCachedEntityState();
        java.lang.String str76 = executionEntity64.getCurrentActivityName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj77 = executionEntity0.setVariableLocal("ProcessInstance[null]", (java.lang.Object) executionEntity64);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(executionEntity17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(executionEntity22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(startingExecution53);
        org.junit.Assert.assertNotNull(activityExecutionList55);
        org.junit.Assert.assertNull(transitionImpl56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(eLContext73);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertEquals(obj74.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj74), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj74), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 7 + "'", int75 == 7);
        org.junit.Assert.assertNull(str76);
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj5 = executionEntity4.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity6.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.lang.String str9 = executionEntity6.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        java.lang.String str12 = executionEntity11.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        boolean boolean16 = executionEntity13.isConcurrent();
        executionEntity13.setEventScope(true);
        executionEntity11.setSuperExecution(executionEntity13);
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = executionEntity11.getProcessVariables();
        executionEntity6.setVariablesLocal(strMap20);
        executionEntity4.setVariables(strMap20);
        executionEntity1.setVariables(strMap20);
        java.lang.String str24 = executionEntity1.getName();
        java.lang.String str25 = executionEntity1.getProcessInstanceId();
        boolean boolean26 = executionEntity1.isProcessInstanceType();
        executionEntity1.disposeStartingExecution();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = executionEntity1.createExecution();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity2 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList3 = executionEntity0.findInactiveConcurrentExecutions(pvmActivity2);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        boolean boolean5 = executionEntity0.isActive();
        boolean boolean6 = executionEntity0.isConcurrent();
        int int7 = executionEntity0.getRevisionNext();
        executionEntity0.setCachedEntityState(2);
        java.lang.String str10 = executionEntity0.getActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj12 = executionEntity11.getPersistentState();
        executionEntity11.setScope(true);
        int int15 = executionEntity11.getCachedEntityState();
        int int16 = executionEntity11.getRevisionNext();
        executionEntity11.setTenantId("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        executionEntity11.setActivity(activityImpl19);
        executionEntity11.setTenantId("");
        executionEntity0.setSuperExecution(executionEntity11);
        java.lang.String str24 = executionEntity11.getDeleteReason();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj26 = executionEntity25.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity27 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList28 = executionEntity25.findInactiveConcurrentExecutions(pvmActivity27);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement29 = executionEntity25.getEventSource();
        boolean boolean30 = executionEntity25.isActive();
        boolean boolean31 = executionEntity25.isConcurrent();
        int int32 = executionEntity25.getRevisionNext();
        executionEntity25.setCachedEntityState(2);
        executionEntity25.setParentId("");
        boolean boolean37 = executionEntity25.isEventScope();
        java.lang.String str38 = executionEntity25.getDeleteReason();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList39 = executionEntity25.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity40 = null;
        executionEntity25.removeJob(jobEntity40);
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = executionEntity25.getProcessVariables();
        executionEntity11.createVariablesLocal(strMap42);
        java.lang.String str44 = executionEntity11.toString();
        executionEntity11.setBusinessKey("ScopeExecution[]");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList3);
        org.junit.Assert.assertNull(pvmProcessElement4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList28);
        org.junit.Assert.assertNull(pvmProcessElement29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(variableInstanceEntityList39);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ProcessInstance[null]" + "'", str44, "ProcessInstance[null]");
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        java.util.List<java.lang.String> strList2 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        java.lang.String str10 = executionEntity7.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = executionEntity7.getProcessVariables();
        boolean boolean12 = executionEntity7.isProcessInstanceType();
        boolean boolean13 = executionEntity7.isSuspended();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior0.handleAssignments(taskEntity6, (org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNull(taskDefinition3);
        org.junit.Assert.assertNull(taskDefinition4);
        org.junit.Assert.assertNull(taskDefinition5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity2 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList3 = executionEntity0.findInactiveConcurrentExecutions(pvmActivity2);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        boolean boolean5 = executionEntity0.isActive();
        boolean boolean6 = executionEntity0.isConcurrent();
        int int7 = executionEntity0.getRevisionNext();
        executionEntity0.setCachedEntityState(2);
        executionEntity0.setParentId("");
        org.activiti.engine.EngineServices engineServices12 = executionEntity0.getEngineServices();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList13 = executionEntity0.getQueryVariables();
        int int14 = executionEntity0.getCachedEntityState();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList3);
        org.junit.Assert.assertNull(pvmProcessElement4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(engineServices12);
        org.junit.Assert.assertNull(variableInstanceEntityList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("");
        java.lang.String str10 = executionEntity1.getBusinessKey();
        executionEntity1.setDeleteReason("");
        int int13 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = executionEntity1.getTransitionBeingTaken();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNull(engineServices4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(transitionImpl14);
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity2 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList3 = executionEntity0.findInactiveConcurrentExecutions(pvmActivity2);
        executionEntity0.setParentId("");
        java.lang.Object obj6 = executionEntity0.getPersistentState();
        java.lang.String str8 = executionEntity0.updateProcessBusinessKey("hi!");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList9 = executionEntity0.getQueryVariables();
        executionEntity0.setSuspensionState((int) '#');
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = null;
        executionEntity0.setTransition(transitionImpl12);
        java.lang.String str14 = executionEntity0.toString();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement15 = executionEntity0.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity16.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        java.lang.String str19 = executionEntity16.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = executionEntity16.getProcessVariables();
        boolean boolean21 = executionEntity16.isProcessInstanceType();
        java.lang.String str22 = executionEntity16.getSuperExecutionId();
        java.lang.String str23 = executionEntity16.getSuperExecutionId();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        java.lang.String str25 = executionEntity16.toString();
        boolean boolean26 = executionEntity16.isEnded();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity16.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(variableInstanceEntityList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ScopeExecution[null]" + "'", str14, "ScopeExecution[null]");
        org.junit.Assert.assertNull(pvmProcessElement15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ProcessInstance[null]" + "'", str25, "ProcessInstance[null]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj5 = executionEntity4.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity6.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.lang.String str9 = executionEntity6.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        java.lang.String str12 = executionEntity11.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        boolean boolean16 = executionEntity13.isConcurrent();
        executionEntity13.setEventScope(true);
        executionEntity11.setSuperExecution(executionEntity13);
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = executionEntity11.getProcessVariables();
        executionEntity6.setVariablesLocal(strMap20);
        executionEntity4.setVariables(strMap20);
        executionEntity1.setVariables(strMap20);
        executionEntity1.setTenantId("hi!");
        executionEntity1.setBusinessKey("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        java.lang.String str7 = executionEntity0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity0.getProcessVariables();
        executionEntity0.setParentId("");
        int int11 = executionEntity0.getRevision();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ProcessInstance[null]" + "'", str7, "ProcessInstance[null]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj6 = executionEntity5.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        java.lang.String str10 = executionEntity7.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        java.lang.String str13 = executionEntity12.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity14.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        boolean boolean17 = executionEntity14.isConcurrent();
        executionEntity14.setEventScope(true);
        executionEntity12.setSuperExecution(executionEntity14);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = executionEntity12.getProcessVariables();
        executionEntity7.setVariablesLocal(strMap21);
        executionEntity5.setVariables(strMap21);
        executionEntity0.createVariablesLocal(strMap21);
        boolean boolean25 = executionEntity0.isEnded();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl26 = null;
        executionEntity0.setTransition(transitionImpl26);
        org.activiti.engine.EngineServices engineServices28 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity29 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity0.executeActivity(pvmActivity29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(engineServices28);
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity2 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList3 = executionEntity0.findInactiveConcurrentExecutions(pvmActivity2);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        boolean boolean5 = executionEntity0.isActive();
        boolean boolean6 = executionEntity0.isConcurrent();
        int int7 = executionEntity0.getRevisionNext();
        executionEntity0.setCachedEntityState(2);
        executionEntity0.setParentId("");
        java.lang.String str12 = executionEntity0.getSuperExecutionId();
        executionEntity0.setEventScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        executionEntity0.setActivity(activityImpl15);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        int int20 = executionEntity18.getRevisionNext();
        org.activiti.engine.EngineServices engineServices21 = executionEntity18.getEngineServices();
        executionEntity18.setScope(false);
        int int24 = executionEntity18.getRevision();
        boolean boolean25 = executionEntity18.isScope();
        executionEntity18.setEventScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl28 = null;
        executionEntity18.setTransition(transitionImpl28);
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        java.lang.String str31 = executionEntity18.getParentId();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList3);
        org.junit.Assert.assertNull(pvmProcessElement4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(engineServices21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        executionEntity1.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj7 = executionEntity6.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.lang.String str11 = executionEntity8.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        java.lang.String str14 = executionEntity13.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        boolean boolean18 = executionEntity15.isConcurrent();
        executionEntity15.setEventScope(true);
        executionEntity13.setSuperExecution(executionEntity15);
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = executionEntity13.getProcessVariables();
        executionEntity8.setVariablesLocal(strMap22);
        executionEntity6.setVariables(strMap22);
        boolean boolean25 = executionEntity6.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity26.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity27);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = executionEntity27.getSuperExecution();
        java.lang.String str30 = executionEntity27.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl31 = executionEntity27.getTransitionBeingTaken();
        executionEntity6.setSuperExecution(executionEntity27);
        int int33 = executionEntity6.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = executionEntity6.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.signal("ProcessInstance[ScopeExecution[null]]", (java.lang.Object) executionEntity34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(executionEntity29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(transitionImpl31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(executionEntity34);
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity2 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList3 = executionEntity0.findInactiveConcurrentExecutions(pvmActivity2);
        executionEntity0.setParentId("");
        java.lang.Object obj6 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj8 = executionEntity7.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity9 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList10 = executionEntity7.findInactiveConcurrentExecutions(pvmActivity9);
        executionEntity7.setParentId("");
        java.lang.Object obj13 = executionEntity7.getPersistentState();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution14 = executionEntity7.getStartingExecution();
        java.lang.String str15 = executionEntity7.toString();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl16 = null;
        executionEntity7.setTransitionBeingTaken(transitionImpl16);
        org.activiti.engine.impl.javax.el.ELContext eLContext18 = executionEntity7.getCachedElContext();
        boolean boolean19 = executionEntity7.isEventScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.lang.String str21 = executionEntity7.getCurrentActivityName();
        executionEntity7.setName("hi!");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertNull(startingExecution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ScopeExecution[null]" + "'", str15, "ScopeExecution[null]");
        org.junit.Assert.assertNull(eLContext18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity2 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList3 = executionEntity0.findInactiveConcurrentExecutions(pvmActivity2);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        boolean boolean5 = executionEntity0.isActive();
        boolean boolean6 = executionEntity0.isConcurrent();
        int int7 = executionEntity0.getRevisionNext();
        executionEntity0.setCachedEntityState(2);
        boolean boolean10 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj12 = executionEntity11.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity13 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList14 = executionEntity11.findInactiveConcurrentExecutions(pvmActivity13);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement15 = executionEntity11.getEventSource();
        boolean boolean16 = executionEntity11.isActive();
        boolean boolean17 = executionEntity11.isConcurrent();
        int int18 = executionEntity11.getRevisionNext();
        executionEntity11.setCachedEntityState(2);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity21.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity22);
        java.lang.String str24 = executionEntity21.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = executionEntity21.getProcessVariables();
        executionEntity11.setVariablesLocal(strMap25);
        executionEntity0.createVariablesLocal(strMap25);
        org.activiti.engine.impl.javax.el.ELContext eLContext28 = executionEntity0.getCachedElContext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl29 = executionEntity0.getTransitionBeingTaken();
        boolean boolean30 = executionEntity0.isActive();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl31 = executionEntity0.getActivity();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList3);
        org.junit.Assert.assertNull(pvmProcessElement4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList14);
        org.junit.Assert.assertNull(pvmProcessElement15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(eLContext28);
        org.junit.Assert.assertNull(transitionImpl29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(activityImpl31);
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList4 = userTaskActivityBehavior1.extractCandidates("");
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.taskDefinition;
        org.junit.Assert.assertNull(taskDefinition2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNull(taskDefinition7);
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray5 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList6, variableInstanceEntityArray5);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList6);
        executionEntity0.setParentId("");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setRevision((int) (short) 100);
        boolean boolean14 = executionEntity0.isEnded();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        java.lang.String str18 = executionEntity15.getProcessDefinitionId();
        boolean boolean19 = executionEntity15.isDeleteRoot();
        executionEntity15.setCachedEntityState(100);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        java.lang.Object obj23 = executionEntity15.getPersistentState();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList24 = executionEntity15.getCompensateEventSubscriptions();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior25 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        java.util.List<java.lang.String> strList27 = userTaskActivityBehavior25.extractCandidates("");
        java.util.List<java.lang.String> strList29 = userTaskActivityBehavior25.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior30 = null;
        userTaskActivityBehavior25.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior30);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior32 = userTaskActivityBehavior25.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList34 = userTaskActivityBehavior25.extractCandidates("ProcessInstance[null]");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior35 = null;
        userTaskActivityBehavior25.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior35);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition37 = userTaskActivityBehavior25.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition38 = userTaskActivityBehavior25.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition39 = userTaskActivityBehavior25.taskDefinition;
        java.util.List<java.lang.String> strList41 = userTaskActivityBehavior25.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition42 = null;
        userTaskActivityBehavior25.taskDefinition = taskDefinition42;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior44 = userTaskActivityBehavior25.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList46 = userTaskActivityBehavior25.extractCandidates("");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity15.removeVariablesLocal((java.util.Collection<java.lang.String>) strList46);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(transitionImpl11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=100, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=100, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=100, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(compensateEventSubscriptionEntityList24);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNull(taskDefinition37);
        org.junit.Assert.assertNull(taskDefinition38);
        org.junit.Assert.assertNull(taskDefinition39);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior44);
        org.junit.Assert.assertNotNull(strList46);
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = executionEntity11.getTransition();
        executionEntity1.setSuperExecution(executionEntity11);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        java.lang.String str19 = executionEntity18.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
        boolean boolean23 = executionEntity20.isConcurrent();
        executionEntity20.setEventScope(true);
        executionEntity18.setSuperExecution(executionEntity20);
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = executionEntity18.getProcessVariables();
        executionEntity16.setVariablesLocal(strMap27);
        executionEntity11.setVariablesLocal(strMap27);
        java.lang.String str30 = executionEntity11.getProcessInstanceId();
        executionEntity11.disposeStartingExecution();
        boolean boolean32 = executionEntity11.isSuspended();
        boolean boolean33 = executionEntity11.isEnded();
        executionEntity11.setTenantId("ProcessInstance[null]");
        org.activiti.engine.EngineServices engineServices36 = executionEntity11.getEngineServices();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNull(engineServices4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(transitionImpl13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(engineServices36);
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity2 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList3 = executionEntity0.findInactiveConcurrentExecutions(pvmActivity2);
        executionEntity0.setParentId("");
        java.lang.Object obj6 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        int int8 = executionEntity0.getRevisionNext();
        executionEntity0.setConcurrent(false);
        executionEntity0.setActive(false);
        executionEntity0.setEventScope(false);
        int int15 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj17 = executionEntity16.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity18 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList19 = executionEntity16.findInactiveConcurrentExecutions(pvmActivity18);
        executionEntity16.setParentId("");
        java.lang.Object obj22 = executionEntity16.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity23.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        int int26 = executionEntity24.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj28 = executionEntity27.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity29.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity30);
        java.lang.String str32 = executionEntity29.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        java.lang.String str35 = executionEntity34.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity37 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity36.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity37);
        boolean boolean39 = executionEntity36.isConcurrent();
        executionEntity36.setEventScope(true);
        executionEntity34.setSuperExecution(executionEntity36);
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = executionEntity34.getProcessVariables();
        executionEntity29.setVariablesLocal(strMap43);
        executionEntity27.setVariables(strMap43);
        executionEntity24.setVariables(strMap43);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution47 = executionEntity24.getStartingExecution();
        executionEntity16.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        java.lang.String str49 = executionEntity24.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity50 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity51 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity50.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity51);
        java.lang.String str53 = executionEntity50.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap54 = executionEntity50.getProcessVariables();
        executionEntity24.createVariablesLocal(strMap54);
        executionEntity0.createVariablesLocal(strMap54);
        boolean boolean57 = executionEntity0.isActive();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity0.removeVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertNull(startingExecution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNull(startingExecution47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity2 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList3 = executionEntity0.findInactiveConcurrentExecutions(pvmActivity2);
        executionEntity0.setParentId("");
        java.lang.Object obj6 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        java.lang.String str8 = executionEntity0.toString();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity0.getProcessDefinition();
        java.lang.String str11 = executionEntity0.updateProcessBusinessKey("ProcessInstance[null]");
        java.lang.String str12 = executionEntity0.getId();
        java.lang.String str13 = executionEntity0.getEventName();
        java.lang.String str14 = executionEntity0.getBusinessKey();
        executionEntity0.setEventName("ProcessInstance[]");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity0.removeVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertNull(startingExecution7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ScopeExecution[null]" + "'", str8, "ScopeExecution[null]");
        org.junit.Assert.assertNull(processDefinitionImpl9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        boolean boolean6 = executionEntity3.isConcurrent();
        java.lang.String str7 = executionEntity3.getId();
        executionEntity0.setSuperExecution(executionEntity3);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        java.lang.String str11 = executionEntity10.getCurrentActivityName();
        executionEntity10.inactivate();
        executionEntity3.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        java.lang.String str14 = executionEntity3.getCurrentActivityName();
        java.lang.String str15 = executionEntity3.getProcessInstanceId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity2.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        java.lang.String str5 = executionEntity2.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        java.lang.String str8 = executionEntity7.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        boolean boolean12 = executionEntity9.isConcurrent();
        executionEntity9.setEventScope(true);
        executionEntity7.setSuperExecution(executionEntity9);
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = executionEntity7.getProcessVariables();
        executionEntity2.setVariablesLocal(strMap16);
        executionEntity0.setVariables(strMap16);
        boolean boolean19 = executionEntity0.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = executionEntity21.getSuperExecution();
        java.lang.String str24 = executionEntity21.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl25 = executionEntity21.getTransitionBeingTaken();
        executionEntity0.setSuperExecution(executionEntity21);
        int int27 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = executionEntity0.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity28.removeVariableLocal("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(executionEntity23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(transitionImpl25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(executionEntity28);
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity2 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList3 = executionEntity0.findInactiveConcurrentExecutions(pvmActivity2);
        executionEntity0.setParentId("");
        java.lang.Object obj6 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        int int8 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        boolean boolean12 = executionEntity9.isConcurrent();
        java.lang.String str13 = executionEntity9.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj15 = executionEntity14.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity16.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        java.lang.String str19 = executionEntity16.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl20);
        java.lang.String str22 = executionEntity21.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity23.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        boolean boolean26 = executionEntity23.isConcurrent();
        executionEntity23.setEventScope(true);
        executionEntity21.setSuperExecution(executionEntity23);
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = executionEntity21.getProcessVariables();
        executionEntity16.setVariablesLocal(strMap30);
        executionEntity14.setVariables(strMap30);
        executionEntity9.createVariablesLocal(strMap30);
        boolean boolean34 = executionEntity9.isEnded();
        executionEntity9.setProcessDefinitionId("ProcessInstance[null]");
        org.activiti.engine.impl.javax.el.ELContext eLContext37 = null;
        executionEntity9.setCachedElContext(eLContext37);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement40 = null;
        executionEntity0.setEventSource(pvmProcessElement40);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl42 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str43 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl44 = executionEntity0.getTransition();
        java.lang.String str45 = executionEntity0.getActivityId();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertNull(startingExecution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(transitionImpl42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(transitionImpl44);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = executionEntity11.getTransition();
        executionEntity1.setSuperExecution(executionEntity11);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        java.lang.String str19 = executionEntity18.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
        boolean boolean23 = executionEntity20.isConcurrent();
        executionEntity20.setEventScope(true);
        executionEntity18.setSuperExecution(executionEntity20);
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = executionEntity18.getProcessVariables();
        executionEntity16.setVariablesLocal(strMap27);
        executionEntity11.setVariablesLocal(strMap27);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement30 = null;
        executionEntity11.setEventSource(pvmProcessElement30);
        java.lang.String str32 = executionEntity11.getCurrentActivityId();
        executionEntity11.setId("ProcessInstance[null]");
        boolean boolean35 = executionEntity11.isConcurrent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap36 = executionEntity11.getVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNull(engineServices4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(transitionImpl13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        java.lang.String str6 = executionEntity5.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        boolean boolean10 = executionEntity7.isConcurrent();
        executionEntity7.setEventScope(true);
        executionEntity5.setSuperExecution(executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity5.getProcessVariables();
        executionEntity0.setVariablesLocal(strMap14);
        java.lang.String str16 = executionEntity0.getTenantId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity0.getProcessInstance();
        java.lang.String str18 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation19 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity0.performOperation(atomicOperation19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(executionEntity17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity0.getActivity();
        executionEntity0.setTenantId("ScopeExecution[null]");
        int int9 = executionEntity0.getRevisionNext();
        boolean boolean10 = executionEntity0.isSuspended();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        java.lang.String str13 = executionEntity12.getCurrentActivityName();
        executionEntity12.inactivate();
        int int15 = executionEntity12.getRevisionNext();
        executionEntity12.disposeStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = executionEntity12.getTransitionBeingTaken();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList18 = executionEntity12.getQueryVariables();
        boolean boolean19 = executionEntity12.isDeleteRoot();
        executionEntity12.setSuspensionState(1);
        java.lang.Object obj22 = executionEntity12.getPersistentState();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        java.lang.String str24 = executionEntity12.getCurrentActivityId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap25 = executionEntity12.getVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(activityImpl6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNull(transitionImpl17);
        org.junit.Assert.assertNull(variableInstanceEntityList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getId();
        executionEntity1.inactivate();
        int int4 = executionEntity1.getRevision();
        int int5 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity6.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        executionEntity6.setBusinessKey("");
        java.lang.String str11 = executionEntity6.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj13 = executionEntity12.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity14.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        java.lang.String str17 = executionEntity14.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        java.lang.String str20 = executionEntity19.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity21.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity22);
        boolean boolean24 = executionEntity21.isConcurrent();
        executionEntity21.setEventScope(true);
        executionEntity19.setSuperExecution(executionEntity21);
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = executionEntity19.getProcessVariables();
        executionEntity14.setVariablesLocal(strMap28);
        executionEntity12.setVariables(strMap28);
        executionEntity6.setVariablesLocal(strMap28);
        boolean boolean32 = executionEntity6.isEventScope();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        org.activiti.engine.EngineServices engineServices34 = executionEntity6.getEngineServices();
        executionEntity6.setTenantId("Execution[null]");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(engineServices34);
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getId();
        executionEntity1.inactivate();
        int int4 = executionEntity1.getRevision();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 1);
        java.lang.String str7 = executionEntity1.getEventName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setCachedEntityState(0);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity5 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList6 = executionEntity0.findInactiveConcurrentExecutions(pvmActivity5);
        boolean boolean7 = executionEntity0.isActive();
        java.lang.String str8 = executionEntity0.getTenantId();
        int int9 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = executionEntity0.getTransition();
        executionEntity0.setTenantId("ProcessInstance[ScopeExecution[null]]");
        java.lang.String str14 = executionEntity0.getProcessInstanceId();
        org.junit.Assert.assertNotNull(activityExecutionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(processDefinitionImpl10);
        org.junit.Assert.assertNull(transitionImpl11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity2 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList3 = executionEntity0.findInactiveConcurrentExecutions(pvmActivity2);
        executionEntity0.setParentId("");
        java.lang.Object obj6 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        java.lang.String str8 = executionEntity0.toString();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = null;
        executionEntity0.setTransitionBeingTaken(transitionImpl9);
        org.activiti.engine.impl.javax.el.ELContext eLContext11 = executionEntity0.getCachedElContext();
        boolean boolean12 = executionEntity0.isEventScope();
        executionEntity0.setParentId("ProcessInstance[ScopeExecution[null]]");
        boolean boolean15 = executionEntity0.isProcessInstanceType();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution16 = executionEntity0.getStartingExecution();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertNull(startingExecution7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ScopeExecution[null]" + "'", str8, "ScopeExecution[null]");
        org.junit.Assert.assertNull(eLContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(startingExecution16);
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity2 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList3 = executionEntity0.findInactiveConcurrentExecutions(pvmActivity2);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        boolean boolean5 = executionEntity0.isActive();
        java.lang.String str6 = executionEntity0.getActivityId();
        java.lang.String str7 = executionEntity0.getId();
        java.lang.String str8 = executionEntity0.getProcessInstanceId();
        executionEntity0.setParentId("ScopeExecution[null]");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList3);
        org.junit.Assert.assertNull(pvmProcessElement4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj8 = executionEntity7.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity9 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList10 = executionEntity7.findInactiveConcurrentExecutions(pvmActivity9);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = executionEntity7.getEventSource();
        boolean boolean12 = executionEntity7.isConcurrent();
        executionEntity0.setSuperExecution(executionEntity7);
        java.lang.String str14 = executionEntity0.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj16 = executionEntity15.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity17 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList18 = executionEntity15.findInactiveConcurrentExecutions(pvmActivity17);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement19 = executionEntity15.getEventSource();
        boolean boolean20 = executionEntity15.isConcurrent();
        java.lang.String str21 = executionEntity15.getCurrentActivityId();
        boolean boolean22 = executionEntity15.isDeleteRoot();
        executionEntity15.setExecutionListenerIndex((java.lang.Integer) 7);
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity26.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity27);
        boolean boolean29 = executionEntity26.isConcurrent();
        executionEntity26.setEventScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = executionEntity26.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj34 = executionEntity33.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity35 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList36 = executionEntity33.findInactiveConcurrentExecutions(pvmActivity35);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement37 = executionEntity33.getEventSource();
        boolean boolean38 = executionEntity33.isConcurrent();
        executionEntity26.setSuperExecution(executionEntity33);
        java.lang.Object obj40 = executionEntity26.getPersistentState();
        boolean boolean41 = executionEntity26.isConcurrent();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity42 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList43 = executionEntity26.findInactiveConcurrentExecutions(pvmActivity42);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity44 = executionEntity26.getSuperExecution();
        boolean boolean45 = executionEntity26.isProcessInstanceType();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl46 = executionEntity26.getActivity();
        executionEntity15.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity26);
        org.activiti.engine.impl.javax.el.ELContext eLContext48 = executionEntity26.getCachedElContext();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(executionEntity6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList10);
        org.junit.Assert.assertNull(pvmProcessElement11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList18);
        org.junit.Assert.assertNull(pvmProcessElement19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(executionEntity32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList36);
        org.junit.Assert.assertNull(pvmProcessElement37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=true, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=true, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=true, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(activityExecutionList43);
        org.junit.Assert.assertNotNull(executionEntity44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(activityImpl46);
        org.junit.Assert.assertNull(eLContext48);
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        boolean boolean6 = executionEntity0.isEnded();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj8 = executionEntity7.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity9 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList10 = executionEntity7.findInactiveConcurrentExecutions(pvmActivity9);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = executionEntity7.getEventSource();
        boolean boolean12 = executionEntity7.isActive();
        boolean boolean13 = executionEntity7.isConcurrent();
        int int14 = executionEntity7.getRevisionNext();
        executionEntity7.setCachedEntityState(2);
        executionEntity7.setParentId("");
        org.activiti.engine.EngineServices engineServices19 = executionEntity7.getEngineServices();
        executionEntity7.setEventName("");
        java.lang.String str22 = executionEntity7.getTenantId();
        java.lang.String str23 = executionEntity7.getCurrentActivityId();
        executionEntity7.setParentId("hi!");
        java.lang.String str26 = executionEntity7.getProcessDefinitionId();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        executionEntity0.setCachedEntityState((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList10);
        org.junit.Assert.assertNull(pvmProcessElement11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNull(engineServices19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        java.util.List<java.lang.String> strList2 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition3;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        java.lang.String str10 = executionEntity9.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        boolean boolean14 = executionEntity11.isConcurrent();
        executionEntity11.setEventScope(true);
        executionEntity9.setSuperExecution(executionEntity11);
        boolean boolean18 = executionEntity11.isConcurrent();
        boolean boolean19 = executionEntity11.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
        executionEntity20.setBusinessKey("");
        java.lang.String str25 = executionEntity20.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj27 = executionEntity26.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity28.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity29);
        java.lang.String str31 = executionEntity28.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl32 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl32);
        java.lang.String str34 = executionEntity33.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity35.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity36);
        boolean boolean38 = executionEntity35.isConcurrent();
        executionEntity35.setEventScope(true);
        executionEntity33.setSuperExecution(executionEntity35);
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = executionEntity33.getProcessVariables();
        executionEntity28.setVariablesLocal(strMap42);
        executionEntity26.setVariables(strMap42);
        executionEntity20.setVariablesLocal(strMap42);
        executionEntity11.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
        org.activiti.engine.EngineServices engineServices47 = executionEntity11.getEngineServices();
        java.lang.String str48 = executionEntity11.getCurrentActivityId();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior0.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNull(taskDefinition7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNull(engineServices47);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution2 = executionEntity0.getStartingExecution();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getProcessInstance();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(startingExecution2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(activityImpl4);
        org.junit.Assert.assertNull(executionEntity5);
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        executionEntity0.setActivity(activityImpl7);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity9 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList10 = executionEntity0.findInactiveConcurrentExecutions(pvmActivity9);
        java.lang.String str11 = executionEntity0.getActivityId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(executionEntity6);
        org.junit.Assert.assertNotNull(activityExecutionList10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setCachedEntityState(0);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity5 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList6 = executionEntity0.findInactiveConcurrentExecutions(pvmActivity5);
        boolean boolean7 = executionEntity0.isActive();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj9 = executionEntity8.getPersistentState();
        executionEntity8.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement12 = executionEntity8.getEventSource();
        executionEntity8.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity0.getParent();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity0.getCompensateEventSubscriptions("ScopeExecution[null]");
        java.lang.String str19 = executionEntity0.getSuperExecutionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = null;
        executionEntity0.setSuperExecution(executionEntity20);
        executionEntity0.setActive(true);
        executionEntity0.setConcurrent(true);
        java.lang.String str26 = executionEntity0.getTenantId();
        boolean boolean27 = executionEntity0.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList28 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setName("ProcessInstance[]");
        org.junit.Assert.assertNotNull(activityExecutionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(pvmProcessElement12);
        org.junit.Assert.assertNull(executionEntity16);
        org.junit.Assert.assertNotNull(compensateEventSubscriptionEntityList18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(eventSubscriptionEntityList28);
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        boolean boolean8 = executionEntity5.isConcurrent();
        java.lang.String str9 = executionEntity5.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj11 = executionEntity10.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        java.lang.String str15 = executionEntity12.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        java.lang.String str18 = executionEntity17.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity19.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
        boolean boolean22 = executionEntity19.isConcurrent();
        executionEntity19.setEventScope(true);
        executionEntity17.setSuperExecution(executionEntity19);
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = executionEntity17.getProcessVariables();
        executionEntity12.setVariablesLocal(strMap26);
        executionEntity10.setVariables(strMap26);
        executionEntity5.createVariablesLocal(strMap26);
        executionEntity0.setVariablesLocal(strMap26);
        java.lang.String str31 = executionEntity0.getBusinessKey();
        executionEntity0.setSuspensionState(0);
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement35 = executionEntity0.getEventSource();
        java.lang.String str36 = executionEntity0.getTenantId();
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl39 = null;
        executionEntity0.setTransitionBeingTaken(transitionImpl39);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(pvmProcessElement35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getParent();
        org.activiti.engine.impl.javax.el.ELContext eLContext8 = null;
        executionEntity0.setCachedElContext(eLContext8);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity0.deleteCascade("ScopeExecution[]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(pvmProcessElement4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(transitionImpl6);
        org.junit.Assert.assertNull(executionEntity7);
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = null;
        executionEntity1.setTransition(transitionImpl3);
        executionEntity1.setCachedEntityState((-1));
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj8 = executionEntity7.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity9 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList10 = executionEntity7.findInactiveConcurrentExecutions(pvmActivity9);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = executionEntity7.getEventSource();
        boolean boolean12 = executionEntity7.isConcurrent();
        executionEntity0.setSuperExecution(executionEntity7);
        int int14 = executionEntity0.getRevisionNext();
        executionEntity0.setEventName("ScopeExecution[null]");
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity0.getParent();
        java.lang.String str20 = executionEntity0.getProcessDefinitionId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(executionEntity6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList10);
        org.junit.Assert.assertNull(pvmProcessElement11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(executionEntity19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity2 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList3 = executionEntity0.findInactiveConcurrentExecutions(pvmActivity2);
        executionEntity0.setParentId("");
        java.lang.Object obj6 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        java.lang.String str10 = executionEntity7.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        java.lang.String str13 = executionEntity12.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity14.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        boolean boolean17 = executionEntity14.isConcurrent();
        executionEntity14.setEventScope(true);
        executionEntity12.setSuperExecution(executionEntity14);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = executionEntity12.getProcessVariables();
        executionEntity7.setVariablesLocal(strMap21);
        java.lang.String str23 = executionEntity7.getTenantId();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = null;
        executionEntity7.setActivity(activityImpl25);
        java.lang.Object obj27 = executionEntity7.getPersistentState();
        boolean boolean28 = executionEntity7.isEnded();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl29 = null;
        executionEntity7.setActivity(activityImpl29);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity2 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList3 = executionEntity0.findInactiveConcurrentExecutions(pvmActivity2);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        executionEntity0.inactivate();
        java.lang.Object obj6 = executionEntity0.getPersistentState();
        java.lang.String str7 = executionEntity0.getTenantId();
        executionEntity0.setTenantId("ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getSubProcessInstance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList3);
        org.junit.Assert.assertNull(pvmProcessElement4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement7 = executionEntity0.getEventSource();
        java.lang.String str8 = executionEntity0.getParentId();
        executionEntity0.setSuspensionState(97);
        java.lang.String str11 = executionEntity0.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        boolean boolean16 = executionEntity13.isConcurrent();
        executionEntity13.setEventScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity13.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj21 = executionEntity20.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity22 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList23 = executionEntity20.findInactiveConcurrentExecutions(pvmActivity22);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement24 = executionEntity20.getEventSource();
        boolean boolean25 = executionEntity20.isConcurrent();
        executionEntity13.setSuperExecution(executionEntity20);
        int int27 = executionEntity13.getRevisionNext();
        executionEntity13.setEventName("ScopeExecution[null]");
        executionEntity13.setBusinessKey("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = executionEntity13.getParent();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity0.createVariableLocal("hi!", (java.lang.Object) executionEntity13);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(pvmProcessElement4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(eLContext6);
        org.junit.Assert.assertNull(pvmProcessElement7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(executionEntity19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList23);
        org.junit.Assert.assertNull(pvmProcessElement24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(executionEntity32);
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = null;
        executionEntity0.setTransitionBeingTaken(transitionImpl6);
        java.lang.String str8 = executionEntity0.getProcessDefinitionId();
        java.lang.Object obj9 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution10 = executionEntity0.getStartingExecution();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(startingExecution10);
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity2 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList3 = executionEntity0.findInactiveConcurrentExecutions(pvmActivity2);
        executionEntity0.setParentId("");
        java.lang.Object obj6 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        int int8 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        boolean boolean12 = executionEntity9.isConcurrent();
        java.lang.String str13 = executionEntity9.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj15 = executionEntity14.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity16.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        java.lang.String str19 = executionEntity16.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl20);
        java.lang.String str22 = executionEntity21.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity23.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        boolean boolean26 = executionEntity23.isConcurrent();
        executionEntity23.setEventScope(true);
        executionEntity21.setSuperExecution(executionEntity23);
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = executionEntity21.getProcessVariables();
        executionEntity16.setVariablesLocal(strMap30);
        executionEntity14.setVariables(strMap30);
        executionEntity9.createVariablesLocal(strMap30);
        boolean boolean34 = executionEntity9.isEnded();
        executionEntity9.setProcessDefinitionId("ProcessInstance[null]");
        org.activiti.engine.impl.javax.el.ELContext eLContext37 = null;
        executionEntity9.setCachedElContext(eLContext37);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        executionEntity0.setEventScope(false);
        executionEntity0.setBusinessKey("ProcessInstance[]");
        boolean boolean44 = executionEntity0.isScope();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertNull(startingExecution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity2 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList3 = executionEntity0.findInactiveConcurrentExecutions(pvmActivity2);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        boolean boolean5 = executionEntity0.isActive();
        boolean boolean6 = executionEntity0.isConcurrent();
        int int7 = executionEntity0.getRevisionNext();
        executionEntity0.setCachedEntityState(2);
        executionEntity0.setParentId("");
        org.activiti.engine.EngineServices engineServices12 = executionEntity0.getEngineServices();
        executionEntity0.setEventName("");
        java.lang.String str15 = executionEntity0.getEventName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj17 = executionEntity16.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity18 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList19 = executionEntity16.findInactiveConcurrentExecutions(pvmActivity18);
        executionEntity16.setParentId("");
        java.lang.Object obj22 = executionEntity16.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity23.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        int int26 = executionEntity24.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj28 = executionEntity27.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity29.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity30);
        java.lang.String str32 = executionEntity29.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        java.lang.String str35 = executionEntity34.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity37 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity36.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity37);
        boolean boolean39 = executionEntity36.isConcurrent();
        executionEntity36.setEventScope(true);
        executionEntity34.setSuperExecution(executionEntity36);
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = executionEntity34.getProcessVariables();
        executionEntity29.setVariablesLocal(strMap43);
        executionEntity27.setVariables(strMap43);
        executionEntity24.setVariables(strMap43);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution47 = executionEntity24.getStartingExecution();
        executionEntity16.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        java.util.Map<java.lang.String, java.lang.Object> strMap49 = null;
        executionEntity16.setVariables(strMap49);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl51 = null;
        executionEntity16.setTransition(transitionImpl51);
        boolean boolean53 = executionEntity16.isScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        int int55 = executionEntity0.getSuspensionState();
        java.lang.String str56 = executionEntity0.getDeleteReason();
        executionEntity0.setScope(false);
        int int59 = executionEntity0.getRevisionNext();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList3);
        org.junit.Assert.assertNull(pvmProcessElement4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(engineServices12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=}");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNull(startingExecution47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
    }
}

