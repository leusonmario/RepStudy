import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

    public static boolean debug = false;

    @Test
    public void test9501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9501");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity1.getTransitionBeingTaken();
        executionEntity1.setId("ProcessInstance[null]");
        java.lang.String str10 = executionEntity1.getCurrentActivityId();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertNull(transitionImpl7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test9502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9502");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        java.lang.String str13 = executionEntity8.getId();
        java.lang.Object obj14 = executionEntity8.getPersistentState();
        java.lang.String str15 = executionEntity8.getCurrentActivityId();
        java.lang.String str16 = executionEntity8.getBusinessKey();
        java.lang.String str17 = executionEntity8.getTenantId();
        executionEntity8.setEventScope(true);
        java.lang.String str20 = executionEntity8.getId();
        java.lang.String str21 = executionEntity8.getTenantId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl22 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl22);
        org.activiti.engine.impl.javax.el.ELContext eLContext24 = executionEntity23.getCachedElContext();
        boolean boolean25 = executionEntity23.isSuspended();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl26 = executionEntity23.getProcessDefinition();
        boolean boolean27 = executionEntity23.isEventScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl28 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl28);
        org.activiti.engine.impl.javax.el.ELContext eLContext30 = executionEntity29.getCachedElContext();
        org.activiti.engine.EngineServices engineServices31 = executionEntity29.getEngineServices();
        java.lang.Object obj32 = executionEntity29.getPersistentState();
        executionEntity29.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl35 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl35);
        executionEntity36.setExecutionListenerIndex((java.lang.Integer) 0);
        int int39 = executionEntity36.getSuspensionState();
        executionEntity29.setSuperExecution(executionEntity36);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl41 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl41);
        executionEntity42.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity42.setSuspensionState((-1));
        java.lang.String str47 = executionEntity42.getName();
        executionEntity36.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity42);
        java.lang.String str49 = executionEntity42.getName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl50 = executionEntity42.getActivity();
        executionEntity42.disposeStartingExecution();
        executionEntity23.setSuperExecution(executionEntity42);
        java.lang.String str53 = executionEntity23.getCurrentActivityName();
        executionEntity8.setSuperExecution(executionEntity23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap55 = executionEntity8.getVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(eLContext24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(processDefinitionImpl26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(eLContext30);
        org.junit.Assert.assertNull(engineServices31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(activityImpl50);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test9503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9503");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        int int4 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        executionEntity1.setActivity(activityImpl5);
        java.lang.Object obj7 = executionEntity1.getPersistentState();
        executionEntity1.setConcurrent(false);
        executionEntity1.setRevision((-1));
        executionEntity1.setConcurrent(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = executionEntity1.getTransitionBeingTaken();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity1.getTransitionBeingTaken();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(transitionImpl14);
        org.junit.Assert.assertNull(transitionImpl15);
    }

    @Test
    public void test9504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9504");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        boolean boolean6 = executionEntity1.isConcurrent();
        executionEntity1.setEventScope(true);
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = null;
        executionEntity1.setCachedElContext(eLContext9);
        org.activiti.engine.impl.javax.el.ELContext eLContext11 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        boolean boolean13 = executionEntity1.isProcessInstanceType();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement14 = executionEntity1.getEventSource();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(eLContext11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(pvmProcessElement14);
    }

    @Test
    public void test9505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9505");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getReplacedBy();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity5.getCachedElContext();
        boolean boolean7 = executionEntity5.isSuspended();
        java.lang.Object obj8 = executionEntity5.getPersistentState();
        java.lang.Object obj9 = executionEntity5.getPersistentState();
        boolean boolean10 = executionEntity5.isConcurrent();
        java.lang.String str11 = executionEntity5.toString();
        int int12 = executionEntity5.getRevisionNext();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str14 = executionEntity1.getActivityId();
        boolean boolean15 = executionEntity1.isActive();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl16 = executionEntity1.getProcessDefinition();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(executionEntity3);
        org.junit.Assert.assertNull(eLContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ProcessInstance[null]" + "'", str11, "ProcessInstance[null]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(processDefinitionImpl16);
    }

    @Test
    public void test9506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9506");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        org.junit.Assert.assertNull(taskDefinition3);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        org.junit.Assert.assertNull(taskDefinition5);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        org.junit.Assert.assertNull(taskDefinition8);
    }

    @Test
    public void test9507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9507");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        int int4 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        executionEntity1.setActivity(activityImpl5);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.getProcessInstance();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str10 = executionEntity1.getTenantId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution11 = executionEntity1.getStartingExecution();
        int int12 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl13);
        java.lang.Object obj15 = executionEntity1.getPersistentState();
        executionEntity1.setBusinessKey("ProcessInstance[]");
        org.activiti.engine.impl.pvm.PvmTransition pvmTransition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.take(pvmTransition18);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.impl.pvm.PvmException; message: transition is null");
        } catch (org.activiti.engine.impl.pvm.PvmException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNull(executionEntity7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(startingExecution11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test9508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9508");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setActive(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.getParent();
        int int8 = executionEntity1.getSuspensionState();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(executionEntity7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test9509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9509");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = null;
        executionEntity1.setCachedElContext(eLContext6);
        org.activiti.engine.impl.javax.el.ELContext eLContext8 = executionEntity1.getCachedElContext();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(eLContext8);
    }

    @Test
    public void test9510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9510");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setSuspensionState((-1));
        java.lang.String str6 = executionEntity1.getName();
        executionEntity1.setSuspensionState((-1));
        boolean boolean9 = executionEntity1.isActive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet10 = executionEntity1.getVariableNames();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test9511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9511");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setEventScope(true);
        org.activiti.engine.EngineServices engineServices7 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity1.getEventSource();
        java.lang.String str9 = executionEntity1.getDeleteReason();
        java.lang.String str10 = executionEntity1.getTenantId();
        java.lang.String str11 = executionEntity1.getParentId();
        int int12 = executionEntity1.getSuspensionState();
        java.lang.String str13 = executionEntity1.getDeleteReason();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl14 = executionEntity1.getProcessDefinition();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices7);
        org.junit.Assert.assertNull(pvmProcessElement8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(processDefinitionImpl14);
    }

    @Test
    public void test9512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9512");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray2 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3, variableInstanceEntityArray2);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray9 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10, variableInstanceEntityArray9);
        executionEntity8.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10);
        java.lang.String str14 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = executionEntity1.getActivity();
        org.activiti.engine.impl.pvm.PvmTransition pvmTransition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.take(pvmTransition16);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.impl.pvm.PvmException; message: transition is null");
        } catch (org.activiti.engine.impl.pvm.PvmException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(variableInstanceEntityList6);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(activityImpl15);
    }

    @Test
    public void test9513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9513");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        org.activiti.engine.EngineServices engineServices13 = executionEntity8.getEngineServices();
        org.activiti.engine.impl.pvm.runtime.InterpretableExecution interpretableExecution14 = null;
        executionEntity8.setParent(interpretableExecution14);
        executionEntity8.setRevision((int) (byte) 100);
        executionEntity8.setTenantId("ProcessInstance[hi!]");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl20 = executionEntity8.getProcessDefinition();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(engineServices13);
        org.junit.Assert.assertNull(processDefinitionImpl20);
    }

    @Test
    public void test9514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9514");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isEnded();
        boolean boolean4 = executionEntity1.isActive();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str10 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution11 = executionEntity1.getStartingExecution();
        executionEntity1.disposeStartingExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext13 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.javax.el.ELContext eLContext14 = executionEntity1.getCachedElContext();
        executionEntity1.inactivate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = executionEntity1.hasVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(startingExecution11);
        org.junit.Assert.assertNull(eLContext13);
        org.junit.Assert.assertNull(eLContext14);
    }

    @Test
    public void test9515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9515");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setEventScope(true);
        org.activiti.engine.EngineServices engineServices7 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity1.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity9.getReplacedBy();
        executionEntity9.inactivate();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity9.getParent();
        executionEntity9.setExecutionListenerIndex((java.lang.Integer) 0);
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = null;
        executionEntity9.setCachedElContext(eLContext16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = executionEntity9.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices7);
        org.junit.Assert.assertNull(pvmProcessElement8);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertNull(executionEntity13);
    }

    @Test
    public void test9516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9516");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isEnded();
        boolean boolean4 = executionEntity1.isActive();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str10 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution11 = executionEntity1.getStartingExecution();
        boolean boolean12 = executionEntity1.isScope();
        java.lang.String str13 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.pvm.PvmTransition[] pvmTransitionArray14 = new org.activiti.engine.impl.pvm.PvmTransition[] {};
        java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition> pvmTransitionList15 = new java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList15, pvmTransitionArray14);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        org.activiti.engine.impl.javax.el.ELContext eLContext19 = executionEntity18.getCachedElContext();
        boolean boolean20 = executionEntity18.isSuspended();
        java.lang.Object obj21 = executionEntity18.getPersistentState();
        executionEntity18.setEventScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl24 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl24);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray26 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList27 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList27, variableInstanceEntityArray26);
        executionEntity25.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList27);
        executionEntity25.setTenantId("ProcessInstance[null]");
        boolean boolean32 = executionEntity25.isScope();
        java.lang.Object obj33 = executionEntity25.getPersistentState();
        executionEntity25.setRevision((int) (short) 10);
        executionEntity18.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity25);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity37 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList38 = executionEntity25.findInactiveConcurrentExecutions(pvmActivity37);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.takeAll((java.util.List<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList15, activityExecutionList38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(startingExecution11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(pvmTransitionArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(eLContext19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(variableInstanceEntityArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList38);
    }

    @Test
    public void test9517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9517");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        executionEntity1.setActivity(activityImpl7);
        java.lang.String str9 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.javax.el.ELContext eLContext10 = null;
        executionEntity1.setCachedElContext(eLContext10);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity1.getTransition();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = executionEntity15.getCachedElContext();
        executionEntity15.forceUpdate();
        executionEntity15.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution20 = executionEntity15.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl21 = executionEntity15.getTransitionBeingTaken();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = executionEntity15.getProcessVariables();
        java.lang.String str23 = executionEntity15.getCurrentActivityName();
        executionEntity15.forceUpdate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = executionEntity1.setVariableLocal("ProcessInstance[ScopeExecution[null]]", (java.lang.Object) executionEntity15);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(transitionImpl12);
        org.junit.Assert.assertNull(eLContext16);
        org.junit.Assert.assertNotNull(startingExecution20);
        org.junit.Assert.assertNull(transitionImpl21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test9518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9518");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getReplacedBy();
        executionEntity0.inactivate();
        int int3 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity0.setTransition(transitionImpl4);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity0.getStartingExecution();
        executionEntity0.setDeleteReason("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.PvmTransition pvmTransition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity0.take(pvmTransition9);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.impl.pvm.PvmException; message: transition is null");
        } catch (org.activiti.engine.impl.pvm.PvmException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertNull(startingExecution6);
    }

    @Test
    public void test9519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9519");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        boolean boolean6 = executionEntity1.isConcurrent();
        executionEntity1.setEventScope(true);
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = null;
        executionEntity1.setCachedElContext(eLContext9);
        java.lang.String str11 = executionEntity1.getId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = executionEntity1.getActivity();
        executionEntity1.setEventScope(false);
        int int15 = executionEntity1.getSuspensionState();
        boolean boolean16 = executionEntity1.isActive();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(activityImpl12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test9520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9520");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.junit.Assert.assertNull(taskDefinition2);
        org.junit.Assert.assertNull(taskDefinition3);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        org.junit.Assert.assertNull(taskDefinition8);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        org.junit.Assert.assertNull(taskDefinition12);
    }

    @Test
    public void test9521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9521");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setEventScope(true);
        org.activiti.engine.EngineServices engineServices7 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity1.getEventSource();
        executionEntity1.forceUpdate();
        executionEntity1.setId("");
        int int12 = executionEntity1.getRevisionNext();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices7);
        org.junit.Assert.assertNull(pvmProcessElement8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test9522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9522");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setSuspensionState((-1));
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl7 = executionEntity1.getProcessDefinition();
        executionEntity1.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity10 = null;
        executionEntity1.removeEventSubscription(eventSubscriptionEntity10);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList12 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = executionEntity1.getTransitionBeingTaken();
        java.lang.String str14 = executionEntity1.getTenantId();
        java.lang.Class<?> wildcardClass15 = executionEntity1.getClass();
        org.junit.Assert.assertNull(executionEntity6);
        org.junit.Assert.assertNull(processDefinitionImpl7);
        org.junit.Assert.assertNull(variableInstanceEntityList12);
        org.junit.Assert.assertNull(transitionImpl13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test9523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9523");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = executionEntity1.getEventSource();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = null;
        executionEntity1.setTransition(transitionImpl6);
        executionEntity1.setScope(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.javax.el.ELContext eLContext12 = executionEntity11.getCachedElContext();
        executionEntity11.forceUpdate();
        executionEntity11.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution16 = executionEntity11.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = executionEntity11.getTransitionBeingTaken();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = executionEntity11.hasVariable("ProcessInstance[ProcessInstance[ProcessInstance[null]]]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(pvmProcessElement5);
        org.junit.Assert.assertNull(eLContext12);
        org.junit.Assert.assertNotNull(startingExecution16);
        org.junit.Assert.assertNull(transitionImpl17);
    }

    @Test
    public void test9524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9524");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        boolean boolean6 = executionEntity1.isProcessInstanceType();
        boolean boolean7 = executionEntity1.isEventScope();
        executionEntity1.setScope(false);
        org.activiti.engine.impl.pvm.runtime.InterpretableExecution interpretableExecution10 = null;
        executionEntity1.setProcessInstance(interpretableExecution10);
        executionEntity1.setName("hi!");
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity14 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList15 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity14);
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(activityExecutionList15);
    }

    @Test
    public void test9525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9525");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity1.getTransitionBeingTaken();
        executionEntity1.setId("ProcessInstance[null]");
        executionEntity1.disposeStartingExecution();
        boolean boolean11 = executionEntity1.isProcessInstanceType();
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity1.getParent();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement14 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity13.setEventSource(pvmProcessElement14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertNull(transitionImpl7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(executionEntity13);
    }

    @Test
    public void test9526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9526");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity14.setSuspensionState((-1));
        java.lang.String str19 = executionEntity14.getName();
        executionEntity8.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl21 = null;
        executionEntity14.setTransitionBeingTaken(transitionImpl21);
        executionEntity14.setScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity14.getParent();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity25.setDeleteReason("ProcessInstance[ProcessInstance[ProcessInstance[null]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(executionEntity25);
    }

    @Test
    public void test9527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9527");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getBusinessKey();
        int int6 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.getSuperExecution();
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement9 = executionEntity1.getEventSource();
        executionEntity1.inactivate();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariable("ProcessInstance[ProcessInstance[null]]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertNull(executionEntity7);
        org.junit.Assert.assertNull(pvmProcessElement9);
    }

    @Test
    public void test9528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9528");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        int int4 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        executionEntity1.setActivity(activityImpl5);
        executionEntity1.setConcurrent(true);
        java.lang.String str9 = executionEntity1.getId();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test9529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9529");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity8.getCachedElContext();
        boolean boolean10 = executionEntity8.isSuspended();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl11 = executionEntity8.getProcessDefinition();
        boolean boolean12 = executionEntity8.isEventScope();
        executionEntity8.setBusinessKey("ProcessInstance[null]");
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        org.activiti.engine.impl.javax.el.ELContext eLContext17 = null;
        executionEntity8.setCachedElContext(eLContext17);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = null;
        executionEntity8.setTransitionBeingTaken(transitionImpl19);
        int int21 = executionEntity8.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        org.activiti.engine.impl.javax.el.ELContext eLContext25 = executionEntity24.getCachedElContext();
        boolean boolean26 = executionEntity24.isSuspended();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl27 = executionEntity24.getProcessDefinition();
        boolean boolean28 = executionEntity24.isEventScope();
        int int29 = executionEntity24.getRevision();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl30 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl30);
        org.activiti.engine.impl.javax.el.ELContext eLContext32 = executionEntity31.getCachedElContext();
        executionEntity31.forceUpdate();
        executionEntity31.setName("");
        int int36 = executionEntity31.getSuspensionState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl37 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity38 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl37);
        org.activiti.engine.impl.javax.el.ELContext eLContext39 = executionEntity38.getCachedElContext();
        executionEntity38.forceUpdate();
        executionEntity38.setName("");
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = executionEntity38.getProcessVariables();
        executionEntity31.createVariablesLocal(strMap43);
        executionEntity24.createVariablesLocal(strMap43);
        org.activiti.engine.EngineServices engineServices46 = executionEntity24.getEngineServices();
        java.lang.String str47 = executionEntity24.getSuperExecutionId();
        executionEntity24.setTenantId("ProcessInstance[]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl50 = executionEntity24.getActivity();
        java.lang.String str51 = executionEntity24.getProcessDefinitionId();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity8, "ScopeExecution[ProcessInstance[null]]", (java.lang.Object) executionEntity24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(taskDefinition2);
        org.junit.Assert.assertNull(eLContext9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(processDefinitionImpl11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNull(eLContext25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(processDefinitionImpl27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNull(eLContext32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNull(eLContext39);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNull(engineServices46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(activityImpl50);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test9530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9530");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution13 = executionEntity8.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = executionEntity15.getCachedElContext();
        org.activiti.engine.EngineServices engineServices17 = executionEntity15.getEngineServices();
        int int18 = executionEntity15.getCachedEntityState();
        java.lang.String str19 = executionEntity15.getTenantId();
        executionEntity8.setSuperExecution(executionEntity15);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl21 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl21);
        boolean boolean23 = executionEntity22.isEnded();
        java.lang.String str24 = executionEntity22.getParentId();
        executionEntity15.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity22);
        java.lang.String str26 = executionEntity15.getDeleteReason();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl27 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity15.setProcessDefinition(processDefinitionImpl27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(startingExecution13);
        org.junit.Assert.assertNull(eLContext16);
        org.junit.Assert.assertNull(engineServices17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test9531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9531");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray2 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3, variableInstanceEntityArray2);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray9 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10, variableInstanceEntityArray9);
        executionEntity8.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = executionEntity15.getCachedElContext();
        executionEntity15.forceUpdate();
        executionEntity15.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution20 = executionEntity15.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl21 = executionEntity15.getTransitionBeingTaken();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = executionEntity15.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = executionEntity15.getSuperExecution();
        boolean boolean24 = executionEntity15.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity15.getParent();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList27 = executionEntity1.getJobs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(variableInstanceEntityList6);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(eLContext16);
        org.junit.Assert.assertNotNull(startingExecution20);
        org.junit.Assert.assertNull(transitionImpl21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(executionEntity23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(executionEntity25);
    }

    @Test
    public void test9532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9532");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        boolean boolean5 = executionEntity1.isEnded();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity1.getTransition();
        java.lang.String str7 = executionEntity1.getName();
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity1.getTransitionBeingTaken();
        executionEntity1.setRevision((int) '4');
        org.activiti.engine.EngineServices engineServices12 = executionEntity1.getEngineServices();
        executionEntity1.setParentId("ScopeExecution[null]");
        java.lang.String str15 = executionEntity1.getCurrentActivityName();
        java.lang.String str16 = executionEntity1.getProcessInstanceId();
        executionEntity1.setRevision(36);
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(transitionImpl6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(transitionImpl9);
        org.junit.Assert.assertNull(engineServices12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test9533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9533");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        boolean boolean5 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity1.getActivity();
        boolean boolean7 = executionEntity1.isDeleteRoot();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.createExecution();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(activityImpl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test9534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9534");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        int int2 = executionEntity1.getSuspensionState();
        boolean boolean3 = executionEntity1.isEnded();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity4 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeJob(jobEntity4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test9535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9535");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setSuspensionState((-1));
        java.lang.String str6 = executionEntity1.getName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity8.getCachedElContext();
        boolean boolean10 = executionEntity8.isSuspended();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = null;
        executionEntity1.setTransition(transitionImpl12);
        executionEntity1.setActive(true);
        java.lang.String str16 = executionEntity1.getDeleteReason();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(eLContext9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test9536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9536");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        boolean boolean7 = executionEntity1.isEventScope();
        boolean boolean8 = executionEntity1.isScope();
        java.lang.String str9 = executionEntity1.getCurrentActivityName();
        executionEntity1.setEventScope(false);
        boolean boolean12 = executionEntity1.isEnded();
        java.lang.String str13 = executionEntity1.getProcessDefinitionId();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity1.getProcessVariables();
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl17 = executionEntity1.getProcessDefinition();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(processDefinitionImpl17);
    }

    @Test
    public void test9537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9537");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setSuspensionState((-1));
        java.lang.String str6 = executionEntity1.getName();
        boolean boolean7 = executionEntity1.isConcurrent();
        executionEntity1.disposeStartingExecution();
        java.lang.String str9 = executionEntity1.getName();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = executionEntity1.hasVariable("hi!");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test9538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9538");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setEventScope(true);
        org.activiti.engine.EngineServices engineServices7 = executionEntity1.getEngineServices();
        executionEntity1.setCachedEntityState((int) 'a');
        executionEntity1.setConcurrent(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray14 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15, variableInstanceEntityArray14);
        executionEntity13.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = executionEntity1.getProcessVariables();
        int int20 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl21 = executionEntity1.getTransition();
        executionEntity1.setName("ProcessInstance[]");
        executionEntity1.inactivate();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList25 = executionEntity1.getQueryVariables();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices7);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(transitionImpl21);
        org.junit.Assert.assertNotNull(variableInstanceEntityList25);
    }

    @Test
    public void test9539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9539");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity4 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList5 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity4);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray8 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList9 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList9, variableInstanceEntityArray8);
        executionEntity7.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList9);
        executionEntity7.setTenantId("ProcessInstance[null]");
        boolean boolean14 = executionEntity7.isScope();
        java.lang.String str15 = executionEntity7.getName();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        int int17 = executionEntity7.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity18 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity7.addTask(taskEntity18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(activityExecutionList5);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test9540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9540");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setEventScope(true);
        org.activiti.engine.EngineServices engineServices7 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity1.getEventSource();
        executionEntity1.forceUpdate();
        executionEntity1.setId("");
        java.lang.String str12 = executionEntity1.getTenantId();
        java.lang.String str13 = executionEntity1.getDeleteReason();
        java.lang.String str14 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity1.getTransition();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = executionEntity1.getActivity();
        executionEntity1.setId("");
        java.lang.String str19 = executionEntity1.getProcessInstanceId();
        executionEntity1.setParentId("ProcessInstance[ScopeExecution[null]]");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteCascade("ProcessInstance[ScopeExecution[null]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices7);
        org.junit.Assert.assertNull(pvmProcessElement8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(transitionImpl15);
        org.junit.Assert.assertNull(activityImpl16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test9541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9541");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        int int7 = executionEntity1.getRevisionNext();
        executionEntity1.setTenantId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getSuperExecution();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(executionEntity10);
    }

    @Test
    public void test9542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9542");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        org.activiti.engine.impl.javax.el.ELContext eLContext4 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity5 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList6 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity5);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity8.getCachedElContext();
        boolean boolean10 = executionEntity8.isSuspended();
        java.lang.Object obj11 = executionEntity8.getPersistentState();
        java.lang.Object obj12 = executionEntity8.getPersistentState();
        boolean boolean13 = executionEntity8.isConcurrent();
        executionEntity8.setEventScope(false);
        int int16 = executionEntity8.getRevisionNext();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        boolean boolean18 = executionEntity8.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        executionEntity8.setActivity(activityImpl19);
        java.lang.String str21 = executionEntity8.getCurrentActivityId();
        java.lang.String str22 = executionEntity8.getParentId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement23 = null;
        executionEntity8.setEventSource(pvmProcessElement23);
        java.lang.String str25 = executionEntity8.getProcessDefinitionId();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(eLContext4);
        org.junit.Assert.assertNotNull(activityExecutionList6);
        org.junit.Assert.assertNull(eLContext9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test9543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9543");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setEventScope(true);
        org.activiti.engine.EngineServices engineServices7 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity1.getEventSource();
        boolean boolean9 = executionEntity1.isScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        executionEntity1.setActivity(activityImpl10);
        executionEntity1.inactivate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.javax.el.ELContext eLContext14 = executionEntity13.getCachedElContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices7);
        org.junit.Assert.assertNull(pvmProcessElement8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(executionEntity13);
    }

    @Test
    public void test9544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9544");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        executionEntity1.setActivity(activityImpl7);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList9 = executionEntity1.getQueryVariables();
        boolean boolean10 = executionEntity1.isProcessInstanceType();
        org.activiti.engine.EngineServices engineServices11 = executionEntity1.getEngineServices();
        java.lang.String str12 = executionEntity1.toString();
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = executionEntity1.getTransition();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        executionEntity1.setVariables(strMap15);
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(variableInstanceEntityList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(engineServices11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ProcessInstance[null]" + "'", str12, "ProcessInstance[null]");
        org.junit.Assert.assertNull(transitionImpl14);
    }

    @Test
    public void test9545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9545");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        boolean boolean6 = executionEntity1.isConcurrent();
        executionEntity1.setEventScope(false);
        org.activiti.engine.EngineServices engineServices9 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.javax.el.ELContext eLContext12 = executionEntity11.getCachedElContext();
        org.activiti.engine.EngineServices engineServices13 = executionEntity11.getEngineServices();
        java.lang.Object obj14 = executionEntity11.getPersistentState();
        executionEntity11.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setExecutionListenerIndex((java.lang.Integer) 0);
        int int21 = executionEntity18.getSuspensionState();
        executionEntity11.setSuperExecution(executionEntity18);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        executionEntity24.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity24.setSuspensionState((-1));
        java.lang.String str29 = executionEntity24.getName();
        executionEntity18.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        executionEntity1.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity34 = null;
        executionEntity1.addTask(taskEntity34);
        java.lang.String str36 = executionEntity1.getParentId();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(engineServices9);
        org.junit.Assert.assertNull(eLContext12);
        org.junit.Assert.assertNull(engineServices13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test9546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9546");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = executionEntity1.getCachedElContext();
        int int6 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.getReplacedBy();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity7.setEventSource(pvmProcessElement8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(eLContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertNull(executionEntity7);
    }

    @Test
    public void test9547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9547");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = executionEntity1.getEventSource();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = null;
        executionEntity1.setTransition(transitionImpl6);
        executionEntity1.setScope(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.javax.el.ELContext eLContext12 = executionEntity11.getCachedElContext();
        executionEntity11.forceUpdate();
        executionEntity11.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution16 = executionEntity11.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = executionEntity11.getTransitionBeingTaken();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = executionEntity1.getTransition();
        java.lang.String str20 = executionEntity1.getId();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(pvmProcessElement5);
        org.junit.Assert.assertNull(eLContext12);
        org.junit.Assert.assertNotNull(startingExecution16);
        org.junit.Assert.assertNull(transitionImpl17);
        org.junit.Assert.assertNull(transitionImpl19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test9548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9548");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        int int4 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        executionEntity1.setActivity(activityImpl5);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.getProcessInstance();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str10 = executionEntity1.getTenantId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution11 = executionEntity1.getStartingExecution();
        int int12 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl13);
        java.lang.String str15 = executionEntity1.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = executionEntity1.getActivity();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNull(executionEntity7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(startingExecution11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(activityImpl16);
    }

    @Test
    public void test9549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9549");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray2 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3, variableInstanceEntityArray2);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3);
        executionEntity1.setTenantId("ProcessInstance[null]");
        boolean boolean8 = executionEntity1.isScope();
        executionEntity1.inactivate();
        boolean boolean10 = executionEntity1.isActive();
        executionEntity1.setTenantId("");
        executionEntity1.setRevision((-1));
        executionEntity1.setProcessDefinitionId("ProcessInstance[hi!]");
        org.junit.Assert.assertNotNull(variableInstanceEntityArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test9550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9550");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray2 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3, variableInstanceEntityArray2);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3);
        executionEntity1.setTenantId("ProcessInstance[null]");
        boolean boolean8 = executionEntity1.isScope();
        executionEntity1.inactivate();
        boolean boolean10 = executionEntity1.isDeleteRoot();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        org.activiti.engine.impl.javax.el.ELContext eLContext13 = executionEntity12.getCachedElContext();
        org.activiti.engine.EngineServices engineServices14 = executionEntity12.getEngineServices();
        int int15 = executionEntity12.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity12.getProcessInstance();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity18.setSuspensionState((-1));
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = executionEntity18.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl24 = executionEntity18.getProcessDefinition();
        executionEntity12.setSuperExecution(executionEntity18);
        org.activiti.engine.impl.javax.el.ELContext eLContext26 = executionEntity12.getCachedElContext();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = executionEntity12.getSuperExecution();
        executionEntity12.setRevision((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList31 = executionEntity12.getEventSubscriptionsInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(eLContext13);
        org.junit.Assert.assertNull(engineServices14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNull(executionEntity16);
        org.junit.Assert.assertNull(executionEntity23);
        org.junit.Assert.assertNull(processDefinitionImpl24);
        org.junit.Assert.assertNull(eLContext26);
        org.junit.Assert.assertNotNull(executionEntity28);
    }

    @Test
    public void test9551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9551");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        org.junit.Assert.assertNull(taskDefinition9);
    }

    @Test
    public void test9552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9552");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray2 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3, variableInstanceEntityArray2);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        org.activiti.engine.impl.javax.el.ELContext eLContext8 = executionEntity7.getCachedElContext();
        executionEntity7.forceUpdate();
        executionEntity7.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution12 = executionEntity7.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = executionEntity7.getTransitionBeingTaken();
        executionEntity7.setActive(true);
        java.lang.String str16 = executionEntity7.getActivityId();
        executionEntity1.setSuperExecution(executionEntity7);
        executionEntity1.setTenantId("ScopeExecution[null]");
        executionEntity1.setName("ProcessInstance[null]");
        executionEntity1.setConcurrent(false);
        boolean boolean24 = executionEntity1.isDeleteRoot();
        org.junit.Assert.assertNotNull(variableInstanceEntityArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(eLContext8);
        org.junit.Assert.assertNotNull(startingExecution12);
        org.junit.Assert.assertNull(transitionImpl13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test9553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9553");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setSuspensionState((-1));
        java.lang.String str6 = executionEntity1.getName();
        executionEntity1.setSuspensionState((-1));
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity1.getCachedElContext();
        executionEntity1.setEventName("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        org.activiti.engine.impl.javax.el.ELContext eLContext14 = executionEntity13.getCachedElContext();
        executionEntity13.forceUpdate();
        executionEntity13.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution18 = executionEntity13.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = executionEntity13.getTransitionBeingTaken();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = executionEntity13.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity13.getSuperExecution();
        boolean boolean22 = executionEntity13.isDeleteRoot();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        boolean boolean24 = executionEntity1.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity1.getReplacedBy();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        org.activiti.engine.impl.javax.el.ELContext eLContext29 = executionEntity28.getCachedElContext();
        boolean boolean30 = executionEntity28.isSuspended();
        java.lang.Object obj31 = executionEntity28.getPersistentState();
        java.lang.Object obj32 = executionEntity28.getPersistentState();
        boolean boolean33 = executionEntity28.isConcurrent();
        executionEntity28.setEventScope(false);
        executionEntity28.setScope(false);
        boolean boolean38 = executionEntity28.isDeleteRoot();
        executionEntity28.setEventScope(true);
        executionEntity28.setDeleteReason("hi!");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity25.signal("hi!", (java.lang.Object) executionEntity28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(eLContext9);
        org.junit.Assert.assertNull(eLContext14);
        org.junit.Assert.assertNotNull(startingExecution18);
        org.junit.Assert.assertNull(transitionImpl19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(executionEntity21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(executionEntity25);
        org.junit.Assert.assertNull(eLContext29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test9554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9554");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setSuspensionState((-1));
        java.lang.String str6 = executionEntity1.getName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity8.getCachedElContext();
        boolean boolean10 = executionEntity8.isSuspended();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        java.lang.String str12 = executionEntity1.getName();
        org.activiti.engine.impl.javax.el.ELContext eLContext13 = executionEntity1.getCachedElContext();
        executionEntity1.setScope(true);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteVariablesInstanceForLeavingScope();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(eLContext9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(eLContext13);
    }

    @Test
    public void test9555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9555");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getProcessInstanceId();
        boolean boolean6 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = null;
        executionEntity1.setTransition(transitionImpl7);
        executionEntity1.setEventScope(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList11 = executionEntity1.getQueryVariables();
        java.lang.String str12 = executionEntity1.getSuperExecutionId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteVariablesInstanceForLeavingScope();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(variableInstanceEntityList11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test9556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9556");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isEnded();
        boolean boolean4 = executionEntity1.isActive();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str10 = executionEntity1.getBusinessKey();
        java.lang.String str11 = executionEntity1.getCurrentActivityName();
        int int12 = executionEntity1.getRevision();
        boolean boolean13 = executionEntity1.isSuspended();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = executionEntity15.getCachedElContext();
        org.activiti.engine.EngineServices engineServices17 = executionEntity15.getEngineServices();
        int int18 = executionEntity15.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl19);
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = executionEntity20.getCachedElContext();
        executionEntity20.forceUpdate();
        executionEntity20.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution25 = executionEntity20.getStartingExecution();
        boolean boolean26 = executionEntity20.isEventScope();
        boolean boolean27 = executionEntity20.isSuspended();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl28 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl28);
        org.activiti.engine.impl.javax.el.ELContext eLContext30 = executionEntity29.getCachedElContext();
        org.activiti.engine.EngineServices engineServices31 = executionEntity29.getEngineServices();
        java.lang.Object obj32 = executionEntity29.getPersistentState();
        executionEntity29.inactivate();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = executionEntity29.getProcessVariables();
        executionEntity20.createVariablesLocal(strMap34);
        executionEntity15.setVariables(strMap34);
        boolean boolean37 = executionEntity15.isEnded();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl38 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity39 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl38);
        org.activiti.engine.impl.javax.el.ELContext eLContext40 = executionEntity39.getCachedElContext();
        executionEntity39.forceUpdate();
        java.lang.String str42 = executionEntity39.getBusinessKey();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl43 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity44 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl43);
        executionEntity44.setExecutionListenerIndex((java.lang.Integer) 0);
        int int47 = executionEntity44.getSuspensionState();
        java.lang.String str48 = executionEntity44.getProcessInstanceId();
        executionEntity39.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity44);
        boolean boolean50 = executionEntity44.isEventScope();
        executionEntity44.setId("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap53 = executionEntity44.getProcessVariables();
        executionEntity15.setVariablesLocal(strMap53);
        executionEntity1.setSuperExecution(executionEntity15);
        org.activiti.engine.EngineServices engineServices56 = executionEntity15.getEngineServices();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(eLContext16);
        org.junit.Assert.assertNull(engineServices17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertNull(eLContext21);
        org.junit.Assert.assertNotNull(startingExecution25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(eLContext30);
        org.junit.Assert.assertNull(engineServices31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(eLContext40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNull(engineServices56);
    }

    @Test
    public void test9557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9557");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setEventScope(true);
        org.activiti.engine.EngineServices engineServices7 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity1.getEventSource();
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity10.setEventName("ProcessInstance[ProcessInstance[null]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices7);
        org.junit.Assert.assertNull(pvmProcessElement8);
        org.junit.Assert.assertNull(executionEntity10);
    }

    @Test
    public void test9558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9558");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getBusinessKey();
        java.lang.String str6 = executionEntity1.getId();
        executionEntity1.setEventScope(true);
        executionEntity1.setTenantId("ProcessInstance[null]");
        org.activiti.engine.EngineServices engineServices11 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        org.activiti.engine.impl.javax.el.ELContext eLContext14 = executionEntity13.getCachedElContext();
        org.activiti.engine.EngineServices engineServices15 = executionEntity13.getEngineServices();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity16 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList17 = executionEntity13.findInactiveConcurrentExecutions(pvmActivity16);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray20 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList21 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList21, variableInstanceEntityArray20);
        executionEntity19.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList21);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList24 = executionEntity19.getQueryVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl25);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray27 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList28 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList28, variableInstanceEntityArray27);
        executionEntity26.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList28);
        executionEntity19.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList28);
        executionEntity13.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList28);
        org.activiti.engine.EngineServices engineServices33 = executionEntity13.getEngineServices();
        java.lang.String str34 = executionEntity13.getBusinessKey();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList35 = executionEntity13.getQueryVariables();
        executionEntity1.setQueryVariables(variableInstanceEntityList35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(engineServices11);
        org.junit.Assert.assertNull(eLContext14);
        org.junit.Assert.assertNull(engineServices15);
        org.junit.Assert.assertNotNull(activityExecutionList17);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(variableInstanceEntityList24);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(engineServices33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(variableInstanceEntityList35);
    }

    @Test
    public void test9559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9559");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setEventScope(true);
        org.activiti.engine.EngineServices engineServices7 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity1.getEventSource();
        boolean boolean9 = executionEntity1.isScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.javax.el.ELContext eLContext12 = executionEntity11.getCachedElContext();
        boolean boolean13 = executionEntity11.isSuspended();
        java.lang.Object obj14 = executionEntity11.getPersistentState();
        executionEntity11.setEventScope(true);
        org.activiti.engine.EngineServices engineServices17 = executionEntity11.getEngineServices();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement18 = executionEntity11.getEventSource();
        executionEntity11.forceUpdate();
        boolean boolean20 = executionEntity11.isConcurrent();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl22 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl22);
        org.activiti.engine.impl.javax.el.ELContext eLContext24 = executionEntity23.getCachedElContext();
        executionEntity23.forceUpdate();
        executionEntity23.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution28 = executionEntity23.getStartingExecution();
        boolean boolean29 = executionEntity23.isEventScope();
        int int30 = executionEntity23.getRevision();
        java.lang.String str31 = executionEntity23.getCurrentActivityName();
        executionEntity23.setParentId("ScopeExecution[null]");
        executionEntity11.setSuperExecution(executionEntity23);
        java.lang.String str35 = executionEntity11.getSuperExecutionId();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices7);
        org.junit.Assert.assertNull(pvmProcessElement8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(eLContext12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices17);
        org.junit.Assert.assertNull(pvmProcessElement18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(eLContext24);
        org.junit.Assert.assertNotNull(startingExecution28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test9560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9560");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransition(transitionImpl4);
        java.lang.String str6 = executionEntity1.toString();
        executionEntity1.setConcurrent(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        org.activiti.engine.impl.javax.el.ELContext eLContext11 = executionEntity10.getCachedElContext();
        org.activiti.engine.EngineServices engineServices12 = executionEntity10.getEngineServices();
        java.lang.Object obj13 = executionEntity10.getPersistentState();
        executionEntity10.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setExecutionListenerIndex((java.lang.Integer) 0);
        int int20 = executionEntity17.getSuspensionState();
        executionEntity10.setSuperExecution(executionEntity17);
        executionEntity10.setName("hi!");
        executionEntity10.setName("");
        executionEntity10.setConcurrent(false);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        int int29 = executionEntity10.getCachedEntityState();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ProcessInstance[null]" + "'", str6, "ProcessInstance[null]");
        org.junit.Assert.assertNull(eLContext11);
        org.junit.Assert.assertNull(engineServices12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 7 + "'", int29 == 7);
    }

    @Test
    public void test9561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9561");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        int int2 = executionEntity1.getSuspensionState();
        boolean boolean3 = executionEntity1.isEnded();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity5.getCachedElContext();
        org.activiti.engine.EngineServices engineServices7 = executionEntity5.getEngineServices();
        java.lang.Object obj8 = executionEntity5.getPersistentState();
        executionEntity5.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        executionEntity12.setExecutionListenerIndex((java.lang.Integer) 0);
        int int15 = executionEntity12.getSuspensionState();
        executionEntity5.setSuperExecution(executionEntity12);
        executionEntity12.setName("hi!");
        int int19 = executionEntity12.getRevision();
        executionEntity12.forceUpdate();
        boolean boolean21 = executionEntity12.isDeleteRoot();
        executionEntity1.setSuperExecution(executionEntity12);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl23 = null;
        executionEntity12.setTransition(transitionImpl23);
        org.activiti.engine.impl.javax.el.ELContext eLContext25 = null;
        executionEntity12.setCachedElContext(eLContext25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = executionEntity12.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(eLContext6);
        org.junit.Assert.assertNull(engineServices7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test9562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9562");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity1.getTransitionBeingTaken();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity1.getSuperExecution();
        boolean boolean10 = executionEntity1.isDeleteRoot();
        executionEntity1.disposeStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl12);
        boolean boolean14 = executionEntity1.isActive();
        executionEntity1.setSuspensionState((int) (short) 10);
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertNull(transitionImpl7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(executionEntity9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test9563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9563");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray2 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3, variableInstanceEntityArray2);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        org.activiti.engine.impl.javax.el.ELContext eLContext8 = executionEntity7.getCachedElContext();
        executionEntity7.forceUpdate();
        executionEntity7.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution12 = executionEntity7.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = executionEntity7.getTransitionBeingTaken();
        executionEntity7.setActive(true);
        java.lang.String str16 = executionEntity7.getActivityId();
        executionEntity1.setSuperExecution(executionEntity7);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution18 = executionEntity7.getStartingExecution();
        int int19 = executionEntity7.getRevisionNext();
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation20 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity7.performOperation(atomicOperation20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(eLContext8);
        org.junit.Assert.assertNotNull(startingExecution12);
        org.junit.Assert.assertNull(transitionImpl13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(startingExecution18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test9564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9564");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        executionEntity8.setName("hi!");
        int int15 = executionEntity8.getRevision();
        boolean boolean16 = executionEntity8.isSuspended();
        executionEntity8.inactivate();
        java.lang.String str18 = executionEntity8.getSuperExecutionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity8.getSuperExecution();
        executionEntity8.setEventScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement22 = null;
        executionEntity8.setEventSource(pvmProcessElement22);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl24 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl24);
        org.activiti.engine.impl.javax.el.ELContext eLContext26 = executionEntity25.getCachedElContext();
        org.activiti.engine.EngineServices engineServices27 = executionEntity25.getEngineServices();
        int int28 = executionEntity25.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl29 = null;
        executionEntity25.setActivity(activityImpl29);
        java.lang.Object obj31 = executionEntity25.getPersistentState();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement32 = executionEntity25.getEventSource();
        executionEntity25.setActive(false);
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity25);
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = executionEntity25.getProcessVariables();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(executionEntity19);
        org.junit.Assert.assertNull(eLContext26);
        org.junit.Assert.assertNull(engineServices27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 7 + "'", int28 == 7);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(pvmProcessElement32);
        org.junit.Assert.assertNotNull(strMap36);
    }

    @Test
    public void test9565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9565");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        executionEntity1.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity7 = null;
        executionEntity1.removeJob(jobEntity7);
        int int9 = executionEntity1.getCachedEntityState();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = executionEntity1.hasVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test9566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9566");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution13 = executionEntity8.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = executionEntity15.getCachedElContext();
        org.activiti.engine.EngineServices engineServices17 = executionEntity15.getEngineServices();
        int int18 = executionEntity15.getCachedEntityState();
        java.lang.String str19 = executionEntity15.getTenantId();
        executionEntity8.setSuperExecution(executionEntity15);
        java.lang.String str21 = executionEntity8.getCurrentActivityName();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl22 = executionEntity8.getTransition();
        java.lang.String str23 = executionEntity8.getCurrentActivityName();
        executionEntity8.setParentId("ProcessInstance[null]");
        int int26 = executionEntity8.getCachedEntityState();
        java.lang.String str27 = executionEntity8.getDeleteReason();
        java.lang.String str28 = executionEntity8.getEventName();
        java.lang.String str29 = executionEntity8.getParentId();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(startingExecution13);
        org.junit.Assert.assertNull(eLContext16);
        org.junit.Assert.assertNull(engineServices17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(transitionImpl22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ProcessInstance[null]" + "'", str29, "ProcessInstance[null]");
    }

    @Test
    public void test9567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9567");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl4 = executionEntity1.getProcessDefinition();
        boolean boolean5 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement6 = executionEntity1.getEventSource();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = null;
        executionEntity1.setTransition(transitionImpl7);
        java.lang.Object obj9 = executionEntity1.getPersistentState();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = executionEntity1.getQueryVariables();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(processDefinitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pvmProcessElement6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(variableInstanceEntityList10);
    }

    @Test
    public void test9568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9568");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        boolean boolean5 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity1.getActivity();
        executionEntity1.setId("");
        executionEntity1.setScope(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList11 = executionEntity1.getQueryVariables();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(activityImpl6);
        org.junit.Assert.assertNull(variableInstanceEntityList11);
    }

    @Test
    public void test9569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9569");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getBusinessKey();
        int int6 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.getSuperExecution();
        executionEntity1.setParentId("ProcessInstance[null]");
        java.lang.String str10 = executionEntity1.toString();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList11 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement12 = null;
        executionEntity1.setEventSource(pvmProcessElement12);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertNull(executionEntity7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ScopeExecution[null]" + "'", str10, "ScopeExecution[null]");
        org.junit.Assert.assertNull(variableInstanceEntityList11);
    }

    @Test
    public void test9570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9570");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        org.activiti.engine.impl.javax.el.ELContext eLContext4 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity5 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList6 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity5);
        java.lang.String str7 = executionEntity1.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity1.getTransition();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        org.activiti.engine.impl.javax.el.ELContext eLContext11 = executionEntity10.getCachedElContext();
        boolean boolean12 = executionEntity10.isSuspended();
        java.lang.Object obj13 = executionEntity10.getPersistentState();
        java.lang.Object obj14 = executionEntity10.getPersistentState();
        org.activiti.engine.impl.javax.el.ELContext eLContext15 = null;
        executionEntity10.setCachedElContext(eLContext15);
        executionEntity10.setExecutionListenerIndex((java.lang.Integer) 7);
        executionEntity10.setBusinessKey("");
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        java.lang.String str22 = executionEntity10.getDeleteReason();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(eLContext4);
        org.junit.Assert.assertNotNull(activityExecutionList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(transitionImpl8);
        org.junit.Assert.assertNull(eLContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test9571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9571");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        boolean boolean7 = executionEntity1.isEventScope();
        int int8 = executionEntity1.getRevision();
        java.lang.String str9 = executionEntity1.getCurrentActivityName();
        executionEntity1.setParentId("ScopeExecution[null]");
        executionEntity1.setCachedEntityState((int) (byte) 100);
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test9572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9572");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setSuspensionState((-1));
        executionEntity1.setParentId("hi!");
        boolean boolean8 = executionEntity1.isActive();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = null;
        executionEntity1.setSuperExecution(executionEntity9);
        java.lang.String str11 = executionEntity1.getEventName();
        java.lang.String str12 = executionEntity1.getTenantId();
        java.lang.String str13 = executionEntity1.getActivityId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity1.getVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test9573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9573");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        boolean boolean5 = executionEntity1.isEnded();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity1.getTransition();
        boolean boolean7 = executionEntity1.isProcessInstanceType();
        executionEntity1.setConcurrent(true);
        java.lang.String str10 = executionEntity1.getName();
        executionEntity1.disposeStartingExecution();
        boolean boolean12 = executionEntity1.isConcurrent();
        executionEntity1.setConcurrent(true);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(transitionImpl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test9574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9574");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray2 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3, variableInstanceEntityArray2);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3);
        executionEntity1.setTenantId("ProcessInstance[null]");
        boolean boolean8 = executionEntity1.isScope();
        executionEntity1.inactivate();
        boolean boolean10 = executionEntity1.isDeleteRoot();
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity1.getProcessInstance();
        executionEntity1.setProcessDefinitionId("ProcessInstance[ProcessInstance[null]]");
        org.junit.Assert.assertNotNull(variableInstanceEntityArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(executionEntity12);
    }

    @Test
    public void test9575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9575");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getReplacedBy();
        executionEntity0.inactivate();
        int int3 = executionEntity0.getCachedEntityState();
        executionEntity0.setProcessDefinitionId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        org.activiti.engine.impl.javax.el.ELContext eLContext8 = executionEntity7.getCachedElContext();
        org.activiti.engine.EngineServices engineServices9 = executionEntity7.getEngineServices();
        int int10 = executionEntity7.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        executionEntity7.setActivity(activityImpl11);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity7.getProcessInstance();
        executionEntity7.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str16 = executionEntity7.getTenantId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution17 = executionEntity7.getStartingExecution();
        int int18 = executionEntity7.getRevisionNext();
        java.lang.String str19 = executionEntity7.getCurrentActivityId();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl21 = executionEntity7.getTransitionBeingTaken();
        executionEntity7.setSuspensionState((int) (byte) 100);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl24 = executionEntity7.getTransitionBeingTaken();
        org.junit.Assert.assertNull(executionEntity1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertNull(eLContext8);
        org.junit.Assert.assertNull(engineServices9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNull(executionEntity13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(startingExecution17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(transitionImpl21);
        org.junit.Assert.assertNull(transitionImpl24);
    }

    @Test
    public void test9576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9576");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isEnded();
        boolean boolean4 = executionEntity1.isActive();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str10 = executionEntity1.getTenantId();
        boolean boolean11 = executionEntity1.isEventScope();
        executionEntity1.setName("ProcessInstance[null]");
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 36);
        org.activiti.engine.impl.pvm.PvmProcessDefinition pvmProcessDefinition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.PvmProcessInstance pvmProcessInstance17 = executionEntity1.createSubProcessInstance(pvmProcessDefinition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test9577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9577");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        boolean boolean7 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = null;
        executionEntity1.setEventSource(pvmProcessElement8);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.javax.el.ELContext eLContext12 = executionEntity11.getCachedElContext();
        org.activiti.engine.EngineServices engineServices13 = executionEntity11.getEngineServices();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution14 = executionEntity11.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl15 = executionEntity11.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        executionEntity1.setActivity(activityImpl17);
        org.activiti.engine.impl.javax.el.ELContext eLContext19 = executionEntity1.getCachedElContext();
        executionEntity1.setRevision((int) (short) 10);
        boolean boolean22 = executionEntity1.isSuspended();
        boolean boolean23 = executionEntity1.isEventScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList24 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement25 = null;
        executionEntity1.setEventSource(pvmProcessElement25);
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(eLContext12);
        org.junit.Assert.assertNull(engineServices13);
        org.junit.Assert.assertNotNull(startingExecution14);
        org.junit.Assert.assertNull(processDefinitionImpl15);
        org.junit.Assert.assertNull(eLContext19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(variableInstanceEntityList24);
    }

    @Test
    public void test9578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9578");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        boolean boolean7 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = null;
        executionEntity1.setEventSource(pvmProcessElement8);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.javax.el.ELContext eLContext12 = executionEntity11.getCachedElContext();
        org.activiti.engine.EngineServices engineServices13 = executionEntity11.getEngineServices();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution14 = executionEntity11.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl15 = executionEntity11.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        executionEntity1.setActivity(activityImpl17);
        org.activiti.engine.impl.javax.el.ELContext eLContext19 = executionEntity1.getCachedElContext();
        executionEntity1.setRevision((int) (short) 10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = executionEntity1.getParent();
        int int23 = executionEntity22.getSuspensionState();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl24 = null;
        executionEntity22.setTransition(transitionImpl24);
        int int26 = executionEntity22.getCachedEntityState();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(eLContext12);
        org.junit.Assert.assertNull(engineServices13);
        org.junit.Assert.assertNotNull(startingExecution14);
        org.junit.Assert.assertNull(processDefinitionImpl15);
        org.junit.Assert.assertNull(eLContext19);
        org.junit.Assert.assertNotNull(executionEntity22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
    }

    @Test
    public void test9579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9579");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        int int4 = executionEntity1.getCachedEntityState();
        java.lang.String str5 = executionEntity1.getTenantId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement6 = null;
        executionEntity1.setEventSource(pvmProcessElement6);
        executionEntity1.setActive(true);
        java.lang.String str10 = executionEntity1.toString();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        org.activiti.engine.impl.javax.el.ELContext eLContext13 = executionEntity12.getCachedElContext();
        org.activiti.engine.EngineServices engineServices14 = executionEntity12.getEngineServices();
        int int15 = executionEntity12.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        executionEntity12.setActivity(activityImpl16);
        boolean boolean18 = executionEntity12.isDeleteRoot();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList19 = executionEntity12.getQueryVariables();
        executionEntity12.forceUpdate();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        boolean boolean22 = executionEntity12.isEnded();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList23 = executionEntity12.getIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ProcessInstance[null]" + "'", str10, "ProcessInstance[null]");
        org.junit.Assert.assertNull(eLContext13);
        org.junit.Assert.assertNull(engineServices14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(variableInstanceEntityList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test9580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9580");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        org.activiti.engine.impl.javax.el.ELContext eLContext4 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity5 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList6 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity5);
        java.util.Collection<java.lang.String> strCollection7 = null;
        executionEntity1.removeVariables(strCollection7);
        boolean boolean9 = executionEntity1.isEnded();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList10 = executionEntity1.getIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(eLContext4);
        org.junit.Assert.assertNotNull(activityExecutionList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test9581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9581");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity14.setSuspensionState((-1));
        java.lang.String str19 = executionEntity14.getName();
        executionEntity8.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        java.lang.String str21 = executionEntity14.getName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl22 = executionEntity14.getActivity();
        executionEntity14.disposeStartingExecution();
        java.lang.String str24 = executionEntity14.getActivityId();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity27 = executionEntity14.addIdentityLink("hi!", "ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(activityImpl22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test9582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9582");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setEventScope(true);
        org.activiti.engine.EngineServices engineServices7 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity1.getEventSource();
        java.lang.String str9 = executionEntity1.getDeleteReason();
        java.lang.String str10 = executionEntity1.getTenantId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution11 = executionEntity1.getStartingExecution();
        java.lang.String[] strArray20 = new java.lang.String[] { "ScopeExecution[ProcessInstance[null]]", "ProcessInstance[]", "ProcessInstance[ProcessInstance[null]]", "ProcessInstance[ScopeExecution[null]]", "ProcessInstance[hi!]", "ProcessInstance[ProcessInstance[ProcessInstance[null]]]", "ProcessInstance[hi!]", "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables((java.util.Collection<java.lang.String>) strList21);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices7);
        org.junit.Assert.assertNull(pvmProcessElement8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(startingExecution11);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test9583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9583");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = executionEntity1.getCachedElContext();
        int int6 = executionEntity1.getCachedEntityState();
        java.lang.String str7 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = null;
        executionEntity1.setEventSource(pvmProcessElement8);
        executionEntity1.setParentId("");
        executionEntity1.inactivate();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(eLContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test9584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9584");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        executionEntity8.setName("hi!");
        int int15 = executionEntity8.getRevision();
        java.lang.String str16 = executionEntity8.toString();
        boolean boolean17 = executionEntity8.isSuspended();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.javax.el.ELContext eLContext20 = executionEntity19.getCachedElContext();
        executionEntity19.forceUpdate();
        executionEntity19.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution24 = executionEntity19.getStartingExecution();
        boolean boolean25 = executionEntity19.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement26 = null;
        executionEntity19.setEventSource(pvmProcessElement26);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl28 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl28);
        org.activiti.engine.impl.javax.el.ELContext eLContext30 = executionEntity29.getCachedElContext();
        org.activiti.engine.EngineServices engineServices31 = executionEntity29.getEngineServices();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution32 = executionEntity29.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl33 = executionEntity29.getProcessDefinition();
        executionEntity19.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity29);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl35 = null;
        executionEntity19.setActivity(activityImpl35);
        org.activiti.engine.impl.javax.el.ELContext eLContext37 = executionEntity19.getCachedElContext();
        executionEntity19.setRevision((int) (short) 10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = executionEntity19.getParent();
        executionEntity19.setTenantId("hi!");
        boolean boolean43 = executionEntity19.isDeleteRoot();
        executionEntity8.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ProcessInstance[null]" + "'", str16, "ProcessInstance[null]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(eLContext20);
        org.junit.Assert.assertNotNull(startingExecution24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(eLContext30);
        org.junit.Assert.assertNull(engineServices31);
        org.junit.Assert.assertNotNull(startingExecution32);
        org.junit.Assert.assertNull(processDefinitionImpl33);
        org.junit.Assert.assertNull(eLContext37);
        org.junit.Assert.assertNotNull(executionEntity40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test9585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9585");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getReplacedBy();
        boolean boolean6 = executionEntity1.isSuspended();
        executionEntity1.setSuspensionState((int) (short) -1);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        org.activiti.engine.impl.javax.el.ELContext eLContext11 = executionEntity10.getCachedElContext();
        org.activiti.engine.EngineServices engineServices12 = executionEntity10.getEngineServices();
        java.lang.Object obj13 = executionEntity10.getPersistentState();
        executionEntity10.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setExecutionListenerIndex((java.lang.Integer) 0);
        int int20 = executionEntity17.getSuspensionState();
        executionEntity10.setSuperExecution(executionEntity17);
        executionEntity17.setName("hi!");
        boolean boolean24 = executionEntity17.isDeleteRoot();
        executionEntity17.setEventName("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = executionEntity17.getProcessVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl28 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl28);
        executionEntity29.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity29.setSuspensionState((-1));
        java.lang.String str34 = executionEntity29.getName();
        executionEntity29.setSuspensionState((-1));
        org.activiti.engine.impl.javax.el.ELContext eLContext37 = executionEntity29.getCachedElContext();
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = executionEntity29.getProcessVariables();
        executionEntity17.createVariablesLocal(strMap38);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl40);
        org.activiti.engine.impl.javax.el.ELContext eLContext42 = executionEntity41.getCachedElContext();
        executionEntity41.forceUpdate();
        executionEntity41.setName("");
        int int46 = executionEntity41.getSuspensionState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl47 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity48 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl47);
        org.activiti.engine.impl.javax.el.ELContext eLContext49 = executionEntity48.getCachedElContext();
        executionEntity48.forceUpdate();
        executionEntity48.setName("");
        java.util.Map<java.lang.String, java.lang.Object> strMap53 = executionEntity48.getProcessVariables();
        executionEntity41.createVariablesLocal(strMap53);
        executionEntity17.setVariablesLocal(strMap53);
        executionEntity1.setVariables(strMap53);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement57 = executionEntity1.getEventSource();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(executionEntity5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(eLContext11);
        org.junit.Assert.assertNull(engineServices12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(eLContext37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNull(eLContext42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNull(eLContext49);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNull(pvmProcessElement57);
    }

    @Test
    public void test9586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9586");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity1.getActivity();
        executionEntity1.setProcessDefinitionId("");
        int int10 = executionEntity1.getRevisionNext();
        executionEntity1.setSuspensionState(3);
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(activityImpl7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test9587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9587");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        java.lang.String str4 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = null;
        executionEntity1.setCachedElContext(eLContext6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = executionEntity8.isDeleteRoot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(eLContext5);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test9588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9588");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        int int4 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        executionEntity1.setActivity(activityImpl5);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.getProcessInstance();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str10 = executionEntity1.getTenantId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution11 = executionEntity1.getStartingExecution();
        int int12 = executionEntity1.getRevisionNext();
        java.lang.String str13 = executionEntity1.getCurrentActivityId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity1.getVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNull(executionEntity7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(startingExecution11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test9589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9589");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        org.activiti.engine.impl.javax.el.ELContext eLContext4 = executionEntity1.getCachedElContext();
        java.lang.String str5 = executionEntity1.getSuperExecutionId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteCascade("ProcessInstance[hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(eLContext4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test9590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9590");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        org.activiti.engine.EngineServices engineServices6 = executionEntity1.getEngineServices();
        executionEntity1.inactivate();
        executionEntity1.setName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = executionEntity1.isActive("ProcessInstance[]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices6);
    }

    @Test
    public void test9591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9591");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        org.activiti.engine.impl.javax.el.ELContext eLContext4 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity5 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList6 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity5);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity8.getCachedElContext();
        boolean boolean10 = executionEntity8.isSuspended();
        java.lang.Object obj11 = executionEntity8.getPersistentState();
        java.lang.Object obj12 = executionEntity8.getPersistentState();
        boolean boolean13 = executionEntity8.isConcurrent();
        executionEntity8.setEventScope(false);
        int int16 = executionEntity8.getRevisionNext();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        boolean boolean18 = executionEntity8.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        executionEntity8.setActivity(activityImpl19);
        java.lang.String str21 = executionEntity8.getCurrentActivityId();
        java.lang.String str22 = executionEntity8.getParentId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement23 = null;
        executionEntity8.setEventSource(pvmProcessElement23);
        executionEntity8.disposeStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl26 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl26);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution28 = executionEntity27.getStartingExecution();
        java.lang.Object obj29 = executionEntity27.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = executionEntity27.getParent();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity30);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity34 = executionEntity8.involveUser("ProcessInstance[ScopeExecution[null]]", "ScopeExecution[ProcessInstance[null]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(eLContext4);
        org.junit.Assert.assertNotNull(activityExecutionList6);
        org.junit.Assert.assertNull(eLContext9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(startingExecution28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(executionEntity30);
    }

    @Test
    public void test9592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9592");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setSuspensionState((-1));
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.getSuperExecution();
        int int7 = executionEntity1.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity1.getProcessVariables();
        boolean boolean9 = executionEntity1.isProcessInstanceType();
        org.junit.Assert.assertNull(executionEntity6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test9593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9593");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setSuspensionState((-1));
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.getSuperExecution();
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getCurrentActivityName();
        executionEntity1.setId("ScopeExecution[null]");
        java.lang.String str11 = executionEntity1.toString();
        executionEntity1.setParentId("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl14);
        executionEntity1.setBusinessKey("ProcessInstance[ProcessInstance[null]]");
        executionEntity1.setName("ProcessInstance[ProcessInstance[null]]");
        org.junit.Assert.assertNull(executionEntity6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ProcessInstance[ScopeExecution[null]]" + "'", str11, "ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test9594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9594");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getBusinessKey();
        int int6 = executionEntity1.getRevisionNext();
        int int7 = executionEntity1.getRevision();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity1.getTransitionBeingTaken();
        boolean boolean9 = executionEntity1.isActive();
        java.lang.String str10 = executionEntity1.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(transitionImpl8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test9595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9595");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray2 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3, variableInstanceEntityArray2);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        org.activiti.engine.impl.javax.el.ELContext eLContext8 = executionEntity7.getCachedElContext();
        executionEntity7.forceUpdate();
        executionEntity7.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution12 = executionEntity7.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = executionEntity7.getTransitionBeingTaken();
        executionEntity7.setActive(true);
        java.lang.String str16 = executionEntity7.getActivityId();
        executionEntity1.setSuperExecution(executionEntity7);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution18 = executionEntity7.getStartingExecution();
        java.lang.String str19 = executionEntity7.getCurrentActivityName();
        org.junit.Assert.assertNotNull(variableInstanceEntityArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(eLContext8);
        org.junit.Assert.assertNotNull(startingExecution12);
        org.junit.Assert.assertNull(transitionImpl13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(startingExecution18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test9596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9596");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setEventScope(true);
        org.activiti.engine.EngineServices engineServices7 = executionEntity1.getEngineServices();
        executionEntity1.setCachedEntityState((int) 'a');
        executionEntity1.setConcurrent(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray14 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15, variableInstanceEntityArray14);
        executionEntity13.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl20);
        org.activiti.engine.impl.javax.el.ELContext eLContext22 = executionEntity21.getCachedElContext();
        boolean boolean23 = executionEntity21.isSuspended();
        java.lang.Object obj24 = executionEntity21.getPersistentState();
        java.lang.Object obj25 = executionEntity21.getPersistentState();
        boolean boolean26 = executionEntity21.isConcurrent();
        executionEntity21.setEventScope(false);
        int int29 = executionEntity21.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl30 = null;
        executionEntity21.setTransition(transitionImpl30);
        org.activiti.engine.impl.javax.el.ELContext eLContext32 = null;
        executionEntity21.setCachedElContext(eLContext32);
        executionEntity1.setSuperExecution(executionEntity21);
        org.activiti.engine.impl.javax.el.ELContext eLContext35 = executionEntity21.getCachedElContext();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = executionEntity21.hasVariable("ProcessInstance[]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices7);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(eLContext22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNull(eLContext35);
    }

    @Test
    public void test9597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9597");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setEventScope(true);
        org.activiti.engine.EngineServices engineServices7 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity1.getEventSource();
        boolean boolean9 = executionEntity1.isScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        executionEntity1.setActivity(activityImpl10);
        executionEntity1.inactivate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity1.getSuperExecution();
        executionEntity1.setProcessDefinitionId("ScopeExecution[ProcessInstance[null]]");
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices7);
        org.junit.Assert.assertNull(pvmProcessElement8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(executionEntity13);
    }

    @Test
    public void test9598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9598");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        boolean boolean2 = executionEntity1.isEnded();
        java.lang.String str3 = executionEntity1.getActivityId();
        executionEntity1.setCachedEntityState(0);
        org.activiti.engine.impl.pvm.runtime.InterpretableExecution interpretableExecution6 = null;
        executionEntity1.setSubProcessInstance(interpretableExecution6);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity1.getTransition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = executionEntity1.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(transitionImpl9);
    }

    @Test
    public void test9599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9599");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        executionEntity8.setName("hi!");
        int int15 = executionEntity8.getRevision();
        boolean boolean16 = executionEntity8.isEventScope();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = null;
        executionEntity8.setTransitionBeingTaken(transitionImpl17);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity8.getReplacedBy();
        executionEntity8.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl22 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl22);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray24 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList25 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList25, variableInstanceEntityArray24);
        executionEntity23.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList25);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList28 = executionEntity23.getQueryVariables();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl29 = null;
        executionEntity23.setTransitionBeingTaken(transitionImpl29);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl31 = null;
        executionEntity23.setActivity(activityImpl31);
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = executionEntity23.getProcessVariables();
        executionEntity8.setVariables(strMap33);
        java.lang.String str35 = executionEntity8.getProcessInstanceId();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(executionEntity19);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(variableInstanceEntityList28);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test9600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9600");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        int int4 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        executionEntity1.setActivity(activityImpl5);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        boolean boolean9 = executionEntity1.isConcurrent();
        boolean boolean10 = executionEntity1.isEventScope();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test9601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9601");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        executionEntity8.setName("hi!");
        int int15 = executionEntity8.getRevision();
        java.lang.String str16 = executionEntity8.getParentId();
        executionEntity8.setBusinessKey("ScopeExecution[null]");
        executionEntity8.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity8.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity8.getReplacedBy();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(executionEntity20);
        org.junit.Assert.assertNull(executionEntity21);
    }

    @Test
    public void test9602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9602");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setSuspensionState((-1));
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl7 = executionEntity1.getProcessDefinition();
        executionEntity1.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity10 = null;
        executionEntity1.removeEventSubscription(eventSubscriptionEntity10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        org.activiti.engine.impl.javax.el.ELContext eLContext14 = executionEntity13.getCachedElContext();
        boolean boolean15 = executionEntity13.isSuspended();
        java.lang.Object obj16 = executionEntity13.getPersistentState();
        executionEntity13.setEventScope(true);
        org.activiti.engine.EngineServices engineServices19 = executionEntity13.getEngineServices();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement20 = executionEntity13.getEventSource();
        java.lang.String str21 = executionEntity13.getDeleteReason();
        java.lang.String str22 = executionEntity13.getTenantId();
        int int23 = executionEntity13.getRevisionNext();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity13.setConcurrent(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = executionEntity13.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = executionEntity13.hasVariable("ProcessInstance[ProcessInstance[ProcessInstance[null]]]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity6);
        org.junit.Assert.assertNull(processDefinitionImpl7);
        org.junit.Assert.assertNull(eLContext14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices19);
        org.junit.Assert.assertNull(pvmProcessElement20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test9603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9603");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setSuspensionState((-1));
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.getSuperExecution();
        int int7 = executionEntity1.getSuspensionState();
        executionEntity1.setDeleteReason("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        org.junit.Assert.assertNull(executionEntity6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(executionEntity10);
    }

    @Test
    public void test9604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9604");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        int int4 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        executionEntity1.setActivity(activityImpl5);
        java.lang.Object obj7 = executionEntity1.getPersistentState();
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity8 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeEventSubscription(eventSubscriptionEntity8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test9605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9605");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        executionEntity1.setActivity(activityImpl7);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList9 = executionEntity1.getQueryVariables();
        executionEntity1.setRevision(1);
        executionEntity1.setBusinessKey("ProcessInstance[null]");
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity16 = executionEntity1.addIdentityLink("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(variableInstanceEntityList9);
    }

    @Test
    public void test9606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9606");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        org.activiti.engine.EngineServices engineServices13 = executionEntity8.getEngineServices();
        org.activiti.engine.impl.pvm.runtime.InterpretableExecution interpretableExecution14 = null;
        executionEntity8.setParent(interpretableExecution14);
        executionEntity8.setRevision((int) (byte) 100);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl18 = null;
        executionEntity8.setTransitionBeingTaken(transitionImpl18);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl20);
        org.activiti.engine.impl.javax.el.ELContext eLContext22 = executionEntity21.getCachedElContext();
        executionEntity21.forceUpdate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl24 = executionEntity21.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity21.getSuperExecution();
        executionEntity21.setTenantId("");
        executionEntity21.setBusinessKey("");
        boolean boolean30 = executionEntity21.isConcurrent();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement31 = null;
        executionEntity21.setEventSource(pvmProcessElement31);
        executionEntity8.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
        java.lang.String str34 = executionEntity8.getSuperExecutionId();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(engineServices13);
        org.junit.Assert.assertNull(eLContext22);
        org.junit.Assert.assertNull(transitionImpl24);
        org.junit.Assert.assertNull(executionEntity25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test9607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9607");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity14.setSuspensionState((-1));
        java.lang.String str19 = executionEntity14.getName();
        executionEntity8.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl21 = null;
        executionEntity14.setTransitionBeingTaken(transitionImpl21);
        executionEntity14.setScope(true);
        executionEntity14.setCachedEntityState((int) (short) 10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        executionEntity28.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity28.setSuspensionState((-1));
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = executionEntity28.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl34 = executionEntity28.getProcessDefinition();
        executionEntity28.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity37 = null;
        executionEntity28.removeEventSubscription(eventSubscriptionEntity37);
        boolean boolean39 = executionEntity28.isProcessInstanceType();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList40 = executionEntity28.getEventSubscriptions();
        executionEntity28.setRevision((-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = executionEntity28.getProcessVariables();
        executionEntity14.setVariables(strMap43);
        boolean boolean45 = executionEntity14.isEnded();
        executionEntity14.setId("");
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(executionEntity33);
        org.junit.Assert.assertNull(processDefinitionImpl34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(eventSubscriptionEntityList40);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test9608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9608");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        executionEntity1.setActivity(activityImpl7);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList9 = executionEntity1.getQueryVariables();
        boolean boolean10 = executionEntity1.isProcessInstanceType();
        org.activiti.engine.EngineServices engineServices11 = executionEntity1.getEngineServices();
        executionEntity1.inactivate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity1.getSuperExecution();
        executionEntity1.setEventName("ScopeExecution[null]");
        executionEntity1.setId("ProcessInstance[]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity18.setExecutionListenerIndex((java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(variableInstanceEntityList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(engineServices11);
        org.junit.Assert.assertNull(executionEntity13);
        org.junit.Assert.assertNull(executionEntity18);
    }

    @Test
    public void test9609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9609");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getReplacedBy();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity5.getCachedElContext();
        boolean boolean7 = executionEntity5.isSuspended();
        java.lang.Object obj8 = executionEntity5.getPersistentState();
        java.lang.Object obj9 = executionEntity5.getPersistentState();
        boolean boolean10 = executionEntity5.isConcurrent();
        java.lang.String str11 = executionEntity5.toString();
        int int12 = executionEntity5.getRevisionNext();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity1.setParentId("");
        boolean boolean16 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity1.getReplacedBy();
        java.lang.String str18 = executionEntity1.getEventName();
        boolean boolean19 = executionEntity1.isEnded();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(executionEntity3);
        org.junit.Assert.assertNull(eLContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ProcessInstance[null]" + "'", str11, "ProcessInstance[null]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(executionEntity17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test9610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9610");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getProcessInstanceId();
        executionEntity1.setSuspensionState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList8 = executionEntity1.getQueryVariables();
        java.lang.String str9 = executionEntity1.getBusinessKey();
        java.lang.String str10 = executionEntity1.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(variableInstanceEntityList8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test9611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9611");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        boolean boolean6 = executionEntity1.isConcurrent();
        executionEntity1.setEventScope(true);
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = null;
        executionEntity1.setCachedElContext(eLContext9);
        org.activiti.engine.impl.javax.el.ELContext eLContext11 = executionEntity1.getCachedElContext();
        executionEntity1.setName("ProcessInstance[]");
        executionEntity1.setSuspensionState((int) (short) 100);
        java.lang.String str16 = executionEntity1.getProcessInstanceId();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(eLContext11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test9612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9612");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setSuspensionState((-1));
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl7 = executionEntity1.getProcessDefinition();
        int int8 = executionEntity1.getSuspensionState();
        java.lang.String str9 = executionEntity1.toString();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution10 = executionEntity1.getStartingExecution();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity1.getCompensateEventSubscriptions("ProcessInstance[]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity6);
        org.junit.Assert.assertNull(processDefinitionImpl7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ProcessInstance[null]" + "'", str9, "ProcessInstance[null]");
        org.junit.Assert.assertNotNull(startingExecution10);
    }

    @Test
    public void test9613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9613");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        int int4 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        executionEntity1.setActivity(activityImpl5);
        java.lang.Object obj7 = executionEntity1.getPersistentState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        org.activiti.engine.impl.javax.el.ELContext eLContext10 = executionEntity9.getCachedElContext();
        executionEntity9.forceUpdate();
        executionEntity9.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution14 = executionEntity9.getStartingExecution();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        org.activiti.engine.impl.javax.el.ELContext eLContext19 = executionEntity18.getCachedElContext();
        org.activiti.engine.EngineServices engineServices20 = executionEntity18.getEngineServices();
        java.lang.Object obj21 = executionEntity18.getPersistentState();
        executionEntity18.setActive(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl24 = null;
        executionEntity18.setActivity(activityImpl24);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList26 = executionEntity18.getQueryVariables();
        boolean boolean27 = executionEntity18.isProcessInstanceType();
        org.activiti.engine.EngineServices engineServices28 = executionEntity18.getEngineServices();
        executionEntity18.inactivate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = executionEntity18.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity9.setVariable("ProcessInstance[ProcessInstance[ProcessInstance[null]]]", (java.lang.Object) executionEntity30);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(eLContext10);
        org.junit.Assert.assertNotNull(startingExecution14);
        org.junit.Assert.assertNull(eLContext19);
        org.junit.Assert.assertNull(engineServices20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(variableInstanceEntityList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(engineServices28);
        org.junit.Assert.assertNull(executionEntity30);
    }

    @Test
    public void test9614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9614");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        boolean boolean7 = executionEntity1.isEventScope();
        boolean boolean8 = executionEntity1.isScope();
        java.lang.String str9 = executionEntity1.getCurrentActivityName();
        executionEntity1.setEventScope(false);
        org.activiti.engine.EngineServices engineServices12 = executionEntity1.getEngineServices();
        boolean boolean13 = executionEntity1.isEnded();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(engineServices12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test9615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9615");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.inactivate();
        executionEntity1.setEventScope(false);
    }

    @Test
    public void test9616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9616");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl4 = executionEntity1.getProcessDefinition();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setBusinessKey("ProcessInstance[null]");
        executionEntity1.setDeleteReason("ProcessInstance[null]");
        java.lang.Object obj10 = executionEntity1.getPersistentState();
        executionEntity1.setActive(false);
        java.lang.String str13 = executionEntity1.getCurrentActivityId();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(processDefinitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=ProcessInstance[null], name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=ProcessInstance[null], name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=ProcessInstance[null], name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test9617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9617");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        executionEntity8.setName("hi!");
        executionEntity8.setSuspensionState((int) 'a');
        org.activiti.engine.impl.javax.el.ELContext eLContext17 = null;
        executionEntity8.setCachedElContext(eLContext17);
        executionEntity8.inactivate();
        java.lang.String str20 = executionEntity8.getSuperExecutionId();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test9618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9618");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        executionEntity8.setName("hi!");
        int int15 = executionEntity8.getRevision();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = executionEntity8.getProcessVariables();
        executionEntity8.setName("ProcessInstance[null]");
        executionEntity8.inactivate();
        boolean boolean20 = executionEntity8.isScope();
        java.lang.String str21 = executionEntity8.getTenantId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity8.removeVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test9619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9619");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getReplacedBy();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity5.getCachedElContext();
        boolean boolean7 = executionEntity5.isSuspended();
        java.lang.Object obj8 = executionEntity5.getPersistentState();
        java.lang.Object obj9 = executionEntity5.getPersistentState();
        boolean boolean10 = executionEntity5.isConcurrent();
        java.lang.String str11 = executionEntity5.toString();
        int int12 = executionEntity5.getRevisionNext();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity5.getProcessVariables();
        executionEntity5.setRevision((int) '#');
        boolean boolean17 = executionEntity5.isConcurrent();
        java.lang.String str18 = executionEntity5.getTenantId();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity19 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.removeTask(taskEntity19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(executionEntity3);
        org.junit.Assert.assertNull(eLContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ProcessInstance[null]" + "'", str11, "ProcessInstance[null]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test9620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9620");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity1.getTransitionBeingTaken();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity1.getProcessVariables();
        int int9 = executionEntity1.getRevision();
        org.activiti.engine.EngineServices engineServices10 = executionEntity1.getEngineServices();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroyScope("ProcessInstance[ProcessInstance[null]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertNull(transitionImpl7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(engineServices10);
    }

    @Test
    public void test9621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9621");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        executionEntity1.setActivity(activityImpl7);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList9 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.javax.el.ELContext eLContext10 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity11 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addEventSubscription(eventSubscriptionEntity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(variableInstanceEntityList9);
        org.junit.Assert.assertNull(eLContext10);
    }

    @Test
    public void test9622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9622");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity1.getTransitionBeingTaken();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity1.getSuperExecution();
        boolean boolean10 = executionEntity1.isDeleteRoot();
        int int11 = executionEntity1.getSuspensionState();
        executionEntity1.forceUpdate();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertNull(transitionImpl7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(executionEntity9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test9623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9623");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        org.activiti.engine.impl.javax.el.ELContext eLContext4 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity5 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList6 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity5);
        java.lang.String str7 = executionEntity1.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity1.getTransition();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        org.activiti.engine.impl.javax.el.ELContext eLContext11 = executionEntity10.getCachedElContext();
        boolean boolean12 = executionEntity10.isSuspended();
        java.lang.Object obj13 = executionEntity10.getPersistentState();
        java.lang.Object obj14 = executionEntity10.getPersistentState();
        org.activiti.engine.impl.javax.el.ELContext eLContext15 = null;
        executionEntity10.setCachedElContext(eLContext15);
        executionEntity10.setExecutionListenerIndex((java.lang.Integer) 7);
        executionEntity10.setBusinessKey("");
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        java.lang.String str22 = executionEntity10.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl23 = null;
        executionEntity10.setTransition(transitionImpl23);
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(eLContext4);
        org.junit.Assert.assertNotNull(activityExecutionList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(transitionImpl8);
        org.junit.Assert.assertNull(eLContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test9624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9624");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl5 = executionEntity1.getProcessDefinition();
        executionEntity1.setEventScope(false);
        executionEntity1.setConcurrent(true);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setProcessDefinition(processDefinitionImpl10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(startingExecution4);
        org.junit.Assert.assertNull(processDefinitionImpl5);
    }

    @Test
    public void test9625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9625");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl4 = executionEntity1.getProcessDefinition();
        boolean boolean5 = executionEntity1.isEventScope();
        boolean boolean6 = executionEntity1.isConcurrent();
        boolean boolean7 = executionEntity1.isActive();
        java.lang.String str8 = executionEntity1.getProcessInstanceId();
        executionEntity1.setConcurrent(true);
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(processDefinitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test9626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9626");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        executionEntity1.setName("hi!");
        executionEntity1.setName("");
        executionEntity1.setConcurrent(false);
        java.lang.String str19 = executionEntity1.getBusinessKey();
        int int20 = executionEntity1.getSuspensionState();
        java.lang.String str21 = executionEntity1.getActivityId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList22 = executionEntity1.getEventSubscriptionsInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test9627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9627");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        boolean boolean6 = executionEntity1.isConcurrent();
        executionEntity1.setEventScope(false);
        int int9 = executionEntity1.getRevisionNext();
        executionEntity1.setBusinessKey("");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        org.activiti.engine.impl.javax.el.ELContext eLContext15 = executionEntity14.getCachedElContext();
        org.activiti.engine.EngineServices engineServices16 = executionEntity14.getEngineServices();
        int int17 = executionEntity14.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        executionEntity14.setActivity(activityImpl18);
        java.lang.Object obj20 = executionEntity14.getPersistentState();
        java.lang.String str21 = executionEntity14.getProcessDefinitionId();
        executionEntity14.inactivate();
        java.lang.String str23 = executionEntity14.getEventName();
        executionEntity14.forceUpdate();
        org.activiti.engine.impl.javax.el.ELContext eLContext25 = executionEntity14.getCachedElContext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl26 = null;
        executionEntity14.setActivity(activityImpl26);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = executionEntity1.getSubProcessInstance();
        org.activiti.engine.impl.javax.el.ELContext eLContext30 = executionEntity29.getCachedElContext();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(eLContext15);
        org.junit.Assert.assertNull(engineServices16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(eLContext25);
        org.junit.Assert.assertNotNull(executionEntity29);
        org.junit.Assert.assertNull(eLContext30);
    }

    @Test
    public void test9628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9628");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution13 = executionEntity8.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = executionEntity15.getCachedElContext();
        org.activiti.engine.EngineServices engineServices17 = executionEntity15.getEngineServices();
        int int18 = executionEntity15.getCachedEntityState();
        java.lang.String str19 = executionEntity15.getTenantId();
        executionEntity8.setSuperExecution(executionEntity15);
        java.lang.String str21 = executionEntity8.getCurrentActivityName();
        executionEntity8.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl24 = null;
        executionEntity8.setTransition(transitionImpl24);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = executionEntity8.getProcessInstance();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        org.activiti.engine.impl.javax.el.ELContext eLContext29 = executionEntity28.getCachedElContext();
        org.activiti.engine.EngineServices engineServices30 = executionEntity28.getEngineServices();
        java.lang.Object obj31 = executionEntity28.getPersistentState();
        executionEntity28.setId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl34 = executionEntity28.getTransition();
        executionEntity28.setProcessDefinitionId("hi!");
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity28);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity28.initialize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(startingExecution13);
        org.junit.Assert.assertNull(eLContext16);
        org.junit.Assert.assertNull(engineServices17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(executionEntity26);
        org.junit.Assert.assertNull(eLContext29);
        org.junit.Assert.assertNull(engineServices30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(transitionImpl34);
    }

    @Test
    public void test9629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9629");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getParent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getCurrentActivityId();
        executionEntity0.setParentId("ProcessInstance[null]");
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity0.getCachedElContext();
        executionEntity0.setDeleteReason("ProcessInstance[ScopeExecution[null]]");
        boolean boolean12 = executionEntity0.isConcurrent();
        boolean boolean13 = executionEntity0.isDeleteRoot();
        boolean boolean14 = executionEntity0.isScope();
        org.junit.Assert.assertNull(executionEntity1);
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(eLContext9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test9630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9630");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        boolean boolean4 = executionEntity1.isConcurrent();
        java.lang.String str5 = executionEntity1.getProcessInstanceId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = executionEntity1.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test9631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9631");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getProcessInstanceId();
        boolean boolean6 = executionEntity1.isEventScope();
        executionEntity1.setScope(false);
        java.lang.String str9 = executionEntity1.getName();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity10 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addJob(jobEntity10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test9632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9632");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setEventScope(true);
        org.activiti.engine.EngineServices engineServices7 = executionEntity1.getEngineServices();
        executionEntity1.setCachedEntityState((int) 'a');
        executionEntity1.setConcurrent(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray14 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15, variableInstanceEntityArray14);
        executionEntity13.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = executionEntity1.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices7);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test9633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9633");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        boolean boolean5 = executionEntity1.isEnded();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity1.getTransition();
        executionEntity1.setEventScope(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray11 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList12 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList12, variableInstanceEntityArray11);
        executionEntity10.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList12);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = executionEntity10.getQueryVariables();
        executionEntity1.setQueryVariables(variableInstanceEntityList15);
        executionEntity1.setEventName("ProcessInstance[null]");
        executionEntity1.setTenantId("ProcessInstance[hi!]");
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 2);
        executionEntity1.setTenantId("hi!");
        java.lang.String str25 = executionEntity1.getActivityId();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl26 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setProcessDefinition(processDefinitionImpl26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(transitionImpl6);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(variableInstanceEntityList15);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test9634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9634");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        int int4 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        executionEntity1.setActivity(activityImpl5);
        java.lang.Object obj7 = executionEntity1.getPersistentState();
        java.lang.String str8 = executionEntity1.getProcessDefinitionId();
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = executionEntity1.getTransitionBeingTaken();
        java.lang.String str12 = executionEntity1.getActivityId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(transitionImpl11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test9635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9635");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        boolean boolean4 = executionEntity1.isActive();
        org.activiti.engine.EngineServices engineServices5 = executionEntity1.getEngineServices();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(engineServices5);
    }

    @Test
    public void test9636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9636");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setEventName("");
        executionEntity0.setId("ProcessInstance[null]");
        executionEntity0.setName("hi!");
        boolean boolean7 = executionEntity0.isEventScope();
        executionEntity0.disposeStartingExecution();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test9637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9637");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setEventScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl7);
        java.lang.String str9 = executionEntity1.getBusinessKey();
        boolean boolean10 = executionEntity1.isScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        org.activiti.engine.impl.javax.el.ELContext eLContext13 = executionEntity12.getCachedElContext();
        org.activiti.engine.EngineServices engineServices14 = executionEntity12.getEngineServices();
        java.lang.Object obj15 = executionEntity12.getPersistentState();
        executionEntity12.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setExecutionListenerIndex((java.lang.Integer) 0);
        int int22 = executionEntity19.getSuspensionState();
        executionEntity12.setSuperExecution(executionEntity19);
        executionEntity19.setName("hi!");
        boolean boolean26 = executionEntity19.isDeleteRoot();
        executionEntity19.setEventName("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = executionEntity19.getProcessVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl30 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl30);
        executionEntity31.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity31.setSuspensionState((-1));
        java.lang.String str36 = executionEntity31.getName();
        executionEntity31.setSuspensionState((-1));
        org.activiti.engine.impl.javax.el.ELContext eLContext39 = executionEntity31.getCachedElContext();
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = executionEntity31.getProcessVariables();
        executionEntity19.createVariablesLocal(strMap40);
        executionEntity1.setVariablesLocal(strMap40);
        org.activiti.engine.impl.javax.el.ELContext eLContext43 = null;
        executionEntity1.setCachedElContext(eLContext43);
        executionEntity1.setRevision((int) (byte) 0);
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(eLContext13);
        org.junit.Assert.assertNull(engineServices14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(eLContext39);
        org.junit.Assert.assertNotNull(strMap40);
    }

    @Test
    public void test9638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9638");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        int int4 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        executionEntity1.setActivity(activityImpl5);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray7 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList8 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList8, variableInstanceEntityArray7);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList8);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        org.activiti.engine.impl.javax.el.ELContext eLContext15 = executionEntity14.getCachedElContext();
        org.activiti.engine.EngineServices engineServices16 = executionEntity14.getEngineServices();
        int int17 = executionEntity14.getCachedEntityState();
        java.lang.String str18 = executionEntity14.getTenantId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement19 = null;
        executionEntity14.setEventSource(pvmProcessElement19);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl21 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl21);
        org.activiti.engine.impl.javax.el.ELContext eLContext23 = executionEntity22.getCachedElContext();
        boolean boolean24 = executionEntity22.isSuspended();
        java.lang.Object obj25 = executionEntity22.getPersistentState();
        executionEntity22.setEventScope(true);
        org.activiti.engine.EngineServices engineServices28 = executionEntity22.getEngineServices();
        executionEntity22.setCachedEntityState((int) 'a');
        executionEntity22.setConcurrent(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray35 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList36 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList36, variableInstanceEntityArray35);
        executionEntity34.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList36);
        executionEntity22.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList36);
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = executionEntity22.getProcessVariables();
        executionEntity14.setVariablesLocal(strMap40);
        executionEntity1.createVariablesLocal(strMap40);
        java.lang.Object obj44 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setVariable("hi!", obj44);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(eLContext15);
        org.junit.Assert.assertNull(engineServices16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(eLContext23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices28);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strMap40);
    }

    @Test
    public void test9639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9639");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        int int4 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        executionEntity1.setActivity(activityImpl5);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.getProcessInstance();
        java.lang.String str8 = executionEntity1.getProcessDefinitionId();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getProcessInstance();
        org.activiti.engine.impl.javax.el.ELContext eLContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity10.setCachedElContext(eLContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNull(executionEntity7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(executionEntity10);
    }

    @Test
    public void test9640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9640");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity1.getTransitionBeingTaken();
        executionEntity1.setSuspensionState((int) (byte) 100);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl10);
        boolean boolean12 = executionEntity1.isSuspended();
        java.lang.String str13 = executionEntity1.getCurrentActivityName();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertNull(transitionImpl7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test9641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9641");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity1.getTransitionBeingTaken();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity1.getProcessVariables();
        java.lang.String str9 = executionEntity1.getCurrentActivityName();
        boolean boolean10 = executionEntity1.isEventScope();
        boolean boolean11 = executionEntity1.isEnded();
        java.lang.Object obj12 = executionEntity1.getPersistentState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = executionEntity1.getActivity();
        java.lang.String str14 = executionEntity1.getName();
        org.activiti.engine.impl.pvm.PvmTransition pvmTransition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.take(pvmTransition15);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.impl.pvm.PvmException; message: transition is null");
        } catch (org.activiti.engine.impl.pvm.PvmException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertNull(transitionImpl7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{processDefinitionId=null, isScope=true, suspensionState=1, isEventScope=false, forcedUpdate=true, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null, activityId=null, businessKey=null, name=}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{processDefinitionId=null, isScope=true, suspensionState=1, isEventScope=false, forcedUpdate=true, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null, activityId=null, businessKey=null, name=}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{processDefinitionId=null, isScope=true, suspensionState=1, isEventScope=false, forcedUpdate=true, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null, activityId=null, businessKey=null, name=}");
        org.junit.Assert.assertNull(activityImpl13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test9642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9642");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        executionEntity1.setActivity(activityImpl7);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList9 = executionEntity1.getQueryVariables();
        java.lang.String str10 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        org.activiti.engine.impl.javax.el.ELContext eLContext13 = executionEntity12.getCachedElContext();
        org.activiti.engine.EngineServices engineServices14 = executionEntity12.getEngineServices();
        java.lang.Object obj15 = executionEntity12.getPersistentState();
        executionEntity12.setActive(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        executionEntity12.setActivity(activityImpl18);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList20 = executionEntity12.getQueryVariables();
        executionEntity12.forceUpdate();
        executionEntity1.setSuperExecution(executionEntity12);
        java.lang.String str23 = executionEntity1.getParentId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList25 = executionEntity1.getCompensateEventSubscriptions("ProcessInstance[ProcessInstance[null]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(variableInstanceEntityList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(eLContext13);
        org.junit.Assert.assertNull(engineServices14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(variableInstanceEntityList20);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test9643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9643");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray2 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3, variableInstanceEntityArray2);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity1.getQueryVariables();
        java.lang.String str7 = executionEntity1.getId();
        java.lang.Object obj8 = executionEntity1.getPersistentState();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity1.getRevisionNext();
        java.lang.String str12 = executionEntity1.getDeleteReason();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet13 = executionEntity1.getVariableNames();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(variableInstanceEntityList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test9644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9644");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransition(transitionImpl4);
        java.lang.String str6 = executionEntity1.toString();
        java.lang.String str7 = executionEntity1.toString();
        java.lang.String str8 = executionEntity1.getProcessInstanceId();
        java.lang.String str9 = executionEntity1.getProcessInstanceId();
        executionEntity1.setTenantId("ScopeExecution[null]");
        java.lang.String str12 = executionEntity1.getParentId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList13 = executionEntity1.getTasks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ProcessInstance[null]" + "'", str6, "ProcessInstance[null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ProcessInstance[null]" + "'", str7, "ProcessInstance[null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test9645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9645");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        int int4 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = executionEntity6.getCachedElContext();
        executionEntity6.forceUpdate();
        executionEntity6.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution11 = executionEntity6.getStartingExecution();
        boolean boolean12 = executionEntity6.isEventScope();
        boolean boolean13 = executionEntity6.isSuspended();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = executionEntity15.getCachedElContext();
        org.activiti.engine.EngineServices engineServices17 = executionEntity15.getEngineServices();
        java.lang.Object obj18 = executionEntity15.getPersistentState();
        executionEntity15.inactivate();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = executionEntity15.getProcessVariables();
        executionEntity6.createVariablesLocal(strMap20);
        executionEntity1.setVariables(strMap20);
        executionEntity1.setEventScope(true);
        executionEntity1.setBusinessKey("ProcessInstance[null]");
        java.lang.Object obj27 = executionEntity1.getPersistentState();
        java.lang.String str28 = executionEntity1.getEventName();
        executionEntity1.setDeleteReason("ProcessInstance[null]");
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNull(eLContext7);
        org.junit.Assert.assertNotNull(startingExecution11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(eLContext16);
        org.junit.Assert.assertNull(engineServices17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=true, businessKey=ProcessInstance[null], name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=true, businessKey=ProcessInstance[null], name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=true, businessKey=ProcessInstance[null], name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test9646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9646");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        int int7 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        org.activiti.engine.impl.javax.el.ELContext eLContext10 = executionEntity9.getCachedElContext();
        org.activiti.engine.EngineServices engineServices11 = executionEntity9.getEngineServices();
        java.lang.Object obj12 = executionEntity9.getPersistentState();
        boolean boolean13 = executionEntity9.isEnded();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = executionEntity9.getTransition();
        boolean boolean15 = executionEntity9.isProcessInstanceType();
        executionEntity9.setConcurrent(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl18 = null;
        executionEntity9.setTransitionBeingTaken(transitionImpl18);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl20);
        org.activiti.engine.impl.javax.el.ELContext eLContext22 = executionEntity21.getCachedElContext();
        org.activiti.engine.EngineServices engineServices23 = executionEntity21.getEngineServices();
        int int24 = executionEntity21.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = null;
        executionEntity21.setActivity(activityImpl25);
        boolean boolean27 = executionEntity21.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = executionEntity21.getParent();
        executionEntity21.forceUpdate();
        executionEntity9.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
        executionEntity9.setScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = executionEntity9.getSuperExecution();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        boolean boolean35 = executionEntity9.isSuspended();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(eLContext10);
        org.junit.Assert.assertNull(engineServices11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(transitionImpl14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(eLContext22);
        org.junit.Assert.assertNull(engineServices23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(executionEntity28);
        org.junit.Assert.assertNull(executionEntity33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test9647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9647");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        executionEntity8.setName("hi!");
        int int15 = executionEntity8.getRevision();
        boolean boolean16 = executionEntity8.isSuspended();
        executionEntity8.inactivate();
        java.lang.String str18 = executionEntity8.getSuperExecutionId();
        boolean boolean19 = executionEntity8.isActive();
        java.lang.String str20 = executionEntity8.getParentId();
        boolean boolean21 = executionEntity8.isScope();
        java.lang.String str22 = executionEntity8.getActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl23 = null;
        executionEntity8.setTransition(transitionImpl23);
        executionEntity8.setActive(true);
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test9648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9648");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray2 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3, variableInstanceEntityArray2);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray9 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10, variableInstanceEntityArray9);
        executionEntity8.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10);
        executionEntity1.setEventName("ProcessInstance[ProcessInstance[null]]");
        java.lang.String str16 = executionEntity1.getTenantId();
        executionEntity1.setProcessDefinitionId("ProcessInstance[]");
        org.junit.Assert.assertNotNull(variableInstanceEntityArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(variableInstanceEntityList6);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test9649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9649");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setSuspensionState((-1));
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl7 = executionEntity1.getProcessDefinition();
        executionEntity1.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity10 = null;
        executionEntity1.removeEventSubscription(eventSubscriptionEntity10);
        boolean boolean12 = executionEntity1.isProcessInstanceType();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity1.getEventSubscriptions();
        executionEntity1.setProcessDefinitionId("");
        boolean boolean16 = executionEntity1.isEventScope();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity17 = null;
        executionEntity1.addTask(taskEntity17);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity1.findExecution("ProcessInstance[ProcessInstance[ProcessInstance[null]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity6);
        org.junit.Assert.assertNull(processDefinitionImpl7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(eventSubscriptionEntityList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test9650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9650");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity1.getActivity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity9.setSuspensionState((-1));
        java.lang.String str14 = executionEntity9.getName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        org.activiti.engine.impl.javax.el.ELContext eLContext17 = executionEntity16.getCachedElContext();
        boolean boolean18 = executionEntity16.isSuspended();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        java.lang.String str20 = executionEntity9.getName();
        int int21 = executionEntity9.getRevisionNext();
        executionEntity1.setSuperExecution(executionEntity9);
        java.lang.String str23 = executionEntity1.getEventName();
        java.lang.String str24 = executionEntity1.getCurrentActivityName();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(activityImpl7);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(eLContext17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test9651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9651");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getBusinessKey();
        int int6 = executionEntity1.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.getReplacedBy();
        java.lang.String str8 = executionEntity1.getTenantId();
        java.lang.String str9 = executionEntity1.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(executionEntity7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ProcessInstance[null]" + "'", str9, "ProcessInstance[null]");
    }

    @Test
    public void test9652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9652");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        boolean boolean7 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = null;
        executionEntity1.setEventSource(pvmProcessElement8);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution10 = executionEntity1.getStartingExecution();
        java.lang.String str11 = executionEntity1.getCurrentActivityName();
        executionEntity1.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement14 = executionEntity1.getEventSource();
        executionEntity1.setConcurrent(true);
        java.lang.String str17 = executionEntity1.getProcessInstanceId();
        java.lang.String str18 = executionEntity1.getCurrentActivityId();
        executionEntity1.setParentId("hi!");
        java.lang.Class<?> wildcardClass21 = executionEntity1.getClass();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(startingExecution10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(pvmProcessElement14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test9653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9653");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getBusinessKey();
        int int6 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.getSuperExecution();
        executionEntity1.setParentId("ProcessInstance[null]");
        java.lang.String str10 = executionEntity1.toString();
        int int11 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        executionEntity1.setActivity(activityImpl12);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertNull(executionEntity7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ScopeExecution[null]" + "'", str10, "ScopeExecution[null]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test9654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9654");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray2 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3, variableInstanceEntityArray2);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity1.getQueryVariables();
        java.lang.String str7 = executionEntity1.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getSuperExecution();
        executionEntity1.setProcessDefinitionId("");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = executionEntity1.getTransition();
        java.lang.String str12 = executionEntity1.getEventName();
        boolean boolean13 = executionEntity1.isActive();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity16 = executionEntity1.addIdentityLink("ProcessInstance[null]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(variableInstanceEntityList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertNull(transitionImpl11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test9655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9655");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setSuspensionState((-1));
        java.lang.String str6 = executionEntity1.getName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity8.getCachedElContext();
        boolean boolean10 = executionEntity8.isSuspended();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity8.setScope(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = executionEntity15.getCachedElContext();
        org.activiti.engine.EngineServices engineServices17 = executionEntity15.getEngineServices();
        java.lang.Object obj18 = executionEntity15.getPersistentState();
        executionEntity15.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl21 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl21);
        executionEntity22.setExecutionListenerIndex((java.lang.Integer) 0);
        int int25 = executionEntity22.getSuspensionState();
        executionEntity15.setSuperExecution(executionEntity22);
        executionEntity22.setName("hi!");
        boolean boolean29 = executionEntity22.isDeleteRoot();
        executionEntity22.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl32 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl32);
        executionEntity33.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity33.setSuspensionState((-1));
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity38 = executionEntity33.getSuperExecution();
        executionEntity22.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity33);
        java.lang.String str40 = executionEntity22.getSuperExecutionId();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity22);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity42 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList43 = executionEntity22.findInactiveConcurrentExecutions(pvmActivity42);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(eLContext9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(eLContext16);
        org.junit.Assert.assertNull(engineServices17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(executionEntity38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(activityExecutionList43);
    }

    @Test
    public void test9656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9656");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getBusinessKey();
        int int6 = executionEntity1.getRevisionNext();
        java.lang.String str7 = executionEntity1.getBusinessKey();
        executionEntity1.setId("");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = executionEntity1.getProcessDefinition();
        executionEntity1.setProcessDefinitionId("ProcessInstance[hi!]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(processDefinitionImpl10);
    }

    @Test
    public void test9657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9657");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        int int4 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = executionEntity6.getCachedElContext();
        executionEntity6.forceUpdate();
        executionEntity6.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution11 = executionEntity6.getStartingExecution();
        boolean boolean12 = executionEntity6.isEventScope();
        boolean boolean13 = executionEntity6.isSuspended();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = executionEntity15.getCachedElContext();
        org.activiti.engine.EngineServices engineServices17 = executionEntity15.getEngineServices();
        java.lang.Object obj18 = executionEntity15.getPersistentState();
        executionEntity15.inactivate();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = executionEntity15.getProcessVariables();
        executionEntity6.createVariablesLocal(strMap20);
        executionEntity1.setVariables(strMap20);
        executionEntity1.setEventScope(true);
        executionEntity1.setBusinessKey("ProcessInstance[null]");
        java.lang.String str27 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl29 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl29);
        org.activiti.engine.impl.javax.el.ELContext eLContext31 = executionEntity30.getCachedElContext();
        boolean boolean32 = executionEntity30.isSuspended();
        org.activiti.engine.impl.javax.el.ELContext eLContext33 = executionEntity30.getCachedElContext();
        int int34 = executionEntity30.getSuspensionState();
        boolean boolean35 = executionEntity30.isProcessInstanceType();
        boolean boolean36 = executionEntity30.isConcurrent();
        executionEntity30.forceUpdate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = executionEntity1.setVariableLocal("ProcessInstance[ProcessInstance[null]]", (java.lang.Object) executionEntity30);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNull(eLContext7);
        org.junit.Assert.assertNotNull(startingExecution11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(eLContext16);
        org.junit.Assert.assertNull(engineServices17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ProcessInstance[null]" + "'", str27, "ProcessInstance[null]");
        org.junit.Assert.assertNull(eLContext31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(eLContext33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test9658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9658");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity1.getEventSource();
        executionEntity1.setDeleteReason("hi!");
        boolean boolean7 = executionEntity1.isActive();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(pvmProcessElement4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test9659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9659");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        boolean boolean5 = executionEntity1.isEnded();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity1.getTransition();
        java.lang.String str7 = executionEntity1.getName();
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        java.lang.String str9 = executionEntity1.toString();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity11.setSuspensionState((-1));
        java.lang.String str16 = executionEntity11.getName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        org.activiti.engine.impl.javax.el.ELContext eLContext19 = executionEntity18.getCachedElContext();
        boolean boolean20 = executionEntity18.isSuspended();
        executionEntity11.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        executionEntity18.setScope(false);
        executionEntity18.setId("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = executionEntity18.getProcessVariables();
        executionEntity1.createVariablesLocal(strMap26);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity30 = executionEntity1.involveUser("ProcessInstance[ProcessInstance[ProcessInstance[null]]]", "ScopeExecution[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(transitionImpl6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ProcessInstance[null]" + "'", str9, "ProcessInstance[null]");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(eLContext19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test9660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9660");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = executionEntity1.getEventSource();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = null;
        executionEntity1.setTransition(transitionImpl6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = executionEntity9.getCurrentActivityId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(pvmProcessElement5);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertNull(executionEntity9);
    }

    @Test
    public void test9661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9661");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getBusinessKey();
        int int6 = executionEntity1.getRevisionNext();
        int int7 = executionEntity1.getRevision();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity1.getTransitionBeingTaken();
        boolean boolean9 = executionEntity1.isActive();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = executionEntity1.getProcessDefinition();
        executionEntity1.setBusinessKey("ScopeExecution[null]");
        java.lang.String str13 = executionEntity1.getCurrentActivityId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(transitionImpl8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(processDefinitionImpl10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test9662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9662");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution13 = executionEntity8.getStartingExecution();
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(startingExecution13);
    }

    @Test
    public void test9663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9663");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        executionEntity8.setName("hi!");
        int int15 = executionEntity8.getRevision();
        boolean boolean16 = executionEntity8.isSuspended();
        boolean boolean17 = executionEntity8.isScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList18 = executionEntity8.getQueryVariables();
        executionEntity8.setName("ProcessInstance[ScopeExecution[null]]");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList18);
    }

    @Test
    public void test9664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9664");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        executionEntity1.setConcurrent(false);
        executionEntity1.setTenantId("");
        int int8 = executionEntity1.getSuspensionState();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test9665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9665");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        boolean boolean7 = executionEntity1.isEventScope();
        boolean boolean8 = executionEntity1.isSuspended();
        boolean boolean9 = executionEntity1.isProcessInstanceType();
        boolean boolean10 = executionEntity1.isActive();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = executionEntity1.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = executionEntity1.updateProcessBusinessKey("ScopeExecution[ProcessInstance[null]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test9666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9666");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = null;
        executionEntity1.setCachedElContext(eLContext6);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 7);
        executionEntity1.setBusinessKey("");
        boolean boolean12 = executionEntity1.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList15 = executionEntity1.getCompensateEventSubscriptions("ScopeExecution[ProcessInstance[null]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(executionEntity13);
    }

    @Test
    public void test9667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9667");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        boolean boolean7 = executionEntity1.isScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList8 = executionEntity1.getQueryVariables();
        executionEntity1.setConcurrent(false);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 36);
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList8);
    }

    @Test
    public void test9668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9668");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        int int4 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        executionEntity1.setActivity(activityImpl5);
        executionEntity1.setRevision((int) (short) -1);
        executionEntity1.setScope(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        org.activiti.engine.impl.javax.el.ELContext eLContext13 = executionEntity12.getCachedElContext();
        executionEntity12.forceUpdate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity12.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity12.getSuperExecution();
        executionEntity12.setTenantId("");
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        boolean boolean20 = executionEntity12.isScope();
        boolean boolean21 = executionEntity12.isConcurrent();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNull(eLContext13);
        org.junit.Assert.assertNull(transitionImpl15);
        org.junit.Assert.assertNull(executionEntity16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test9669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9669");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity1.getEventSource();
        executionEntity1.setDeleteReason("hi!");
        boolean boolean7 = executionEntity1.isActive();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity8 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.executeActivity(pvmActivity8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(pvmProcessElement4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test9670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9670");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getBusinessKey();
        executionEntity1.setId("ProcessInstance[null]");
        java.lang.String str8 = executionEntity1.getParentId();
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.pvm.PvmTransition[] pvmTransitionArray10 = new org.activiti.engine.impl.pvm.PvmTransition[] {};
        java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition> pvmTransitionList11 = new java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList11, pvmTransitionArray10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        org.activiti.engine.impl.javax.el.ELContext eLContext15 = executionEntity14.getCachedElContext();
        executionEntity14.forceUpdate();
        boolean boolean17 = executionEntity14.isEventScope();
        java.lang.String str18 = executionEntity14.getName();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity19 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList20 = executionEntity14.findInactiveConcurrentExecutions(pvmActivity19);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.takeAll((java.util.List<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList11, activityExecutionList20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(eLContext9);
        org.junit.Assert.assertNotNull(pvmTransitionArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(eLContext15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(activityExecutionList20);
    }

    @Test
    public void test9671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9671");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setEventScope(true);
        org.activiti.engine.EngineServices engineServices7 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity1.getEventSource();
        boolean boolean9 = executionEntity1.isScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.javax.el.ELContext eLContext12 = executionEntity11.getCachedElContext();
        boolean boolean13 = executionEntity11.isSuspended();
        java.lang.Object obj14 = executionEntity11.getPersistentState();
        executionEntity11.setEventScope(true);
        org.activiti.engine.EngineServices engineServices17 = executionEntity11.getEngineServices();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement18 = executionEntity11.getEventSource();
        executionEntity11.forceUpdate();
        boolean boolean20 = executionEntity11.isConcurrent();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        java.lang.String str22 = executionEntity1.getName();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl23 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl23);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution25 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = executionEntity1.getReplacedBy();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices7);
        org.junit.Assert.assertNull(pvmProcessElement8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(eLContext12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices17);
        org.junit.Assert.assertNull(pvmProcessElement18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(startingExecution25);
        org.junit.Assert.assertNull(executionEntity26);
    }

    @Test
    public void test9672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9672");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution13 = executionEntity8.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = executionEntity15.getCachedElContext();
        org.activiti.engine.EngineServices engineServices17 = executionEntity15.getEngineServices();
        int int18 = executionEntity15.getCachedEntityState();
        java.lang.String str19 = executionEntity15.getTenantId();
        executionEntity8.setSuperExecution(executionEntity15);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl21 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl21);
        boolean boolean23 = executionEntity22.isEnded();
        java.lang.String str24 = executionEntity22.getParentId();
        executionEntity15.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity22);
        executionEntity15.setCachedEntityState((int) (short) 10);
        java.lang.String str28 = executionEntity15.getProcessDefinitionId();
        java.lang.String str29 = executionEntity15.getProcessInstanceId();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(startingExecution13);
        org.junit.Assert.assertNull(eLContext16);
        org.junit.Assert.assertNull(engineServices17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test9673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9673");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        org.activiti.engine.impl.javax.el.ELContext eLContext17 = executionEntity16.getCachedElContext();
        org.activiti.engine.EngineServices engineServices18 = executionEntity16.getEngineServices();
        java.lang.Object obj19 = executionEntity16.getPersistentState();
        java.lang.String str20 = executionEntity16.getBusinessKey();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        executionEntity16.setCachedEntityState(0);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl24 = executionEntity16.getTransition();
        executionEntity16.setEventName("ScopeExecution[null]");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity16.end();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(eLContext17);
        org.junit.Assert.assertNull(engineServices18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(transitionImpl24);
    }

    @Test
    public void test9674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9674");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        boolean boolean5 = executionEntity1.isEnded();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity1.getTransition();
        boolean boolean7 = executionEntity1.isProcessInstanceType();
        executionEntity1.setConcurrent(true);
        java.lang.String str10 = executionEntity1.getName();
        executionEntity1.disposeStartingExecution();
        boolean boolean12 = executionEntity1.isConcurrent();
        executionEntity1.setConcurrent(true);
        boolean boolean15 = executionEntity1.isEnded();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(transitionImpl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test9675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9675");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getSuperExecution();
        executionEntity1.setTenantId("");
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl10);
        java.lang.String str12 = executionEntity1.getId();
        int int13 = executionEntity1.getSuspensionState();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertNull(executionEntity5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test9676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9676");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        executionEntity8.setName("hi!");
        int int15 = executionEntity8.getRevision();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = executionEntity8.getProcessVariables();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity8.getProcessVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.javax.el.ELContext eLContext20 = executionEntity19.getCachedElContext();
        boolean boolean21 = executionEntity19.isSuspended();
        java.lang.Object obj22 = executionEntity19.getPersistentState();
        executionEntity19.setEventScope(true);
        org.activiti.engine.EngineServices engineServices25 = executionEntity19.getEngineServices();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement26 = executionEntity19.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = executionEntity27.getReplacedBy();
        executionEntity27.inactivate();
        executionEntity19.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity27);
        java.lang.String str31 = executionEntity27.getActivityId();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity27);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray35 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList36 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList36, variableInstanceEntityArray35);
        executionEntity34.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList36);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList39 = executionEntity34.getQueryVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl40);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray42 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList43 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList43, variableInstanceEntityArray42);
        executionEntity41.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList43);
        executionEntity34.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList43);
        executionEntity27.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList43);
        executionEntity27.setName("ProcessInstance[ScopeExecution[null]]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = executionEntity27.hasVariableLocal("ProcessInstance[]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(eLContext20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices25);
        org.junit.Assert.assertNull(pvmProcessElement26);
        org.junit.Assert.assertNull(executionEntity28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(variableInstanceEntityList39);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test9677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9677");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        int int2 = executionEntity1.getSuspensionState();
        boolean boolean3 = executionEntity1.isEnded();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity5.getCachedElContext();
        org.activiti.engine.EngineServices engineServices7 = executionEntity5.getEngineServices();
        java.lang.Object obj8 = executionEntity5.getPersistentState();
        executionEntity5.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        executionEntity12.setExecutionListenerIndex((java.lang.Integer) 0);
        int int15 = executionEntity12.getSuspensionState();
        executionEntity5.setSuperExecution(executionEntity12);
        executionEntity12.setName("hi!");
        int int19 = executionEntity12.getRevision();
        executionEntity12.forceUpdate();
        boolean boolean21 = executionEntity12.isDeleteRoot();
        executionEntity1.setSuperExecution(executionEntity12);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement23 = null;
        executionEntity12.setEventSource(pvmProcessElement23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(eLContext6);
        org.junit.Assert.assertNull(engineServices7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test9678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9678");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isEnded();
        boolean boolean4 = executionEntity1.isActive();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str10 = executionEntity1.getBusinessKey();
        executionEntity1.forceUpdate();
        boolean boolean12 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity1.getProcessInstance();
        executionEntity1.setScope(false);
        executionEntity1.setActive(false);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroyScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(executionEntity13);
    }

    @Test
    public void test9679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9679");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransition(transitionImpl4);
        java.lang.String str6 = executionEntity1.toString();
        java.lang.String str7 = executionEntity1.toString();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = executionEntity1.getActivity();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity9 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList10 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList11 = executionEntity1.findActiveActivityIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ProcessInstance[null]" + "'", str6, "ProcessInstance[null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ProcessInstance[null]" + "'", str7, "ProcessInstance[null]");
        org.junit.Assert.assertNull(activityImpl8);
        org.junit.Assert.assertNotNull(activityExecutionList10);
    }

    @Test
    public void test9680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9680");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        int int4 = executionEntity1.getCachedEntityState();
        java.lang.String str5 = executionEntity1.getTenantId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity1.getActivity();
        executionEntity1.setDeleteReason("");
        executionEntity1.setCachedEntityState(36);
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(activityImpl6);
    }

    @Test
    public void test9681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9681");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        org.activiti.engine.impl.javax.el.ELContext eLContext10 = executionEntity9.getCachedElContext();
        executionEntity9.forceUpdate();
        executionEntity9.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution14 = executionEntity9.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity9.getTransitionBeingTaken();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = executionEntity9.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity9.getSuperExecution();
        boolean boolean18 = executionEntity9.isDeleteRoot();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity1.getSuperExecution();
        executionEntity1.setProcessDefinitionId("");
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertNull(executionEntity7);
        org.junit.Assert.assertNull(eLContext10);
        org.junit.Assert.assertNotNull(startingExecution14);
        org.junit.Assert.assertNull(transitionImpl15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(executionEntity17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(executionEntity20);
    }

    @Test
    public void test9682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9682");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setCachedEntityState(1);
        boolean boolean6 = executionEntity1.isEventScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = executionEntity1.getCachedElContext();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(eLContext7);
    }

    @Test
    public void test9683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9683");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getId();
        int int3 = executionEntity1.getRevision();
        java.lang.String str4 = executionEntity1.getId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution5 = executionEntity1.getStartingExecution();
        boolean boolean6 = executionEntity1.isEnded();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(startingExecution5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test9684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9684");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        boolean boolean5 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        executionEntity1.setActivity(activityImpl6);
        java.lang.String str8 = executionEntity1.getTenantId();
        executionEntity1.setId("ProcessInstance[null]");
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test9685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9685");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        executionEntity8.setName("hi!");
        boolean boolean15 = executionEntity8.isDeleteRoot();
        executionEntity8.setEventName("hi!");
        executionEntity8.setConcurrent(false);
        executionEntity8.setCachedEntityState((int) (byte) 10);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList22 = executionEntity8.getEventSubscriptionsInternal();
        java.lang.String str23 = executionEntity8.getDeleteReason();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl24 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl24);
        org.activiti.engine.impl.javax.el.ELContext eLContext26 = executionEntity25.getCachedElContext();
        org.activiti.engine.EngineServices engineServices27 = executionEntity25.getEngineServices();
        java.lang.Object obj28 = executionEntity25.getPersistentState();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement29 = executionEntity25.getEventSource();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl30 = null;
        executionEntity25.setTransition(transitionImpl30);
        executionEntity25.setScope(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl34 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl34);
        org.activiti.engine.impl.javax.el.ELContext eLContext36 = executionEntity35.getCachedElContext();
        executionEntity35.forceUpdate();
        executionEntity35.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution40 = executionEntity35.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl41 = executionEntity35.getTransitionBeingTaken();
        executionEntity25.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity35);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl43 = executionEntity35.getTransitionBeingTaken();
        executionEntity8.setSuperExecution(executionEntity35);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity45 = executionEntity35.getParent();
        executionEntity35.setConcurrent(true);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity35.deleteCascade("ProcessInstance[ProcessInstance[ProcessInstance[null]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(eventSubscriptionEntityList22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(eLContext26);
        org.junit.Assert.assertNull(engineServices27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(pvmProcessElement29);
        org.junit.Assert.assertNull(eLContext36);
        org.junit.Assert.assertNotNull(startingExecution40);
        org.junit.Assert.assertNull(transitionImpl41);
        org.junit.Assert.assertNull(transitionImpl43);
        org.junit.Assert.assertNull(executionEntity45);
    }

    @Test
    public void test9686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9686");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransition(transitionImpl4);
        executionEntity1.setCachedEntityState((int) (short) 10);
        boolean boolean8 = executionEntity1.isScope();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = executionEntity1.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test9687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9687");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl4 = executionEntity1.getProcessDefinition();
        boolean boolean5 = executionEntity1.isEventScope();
        boolean boolean6 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity8.getCachedElContext();
        boolean boolean10 = executionEntity8.isSuspended();
        int int11 = executionEntity8.getRevisionNext();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        java.lang.String str13 = executionEntity1.getTenantId();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(processDefinitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(eLContext9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test9688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9688");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        boolean boolean6 = executionEntity1.isConcurrent();
        executionEntity1.setEventScope(false);
        int int9 = executionEntity1.getRevisionNext();
        executionEntity1.setBusinessKey("");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = executionEntity1.getProcessVariables();
        boolean boolean13 = executionEntity1.isConcurrent();
        executionEntity1.setName("ScopeExecution[null]");
        executionEntity1.setCachedEntityState((int) '4');
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        executionEntity1.setActivity(activityImpl18);
        int int20 = executionEntity1.getCachedEntityState();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test9689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9689");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        int int4 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = executionEntity6.getCachedElContext();
        executionEntity6.forceUpdate();
        executionEntity6.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution11 = executionEntity6.getStartingExecution();
        boolean boolean12 = executionEntity6.isEventScope();
        boolean boolean13 = executionEntity6.isSuspended();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = executionEntity15.getCachedElContext();
        org.activiti.engine.EngineServices engineServices17 = executionEntity15.getEngineServices();
        java.lang.Object obj18 = executionEntity15.getPersistentState();
        executionEntity15.inactivate();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = executionEntity15.getProcessVariables();
        executionEntity6.createVariablesLocal(strMap20);
        executionEntity1.setVariables(strMap20);
        executionEntity1.setEventScope(true);
        executionEntity1.setBusinessKey("ProcessInstance[null]");
        java.lang.Object obj27 = executionEntity1.getPersistentState();
        java.lang.String str28 = executionEntity1.getEventName();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = executionEntity1.getProcessVariables();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNull(eLContext7);
        org.junit.Assert.assertNotNull(startingExecution11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(eLContext16);
        org.junit.Assert.assertNull(engineServices17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=true, businessKey=ProcessInstance[null], name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=true, businessKey=ProcessInstance[null], name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=true, businessKey=ProcessInstance[null], name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test9690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9690");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        boolean boolean7 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity8 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList9 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity8);
        executionEntity1.setActive(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement12 = null;
        executionEntity1.setEventSource(pvmProcessElement12);
        executionEntity1.setCachedEntityState((int) (short) 10);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList16 = executionEntity1.getQueryVariables();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(activityExecutionList9);
        org.junit.Assert.assertNull(variableInstanceEntityList16);
    }

    @Test
    public void test9691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9691");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity1.getActivity();
        java.lang.String str8 = executionEntity1.toString();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(activityImpl7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ProcessInstance[null]" + "'", str8, "ProcessInstance[null]");
    }

    @Test
    public void test9692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9692");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        boolean boolean6 = executionEntity1.isProcessInstanceType();
        boolean boolean7 = executionEntity1.isEventScope();
        executionEntity1.setScope(false);
        org.activiti.engine.impl.pvm.runtime.InterpretableExecution interpretableExecution10 = null;
        executionEntity1.setProcessInstance(interpretableExecution10);
        java.lang.String[] strArray13 = new java.lang.String[] { "ScopeExecution[null]" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariables((java.util.Collection<java.lang.String>) strList14);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test9693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9693");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setSuspensionState((-1));
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.getSuperExecution();
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getCurrentActivityName();
        executionEntity1.setId("ScopeExecution[null]");
        java.lang.String str11 = executionEntity1.toString();
        org.activiti.engine.impl.pvm.PvmProcessDefinition pvmProcessDefinition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.PvmProcessInstance pvmProcessInstance13 = executionEntity1.createSubProcessInstance(pvmProcessDefinition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ProcessInstance[ScopeExecution[null]]" + "'", str11, "ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test9694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9694");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setSuspensionState((-1));
        java.lang.String str6 = executionEntity1.getName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity8.getCachedElContext();
        boolean boolean10 = executionEntity8.isSuspended();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity8.setScope(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = executionEntity15.getCachedElContext();
        org.activiti.engine.EngineServices engineServices17 = executionEntity15.getEngineServices();
        java.lang.Object obj18 = executionEntity15.getPersistentState();
        executionEntity15.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl21 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl21);
        executionEntity22.setExecutionListenerIndex((java.lang.Integer) 0);
        int int25 = executionEntity22.getSuspensionState();
        executionEntity15.setSuperExecution(executionEntity22);
        executionEntity22.setName("hi!");
        boolean boolean29 = executionEntity22.isDeleteRoot();
        executionEntity22.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl32 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl32);
        executionEntity33.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity33.setSuspensionState((-1));
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity38 = executionEntity33.getSuperExecution();
        executionEntity22.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity33);
        java.lang.String str40 = executionEntity22.getSuperExecutionId();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity22);
        org.activiti.engine.impl.javax.el.ELContext eLContext42 = executionEntity22.getCachedElContext();
        executionEntity22.setId("ProcessInstance[ProcessInstance[null]]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(eLContext9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(eLContext16);
        org.junit.Assert.assertNull(engineServices17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(executionEntity38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(eLContext42);
    }

    @Test
    public void test9695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9695");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity1.getEventSource();
        java.lang.String str5 = executionEntity1.getProcessDefinitionId();
        java.lang.String str6 = executionEntity1.toString();
        java.lang.String str7 = executionEntity1.getProcessInstanceId();
        boolean boolean8 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity9 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addJob(jobEntity9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(pvmProcessElement4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ProcessInstance[null]" + "'", str6, "ProcessInstance[null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test9696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9696");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        executionEntity8.setName("hi!");
        boolean boolean15 = executionEntity8.isDeleteRoot();
        executionEntity8.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity19.setSuspensionState((-1));
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = executionEntity19.getSuperExecution();
        executionEntity8.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        boolean boolean26 = executionEntity19.isSuspended();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = executionEntity19.getProcessVariables();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(executionEntity24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test9697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9697");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getParent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getCurrentActivityId();
        executionEntity0.setParentId("ProcessInstance[null]");
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity0.getCachedElContext();
        executionEntity0.setDeleteReason("ProcessInstance[ScopeExecution[null]]");
        boolean boolean12 = executionEntity0.isConcurrent();
        boolean boolean13 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = null;
        executionEntity0.setTransitionBeingTaken(transitionImpl14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList16 = executionEntity0.getExecutions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity1);
        org.junit.Assert.assertNull(executionEntity2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(eLContext9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test9698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9698");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        boolean boolean7 = executionEntity1.isEventScope();
        boolean boolean8 = executionEntity1.isSuspended();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        org.activiti.engine.impl.javax.el.ELContext eLContext11 = executionEntity10.getCachedElContext();
        org.activiti.engine.EngineServices engineServices12 = executionEntity10.getEngineServices();
        java.lang.Object obj13 = executionEntity10.getPersistentState();
        executionEntity10.inactivate();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity10.getProcessVariables();
        executionEntity1.createVariablesLocal(strMap15);
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.setCachedEntityState(0);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.insert();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(eLContext11);
        org.junit.Assert.assertNull(engineServices12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test9699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9699");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        java.lang.String str13 = executionEntity8.getId();
        java.lang.Object obj14 = executionEntity8.getPersistentState();
        java.lang.String str15 = executionEntity8.getCurrentActivityId();
        java.lang.String str16 = executionEntity8.getBusinessKey();
        executionEntity8.setScope(true);
        java.lang.String str19 = executionEntity8.getBusinessKey();
        executionEntity8.setScope(true);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution22 = executionEntity8.getStartingExecution();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(startingExecution22);
    }

    @Test
    public void test9700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9700");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setSuspensionState((-1));
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl7 = executionEntity1.getProcessDefinition();
        executionEntity1.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity10 = null;
        executionEntity1.removeEventSubscription(eventSubscriptionEntity10);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList13 = executionEntity1.getCompensateEventSubscriptions("ProcessInstance[null]");
        boolean boolean14 = executionEntity1.isActive();
        org.junit.Assert.assertNull(executionEntity6);
        org.junit.Assert.assertNull(processDefinitionImpl7);
        org.junit.Assert.assertNotNull(compensateEventSubscriptionEntityList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test9701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9701");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setEventScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl7);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity1.getProcessDefinition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getSuperExecution();
        executionEntity1.setScope(true);
        executionEntity1.setActive(false);
        java.lang.String str15 = executionEntity1.getDeleteReason();
        java.lang.String str16 = executionEntity1.getEventName();
        java.lang.String str17 = executionEntity1.getTenantId();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(processDefinitionImpl9);
        org.junit.Assert.assertNull(executionEntity10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test9702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9702");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getReplacedBy();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity5.getCachedElContext();
        org.activiti.engine.EngineServices engineServices7 = executionEntity5.getEngineServices();
        java.lang.Object obj8 = executionEntity5.getPersistentState();
        executionEntity5.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        executionEntity12.setExecutionListenerIndex((java.lang.Integer) 0);
        int int15 = executionEntity12.getSuspensionState();
        executionEntity5.setSuperExecution(executionEntity12);
        executionEntity12.setName("hi!");
        boolean boolean19 = executionEntity12.isDeleteRoot();
        executionEntity12.setEventName("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = executionEntity12.getProcessVariables();
        executionEntity1.setVariables(strMap22);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl24 = executionEntity1.getProcessDefinition();
        executionEntity1.setBusinessKey("ProcessInstance[ProcessInstance[null]]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = executionEntity1.getParent();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(executionEntity3);
        org.junit.Assert.assertNull(eLContext6);
        org.junit.Assert.assertNull(engineServices7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(processDefinitionImpl24);
        org.junit.Assert.assertNull(executionEntity27);
    }

    @Test
    public void test9703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9703");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity1.getTransitionBeingTaken();
        executionEntity1.setActive(true);
        java.lang.String str10 = executionEntity1.getActivityId();
        executionEntity1.inactivate();
        java.lang.String str12 = executionEntity1.getBusinessKey();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity1.findExecution("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertNull(transitionImpl7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test9704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9704");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setEventScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl7);
        boolean boolean9 = executionEntity1.isDeleteRoot();
        boolean boolean10 = executionEntity1.isDeleteRoot();
        java.lang.String str11 = executionEntity1.toString();
        java.lang.String str12 = executionEntity1.getProcessDefinitionId();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ProcessInstance[null]" + "'", str11, "ProcessInstance[null]");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test9705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9705");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        int int4 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        executionEntity1.setActivity(activityImpl5);
        java.lang.Object obj7 = executionEntity1.getPersistentState();
        java.lang.String str8 = executionEntity1.getProcessDefinitionId();
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        java.lang.String str11 = executionEntity1.getCurrentActivityId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList12 = executionEntity1.getEventSubscriptionsInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test9706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9706");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        org.activiti.engine.impl.javax.el.ELContext eLContext4 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity5 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList6 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity5);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity8.getCachedElContext();
        boolean boolean10 = executionEntity8.isSuspended();
        java.lang.Object obj11 = executionEntity8.getPersistentState();
        java.lang.Object obj12 = executionEntity8.getPersistentState();
        boolean boolean13 = executionEntity8.isConcurrent();
        executionEntity8.setEventScope(false);
        int int16 = executionEntity8.getRevisionNext();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        boolean boolean18 = executionEntity8.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        executionEntity8.setActivity(activityImpl19);
        java.lang.String str21 = executionEntity8.getCurrentActivityId();
        java.lang.String str22 = executionEntity8.getParentId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement23 = null;
        executionEntity8.setEventSource(pvmProcessElement23);
        executionEntity8.disposeStartingExecution();
        int int26 = executionEntity8.getSuspensionState();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(eLContext4);
        org.junit.Assert.assertNotNull(activityExecutionList6);
        org.junit.Assert.assertNull(eLContext9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test9707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9707");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity14.setSuspensionState((-1));
        java.lang.String str19 = executionEntity14.getName();
        executionEntity8.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        org.activiti.engine.EngineServices engineServices21 = executionEntity14.getEngineServices();
        boolean boolean22 = executionEntity14.isDeleteRoot();
        executionEntity14.setBusinessKey("ScopeExecution[null]");
        java.lang.String str25 = executionEntity14.getId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = executionEntity14.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(engineServices21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test9708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9708");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray2 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3, variableInstanceEntityArray2);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity1.getQueryVariables();
        executionEntity1.setActive(true);
        executionEntity1.setScope(false);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = null;
        executionEntity1.setEventSource(pvmProcessElement11);
        executionEntity1.setTenantId("ProcessInstance[ProcessInstance[null]]");
        java.lang.String str15 = executionEntity1.getEventName();
        executionEntity1.setEventName("ScopeExecution[null]");
        org.junit.Assert.assertNotNull(variableInstanceEntityArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(variableInstanceEntityList6);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test9709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9709");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        org.activiti.engine.impl.javax.el.ELContext eLContext4 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity5 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList6 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity5);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity8.getCachedElContext();
        boolean boolean10 = executionEntity8.isSuspended();
        java.lang.Object obj11 = executionEntity8.getPersistentState();
        java.lang.Object obj12 = executionEntity8.getPersistentState();
        boolean boolean13 = executionEntity8.isConcurrent();
        executionEntity8.setEventScope(false);
        int int16 = executionEntity8.getRevisionNext();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity8.setEventScope(true);
        executionEntity8.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl22 = executionEntity8.getTransitionBeingTaken();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList23 = executionEntity8.getEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(eLContext4);
        org.junit.Assert.assertNotNull(activityExecutionList6);
        org.junit.Assert.assertNull(eLContext9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNull(transitionImpl22);
    }

    @Test
    public void test9710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9710");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl4 = executionEntity1.getProcessDefinition();
        boolean boolean5 = executionEntity1.isEventScope();
        int int6 = executionEntity1.getRevision();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity8.getCachedElContext();
        executionEntity8.forceUpdate();
        executionEntity8.setName("");
        int int13 = executionEntity8.getSuspensionState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = executionEntity15.getCachedElContext();
        executionEntity15.forceUpdate();
        executionEntity15.setName("");
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = executionEntity15.getProcessVariables();
        executionEntity8.createVariablesLocal(strMap20);
        executionEntity1.createVariablesLocal(strMap20);
        org.activiti.engine.EngineServices engineServices23 = executionEntity1.getEngineServices();
        java.lang.String str24 = executionEntity1.getSuperExecutionId();
        executionEntity1.setTenantId("ProcessInstance[]");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap27 = executionEntity1.getVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(processDefinitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(eLContext9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(eLContext16);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(engineServices23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test9711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9711");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity1.getActivity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity9.setSuspensionState((-1));
        java.lang.String str14 = executionEntity9.getName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        org.activiti.engine.impl.javax.el.ELContext eLContext17 = executionEntity16.getCachedElContext();
        boolean boolean18 = executionEntity16.isSuspended();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        java.lang.String str20 = executionEntity9.getName();
        int int21 = executionEntity9.getRevisionNext();
        executionEntity1.setSuperExecution(executionEntity9);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement23 = null;
        executionEntity9.setEventSource(pvmProcessElement23);
        java.lang.Object obj25 = executionEntity9.getPersistentState();
        executionEntity9.setActive(true);
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity30 = executionEntity9.addIdentityLink("ScopeExecution[ProcessInstance[null]]", "ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(activityImpl7);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(eLContext17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=-1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=-1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=-1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test9712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9712");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getCurrentActivityName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity1.getVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test9713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9713");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        int int4 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        executionEntity1.setActivity(activityImpl5);
        java.lang.Object obj7 = executionEntity1.getPersistentState();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity1.getEventSource();
        int int9 = executionEntity1.getRevision();
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl12 = executionEntity1.getProcessDefinition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = executionEntity1.isActive("ProcessInstance[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(pvmProcessElement8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(processDefinitionImpl12);
    }

    @Test
    public void test9714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9714");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution13 = executionEntity8.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = executionEntity15.getCachedElContext();
        org.activiti.engine.EngineServices engineServices17 = executionEntity15.getEngineServices();
        int int18 = executionEntity15.getCachedEntityState();
        java.lang.String str19 = executionEntity15.getTenantId();
        executionEntity8.setSuperExecution(executionEntity15);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl21 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl21);
        boolean boolean23 = executionEntity22.isEnded();
        java.lang.String str24 = executionEntity22.getParentId();
        executionEntity15.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity22);
        executionEntity15.setCachedEntityState((int) (short) 10);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity28 = null;
        executionEntity15.removeEventSubscription(eventSubscriptionEntity28);
        executionEntity15.setRevision(10);
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(startingExecution13);
        org.junit.Assert.assertNull(eLContext16);
        org.junit.Assert.assertNull(engineServices17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test9715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9715");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        boolean boolean6 = executionEntity1.isConcurrent();
        java.lang.String str7 = executionEntity1.toString();
        java.lang.String str8 = executionEntity1.getName();
        executionEntity1.setCachedEntityState((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariableLocal("ScopeExecution[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ProcessInstance[null]" + "'", str7, "ProcessInstance[null]");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test9716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9716");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setSuspensionState((-1));
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl7 = executionEntity1.getProcessDefinition();
        executionEntity1.setCachedEntityState((int) (short) 0);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity10 = null;
        executionEntity1.removeEventSubscription(eventSubscriptionEntity10);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList12 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = executionEntity1.getTransitionBeingTaken();
        boolean boolean14 = executionEntity1.isActive();
        executionEntity1.setActive(false);
        org.junit.Assert.assertNull(executionEntity6);
        org.junit.Assert.assertNull(processDefinitionImpl7);
        org.junit.Assert.assertNull(variableInstanceEntityList12);
        org.junit.Assert.assertNull(transitionImpl13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test9717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9717");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setEventScope(true);
        org.activiti.engine.EngineServices engineServices7 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity1.getEventSource();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl9);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = executionEntity1.getEventSource();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = null;
        executionEntity1.setTransition(transitionImpl12);
        executionEntity1.setId("ProcessInstance[null]");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList16 = executionEntity1.getJobs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices7);
        org.junit.Assert.assertNull(pvmProcessElement8);
        org.junit.Assert.assertNull(pvmProcessElement11);
    }

    @Test
    public void test9718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9718");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        executionEntity8.setName("hi!");
        boolean boolean15 = executionEntity8.isDeleteRoot();
        executionEntity8.setEventName("hi!");
        executionEntity8.setConcurrent(false);
        executionEntity8.setRevision((int) '4');
        boolean boolean22 = executionEntity8.isProcessInstanceType();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity25 = executionEntity8.involveUser("ProcessInstance[ScopeExecution[null]]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test9719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9719");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getBusinessKey();
        java.lang.String str6 = executionEntity1.getId();
        boolean boolean7 = executionEntity1.isDeleteRoot();
        java.lang.String str8 = executionEntity1.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test9720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9720");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        org.activiti.engine.impl.javax.el.ELContext eLContext4 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity5 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList6 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity5);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity8.getCachedElContext();
        boolean boolean10 = executionEntity8.isSuspended();
        java.lang.Object obj11 = executionEntity8.getPersistentState();
        java.lang.Object obj12 = executionEntity8.getPersistentState();
        boolean boolean13 = executionEntity8.isConcurrent();
        executionEntity8.setEventScope(false);
        int int16 = executionEntity8.getRevisionNext();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity1.setProcessDefinitionId("");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl20 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl20);
        executionEntity1.setEventScope(true);
        java.lang.String str24 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.javax.el.ELContext eLContext25 = executionEntity1.getCachedElContext();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(eLContext4);
        org.junit.Assert.assertNotNull(activityExecutionList6);
        org.junit.Assert.assertNull(eLContext9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(eLContext25);
    }

    @Test
    public void test9721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9721");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        executionEntity1.setActivity(activityImpl7);
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = null;
        executionEntity1.setCachedElContext(eLContext9);
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test9722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9722");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        org.junit.Assert.assertNull(taskDefinition3);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        org.junit.Assert.assertNull(taskDefinition10);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        org.junit.Assert.assertNull(taskDefinition12);
    }

    @Test
    public void test9723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9723");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity14.setSuspensionState((-1));
        java.lang.String str19 = executionEntity14.getName();
        executionEntity8.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl21 = null;
        executionEntity14.setTransitionBeingTaken(transitionImpl21);
        java.lang.String str23 = executionEntity14.getEventName();
        java.lang.String str24 = executionEntity14.getTenantId();
        executionEntity14.setParentId("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        org.activiti.engine.impl.javax.el.ELContext eLContext29 = executionEntity28.getCachedElContext();
        boolean boolean30 = executionEntity28.isEnded();
        boolean boolean31 = executionEntity28.isActive();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl32 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl32);
        executionEntity33.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity28.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity33);
        executionEntity14.setSuperExecution(executionEntity28);
        executionEntity28.setScope(false);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity40 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity28.addJob(jobEntity40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(eLContext29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test9724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9724");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isEnded();
        boolean boolean4 = executionEntity1.isActive();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl5);
        executionEntity6.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str10 = executionEntity1.getTenantId();
        boolean boolean11 = executionEntity1.isSuspended();
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        org.activiti.engine.impl.javax.el.ELContext eLContext15 = executionEntity14.getCachedElContext();
        org.activiti.engine.EngineServices engineServices16 = executionEntity14.getEngineServices();
        java.lang.Object obj17 = executionEntity14.getPersistentState();
        java.lang.String str18 = executionEntity14.getDeleteReason();
        executionEntity14.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = executionEntity14.getActivity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl21 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl21);
        executionEntity22.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity22.setSuspensionState((-1));
        java.lang.String str27 = executionEntity22.getName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl28 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl28);
        org.activiti.engine.impl.javax.el.ELContext eLContext30 = executionEntity29.getCachedElContext();
        boolean boolean31 = executionEntity29.isSuspended();
        executionEntity22.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity29);
        java.lang.String str33 = executionEntity22.getName();
        int int34 = executionEntity22.getRevisionNext();
        executionEntity14.setSuperExecution(executionEntity22);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement36 = null;
        executionEntity22.setEventSource(pvmProcessElement36);
        java.lang.Object obj38 = executionEntity22.getPersistentState();
        executionEntity22.setActive(true);
        org.activiti.engine.impl.javax.el.ELContext eLContext41 = null;
        executionEntity22.setCachedElContext(eLContext41);
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity22);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity22.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(eLContext15);
        org.junit.Assert.assertNull(engineServices16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(activityImpl20);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(eLContext30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=-1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=-1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=-1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test9725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9725");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        java.lang.String str5 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity1.getTransition();
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = executionEntity1.getCachedElContext();
        executionEntity1.setBusinessKey("ProcessInstance[null]");
        executionEntity1.setParentId("ProcessInstance[ProcessInstance[null]]");
        java.lang.Class<?> wildcardClass12 = executionEntity1.getClass();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(transitionImpl6);
        org.junit.Assert.assertNull(eLContext7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test9726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9726");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        org.activiti.engine.impl.javax.el.ELContext eLContext4 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity5 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList6 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity5);
        java.lang.String str7 = executionEntity1.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity1.getTransition();
        java.lang.String[] strArray13 = new java.lang.String[] { "ProcessInstance[]", "ProcessInstance[ScopeExecution[null]]", "hi!", "ScopeExecution[ProcessInstance[null]]" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariablesLocal((java.util.Collection<java.lang.String>) strList14);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(eLContext4);
        org.junit.Assert.assertNotNull(activityExecutionList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(transitionImpl8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test9727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9727");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setSuspensionState((-1));
        java.lang.String str6 = executionEntity1.getName();
        executionEntity1.setSuspensionState((-1));
        executionEntity1.disposeStartingExecution();
        java.lang.Object obj10 = executionEntity1.getPersistentState();
        int int11 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity13.setSuspensionState((-1));
        java.lang.String str18 = executionEntity13.getName();
        boolean boolean19 = executionEntity13.isConcurrent();
        executionEntity13.disposeStartingExecution();
        int int21 = executionEntity13.getRevision();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity13.end();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=-1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=-1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=-1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test9728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9728");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setActive(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        executionEntity1.setActivity(activityImpl7);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList9 = executionEntity1.getQueryVariables();
        boolean boolean10 = executionEntity1.isProcessInstanceType();
        executionEntity1.disposeStartingExecution();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList12 = executionEntity1.getIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(variableInstanceEntityList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test9729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9729");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        java.lang.String str5 = executionEntity1.getDeleteReason();
        executionEntity1.setBusinessKey("");
        java.lang.String str8 = executionEntity1.getEventName();
        org.activiti.engine.EngineServices engineServices9 = executionEntity1.getEngineServices();
        boolean boolean10 = executionEntity1.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity11.setExecutionListenerIndex((java.lang.Integer) 36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(engineServices9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(executionEntity11);
    }

    @Test
    public void test9730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9730");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        boolean boolean5 = executionEntity1.isEnded();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity1.getTransition();
        boolean boolean7 = executionEntity1.isProcessInstanceType();
        boolean boolean8 = executionEntity1.isProcessInstanceType();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        executionEntity1.setActivity(activityImpl9);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = executionEntity1.getEventSource();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(transitionImpl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(pvmProcessElement11);
    }

    @Test
    public void test9731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9731");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getReplacedBy();
        boolean boolean6 = executionEntity1.isSuspended();
        java.lang.String str7 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = executionEntity1.getActivity();
        int int9 = executionEntity1.getSuspensionState();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList10 = executionEntity1.findActiveActivityIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(executionEntity5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(activityImpl8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test9732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9732");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        int int4 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        executionEntity1.setActivity(activityImpl5);
        java.lang.Object obj7 = executionEntity1.getPersistentState();
        java.lang.String str8 = executionEntity1.getProcessDefinitionId();
        executionEntity1.inactivate();
        java.lang.String str10 = executionEntity1.getEventName();
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement12 = null;
        executionEntity1.setEventSource(pvmProcessElement12);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution14 = executionEntity1.getStartingExecution();
        java.lang.String str15 = executionEntity1.getProcessInstanceId();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.remove();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(startingExecution14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test9733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9733");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        org.activiti.engine.impl.javax.el.ELContext eLContext13 = executionEntity1.getCachedElContext();
        executionEntity1.setSuspensionState(1);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution16 = executionEntity1.getStartingExecution();
        boolean boolean17 = executionEntity1.isEnded();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(eLContext13);
        org.junit.Assert.assertNotNull(startingExecution16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test9734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9734");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        boolean boolean6 = executionEntity1.isConcurrent();
        executionEntity1.setEventScope(true);
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = null;
        executionEntity1.setCachedElContext(eLContext9);
        java.lang.String str11 = executionEntity1.getId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = executionEntity1.getActivity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        org.activiti.engine.impl.javax.el.ELContext eLContext15 = executionEntity14.getCachedElContext();
        org.activiti.engine.EngineServices engineServices16 = executionEntity14.getEngineServices();
        java.lang.Object obj17 = executionEntity14.getPersistentState();
        executionEntity14.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl20);
        executionEntity21.setExecutionListenerIndex((java.lang.Integer) 0);
        int int24 = executionEntity21.getSuspensionState();
        executionEntity14.setSuperExecution(executionEntity21);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution26 = executionEntity21.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        org.activiti.engine.impl.javax.el.ELContext eLContext29 = executionEntity28.getCachedElContext();
        org.activiti.engine.EngineServices engineServices30 = executionEntity28.getEngineServices();
        int int31 = executionEntity28.getCachedEntityState();
        java.lang.String str32 = executionEntity28.getTenantId();
        executionEntity21.setSuperExecution(executionEntity28);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl34 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl34);
        boolean boolean36 = executionEntity35.isEnded();
        java.lang.String str37 = executionEntity35.getParentId();
        executionEntity28.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity35);
        java.lang.String str39 = executionEntity28.getDeleteReason();
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = executionEntity28.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap40);
        executionEntity1.setId("ProcessInstance[ScopeExecution[null]]");
        executionEntity1.setId("ProcessInstance[hi!]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity46 = executionEntity1.getProcessInstance();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(activityImpl12);
        org.junit.Assert.assertNull(eLContext15);
        org.junit.Assert.assertNull(engineServices16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(startingExecution26);
        org.junit.Assert.assertNull(eLContext29);
        org.junit.Assert.assertNull(engineServices30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNull(executionEntity46);
    }

    @Test
    public void test9735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9735");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setSuspensionState((-1));
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.getSuperExecution();
        int int7 = executionEntity1.getSuspensionState();
        java.lang.Object obj8 = executionEntity1.getPersistentState();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = executionEntity1.getQueryVariables();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.createExecution();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executionEntity6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=-1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=-1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=-1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(variableInstanceEntityList10);
    }

    @Test
    public void test9736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9736");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setEventScope(true);
        org.activiti.engine.EngineServices engineServices7 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity1.getEventSource();
        executionEntity1.forceUpdate();
        executionEntity1.setId("");
        java.lang.String str12 = executionEntity1.getTenantId();
        executionEntity1.setProcessDefinitionId("ProcessInstance[ScopeExecution[null]]");
        org.activiti.engine.impl.javax.el.ELContext eLContext15 = executionEntity1.getCachedElContext();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices7);
        org.junit.Assert.assertNull(pvmProcessElement8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(eLContext15);
    }

    @Test
    public void test9737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9737");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        int int4 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getProcessInstance();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity7.setSuspensionState((-1));
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl13 = executionEntity7.getProcessDefinition();
        executionEntity1.setSuperExecution(executionEntity7);
        boolean boolean15 = executionEntity7.isEnded();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = executionEntity7.getProcessVariables();
        boolean boolean17 = executionEntity7.isEnded();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNull(executionEntity5);
        org.junit.Assert.assertNull(executionEntity12);
        org.junit.Assert.assertNull(processDefinitionImpl13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test9738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9738");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getBusinessKey();
        int int6 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.getSuperExecution();
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement9 = executionEntity1.getEventSource();
        executionEntity1.inactivate();
        java.lang.String str11 = executionEntity1.getProcessDefinitionId();
        org.activiti.engine.impl.javax.el.ELContext eLContext12 = executionEntity1.getCachedElContext();
        executionEntity1.setCachedEntityState((int) '#');
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity15 = null;
        executionEntity1.removeJob(jobEntity15);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertNull(executionEntity7);
        org.junit.Assert.assertNull(pvmProcessElement9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(eLContext12);
    }

    @Test
    public void test9739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9739");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        org.activiti.engine.impl.javax.el.ELContext eLContext10 = executionEntity9.getCachedElContext();
        executionEntity9.forceUpdate();
        executionEntity9.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution14 = executionEntity9.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity9.getTransitionBeingTaken();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = executionEntity9.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity9.getSuperExecution();
        boolean boolean18 = executionEntity9.isDeleteRoot();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl20 = executionEntity9.getTransitionBeingTaken();
        java.lang.String str21 = executionEntity9.getProcessDefinitionId();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = executionEntity9.createExecution();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertNull(executionEntity7);
        org.junit.Assert.assertNull(eLContext10);
        org.junit.Assert.assertNotNull(startingExecution14);
        org.junit.Assert.assertNull(transitionImpl15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(executionEntity17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(transitionImpl20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test9740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9740");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setSuspensionState((-1));
        java.lang.String str6 = executionEntity1.getName();
        executionEntity1.setSuspensionState((-1));
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity1.getCachedElContext();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = executionEntity1.getProcessVariables();
        java.lang.String str11 = executionEntity1.getId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement12 = executionEntity1.getEventSource();
        executionEntity1.setActive(true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(eLContext9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(pvmProcessElement12);
    }

    @Test
    public void test9741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9741");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        boolean boolean7 = executionEntity1.isEventScope();
        boolean boolean8 = executionEntity1.isSuspended();
        int int9 = executionEntity1.getRevision();
        int int10 = executionEntity1.getRevision();
        java.lang.String str11 = executionEntity1.getName();
        boolean boolean12 = executionEntity1.isEventScope();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 7);
        int int15 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setExecutionListenerIndex((java.lang.Integer) 0);
        int int20 = executionEntity17.getSuspensionState();
        java.lang.String str21 = executionEntity17.getProcessInstanceId();
        executionEntity17.setSuspensionState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList24 = executionEntity17.getQueryVariables();
        executionEntity17.forceUpdate();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(variableInstanceEntityList24);
    }

    @Test
    public void test9742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9742");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity1.getTransitionBeingTaken();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity1.getSuperExecution();
        boolean boolean10 = executionEntity1.isDeleteRoot();
        java.lang.String str11 = executionEntity1.getProcessDefinitionId();
        boolean boolean12 = executionEntity1.isActive();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroy();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertNull(transitionImpl7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(executionEntity9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test9743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9743");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        boolean boolean6 = executionEntity1.isProcessInstanceType();
        executionEntity1.setScope(false);
        boolean boolean9 = executionEntity1.isScope();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity1.setTransition(transitionImpl10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        org.activiti.engine.impl.javax.el.ELContext eLContext14 = executionEntity13.getCachedElContext();
        org.activiti.engine.EngineServices engineServices15 = executionEntity13.getEngineServices();
        java.lang.Object obj16 = executionEntity13.getPersistentState();
        java.lang.String str17 = executionEntity13.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl18 = executionEntity13.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity13.getParent();
        boolean boolean20 = executionEntity13.isEnded();
        executionEntity13.setConcurrent(true);
        executionEntity1.setSuperExecution(executionEntity13);
        java.lang.String str24 = executionEntity1.getSuperExecutionId();
        java.lang.String str25 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl26 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl26);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray28 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList29 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList29, variableInstanceEntityArray28);
        executionEntity27.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList29);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList32 = executionEntity27.getQueryVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray35 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList36 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList36, variableInstanceEntityArray35);
        executionEntity34.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList36);
        executionEntity27.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList36);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity27);
        boolean boolean41 = executionEntity1.isConcurrent();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(eLContext14);
        org.junit.Assert.assertNull(engineServices15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(transitionImpl18);
        org.junit.Assert.assertNull(executionEntity19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(variableInstanceEntityList32);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test9744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9744");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        int int4 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        executionEntity1.setActivity(activityImpl5);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.getProcessInstance();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str10 = executionEntity1.getTenantId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution11 = executionEntity1.getStartingExecution();
        int int12 = executionEntity1.getRevisionNext();
        java.lang.String str13 = executionEntity1.getCurrentActivityId();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = executionEntity1.hasVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNull(executionEntity7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(startingExecution11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test9745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9745");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        org.activiti.engine.impl.javax.el.ELContext eLContext4 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity5 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList6 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity5);
        java.lang.String str7 = executionEntity1.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity1.getTransition();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        org.activiti.engine.impl.javax.el.ELContext eLContext11 = executionEntity10.getCachedElContext();
        boolean boolean12 = executionEntity10.isSuspended();
        java.lang.Object obj13 = executionEntity10.getPersistentState();
        java.lang.Object obj14 = executionEntity10.getPersistentState();
        org.activiti.engine.impl.javax.el.ELContext eLContext15 = null;
        executionEntity10.setCachedElContext(eLContext15);
        executionEntity10.setExecutionListenerIndex((java.lang.Integer) 7);
        executionEntity10.setBusinessKey("");
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        java.lang.Object obj22 = executionEntity10.getPersistentState();
        java.lang.String str23 = executionEntity10.getBusinessKey();
        int int24 = executionEntity10.getRevision();
        java.lang.String str25 = executionEntity10.getCurrentActivityId();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(eLContext4);
        org.junit.Assert.assertNotNull(activityExecutionList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(transitionImpl8);
        org.junit.Assert.assertNull(eLContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test9746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9746");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        boolean boolean5 = executionEntity1.isEnded();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity1.getTransition();
        boolean boolean7 = executionEntity1.isProcessInstanceType();
        java.lang.String str8 = executionEntity1.getId();
        java.lang.String str9 = executionEntity1.getDeleteReason();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.javax.el.ELContext eLContext12 = executionEntity11.getCachedElContext();
        org.activiti.engine.EngineServices engineServices13 = executionEntity11.getEngineServices();
        java.lang.Object obj14 = executionEntity11.getPersistentState();
        executionEntity11.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setExecutionListenerIndex((java.lang.Integer) 0);
        int int21 = executionEntity18.getSuspensionState();
        executionEntity11.setSuperExecution(executionEntity18);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        executionEntity24.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity24.setSuspensionState((-1));
        java.lang.String str29 = executionEntity24.getName();
        executionEntity18.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl31 = null;
        executionEntity24.setTransitionBeingTaken(transitionImpl31);
        java.lang.String str33 = executionEntity24.getEventName();
        java.lang.String str34 = executionEntity24.getTenantId();
        executionEntity24.setParentId("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl37 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity38 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl37);
        org.activiti.engine.impl.javax.el.ELContext eLContext39 = executionEntity38.getCachedElContext();
        boolean boolean40 = executionEntity38.isEnded();
        boolean boolean41 = executionEntity38.isActive();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl42 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl42);
        executionEntity43.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity38.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity43);
        executionEntity24.setSuperExecution(executionEntity38);
        executionEntity38.setScope(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap50 = executionEntity38.getProcessVariables();
        executionEntity1.createVariablesLocal(strMap50);
        executionEntity1.setParentId("ProcessInstance[ProcessInstance[null]]");
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(transitionImpl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(eLContext12);
        org.junit.Assert.assertNull(engineServices13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(eLContext39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strMap50);
    }

    @Test
    public void test9747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9747");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        executionEntity8.setName("hi!");
        int int15 = executionEntity8.getRevision();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = executionEntity8.getProcessVariables();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity8.getProcessVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        org.activiti.engine.impl.javax.el.ELContext eLContext20 = executionEntity19.getCachedElContext();
        boolean boolean21 = executionEntity19.isSuspended();
        java.lang.Object obj22 = executionEntity19.getPersistentState();
        executionEntity19.setEventScope(true);
        org.activiti.engine.EngineServices engineServices25 = executionEntity19.getEngineServices();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement26 = executionEntity19.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = executionEntity27.getReplacedBy();
        executionEntity27.inactivate();
        executionEntity19.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity27);
        java.lang.String str31 = executionEntity27.getActivityId();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity27);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray35 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList36 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList36, variableInstanceEntityArray35);
        executionEntity34.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList36);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList39 = executionEntity34.getQueryVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl40);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray42 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList43 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList43, variableInstanceEntityArray42);
        executionEntity41.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList43);
        executionEntity34.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList43);
        executionEntity27.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList43);
        java.lang.String str48 = executionEntity27.getProcessDefinitionId();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap49 = executionEntity27.getVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(eLContext20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices25);
        org.junit.Assert.assertNull(pvmProcessElement26);
        org.junit.Assert.assertNull(executionEntity28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(variableInstanceEntityList39);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test9748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9748");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        boolean boolean5 = executionEntity1.isEnded();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity1.getTransition();
        boolean boolean7 = executionEntity1.isProcessInstanceType();
        boolean boolean8 = executionEntity1.isProcessInstanceType();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        executionEntity1.setActivity(activityImpl9);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = executionEntity1.getProcessVariables();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(transitionImpl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test9749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9749");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior2);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.junit.Assert.assertNull(taskDefinition4);
        org.junit.Assert.assertNull(taskDefinition5);
        org.junit.Assert.assertNull(taskDefinition6);
        org.junit.Assert.assertNull(taskDefinition7);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        org.junit.Assert.assertNull(taskDefinition9);
        org.junit.Assert.assertNull(taskDefinition10);
        org.junit.Assert.assertNull(taskDefinition11);
        org.junit.Assert.assertNull(taskDefinition12);
    }

    @Test
    public void test9750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9750");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        boolean boolean7 = executionEntity1.isEventScope();
        java.lang.String str8 = executionEntity1.getName();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl9);
        java.lang.String str11 = executionEntity1.getActivityId();
        executionEntity1.setActive(true);
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test9751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9751");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity1.getTransitionBeingTaken();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity1.getSuperExecution();
        boolean boolean10 = executionEntity1.isDeleteRoot();
        executionEntity1.disposeStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl12);
        java.lang.String str14 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        org.activiti.engine.impl.javax.el.ELContext eLContext17 = executionEntity16.getCachedElContext();
        org.activiti.engine.EngineServices engineServices18 = executionEntity16.getEngineServices();
        java.lang.Object obj19 = executionEntity16.getPersistentState();
        java.lang.String str20 = executionEntity16.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl21 = executionEntity16.getTransition();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap23 = executionEntity16.getVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertNull(transitionImpl7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(executionEntity9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(eLContext17);
        org.junit.Assert.assertNull(engineServices18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(transitionImpl21);
    }

    @Test
    public void test9752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9752");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        executionEntity8.setName("hi!");
        int int15 = executionEntity8.getRevision();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = executionEntity8.getActivity();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = null;
        executionEntity8.setTransitionBeingTaken(transitionImpl17);
        boolean boolean19 = executionEntity8.isDeleteRoot();
        java.lang.String str20 = executionEntity8.getProcessDefinitionId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList21 = executionEntity8.getQueryVariables();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity22 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity8.executeActivity(pvmActivity22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(activityImpl16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(variableInstanceEntityList21);
    }

    @Test
    public void test9753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9753");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        executionEntity8.setName("hi!");
        int int15 = executionEntity8.getRevision();
        boolean boolean16 = executionEntity8.isEventScope();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = null;
        executionEntity8.setTransitionBeingTaken(transitionImpl17);
        boolean boolean19 = executionEntity8.isSuspended();
        int int20 = executionEntity8.getRevision();
        java.lang.String str21 = executionEntity8.getActivityId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution22 = executionEntity8.getStartingExecution();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(startingExecution22);
    }

    @Test
    public void test9754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9754");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        org.activiti.engine.impl.javax.el.ELContext eLContext4 = executionEntity1.getCachedElContext();
        java.lang.String str5 = executionEntity1.getBusinessKey();
        executionEntity1.setTenantId("");
        boolean boolean8 = executionEntity1.isConcurrent();
        java.lang.String str9 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = executionEntity1.getTransitionBeingTaken();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(eLContext4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(transitionImpl10);
    }

    @Test
    public void test9755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9755");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity1.getEventSource();
        executionEntity1.setDeleteReason("hi!");
        executionEntity1.disposeStartingExecution();
        int int8 = executionEntity1.getRevisionNext();
        executionEntity1.setRevision((int) (byte) 10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        org.activiti.engine.impl.javax.el.ELContext eLContext13 = executionEntity12.getCachedElContext();
        boolean boolean14 = executionEntity12.isSuspended();
        java.lang.Object obj15 = executionEntity12.getPersistentState();
        java.lang.Object obj16 = executionEntity12.getPersistentState();
        boolean boolean17 = executionEntity12.isConcurrent();
        java.lang.String str18 = executionEntity12.toString();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl19 = executionEntity12.getProcessDefinition();
        java.lang.String str20 = executionEntity12.getName();
        java.lang.String str21 = executionEntity12.getBusinessKey();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        org.junit.Assert.assertNull(pvmProcessElement4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNull(eLContext13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ProcessInstance[null]" + "'", str18, "ProcessInstance[null]");
        org.junit.Assert.assertNull(processDefinitionImpl19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test9756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9756");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        org.activiti.engine.impl.javax.el.ELContext eLContext10 = executionEntity9.getCachedElContext();
        executionEntity9.forceUpdate();
        executionEntity9.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution14 = executionEntity9.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity9.getTransitionBeingTaken();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = executionEntity9.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity9.getSuperExecution();
        boolean boolean18 = executionEntity9.isDeleteRoot();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity1.getSuperExecution();
        boolean boolean21 = executionEntity1.isProcessInstanceType();
        java.lang.String str22 = executionEntity1.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl23 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl23);
        java.lang.String str25 = executionEntity1.getActivityId();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertNull(executionEntity7);
        org.junit.Assert.assertNull(eLContext10);
        org.junit.Assert.assertNotNull(startingExecution14);
        org.junit.Assert.assertNull(transitionImpl15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(executionEntity17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(executionEntity20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test9757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9757");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray2 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3, variableInstanceEntityArray2);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl7);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        executionEntity1.setActivity(activityImpl9);
        org.activiti.engine.impl.pvm.runtime.InterpretableExecution interpretableExecution11 = null;
        executionEntity1.setParent(interpretableExecution11);
        java.lang.String str13 = executionEntity1.getId();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl14 = executionEntity1.getProcessDefinition();
        int int15 = executionEntity1.getRevision();
        int int16 = executionEntity1.getRevision();
        executionEntity1.forceUpdate();
        org.junit.Assert.assertNotNull(variableInstanceEntityArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(variableInstanceEntityList6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(processDefinitionImpl14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test9758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9758");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setEventScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray9 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10, variableInstanceEntityArray9);
        executionEntity8.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList10);
        executionEntity8.setTenantId("ProcessInstance[null]");
        boolean boolean15 = executionEntity8.isScope();
        java.lang.Object obj16 = executionEntity8.getPersistentState();
        executionEntity8.setRevision((int) (short) 10);
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity8.disposeStartingExecution();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(variableInstanceEntityArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test9759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9759");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setSuspensionState((-1));
        java.lang.String str6 = executionEntity1.getName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity8.getCachedElContext();
        boolean boolean10 = executionEntity8.isSuspended();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        java.lang.String str12 = executionEntity8.getDeleteReason();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        org.activiti.engine.impl.javax.el.ELContext eLContext15 = executionEntity14.getCachedElContext();
        org.activiti.engine.EngineServices engineServices16 = executionEntity14.getEngineServices();
        java.lang.Object obj17 = executionEntity14.getPersistentState();
        executionEntity14.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl20);
        executionEntity21.setExecutionListenerIndex((java.lang.Integer) 0);
        int int24 = executionEntity21.getSuspensionState();
        executionEntity14.setSuperExecution(executionEntity21);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl26 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl26);
        executionEntity27.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity27.setSuspensionState((-1));
        java.lang.String str32 = executionEntity27.getName();
        executionEntity21.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity27);
        org.activiti.engine.EngineServices engineServices34 = executionEntity27.getEngineServices();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = executionEntity27.getProcessVariables();
        executionEntity8.setVariablesLocal(strMap35);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl37 = executionEntity8.getTransition();
        java.lang.String str38 = executionEntity8.getName();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity39 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity8.removeJob(jobEntity39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(eLContext9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(eLContext15);
        org.junit.Assert.assertNull(engineServices16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(engineServices34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNull(transitionImpl37);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test9760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9760");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = executionEntity1.getEventSource();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = null;
        executionEntity1.setTransition(transitionImpl6);
        executionEntity1.setScope(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.javax.el.ELContext eLContext12 = executionEntity11.getCachedElContext();
        executionEntity11.forceUpdate();
        executionEntity11.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution16 = executionEntity11.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = executionEntity11.getTransitionBeingTaken();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = executionEntity11.getProcessVariables();
        java.lang.String str20 = executionEntity11.getCurrentActivityId();
        java.lang.String str21 = executionEntity11.toString();
        executionEntity11.setDeleteReason("ProcessInstance[ProcessInstance[null]]");
        executionEntity11.inactivate();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(pvmProcessElement5);
        org.junit.Assert.assertNull(eLContext12);
        org.junit.Assert.assertNotNull(startingExecution16);
        org.junit.Assert.assertNull(transitionImpl17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ProcessInstance[null]" + "'", str21, "ProcessInstance[null]");
    }

    @Test
    public void test9761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9761");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution13 = executionEntity8.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = executionEntity15.getCachedElContext();
        org.activiti.engine.EngineServices engineServices17 = executionEntity15.getEngineServices();
        int int18 = executionEntity15.getCachedEntityState();
        java.lang.String str19 = executionEntity15.getTenantId();
        executionEntity8.setSuperExecution(executionEntity15);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl21 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl21);
        boolean boolean23 = executionEntity22.isEnded();
        java.lang.String str24 = executionEntity22.getParentId();
        executionEntity15.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity22);
        executionEntity15.setSuspensionState((int) (short) 100);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement28 = executionEntity15.getEventSource();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement29 = executionEntity15.getEventSource();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl30 = executionEntity15.getActivity();
        int int31 = executionEntity15.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl32 = executionEntity15.getTransition();
        executionEntity15.setProcessDefinitionId("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution35 = executionEntity15.getStartingExecution();
        java.lang.String[] strArray37 = new java.lang.String[] { "ScopeExecution[ProcessInstance[null]]" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity15.removeVariablesLocal((java.util.Collection<java.lang.String>) strList38);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(startingExecution13);
        org.junit.Assert.assertNull(eLContext16);
        org.junit.Assert.assertNull(engineServices17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(pvmProcessElement28);
        org.junit.Assert.assertNull(pvmProcessElement29);
        org.junit.Assert.assertNull(activityImpl30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
        org.junit.Assert.assertNull(transitionImpl32);
        org.junit.Assert.assertNotNull(startingExecution35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test9762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9762");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        boolean boolean6 = executionEntity1.isProcessInstanceType();
        executionEntity1.setScope(false);
        boolean boolean9 = executionEntity1.isScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        executionEntity1.setActivity(activityImpl10);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = null;
        executionEntity1.setTransition(transitionImpl12);
        org.activiti.engine.impl.javax.el.ELContext eLContext14 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.javax.el.ELContext eLContext15 = executionEntity1.getCachedElContext();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = executionEntity1.hasVariableLocal("ScopeExecution[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(eLContext14);
        org.junit.Assert.assertNull(eLContext15);
    }

    @Test
    public void test9763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9763");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getBusinessKey();
        executionEntity1.setCachedEntityState((int) (byte) 0);
        executionEntity1.setDeleteReason("ProcessInstance[ScopeExecution[null]]");
        int int10 = executionEntity1.getRevision();
        boolean boolean11 = executionEntity1.isScope();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test9764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9764");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        boolean boolean5 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity1.getActivity();
        executionEntity1.setId("");
        executionEntity1.setScope(true);
        executionEntity1.setCachedEntityState(0);
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(activityImpl6);
    }

    @Test
    public void test9765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9765");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray2 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3, variableInstanceEntityArray2);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3);
        executionEntity1.setTenantId("ProcessInstance[null]");
        boolean boolean8 = executionEntity1.isScope();
        executionEntity1.inactivate();
        boolean boolean10 = executionEntity1.isDeleteRoot();
        executionEntity1.forceUpdate();
        executionEntity1.setSuspensionState((int) (byte) -1);
        java.lang.String str14 = executionEntity1.getProcessInstanceId();
        org.junit.Assert.assertNotNull(variableInstanceEntityArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test9766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9766");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        boolean boolean5 = executionEntity1.isEnded();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity1.getTransition();
        boolean boolean7 = executionEntity1.isProcessInstanceType();
        boolean boolean8 = executionEntity1.isProcessInstanceType();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        executionEntity1.setActivity(activityImpl9);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getProcessInstance();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(transitionImpl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(executionEntity11);
    }

    @Test
    public void test9767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9767");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getSuperExecution();
        executionEntity1.setTenantId("");
        executionEntity1.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl10);
        executionEntity1.setActive(false);
        java.lang.String str14 = executionEntity1.getActivityId();
        java.lang.String str15 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.EngineServices engineServices16 = executionEntity1.getEngineServices();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(transitionImpl4);
        org.junit.Assert.assertNull(executionEntity5);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(engineServices16);
    }

    @Test
    public void test9768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9768");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setEventScope(true);
        org.activiti.engine.EngineServices engineServices7 = executionEntity1.getEngineServices();
        executionEntity1.setCachedEntityState((int) 'a');
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = executionEntity1.getQueryVariables();
        executionEntity1.setEventScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity14 = null;
        executionEntity1.addTask(taskEntity14);
        boolean boolean16 = executionEntity1.isActive();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices7);
        org.junit.Assert.assertNull(variableInstanceEntityList10);
        org.junit.Assert.assertNull(executionEntity13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test9769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9769");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getBusinessKey();
        int int6 = executionEntity1.getRevisionNext();
        executionEntity1.setName("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity1.getProcessInstance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(executionEntity9);
    }

    @Test
    public void test9770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9770");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        int int4 = executionEntity1.getSuspensionState();
        java.lang.String str5 = executionEntity1.getBusinessKey();
        int int6 = executionEntity1.getRevisionNext();
        int int7 = executionEntity1.getRevision();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity1.getTransitionBeingTaken();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement9 = executionEntity1.getEventSource();
        java.lang.String str10 = executionEntity1.getTenantId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getSuperExecution();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(transitionImpl8);
        org.junit.Assert.assertNull(pvmProcessElement9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(executionEntity11);
    }

    @Test
    public void test9771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9771");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        boolean boolean5 = executionEntity1.isEnded();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity1.getTransition();
        executionEntity1.setEventScope(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray11 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList12 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList12, variableInstanceEntityArray11);
        executionEntity10.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList12);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = executionEntity10.getQueryVariables();
        executionEntity1.setQueryVariables(variableInstanceEntityList15);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = executionEntity1.getTransitionBeingTaken();
        executionEntity1.setConcurrent(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = executionEntity1.getActivity();
        executionEntity1.setEventName("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray25 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList26 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList26, variableInstanceEntityArray25);
        executionEntity24.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList26);
        executionEntity24.setTenantId("ProcessInstance[null]");
        boolean boolean31 = executionEntity24.isScope();
        executionEntity24.setExecutionListenerIndex((java.lang.Integer) 1);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(transitionImpl6);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(variableInstanceEntityList15);
        org.junit.Assert.assertNull(transitionImpl17);
        org.junit.Assert.assertNull(activityImpl20);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test9772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9772");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        boolean boolean2 = executionEntity1.isEnded();
        java.lang.String str3 = executionEntity1.getActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity1.getSuperExecution();
        java.lang.String str5 = executionEntity1.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = executionEntity1.getVariableLocal("ProcessInstance[ProcessInstance[null]]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(executionEntity4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test9773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9773");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray2 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3, variableInstanceEntityArray2);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3);
        executionEntity1.setTenantId("ProcessInstance[null]");
        executionEntity1.setTenantId("ProcessInstance[ProcessInstance[null]]");
        org.junit.Assert.assertNotNull(variableInstanceEntityArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test9774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9774");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        boolean boolean7 = executionEntity1.isEnded();
        executionEntity1.setTenantId("ProcessInstance[ProcessInstance[ProcessInstance[null]]]");
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test9775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9775");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray2 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3, variableInstanceEntityArray2);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList3);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity1.getQueryVariables();
        java.lang.String str7 = executionEntity1.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getSuperExecution();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity1.getEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(variableInstanceEntityArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(variableInstanceEntityList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test9776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9776");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getReplacedBy();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity5.getCachedElContext();
        boolean boolean7 = executionEntity5.isSuspended();
        java.lang.Object obj8 = executionEntity5.getPersistentState();
        java.lang.Object obj9 = executionEntity5.getPersistentState();
        boolean boolean10 = executionEntity5.isConcurrent();
        java.lang.String str11 = executionEntity5.toString();
        int int12 = executionEntity5.getRevisionNext();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        int int14 = executionEntity5.getRevision();
        int int15 = executionEntity5.getCachedEntityState();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(executionEntity3);
        org.junit.Assert.assertNull(eLContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ProcessInstance[null]" + "'", str11, "ProcessInstance[null]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
    }

    @Test
    public void test9777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9777");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        boolean boolean6 = executionEntity1.isConcurrent();
        executionEntity1.setEventScope(false);
        int int9 = executionEntity1.getRevisionNext();
        java.lang.String str10 = executionEntity1.getCurrentActivityId();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test9778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9778");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        org.activiti.engine.impl.javax.el.ELContext eLContext4 = executionEntity1.getCachedElContext();
        int int5 = executionEntity1.getSuspensionState();
        boolean boolean6 = executionEntity1.isProcessInstanceType();
        boolean boolean7 = executionEntity1.isConcurrent();
        java.lang.String str8 = executionEntity1.getProcessInstanceId();
        executionEntity1.inactivate();
        boolean boolean10 = executionEntity1.isEventScope();
        executionEntity1.setEventName("");
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(eLContext4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test9779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9779");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        boolean boolean7 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = null;
        executionEntity1.setEventSource(pvmProcessElement8);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        org.activiti.engine.impl.javax.el.ELContext eLContext12 = executionEntity11.getCachedElContext();
        org.activiti.engine.EngineServices engineServices13 = executionEntity11.getEngineServices();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution14 = executionEntity11.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl15 = executionEntity11.getProcessDefinition();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        executionEntity11.setScope(true);
        executionEntity11.setEventScope(false);
        boolean boolean21 = executionEntity11.isDeleteRoot();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(eLContext12);
        org.junit.Assert.assertNull(engineServices13);
        org.junit.Assert.assertNotNull(startingExecution14);
        org.junit.Assert.assertNull(processDefinitionImpl15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test9780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9780");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        int int4 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = null;
        executionEntity1.setActivity(activityImpl5);
        java.lang.Object obj7 = executionEntity1.getPersistentState();
        executionEntity1.setConcurrent(false);
        executionEntity1.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement12 = null;
        executionEntity1.setEventSource(pvmProcessElement12);
        executionEntity1.setActive(false);
        boolean boolean16 = executionEntity1.isProcessInstanceType();
        java.lang.String str17 = executionEntity1.getId();
        executionEntity1.setEventScope(true);
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=7, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test9781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9781");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity1.getEventSource();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity1.getProcessDefinition();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement7 = executionEntity1.getEventSource();
        executionEntity1.setCachedEntityState(0);
        org.junit.Assert.assertNull(pvmProcessElement4);
        org.junit.Assert.assertNull(variableInstanceEntityList5);
        org.junit.Assert.assertNull(processDefinitionImpl6);
        org.junit.Assert.assertNull(pvmProcessElement7);
    }

    @Test
    public void test9782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9782");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution13 = executionEntity8.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = executionEntity15.getCachedElContext();
        org.activiti.engine.EngineServices engineServices17 = executionEntity15.getEngineServices();
        int int18 = executionEntity15.getCachedEntityState();
        java.lang.String str19 = executionEntity15.getTenantId();
        executionEntity8.setSuperExecution(executionEntity15);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl21 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl21);
        boolean boolean23 = executionEntity22.isEnded();
        java.lang.String str24 = executionEntity22.getParentId();
        executionEntity15.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity22);
        boolean boolean26 = executionEntity15.isEventScope();
        org.activiti.engine.EngineServices engineServices27 = executionEntity15.getEngineServices();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity15.removeIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(startingExecution13);
        org.junit.Assert.assertNull(eLContext16);
        org.junit.Assert.assertNull(engineServices17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(engineServices27);
    }

    @Test
    public void test9783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9783");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity14.setSuspensionState((-1));
        java.lang.String str19 = executionEntity14.getName();
        executionEntity8.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl21 = null;
        executionEntity14.setTransitionBeingTaken(transitionImpl21);
        java.lang.String str23 = executionEntity14.getEventName();
        java.lang.String str24 = executionEntity14.getTenantId();
        executionEntity14.setParentId("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        org.activiti.engine.impl.javax.el.ELContext eLContext29 = executionEntity28.getCachedElContext();
        boolean boolean30 = executionEntity28.isEnded();
        boolean boolean31 = executionEntity28.isActive();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl32 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl32);
        executionEntity33.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity28.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity33);
        executionEntity14.setSuperExecution(executionEntity28);
        executionEntity28.setScope(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = executionEntity28.getProcessVariables();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = executionEntity28.getSubProcessInstance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(eLContext29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strMap40);
    }

    @Test
    public void test9784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9784");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity14.setSuspensionState((-1));
        java.lang.String str19 = executionEntity14.getName();
        executionEntity8.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl21 = null;
        executionEntity14.setTransitionBeingTaken(transitionImpl21);
        java.lang.String str23 = executionEntity14.getEventName();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl24 = null;
        executionEntity14.setTransition(transitionImpl24);
        boolean boolean26 = executionEntity14.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = executionEntity14.getSuperExecution();
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(executionEntity27);
    }

    @Test
    public void test9785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9785");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        executionEntity1.forceUpdate();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        boolean boolean7 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity8 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList9 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity8);
        executionEntity1.setSuspensionState((int) (short) 0);
        executionEntity1.setName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteCascade("ScopeExecution[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNotNull(startingExecution6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(activityExecutionList9);
    }

    @Test
    public void test9786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9786");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        org.activiti.engine.EngineServices engineServices3 = executionEntity1.getEngineServices();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        int int11 = executionEntity8.getSuspensionState();
        executionEntity1.setSuperExecution(executionEntity8);
        executionEntity8.setName("hi!");
        int int15 = executionEntity8.getRevision();
        boolean boolean16 = executionEntity8.isEventScope();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = null;
        executionEntity8.setTransitionBeingTaken(transitionImpl17);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity8.getReplacedBy();
        executionEntity8.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl22 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl22);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray24 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList25 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList25, variableInstanceEntityArray24);
        executionEntity23.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList25);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList28 = executionEntity23.getQueryVariables();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl29 = null;
        executionEntity23.setTransitionBeingTaken(transitionImpl29);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl31 = null;
        executionEntity23.setActivity(activityImpl31);
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = executionEntity23.getProcessVariables();
        executionEntity8.setVariables(strMap33);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet35 = executionEntity8.getVariableNames();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertNull(engineServices3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(executionEntity19);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(variableInstanceEntityList28);
        org.junit.Assert.assertNotNull(strMap33);
    }

    @Test
    public void test9787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9787");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity1.setSuspensionState((-1));
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.getSuperExecution();
        int int7 = executionEntity1.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity1.getProcessVariables();
        int int9 = executionEntity1.getCachedEntityState();
        boolean boolean10 = executionEntity1.isScope();
        executionEntity1.setParentId("ProcessInstance[ProcessInstance[null]]");
        executionEntity1.setSuspensionState((-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        executionEntity1.setVariables(strMap15);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement17 = null;
        executionEntity1.setEventSource(pvmProcessElement17);
        org.junit.Assert.assertNull(executionEntity6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test9788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9788");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.javax.el.ELContext eLContext2 = executionEntity1.getCachedElContext();
        boolean boolean3 = executionEntity1.isSuspended();
        java.lang.Object obj4 = executionEntity1.getPersistentState();
        executionEntity1.setEventScope(true);
        org.activiti.engine.EngineServices engineServices7 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity1.getEventSource();
        java.lang.String str9 = executionEntity1.getDeleteReason();
        int int10 = executionEntity1.getCachedEntityState();
        java.lang.String str11 = executionEntity1.getCurrentActivityId();
        java.lang.String str12 = executionEntity1.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = executionEntity1.getTransition();
        org.activiti.engine.impl.pvm.PvmTransition[] pvmTransitionArray14 = new org.activiti.engine.impl.pvm.PvmTransition[] {};
        java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition> pvmTransitionList15 = new java.util.ArrayList<org.activiti.engine.impl.pvm.PvmTransition>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList15, pvmTransitionArray14);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl17);
        executionEntity18.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity18.setSuspensionState((-1));
        java.lang.String str23 = executionEntity18.getName();
        boolean boolean24 = executionEntity18.isConcurrent();
        executionEntity18.disposeStartingExecution();
        java.lang.String str26 = executionEntity18.getName();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity27 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList28 = executionEntity18.findInactiveConcurrentExecutions(pvmActivity27);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.takeAll((java.util.List<org.activiti.engine.impl.pvm.PvmTransition>) pvmTransitionList15, activityExecutionList28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eLContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(engineServices7);
        org.junit.Assert.assertNull(pvmProcessElement8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(transitionImpl13);
        org.junit.Assert.assertNotNull(pvmTransitionArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(activityExecutionList28);
    }
}

