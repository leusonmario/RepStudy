import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.setScope(true);
        executionEntity0.setCachedEntityState((int) (byte) -1);
        executionEntity0.setEventName("ScopeExecution[null]");
        boolean boolean10 = executionEntity0.isProcessInstanceType();
        java.lang.Object obj11 = executionEntity0.getPersistentState();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = executionEntity0.getProcessVariables();
        executionEntity0.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity0.createExecution();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        boolean boolean6 = executionEntity0.isConcurrent();
        executionEntity0.setCachedEntityState(10);
        java.lang.String str9 = executionEntity0.getCurrentActivityId();
        boolean boolean10 = executionEntity0.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity0.getCompensateEventSubscriptions("ConcurrentScopeExecution[null]");
        java.lang.String str13 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList14 = executionEntity0.getTasks();
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        java.lang.String str3 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity4.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity4.getProcessDefinition();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        executionEntity0.setDeleteReason("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setCachedEntityState((int) ' ');
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        int int13 = executionEntity9.getSuspensionState();
        executionEntity0.setSuperExecution(executionEntity9);
        boolean boolean15 = executionEntity9.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity16.getSuperExecution();
        java.lang.String str18 = executionEntity16.toString();
        executionEntity16.setCachedEntityState((int) ' ');
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str22 = executionEntity21.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = executionEntity21.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl24 = executionEntity21.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str26 = executionEntity25.getCurrentActivityId();
        executionEntity21.setSuperExecution(executionEntity25);
        org.activiti.engine.EngineServices engineServices28 = executionEntity25.getEngineServices();
        int int29 = executionEntity25.getSuspensionState();
        executionEntity16.setSuperExecution(executionEntity25);
        boolean boolean31 = executionEntity25.isConcurrent();
        boolean boolean32 = executionEntity25.isEventScope();
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = executionEntity25.getProcessVariables();
        executionEntity9.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList35 = executionEntity25.getJobs();
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getId();
        int int7 = executionEntity0.getSuspensionState();
        boolean boolean8 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        executionEntity9.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity9.getReplacedBy();
        executionEntity0.setSuperExecution(executionEntity9);
        boolean boolean17 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = executionEntity0.getActivity();
        boolean boolean19 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[]");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.Integer int3 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.setParentId("ScopeExecution[null]");
        executionEntity0.setSuspensionState((int) (byte) -1);
        int int8 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        java.lang.String str3 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity4.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity4.getProcessDefinition();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity4.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity4.getCompensateEventSubscriptions();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        executionEntity6.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity6.getProcessInstance();
        executionEntity6.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity12.getSuperExecution();
        java.lang.String str14 = executionEntity12.toString();
        executionEntity12.setDeleteReason("ProcessInstance[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity12.getProcessVariables();
        executionEntity6.createVariablesLocal(strMap17);
        int int19 = executionEntity6.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList21 = executionEntity6.getCompensateEventSubscriptions("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        executionEntity9.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity9.getReplacedBy();
        executionEntity0.setSuperExecution(executionEntity9);
        java.lang.String str17 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity0.findExecution("ProcessInstance[null]");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        boolean boolean3 = executionEntity0.isEnded();
        executionEntity0.setDeleteReason("ProcessInstance[ConcurrentScopeExecution[null]]");
        executionEntity0.setParentId("ConcurrentScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getCurrentActivityId();
        boolean boolean5 = executionEntity3.isScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity3.getActivity();
        java.lang.String str8 = executionEntity3.toString();
        java.lang.String str9 = executionEntity3.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList10 = executionEntity3.getJobs();
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        int int8 = executionEntity4.getSuspensionState();
        boolean boolean9 = executionEntity4.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.deleteCascade("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        boolean boolean3 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = executionEntity0.updateProcessBusinessKey("ScopeExecution[null]");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity5.getSuperExecution();
        int int7 = executionEntity5.getRevisionNext();
        java.lang.String str8 = executionEntity5.getParentId();
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = executionEntity5.getProcessVariables();
        executionEntity0.setVariables(strMap11);
        java.lang.String str13 = executionEntity0.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str15 = executionEntity14.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity14.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = executionEntity14.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str19 = executionEntity18.getCurrentActivityId();
        executionEntity14.setSuperExecution(executionEntity18);
        java.lang.String str21 = executionEntity18.getProcessInstanceId();
        java.lang.String str22 = executionEntity18.getBusinessKey();
        java.lang.String str23 = executionEntity18.getEventName();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity18.destroyScope("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        boolean boolean7 = executionEntity4.isActive();
        executionEntity4.setTenantId("ProcessInstance[null]");
        executionEntity4.setEventScope(false);
        executionEntity4.setExecutionListenerIndex((java.lang.Integer) 0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity14.getSuperExecution();
        executionEntity14.disposeStartingExecution();
        executionEntity14.setEventName("");
        executionEntity14.setEventScope(false);
        java.lang.String str21 = executionEntity14.getEventName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = executionEntity22.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl24 = executionEntity22.getProcessDefinition();
        java.lang.String str25 = executionEntity22.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str27 = executionEntity26.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = executionEntity26.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl29 = executionEntity26.getTransition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution30 = executionEntity26.getStartingExecution();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = executionEntity26.getProcessVariables();
        executionEntity22.setVariables(strMap31);
        executionEntity14.setVariables(strMap31);
        executionEntity4.setVariables(strMap31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList35 = executionEntity4.getTasks();
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        boolean boolean7 = executionEntity4.isActive();
        executionEntity4.setTenantId("ProcessInstance[null]");
        executionEntity4.setExecutionListenerIndex((java.lang.Integer) 1);
        int int12 = executionEntity4.getRevisionNext();
        executionEntity4.setEventScope(false);
        executionEntity4.setProcessDefinitionId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.deleteCascade("Execution[null]");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        executionEntity9.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity9.getReplacedBy();
        executionEntity0.setSuperExecution(executionEntity9);
        executionEntity0.setParentId("hi!");
        java.lang.String str19 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroy();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        executionEntity0.setCachedEntityState(1);
        java.lang.String str8 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList5 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        int int6 = executionEntity0.getSuspensionState();
        java.lang.String str7 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList8 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.forceUpdate();
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl8 = executionEntity0.getProcessDefinition();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        executionEntity6.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity6.getProcessInstance();
        executionEntity6.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity6.setExecutionListenerIndex((java.lang.Integer) 0);
        boolean boolean14 = executionEntity6.isEventScope();
        executionEntity6.disposeStartingExecution();
        java.lang.String str16 = executionEntity6.getProcessInstanceId();
        executionEntity6.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList19 = executionEntity6.getCompensateEventSubscriptions();
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity7.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = executionEntity7.getProcessDefinition();
        boolean boolean11 = executionEntity7.isEnded();
        executionEntity7.setCachedEntityState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray14 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15, variableInstanceEntityArray14);
        executionEntity7.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList19 = executionEntity0.getQueryVariables();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.lang.Object obj22 = executionEntity0.getPersistentState();
        executionEntity0.setRevision((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isSuspended();
        executionEntity0.forceUpdate();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity0.getProcessVariables();
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.addIdentityLink("ProcessInstance[ProcessInstance[null]]", "");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        int int8 = executionEntity4.getSuspensionState();
        executionEntity4.setProcessDefinitionId("");
        executionEntity4.setCachedEntityState((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.insert();
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        java.lang.String str8 = executionEntity4.getBusinessKey();
        java.lang.String str9 = executionEntity4.getEventName();
        java.lang.String str10 = executionEntity4.getParentId();
        executionEntity4.inactivate();
        boolean boolean12 = executionEntity4.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.end();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        executionEntity4.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity12 = executionEntity4.addIdentityLink("ProcessInstance[ConcurrentScopeExecution[null]]", "ProcessInstance[null]");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        java.lang.String str4 = executionEntity0.toString();
        executionEntity0.setCachedEntityState((int) (byte) 0);
        java.lang.String str7 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.involveUser("Execution[null]", "ProcessInstance[hi!]");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        executionEntity0.setScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity9.getSuperExecution();
        int int11 = executionEntity9.getRevisionNext();
        java.lang.String str12 = executionEntity9.getParentId();
        executionEntity9.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity9.getProcessVariables();
        executionEntity0.setVariables(strMap15);
        executionEntity0.setEventScope(true);
        java.lang.String str19 = executionEntity0.getBusinessKey();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList20 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setRevision((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(false);
        int int10 = executionEntity0.getRevision();
        java.lang.String str11 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity0.getStartingExecution();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        java.lang.String str6 = executionEntity0.getParentId();
        executionEntity0.setScope(true);
        boolean boolean9 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.forceUpdate();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        boolean boolean6 = executionEntity0.isSuspended();
        org.activiti.engine.EngineServices engineServices7 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity7.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = executionEntity7.getProcessDefinition();
        boolean boolean11 = executionEntity7.isEnded();
        executionEntity7.setCachedEntityState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray14 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15, variableInstanceEntityArray14);
        executionEntity7.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        boolean boolean19 = executionEntity0.isEnded();
        java.lang.String str20 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        executionEntity9.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity9.getReplacedBy();
        executionEntity0.setSuperExecution(executionEntity9);
        java.lang.String str17 = executionEntity0.getActivityId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList18 = executionEntity0.getQueryVariables();
        int int19 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        java.lang.String str5 = executionEntity0.getParentId();
        executionEntity0.setParentId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList8 = executionEntity0.getJobs();
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl7 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.involveUser("ScopeExecution[null]", "ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        boolean boolean7 = executionEntity0.isConcurrent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList10 = executionEntity0.getExecutions();
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList8 = executionEntity0.getTasks();
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        java.lang.String str7 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity0.getProcessDefinition();
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        java.lang.String str8 = executionEntity0.getTenantId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = executionEntity0.isActive("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        executionEntity6.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity6.getProcessInstance();
        executionEntity6.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity6.setExecutionListenerIndex((java.lang.Integer) 0);
        boolean boolean14 = executionEntity6.isEventScope();
        java.lang.String str15 = executionEntity6.toString();
        executionEntity6.setSuspensionState(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity6.end();
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity5.getSuperExecution();
        int int7 = executionEntity5.getRevisionNext();
        java.lang.String str8 = executionEntity5.getParentId();
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = executionEntity5.getProcessVariables();
        executionEntity0.setVariables(strMap11);
        java.lang.String str13 = executionEntity0.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str15 = executionEntity14.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity14.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = executionEntity14.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str19 = executionEntity18.getCurrentActivityId();
        executionEntity14.setSuperExecution(executionEntity18);
        java.lang.String str21 = executionEntity18.getProcessInstanceId();
        java.lang.String str22 = executionEntity18.getBusinessKey();
        java.lang.String str23 = executionEntity18.getEventName();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        executionEntity0.setTenantId("hi!");
        int int4 = executionEntity0.getRevisionNext();
        executionEntity0.setSuspensionState(7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity9 = executionEntity0.addIdentityLink("", "ScopeExecution[null]");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        executionEntity6.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity6.getProcessInstance();
        executionEntity6.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity12.getSuperExecution();
        java.lang.String str14 = executionEntity12.toString();
        executionEntity12.setDeleteReason("ProcessInstance[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity12.getProcessVariables();
        executionEntity6.createVariablesLocal(strMap17);
        executionEntity6.setBusinessKey("");
        boolean boolean21 = executionEntity6.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity24 = executionEntity6.addIdentityLink("ProcessInstance[null]", "");
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.setConcurrent(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getSuperExecution();
        java.lang.Integer int7 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        executionEntity9.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity9.getReplacedBy();
        executionEntity0.setSuperExecution(executionEntity9);
        java.lang.String str17 = executionEntity9.getSuperExecutionId();
        boolean boolean18 = executionEntity9.isScope();
        java.lang.String str19 = executionEntity9.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList20 = executionEntity9.getIdentityLinks();
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        executionEntity0.setRevision((int) (short) 1);
        java.lang.String str7 = executionEntity0.toString();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        boolean boolean10 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        executionEntity4.setEventScope(false);
        java.lang.String str10 = executionEntity4.getCurrentActivityId();
        boolean boolean11 = executionEntity4.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity4.getProcessInstance();
        org.activiti.engine.EngineServices engineServices13 = executionEntity4.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity4.findExecution("ProcessInstance[hi!]");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        java.lang.String str6 = executionEntity0.getCurrentActivityName();
        boolean boolean7 = executionEntity0.isSuspended();
        java.lang.String str8 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.involveUser("ProcessInstance[null]", "ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity0.getStartingExecution();
        executionEntity0.setTenantId("ConcurrentScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        executionEntity6.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity6.getProcessInstance();
        executionEntity6.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity12.getSuperExecution();
        java.lang.String str14 = executionEntity12.toString();
        executionEntity12.setDeleteReason("ProcessInstance[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity12.getProcessVariables();
        executionEntity6.createVariablesLocal(strMap17);
        int int19 = executionEntity6.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList20 = executionEntity6.getJobs();
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity0.getStartingExecution();
        executionEntity0.setTenantId("ConcurrentScopeExecution[null]");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl11 = executionEntity0.getProcessDefinition();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList12 = executionEntity0.getQueryVariables();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ProcessInstance[ProcessInstance[null]]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity0.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity8 = executionEntity0.involveUser("", "Execution[null]");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        boolean boolean7 = executionEntity4.isActive();
        executionEntity4.setTenantId("ProcessInstance[null]");
        executionEntity4.setEventScope(false);
        executionEntity4.setRevision(10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str15 = executionEntity14.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity14.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = executionEntity14.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str19 = executionEntity18.getCurrentActivityId();
        executionEntity14.setSuperExecution(executionEntity18);
        java.lang.String str21 = executionEntity18.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = executionEntity22.getSuperExecution();
        java.lang.String str24 = executionEntity22.toString();
        boolean boolean25 = executionEntity22.isDeleteRoot();
        executionEntity22.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = executionEntity28.getSuperExecution();
        executionEntity28.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = executionEntity28.getProcessInstance();
        executionEntity28.disposeStartingExecution();
        executionEntity22.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity28);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = executionEntity34.getSuperExecution();
        java.lang.String str36 = executionEntity34.toString();
        executionEntity34.setDeleteReason("ProcessInstance[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = executionEntity34.getProcessVariables();
        executionEntity28.createVariablesLocal(strMap39);
        executionEntity18.setVariablesLocal(strMap39);
        executionEntity4.createVariablesLocal(strMap39);
        executionEntity4.setSuspensionState((int) 'a');
        java.lang.String str45 = executionEntity4.getTenantId();
        int int46 = executionEntity4.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = executionEntity4.getProcessBusinessKey();
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity0.getProcessDefinition();
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        java.lang.String str8 = executionEntity0.getTenantId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.lang.String str11 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.setScope(true);
        executionEntity0.setCachedEntityState((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        boolean boolean8 = executionEntity0.isSuspended();
        executionEntity0.setParentId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity0.getProcessDefinition();
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        executionEntity0.setScope(true);
        executionEntity0.setActive(true);
        int int12 = executionEntity0.getRevisionNext();
        int int13 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity16 = executionEntity0.involveUser("ProcessInstance[]", "ProcessInstance[hi!]");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.setScope(true);
        executionEntity0.setCachedEntityState((int) (byte) -1);
        executionEntity0.setEventName("ScopeExecution[null]");
        boolean boolean10 = executionEntity0.isProcessInstanceType();
        java.lang.Object obj11 = executionEntity0.getPersistentState();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList13 = executionEntity0.getTasks();
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        boolean boolean5 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.createExecution();
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.lang.String str4 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[null]");
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        executionEntity6.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity6.getProcessInstance();
        executionEntity6.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = executionEntity6.getActivity();
        java.lang.String str13 = executionEntity6.getId();
        executionEntity6.setParentId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList16 = executionEntity6.getEventSubscriptionsInternal();
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        java.lang.String str8 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getCurrentActivityId();
        boolean boolean5 = executionEntity3.isScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity3.getActivity();
        java.lang.String str8 = executionEntity3.getCurrentActivityName();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity3.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity3.getCompensateEventSubscriptions();
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        executionEntity0.setId("");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl5 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[hi!]");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity7 = executionEntity0.involveUser("ProcessInstance[ScopeExecution[null]]", "ScopeExecution[null]");
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList8 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        java.lang.String str8 = executionEntity4.getBusinessKey();
        boolean boolean9 = executionEntity4.isProcessInstanceType();
        java.lang.String str10 = executionEntity4.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList11 = executionEntity4.getJobs();
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        java.lang.String str5 = executionEntity0.getParentId();
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity7.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = executionEntity7.getProcessDefinition();
        boolean boolean11 = executionEntity7.isEnded();
        executionEntity7.setCachedEntityState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray14 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15, variableInstanceEntityArray14);
        executionEntity7.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity0.getProcessInstance();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl22 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity7.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = executionEntity7.getProcessDefinition();
        boolean boolean11 = executionEntity7.isEnded();
        executionEntity7.setCachedEntityState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray14 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15, variableInstanceEntityArray14);
        executionEntity7.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        boolean boolean19 = executionEntity0.isEnded();
        executionEntity0.setId("ProcessInstance[null]");
        int int22 = executionEntity0.getRevision();
        boolean boolean23 = executionEntity0.isActive();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList24 = executionEntity0.getQueryVariables();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl25 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList26 = executionEntity0.getTasks();
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        executionEntity6.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity6.getProcessInstance();
        executionEntity6.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity12.getSuperExecution();
        java.lang.String str14 = executionEntity12.toString();
        executionEntity12.setDeleteReason("ProcessInstance[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity12.getProcessVariables();
        executionEntity6.createVariablesLocal(strMap17);
        executionEntity6.setBusinessKey("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList21 = executionEntity6.getEventSubscriptionsInternal();
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        int int5 = executionEntity0.getRevision();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        java.lang.String str7 = executionEntity0.getId();
        java.lang.String str8 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList9 = executionEntity0.getJobs();
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        int int5 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = executionEntity0.getActivity();
        boolean boolean3 = executionEntity0.isConcurrent();
        boolean boolean4 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = executionEntity0.isActive("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList5 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        executionEntity9.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity9.getReplacedBy();
        executionEntity0.setSuperExecution(executionEntity9);
        java.lang.String str17 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl18 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("Execution[null]");
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        executionEntity0.setActive(true);
        executionEntity0.setScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity10.getSuperExecution();
        java.lang.String str12 = executionEntity10.toString();
        executionEntity10.setDeleteReason("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement15 = executionEntity10.getEventSource();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity19 = executionEntity10.involveUser("ProcessInstance[ConcurrentScopeExecution[null]]", "ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity8.getSuperExecution();
        java.lang.String str10 = executionEntity8.toString();
        boolean boolean11 = executionEntity8.isDeleteRoot();
        executionEntity8.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity14.getSuperExecution();
        executionEntity14.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity14.getProcessInstance();
        executionEntity14.disposeStartingExecution();
        executionEntity8.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity20.getSuperExecution();
        java.lang.String str22 = executionEntity20.toString();
        executionEntity20.setDeleteReason("ProcessInstance[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = executionEntity20.getProcessVariables();
        executionEntity14.createVariablesLocal(strMap25);
        executionEntity4.setVariablesLocal(strMap25);
        java.lang.String str28 = executionEntity4.getEventName();
        boolean boolean29 = executionEntity4.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList30 = executionEntity4.getJobs();
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        executionEntity0.setSuspensionState((int) (short) 100);
        int int5 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        executionEntity6.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity6.getProcessInstance();
        executionEntity6.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity6.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity6.setScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity6.getReplacedBy();
        int int17 = executionEntity6.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity6.removeIdentityLinks();
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        executionEntity0.setId("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution5 = executionEntity0.getStartingExecution();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        boolean boolean8 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity9.getSuperExecution();
        java.lang.String str11 = executionEntity9.toString();
        boolean boolean12 = executionEntity9.isEnded();
        boolean boolean13 = executionEntity9.isProcessInstanceType();
        java.lang.String str14 = executionEntity9.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity7.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = executionEntity7.getProcessDefinition();
        boolean boolean11 = executionEntity7.isEnded();
        executionEntity7.setCachedEntityState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray14 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15, variableInstanceEntityArray14);
        executionEntity7.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        boolean boolean19 = executionEntity0.isEnded();
        java.lang.String str20 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList22 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setParentId("ScopeExecution[null]");
        executionEntity0.setParentId("ProcessInstance[null]");
        java.lang.String str9 = executionEntity0.getCurrentActivityName();
        java.lang.Integer int10 = executionEntity0.getExecutionListenerIndex();
        boolean boolean11 = executionEntity0.isScope();
        executionEntity0.setSuspensionState((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("");
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        java.lang.String str4 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = executionEntity0.isActive("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        java.lang.String str5 = executionEntity0.getActivityId();
        java.lang.Object obj6 = executionEntity0.getPersistentState();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransition();
        java.lang.String str9 = executionEntity0.getDeleteReason();
        java.lang.String str10 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.createExecution();
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray7 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList8 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList8, variableInstanceEntityArray7);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        boolean boolean7 = executionEntity4.isActive();
        executionEntity4.setTenantId("ProcessInstance[null]");
        executionEntity4.setExecutionListenerIndex((java.lang.Integer) 1);
        int int12 = executionEntity4.getRevisionNext();
        executionEntity4.setEventScope(false);
        executionEntity4.setProcessDefinitionId("");
        java.lang.String str17 = executionEntity4.getCurrentActivityId();
        java.lang.String str18 = executionEntity4.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity4.createExecution();
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.String str4 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.findExecution("hi!");
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        int int8 = executionEntity4.getSuspensionState();
        executionEntity4.setEventName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity4.getSubProcessInstance();
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        executionEntity4.disposeStartingExecution();
        int int9 = executionEntity4.getSuspensionState();
        int int10 = executionEntity4.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.start();
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity5.getSuperExecution();
        int int7 = executionEntity5.getRevisionNext();
        java.lang.String str8 = executionEntity5.getParentId();
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = executionEntity5.getProcessVariables();
        executionEntity0.setVariables(strMap11);
        java.lang.String str13 = executionEntity0.getParentId();
        java.lang.String str14 = executionEntity0.getActivityId();
        int int15 = executionEntity0.getCachedEntityState();
        java.lang.String str16 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("Execution[null]");
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        executionEntity9.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity9.getReplacedBy();
        executionEntity0.setSuperExecution(executionEntity9);
        boolean boolean17 = executionEntity0.isDeleteRoot();
        boolean boolean18 = executionEntity0.isEnded();
        java.lang.String str19 = executionEntity0.getProcessInstanceId();
        boolean boolean20 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        java.lang.String str4 = executionEntity0.toString();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = executionEntity0.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getSuperExecution();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        int int6 = executionEntity0.getRevision();
        java.lang.String str7 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("hi!");
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity0.getProcessDefinition();
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        executionEntity0.setScope(true);
        executionEntity0.setActive(true);
        int int12 = executionEntity0.getRevisionNext();
        int int13 = executionEntity0.getRevision();
        executionEntity0.setScope(true);
        boolean boolean16 = executionEntity0.isConcurrent();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity20 = executionEntity0.involveUser("ScopeExecution[null]", "");
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setCachedEntityState((int) ' ');
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        int int13 = executionEntity9.getSuspensionState();
        executionEntity0.setSuperExecution(executionEntity9);
        boolean boolean15 = executionEntity9.isConcurrent();
        int int16 = executionEntity9.getSuspensionState();
        java.lang.String str17 = executionEntity9.getCurrentActivityName();
        boolean boolean18 = executionEntity9.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = executionEntity9.updateProcessBusinessKey("ProcessInstance[hi!]");
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = executionEntity0.isActive("ProcessInstance[null]");
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isSuspended();
        executionEntity0.setActive(false);
        java.lang.String str7 = executionEntity0.getEventName();
        executionEntity0.setSuspensionState((int) ' ');
        boolean boolean10 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        int int8 = executionEntity4.getSuspensionState();
        executionEntity4.setProcessDefinitionId("");
        executionEntity4.setCachedEntityState((int) 'a');
        java.lang.String str13 = executionEntity4.getTenantId();
        java.lang.String str14 = executionEntity4.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity4.getSubProcessInstance();
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity4.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity4.getTransition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity4.getStartingExecution();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity4.getProcessVariables();
        executionEntity0.setVariables(strMap9);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList11 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = executionEntity0.updateProcessBusinessKey("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setParentId("ScopeExecution[null]");
        executionEntity0.setParentId("ProcessInstance[null]");
        java.lang.String str9 = executionEntity0.getCurrentActivityName();
        java.lang.Integer int10 = executionEntity0.getExecutionListenerIndex();
        boolean boolean11 = executionEntity0.isScope();
        java.lang.Integer int12 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity0.getParent();
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        executionEntity0.forceUpdate();
        executionEntity0.setId("ScopeExecution[null]");
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList8 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        int int8 = executionEntity4.getSuspensionState();
        executionEntity4.setProcessDefinitionId("");
        executionEntity4.setCachedEntityState((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity4.getEventSubscriptions();
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.setConcurrent(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getSuperExecution();
        java.lang.Integer int7 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions("hi!");
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        java.lang.String str8 = executionEntity4.getBusinessKey();
        boolean boolean9 = executionEntity4.isProcessInstanceType();
        java.lang.String str10 = executionEntity4.getDeleteReason();
        java.lang.String str11 = executionEntity4.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = executionEntity4.getProcessBusinessKey();
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        java.lang.String str5 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity0.getStartingExecution();
        executionEntity0.setEventName("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity9.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl11 = executionEntity9.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl12 = executionEntity9.getProcessDefinition();
        boolean boolean13 = executionEntity9.isEnded();
        executionEntity9.setCachedEntityState((int) (byte) 10);
        executionEntity9.setScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity18.getSuperExecution();
        int int20 = executionEntity18.getRevisionNext();
        java.lang.String str21 = executionEntity18.getParentId();
        executionEntity18.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = executionEntity18.getProcessVariables();
        executionEntity9.setVariables(strMap24);
        executionEntity0.setVariablesLocal(strMap24);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl27 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity30 = executionEntity0.addIdentityLink("ConcurrentScopeExecution[null]", "ProcessInstance[hi!]");
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        executionEntity0.setTenantId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        java.lang.String str3 = executionEntity0.getTenantId();
        java.lang.String str4 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        executionEntity9.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity9.getReplacedBy();
        executionEntity0.setSuperExecution(executionEntity9);
        boolean boolean17 = executionEntity0.isDeleteRoot();
        java.lang.String str18 = executionEntity0.getBusinessKey();
        java.lang.Integer int19 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList20 = executionEntity0.getJobs();
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.setScope(true);
        executionEntity0.setCachedEntityState((int) (byte) -1);
        java.lang.String str8 = executionEntity0.getCurrentActivityName();
        java.lang.String str9 = executionEntity0.getEventName();
        executionEntity0.setRevision(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        executionEntity4.setEventScope(false);
        java.lang.String str10 = executionEntity4.getProcessInstanceId();
        java.lang.String str11 = executionEntity4.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList13 = executionEntity4.getCompensateEventSubscriptions("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getId();
        int int7 = executionEntity0.getSuspensionState();
        boolean boolean8 = executionEntity0.isActive();
        boolean boolean9 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.involveUser("ProcessInstance[hi!]", "ProcessInstance[hi!]");
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        executionEntity0.setScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity9.getSuperExecution();
        int int11 = executionEntity9.getRevisionNext();
        java.lang.String str12 = executionEntity9.getParentId();
        executionEntity9.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity9.getProcessVariables();
        executionEntity0.setVariables(strMap15);
        executionEntity0.setEventScope(true);
        java.lang.String str19 = executionEntity0.getBusinessKey();
        executionEntity0.setSuspensionState((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        java.lang.String str5 = executionEntity0.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getParent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = executionEntity0.isActive("ProcessInstance[hi!]");
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        java.lang.String str5 = executionEntity0.getActivityId();
        java.lang.Object obj6 = executionEntity0.getPersistentState();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.addIdentityLink("ProcessInstance[hi!]", "ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(false);
        int int10 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = executionEntity0.getEventSource();
        int int6 = executionEntity0.getSuspensionState();
        executionEntity0.setParentId("ConcurrentScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        executionEntity0.disposeStartingExecution();
        boolean boolean8 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        boolean boolean5 = executionEntity0.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getProcessInstance();
        executionEntity0.setEventScope(false);
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[]");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        int int6 = executionEntity0.getSuspensionState();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 7);
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        java.lang.String str11 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        int int6 = executionEntity0.getSuspensionState();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 7);
        boolean boolean9 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        executionEntity4.setEventScope(false);
        java.lang.String str10 = executionEntity4.getCurrentActivityId();
        boolean boolean11 = executionEntity4.isScope();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution12 = executionEntity4.getStartingExecution();
        java.lang.String str13 = executionEntity4.getCurrentActivityId();
        executionEntity4.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity4.findExecution("hi!");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        executionEntity0.forceUpdate();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setBusinessKey("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getParent();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("");
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        java.lang.String str5 = executionEntity0.getParentId();
        executionEntity0.setCachedEntityState(10);
        executionEntity0.setCachedEntityState(1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getParent();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.forceUpdate();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        boolean boolean6 = executionEntity0.isSuspended();
        boolean boolean7 = executionEntity0.isConcurrent();
        java.lang.String str8 = executionEntity0.getEventName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity10.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl12 = executionEntity10.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl13 = executionEntity10.getProcessDefinition();
        boolean boolean14 = executionEntity10.isEnded();
        executionEntity10.setCachedEntityState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray17 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList18 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList18, variableInstanceEntityArray17);
        executionEntity10.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList18);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution21 = executionEntity10.getStartingExecution();
        executionEntity10.setTenantId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("", (java.lang.Object) executionEntity10);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement6 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        boolean boolean6 = executionEntity0.isConcurrent();
        executionEntity0.setCachedEntityState(10);
        org.activiti.engine.EngineServices engineServices9 = executionEntity0.getEngineServices();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        java.lang.String str5 = executionEntity0.getActivityId();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl7 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList8 = executionEntity0.getExecutions();
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        executionEntity0.setScope(true);
        executionEntity0.setParentId("");
        org.activiti.engine.EngineServices engineServices6 = executionEntity0.getEngineServices();
        int int7 = executionEntity0.getSuspensionState();
        executionEntity0.setRevision(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        int int4 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList6 = executionEntity0.getJobs();
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        executionEntity6.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity6.getProcessInstance();
        executionEntity6.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity6.setExecutionListenerIndex((java.lang.Integer) 0);
        boolean boolean14 = executionEntity6.isEventScope();
        java.lang.String str15 = executionEntity6.toString();
        executionEntity6.setSuspensionState(100);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl18 = executionEntity6.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList19 = executionEntity6.findActiveActivityIds();
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        executionEntity4.setEventScope(false);
        java.lang.String str10 = executionEntity4.getCurrentActivityId();
        boolean boolean11 = executionEntity4.isScope();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution12 = executionEntity4.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.deleteCascade("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        executionEntity9.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity9.getReplacedBy();
        executionEntity0.setSuperExecution(executionEntity9);
        java.lang.String str17 = executionEntity9.getSuperExecutionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity18.getSuperExecution();
        executionEntity18.disposeStartingExecution();
        executionEntity18.setEventName("");
        java.lang.String str23 = executionEntity18.getCurrentActivityId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution24 = executionEntity18.getStartingExecution();
        executionEntity18.setEventName("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = executionEntity27.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl29 = executionEntity27.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl30 = executionEntity27.getProcessDefinition();
        boolean boolean31 = executionEntity27.isEnded();
        executionEntity27.setCachedEntityState((int) (byte) 10);
        executionEntity27.setScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity37 = executionEntity36.getSuperExecution();
        int int38 = executionEntity36.getRevisionNext();
        java.lang.String str39 = executionEntity36.getParentId();
        executionEntity36.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = executionEntity36.getProcessVariables();
        executionEntity27.setVariables(strMap42);
        executionEntity18.setVariablesLocal(strMap42);
        executionEntity9.setVariables(strMap42);
        int int46 = executionEntity9.getRevisionNext();
        java.lang.String str47 = executionEntity9.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList48 = executionEntity9.getTasks();
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str6 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity9 = executionEntity0.addIdentityLink("ProcessInstance[hi!]", "Execution[null]");
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        boolean boolean7 = executionEntity4.isActive();
        executionEntity4.setTenantId("ProcessInstance[null]");
        executionEntity4.setEventScope(false);
        executionEntity4.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity4.setDeleteReason("ScopeExecution[null]");
        int int16 = executionEntity4.getRevision();
        java.lang.String str17 = executionEntity4.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = executionEntity4.isActive("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray7 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList8 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList8, variableInstanceEntityArray7);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList8);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution11 = executionEntity0.getStartingExecution();
        boolean boolean12 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity15 = executionEntity0.addIdentityLink("", "ConcurrentScopeExecution[null]");
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        executionEntity0.setId("");
        executionEntity0.setActive(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        java.lang.String str9 = executionEntity7.toString();
        executionEntity7.setDeleteReason("ProcessInstance[null]");
        java.lang.String str12 = executionEntity7.getActivityId();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = executionEntity7.getProcessVariables();
        executionEntity0.createVariablesLocal(strMap13);
        boolean boolean15 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList16 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity0.getProcessVariables();
        boolean boolean7 = executionEntity0.isEnded();
        java.lang.String str8 = executionEntity0.getCurrentActivityId();
        boolean boolean9 = executionEntity0.isScope();
        java.lang.String str10 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList11 = executionEntity0.getTasks();
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        executionEntity0.disposeStartingExecution();
        java.lang.String str8 = executionEntity0.toString();
        java.lang.String str9 = executionEntity0.getCurrentActivityName();
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setCachedEntityState((int) ' ');
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        int int13 = executionEntity9.getSuspensionState();
        executionEntity0.setSuperExecution(executionEntity9);
        boolean boolean15 = executionEntity9.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity16.getSuperExecution();
        java.lang.String str18 = executionEntity16.toString();
        executionEntity16.setCachedEntityState((int) ' ');
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str22 = executionEntity21.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = executionEntity21.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl24 = executionEntity21.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str26 = executionEntity25.getCurrentActivityId();
        executionEntity21.setSuperExecution(executionEntity25);
        org.activiti.engine.EngineServices engineServices28 = executionEntity25.getEngineServices();
        int int29 = executionEntity25.getSuspensionState();
        executionEntity16.setSuperExecution(executionEntity25);
        boolean boolean31 = executionEntity25.isConcurrent();
        boolean boolean32 = executionEntity25.isEventScope();
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = executionEntity25.getProcessVariables();
        executionEntity9.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = executionEntity9.updateProcessBusinessKey("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity0.getStartingExecution();
        java.lang.String str9 = executionEntity0.getDeleteReason();
        int int10 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList11 = executionEntity0.getJobs();
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        executionEntity0.setId("");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl5 = executionEntity0.getProcessDefinition();
        boolean boolean6 = executionEntity0.isScope();
        org.activiti.engine.EngineServices engineServices7 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList8 = executionEntity0.getTasks();
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity8.getSuperExecution();
        java.lang.String str10 = executionEntity8.toString();
        boolean boolean11 = executionEntity8.isDeleteRoot();
        executionEntity8.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity14.getSuperExecution();
        executionEntity14.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity14.getProcessInstance();
        executionEntity14.disposeStartingExecution();
        executionEntity8.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity20.getSuperExecution();
        java.lang.String str22 = executionEntity20.toString();
        executionEntity20.setDeleteReason("ProcessInstance[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = executionEntity20.getProcessVariables();
        executionEntity14.createVariablesLocal(strMap25);
        executionEntity4.setVariablesLocal(strMap25);
        java.lang.String str28 = executionEntity4.getBusinessKey();
        java.lang.String str29 = executionEntity4.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList30 = executionEntity4.getTasks();
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList7 = executionEntity0.getTasks();
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        java.lang.String str5 = executionEntity0.getParentId();
        executionEntity0.setCachedEntityState(10);
        executionEntity0.setCachedEntityState(1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getParent();
        executionEntity0.setConcurrent(true);
        java.lang.String str13 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        java.lang.String str3 = executionEntity0.getDeleteReason();
        boolean boolean4 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getProcessInstance();
        int int6 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.setScope(true);
        executionEntity0.setCachedEntityState((int) (byte) -1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getParent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity9.getSuperExecution();
        int int11 = executionEntity9.getRevisionNext();
        java.lang.String str12 = executionEntity9.getBusinessKey();
        executionEntity9.setScope(true);
        java.lang.String str15 = executionEntity9.getEventName();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity0.getCompensateEventSubscriptions("ScopeExecution[null]");
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        executionEntity4.disposeStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity4.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.initialize();
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        boolean boolean6 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = executionEntity0.isActive("Execution[null]");
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList3 = executionEntity0.getExecutions();
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        boolean boolean5 = executionEntity0.isScope();
        java.lang.String str6 = executionEntity0.getActivityId();
        java.lang.String str7 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        boolean boolean7 = executionEntity0.isConcurrent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity0.setEventName("ProcessInstance[hi!]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList12 = executionEntity0.getExecutions();
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        executionEntity0.setRevision((int) (short) 1);
        java.lang.String str7 = executionEntity0.toString();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        boolean boolean10 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList11 = executionEntity0.getTasks();
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        executionEntity6.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity6.getProcessInstance();
        executionEntity6.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity6.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity6.setScope(false);
        java.lang.String str16 = executionEntity6.getProcessDefinitionId();
        java.lang.String str17 = executionEntity6.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList18 = executionEntity6.getIdentityLinks();
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isSuspended();
        executionEntity0.forceUpdate();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity0.getProcessVariables();
        executionEntity0.setDeleteReason("ProcessInstance[ScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList9 = executionEntity0.getTasks();
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        java.lang.String str5 = executionEntity0.getEventName();
        java.lang.String str6 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getProcessInstance();
        java.lang.String str8 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        executionEntity4.setEventScope(false);
        java.lang.String str10 = executionEntity4.getCurrentActivityId();
        boolean boolean11 = executionEntity4.isScope();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution12 = executionEntity4.getStartingExecution();
        java.lang.String str13 = executionEntity4.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList14 = executionEntity4.getEventSubscriptionsInternal();
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        boolean boolean6 = executionEntity0.isConcurrent();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        executionEntity0.setId("");
        executionEntity0.setActive(false);
        java.lang.String str7 = executionEntity0.toString();
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList10 = executionEntity0.getTasks();
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        java.lang.String str3 = executionEntity0.getCurrentActivityName();
        java.lang.String str4 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity7 = executionEntity0.involveUser("Execution[null]", "ProcessInstance[hi!]");
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        executionEntity0.setId("");
        executionEntity0.setActive(false);
        java.lang.String str7 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList8 = executionEntity0.getJobs();
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        java.lang.String str8 = executionEntity4.getId();
        executionEntity4.setParentId("hi!");
        java.lang.String str11 = executionEntity4.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity14 = executionEntity4.involveUser("hi!", "ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setCachedEntityState((int) ' ');
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        int int13 = executionEntity9.getSuspensionState();
        executionEntity0.setSuperExecution(executionEntity9);
        boolean boolean15 = executionEntity9.isConcurrent();
        int int16 = executionEntity9.getSuspensionState();
        java.lang.String str17 = executionEntity9.getCurrentActivityName();
        int int18 = executionEntity9.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity9.getEventSubscriptions();
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity0.getStartingExecution();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        java.lang.String str6 = executionEntity0.getParentId();
        executionEntity0.setScope(true);
        boolean boolean9 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("ProcessInstance[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl12 = executionEntity0.getProcessDefinition();
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        java.lang.String str2 = executionEntity0.getTenantId();
        org.activiti.engine.EngineServices engineServices3 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getParent();
        java.lang.String str5 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        executionEntity6.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity6.getProcessInstance();
        executionEntity6.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity12.getSuperExecution();
        java.lang.String str14 = executionEntity12.toString();
        executionEntity12.setDeleteReason("ProcessInstance[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity12.getProcessVariables();
        executionEntity6.createVariablesLocal(strMap17);
        int int19 = executionEntity6.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList20 = executionEntity6.getEventSubscriptions();
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setRevision((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        executionEntity9.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity9.getReplacedBy();
        executionEntity0.setSuperExecution(executionEntity9);
        executionEntity0.setParentId("hi!");
        java.lang.String str19 = executionEntity0.getDeleteReason();
        java.lang.Object obj20 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        int int8 = executionEntity4.getSuspensionState();
        boolean boolean9 = executionEntity4.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str11 = executionEntity10.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity10.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = executionEntity10.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str15 = executionEntity14.getCurrentActivityId();
        executionEntity10.setSuperExecution(executionEntity14);
        org.activiti.engine.EngineServices engineServices17 = executionEntity14.getEngineServices();
        int int18 = executionEntity14.getSuspensionState();
        executionEntity14.setProcessDefinitionId("");
        executionEntity14.setCachedEntityState((int) 'a');
        java.lang.String str23 = executionEntity14.getTenantId();
        java.lang.String str24 = executionEntity14.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        boolean boolean5 = executionEntity0.isEnded();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getParent();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement7 = executionEntity0.getEventSource();
        java.lang.String str8 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList9 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setParentId("ScopeExecution[null]");
        executionEntity0.setParentId("ProcessInstance[null]");
        java.lang.String str9 = executionEntity0.getCurrentActivityName();
        java.lang.Integer int10 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity13 = executionEntity0.addIdentityLink("ProcessInstance[null]", "Execution[null]");
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        executionEntity4.disposeStartingExecution();
        java.lang.String str9 = executionEntity4.getParentId();
        executionEntity4.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = executionEntity4.getProcessBusinessKey();
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        executionEntity6.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity6.getProcessInstance();
        executionEntity6.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity12.getSuperExecution();
        java.lang.String str14 = executionEntity12.toString();
        executionEntity12.setDeleteReason("ProcessInstance[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity12.getProcessVariables();
        executionEntity6.createVariablesLocal(strMap17);
        java.lang.String str19 = executionEntity6.getDeleteReason();
        java.lang.Object obj20 = executionEntity6.getPersistentState();
        java.lang.String str21 = executionEntity6.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList22 = executionEntity6.getEventSubscriptions();
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        java.lang.String str5 = executionEntity0.getActivityId();
        java.lang.Object obj6 = executionEntity0.getPersistentState();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransition();
        boolean boolean9 = executionEntity0.isEventScope();
        java.lang.String str10 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        executionEntity4.setEventScope(false);
        java.lang.String str10 = executionEntity4.getCurrentActivityId();
        boolean boolean11 = executionEntity4.isScope();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution12 = executionEntity4.getStartingExecution();
        java.lang.String str13 = executionEntity4.getCurrentActivityId();
        executionEntity4.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity17 = executionEntity4.addIdentityLink("ProcessInstance[ConcurrentScopeExecution[null]]", "");
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setParentId("hi!");
        int int12 = executionEntity0.getSuspensionState();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity16 = executionEntity0.involveUser("", "ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        int int8 = executionEntity4.getSuspensionState();
        boolean boolean9 = executionEntity4.isProcessInstanceType();
        executionEntity4.disposeStartingExecution();
        boolean boolean11 = executionEntity4.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = executionEntity4.updateProcessBusinessKey("ScopeExecution[null]");
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        boolean boolean5 = executionEntity0.isEnded();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getParent();
        java.lang.Integer int7 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        boolean boolean3 = executionEntity0.isEnded();
        executionEntity0.setDeleteReason("ProcessInstance[ConcurrentScopeExecution[null]]");
        executionEntity0.setParentId("ConcurrentScopeExecution[null]");
        java.lang.String str8 = executionEntity0.getParentId();
        executionEntity0.setBusinessKey("hi!");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl11 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.createExecution();
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.forceUpdate();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        java.lang.String str5 = executionEntity0.getParentId();
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setParentId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        int int8 = executionEntity4.getSuspensionState();
        executionEntity4.setProcessDefinitionId("");
        executionEntity4.setProcessDefinitionId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity15 = executionEntity4.involveUser("ProcessInstance[]", "ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity0.getProcessDefinition();
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        executionEntity0.setScope(true);
        executionEntity0.setConcurrent(false);
        executionEntity0.setScope(true);
        boolean boolean14 = executionEntity0.isConcurrent();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        java.lang.String str8 = executionEntity4.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity4.getSuperExecution();
        java.lang.String str10 = executionEntity4.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.start();
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        executionEntity0.setEventScope(false);
        java.lang.String str7 = executionEntity0.getEventName();
        executionEntity0.setRevision(53);
        int int10 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        executionEntity0.setEventScope(false);
        java.lang.String str7 = executionEntity0.getEventName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity8.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = executionEntity8.getProcessDefinition();
        java.lang.String str11 = executionEntity8.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str13 = executionEntity12.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity12.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity12.getTransition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution16 = executionEntity12.getStartingExecution();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity12.getProcessVariables();
        executionEntity8.setVariables(strMap17);
        executionEntity0.setVariables(strMap17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList20 = executionEntity0.getTasks();
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        executionEntity0.disposeStartingExecution();
        java.lang.String str8 = executionEntity0.toString();
        java.lang.String str9 = executionEntity0.getCurrentActivityName();
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList12 = executionEntity0.getTasks();
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity4.getSuperExecution();
        java.lang.String str6 = executionEntity4.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str8 = executionEntity7.getCurrentActivityId();
        boolean boolean9 = executionEntity7.isScope();
        executionEntity4.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        executionEntity0.setSuperExecution(executionEntity4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.initialize();
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        int int8 = executionEntity4.getSuspensionState();
        boolean boolean9 = executionEntity4.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity4.getCompensateEventSubscriptions();
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        executionEntity0.setTenantId("ConcurrentScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity8.getSuperExecution();
        java.lang.String str10 = executionEntity8.toString();
        boolean boolean11 = executionEntity8.isDeleteRoot();
        executionEntity8.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity14.getSuperExecution();
        executionEntity14.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity14.getProcessInstance();
        executionEntity14.disposeStartingExecution();
        executionEntity8.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity20.getSuperExecution();
        java.lang.String str22 = executionEntity20.toString();
        executionEntity20.setDeleteReason("ProcessInstance[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = executionEntity20.getProcessVariables();
        executionEntity14.createVariablesLocal(strMap25);
        executionEntity4.setVariablesLocal(strMap25);
        java.lang.String str28 = executionEntity4.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList29 = executionEntity4.getIdentityLinks();
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        int int6 = executionEntity0.getSuspensionState();
        executionEntity0.setActive(false);
        int int9 = executionEntity0.getRevisionNext();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        executionEntity0.setScope(true);
        boolean boolean9 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList10 = executionEntity0.getExecutions();
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        int int5 = executionEntity0.getRevision();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        java.lang.String str7 = executionEntity0.getId();
        java.lang.String str8 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList9 = executionEntity0.getTasks();
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        executionEntity0.forceUpdate();
        int int6 = executionEntity0.getCachedEntityState();
        executionEntity0.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList9 = executionEntity0.getTasks();
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        boolean boolean6 = executionEntity0.isConcurrent();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        int int6 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions("ScopeExecution[null]");
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        executionEntity9.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity9.getReplacedBy();
        executionEntity0.setSuperExecution(executionEntity9);
        java.lang.String str17 = executionEntity9.getSuperExecutionId();
        boolean boolean18 = executionEntity9.isScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement19 = executionEntity9.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean21 = executionEntity9.isActive("Execution[null]");
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        boolean boolean5 = executionEntity0.isScope();
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList8 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        boolean boolean6 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        boolean boolean7 = executionEntity4.isActive();
        executionEntity4.setTenantId("ProcessInstance[null]");
        executionEntity4.setExecutionListenerIndex((java.lang.Integer) 1);
        int int12 = executionEntity4.getRevisionNext();
        executionEntity4.setEventScope(false);
        executionEntity4.setProcessDefinitionId("");
        boolean boolean17 = executionEntity4.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList19 = executionEntity4.getCompensateEventSubscriptions("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isSuspended();
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[]");
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList6 = executionEntity0.getTasks();
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        java.lang.String str8 = executionEntity4.getBusinessKey();
        java.lang.String str9 = executionEntity4.getEventName();
        java.lang.String str10 = executionEntity4.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = executionEntity4.updateProcessBusinessKey("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        executionEntity6.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity6.getProcessInstance();
        executionEntity6.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity12.getSuperExecution();
        java.lang.String str14 = executionEntity12.toString();
        executionEntity12.setDeleteReason("ProcessInstance[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity12.getProcessVariables();
        executionEntity6.createVariablesLocal(strMap17);
        java.lang.String str19 = executionEntity6.getDeleteReason();
        executionEntity6.setDeleteReason("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity6.initialize();
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        java.lang.String str5 = executionEntity0.getActivityId();
        java.lang.String str6 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList7 = executionEntity0.getJobs();
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        int int8 = executionEntity4.getSuspensionState();
        executionEntity4.setProcessDefinitionId("");
        executionEntity4.setCachedEntityState((int) 'a');
        java.lang.String str13 = executionEntity4.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.insert();
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getTenantId();
        executionEntity0.setRevision((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList10 = executionEntity0.getJobs();
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        executionEntity0.setRevision((int) (short) 1);
        java.lang.String str7 = executionEntity0.toString();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setDeleteReason("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList14 = executionEntity0.getTasks();
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        boolean boolean5 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str8 = executionEntity0.getEventName();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList11 = executionEntity0.getExecutions();
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setCachedEntityState((int) ' ');
        executionEntity0.setDeleteReason("ProcessInstance[ConcurrentScopeExecution[null]]");
        boolean boolean7 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.forceUpdate();
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity0.setProcessDefinitionId("ProcessInstance[hi!]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        boolean boolean7 = executionEntity4.isActive();
        executionEntity4.setTenantId("ProcessInstance[null]");
        executionEntity4.setEventScope(false);
        executionEntity4.setRevision(10);
        java.lang.String str14 = executionEntity4.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity4.createExecution();
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        executionEntity0.setTenantId("ConcurrentScopeExecution[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity0.getEventSource();
        executionEntity0.setTenantId("ProcessInstance[hi!]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity13 = executionEntity0.addIdentityLink("ProcessInstance[]", "ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity0.getStartingExecution();
        java.lang.String str9 = executionEntity0.getDeleteReason();
        executionEntity0.setDeleteReason("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.createExecution();
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        java.lang.String str5 = executionEntity0.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity0.getProcessVariables();
        java.lang.String str9 = executionEntity0.getDeleteReason();
        java.lang.String str10 = executionEntity0.getDeleteReason();
        java.lang.Object obj11 = executionEntity0.getPersistentState();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList12 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity0.getCompensateEventSubscriptions("Execution[null]");
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.setConcurrent(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList8 = executionEntity0.getTasks();
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setCachedEntityState((int) ' ');
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        int int13 = executionEntity9.getSuspensionState();
        executionEntity0.setSuperExecution(executionEntity9);
        boolean boolean15 = executionEntity9.isConcurrent();
        int int16 = executionEntity9.getSuspensionState();
        java.lang.String str17 = executionEntity9.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList18 = executionEntity9.getEventSubscriptions();
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity7.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = executionEntity7.getProcessDefinition();
        boolean boolean11 = executionEntity7.isEnded();
        executionEntity7.setCachedEntityState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray14 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15, variableInstanceEntityArray14);
        executionEntity7.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList19 = executionEntity0.getQueryVariables();
        boolean boolean20 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity0.createExecution();
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        java.lang.String str4 = executionEntity0.toString();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = executionEntity0.getQueryVariables();
        executionEntity0.setBusinessKey("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl8 = executionEntity0.getProcessDefinition();
        java.lang.Object obj9 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        executionEntity0.setRevision(10);
        java.lang.String str10 = executionEntity0.toString();
        boolean boolean11 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList12 = executionEntity0.getTasks();
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        executionEntity9.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity9.getReplacedBy();
        executionEntity0.setSuperExecution(executionEntity9);
        java.lang.String str17 = executionEntity9.getSuperExecutionId();
        boolean boolean18 = executionEntity9.isScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement19 = executionEntity9.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity9.initialize();
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity5.getSuperExecution();
        int int7 = executionEntity5.getRevisionNext();
        java.lang.String str8 = executionEntity5.getParentId();
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = executionEntity5.getProcessVariables();
        executionEntity0.setVariables(strMap11);
        java.lang.String str13 = executionEntity0.getParentId();
        java.lang.String str14 = executionEntity0.getActivityId();
        boolean boolean15 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList16 = executionEntity0.getJobs();
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList5 = executionEntity0.getCompensateEventSubscriptions("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getId();
        boolean boolean8 = executionEntity0.isEnded();
        boolean boolean9 = executionEntity0.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str11 = executionEntity10.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity10.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = executionEntity10.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str15 = executionEntity14.getCurrentActivityId();
        executionEntity10.setSuperExecution(executionEntity14);
        java.lang.String str17 = executionEntity14.getProcessInstanceId();
        java.lang.String str18 = executionEntity14.getId();
        executionEntity14.setParentId("hi!");
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity14.removeIdentityLinks();
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        executionEntity0.setScope(true);
        executionEntity0.setParentId("");
        org.activiti.engine.EngineServices engineServices6 = executionEntity0.getEngineServices();
        int int7 = executionEntity0.getSuspensionState();
        executionEntity0.setRevision(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        executionEntity4.setEventScope(false);
        java.lang.String str10 = executionEntity4.getProcessInstanceId();
        java.lang.String str11 = executionEntity4.getEventName();
        java.lang.String str12 = executionEntity4.getId();
        executionEntity4.forceUpdate();
        java.lang.String str14 = executionEntity4.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = executionEntity4.updateProcessBusinessKey("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity8.getSuperExecution();
        java.lang.String str10 = executionEntity8.toString();
        boolean boolean11 = executionEntity8.isDeleteRoot();
        executionEntity8.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity14.getSuperExecution();
        executionEntity14.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity14.getProcessInstance();
        executionEntity14.disposeStartingExecution();
        executionEntity8.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity20.getSuperExecution();
        java.lang.String str22 = executionEntity20.toString();
        executionEntity20.setDeleteReason("ProcessInstance[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = executionEntity20.getProcessVariables();
        executionEntity14.createVariablesLocal(strMap25);
        executionEntity4.setVariablesLocal(strMap25);
        java.lang.String str28 = executionEntity4.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = executionEntity4.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity32 = executionEntity4.involveUser("", "hi!");
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        java.lang.String str8 = executionEntity4.getBusinessKey();
        java.lang.String str9 = executionEntity4.getEventName();
        boolean boolean10 = executionEntity4.isProcessInstanceType();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList11 = executionEntity4.getQueryVariables();
        executionEntity4.setActive(true);
        java.lang.String str14 = executionEntity4.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity4.findExecution("ProcessInstance[]");
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        boolean boolean7 = executionEntity0.isConcurrent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        int int10 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.findExecution("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test743");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        java.lang.String str5 = executionEntity0.getParentId();
        executionEntity0.setCachedEntityState(10);
        executionEntity0.setCachedEntityState(1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test744");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        executionEntity9.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity9.getReplacedBy();
        executionEntity0.setSuperExecution(executionEntity9);
        java.lang.String str17 = executionEntity0.getActivityId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList18 = executionEntity0.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity19.getSuperExecution();
        int int21 = executionEntity19.getRevisionNext();
        java.lang.String str22 = executionEntity19.getParentId();
        executionEntity19.setExecutionListenerIndex((java.lang.Integer) 1);
        executionEntity19.setTenantId("ConcurrentScopeExecution[null]");
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = executionEntity29.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl31 = executionEntity29.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution32 = executionEntity29.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = executionEntity29.getActivity();
        java.lang.String str34 = executionEntity29.getParentId();
        executionEntity29.setCachedEntityState(10);
        executionEntity29.setCachedEntityState(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity19.signal("hi!", (java.lang.Object) 1);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test745");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        java.lang.String str8 = executionEntity4.getBusinessKey();
        boolean boolean9 = executionEntity4.isScope();
        boolean boolean10 = executionEntity4.isDeleteRoot();
        boolean boolean11 = executionEntity4.isEnded();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity12.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl14 = executionEntity12.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl15 = executionEntity12.getProcessDefinition();
        boolean boolean16 = executionEntity12.isEnded();
        executionEntity12.setCachedEntityState((int) (byte) 10);
        java.lang.String str19 = executionEntity12.getSuperExecutionId();
        executionEntity12.setRevision(10);
        java.lang.String str22 = executionEntity12.getCurrentActivityName();
        executionEntity4.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList24 = executionEntity12.getExecutions();
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test746");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = executionEntity0.isActive("ProcessInstance[null]");
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test747");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        executionEntity4.setActive(true);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution10 = executionEntity4.getStartingExecution();
        boolean boolean11 = executionEntity4.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity14 = executionEntity4.involveUser("ProcessInstance[hi!]", "ConcurrentScopeExecution[null]");
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test748");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        java.lang.String str3 = executionEntity0.getDeleteReason();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity0.getStartingExecution();
        boolean boolean5 = executionEntity0.isConcurrent();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList7 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test749");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getCurrentActivityId();
        boolean boolean5 = executionEntity3.isScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        executionEntity0.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[hi!]");
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test750");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = executionEntity0.getEventSource();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str8 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test751");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        java.lang.String str3 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity4.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity4.getProcessDefinition();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        int int8 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.addIdentityLink("Execution[null]", "ProcessInstance[null]");
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test752");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getCurrentActivityId();
        boolean boolean5 = executionEntity3.isScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        executionEntity0.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test753");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        executionEntity6.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity6.getProcessInstance();
        executionEntity6.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity6.setExecutionListenerIndex((java.lang.Integer) 0);
        boolean boolean14 = executionEntity6.isEventScope();
        java.lang.String str15 = executionEntity6.toString();
        executionEntity6.setSuspensionState(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity20 = executionEntity6.addIdentityLink("", "ConcurrentScopeExecution[null]");
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test754");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test755");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        executionEntity0.setRevision(10);
        java.lang.String str10 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.createExecution();
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test756");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.forceUpdate();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        boolean boolean6 = executionEntity0.isSuspended();
        boolean boolean7 = executionEntity0.isConcurrent();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList8 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.findExecution("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test757");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity0.getStartingExecution();
        executionEntity0.setTenantId("ConcurrentScopeExecution[null]");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl11 = executionEntity0.getProcessDefinition();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList12 = executionEntity0.getQueryVariables();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ProcessInstance[ProcessInstance[null]]");
        java.lang.String str16 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity0.findExecution("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test758");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        int int8 = executionEntity6.getRevisionNext();
        java.lang.String str9 = executionEntity6.getParentId();
        executionEntity6.setExecutionListenerIndex((java.lang.Integer) 1);
        int int12 = executionEntity6.getSuspensionState();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity0.setCachedEntityState(1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl16 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str17 = executionEntity0.getProcessInstanceId();
        java.lang.String str18 = executionEntity0.getActivityId();
        executionEntity0.setSuspensionState((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList22 = executionEntity0.getCompensateEventSubscriptions("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test759");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        executionEntity9.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity9.getReplacedBy();
        executionEntity0.setSuperExecution(executionEntity9);
        boolean boolean17 = executionEntity0.isDeleteRoot();
        boolean boolean18 = executionEntity0.isEnded();
        java.lang.String str19 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList20 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test760");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getCurrentActivityId();
        boolean boolean5 = executionEntity3.isScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        executionEntity0.setScope(false);
        executionEntity0.inactivate();
        executionEntity0.setActive(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution12 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity0.findExecution("ScopeExecution[null]");
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test761");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        executionEntity6.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity6.getProcessInstance();
        executionEntity6.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity12.getSuperExecution();
        java.lang.String str14 = executionEntity12.toString();
        executionEntity12.setDeleteReason("ProcessInstance[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity12.getProcessVariables();
        executionEntity6.createVariablesLocal(strMap17);
        executionEntity6.setBusinessKey("");
        boolean boolean21 = executionEntity6.isSuspended();
        executionEntity6.setCachedEntityState(6);
        java.lang.String str24 = executionEntity6.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity27 = executionEntity6.involveUser("ProcessInstance[hi!]", "");
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test762");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.setConcurrent(true);
        java.lang.String str6 = executionEntity0.getProcessDefinitionId();
        boolean boolean7 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.updateProcessBusinessKey("");
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test763");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList5 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test764");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        boolean boolean6 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.createExecution();
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test765");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = executionEntity0.isActive("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test766");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setCachedEntityState((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test767");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity4.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity4.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.start();
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test768");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        int int8 = executionEntity6.getRevisionNext();
        java.lang.String str9 = executionEntity6.getParentId();
        executionEntity6.setExecutionListenerIndex((java.lang.Integer) 1);
        int int12 = executionEntity6.getSuspensionState();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str14 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity0.findExecution("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test769");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setParentId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices8 = executionEntity7.getEngineServices();
        executionEntity7.setBusinessKey("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = executionEntity7.getTransitionBeingTaken();
        executionEntity7.setTenantId("ProcessInstance[ConcurrentScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test770");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.setScope(true);
        executionEntity0.setCachedEntityState((int) (byte) -1);
        executionEntity0.setEventName("ScopeExecution[null]");
        boolean boolean10 = executionEntity0.isProcessInstanceType();
        java.lang.Object obj11 = executionEntity0.getPersistentState();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = executionEntity0.getProcessVariables();
        executionEntity0.setScope(false);
        boolean boolean15 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList16 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test771");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity4.getSuperExecution();
        java.lang.String str6 = executionEntity4.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str8 = executionEntity7.getCurrentActivityId();
        boolean boolean9 = executionEntity7.isScope();
        executionEntity4.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        executionEntity0.setSuperExecution(executionEntity4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity0.findExecution("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test772");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setCachedEntityState((int) ' ');
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        int int13 = executionEntity9.getSuspensionState();
        executionEntity0.setSuperExecution(executionEntity9);
        boolean boolean15 = executionEntity9.isConcurrent();
        boolean boolean16 = executionEntity9.isEventScope();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity9.getProcessVariables();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement18 = executionEntity9.getEventSource();
        executionEntity9.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity9.initialize();
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test773");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        java.lang.String str8 = executionEntity4.getBusinessKey();
        java.lang.String str9 = executionEntity4.getEventName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity4.getParent();
        java.lang.String str11 = executionEntity4.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity4.getCompensateEventSubscriptions();
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test774");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity7.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = executionEntity7.getProcessDefinition();
        boolean boolean11 = executionEntity7.isEnded();
        executionEntity7.setCachedEntityState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray14 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15, variableInstanceEntityArray14);
        executionEntity7.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList19 = executionEntity0.getQueryVariables();
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity0.setParentId("ProcessInstance[ConcurrentScopeExecution[null]]");
        boolean boolean24 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity0.getParent();
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test775");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity8.getSuperExecution();
        java.lang.String str10 = executionEntity8.toString();
        boolean boolean11 = executionEntity8.isDeleteRoot();
        executionEntity8.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity14.getSuperExecution();
        executionEntity14.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity14.getProcessInstance();
        executionEntity14.disposeStartingExecution();
        executionEntity8.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity20.getSuperExecution();
        java.lang.String str22 = executionEntity20.toString();
        executionEntity20.setDeleteReason("ProcessInstance[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = executionEntity20.getProcessVariables();
        executionEntity14.createVariablesLocal(strMap25);
        executionEntity4.setVariablesLocal(strMap25);
        boolean boolean28 = executionEntity4.isProcessInstanceType();
        executionEntity4.setProcessDefinitionId("ProcessInstance[null]");
        boolean boolean31 = executionEntity4.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = executionEntity4.getProcessBusinessKey();
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test776");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test777");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList6 = executionEntity0.getTasks();
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test778");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity4.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity4.involveUser("ProcessInstance[hi!]", "ConcurrentScopeExecution[null]");
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test779");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        executionEntity4.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity4.getCompensateEventSubscriptions("ScopeExecution[null]");
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test780");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        executionEntity9.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity9.getReplacedBy();
        executionEntity0.setSuperExecution(executionEntity9);
        java.lang.String str17 = executionEntity0.getProcessInstanceId();
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test781");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity4.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity4.getTransition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity4.getStartingExecution();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity4.getProcessVariables();
        executionEntity0.setVariables(strMap9);
        java.lang.String str11 = executionEntity0.toString();
        java.lang.String str12 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test782");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity7.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = executionEntity7.getProcessDefinition();
        boolean boolean11 = executionEntity7.isEnded();
        executionEntity7.setCachedEntityState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray14 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15, variableInstanceEntityArray14);
        executionEntity7.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        boolean boolean19 = executionEntity0.isEnded();
        executionEntity0.setId("ProcessInstance[null]");
        int int22 = executionEntity0.getRevision();
        java.lang.String str23 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = executionEntity0.updateProcessBusinessKey("hi!");
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test783");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        java.lang.String str5 = executionEntity0.getId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str8 = executionEntity0.getBusinessKey();
        boolean boolean9 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList10 = executionEntity0.getJobs();
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test784");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.forceUpdate();
        executionEntity0.setId("hi!");
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test785");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setParentId("ScopeExecution[null]");
        executionEntity0.setParentId("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity9.getSuperExecution();
        java.lang.String str11 = executionEntity9.toString();
        boolean boolean12 = executionEntity9.isDeleteRoot();
        executionEntity9.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity15.getSuperExecution();
        executionEntity15.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity15.getProcessInstance();
        executionEntity15.disposeStartingExecution();
        executionEntity9.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = executionEntity21.getSuperExecution();
        java.lang.String str23 = executionEntity21.toString();
        executionEntity21.setDeleteReason("ProcessInstance[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = executionEntity21.getProcessVariables();
        executionEntity15.createVariablesLocal(strMap26);
        executionEntity15.setBusinessKey("");
        boolean boolean30 = executionEntity15.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test786");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        java.lang.String str6 = executionEntity0.getCurrentActivityName();
        java.lang.Integer int7 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList8 = executionEntity0.getExecutions();
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test787");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getCurrentActivityId();
        boolean boolean5 = executionEntity3.isScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity3.getActivity();
        java.lang.String str8 = executionEntity3.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity3.getProcessBusinessKey();
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test788");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        java.lang.String str3 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity4.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity4.getProcessDefinition();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = executionEntity0.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test789");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        executionEntity0.setTenantId("ConcurrentScopeExecution[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity0.getEventSource();
        executionEntity0.setTenantId("ProcessInstance[hi!]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test790");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        int int3 = executionEntity0.getSuspensionState();
        java.lang.String str4 = executionEntity0.getEventName();
        java.lang.String str5 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList6 = executionEntity0.getTasks();
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test791");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        boolean boolean7 = executionEntity4.isActive();
        executionEntity4.setTenantId("ProcessInstance[null]");
        executionEntity4.setExecutionListenerIndex((java.lang.Integer) 1);
        int int12 = executionEntity4.getRevisionNext();
        executionEntity4.setEventScope(false);
        executionEntity4.setProcessDefinitionId("");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement17 = executionEntity4.getEventSource();
        boolean boolean18 = executionEntity4.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.removeIdentityLinks();
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test792");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        java.lang.String str5 = executionEntity0.getActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = executionEntity0.isActive("Execution[null]");
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test793");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        java.lang.String str8 = executionEntity4.getBusinessKey();
        boolean boolean9 = executionEntity4.isProcessInstanceType();
        java.lang.String str10 = executionEntity4.getDeleteReason();
        executionEntity4.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.destroyScope("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test794");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = executionEntity0.getEventSource();
        executionEntity0.setRevision((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test795");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity7.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = executionEntity7.getProcessDefinition();
        boolean boolean11 = executionEntity7.isEnded();
        executionEntity7.setCachedEntityState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray14 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15, variableInstanceEntityArray14);
        executionEntity7.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList19 = executionEntity0.getQueryVariables();
        boolean boolean20 = executionEntity0.isEventScope();
        boolean boolean21 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test796");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        int int8 = executionEntity4.getSuspensionState();
        executionEntity4.setProcessDefinitionId("");
        int int11 = executionEntity4.getRevision();
        boolean boolean12 = executionEntity4.isEnded();
        java.lang.String str13 = executionEntity4.getDeleteReason();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement14 = executionEntity4.getEventSource();
        java.lang.String str15 = executionEntity4.getTenantId();
        java.lang.String str16 = executionEntity4.getDeleteReason();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity4.getProcessVariables();
        boolean boolean18 = executionEntity4.isEventScope();
        executionEntity4.setExecutionListenerIndex((java.lang.Integer) 2);
        boolean boolean21 = executionEntity4.isEventScope();
        boolean boolean22 = executionEntity4.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList23 = executionEntity4.getEventSubscriptionsInternal();
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test797");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList5 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test798");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isSuspended();
        executionEntity0.setActive(false);
        java.lang.String str7 = executionEntity0.getEventName();
        executionEntity0.setSuspensionState((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity12 = executionEntity0.addIdentityLink("ScopeExecution[null]", "ProcessInstance[null]");
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test799");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        executionEntity0.setCachedEntityState((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test800");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setCachedEntityState((int) ' ');
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        int int13 = executionEntity9.getSuspensionState();
        executionEntity0.setSuperExecution(executionEntity9);
        boolean boolean15 = executionEntity9.isConcurrent();
        executionEntity9.setParentId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity9.initialize();
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test801");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        java.lang.String str3 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity4.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity4.getProcessDefinition();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions("hi!");
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test802");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        java.lang.String str8 = executionEntity4.getBusinessKey();
        java.lang.String str9 = executionEntity4.getEventName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity4.getSuperExecution();
        boolean boolean11 = executionEntity4.isConcurrent();
        int int12 = executionEntity4.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity4.findExecution("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test803");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        executionEntity6.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity6.getProcessInstance();
        executionEntity6.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity6.setExecutionListenerIndex((java.lang.Integer) 0);
        boolean boolean14 = executionEntity6.isEventScope();
        executionEntity6.disposeStartingExecution();
        java.lang.String str16 = executionEntity6.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = executionEntity6.isActive("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test804");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity0.getProcessDefinition();
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        executionEntity0.setScope(true);
        executionEntity0.setActive(true);
        int int12 = executionEntity0.getRevisionNext();
        int int13 = executionEntity0.getRevision();
        executionEntity0.setScope(true);
        boolean boolean16 = executionEntity0.isConcurrent();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test805");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList4 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test806");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        boolean boolean5 = executionEntity0.isEnded();
        executionEntity0.setTenantId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList8 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test807");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        executionEntity0.setEventScope(false);
        java.lang.String str7 = executionEntity0.getEventName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity8.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = executionEntity8.getProcessDefinition();
        java.lang.String str11 = executionEntity8.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str13 = executionEntity12.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity12.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity12.getTransition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution16 = executionEntity12.getStartingExecution();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity12.getProcessVariables();
        executionEntity8.setVariables(strMap17);
        executionEntity0.setVariables(strMap17);
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList22 = executionEntity0.getTasks();
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test808");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        boolean boolean5 = executionEntity0.isScope();
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        int int7 = executionEntity0.getCachedEntityState();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity0.getProcessVariables();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 101);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList11 = executionEntity0.getJobs();
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test809");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setParentId("ScopeExecution[null]");
        executionEntity0.setParentId("ProcessInstance[null]");
        java.lang.String str9 = executionEntity0.getCurrentActivityName();
        java.lang.Integer int10 = executionEntity0.getExecutionListenerIndex();
        boolean boolean11 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test810");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setBusinessKey("ProcessInstance[ConcurrentScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("Execution[null]");
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test811");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(false);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement10 = executionEntity0.getEventSource();
        boolean boolean11 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test812");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        executionEntity4.disposeStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity4.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity4.createExecution();
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test813");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity0.getProcessDefinition();
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        executionEntity0.setScope(true);
        executionEntity0.setActive(true);
        int int12 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity0.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity16 = executionEntity0.involveUser("ConcurrentScopeExecution[null]", "ProcessInstance[hi!]");
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test814");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getCurrentActivityId();
        boolean boolean5 = executionEntity3.isScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity3.getActivity();
        java.lang.String str8 = executionEntity3.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity3.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity3.createExecution();
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test815");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.setScope(true);
        executionEntity0.setCachedEntityState((int) (byte) -1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.addIdentityLink("ProcessInstance[ProcessInstance[null]]", "ProcessInstance[null]");
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test816");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = executionEntity0.getEventSource();
        java.lang.String str6 = executionEntity0.toString();
        java.lang.String str7 = executionEntity0.getParentId();
        boolean boolean8 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.involveUser("ProcessInstance[ScopeExecution[null]]", "");
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test817");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        executionEntity0.forceUpdate();
        executionEntity0.setId("ScopeExecution[null]");
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList8 = executionEntity0.getExecutions();
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test818");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        executionEntity0.setTenantId("hi!");
        boolean boolean4 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList5 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test819");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        executionEntity0.setBusinessKey("ScopeExecution[null]");
        java.lang.String str6 = executionEntity0.getCurrentActivityId();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = executionEntity0.isActive("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test820");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        java.lang.String str3 = executionEntity0.getTenantId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList5 = executionEntity0.getJobs();
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test821");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        boolean boolean5 = executionEntity0.isEnded();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getParent();
        java.lang.Integer int7 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test822");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setParentId("ScopeExecution[null]");
        executionEntity0.setParentId("ProcessInstance[null]");
        java.lang.String str9 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("");
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test823");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.Integer int3 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.setParentId("ScopeExecution[null]");
        executionEntity0.setSuspensionState((int) (byte) -1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity9.setScope(true);
        java.lang.String str13 = executionEntity9.getTenantId();
        java.lang.Object obj14 = executionEntity9.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("ProcessInstance[ConcurrentScopeExecution[null]]", (java.lang.Object) executionEntity9);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test824");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        boolean boolean7 = executionEntity0.isConcurrent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        boolean boolean10 = executionEntity0.isEnded();
        java.lang.String str11 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test825");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity0.getStartingExecution();
        java.lang.String str5 = executionEntity0.getProcessDefinitionId();
        boolean boolean6 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList7 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test826");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        java.lang.Object obj3 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[null]");
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test827");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        executionEntity0.setActive(true);
        executionEntity0.setScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity10.getSuperExecution();
        java.lang.String str12 = executionEntity10.toString();
        executionEntity10.setDeleteReason("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement15 = executionEntity10.getEventSource();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        boolean boolean17 = executionEntity0.isEnded();
        java.lang.String str18 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test828");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        java.lang.String str5 = executionEntity0.getId();
        java.lang.String str6 = executionEntity0.getActivityId();
        boolean boolean7 = executionEntity0.isEventScope();
        java.lang.String str8 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test829");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        java.lang.String str8 = executionEntity4.getId();
        java.lang.String str9 = executionEntity4.getParentId();
        executionEntity4.forceUpdate();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = executionEntity4.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList12 = executionEntity4.getEventSubscriptionsInternal();
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test830");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        executionEntity9.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity9.getReplacedBy();
        executionEntity0.setSuperExecution(executionEntity9);
        java.lang.String str17 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test831");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        java.lang.String str4 = executionEntity0.getParentId();
        java.lang.String str5 = executionEntity0.getCurrentActivityName();
        java.lang.String str6 = executionEntity0.getBusinessKey();
        java.lang.String str7 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.createExecution();
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test832");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        int int8 = executionEntity4.getSuspensionState();
        executionEntity4.setProcessDefinitionId("");
        executionEntity4.setCachedEntityState((int) 'a');
        executionEntity4.setCachedEntityState(1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity4.getTransitionBeingTaken();
        java.lang.String str16 = executionEntity4.getSuperExecutionId();
        executionEntity4.setDeleteReason("");
        executionEntity4.setActive(true);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = executionEntity4.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.destroyScope("hi!");
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test833");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setCachedEntityState((int) ' ');
        boolean boolean5 = executionEntity0.isEnded();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList7 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test834");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        executionEntity4.setEventScope(false);
        java.lang.String str10 = executionEntity4.getCurrentActivityId();
        boolean boolean11 = executionEntity4.isScope();
        java.lang.String str12 = executionEntity4.getProcessDefinitionId();
        int int13 = executionEntity4.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity4.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = executionEntity4.isActive("ProcessInstance[hi!]");
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test835");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity0.getProcessDefinition();
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        executionEntity0.setScope(true);
        executionEntity0.setActive(true);
        int int12 = executionEntity0.getRevisionNext();
        java.lang.String str13 = executionEntity0.getParentId();
        java.lang.String str14 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test836");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        executionEntity0.setRevision(10);
        java.lang.String str10 = executionEntity0.toString();
        boolean boolean11 = executionEntity0.isDeleteRoot();
        executionEntity0.setId("hi!");
        org.activiti.engine.impl.javax.el.ELContext eLContext14 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test837");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        java.lang.String str8 = executionEntity4.getBusinessKey();
        java.lang.String str9 = executionEntity4.getEventName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity4.getSuperExecution();
        boolean boolean11 = executionEntity4.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.start();
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test838");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        int int3 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.findExecution("ProcessInstance[]");
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test839");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList8 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test840");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isSuspended();
        executionEntity0.forceUpdate();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity0.getProcessVariables();
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[hi!]");
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test841");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        java.lang.String str8 = executionEntity4.getBusinessKey();
        boolean boolean9 = executionEntity4.isProcessInstanceType();
        executionEntity4.setEventName("ProcessInstance[null]");
        executionEntity4.setParentId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.start();
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test842");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray7 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList8 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList8, variableInstanceEntityArray7);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList8);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution11 = executionEntity0.getStartingExecution();
        int int12 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test843");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        boolean boolean7 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList8 = executionEntity0.getTasks();
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test844");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        java.lang.String str8 = executionEntity0.getProcessDefinitionId();
        java.lang.String str9 = executionEntity0.getDeleteReason();
        java.lang.String str10 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList11 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test845");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        boolean boolean7 = executionEntity4.isActive();
        executionEntity4.setTenantId("ProcessInstance[null]");
        executionEntity4.setExecutionListenerIndex((java.lang.Integer) 1);
        int int12 = executionEntity4.getRevisionNext();
        executionEntity4.setEventScope(false);
        executionEntity4.setProcessDefinitionId("");
        java.lang.String str17 = executionEntity4.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity4.getCompensateEventSubscriptions();
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test846");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        boolean boolean5 = executionEntity0.isScope();
        executionEntity0.setDeleteReason("ScopeExecution[null]");
        java.lang.String str8 = executionEntity0.getEventName();
        boolean boolean9 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test847");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext4 = executionEntity0.getCachedElContext();
        executionEntity0.setId("ProcessInstance[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test848");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        boolean boolean7 = executionEntity0.isConcurrent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        boolean boolean10 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test849");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        java.lang.String str8 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.involveUser("", "ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test850");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        int int4 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity7 = executionEntity0.addIdentityLink("", "Execution[null]");
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test851");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity7.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = executionEntity7.getProcessDefinition();
        boolean boolean11 = executionEntity7.isEnded();
        executionEntity7.setCachedEntityState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray14 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15, variableInstanceEntityArray14);
        executionEntity7.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList19 = executionEntity0.getQueryVariables();
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList22 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test852");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.setActive(false);
        org.activiti.engine.impl.javax.el.ELContext eLContext8 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test853");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity5.getSuperExecution();
        int int7 = executionEntity5.getRevisionNext();
        java.lang.String str8 = executionEntity5.getParentId();
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = executionEntity5.getProcessVariables();
        executionEntity0.setVariables(strMap11);
        java.lang.String str13 = executionEntity0.getParentId();
        java.lang.String str14 = executionEntity0.getActivityId();
        boolean boolean15 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity0.findExecution("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test854");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.Integer int3 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.setDeleteReason("ConcurrentScopeExecution[null]");
        executionEntity0.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList8 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test855");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity0.getStartingExecution();
        java.lang.String str9 = executionEntity0.getDeleteReason();
        executionEntity0.setDeleteReason("");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList15 = executionEntity0.getExecutions();
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test856");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        int int8 = executionEntity4.getSuspensionState();
        boolean boolean9 = executionEntity4.isEventScope();
        executionEntity4.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.destroyScope("");
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test857");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        executionEntity6.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity6.getProcessInstance();
        executionEntity6.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity6.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity6.setScope(false);
        int int16 = executionEntity6.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = executionEntity6.getProcessBusinessKey();
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test858");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = executionEntity0.getEventSource();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test859");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        boolean boolean5 = executionEntity0.isEventScope();
        boolean boolean6 = executionEntity0.isEventScope();
        java.lang.String str7 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setSuspensionState((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test860");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.setScope(true);
        java.lang.String str6 = executionEntity0.getEventName();
        executionEntity0.setParentId("");
        java.lang.String str9 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.createExecution();
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test861");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[hi!]");
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test862");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        java.lang.String str4 = executionEntity0.toString();
        executionEntity0.setCachedEntityState((int) (byte) 0);
        executionEntity0.inactivate();
        executionEntity0.setRevision(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.createExecution();
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test863");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        executionEntity6.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity6.getProcessInstance();
        executionEntity6.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity6.setExecutionListenerIndex((java.lang.Integer) 0);
        boolean boolean14 = executionEntity6.isEventScope();
        executionEntity6.disposeStartingExecution();
        java.lang.String str16 = executionEntity6.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity6.createExecution();
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test864");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        executionEntity6.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity6.getProcessInstance();
        executionEntity6.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity6.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity6.setScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity6.getReplacedBy();
        org.activiti.engine.impl.javax.el.ELContext eLContext17 = executionEntity6.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList18 = executionEntity6.getEventSubscriptionsInternal();
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test865");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        int int8 = executionEntity4.getSuspensionState();
        executionEntity4.setProcessDefinitionId("");
        executionEntity4.setCachedEntityState((int) 'a');
        executionEntity4.setCachedEntityState(1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity4.getTransitionBeingTaken();
        java.lang.String str16 = executionEntity4.getSuperExecutionId();
        executionEntity4.setEventName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.end();
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test866");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setCachedEntityState((int) ' ');
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        int int13 = executionEntity9.getSuspensionState();
        executionEntity0.setSuperExecution(executionEntity9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test867");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        executionEntity0.setScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity9.getSuperExecution();
        int int11 = executionEntity9.getRevisionNext();
        java.lang.String str12 = executionEntity9.getParentId();
        executionEntity9.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity9.getProcessVariables();
        executionEntity0.setVariables(strMap15);
        executionEntity0.setEventScope(true);
        java.lang.String str19 = executionEntity0.getBusinessKey();
        executionEntity0.setSuspensionState((int) (short) 1);
        org.activiti.engine.impl.javax.el.ELContext eLContext22 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = executionEntity0.createExecution();
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test868");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        java.lang.String str6 = executionEntity0.getCurrentActivityName();
        java.lang.String str7 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test869");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        executionEntity4.setEventScope(false);
        java.lang.String str10 = executionEntity4.getProcessInstanceId();
        java.lang.String str11 = executionEntity4.getEventName();
        java.lang.String str12 = executionEntity4.getId();
        executionEntity4.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList14 = executionEntity4.getTasks();
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test870");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test871");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.forceUpdate();
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test872");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setCachedEntityState((int) ' ');
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        int int13 = executionEntity9.getSuspensionState();
        executionEntity0.setSuperExecution(executionEntity9);
        boolean boolean15 = executionEntity9.isConcurrent();
        executionEntity9.setParentId("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution18 = executionEntity9.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList19 = executionEntity9.getCompensateEventSubscriptions();
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test873");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        boolean boolean6 = executionEntity0.isConcurrent();
        executionEntity0.setCachedEntityState(10);
        executionEntity0.setId("hi!");
        executionEntity0.setDeleteReason("Execution[null]");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("hi!");
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test874");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.forceUpdate();
        executionEntity0.setId("hi!");
        java.lang.String str7 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.updateProcessBusinessKey("ProcessInstance[]");
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test875");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        executionEntity0.setScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity9.getSuperExecution();
        int int11 = executionEntity9.getRevisionNext();
        java.lang.String str12 = executionEntity9.getParentId();
        executionEntity9.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity9.getProcessVariables();
        executionEntity0.setVariables(strMap15);
        java.lang.String str17 = executionEntity0.getProcessInstanceId();
        java.lang.Object obj18 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList19 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test876");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        executionEntity6.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity6.getProcessInstance();
        executionEntity6.disposeStartingExecution();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity12.getSuperExecution();
        java.lang.String str14 = executionEntity12.toString();
        executionEntity12.setDeleteReason("ProcessInstance[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity12.getProcessVariables();
        executionEntity6.createVariablesLocal(strMap17);
        java.lang.String str19 = executionEntity6.getDeleteReason();
        java.lang.String str20 = executionEntity6.getId();
        int int21 = executionEntity6.getSuspensionState();
        java.lang.String str22 = executionEntity6.toString();
        java.lang.String str23 = executionEntity6.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity26 = executionEntity6.involveUser("ProcessInstance[]", "hi!");
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test877");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        boolean boolean5 = executionEntity0.isEventScope();
        boolean boolean6 = executionEntity0.isEventScope();
        executionEntity0.setEventName("hi!");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution9 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str12 = executionEntity11.getCurrentActivityId();
        boolean boolean13 = executionEntity11.isScope();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl14 = executionEntity11.getProcessDefinition();
        boolean boolean15 = executionEntity11.isSuspended();
        int int16 = executionEntity11.getRevision();
        int int17 = executionEntity11.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("Execution[null]", (java.lang.Object) executionEntity11);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test878");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray7 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList8 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList8, variableInstanceEntityArray7);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList8);
        java.lang.String str11 = executionEntity0.getParentId();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList13 = executionEntity0.getCompensateEventSubscriptions("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test879");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity0.getStartingExecution();
        java.lang.String str9 = executionEntity0.getDeleteReason();
        executionEntity0.setDeleteReason("");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 7);
        executionEntity0.setSuspensionState(7);
        executionEntity0.setId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test880");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        java.lang.String str8 = executionEntity4.getBusinessKey();
        java.lang.String str9 = executionEntity4.getEventName();
        boolean boolean10 = executionEntity4.isProcessInstanceType();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = executionEntity4.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.removeIdentityLinks();
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test881");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        boolean boolean4 = executionEntity0.isScope();
        executionEntity0.setDeleteReason("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test882");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        java.lang.String str2 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList3 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test883");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity7.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl10 = executionEntity7.getProcessDefinition();
        boolean boolean11 = executionEntity7.isEnded();
        executionEntity7.setCachedEntityState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray14 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15, variableInstanceEntityArray14);
        executionEntity7.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList15);
        boolean boolean19 = executionEntity0.isEnded();
        executionEntity0.setId("ProcessInstance[null]");
        int int22 = executionEntity0.getRevision();
        boolean boolean23 = executionEntity0.isActive();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList24 = executionEntity0.getQueryVariables();
        boolean boolean25 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = executionEntity0.createExecution();
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test884");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.setScope(true);
        executionEntity0.setCachedEntityState((int) (byte) -1);
        java.lang.String str8 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList9 = executionEntity0.getTasks();
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test885");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        boolean boolean6 = executionEntity0.isConcurrent();
        executionEntity0.setCachedEntityState(10);
        executionEntity0.setId("hi!");
        executionEntity0.setDeleteReason("Execution[null]");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity16 = executionEntity0.addIdentityLink("ProcessInstance[ScopeExecution[null]]", "ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test886");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray7 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList8 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList8, variableInstanceEntityArray7);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test887");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setBusinessKey("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.addIdentityLink("ConcurrentScopeExecution[null]", "ProcessInstance[null]");
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test888");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = executionEntity0.getEventSource();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        org.activiti.engine.EngineServices engineServices7 = executionEntity0.getEngineServices();
        boolean boolean8 = executionEntity0.isSuspended();
        executionEntity0.setParentId("");
        executionEntity0.setCachedEntityState((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test889");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        boolean boolean7 = executionEntity4.isActive();
        executionEntity4.setTenantId("ProcessInstance[null]");
        executionEntity4.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = executionEntity4.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity4.findExecution("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test890");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        java.lang.String str5 = executionEntity0.getParentId();
        executionEntity0.setCachedEntityState(10);
        executionEntity0.setCachedEntityState(1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getParent();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity15 = executionEntity0.addIdentityLink("ProcessInstance[ConcurrentScopeExecution[null]]", "");
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test891");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.createExecution();
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test892");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity6 = executionEntity0.involveUser("ProcessInstance[ScopeExecution[null]]", "ConcurrentScopeExecution[null]");
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test893");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        java.lang.Object obj3 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("hi!");
        boolean boolean6 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions("");
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test894");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        java.lang.String str8 = executionEntity4.getBusinessKey();
        boolean boolean9 = executionEntity4.isProcessInstanceType();
        java.lang.String str10 = executionEntity4.getDeleteReason();
        java.lang.String str11 = executionEntity4.getBusinessKey();
        boolean boolean12 = executionEntity4.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity4.getSubProcessInstance();
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test895");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity5.getSuperExecution();
        int int7 = executionEntity5.getRevisionNext();
        java.lang.String str8 = executionEntity5.getParentId();
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = executionEntity5.getProcessVariables();
        executionEntity0.setVariables(strMap11);
        java.lang.String str13 = executionEntity0.getParentId();
        java.lang.String str14 = executionEntity0.getActivityId();
        int int15 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity18 = executionEntity0.involveUser("ProcessInstance[ConcurrentScopeExecution[null]]", "ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test896");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        executionEntity0.setBusinessKey("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test897");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        executionEntity9.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity9.getReplacedBy();
        executionEntity0.setSuperExecution(executionEntity9);
        java.lang.String str17 = executionEntity0.getProcessInstanceId();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList19 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test898");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str6 = executionEntity5.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity5.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity5.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        executionEntity5.setSuperExecution(executionEntity9);
        org.activiti.engine.EngineServices engineServices12 = executionEntity9.getEngineServices();
        executionEntity9.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity9.getReplacedBy();
        executionEntity0.setSuperExecution(executionEntity9);
        java.lang.String str17 = executionEntity9.getSuperExecutionId();
        boolean boolean18 = executionEntity9.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity9.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity22 = executionEntity9.addIdentityLink("ScopeExecution[null]", "ProcessInstance[ProcessInstance[null]]");
    }
}

