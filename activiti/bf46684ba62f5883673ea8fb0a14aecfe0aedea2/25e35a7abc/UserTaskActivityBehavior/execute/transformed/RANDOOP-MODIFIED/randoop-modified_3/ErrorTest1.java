import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0501");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setBusinessKey("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj8 = executionEntity7.getPersistentState();
        executionEntity7.setScope(true);
        int int11 = executionEntity7.getCachedEntityState();
        java.lang.String str12 = executionEntity7.toString();
        java.lang.Integer int13 = executionEntity7.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity7.getProcessVariables();
        executionEntity0.createVariablesLocal(strMap14);
        executionEntity0.setBusinessKey("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = executionEntity0.isActive("");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        boolean boolean6 = executionEntity3.isConcurrent();
        java.lang.String str7 = executionEntity3.getId();
        executionEntity0.setSuperExecution(executionEntity3);
        int int9 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ScopeExecution[null]");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        java.lang.String str7 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.lang.String str11 = executionEntity8.getProcessInstanceId();
        int int12 = executionEntity8.getRevision();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray13 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList14 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList14, variableInstanceEntityArray13);
        executionEntity8.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList14);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList14);
        int int18 = executionEntity0.getRevisionNext();
        java.lang.String str19 = executionEntity0.getDeleteReason();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity0.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList21 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList2 = executionEntity0.getTasks();
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity0.getStartingExecution();
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        java.lang.String str8 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
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
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList16 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        int int11 = executionEntity9.getRevisionNext();
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        boolean boolean13 = executionEntity9.isEventScope();
        executionEntity9.setParentId("");
        java.lang.String str17 = executionEntity9.updateProcessBusinessKey("");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        int int19 = executionEntity9.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList20 = executionEntity9.getTasks();
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        int int11 = executionEntity0.getRevision();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.getReplacedBy();
        boolean boolean13 = executionEntity0.isScope();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = executionEntity0.getTransition();
        boolean boolean15 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getSuperExecution();
        java.lang.String str4 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity1.getTransitionBeingTaken();
        int int6 = executionEntity1.getRevision();
        java.lang.String str7 = executionEntity1.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.insert();
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setSuspensionState(0);
        boolean boolean8 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        java.lang.String str11 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList12 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.inactivate();
        java.lang.Object obj8 = executionEntity0.getPersistentState();
        executionEntity0.setProcessDefinitionId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity8.setDeleteReason("");
        boolean boolean13 = executionEntity8.isConcurrent();
        java.lang.String str14 = executionEntity8.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = executionEntity8.findActiveActivityIds();
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str6 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity7.getCompensateEventSubscriptions();
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        java.lang.String str5 = executionEntity0.getCurrentActivityName();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.addIdentityLink("hi!", "ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        int int11 = executionEntity0.getRevision();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.getReplacedBy();
        boolean boolean13 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        executionEntity0.setDeleteReason("hi!");
        executionEntity0.setSuspensionState((int) 'a');
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity15 = executionEntity12.involveUser("ProcessInstance[ScopeExecution[null]]", "ScopeExecution[null]");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        java.lang.Object obj6 = executionEntity1.getPersistentState();
        boolean boolean7 = executionEntity1.isScope();
        executionEntity1.setRevision(7);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution10 = executionEntity1.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.end();
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setTenantId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj9 = executionEntity8.getPersistentState();
        executionEntity8.setScope(true);
        int int12 = executionEntity8.getCachedEntityState();
        java.lang.String str13 = executionEntity8.toString();
        java.lang.Integer int14 = executionEntity8.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity8.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity8.getParent();
        executionEntity0.setSuperExecution(executionEntity8);
        executionEntity8.setRevision((int) ' ');
        java.lang.String str20 = executionEntity8.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity23 = executionEntity8.addIdentityLink("ProcessInstance[ScopeExecution[null]]", "ScopeExecution[null]");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setName("hi!");
        java.lang.String str6 = executionEntity0.toString();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution2 = executionEntity0.getStartingExecution();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str6 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.inactivate();
        java.lang.String str8 = executionEntity0.getDeleteReason();
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity8.end();
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList5 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        java.util.List<java.lang.String> strList2 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity6.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        executionEntity6.setBusinessKey("");
        java.lang.Integer int11 = executionEntity6.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity6.getReplacedBy();
        boolean boolean13 = executionEntity6.isEventScope();
        int int14 = executionEntity6.getSuspensionState();
        int int15 = executionEntity6.getCachedEntityState();
        executionEntity6.setTenantId("ProcessInstance[ScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userTaskActivityBehavior0.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity6);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        executionEntity1.setScope(false);
        executionEntity1.setParentId("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        boolean boolean12 = executionEntity9.isConcurrent();
        executionEntity9.setEventScope(true);
        executionEntity9.setTenantId("");
        executionEntity9.setBusinessKey("ScopeExecution[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = executionEntity9.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList21 = executionEntity1.getCompensateEventSubscriptions();
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity8.setDeleteReason("");
        java.lang.String str13 = executionEntity8.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity8.destroyScope("");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity8 = executionEntity1.addIdentityLink("", "ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity5.setBusinessKey("");
        java.lang.Integer int10 = executionEntity5.getExecutionListenerIndex();
        executionEntity5.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement17 = executionEntity0.getEventSource();
        java.lang.String str18 = executionEntity0.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = executionEntity0.getTransitionBeingTaken();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement20 = executionEntity0.getEventSource();
        executionEntity0.setEventScope(false);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl23 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList24 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity0.getCompensateEventSubscriptions("hi!");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        executionEntity0.setProcessDefinitionId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.findExecution("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        int int12 = executionEntity10.getRevisionNext();
        executionEntity0.setSuperExecution(executionEntity10);
        java.lang.Integer int14 = executionEntity10.getExecutionListenerIndex();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity10.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList16 = executionEntity10.findActiveActivityIds();
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity6 = executionEntity1.involveUser("ProcessInstance[ScopeExecution[null]]", "");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity5.setBusinessKey("");
        java.lang.Integer int10 = executionEntity5.getExecutionListenerIndex();
        executionEntity5.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement17 = executionEntity0.getEventSource();
        executionEntity0.setRevision((-1));
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
        boolean boolean23 = executionEntity20.isConcurrent();
        executionEntity20.setEventScope(true);
        executionEntity20.setTenantId("");
        executionEntity20.setBusinessKey("ScopeExecution[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = executionEntity20.getProcessVariables();
        java.lang.Integer int31 = executionEntity20.getExecutionListenerIndex();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
        int int33 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str35 = executionEntity0.updateProcessBusinessKey("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        boolean boolean11 = executionEntity0.isEventScope();
        executionEntity0.setEventName("");
        org.activiti.engine.EngineServices engineServices14 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        java.lang.String str8 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("");
        java.lang.String str10 = executionEntity1.getCurrentActivityId();
        java.lang.Integer int11 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str13 = executionEntity1.updateProcessBusinessKey("ScopeExecution[null]");
        executionEntity1.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        int int18 = executionEntity16.getRevisionNext();
        org.activiti.engine.EngineServices engineServices19 = executionEntity16.getEngineServices();
        executionEntity16.setScope(false);
        executionEntity16.setParentId("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity24.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity25);
        boolean boolean27 = executionEntity24.isConcurrent();
        executionEntity24.setEventScope(true);
        executionEntity24.setTenantId("");
        executionEntity24.setBusinessKey("ScopeExecution[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = executionEntity24.getProcessVariables();
        executionEntity16.setVariablesLocal(strMap34);
        executionEntity1.setVariablesLocal(strMap34);
        java.lang.Integer int37 = executionEntity1.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity40 = executionEntity1.involveUser("ScopeExecution[null]", "");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        int int18 = executionEntity16.getRevisionNext();
        org.activiti.engine.EngineServices engineServices19 = executionEntity16.getEngineServices();
        boolean boolean20 = executionEntity16.isEventScope();
        executionEntity16.setParentId("");
        java.lang.String str24 = executionEntity16.updateProcessBusinessKey("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity25.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity26);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl28 = executionEntity26.getTransition();
        executionEntity16.setSuperExecution(executionEntity26);
        executionEntity26.setBusinessKey("ScopeExecution[null]");
        executionEntity26.setSuspensionState((int) '4');
        executionEntity26.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("", (java.lang.Object) executionEntity26);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.String str5 = executionEntity0.getEventName();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        executionEntity0.setConcurrent(false);
        java.lang.String str9 = executionEntity0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        org.activiti.engine.EngineServices engineServices6 = executionEntity0.getEngineServices();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList8 = executionEntity0.getExecutions();
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str8 = executionEntity5.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity5.getProcessVariables();
        boolean boolean10 = executionEntity5.isProcessInstanceType();
        executionEntity5.disposeStartingExecution();
        java.lang.String str12 = executionEntity5.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        java.lang.String str16 = executionEntity13.getProcessInstanceId();
        int int17 = executionEntity13.getRevision();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray18 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList19 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList19, variableInstanceEntityArray18);
        executionEntity13.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList19);
        executionEntity5.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList19);
        int int23 = executionEntity5.getRevisionNext();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setName("hi!");
        executionEntity5.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity5.deleteCascade("");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement9 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity6.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        executionEntity6.setBusinessKey("");
        java.lang.Integer int11 = executionEntity6.getExecutionListenerIndex();
        executionEntity6.forceUpdate();
        boolean boolean13 = executionEntity6.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity14.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        int int17 = executionEntity15.getRevisionNext();
        org.activiti.engine.EngineServices engineServices18 = executionEntity15.getEngineServices();
        boolean boolean19 = executionEntity15.isEventScope();
        executionEntity15.setParentId("");
        java.lang.String str23 = executionEntity15.updateProcessBusinessKey("");
        executionEntity6.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        boolean boolean25 = executionEntity6.isSuspended();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity6.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity6.initialize();
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        java.lang.String str5 = executionEntity0.getActivityId();
        java.lang.String str6 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.createExecution();
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("");
        java.lang.String str10 = executionEntity1.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList13 = executionEntity1.getCompensateEventSubscriptions("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        executionEntity1.disposeStartingExecution();
        boolean boolean9 = executionEntity1.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = executionEntity11.getTransition();
        java.lang.Integer int14 = executionEntity11.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        boolean boolean11 = executionEntity0.isEventScope();
        executionEntity0.setEventName("");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str16 = executionEntity0.getProcessDefinitionId();
        java.lang.String str17 = executionEntity0.getActivityId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = executionEntity0.updateProcessBusinessKey("ScopeExecution[null]");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        java.lang.String str7 = executionEntity0.toString();
        java.lang.String str8 = executionEntity0.getParentId();
        executionEntity0.setName("ProcessInstance[ScopeExecution[null]]");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str6 = executionEntity0.getId();
        boolean boolean7 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList8 = executionEntity0.getExecutions();
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        boolean boolean6 = executionEntity0.isEventScope();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement10 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        executionEntity0.setDeleteReason("hi!");
        executionEntity0.setSuspensionState((int) 'a');
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = executionEntity12.getProcessBusinessKey();
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.setConcurrent(true);
        java.lang.String str7 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.String str5 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setTenantId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj9 = executionEntity8.getPersistentState();
        executionEntity8.setScope(true);
        int int12 = executionEntity8.getCachedEntityState();
        java.lang.String str13 = executionEntity8.toString();
        java.lang.Integer int14 = executionEntity8.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity8.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity8.getParent();
        executionEntity0.setSuperExecution(executionEntity8);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement18 = executionEntity8.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList19 = executionEntity8.getIdentityLinks();
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        java.lang.String str7 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.lang.String str11 = executionEntity8.getProcessInstanceId();
        int int12 = executionEntity8.getRevision();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray13 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList14 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList14, variableInstanceEntityArray13);
        executionEntity8.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList14);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList14);
        int int18 = executionEntity0.getRevisionNext();
        java.lang.String str19 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean21 = executionEntity0.isActive("hi!");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution5 = executionEntity1.getStartingExecution();
        java.lang.String str6 = executionEntity1.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.deleteCascade("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution5 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        executionEntity0.setDeleteReason("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getProcessInstance();
        org.activiti.engine.impl.javax.el.ELContext eLContext11 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList12 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        boolean boolean7 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.findExecution("ScopeExecution[null]");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution2 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList3 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setId("");
        boolean boolean4 = executionEntity0.isEnded();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution5 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setEventName("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity0.setRevision((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.findExecution("hi!");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        int int12 = executionEntity10.getRevisionNext();
        executionEntity0.setSuperExecution(executionEntity10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity14.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        java.lang.String str17 = executionEntity14.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = executionEntity14.getProcessVariables();
        executionEntity0.createVariablesLocal(strMap18);
        int int20 = executionEntity0.getRevision();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList21 = executionEntity0.getQueryVariables();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList23 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        executionEntity0.setSuspensionState((int) (byte) 100);
        org.activiti.engine.EngineServices engineServices7 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.addIdentityLink("hi!", "hi!");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        java.lang.String str5 = executionEntity0.getCurrentActivityName();
        java.lang.String str6 = executionEntity0.getCurrentActivityName();
        executionEntity0.setName("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = executionEntity0.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity5.setBusinessKey("");
        java.lang.Integer int10 = executionEntity5.getExecutionListenerIndex();
        executionEntity5.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement17 = executionEntity0.getEventSource();
        java.lang.String str18 = executionEntity0.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = executionEntity0.getTransitionBeingTaken();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement20 = executionEntity0.getEventSource();
        executionEntity0.setEventScope(false);
        executionEntity0.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList25 = executionEntity0.getJobs();
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
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
        executionEntity11.setBusinessKey("ScopeExecution[null]");
        executionEntity11.setSuspensionState((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList19 = executionEntity11.getIdentityLinks();
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        int int11 = executionEntity0.getRevision();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.getReplacedBy();
        boolean boolean13 = executionEntity0.isScope();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = executionEntity0.getTransition();
        boolean boolean15 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity0.findExecution("hi!");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = executionEntity0.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        java.lang.String str8 = executionEntity0.getParentId();
        boolean boolean9 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        org.activiti.engine.EngineServices engineServices6 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        executionEntity0.setName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("hi!");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("");
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray10 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList11 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList11, variableInstanceEntityArray10);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList11);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution14 = executionEntity1.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity1.createExecution();
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        int int12 = executionEntity10.getRevisionNext();
        executionEntity0.setSuperExecution(executionEntity10);
        java.lang.Integer int14 = executionEntity10.getExecutionListenerIndex();
        org.activiti.engine.impl.javax.el.ELContext eLContext15 = executionEntity10.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity10.destroyScope("ProcessInstance[null]");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        boolean boolean5 = executionEntity0.isDeleteRoot();
        java.lang.String str6 = executionEntity0.getName();
        executionEntity0.setEventName("");
        executionEntity0.setProcessDefinitionId("ProcessInstance[ScopeExecution[null]]");
        java.lang.String str11 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList12 = executionEntity0.getExecutions();
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str7 = executionEntity0.getEventName();
        boolean boolean8 = executionEntity0.isEventScope();
        int int9 = executionEntity0.getRevisionNext();
        java.lang.String str10 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList11 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str9 = executionEntity0.getEventName();
        boolean boolean10 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        java.lang.String str8 = executionEntity0.getActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        executionEntity9.setBusinessKey("");
        java.lang.Integer int14 = executionEntity9.getExecutionListenerIndex();
        executionEntity9.forceUpdate();
        executionEntity9.setTenantId("ScopeExecution[null]");
        executionEntity9.setEventScope(true);
        java.lang.String str20 = executionEntity9.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity9.getParent();
        executionEntity9.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        boolean boolean24 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList25 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = executionEntity0.getProcessVariables();
        java.lang.String str2 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setRevision(1);
        boolean boolean5 = executionEntity0.isEnded();
        org.activiti.engine.EngineServices engineServices6 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setProcessDefinitionId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.forceUpdate();
        executionEntity0.setRevision((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity0.findExecution("ScopeExecution[null]");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        int int11 = executionEntity9.getRevisionNext();
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        boolean boolean13 = executionEntity9.isEventScope();
        executionEntity9.setParentId("");
        java.lang.String str17 = executionEntity9.updateProcessBusinessKey("");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.lang.String str19 = executionEntity0.toString();
        executionEntity0.setRevision((int) (byte) -1);
        java.lang.String str22 = executionEntity0.getCurrentActivityName();
        boolean boolean23 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity5.setBusinessKey("");
        java.lang.Integer int10 = executionEntity5.getExecutionListenerIndex();
        executionEntity5.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        boolean boolean17 = executionEntity5.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity18.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        int int21 = executionEntity19.getRevisionNext();
        org.activiti.engine.EngineServices engineServices22 = executionEntity19.getEngineServices();
        boolean boolean23 = executionEntity19.isEventScope();
        executionEntity19.setParentId("");
        java.lang.String str27 = executionEntity19.updateProcessBusinessKey("");
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = executionEntity19.getParent();
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity0.getActivity();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj10 = executionEntity9.getPersistentState();
        executionEntity9.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = executionEntity9.getEventSource();
        java.lang.String str14 = executionEntity9.getActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity9.getTransitionBeingTaken();
        java.lang.String str16 = executionEntity9.getEventName();
        boolean boolean17 = executionEntity9.isEventScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        int int11 = executionEntity9.getRevisionNext();
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        boolean boolean13 = executionEntity9.isEventScope();
        executionEntity9.setParentId("");
        java.lang.String str17 = executionEntity9.updateProcessBusinessKey("");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        int int19 = executionEntity9.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList20 = executionEntity9.getIdentityLinks();
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        int int11 = executionEntity9.getRevisionNext();
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        boolean boolean13 = executionEntity9.isEventScope();
        executionEntity9.setParentId("");
        java.lang.String str17 = executionEntity9.updateProcessBusinessKey("");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.lang.String str19 = executionEntity0.toString();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList20 = executionEntity0.getQueryVariables();
        boolean boolean21 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList22 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
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
        java.lang.String str11 = executionEntity0.getTenantId();
        executionEntity0.setRevision(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        boolean boolean11 = executionEntity0.isEventScope();
        executionEntity0.setEventName("");
        java.lang.String str14 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        int int11 = executionEntity9.getRevisionNext();
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        boolean boolean13 = executionEntity9.isEventScope();
        executionEntity9.setParentId("");
        java.lang.String str17 = executionEntity9.updateProcessBusinessKey("");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity0.createExecution();
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity3 = executionEntity0.addIdentityLink("hi!", "ProcessInstance[null]");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        executionEntity1.disposeStartingExecution();
        boolean boolean9 = executionEntity1.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.insert();
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.setConcurrent(true);
        java.lang.String str7 = executionEntity0.getId();
        java.lang.String str8 = executionEntity0.getSuperExecutionId();
        java.lang.String str9 = executionEntity0.getTenantId();
        executionEntity0.setId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("hi!");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        int int11 = executionEntity9.getRevisionNext();
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        boolean boolean13 = executionEntity9.isEventScope();
        executionEntity9.setParentId("");
        java.lang.String str17 = executionEntity9.updateProcessBusinessKey("");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.lang.String str19 = executionEntity0.toString();
        boolean boolean20 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        int int11 = executionEntity9.getRevisionNext();
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        boolean boolean13 = executionEntity9.isEventScope();
        executionEntity9.setParentId("");
        java.lang.String str17 = executionEntity9.updateProcessBusinessKey("");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity9.getParent();
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        executionEntity1.setScope(false);
        int int7 = executionEntity1.getRevision();
        boolean boolean8 = executionEntity1.isScope();
        executionEntity1.setBusinessKey("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList11 = executionEntity1.getTasks();
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray5 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList6, variableInstanceEntityArray5);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList6);
        boolean boolean9 = executionEntity0.isScope();
        executionEntity0.setName("hi!");
        boolean boolean12 = executionEntity0.isScope();
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.inactivate();
        java.lang.Object obj8 = executionEntity0.getPersistentState();
        java.lang.String str9 = executionEntity0.getBusinessKey();
        executionEntity0.setScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity12.setBusinessKey("");
        java.lang.Integer int17 = executionEntity12.getExecutionListenerIndex();
        executionEntity12.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity19.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
        executionEntity12.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        int int11 = executionEntity0.getRevision();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.getReplacedBy();
        executionEntity0.forceUpdate();
        java.lang.Integer int14 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str15 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList17 = executionEntity0.getCompensateEventSubscriptions("");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("");
        java.lang.String str10 = executionEntity1.getCurrentActivityId();
        java.lang.Integer int11 = executionEntity1.getExecutionListenerIndex();
        executionEntity1.setScope(true);
        java.lang.String str14 = executionEntity1.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList16 = executionEntity1.getCompensateEventSubscriptions("");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setScope(false);
        int int8 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        boolean boolean7 = executionEntity0.isEventScope();
        java.lang.String str8 = executionEntity0.getParentId();
        java.lang.String str9 = executionEntity0.getCurrentActivityId();
        java.lang.String str10 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity0.getCompensateEventSubscriptions("");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        int int11 = executionEntity9.getRevisionNext();
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        boolean boolean13 = executionEntity9.isEventScope();
        executionEntity9.setParentId("");
        java.lang.String str17 = executionEntity9.updateProcessBusinessKey("");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.lang.String str19 = executionEntity0.toString();
        executionEntity0.setRevision((int) (byte) -1);
        java.lang.String str22 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList23 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getParent();
        boolean boolean9 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList10 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        boolean boolean7 = executionEntity0.isScope();
        boolean boolean8 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions("ScopeExecution[null]");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity0.getActivity();
        java.lang.String str8 = executionEntity0.getName();
        java.lang.String str9 = executionEntity0.getName();
        java.lang.String str10 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList11 = executionEntity0.getJobs();
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        java.lang.String str8 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity0.getTransitionBeingTaken();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getSuperExecution();
        boolean boolean11 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity5.setBusinessKey("");
        java.lang.Integer int10 = executionEntity5.getExecutionListenerIndex();
        executionEntity5.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement17 = executionEntity0.getEventSource();
        executionEntity0.setRevision((-1));
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
        boolean boolean23 = executionEntity20.isConcurrent();
        executionEntity20.setEventScope(true);
        executionEntity20.setTenantId("");
        executionEntity20.setBusinessKey("ScopeExecution[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = executionEntity20.getProcessVariables();
        java.lang.Integer int31 = executionEntity20.getExecutionListenerIndex();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList33 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = executionEntity0.findExecution("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        java.lang.String str11 = executionEntity0.getName();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity0.getParent();
        java.lang.String str16 = executionEntity15.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList17 = executionEntity15.getEventSubscriptions();
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.insert();
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        int int11 = executionEntity9.getRevisionNext();
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        boolean boolean13 = executionEntity9.isEventScope();
        executionEntity9.setParentId("");
        java.lang.String str17 = executionEntity9.updateProcessBusinessKey("");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        boolean boolean19 = executionEntity0.isSuspended();
        boolean boolean20 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList21 = executionEntity0.getTasks();
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity6.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        executionEntity6.setBusinessKey("");
        java.lang.Integer int11 = executionEntity6.getExecutionListenerIndex();
        executionEntity6.forceUpdate();
        boolean boolean13 = executionEntity6.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity14.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        int int17 = executionEntity15.getRevisionNext();
        org.activiti.engine.EngineServices engineServices18 = executionEntity15.getEngineServices();
        boolean boolean19 = executionEntity15.isEventScope();
        executionEntity15.setParentId("");
        java.lang.String str23 = executionEntity15.updateProcessBusinessKey("");
        executionEntity6.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        boolean boolean25 = executionEntity6.isSuspended();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList27 = executionEntity6.findActiveActivityIds();
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setTenantId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj9 = executionEntity8.getPersistentState();
        executionEntity8.setScope(true);
        int int12 = executionEntity8.getCachedEntityState();
        java.lang.String str13 = executionEntity8.toString();
        java.lang.Integer int14 = executionEntity8.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity8.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity8.getParent();
        executionEntity0.setSuperExecution(executionEntity8);
        executionEntity8.setRevision((int) ' ');
        java.lang.String str20 = executionEntity8.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList21 = executionEntity8.getEventSubscriptionsInternal();
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str9 = executionEntity0.getEventName();
        boolean boolean10 = executionEntity0.isProcessInstanceType();
        boolean boolean11 = executionEntity0.isEnded();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.getParent();
        int int13 = executionEntity12.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = executionEntity12.isActive("");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        boolean boolean6 = executionEntity3.isConcurrent();
        java.lang.String str7 = executionEntity3.getId();
        executionEntity0.setSuperExecution(executionEntity3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList9 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.inactivate();
        int int8 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str6 = executionEntity0.getId();
        boolean boolean7 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.updateProcessBusinessKey("");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement7 = executionEntity0.getEventSource();
        java.lang.String str8 = executionEntity0.getParentId();
        boolean boolean9 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.createExecution();
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        executionEntity0.setDeleteReason("hi!");
        executionEntity0.setSuspensionState((int) 'a');
        org.activiti.engine.EngineServices engineServices12 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = executionEntity0.updateProcessBusinessKey("");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        boolean boolean7 = executionEntity0.isConcurrent();
        executionEntity0.setBusinessKey("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        executionEntity0.setConcurrent(true);
        executionEntity0.setName("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getSuperExecution();
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity5.setBusinessKey("");
        java.lang.Integer int10 = executionEntity5.getExecutionListenerIndex();
        executionEntity5.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = executionEntity5.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = executionEntity5.isActive("hi!");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        int int11 = executionEntity0.getRevision();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.getReplacedBy();
        boolean boolean13 = executionEntity0.isScope();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = executionEntity0.getTransition();
        boolean boolean15 = executionEntity0.isEnded();
        java.lang.String str16 = executionEntity0.getBusinessKey();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity20 = executionEntity0.involveUser("", "");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        executionEntity0.setConcurrent(true);
        org.activiti.engine.EngineServices engineServices10 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        java.lang.String str11 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.getParent();
        boolean boolean13 = executionEntity0.isScope();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList16 = executionEntity0.getJobs();
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        java.lang.String str8 = executionEntity0.getActivityId();
        java.lang.String str9 = executionEntity0.getTenantId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getSuperExecution();
        int int11 = executionEntity0.getRevision();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuspensionState((int) (byte) 1);
        executionEntity0.setName("ProcessInstance[ScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList5 = executionEntity0.getExecutions();
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.findExecution("");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        java.lang.String str7 = executionEntity0.toString();
        java.lang.String str8 = executionEntity0.getParentId();
        java.lang.Integer int9 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str10 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        boolean boolean5 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.findExecution("ProcessInstance[null]");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        executionEntity1.setScope(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity1.getProcessVariables();
        java.lang.String str8 = executionEntity1.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.insert();
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        executionEntity0.setRevision((int) '#');
        executionEntity0.setName("ProcessInstance[ScopeExecution[null]]");
        executionEntity0.setSuspensionState((int) (short) 100);
        boolean boolean12 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        java.util.List<java.lang.String> strList2 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        int int8 = executionEntity6.getRevisionNext();
        org.activiti.engine.EngineServices engineServices9 = executionEntity6.getEngineServices();
        boolean boolean10 = executionEntity6.isEventScope();
        executionEntity6.setParentId("");
        java.lang.String str14 = executionEntity6.updateProcessBusinessKey("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl18 = executionEntity16.getTransition();
        executionEntity6.setSuperExecution(executionEntity16);
        executionEntity16.setBusinessKey("ScopeExecution[null]");
        executionEntity16.setSuspensionState((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userTaskActivityBehavior0.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity16);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setTenantId("ScopeExecution[null]");
        java.lang.String str11 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext12 = executionEntity0.getCachedElContext();
        boolean boolean13 = executionEntity0.isProcessInstanceType();
        java.lang.String str14 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        int int11 = executionEntity0.getRevision();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.getReplacedBy();
        executionEntity0.forceUpdate();
        executionEntity0.setCachedEntityState((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        executionEntity0.setName("hi!");
        java.lang.String str13 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        executionEntity0.setEventName("");
        int int9 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.findExecution("ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity5.setBusinessKey("");
        java.lang.Integer int10 = executionEntity5.getExecutionListenerIndex();
        executionEntity5.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement17 = executionEntity0.getEventSource();
        java.lang.String str18 = executionEntity0.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList20 = executionEntity0.getTasks();
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity5.setBusinessKey("");
        java.lang.Integer int10 = executionEntity5.getExecutionListenerIndex();
        executionEntity5.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement17 = executionEntity0.getEventSource();
        executionEntity0.setParentId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList20 = executionEntity0.getExecutions();
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        java.lang.String str8 = executionEntity0.getCurrentActivityName();
        executionEntity0.setActive(true);
        executionEntity0.setEventName("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj14 = executionEntity13.getPersistentState();
        executionEntity13.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = executionEntity13.getTransitionBeingTaken();
        java.lang.String str18 = executionEntity13.getDeleteReason();
        org.activiti.engine.impl.javax.el.ELContext eLContext19 = executionEntity13.getCachedElContext();
        executionEntity13.setProcessDefinitionId("ProcessInstance[ScopeExecution[null]]");
        executionEntity0.setSuperExecution(executionEntity13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity0.getActivity();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj10 = executionEntity9.getPersistentState();
        executionEntity9.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = executionEntity9.getEventSource();
        java.lang.String str14 = executionEntity9.getActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity9.getTransitionBeingTaken();
        java.lang.String str16 = executionEntity9.getEventName();
        boolean boolean17 = executionEntity9.isEventScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity9.destroyScope("ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str7 = executionEntity0.getEventName();
        boolean boolean8 = executionEntity0.isEventScope();
        int int9 = executionEntity0.getRevisionNext();
        java.lang.String str10 = executionEntity0.getEventName();
        int int11 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str5 = executionEntity0.getDeleteReason();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.setProcessDefinitionId("ProcessInstance[ScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ScopeExecution[null]");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isEventScope();
        executionEntity0.setCachedEntityState((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList4 = executionEntity0.getExecutions();
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        boolean boolean6 = executionEntity0.isEventScope();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity0.getProcessVariables();
        boolean boolean10 = executionEntity0.isEnded();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList12 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
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
        executionEntity11.setBusinessKey("ScopeExecution[null]");
        java.lang.String str17 = executionEntity11.getEventName();
        org.activiti.engine.EngineServices engineServices18 = executionEntity11.getEngineServices();
        java.lang.String str19 = executionEntity11.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity11.findExecution("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity5.setBusinessKey("");
        java.lang.Integer int10 = executionEntity5.getExecutionListenerIndex();
        executionEntity5.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        boolean boolean17 = executionEntity5.isProcessInstanceType();
        java.lang.Object obj18 = executionEntity5.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity5.start();
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str6 = executionEntity0.getParentId();
        java.lang.String str7 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.createExecution();
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        java.lang.String str5 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 2);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity8.deleteCascade("ScopeExecution[null]");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        executionEntity0.setEventName("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        java.lang.String str11 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.getParent();
        boolean boolean13 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getSuspensionState();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = executionEntity0.isActive("");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str5 = executionEntity0.getDeleteReason();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.setProcessDefinitionId("ProcessInstance[ScopeExecution[null]]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = executionEntity0.updateProcessBusinessKey("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        boolean boolean7 = executionEntity0.isActive();
        executionEntity0.setSuspensionState((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        java.lang.String str7 = executionEntity0.toString();
        java.lang.String str8 = executionEntity0.getParentId();
        executionEntity0.setName("ProcessInstance[ScopeExecution[null]]");
        org.activiti.engine.impl.javax.el.ELContext eLContext11 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        int int12 = executionEntity10.getRevisionNext();
        executionEntity0.setSuperExecution(executionEntity10);
        java.lang.Integer int14 = executionEntity10.getExecutionListenerIndex();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity10.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity10.end();
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getActivityId();
        java.lang.String str6 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity1.getProcessVariables();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = executionEntity1.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.destroyScope("");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setProcessDefinitionId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList11 = executionEntity0.getCompensateEventSubscriptions("");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        java.lang.Object obj6 = executionEntity1.getPersistentState();
        boolean boolean7 = executionEntity1.isScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = executionEntity1.getActivity();
        executionEntity1.setDeleteReason("ProcessInstance[ScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.initialize();
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
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
        java.lang.String str12 = executionEntity0.toString();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl13 = executionEntity0.getProcessDefinition();
        int int14 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity17 = executionEntity0.involveUser("ProcessInstance[ProcessInstance[ScopeExecution[null]]]", "ScopeExecution[null]");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.inactivate();
        int int8 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        executionEntity1.setScope(false);
        int int7 = executionEntity1.getRevision();
        boolean boolean8 = executionEntity1.isScope();
        executionEntity1.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = executionEntity1.isActive("ScopeExecution[null]");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        executionEntity0.setDeleteReason("hi!");
        executionEntity0.setSuspensionState((int) 'a');
        org.activiti.engine.EngineServices engineServices12 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList13 = executionEntity0.getExecutions();
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setScope(false);
        java.lang.String str8 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        java.lang.String str8 = executionEntity0.getActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        executionEntity9.setBusinessKey("");
        java.lang.Integer int14 = executionEntity9.getExecutionListenerIndex();
        executionEntity9.forceUpdate();
        executionEntity9.setTenantId("ScopeExecution[null]");
        executionEntity9.setEventScope(true);
        java.lang.String str20 = executionEntity9.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity9.getParent();
        executionEntity9.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean25 = executionEntity9.isActive("ProcessInstance[null]");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        executionEntity1.setScope(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity1.getStartingExecution();
        int int9 = executionEntity1.getSuspensionState();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        int int12 = executionEntity1.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.start();
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        boolean boolean7 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        boolean boolean11 = executionEntity0.isEventScope();
        executionEntity0.setEventName("");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str16 = executionEntity0.getProcessDefinitionId();
        java.lang.String str17 = executionEntity0.getActivityId();
        boolean boolean18 = executionEntity0.isScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList19 = executionEntity0.getQueryVariables();
        executionEntity0.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        int int11 = executionEntity9.getRevisionNext();
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        boolean boolean13 = executionEntity9.isEventScope();
        executionEntity9.setParentId("");
        java.lang.String str17 = executionEntity9.updateProcessBusinessKey("");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.lang.String str19 = executionEntity0.toString();
        executionEntity0.setRevision(97);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = executionEntity0.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        executionEntity0.setDeleteReason("hi!");
        executionEntity0.setSuspensionState((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setScope(false);
        executionEntity0.forceUpdate();
        java.lang.String str9 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity12 = executionEntity0.addIdentityLink("ProcessInstance[ProcessInstance[ScopeExecution[null]]]", "ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setEventName("ScopeExecution[null]");
        executionEntity0.setId("ProcessInstance[ScopeExecution[null]]");
        boolean boolean9 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = executionEntity0.isActive("");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        boolean boolean11 = executionEntity0.isEventScope();
        executionEntity0.setEventName("");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        executionEntity0.setName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getSuperExecution();
        java.lang.String str4 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity1.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList6 = executionEntity1.findActiveActivityIds();
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = executionEntity0.getProcessVariables();
        java.lang.String str2 = executionEntity0.getProcessDefinitionId();
        java.lang.String str3 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setCachedEntityState((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.findExecution("ScopeExecution[]");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList3 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        java.lang.String str8 = executionEntity0.getActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        executionEntity9.setBusinessKey("");
        java.lang.Integer int14 = executionEntity9.getExecutionListenerIndex();
        executionEntity9.forceUpdate();
        executionEntity9.setTenantId("ScopeExecution[null]");
        executionEntity9.setEventScope(true);
        java.lang.String str20 = executionEntity9.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity9.getParent();
        executionEntity9.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        executionEntity0.setConcurrent(false);
        java.lang.String str26 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity29 = executionEntity0.addIdentityLink("ScopeExecution[null]", "");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        java.lang.String str8 = executionEntity0.getActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        executionEntity9.setBusinessKey("");
        java.lang.Integer int14 = executionEntity9.getExecutionListenerIndex();
        executionEntity9.forceUpdate();
        executionEntity9.setTenantId("ScopeExecution[null]");
        executionEntity9.setEventScope(true);
        java.lang.String str20 = executionEntity9.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity9.getParent();
        executionEntity9.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        executionEntity9.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean27 = executionEntity9.isActive("ScopeExecution[null]");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        int int12 = executionEntity10.getRevisionNext();
        executionEntity0.setSuperExecution(executionEntity10);
        java.lang.Integer int14 = executionEntity10.getExecutionListenerIndex();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity10.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList16 = executionEntity10.getEventSubscriptions();
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.javax.el.ELContext eLContext8 = executionEntity0.getCachedElContext();
        java.lang.String str9 = executionEntity0.toString();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution10 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.inactivate();
        int int8 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity0.getActivity();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity0.getCachedElContext();
        boolean boolean10 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList11 = executionEntity0.getJobs();
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setName("hi!");
        boolean boolean6 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setRevision((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList4 = executionEntity0.getExecutions();
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        int int12 = executionEntity10.getRevisionNext();
        executionEntity0.setSuperExecution(executionEntity10);
        java.lang.Integer int14 = executionEntity10.getExecutionListenerIndex();
        boolean boolean15 = executionEntity10.isEnded();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = executionEntity10.getProcessVariables();
        boolean boolean17 = executionEntity10.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity20 = executionEntity10.involveUser("ProcessInstance[null]", "ScopeExecution[]");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.String str6 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList8 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity5.setBusinessKey("");
        java.lang.Integer int10 = executionEntity5.getExecutionListenerIndex();
        executionEntity5.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = executionEntity5.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity20 = executionEntity5.addIdentityLink("", "ScopeExecution[null]");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray5 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList6, variableInstanceEntityArray5);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList6);
        java.lang.String str9 = executionEntity0.getParentId();
        executionEntity0.setBusinessKey("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity14 = executionEntity0.addIdentityLink("ScopeExecution[null]", "ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
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
        executionEntity11.setBusinessKey("ScopeExecution[null]");
        java.lang.String str17 = executionEntity11.getEventName();
        org.activiti.engine.EngineServices engineServices18 = executionEntity11.getEngineServices();
        java.lang.String str19 = executionEntity11.getActivityId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList20 = executionEntity11.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity11.initialize();
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setEventScope(true);
        executionEntity0.setActive(true);
        boolean boolean7 = executionEntity0.isScope();
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        executionEntity0.setDeleteReason("hi!");
        executionEntity0.setSuspensionState((int) 'a');
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = executionEntity0.getProcessVariables();
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement9 = executionEntity0.getEventSource();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = executionEntity0.getTransition();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList11 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.createExecution();
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        executionEntity1.setScope(false);
        int int7 = executionEntity1.getRevision();
        boolean boolean8 = executionEntity1.isScope();
        executionEntity1.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity13 = executionEntity1.addIdentityLink("ScopeExecution[]", "ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        boolean boolean6 = executionEntity3.isConcurrent();
        java.lang.String str7 = executionEntity3.getId();
        executionEntity0.setSuperExecution(executionEntity3);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution9 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.findExecution("ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setName("hi!");
        boolean boolean6 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList7 = executionEntity0.getJobs();
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        boolean boolean11 = executionEntity0.isEventScope();
        executionEntity0.setEventName("");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str16 = executionEntity0.getProcessDefinitionId();
        boolean boolean17 = executionEntity0.isActive();
        boolean boolean18 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        boolean boolean5 = executionEntity0.isConcurrent();
        boolean boolean6 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList7 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity8 = executionEntity0.involveUser("ScopeExecution[null]", "hi!");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        java.lang.String str8 = executionEntity0.getCurrentActivityName();
        executionEntity0.setActive(true);
        boolean boolean11 = executionEntity0.isActive();
        int int12 = executionEntity0.getRevision();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj14 = executionEntity13.getPersistentState();
        executionEntity13.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = executionEntity13.getTransitionBeingTaken();
        executionEntity13.setEventScope(true);
        int int20 = executionEntity13.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity13.getReplacedBy();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement22 = executionEntity13.getEventSource();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = executionEntity13.getProcessBusinessKey();
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getSuperExecution();
        java.lang.String str3 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList4 = executionEntity0.getExecutions();
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray5 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList6, variableInstanceEntityArray5);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList6);
        java.lang.String str9 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList10 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        java.lang.String str8 = executionEntity0.getCurrentActivityName();
        executionEntity0.setActive(true);
        boolean boolean11 = executionEntity0.isActive();
        int int12 = executionEntity0.getRevision();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj14 = executionEntity13.getPersistentState();
        executionEntity13.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = executionEntity13.getTransitionBeingTaken();
        executionEntity13.setEventScope(true);
        int int20 = executionEntity13.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity13.getReplacedBy();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement22 = executionEntity13.getEventSource();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.createExecution();
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        java.lang.String str11 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        boolean boolean5 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList6 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.String str4 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.start();
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        int int12 = executionEntity10.getRevisionNext();
        executionEntity0.setSuperExecution(executionEntity10);
        java.lang.Integer int14 = executionEntity10.getExecutionListenerIndex();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity10.getTransitionBeingTaken();
        executionEntity10.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList17 = executionEntity10.getEventSubscriptions();
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        boolean boolean5 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.findExecution("ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        int int12 = executionEntity10.getRevisionNext();
        executionEntity0.setSuperExecution(executionEntity10);
        java.lang.Integer int14 = executionEntity10.getExecutionListenerIndex();
        boolean boolean15 = executionEntity10.isEnded();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = executionEntity10.getProcessVariables();
        int int17 = executionEntity10.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = executionEntity10.getActivity();
        executionEntity10.setBusinessKey("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity10.deleteCascade("ScopeExecution[null]");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity5.getProcessVariables();
        executionEntity0.setVariables(strMap6);
        java.lang.String str8 = executionEntity0.getSuperExecutionId();
        java.lang.String str9 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        executionEntity0.setTenantId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.lang.String str11 = executionEntity8.getProcessDefinitionId();
        executionEntity8.setName("hi!");
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str9 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.createExecution();
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        org.activiti.engine.EngineServices engineServices7 = executionEntity0.getEngineServices();
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.addIdentityLink("", "hi!");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("");
        java.lang.String str10 = executionEntity1.getCurrentActivityId();
        java.lang.Integer int11 = executionEntity1.getExecutionListenerIndex();
        executionEntity1.setProcessDefinitionId("ProcessInstance[ScopeExecution[null]]");
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity1.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity1.createExecution();
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str9 = executionEntity0.getEventName();
        boolean boolean10 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.findExecution("");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution5 = executionEntity1.getStartingExecution();
        java.lang.String str6 = executionEntity1.getBusinessKey();
        java.lang.String str7 = executionEntity1.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.deleteCascade("");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        boolean boolean11 = executionEntity0.isEventScope();
        executionEntity0.setEventName("");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str16 = executionEntity0.getProcessDefinitionId();
        java.lang.String str17 = executionEntity0.getActivityId();
        boolean boolean18 = executionEntity0.isScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList19 = executionEntity0.getQueryVariables();
        executionEntity0.setScope(true);
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ScopeExecution[null]");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str6 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getParent();
        java.lang.Object obj8 = executionEntity0.getPersistentState();
        executionEntity0.setParentId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity13 = executionEntity0.addIdentityLink("ProcessInstance[null]", "");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        executionEntity0.setConcurrent(true);
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.createExecution();
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        boolean boolean7 = executionEntity0.isEventScope();
        int int8 = executionEntity0.getSuspensionState();
        executionEntity0.setBusinessKey("ProcessInstance[ScopeExecution[null]]");
        executionEntity0.setParentId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity0.findExecution("ScopeExecution[]");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransitionBeingTaken();
        boolean boolean9 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity12 = executionEntity0.involveUser("ScopeExecution[]", "ScopeExecution[]");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.setConcurrent(true);
        executionEntity0.setName("hi!");
        executionEntity0.setEventName("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList11 = executionEntity0.getTasks();
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity1.getProcessVariables();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = executionEntity1.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.destroyScope("ProcessInstance[null]");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str9 = executionEntity0.getEventName();
        executionEntity0.setEventName("ProcessInstance[ScopeExecution[null]]");
        java.lang.String str12 = executionEntity0.getProcessDefinitionId();
        java.lang.String str13 = executionEntity0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[null]");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        java.lang.String str5 = executionEntity0.getParentId();
        executionEntity0.setEventName("");
        java.lang.String str8 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList9 = executionEntity0.getExecutions();
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setProcessDefinitionId("hi!");
        boolean boolean8 = executionEntity0.isProcessInstanceType();
        executionEntity0.setDeleteReason("ProcessInstance[ScopeExecution[null]]");
        executionEntity0.setBusinessKey("ProcessInstance[ScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setCachedEntityState(0);
        java.lang.String str5 = executionEntity0.getSuperExecutionId();
        boolean boolean6 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        int int12 = executionEntity10.getRevisionNext();
        executionEntity0.setSuperExecution(executionEntity10);
        java.lang.Integer int14 = executionEntity10.getExecutionListenerIndex();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity10.getTransitionBeingTaken();
        java.lang.String str16 = executionEntity10.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity10.insert();
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity4.setBusinessKey("");
        java.lang.Integer int9 = executionEntity4.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity4.getReplacedBy();
        java.lang.Object obj11 = executionEntity4.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity8.setDeleteReason("");
        boolean boolean13 = executionEntity8.isConcurrent();
        java.lang.String str14 = executionEntity8.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList15 = executionEntity8.getEventSubscriptions();
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str5 = executionEntity0.getDeleteReason();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.setProcessDefinitionId("ProcessInstance[ScopeExecution[null]]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity12 = executionEntity0.involveUser("", "");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setCachedEntityState(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity7 = executionEntity0.addIdentityLink("ScopeExecution[null]", "ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        java.lang.String str7 = executionEntity0.toString();
        java.lang.String str8 = executionEntity0.getParentId();
        java.lang.Integer int9 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) (-1));
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList8 = executionEntity0.getJobs();
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        boolean boolean11 = executionEntity0.isEventScope();
        executionEntity0.setEventName("");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        executionEntity0.setName("");
        executionEntity0.setParentId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity22 = executionEntity0.addIdentityLink("ProcessInstance[null]", "hi!");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
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
        executionEntity11.setBusinessKey("ScopeExecution[null]");
        executionEntity11.setSuspensionState((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity11.end();
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        java.lang.String str8 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList9 = executionEntity0.getExecutions();
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        executionEntity0.setConcurrent(true);
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 7);
        java.lang.Integer int11 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("hi!");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        boolean boolean6 = executionEntity3.isConcurrent();
        java.lang.String str7 = executionEntity3.getId();
        executionEntity0.setSuperExecution(executionEntity3);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement9 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        boolean boolean11 = executionEntity0.isEventScope();
        executionEntity0.setEventName("");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str16 = executionEntity0.getProcessDefinitionId();
        java.lang.String str17 = executionEntity0.getActivityId();
        boolean boolean18 = executionEntity0.isScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList19 = executionEntity0.getQueryVariables();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution22 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        java.lang.String str5 = executionEntity0.getCurrentActivityName();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        int int7 = executionEntity0.getRevision();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getParent();
        executionEntity0.setName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = executionEntity0.isActive("ProcessInstance[null]");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        int int12 = executionEntity10.getRevisionNext();
        executionEntity0.setSuperExecution(executionEntity10);
        java.lang.Integer int14 = executionEntity10.getExecutionListenerIndex();
        java.lang.String str15 = executionEntity10.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList17 = executionEntity10.getCompensateEventSubscriptions("");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        executionEntity0.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        int int11 = executionEntity9.getRevisionNext();
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        boolean boolean13 = executionEntity9.isEventScope();
        executionEntity9.setParentId("");
        java.lang.String str17 = executionEntity9.updateProcessBusinessKey("");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        int int19 = executionEntity9.getRevision();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
        executionEntity20.setBusinessKey("");
        executionEntity20.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity20.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.Integer int29 = executionEntity20.getExecutionListenerIndex();
        int int30 = executionEntity20.getRevision();
        executionEntity9.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity20.start();
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        boolean boolean5 = executionEntity0.isConcurrent();
        org.activiti.engine.EngineServices engineServices6 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.createExecution();
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        java.lang.String str7 = executionEntity0.toString();
        java.lang.String str8 = executionEntity0.getParentId();
        executionEntity0.setName("ProcessInstance[ScopeExecution[null]]");
        org.activiti.engine.impl.javax.el.ELContext eLContext11 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setScope(false);
        java.lang.String str8 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution9 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = executionEntity0.isActive("ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        java.lang.String str8 = executionEntity1.getBusinessKey();
        java.lang.String str9 = executionEntity1.getId();
        java.lang.Object obj10 = executionEntity1.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity1.getEventSubscriptions();
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.String str5 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.createExecution();
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        executionEntity1.setEventName("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.end();
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        int int11 = executionEntity0.getRevision();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.getReplacedBy();
        boolean boolean13 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ScopeExecution[]");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        boolean boolean7 = executionEntity0.isEventScope();
        int int8 = executionEntity0.getSuspensionState();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        int int11 = executionEntity9.getRevisionNext();
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        boolean boolean13 = executionEntity9.isEventScope();
        executionEntity9.setParentId("");
        java.lang.String str17 = executionEntity9.updateProcessBusinessKey("");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        boolean boolean19 = executionEntity0.isSuspended();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity0.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        int int11 = executionEntity0.getRevision();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.getReplacedBy();
        executionEntity0.forceUpdate();
        java.lang.Integer int14 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str15 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList16 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        executionEntity0.setName("hi!");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution13 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        executionEntity0.setConcurrent(true);
        java.lang.String str9 = executionEntity0.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        java.lang.String str13 = executionEntity10.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity10.getProcessVariables();
        boolean boolean15 = executionEntity10.isProcessInstanceType();
        executionEntity10.disposeStartingExecution();
        java.lang.String str17 = executionEntity10.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity18.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        java.lang.String str21 = executionEntity18.getProcessInstanceId();
        int int22 = executionEntity18.getRevision();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray23 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList24 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList24, variableInstanceEntityArray23);
        executionEntity18.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList24);
        executionEntity10.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList24);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList29 = executionEntity0.getExecutions();
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity0.getActivity();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj10 = executionEntity9.getPersistentState();
        executionEntity9.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = executionEntity9.getEventSource();
        java.lang.String str14 = executionEntity9.getActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity9.getTransitionBeingTaken();
        java.lang.String str16 = executionEntity9.getEventName();
        boolean boolean17 = executionEntity9.isEventScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList19 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity5.setBusinessKey("");
        java.lang.Integer int10 = executionEntity5.getExecutionListenerIndex();
        executionEntity5.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        boolean boolean17 = executionEntity5.isProcessInstanceType();
        java.lang.Object obj18 = executionEntity5.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList19 = executionEntity5.getTasks();
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getActivityId();
        java.lang.String str6 = executionEntity0.getDeleteReason();
        java.lang.String str7 = executionEntity0.getParentId();
        boolean boolean8 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        executionEntity0.setName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        java.lang.String str11 = executionEntity0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.createExecution();
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        java.lang.String str2 = executionEntity0.getDeleteReason();
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        java.lang.String str5 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList6 = executionEntity0.getTasks();
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = executionEntity0.getProcessVariables();
        java.lang.String str2 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setRevision(1);
        boolean boolean5 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.updateProcessBusinessKey("ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        org.activiti.engine.EngineServices engineServices6 = executionEntity0.getEngineServices();
        executionEntity0.setActive(false);
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity0.getCachedElContext();
        boolean boolean10 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        int int11 = executionEntity9.getRevisionNext();
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        boolean boolean13 = executionEntity9.isEventScope();
        executionEntity9.setParentId("");
        java.lang.String str17 = executionEntity9.updateProcessBusinessKey("");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = executionEntity0.getProcessVariables();
        executionEntity0.setRevision((int) (byte) -1);
        org.activiti.engine.impl.javax.el.ELContext eLContext22 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        boolean boolean5 = executionEntity0.isEventScope();
        executionEntity0.setScope(false);
        int int8 = executionEntity0.getCachedEntityState();
        executionEntity0.setTenantId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.findExecution("ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity0.getActivity();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransition();
        executionEntity0.setCachedEntityState((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        int int12 = executionEntity10.getRevisionNext();
        executionEntity0.setSuperExecution(executionEntity10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity14.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        java.lang.String str17 = executionEntity14.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = executionEntity14.getProcessVariables();
        executionEntity0.createVariablesLocal(strMap18);
        executionEntity0.setId("ProcessInstance[null]");
        executionEntity0.forceUpdate();
        boolean boolean23 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList24 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        java.lang.String str7 = executionEntity0.toString();
        java.lang.String str8 = executionEntity0.getParentId();
        java.lang.Integer int9 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str10 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        int int12 = executionEntity10.getRevisionNext();
        executionEntity0.setSuperExecution(executionEntity10);
        java.lang.Integer int14 = executionEntity10.getExecutionListenerIndex();
        boolean boolean15 = executionEntity10.isEnded();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = executionEntity10.getProcessVariables();
        int int17 = executionEntity10.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = executionEntity10.getActivity();
        executionEntity10.forceUpdate();
        java.lang.String str20 = executionEntity10.getActivityId();
        java.lang.String str21 = executionEntity10.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = executionEntity10.findExecution("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
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
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity18 = executionEntity0.involveUser("", "");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setEventScope(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        int int12 = executionEntity10.getRevisionNext();
        executionEntity0.setSuperExecution(executionEntity10);
        java.lang.Integer int14 = executionEntity10.getExecutionListenerIndex();
        boolean boolean15 = executionEntity10.isEnded();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = executionEntity10.getProcessVariables();
        int int17 = executionEntity10.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = executionEntity10.getActivity();
        executionEntity10.setBusinessKey("");
        executionEntity10.setProcessDefinitionId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList23 = executionEntity10.getIdentityLinks();
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str5 = executionEntity0.getDeleteReason();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.setProcessDefinitionId("ProcessInstance[ScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("");
        java.lang.String str10 = executionEntity1.getBusinessKey();
        boolean boolean11 = executionEntity1.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.removeIdentityLinks();
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement9 = executionEntity0.getEventSource();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        boolean boolean5 = executionEntity0.isActive();
        java.lang.String str6 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        java.lang.String str11 = executionEntity0.getName();
        executionEntity0.setProcessDefinitionId("");
        executionEntity0.setParentId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity0.findExecution("ScopeExecution[]");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.String str6 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        boolean boolean11 = executionEntity0.isEventScope();
        executionEntity0.setEventName("");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        executionEntity0.setName("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        executionEntity1.setScope(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity1.getProcessVariables();
        int int8 = executionEntity1.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity1.getSubProcessInstance();
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.String str5 = executionEntity0.getEventName();
        java.lang.String str6 = executionEntity0.getName();
        int int7 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        int int12 = executionEntity10.getRevisionNext();
        executionEntity0.setSuperExecution(executionEntity10);
        executionEntity10.setDeleteReason("");
        boolean boolean16 = executionEntity10.isDeleteRoot();
        executionEntity10.setSuspensionState((int) (short) 100);
        boolean boolean19 = executionEntity10.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity10.removeIdentityLinks();
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.javax.el.ELContext eLContext8 = executionEntity0.getCachedElContext();
        java.lang.Integer int9 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        executionEntity0.setDeleteReason("hi!");
        executionEntity0.setConcurrent(true);
        boolean boolean12 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity0.findExecution("");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.String str6 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        java.lang.String str5 = executionEntity0.getParentId();
        executionEntity0.setEventName("");
        boolean boolean8 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        java.lang.String str8 = executionEntity0.getCurrentActivityName();
        executionEntity0.setActive(true);
        executionEntity0.setEventName("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj14 = executionEntity13.getPersistentState();
        executionEntity13.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = executionEntity13.getTransitionBeingTaken();
        java.lang.String str18 = executionEntity13.getDeleteReason();
        org.activiti.engine.impl.javax.el.ELContext eLContext19 = executionEntity13.getCachedElContext();
        executionEntity13.setProcessDefinitionId("ProcessInstance[ScopeExecution[null]]");
        executionEntity0.setSuperExecution(executionEntity13);
        boolean boolean23 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ScopeExecution[]");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        boolean boolean7 = executionEntity0.isEventScope();
        java.lang.String str8 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity5.setBusinessKey("");
        java.lang.Integer int10 = executionEntity5.getExecutionListenerIndex();
        executionEntity5.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement17 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.setConcurrent(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity0.getActivity();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = executionEntity0.updateProcessBusinessKey("");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList7 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity8.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity8.createExecution();
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        int int11 = executionEntity9.getRevisionNext();
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        boolean boolean13 = executionEntity9.isEventScope();
        executionEntity9.setParentId("");
        java.lang.String str17 = executionEntity9.updateProcessBusinessKey("");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        int int19 = executionEntity9.getRevision();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
        executionEntity20.setBusinessKey("");
        executionEntity20.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity20.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.Integer int29 = executionEntity20.getExecutionListenerIndex();
        int int30 = executionEntity20.getRevision();
        executionEntity9.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl32 = executionEntity20.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList33 = executionEntity20.getIdentityLinks();
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("");
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray10 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList11 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList11, variableInstanceEntityArray10);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList11);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution14 = executionEntity1.getStartingExecution();
        java.lang.String str15 = executionEntity1.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.insert();
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity0.setDeleteReason("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.findExecution("");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        java.lang.String str11 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.getParent();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
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
        executionEntity11.setBusinessKey("ScopeExecution[null]");
        executionEntity11.setSuspensionState((int) '4');
        executionEntity11.setTenantId("ProcessInstance[null]");
        java.lang.String str21 = executionEntity11.getActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity22.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity23);
        boolean boolean25 = executionEntity22.isConcurrent();
        java.lang.String str26 = executionEntity22.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl27 = executionEntity22.getTransitionBeingTaken();
        java.lang.String str28 = executionEntity22.getEventName();
        executionEntity11.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList31 = executionEntity22.getCompensateEventSubscriptions("ScopeExecution[null]");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity5.setBusinessKey("");
        java.lang.Integer int10 = executionEntity5.getExecutionListenerIndex();
        executionEntity5.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement17 = executionEntity0.getEventSource();
        java.lang.String str18 = executionEntity0.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = executionEntity0.getTransitionBeingTaken();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement20 = executionEntity0.getEventSource();
        executionEntity0.setEventScope(false);
        executionEntity0.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.createExecution();
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj6 = executionEntity5.getPersistentState();
        executionEntity5.setRevision((int) (byte) -1);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        org.activiti.engine.EngineServices engineServices6 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        java.lang.String str8 = executionEntity0.getActivityId();
        java.lang.String str9 = executionEntity0.getTenantId();
        java.lang.String str10 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.setConcurrent(true);
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution5 = executionEntity1.getStartingExecution();
        executionEntity1.setEventName("ProcessInstance[ScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.initialize();
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        executionEntity1.setDeleteReason("ProcessInstance[null]");
        java.lang.String str6 = executionEntity1.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList7 = executionEntity1.getIdentityLinks();
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
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
        executionEntity1.setEventName("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity1.getSubProcessInstance();
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        java.lang.String str7 = executionEntity0.toString();
        java.lang.String str8 = executionEntity0.getParentId();
        java.lang.Integer int9 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str10 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[null]");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        executionEntity0.setConcurrent(true);
        java.lang.String str9 = executionEntity0.getParentId();
        executionEntity0.setRevision((int) (short) 100);
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setEventScope(true);
        executionEntity0.setActive(true);
        boolean boolean7 = executionEntity0.isScope();
        boolean boolean8 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setId("ProcessInstance[ScopeExecution[null]]");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setTenantId("ScopeExecution[null]");
        java.lang.String str11 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext12 = executionEntity0.getCachedElContext();
        boolean boolean13 = executionEntity0.isProcessInstanceType();
        java.lang.String str14 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str6 = executionEntity0.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getParent();
        int int8 = executionEntity7.getRevisionNext();
        boolean boolean9 = executionEntity7.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity7.destroyScope("");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        boolean boolean8 = executionEntity0.isDeleteRoot();
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        java.lang.String str8 = executionEntity0.getActivityId();
        java.lang.String str9 = executionEntity0.getTenantId();
        executionEntity0.setParentId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.createExecution();
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getSuperExecution();
        executionEntity1.setEventName("ProcessInstance[ScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList6 = executionEntity1.getEventSubscriptionsInternal();
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        executionEntity1.setScope(false);
        int int7 = executionEntity1.getRevision();
        boolean boolean8 = executionEntity1.isScope();
        executionEntity1.setBusinessKey("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.end();
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setBusinessKey("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj8 = executionEntity7.getPersistentState();
        executionEntity7.setScope(true);
        int int11 = executionEntity7.getCachedEntityState();
        java.lang.String str12 = executionEntity7.toString();
        java.lang.Integer int13 = executionEntity7.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity7.getProcessVariables();
        executionEntity0.createVariablesLocal(strMap14);
        executionEntity0.setBusinessKey("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        boolean boolean7 = executionEntity0.isEventScope();
        java.lang.String str8 = executionEntity0.getCurrentActivityName();
        executionEntity0.setName("ScopeExecution[null]");
        boolean boolean11 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        java.lang.Integer int8 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str9 = executionEntity0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity12 = executionEntity0.addIdentityLink("", "ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement9 = executionEntity0.getEventSource();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList11 = executionEntity0.getExecutions();
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity5.setBusinessKey("");
        java.lang.Integer int10 = executionEntity5.getExecutionListenerIndex();
        executionEntity5.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList17 = executionEntity5.getExecutions();
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        boolean boolean8 = executionEntity0.isDeleteRoot();
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.createExecution();
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        java.lang.String str11 = executionEntity0.getProcessDefinitionId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList12 = executionEntity0.getQueryVariables();
        java.lang.String str13 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[null]");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        int int11 = executionEntity9.getRevisionNext();
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        boolean boolean13 = executionEntity9.isEventScope();
        executionEntity9.setParentId("");
        java.lang.String str17 = executionEntity9.updateProcessBusinessKey("");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.lang.String str19 = executionEntity0.toString();
        executionEntity0.setRevision((int) (byte) -1);
        executionEntity0.setName("ScopeExecution[null]");
        java.lang.String str24 = executionEntity0.getBusinessKey();
        java.lang.String str25 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList27 = executionEntity0.getCompensateEventSubscriptions("");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getParent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getSuperExecution();
        boolean boolean9 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = executionEntity0.updateProcessBusinessKey("ScopeExecution[null]");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        executionEntity0.setDeleteReason("hi!");
        executionEntity0.setSuspensionState((int) 'a');
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = executionEntity0.updateProcessBusinessKey("ScopeExecution[]");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        java.lang.String str7 = executionEntity0.getId();
        java.lang.String str8 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement9 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        int int12 = executionEntity10.getRevisionNext();
        executionEntity0.setSuperExecution(executionEntity10);
        java.lang.Integer int14 = executionEntity10.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList15 = executionEntity10.getTasks();
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        boolean boolean4 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList6 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        java.lang.String str11 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.getParent();
        boolean boolean13 = executionEntity0.isScope();
        executionEntity0.setEventName("ProcessInstance[ScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
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
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        java.lang.String str15 = executionEntity0.updateProcessBusinessKey("ProcessInstance[null]");
        java.lang.String str16 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList17 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        boolean boolean8 = executionEntity0.isSuspended();
        java.lang.String str9 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.inactivate();
        java.lang.Object obj8 = executionEntity0.getPersistentState();
        executionEntity0.setProcessDefinitionId("");
        boolean boolean11 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        boolean boolean11 = executionEntity0.isEventScope();
        executionEntity0.setEventName("");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str16 = executionEntity0.getProcessDefinitionId();
        java.lang.String str17 = executionEntity0.getActivityId();
        boolean boolean18 = executionEntity0.isScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList19 = executionEntity0.getQueryVariables();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl22 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean24 = executionEntity0.isActive("");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        boolean boolean5 = executionEntity0.isDeleteRoot();
        java.lang.String str6 = executionEntity0.getName();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl8 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        java.lang.String str7 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.lang.String str11 = executionEntity8.getProcessInstanceId();
        int int12 = executionEntity8.getRevision();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray13 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList14 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList14, variableInstanceEntityArray13);
        executionEntity8.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList14);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList14);
        java.lang.String str18 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.setConcurrent(true);
        java.lang.String str7 = executionEntity0.getId();
        java.lang.String str8 = executionEntity0.getSuperExecutionId();
        java.lang.String str9 = executionEntity0.getTenantId();
        executionEntity0.setId("hi!");
        org.activiti.engine.EngineServices engineServices12 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity15 = executionEntity0.addIdentityLink("ProcessInstance[ProcessInstance[ScopeExecution[null]]]", "hi!");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        boolean boolean8 = executionEntity0.isEventScope();
        java.lang.Integer int9 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = executionEntity10.getProcessVariables();
        executionEntity0.setVariables(strMap11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = executionEntity0.updateProcessBusinessKey("hi!");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setTenantId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj9 = executionEntity8.getPersistentState();
        executionEntity8.setScope(true);
        int int12 = executionEntity8.getCachedEntityState();
        java.lang.String str13 = executionEntity8.toString();
        java.lang.Integer int14 = executionEntity8.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity8.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity8.getParent();
        executionEntity0.setSuperExecution(executionEntity8);
        boolean boolean18 = executionEntity8.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = executionEntity8.isActive("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        executionEntity0.setRevision((int) '#');
        executionEntity0.setName("ProcessInstance[ScopeExecution[null]]");
        executionEntity0.setSuspensionState((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList12 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        org.activiti.engine.EngineServices engineServices6 = executionEntity0.getEngineServices();
        executionEntity0.setCachedEntityState((int) '4');
        java.lang.String str9 = executionEntity0.getActivityId();
        boolean boolean10 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str6 = executionEntity0.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity7.getCompensateEventSubscriptions();
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity0.getActivity();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj10 = executionEntity9.getPersistentState();
        executionEntity9.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = executionEntity9.getEventSource();
        java.lang.String str14 = executionEntity9.getActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity9.getTransitionBeingTaken();
        java.lang.String str16 = executionEntity9.getEventName();
        boolean boolean17 = executionEntity9.isEventScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        boolean boolean7 = executionEntity0.isEventScope();
        int int8 = executionEntity0.getSuspensionState();
        int int9 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity6.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        executionEntity6.setBusinessKey("");
        java.lang.Integer int11 = executionEntity6.getExecutionListenerIndex();
        executionEntity6.forceUpdate();
        boolean boolean13 = executionEntity6.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity14.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        int int17 = executionEntity15.getRevisionNext();
        org.activiti.engine.EngineServices engineServices18 = executionEntity15.getEngineServices();
        boolean boolean19 = executionEntity15.isEventScope();
        executionEntity15.setParentId("");
        java.lang.String str23 = executionEntity15.updateProcessBusinessKey("");
        executionEntity6.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        boolean boolean25 = executionEntity6.isSuspended();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList27 = executionEntity6.getExecutions();
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setEventScope(true);
        int int7 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str10 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        boolean boolean8 = executionEntity0.isEventScope();
        java.lang.Integer int9 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = executionEntity10.getProcessVariables();
        executionEntity0.setVariables(strMap11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity15 = executionEntity0.addIdentityLink("ConcurrentScopeExecution[]", "ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity0.getActivity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        executionEntity8.setBusinessKey("");
        java.lang.Integer int13 = executionEntity8.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity8.getReplacedBy();
        executionEntity8.setBusinessKey("ProcessInstance[null]");
        java.lang.String str17 = executionEntity8.getActivityId();
        executionEntity0.setSuperExecution(executionEntity8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        boolean boolean7 = executionEntity0.isEventScope();
        java.lang.String str8 = executionEntity0.getParentId();
        java.lang.String str9 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList10 = executionEntity0.getExecutions();
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str6 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getParent();
        java.lang.Object obj8 = executionEntity0.getPersistentState();
        executionEntity0.setParentId("ScopeExecution[null]");
        java.lang.String str11 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        java.lang.String str8 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity0.getTransitionBeingTaken();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.getReplacedBy();
        int int12 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity0.getCompensateEventSubscriptions("hi!");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        boolean boolean7 = executionEntity0.isScope();
        boolean boolean8 = executionEntity0.isSuspended();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.findExecution("hi!");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        boolean boolean8 = executionEntity0.isEventScope();
        executionEntity0.setParentId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        java.lang.String str5 = executionEntity0.getParentId();
        executionEntity0.setEventName("");
        boolean boolean8 = executionEntity0.isEnded();
        boolean boolean9 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setSuspensionState(0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getParent();
        executionEntity0.setSuspensionState(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList11 = executionEntity0.getExecutions();
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 7);
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        java.lang.Object obj6 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("");
        java.lang.String str10 = executionEntity1.getCurrentActivityId();
        java.lang.Integer int11 = executionEntity1.getExecutionListenerIndex();
        executionEntity1.setScope(true);
        executionEntity1.setParentId("");
        java.lang.String str16 = executionEntity1.getId();
        java.lang.String str17 = executionEntity1.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = executionEntity1.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = executionEntity1.getProcessBusinessKey();
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions("");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str8 = executionEntity5.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity5.getProcessVariables();
        boolean boolean10 = executionEntity5.isProcessInstanceType();
        executionEntity5.disposeStartingExecution();
        java.lang.String str12 = executionEntity5.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        java.lang.String str16 = executionEntity13.getProcessInstanceId();
        int int17 = executionEntity13.getRevision();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray18 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList19 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList19, variableInstanceEntityArray18);
        executionEntity13.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList19);
        executionEntity5.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList19);
        int int23 = executionEntity5.getRevisionNext();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setName("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl27 = executionEntity5.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList28 = executionEntity5.getCompensateEventSubscriptions();
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.inactivate();
        java.lang.Object obj8 = executionEntity0.getPersistentState();
        java.lang.String str9 = executionEntity0.getBusinessKey();
        int int10 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        boolean boolean6 = executionEntity0.isEventScope();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        int int12 = executionEntity10.getRevisionNext();
        org.activiti.engine.EngineServices engineServices13 = executionEntity10.getEngineServices();
        boolean boolean14 = executionEntity10.isEventScope();
        executionEntity10.setParentId("");
        java.lang.String str18 = executionEntity10.updateProcessBusinessKey("");
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray19 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList20 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList20, variableInstanceEntityArray19);
        executionEntity10.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList20);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList20);
        java.lang.String str24 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = executionEntity0.getActivity();
        java.lang.String str26 = executionEntity0.getSuperExecutionId();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = executionEntity0.createExecution();
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        java.lang.String str7 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList8 = executionEntity0.getTasks();
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.javax.el.ELContext eLContext8 = executionEntity0.getCachedElContext();
        java.lang.Integer int9 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ConcurrentScopeExecution[]");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setProcessDefinitionId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransitionBeingTaken();
        boolean boolean9 = executionEntity0.isDeleteRoot();
        java.lang.String str10 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("hi!");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        java.lang.Object obj6 = executionEntity1.getPersistentState();
        boolean boolean7 = executionEntity1.isScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = executionEntity1.getActivity();
        executionEntity1.setDeleteReason("ProcessInstance[ScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = executionEntity1.getProcessBusinessKey();
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        org.activiti.engine.EngineServices engineServices8 = executionEntity0.getEngineServices();
        boolean boolean9 = executionEntity0.isActive();
        int int10 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        java.lang.String str8 = executionEntity0.getCurrentActivityName();
        executionEntity0.setActive(true);
        executionEntity0.setEventName("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj14 = executionEntity13.getPersistentState();
        executionEntity13.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = executionEntity13.getTransitionBeingTaken();
        java.lang.String str18 = executionEntity13.getDeleteReason();
        org.activiti.engine.impl.javax.el.ELContext eLContext19 = executionEntity13.getCachedElContext();
        executionEntity13.setProcessDefinitionId("ProcessInstance[ScopeExecution[null]]");
        executionEntity0.setSuperExecution(executionEntity13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList23 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        java.lang.String str11 = executionEntity0.getName();
        executionEntity0.setProcessDefinitionId("");
        executionEntity0.setParentId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution2 = executionEntity0.getStartingExecution();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        executionEntity0.setEventName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str6 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getParent();
        java.lang.Object obj8 = executionEntity0.getPersistentState();
        executionEntity0.setParentId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        java.lang.String str11 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.getParent();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList14 = executionEntity0.getTasks();
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setSuspensionState(0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getParent();
        int int9 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str5 = executionEntity0.getDeleteReason();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.setProcessDefinitionId("ProcessInstance[ScopeExecution[null]]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        int int11 = executionEntity9.getRevisionNext();
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        boolean boolean13 = executionEntity9.isEventScope();
        executionEntity9.setParentId("");
        java.lang.String str17 = executionEntity9.updateProcessBusinessKey("");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.lang.String str19 = executionEntity0.toString();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList20 = executionEntity0.getQueryVariables();
        java.lang.String str21 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ConcurrentScopeExecution[]");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        executionEntity0.setTenantId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.lang.String str11 = executionEntity8.getProcessDefinitionId();
        executionEntity8.setName("hi!");
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        java.lang.String str15 = executionEntity8.getParentId();
        boolean boolean16 = executionEntity8.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity8.getSubProcessInstance();
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        int int12 = executionEntity10.getRevisionNext();
        executionEntity0.setSuperExecution(executionEntity10);
        java.lang.Integer int14 = executionEntity10.getExecutionListenerIndex();
        boolean boolean15 = executionEntity10.isEnded();
        org.activiti.engine.EngineServices engineServices16 = executionEntity10.getEngineServices();
        java.lang.String str17 = executionEntity10.toString();
        boolean boolean18 = executionEntity10.isEnded();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity19.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
        java.lang.String str22 = executionEntity19.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = executionEntity19.getProcessVariables();
        java.lang.Object obj24 = executionEntity19.getPersistentState();
        executionEntity19.setRevision((int) '#');
        executionEntity19.setName("ProcessInstance[ScopeExecution[null]]");
        executionEntity19.setSuspensionState((int) (short) 100);
        boolean boolean31 = executionEntity19.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity10.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str8 = executionEntity5.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity5.getProcessVariables();
        boolean boolean10 = executionEntity5.isProcessInstanceType();
        executionEntity5.disposeStartingExecution();
        java.lang.String str12 = executionEntity5.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        java.lang.String str16 = executionEntity13.getProcessInstanceId();
        int int17 = executionEntity13.getRevision();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray18 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList19 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList19, variableInstanceEntityArray18);
        executionEntity13.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList19);
        executionEntity5.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList19);
        int int23 = executionEntity5.getRevisionNext();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str25 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = executionEntity0.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = executionEntity0.findExecution("");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity0.getActivity();
        java.lang.String str8 = executionEntity0.getName();
        java.lang.String str9 = executionEntity0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList10 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setEventScope(true);
        java.lang.String str5 = executionEntity0.getProcessDefinitionId();
        boolean boolean6 = executionEntity0.isScope();
        executionEntity0.disposeStartingExecution();
        java.lang.String str8 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        executionEntity0.setProcessDefinitionId("");
        boolean boolean8 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.findExecution("ScopeExecution[null]");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getActivityId();
        java.lang.String str6 = executionEntity0.getDeleteReason();
        java.lang.String str7 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList8 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getSuperExecution();
        java.lang.String str4 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity1.getTransitionBeingTaken();
        executionEntity1.setScope(false);
        executionEntity1.setEventName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList10 = executionEntity1.getIdentityLinks();
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.String str5 = executionEntity0.getEventName();
        java.lang.String str6 = executionEntity0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setEventScope(true);
        java.lang.String str5 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.updateProcessBusinessKey("ProcessInstance[]");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement9 = executionEntity0.getEventSource();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = executionEntity0.getTransition();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList11 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.findExecution("ProcessInstance[null]");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity1.getTransitionBeingTaken();
        int int6 = executionEntity1.getRevision();
        java.lang.String str7 = executionEntity1.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.insert();
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity8.disposeStartingExecution();
        int int12 = executionEntity8.getSuspensionState();
        java.lang.String str13 = executionEntity8.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity8.deleteCascade("");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
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
        java.lang.String str15 = executionEntity1.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList16 = executionEntity1.getEventSubscriptions();
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity5.setBusinessKey("");
        java.lang.Integer int10 = executionEntity5.getExecutionListenerIndex();
        executionEntity5.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        boolean boolean17 = executionEntity5.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity18.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        int int21 = executionEntity19.getRevisionNext();
        org.activiti.engine.EngineServices engineServices22 = executionEntity19.getEngineServices();
        boolean boolean23 = executionEntity19.isEventScope();
        executionEntity19.setParentId("");
        java.lang.String str27 = executionEntity19.updateProcessBusinessKey("");
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = executionEntity5.getSuperExecution();
        executionEntity5.setProcessDefinitionId("ScopeExecution[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean33 = executionEntity5.isActive("ProcessInstance[null]");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str9 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.end();
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        int int11 = executionEntity9.getRevisionNext();
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        boolean boolean13 = executionEntity9.isEventScope();
        executionEntity9.setParentId("");
        java.lang.String str17 = executionEntity9.updateProcessBusinessKey("");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        int int19 = executionEntity9.getRevision();
        executionEntity9.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity9.destroy();
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity0.getActivity();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity0.getCachedElContext();
        boolean boolean10 = executionEntity0.isEnded();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray11 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList12 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList12, variableInstanceEntityArray11);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList12);
        executionEntity0.setName("ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
        boolean boolean17 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
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
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        java.lang.String str5 = executionEntity0.getCurrentActivityName();
        java.lang.String str6 = executionEntity0.getCurrentActivityName();
        executionEntity0.setEventScope(true);
        boolean boolean9 = executionEntity0.isProcessInstanceType();
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity0.getStartingExecution();
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        executionEntity0.setDeleteReason("hi!");
        java.lang.Object obj10 = executionEntity0.getPersistentState();
        int int11 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        boolean boolean6 = executionEntity0.isEventScope();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity0.getProcessVariables();
        boolean boolean10 = executionEntity0.isEnded();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = executionEntity0.getTransitionBeingTaken();
        boolean boolean12 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        int int12 = executionEntity10.getRevisionNext();
        executionEntity0.setSuperExecution(executionEntity10);
        java.lang.Integer int14 = executionEntity10.getExecutionListenerIndex();
        org.activiti.engine.impl.javax.el.ELContext eLContext15 = executionEntity10.getCachedElContext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity16.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        java.lang.String str19 = executionEntity16.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = executionEntity16.getProcessVariables();
        boolean boolean21 = executionEntity16.isProcessInstanceType();
        executionEntity16.disposeStartingExecution();
        java.lang.String str23 = executionEntity16.toString();
        java.lang.String str24 = executionEntity16.getParentId();
        java.lang.Integer int25 = executionEntity16.getExecutionListenerIndex();
        executionEntity10.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        boolean boolean27 = executionEntity10.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity30 = executionEntity10.involveUser("ProcessInstance[]", "");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        int int12 = executionEntity10.getRevisionNext();
        executionEntity0.setSuperExecution(executionEntity10);
        java.lang.Integer int14 = executionEntity10.getExecutionListenerIndex();
        java.lang.String str15 = executionEntity10.getParentId();
        executionEntity10.setExecutionListenerIndex((java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = executionEntity10.findActiveActivityIds();
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        executionEntity0.setSuspensionState((int) (byte) 100);
        org.activiti.engine.EngineServices engineServices7 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList8 = executionEntity0.getExecutions();
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
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
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        java.lang.String str15 = executionEntity0.updateProcessBusinessKey("ProcessInstance[null]");
        java.lang.String str16 = executionEntity0.toString();
        java.lang.Integer int17 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList18 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
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
        executionEntity11.setBusinessKey("ScopeExecution[null]");
        java.lang.String str17 = executionEntity11.getEventName();
        org.activiti.engine.EngineServices engineServices18 = executionEntity11.getEngineServices();
        boolean boolean19 = executionEntity11.isSuspended();
        java.lang.String str20 = executionEntity11.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = executionEntity11.findExecution("ProcessInstance[null]");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setProcessDefinitionId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.forceUpdate();
        executionEntity0.setRevision((-1));
        java.lang.Object obj12 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        java.lang.String str8 = executionEntity1.getBusinessKey();
        java.lang.String str9 = executionEntity1.getId();
        boolean boolean10 = executionEntity1.isActive();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = executionEntity1.getActivity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        java.lang.String str15 = executionEntity12.getProcessInstanceId();
        int int16 = executionEntity12.getRevision();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray17 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList18 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList18, variableInstanceEntityArray17);
        executionEntity12.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList18);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        executionEntity12.disposeStartingExecution();
        executionEntity12.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList25 = executionEntity12.getEventSubscriptionsInternal();
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        java.lang.String str9 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.end();
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        executionEntity0.setConcurrent(true);
        java.lang.String str9 = executionEntity0.getParentId();
        executionEntity0.setRevision((int) (short) 100);
        boolean boolean12 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = executionEntity0.updateProcessBusinessKey("ScopeExecution[]");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        boolean boolean8 = executionEntity0.isSuspended();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity0.getTransitionBeingTaken();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getParent();
        int int11 = executionEntity10.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity10.findExecution("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity5.setBusinessKey("");
        java.lang.Integer int10 = executionEntity5.getExecutionListenerIndex();
        executionEntity5.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList17 = executionEntity5.getTasks();
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        boolean boolean6 = executionEntity0.isEventScope();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity0.getProcessVariables();
        boolean boolean10 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("");
        java.lang.String str10 = executionEntity1.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getReplacedBy();
        executionEntity1.setSuspensionState(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.destroy();
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        boolean boolean4 = executionEntity0.isDeleteRoot();
        java.lang.String str5 = executionEntity0.getEventName();
        executionEntity0.setName("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        java.lang.String str8 = executionEntity0.getActivityId();
        executionEntity0.disposeStartingExecution();
        boolean boolean10 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ConcurrentScopeExecution[]");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        boolean boolean8 = executionEntity0.isDeleteRoot();
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        executionEntity0.setActive(true);
        executionEntity0.setId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity0.createExecution();
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        java.lang.String str11 = executionEntity0.getName();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity0.createExecution();
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        java.lang.String str8 = executionEntity0.getActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        executionEntity9.setBusinessKey("");
        java.lang.Integer int14 = executionEntity9.getExecutionListenerIndex();
        executionEntity9.forceUpdate();
        executionEntity9.setTenantId("ScopeExecution[null]");
        executionEntity9.setEventScope(true);
        java.lang.String str20 = executionEntity9.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity9.getParent();
        executionEntity9.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList26 = executionEntity0.getExecutions();
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.String str4 = executionEntity1.getSuperExecutionId();
        executionEntity1.setProcessDefinitionId("ScopeExecution[null]");
        boolean boolean7 = executionEntity1.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.destroyScope("ProcessInstance[null]");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity0.getStartingExecution();
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement9 = executionEntity0.getEventSource();
        executionEntity0.setId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setBusinessKey("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj8 = executionEntity7.getPersistentState();
        executionEntity7.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = executionEntity7.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        java.lang.String str15 = executionEntity12.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = executionEntity12.getProcessVariables();
        boolean boolean17 = executionEntity12.isProcessInstanceType();
        executionEntity12.disposeStartingExecution();
        java.lang.String str19 = executionEntity12.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
        java.lang.String str23 = executionEntity20.getProcessInstanceId();
        int int24 = executionEntity20.getRevision();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray25 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList26 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList26, variableInstanceEntityArray25);
        executionEntity20.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList26);
        executionEntity12.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList26);
        int int30 = executionEntity12.getRevisionNext();
        executionEntity7.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        java.lang.String str32 = executionEntity7.getEventName();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        executionEntity7.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = executionEntity7.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        boolean boolean7 = executionEntity0.isConcurrent();
        java.lang.String str8 = executionEntity0.getSuperExecutionId();
        int int9 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getParent();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        executionEntity0.setCachedEntityState((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList15 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity6.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        executionEntity6.setBusinessKey("");
        java.lang.Integer int11 = executionEntity6.getExecutionListenerIndex();
        executionEntity6.forceUpdate();
        boolean boolean13 = executionEntity6.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity14.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        int int17 = executionEntity15.getRevisionNext();
        org.activiti.engine.EngineServices engineServices18 = executionEntity15.getEngineServices();
        boolean boolean19 = executionEntity15.isEventScope();
        executionEntity15.setParentId("");
        java.lang.String str23 = executionEntity15.updateProcessBusinessKey("");
        executionEntity6.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        boolean boolean25 = executionEntity6.isSuspended();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        int int27 = executionEntity6.getCachedEntityState();
        java.lang.String str28 = executionEntity6.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList29 = executionEntity6.getIdentityLinks();
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getName();
        boolean boolean8 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        java.lang.String str11 = executionEntity0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity14 = executionEntity0.involveUser("ProcessInstance[ProcessInstance[ScopeExecution[null]]]", "ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.createExecution();
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        boolean boolean6 = executionEntity0.isEnded();
        executionEntity0.forceUpdate();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity0.getQueryVariables();
        executionEntity0.inactivate();
        java.lang.String str9 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        java.lang.String str7 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.lang.String str11 = executionEntity8.getProcessInstanceId();
        int int12 = executionEntity8.getRevision();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray13 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList14 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList14, variableInstanceEntityArray13);
        executionEntity8.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList14);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList14);
        int int18 = executionEntity0.getRevisionNext();
        java.lang.String str19 = executionEntity0.getDeleteReason();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement20 = executionEntity0.getEventSource();
        boolean boolean21 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList22 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("");
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray10 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList11 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList11, variableInstanceEntityArray10);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList11);
        executionEntity1.setSuspensionState((int) (byte) -1);
        int int16 = executionEntity1.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList17 = executionEntity1.getTasks();
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity0.getActivity();
        executionEntity0.setTenantId("ScopeExecution[null]");
        int int9 = executionEntity0.getRevisionNext();
        int int10 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList11 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        java.lang.String str6 = executionEntity0.getCurrentActivityId();
        executionEntity0.setDeleteReason("");
        java.lang.String str9 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        java.lang.String str7 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.addIdentityLink("", "ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        executionEntity0.setTenantId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.lang.String str11 = executionEntity8.getProcessDefinitionId();
        executionEntity8.setName("hi!");
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity0.getTransition();
        java.lang.String str16 = executionEntity0.getEventName();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity0.findExecution("ScopeExecution[]");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution2 = executionEntity0.getStartingExecution();
        boolean boolean3 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.findExecution("ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str6 = executionEntity0.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.inactivate();
        java.lang.Object obj8 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getSuperExecution();
        java.lang.Object obj10 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity13 = executionEntity0.involveUser("ProcessInstance[ProcessInstance[ScopeExecution[null]]]", "ScopeExecution[]");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        boolean boolean11 = executionEntity0.isEventScope();
        executionEntity0.setEventName("");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str16 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity0.findExecution("ProcessInstance[]");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        int int11 = executionEntity0.getRevision();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.getReplacedBy();
        executionEntity0.forceUpdate();
        executionEntity0.setCachedEntityState((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList16 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        int int11 = executionEntity0.getRevision();
        executionEntity0.setRevision((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setEventScope(true);
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = executionEntity0.getCachedElContext();
        java.lang.String str8 = executionEntity0.getSuperExecutionId();
        executionEntity0.inactivate();
        executionEntity0.setId("hi!");
        boolean boolean12 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str8 = executionEntity5.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity5.getProcessVariables();
        boolean boolean10 = executionEntity5.isProcessInstanceType();
        executionEntity5.disposeStartingExecution();
        java.lang.String str12 = executionEntity5.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        java.lang.String str16 = executionEntity13.getProcessInstanceId();
        int int17 = executionEntity13.getRevision();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray18 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList19 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList19, variableInstanceEntityArray18);
        executionEntity13.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList19);
        executionEntity5.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList19);
        int int23 = executionEntity5.getRevisionNext();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str25 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean27 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList7 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        java.lang.String str8 = executionEntity1.getBusinessKey();
        java.lang.String str9 = executionEntity1.getId();
        boolean boolean10 = executionEntity1.isActive();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = executionEntity1.getActivity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        java.lang.String str15 = executionEntity12.getProcessInstanceId();
        int int16 = executionEntity12.getRevision();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray17 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList18 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList18, variableInstanceEntityArray17);
        executionEntity12.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList18);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        executionEntity12.disposeStartingExecution();
        executionEntity12.setScope(false);
        java.lang.String str25 = executionEntity12.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity12.remove();
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str9 = executionEntity0.getEventName();
        executionEntity0.setEventName("ProcessInstance[ScopeExecution[null]]");
        java.lang.String str12 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity5.setBusinessKey("");
        java.lang.Integer int10 = executionEntity5.getExecutionListenerIndex();
        executionEntity5.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl17 = executionEntity5.getProcessDefinition();
        java.lang.String str18 = executionEntity5.getName();
        boolean boolean19 = executionEntity5.isConcurrent();
        executionEntity5.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList22 = executionEntity5.getCompensateEventSubscriptions();
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity0.getActivity();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList9 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        boolean boolean6 = executionEntity3.isConcurrent();
        java.lang.String str7 = executionEntity3.getId();
        executionEntity0.setSuperExecution(executionEntity3);
        java.lang.Integer int9 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.setName("ScopeExecution[null]");
        int int12 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList13 = executionEntity0.getTasks();
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[]");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        int int12 = executionEntity10.getRevisionNext();
        executionEntity0.setSuperExecution(executionEntity10);
        java.lang.Integer int14 = executionEntity10.getExecutionListenerIndex();
        boolean boolean15 = executionEntity10.isEnded();
        java.lang.String str16 = executionEntity10.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList17 = executionEntity10.getEventSubscriptions();
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        java.lang.String str7 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.lang.String str11 = executionEntity8.getProcessInstanceId();
        int int12 = executionEntity8.getRevision();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray13 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList14 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList14, variableInstanceEntityArray13);
        executionEntity8.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList14);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList14);
        int int18 = executionEntity0.getRevisionNext();
        java.lang.String str19 = executionEntity0.getDeleteReason();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement20 = executionEntity0.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity21.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity22);
        java.lang.String str24 = executionEntity21.getProcessDefinitionId();
        boolean boolean25 = executionEntity21.isDeleteRoot();
        executionEntity21.setCachedEntityState(100);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList29 = executionEntity21.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity21.start();
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
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
        java.lang.String str12 = executionEntity0.toString();
        executionEntity0.inactivate();
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList15 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray5 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList6, variableInstanceEntityArray5);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList6);
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = executionEntity0.updateProcessBusinessKey("ScopeExecution[null]");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity8.setDeleteReason("");
        java.lang.String str13 = executionEntity8.getEventName();
        java.lang.String str14 = executionEntity8.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity8.insert();
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
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
        executionEntity11.setBusinessKey("ScopeExecution[null]");
        java.lang.Integer int17 = executionEntity11.getExecutionListenerIndex();
        executionEntity11.setTenantId("ProcessInstance[ScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = executionEntity11.updateProcessBusinessKey("ConcurrentScopeExecution[]");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = executionEntity0.getProcessVariables();
        java.lang.String str2 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setRevision(1);
        boolean boolean5 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity0.getQueryVariables();
        java.lang.String str8 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity6.getEventSubscriptions();
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        java.lang.String str8 = executionEntity1.getBusinessKey();
        boolean boolean9 = executionEntity1.isScope();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = executionEntity1.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity13 = executionEntity1.involveUser("ConcurrentScopeExecution[]", "ScopeExecution[]");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str7 = executionEntity0.getEventName();
        boolean boolean8 = executionEntity0.isEventScope();
        int int9 = executionEntity0.getRevisionNext();
        boolean boolean10 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity13 = executionEntity0.involveUser("", "");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        executionEntity0.setConcurrent(true);
        java.lang.String str9 = executionEntity0.getParentId();
        executionEntity0.setRevision((int) (short) 100);
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        executionEntity0.setName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = executionEntity0.isActive("");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setEventScope(true);
        java.lang.String str5 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        boolean boolean5 = executionEntity0.isConcurrent();
        boolean boolean6 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.createExecution();
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        boolean boolean5 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setEventScope(true);
        executionEntity0.setActive(true);
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        executionEntity0.setRevision((int) '4');
        executionEntity0.forceUpdate();
        boolean boolean11 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        boolean boolean7 = executionEntity0.isEventScope();
        java.lang.String str8 = executionEntity0.getParentId();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setName("");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList7 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        boolean boolean7 = executionEntity0.isConcurrent();
        java.lang.String str8 = executionEntity0.getSuperExecutionId();
        int int9 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getParent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        java.lang.String str14 = executionEntity11.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity11.getProcessVariables();
        java.lang.String str16 = executionEntity11.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = executionEntity11.getActivity();
        executionEntity11.setTenantId("ScopeExecution[null]");
        int int20 = executionEntity11.getRevisionNext();
        boolean boolean21 = executionEntity11.isSuspended();
        int int22 = executionEntity11.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        boolean boolean7 = executionEntity0.isEventScope();
        int int8 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = executionEntity0.isActive("");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity6.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        int int9 = executionEntity7.getRevisionNext();
        org.activiti.engine.EngineServices engineServices10 = executionEntity7.getEngineServices();
        executionEntity7.setScope(false);
        int int13 = executionEntity7.getRevision();
        boolean boolean14 = executionEntity7.isScope();
        executionEntity7.setActive(false);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.lang.String str18 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution19 = executionEntity0.getStartingExecution();
        executionEntity0.setDeleteReason("ScopeExecution[null]");
        executionEntity0.setRevision((int) 'a');
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = executionEntity0.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity24.insert();
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        executionEntity1.setScope(false);
        int int7 = executionEntity1.getRevision();
        boolean boolean8 = executionEntity1.isScope();
        executionEntity1.setActive(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity1.findExecution("ConcurrentScopeExecution[]");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        executionEntity1.disposeStartingExecution();
        boolean boolean9 = executionEntity1.isScope();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution10 = executionEntity1.getStartingExecution();
        java.lang.String str11 = executionEntity1.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.insert();
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        executionEntity0.setRevision((int) '#');
        executionEntity0.setName("ProcessInstance[ScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[]");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity5.getProcessVariables();
        executionEntity0.setVariables(strMap6);
        boolean boolean8 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        java.lang.String str7 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = executionEntity0.getProcessVariables();
        java.lang.String str2 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setRevision(1);
        java.lang.String str5 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }
}

