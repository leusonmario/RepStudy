import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setSuperExecution(executionEntity4);
        boolean boolean6 = executionEntity3.isEventScope();
        boolean boolean7 = executionEntity3.isEnded();
        boolean boolean8 = executionEntity3.isEnded();
        java.lang.String str9 = executionEntity3.getActivityId();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        executionEntity0.setActive(false);
        executionEntity0.setScope(true);
        boolean boolean15 = executionEntity0.isDeleteRoot();
        java.lang.String str16 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity20 = executionEntity0.involveUser("ProcessInstance[null]", "ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = executionEntity0.isActive("");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setDeleteReason("");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 4);
        java.lang.String str11 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = executionEntity0.updateProcessBusinessKey("");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getParent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        boolean boolean7 = executionEntity0.isDeleteRoot();
        java.lang.String str8 = executionEntity0.getId();
        executionEntity0.setId("ProcessInstance[]");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 4);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity0.getEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = executionEntity0.isActive("hi!");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        java.lang.String str5 = executionEntity1.getProcessDefinitionId();
        java.lang.String str6 = executionEntity1.getProcessDefinitionId();
        int int7 = executionEntity1.getSuspensionState();
        executionEntity1.setId("hi!");
        executionEntity1.setProcessDefinitionId("");
        executionEntity1.setProcessDefinitionId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.insert();
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity2.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        executionEntity2.setSuperExecution(executionEntity5);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl14 = executionEntity0.getProcessDefinition();
        executionEntity0.setCachedEntityState((int) (byte) 1);
        executionEntity0.setSuspensionState(2);
        boolean boolean19 = executionEntity0.isEventScope();
        executionEntity0.setEventScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity22.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = executionEntity22.getActivity();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray26 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList27 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList27, variableInstanceEntityArray26);
        executionEntity22.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList27);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution30 = executionEntity22.getStartingExecution();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean33 = executionEntity22.isActive("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getCachedEntityState();
        executionEntity0.setCachedEntityState((int) '4');
        java.lang.String str6 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList7 = executionEntity0.getExecutions();
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList6 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        int int5 = executionEntity0.getRevision();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setEventScope(false);
        executionEntity1.setProcessDefinitionId("ScopeExecution[null]");
        java.lang.String str10 = executionEntity1.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity1.getEventSubscriptionsInternal();
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isConcurrent();
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList7 = executionEntity0.getTasks();
        boolean boolean8 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        int int2 = executionEntity0.getRevision();
        java.lang.String str3 = executionEntity0.getActivityId();
        java.lang.String str4 = executionEntity0.getActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity4.getCompensateEventSubscriptions();
        boolean boolean8 = executionEntity4.isEventScope();
        org.activiti.engine.EngineServices engineServices9 = executionEntity4.getEngineServices();
        java.lang.String str10 = executionEntity4.getId();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        org.activiti.engine.EngineServices engineServices12 = executionEntity4.getEngineServices();
        java.lang.String str13 = executionEntity4.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.deleteCascade("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransition();
        java.lang.String str5 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.EngineServices engineServices6 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList7 = executionEntity0.getJobs();
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setDeleteReason("");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setSuspensionState((int) (short) -1);
        java.lang.String str12 = executionEntity0.getCurrentActivityId();
        executionEntity0.inactivate();
        executionEntity0.setEventScope(true);
        int int16 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement17 = executionEntity0.getEventSource();
        executionEntity0.setDeleteReason("ProcessInstance[ProcessInstance[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getProcessInstance();
        executionEntity0.setDeleteReason("");
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity14.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList17 = executionEntity14.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList18 = executionEntity14.getEventSubscriptionsInternal();
        java.lang.String str19 = executionEntity14.getActivityId();
        boolean boolean20 = executionEntity14.isProcessInstanceType();
        executionEntity11.setSuperExecution(executionEntity14);
        executionEntity11.setActive(false);
        executionEntity11.disposeStartingExecution();
        boolean boolean25 = executionEntity11.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity11);
        java.lang.String str27 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl28 = executionEntity0.getActivity();
        boolean boolean29 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = executionEntity0.findExecution("");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        java.lang.String str5 = executionEntity0.getDeleteReason();
        java.lang.String str6 = executionEntity0.getDeleteReason();
        java.lang.String str7 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity0.getTransition();
        java.lang.String str13 = executionEntity0.getCurrentActivityId();
        java.lang.String str14 = executionEntity0.getCurrentActivityName();
        executionEntity0.setEventScope(true);
        java.lang.String str17 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = executionEntity0.getActivity();
        int int19 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[null]");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isSuspended();
        int int8 = executionEntity0.getRevision();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList13 = executionEntity10.getCompensateEventSubscriptions();
        executionEntity10.setTenantId("hi!");
        boolean boolean16 = executionEntity10.isConcurrent();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement17 = executionEntity10.getEventSource();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl18 = executionEntity10.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("ConcurrentScopeExecution[null]", (java.lang.Object) executionEntity10);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        java.lang.String str8 = executionEntity3.getActivityId();
        boolean boolean9 = executionEntity3.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity3);
        executionEntity3.setBusinessKey("ProcessInstance[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList13 = executionEntity3.getExecutions();
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isSuspended();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransition();
        java.lang.Integer int9 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isScope();
        executionEntity0.setId("");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity0.getEventSubscriptions();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity0.setSuspensionState((int) (short) 100);
        java.lang.String str16 = executionEntity0.getDeleteReason();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl17 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        int int4 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.createExecution();
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity5.insert();
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[]");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity1.getActivity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList11 = executionEntity8.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList12 = executionEntity8.getEventSubscriptionsInternal();
        executionEntity8.setConcurrent(true);
        java.lang.Object obj15 = executionEntity8.getPersistentState();
        executionEntity8.setBusinessKey("");
        executionEntity8.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl20 = executionEntity8.getTransition();
        java.lang.String str21 = executionEntity8.getCurrentActivityId();
        boolean boolean22 = executionEntity8.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices24 = executionEntity23.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity25.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity28.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList31 = executionEntity28.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList32 = executionEntity28.getEventSubscriptionsInternal();
        java.lang.String str33 = executionEntity28.getActivityId();
        boolean boolean34 = executionEntity28.isProcessInstanceType();
        executionEntity25.setSuperExecution(executionEntity28);
        executionEntity23.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity28);
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = executionEntity23.getProcessVariables();
        executionEntity8.createVariablesLocal(strMap37);
        executionEntity1.setVariablesLocal(strMap37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.destroyScope("");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        java.lang.String str8 = executionEntity3.getActivityId();
        boolean boolean9 = executionEntity3.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity3);
        executionEntity0.setActive(false);
        executionEntity0.disposeStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList14 = executionEntity0.getEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList15 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        int int4 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getBusinessKey();
        java.lang.String str8 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList9 = executionEntity0.getExecutions();
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.String str8 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution9 = executionEntity0.getStartingExecution();
        java.lang.String str10 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.javax.el.ELContext eLContext11 = executionEntity0.getCachedElContext();
        org.activiti.engine.EngineServices engineServices12 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity0.createExecution();
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity2.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        executionEntity2.setSuperExecution(executionEntity5);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity15.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity15.getEventSubscriptionsInternal();
        executionEntity15.setConcurrent(true);
        executionEntity15.setDeleteReason("");
        executionEntity0.setSuperExecution(executionEntity15);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = executionEntity15.getActivity();
        executionEntity15.setScope(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList28 = executionEntity15.getEventSubscriptions();
        boolean boolean29 = executionEntity15.isActive();
        java.lang.String str30 = executionEntity15.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity33 = executionEntity15.addIdentityLink("ProcessInstance[ProcessInstance[null]]", "ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setSuperExecution(executionEntity4);
        boolean boolean6 = executionEntity3.isEventScope();
        boolean boolean7 = executionEntity3.isEnded();
        boolean boolean8 = executionEntity3.isEnded();
        java.lang.String str9 = executionEntity3.getActivityId();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        executionEntity0.setActive(false);
        executionEntity0.setScope(true);
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity0.findExecution("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        boolean boolean7 = executionEntity0.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity11.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList15 = executionEntity11.getEventSubscriptionsInternal();
        java.lang.String str16 = executionEntity11.getActivityId();
        boolean boolean17 = executionEntity11.isProcessInstanceType();
        executionEntity8.setSuperExecution(executionEntity11);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices20 = executionEntity19.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity21.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity24.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList27 = executionEntity24.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList28 = executionEntity24.getEventSubscriptionsInternal();
        java.lang.String str29 = executionEntity24.getActivityId();
        boolean boolean30 = executionEntity24.isProcessInstanceType();
        executionEntity21.setSuperExecution(executionEntity24);
        executionEntity19.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = executionEntity19.getProcessVariables();
        executionEntity11.setVariablesLocal(strMap33);
        executionEntity0.setVariables(strMap33);
        boolean boolean36 = executionEntity0.isActive();
        java.lang.String str37 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity38 = executionEntity0.createExecution();
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        java.lang.String str10 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        java.lang.String str6 = executionEntity0.getActivityId();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        boolean boolean8 = executionEntity0.isEnded();
        java.lang.String str9 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setCachedEntityState((-1));
        java.lang.Object obj12 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList13 = executionEntity0.getTasks();
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        java.lang.String str5 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getParent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str8 = executionEntity7.getEventName();
        executionEntity7.setCachedEntityState((int) (short) 10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity11.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList15 = executionEntity11.getEventSubscriptionsInternal();
        executionEntity11.setConcurrent(true);
        executionEntity11.setActive(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution20 = executionEntity11.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity21.setCachedEntityState((int) (short) 100);
        executionEntity21.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = executionEntity21.getProcessVariables();
        executionEntity11.setVariables(strMap26);
        executionEntity11.setEventScope(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = executionEntity11.getProcessVariables();
        executionEntity7.createVariablesLocal(strMap30);
        executionEntity0.setVariablesLocal(strMap30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList33 = executionEntity0.getExecutions();
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices6 = executionEntity5.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList13 = executionEntity10.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList14 = executionEntity10.getEventSubscriptionsInternal();
        java.lang.String str15 = executionEntity10.getActivityId();
        boolean boolean16 = executionEntity10.isProcessInstanceType();
        executionEntity7.setSuperExecution(executionEntity10);
        executionEntity5.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = executionEntity5.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList23 = executionEntity20.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList24 = executionEntity20.getEventSubscriptionsInternal();
        executionEntity20.setConcurrent(true);
        executionEntity20.setDeleteReason("");
        executionEntity5.setSuperExecution(executionEntity20);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl30 = executionEntity20.getActivity();
        executionEntity20.setScope(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList33 = executionEntity20.getEventSubscriptions();
        executionEntity20.setRevision((int) (byte) 10);
        java.lang.String str36 = executionEntity20.getEventName();
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = executionEntity20.getProcessVariables();
        executionEntity1.setVariables(strMap37);
        java.lang.String str39 = executionEntity1.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList40 = executionEntity1.getCompensateEventSubscriptions();
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity0.getTransition();
        java.lang.String str13 = executionEntity0.getCurrentActivityId();
        boolean boolean14 = executionEntity0.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices16 = executionEntity15.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList23 = executionEntity20.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList24 = executionEntity20.getEventSubscriptionsInternal();
        java.lang.String str25 = executionEntity20.getActivityId();
        boolean boolean26 = executionEntity20.isProcessInstanceType();
        executionEntity17.setSuperExecution(executionEntity20);
        executionEntity15.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = executionEntity15.getProcessVariables();
        executionEntity0.createVariablesLocal(strMap29);
        java.lang.Object obj31 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        boolean boolean7 = executionEntity0.isEventScope();
        executionEntity0.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = executionEntity0.getActivity();
        executionEntity0.setEventName("ProcessInstance[null]");
        java.lang.String str13 = executionEntity0.getCurrentActivityId();
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList14 = executionEntity0.getTasks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = executionEntity0.updateProcessBusinessKey("ProcessInstance[hi!]");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        executionEntity0.setActive(false);
        int int7 = executionEntity0.getRevisionNext();
        java.lang.String str8 = executionEntity0.getId();
        java.lang.String str9 = executionEntity0.getDeleteReason();
        executionEntity0.setTenantId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList12 = executionEntity0.getExecutions();
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = executionEntity0.getActivity();
        executionEntity0.inactivate();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity7 = executionEntity0.addIdentityLink("", "ProcessInstance[hi!]");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        java.lang.String str5 = executionEntity1.getId();
        java.lang.String str6 = executionEntity1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList7 = executionEntity1.getJobs();
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        boolean boolean7 = executionEntity0.isEnded();
        executionEntity0.setDeleteReason("hi!");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        java.lang.String str12 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity0.findExecution("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setEventScope(false);
        executionEntity1.setProcessDefinitionId("ScopeExecution[null]");
        java.lang.String str10 = executionEntity1.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList11 = executionEntity1.getTasks();
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        int int2 = executionEntity0.getRevision();
        java.lang.String str3 = executionEntity0.getActivityId();
        java.lang.String str4 = executionEntity0.getActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity4.getCompensateEventSubscriptions();
        boolean boolean8 = executionEntity4.isEventScope();
        org.activiti.engine.EngineServices engineServices9 = executionEntity4.getEngineServices();
        java.lang.String str10 = executionEntity4.getId();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        org.activiti.engine.EngineServices engineServices12 = executionEntity4.getEngineServices();
        java.lang.String str13 = executionEntity4.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.deleteCascade("ScopeExecution[null]");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = executionEntity0.getActivity();
        int int13 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity14.setCachedEntityState((int) (short) 100);
        executionEntity14.setActive(false);
        executionEntity14.setActive(false);
        int int21 = executionEntity14.getRevisionNext();
        java.lang.String str22 = executionEntity14.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity23.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList26 = executionEntity23.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList27 = executionEntity23.getEventSubscriptionsInternal();
        executionEntity23.setConcurrent(true);
        java.lang.Object obj30 = executionEntity23.getPersistentState();
        executionEntity23.setBusinessKey("");
        executionEntity23.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl35 = executionEntity23.getTransition();
        java.lang.String str36 = executionEntity23.getCurrentActivityId();
        boolean boolean37 = executionEntity23.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity38 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices39 = executionEntity38.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity40.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity43.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList46 = executionEntity43.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList47 = executionEntity43.getEventSubscriptionsInternal();
        java.lang.String str48 = executionEntity43.getActivityId();
        boolean boolean49 = executionEntity43.isProcessInstanceType();
        executionEntity40.setSuperExecution(executionEntity43);
        executionEntity38.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity43);
        java.util.Map<java.lang.String, java.lang.Object> strMap52 = executionEntity38.getProcessVariables();
        executionEntity23.createVariablesLocal(strMap52);
        executionEntity14.createVariablesLocal(strMap52);
        executionEntity0.setVariablesLocal(strMap52);
        executionEntity0.setBusinessKey("ProcessInstance[ProcessInstance[null]]");
        boolean boolean58 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isActive();
        boolean boolean9 = executionEntity0.isEnded();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = executionEntity0.getActivity();
        int int11 = executionEntity0.getRevisionNext();
        executionEntity0.setCachedEntityState((int) (byte) 1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity14.setCachedEntityState((int) (short) 100);
        java.lang.String str17 = executionEntity14.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity14.getParent();
        executionEntity14.setExecutionListenerIndex((java.lang.Integer) 0);
        boolean boolean21 = executionEntity14.isDeleteRoot();
        java.lang.String str22 = executionEntity14.getId();
        executionEntity14.setId("ProcessInstance[]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean26 = executionEntity25.isEnded();
        boolean boolean27 = executionEntity25.isProcessInstanceType();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl28 = executionEntity25.getTransitionBeingTaken();
        executionEntity14.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity25);
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = executionEntity14.getProcessVariables();
        executionEntity0.setVariables(strMap30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean33 = executionEntity0.isActive("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        executionEntity0.forceUpdate();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getProcessInstance();
        executionEntity0.setDeleteReason("");
        boolean boolean10 = executionEntity0.isProcessInstanceType();
        java.lang.Object obj11 = executionEntity0.getPersistentState();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        boolean boolean7 = executionEntity0.isEventScope();
        executionEntity0.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = executionEntity0.getActivity();
        executionEntity0.setEventName("ProcessInstance[null]");
        java.lang.String str13 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("hi!");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        boolean boolean2 = executionEntity0.isDeleteRoot();
        java.lang.Object obj3 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList4 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        java.lang.String str5 = executionEntity1.getProcessDefinitionId();
        java.lang.String str6 = executionEntity1.getProcessDefinitionId();
        int int7 = executionEntity1.getSuspensionState();
        executionEntity1.setEventScope(false);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement10 = executionEntity1.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList11 = executionEntity1.getTasks();
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        int int8 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList9 = executionEntity0.getExecutions();
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setDeleteReason("");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setSuspensionState((int) (short) -1);
        java.lang.String str12 = executionEntity0.getCurrentActivityId();
        executionEntity0.inactivate();
        executionEntity0.setEventScope(true);
        int int16 = executionEntity0.getSuspensionState();
        executionEntity0.setParentId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        java.lang.String str5 = executionEntity1.getProcessDefinitionId();
        boolean boolean6 = executionEntity1.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity1.getEventSubscriptionsInternal();
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl12 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setSuperExecution(executionEntity14);
        boolean boolean16 = executionEntity13.isEventScope();
        executionEntity13.inactivate();
        boolean boolean18 = executionEntity13.isEventScope();
        java.lang.String str19 = executionEntity13.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity13.getSuperExecution();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        int int22 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isActive();
        boolean boolean9 = executionEntity0.isEventScope();
        boolean boolean10 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity13 = executionEntity0.addIdentityLink("ProcessInstance[null]", "ProcessInstance[hi!]");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity2.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        executionEntity2.setSuperExecution(executionEntity5);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity15.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity15.getEventSubscriptionsInternal();
        executionEntity15.setConcurrent(true);
        executionEntity15.setDeleteReason("");
        executionEntity0.setSuperExecution(executionEntity15);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = executionEntity15.getActivity();
        boolean boolean26 = executionEntity15.isActive();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity27.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList30 = executionEntity27.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList31 = executionEntity27.getEventSubscriptionsInternal();
        java.lang.String str32 = executionEntity27.getActivityId();
        boolean boolean33 = executionEntity27.isProcessInstanceType();
        boolean boolean34 = executionEntity27.isEventScope();
        executionEntity27.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList36 = executionEntity27.getCompensateEventSubscriptions();
        java.lang.String str37 = executionEntity27.getParentId();
        java.lang.String str38 = executionEntity27.toString();
        executionEntity15.setSuperExecution(executionEntity27);
        java.lang.String str40 = executionEntity27.getId();
        java.lang.Integer int41 = executionEntity27.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = executionEntity27.findExecution("ProcessInstance[]");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isEventScope();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity2.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        executionEntity2.setSuperExecution(executionEntity5);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity15.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity15.getEventSubscriptionsInternal();
        executionEntity15.setConcurrent(true);
        executionEntity15.setDeleteReason("");
        executionEntity0.setSuperExecution(executionEntity15);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = executionEntity15.getActivity();
        executionEntity15.setScope(false);
        org.activiti.engine.EngineServices engineServices28 = executionEntity15.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity15.end();
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = executionEntity0.getActivity();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray4 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5, variableInstanceEntityArray4);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5);
        java.lang.String str8 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList10 = executionEntity0.getTasks();
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        java.lang.String str5 = executionEntity0.getDeleteReason();
        java.lang.String str6 = executionEntity0.getDeleteReason();
        java.lang.String str7 = executionEntity0.getBusinessKey();
        boolean boolean8 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.addIdentityLink("ConcurrentScopeExecution[null]", "ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.String str8 = executionEntity0.getBusinessKey();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity0.getProcessVariables();
        executionEntity0.setCachedEntityState((int) 'a');
        executionEntity0.setCachedEntityState(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity16 = executionEntity0.addIdentityLink("ConcurrentScopeExecution[null]", "ProcessInstance[]");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        java.lang.String str6 = executionEntity0.getActivityId();
        executionEntity0.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.involveUser("ProcessInstance[hi!]", "ProcessInstance[hi!]");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity0.getTransition();
        java.lang.String str13 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity16 = executionEntity0.involveUser("ScopeExecution[null]", "");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity1.getActivity();
        java.lang.String str7 = executionEntity1.getBusinessKey();
        executionEntity1.setId("ProcessInstance[null]");
        java.lang.String str10 = executionEntity1.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.deleteCascade("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setDeleteReason("");
        executionEntity0.setEventName("hi!");
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList11 = executionEntity0.getTasks();
        java.lang.String str12 = executionEntity0.getProcessDefinitionId();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = executionEntity0.updateProcessBusinessKey("ProcessInstance[]");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.String str8 = executionEntity0.getEventName();
        java.lang.String str9 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setDeleteReason("");
        executionEntity0.setEventName("hi!");
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList11 = executionEntity0.getTasks();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement12 = executionEntity0.getEventSource();
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList13 = executionEntity0.getTasks();
        executionEntity0.setEventName("ProcessInstance[hi!]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        int int11 = executionEntity5.getSuspensionState();
        java.lang.String str12 = executionEntity5.getDeleteReason();
        int int13 = executionEntity5.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity5.insert();
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement3 = executionEntity1.getEventSource();
        java.lang.String str4 = executionEntity1.toString();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        java.lang.String str7 = executionEntity1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity1.involveUser("ProcessInstance[hi!]", "ProcessInstance[null]");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.String str8 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity9.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity9.getEventSubscriptionsInternal();
        java.lang.String str14 = executionEntity9.getActivityId();
        boolean boolean15 = executionEntity9.isProcessInstanceType();
        boolean boolean16 = executionEntity9.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList23 = executionEntity20.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList24 = executionEntity20.getEventSubscriptionsInternal();
        java.lang.String str25 = executionEntity20.getActivityId();
        boolean boolean26 = executionEntity20.isProcessInstanceType();
        executionEntity17.setSuperExecution(executionEntity20);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices29 = executionEntity28.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity30.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity33.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList36 = executionEntity33.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList37 = executionEntity33.getEventSubscriptionsInternal();
        java.lang.String str38 = executionEntity33.getActivityId();
        boolean boolean39 = executionEntity33.isProcessInstanceType();
        executionEntity30.setSuperExecution(executionEntity33);
        executionEntity28.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity33);
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = executionEntity28.getProcessVariables();
        executionEntity20.setVariablesLocal(strMap42);
        executionEntity9.setVariables(strMap42);
        executionEntity0.setVariables(strMap42);
        executionEntity0.setParentId("ProcessInstance[null]");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 6);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity51 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity51.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList54 = executionEntity51.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList55 = executionEntity51.getEventSubscriptionsInternal();
        executionEntity51.setConcurrent(true);
        executionEntity51.setActive(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution60 = executionEntity51.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray61 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList62 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList62, variableInstanceEntityArray61);
        executionEntity51.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("ProcessInstance[ProcessInstance[null]]", (java.lang.Object) variableInstanceEntityList62);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        executionEntity0.inactivate();
        boolean boolean5 = executionEntity0.isEventScope();
        java.lang.String str6 = executionEntity0.getProcessDefinitionId();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setDeleteReason("");
        executionEntity0.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = executionEntity0.isActive("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        java.lang.Object obj6 = executionEntity3.getPersistentState();
        java.lang.String str7 = executionEntity3.getEventName();
        java.lang.String str8 = executionEntity3.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity3.getParent();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement10 = executionEntity3.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = executionEntity3.updateProcessBusinessKey("");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        java.lang.String str8 = executionEntity3.getActivityId();
        boolean boolean9 = executionEntity3.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.lang.String str4 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = executionEntity0.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setBusinessKey("");
        int int7 = executionEntity4.getRevisionNext();
        boolean boolean8 = executionEntity4.isProcessInstanceType();
        executionEntity4.setScope(false);
        executionEntity4.setRevision((int) (byte) 10);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement14 = executionEntity0.getEventSource();
        executionEntity0.setRevision((int) (short) 100);
        java.lang.Object obj17 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity0.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = executionEntity0.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setBusinessKey("");
        int int7 = executionEntity4.getRevisionNext();
        boolean boolean8 = executionEntity4.isProcessInstanceType();
        executionEntity4.setScope(false);
        executionEntity4.setRevision((int) (byte) 10);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        int int14 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        java.lang.String str4 = executionEntity0.getTenantId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = executionEntity0.getQueryVariables();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList7 = executionEntity0.getJobs();
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getCachedEntityState();
        executionEntity0.setCachedEntityState((int) '4');
        java.lang.String str6 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList7 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = executionEntity1.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.findExecution("");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setDeleteReason("");
        executionEntity0.setEventName("hi!");
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList11 = executionEntity0.getTasks();
        java.lang.String str12 = executionEntity0.getProcessDefinitionId();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setDeleteReason("");
        executionEntity0.setEventName("hi!");
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList11 = executionEntity0.getTasks();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement12 = executionEntity0.getEventSource();
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList13 = executionEntity0.getTasks();
        executionEntity0.setEventName("ProcessInstance[hi!]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList16 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        java.lang.String str8 = executionEntity3.getActivityId();
        boolean boolean9 = executionEntity3.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity3);
        executionEntity0.setActive(false);
        boolean boolean13 = executionEntity0.isSuspended();
        java.lang.String str14 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = executionEntity0.getActivity();
        int int13 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity0.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        java.lang.String str8 = executionEntity3.getActivityId();
        boolean boolean9 = executionEntity3.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity3);
        executionEntity0.setDeleteReason("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution13 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        int int4 = executionEntity0.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        int int5 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        java.lang.String str8 = executionEntity3.getActivityId();
        boolean boolean9 = executionEntity3.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity3);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = executionEntity11.getActivity();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray15 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList16 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList16, variableInstanceEntityArray15);
        executionEntity11.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList16);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement19 = executionEntity11.getEventSource();
        executionEntity3.setSuperExecution(executionEntity11);
        executionEntity3.setCachedEntityState((int) (short) 10);
        boolean boolean23 = executionEntity3.isScope();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl24 = executionEntity3.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity3.initialize();
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = executionEntity0.getActivity();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        boolean boolean4 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList5 = executionEntity0.getTasks();
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        java.lang.String str4 = executionEntity0.getTenantId();
        boolean boolean5 = executionEntity0.isConcurrent();
        boolean boolean6 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity9 = executionEntity0.addIdentityLink("ScopeExecution[null]", "ProcessInstance[hi!]");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        java.lang.String str2 = executionEntity0.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement3 = executionEntity0.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = executionEntity4.getQueryVariables();
        org.activiti.engine.EngineServices engineServices6 = executionEntity4.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity7.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity7.getEventSubscriptionsInternal();
        executionEntity7.setConcurrent(true);
        java.lang.Object obj14 = executionEntity7.getPersistentState();
        boolean boolean15 = executionEntity7.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList16 = executionEntity7.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity7.getCompensateEventSubscriptions("hi!");
        executionEntity7.setParentId("ProcessInstance[ProcessInstance[null]]");
        executionEntity4.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = executionEntity4.getProcessVariables();
        executionEntity0.createVariablesLocal(strMap22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        executionEntity0.setConcurrent(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity0.getEventSubscriptions();
        boolean boolean11 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList12 = executionEntity0.getExecutions();
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        executionEntity0.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setSuperExecution(executionEntity9);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str12 = executionEntity11.getEventName();
        executionEntity9.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices16 = executionEntity15.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList23 = executionEntity20.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList24 = executionEntity20.getEventSubscriptionsInternal();
        java.lang.String str25 = executionEntity20.getActivityId();
        boolean boolean26 = executionEntity20.isProcessInstanceType();
        executionEntity17.setSuperExecution(executionEntity20);
        executionEntity15.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = executionEntity15.getProcessVariables();
        java.lang.String str30 = executionEntity15.getProcessBusinessKey();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = executionEntity15.getProcessVariables();
        executionEntity11.setVariables(strMap31);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement33 = executionEntity11.getEventSource();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement34 = executionEntity11.getEventSource();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = executionEntity11.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = executionEntity11.createExecution();
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        executionEntity0.inactivate();
        java.lang.String str6 = executionEntity0.getActivityId();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity0.getEventSubscriptions();
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.findExecution("ProcessInstance[hi!]");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList1 = executionEntity0.getQueryVariables();
        org.activiti.engine.EngineServices engineServices2 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        executionEntity3.setConcurrent(true);
        java.lang.Object obj10 = executionEntity3.getPersistentState();
        boolean boolean11 = executionEntity3.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity3.getCompensateEventSubscriptions("hi!");
        executionEntity3.setParentId("ProcessInstance[ProcessInstance[null]]");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = executionEntity3.isActive("");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.Integer int8 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.setConcurrent(false);
        executionEntity0.setDeleteReason("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity0.getTransition();
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        boolean boolean7 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        boolean boolean6 = executionEntity0.isActive();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity0.getTransitionBeingTaken();
        boolean boolean8 = executionEntity0.isScope();
        executionEntity0.setBusinessKey("");
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity0.getCompensateEventSubscriptions("hi!");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setSuspensionState((int) (short) 0);
        executionEntity1.setParentId("");
        boolean boolean10 = executionEntity1.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity1.getEventSubscriptions();
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity1.getActivity();
        executionEntity1.setCachedEntityState((int) 'a');
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityName();
        executionEntity9.setId("");
        int int13 = executionEntity9.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity9.getParent();
        java.lang.String str15 = executionEntity9.getSuperExecutionId();
        java.lang.String str16 = executionEntity9.getBusinessKey();
        java.lang.String str17 = executionEntity9.getCurrentActivityId();
        executionEntity9.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        executionEntity0.setScope(false);
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getProcessInstance();
        executionEntity0.setDeleteReason("");
        boolean boolean10 = executionEntity0.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity11.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList15 = executionEntity11.getEventSubscriptionsInternal();
        executionEntity11.setConcurrent(true);
        java.lang.Object obj18 = executionEntity11.getPersistentState();
        executionEntity11.setBusinessKey("");
        executionEntity11.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl23 = executionEntity11.getTransition();
        java.lang.String str24 = executionEntity11.getCurrentActivityId();
        boolean boolean25 = executionEntity11.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices27 = executionEntity26.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity28.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity31.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList34 = executionEntity31.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList35 = executionEntity31.getEventSubscriptionsInternal();
        java.lang.String str36 = executionEntity31.getActivityId();
        boolean boolean37 = executionEntity31.isProcessInstanceType();
        executionEntity28.setSuperExecution(executionEntity31);
        executionEntity26.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity31);
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = executionEntity26.getProcessVariables();
        executionEntity11.createVariablesLocal(strMap40);
        executionEntity0.setVariablesLocal(strMap40);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList43 = executionEntity0.getEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = executionEntity0.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setBusinessKey("");
        int int7 = executionEntity4.getRevisionNext();
        boolean boolean8 = executionEntity4.isProcessInstanceType();
        executionEntity4.setScope(false);
        executionEntity4.setRevision((int) (byte) 10);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement14 = executionEntity0.getEventSource();
        java.lang.String str15 = executionEntity0.getActivityId();
        boolean boolean16 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        int int11 = executionEntity5.getSuspensionState();
        java.lang.String str12 = executionEntity5.getDeleteReason();
        int int13 = executionEntity5.getRevision();
        org.activiti.engine.EngineServices engineServices14 = executionEntity5.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity5.removeIdentityLinks();
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.destroyScope("");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        executionEntity0.setParentId("hi!");
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setActive(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution9 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray10 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList11 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList11, variableInstanceEntityArray10);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList11);
        boolean boolean14 = executionEntity0.isConcurrent();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = executionEntity0.updateProcessBusinessKey("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        java.lang.String str6 = executionEntity0.getActivityId();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        boolean boolean8 = executionEntity0.isEnded();
        java.lang.String str9 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setCachedEntityState((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        java.lang.String str8 = executionEntity0.getId();
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity1.getActivity();
        java.lang.String str7 = executionEntity1.getBusinessKey();
        executionEntity1.setEventName("ProcessInstance[null]");
        boolean boolean10 = executionEntity1.isEventScope();
        java.lang.String str11 = executionEntity1.getActivityId();
        boolean boolean12 = executionEntity1.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.initialize();
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl12 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity0.createExecution();
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution10 = executionEntity0.getStartingExecution();
        boolean boolean11 = executionEntity0.isSuspended();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices13 = executionEntity12.getEngineServices();
        int int14 = executionEntity12.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isConcurrent();
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.findExecution("hi!");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isScope();
        executionEntity0.setId("");
        executionEntity0.setId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        boolean boolean6 = executionEntity0.isActive();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity0.getTransitionBeingTaken();
        boolean boolean8 = executionEntity0.isScope();
        executionEntity0.setBusinessKey("");
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity15 = executionEntity0.addIdentityLink("ScopeExecution[null]", "hi!");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity7.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity7.getEventSubscriptionsInternal();
        java.lang.String str12 = executionEntity7.getActivityId();
        int int13 = executionEntity7.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity7.getProcessInstance();
        executionEntity7.setDeleteReason("");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity7.getProcessVariables();
        executionEntity0.createVariablesLocal(strMap17);
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = executionEntity0.getProcessInstance();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity23.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList26 = executionEntity23.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList27 = executionEntity23.getEventSubscriptionsInternal();
        executionEntity23.setConcurrent(true);
        executionEntity23.setActive(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution32 = executionEntity23.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = executionEntity23.getProcessInstance();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = executionEntity23.getProcessInstance();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList36 = executionEntity23.getCompensateEventSubscriptions("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl37 = executionEntity23.getTransition();
        boolean boolean38 = executionEntity23.isEventScope();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity23);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity40.destroyScope("ProcessInstance[hi!]");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        boolean boolean2 = executionEntity0.isDeleteRoot();
        java.lang.Object obj3 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str5 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity4.getCompensateEventSubscriptions();
        boolean boolean8 = executionEntity4.isEventScope();
        org.activiti.engine.EngineServices engineServices9 = executionEntity4.getEngineServices();
        java.lang.String str10 = executionEntity4.getId();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        org.activiti.engine.EngineServices engineServices12 = executionEntity4.getEngineServices();
        java.lang.String str13 = executionEntity4.getBusinessKey();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = executionEntity4.getActivity();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity4.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity4.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList17 = executionEntity4.getIdentityLinks();
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        boolean boolean7 = executionEntity0.isEnded();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        executionEntity0.setScope(false);
        boolean boolean7 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.updateProcessBusinessKey("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = executionEntity0.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setBusinessKey("");
        int int7 = executionEntity4.getRevisionNext();
        boolean boolean8 = executionEntity4.isProcessInstanceType();
        executionEntity4.setScope(false);
        executionEntity4.setRevision((int) (byte) 10);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement14 = executionEntity0.getEventSource();
        java.lang.String str15 = executionEntity0.getActivityId();
        java.lang.String str16 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity0.findExecution("ProcessInstance[null]");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        int int4 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList5 = executionEntity0.getTasks();
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        java.lang.String str8 = executionEntity3.getActivityId();
        boolean boolean9 = executionEntity3.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity3);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = executionEntity11.getActivity();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray15 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList16 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList16, variableInstanceEntityArray15);
        executionEntity11.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList16);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement19 = executionEntity11.getEventSource();
        executionEntity3.setSuperExecution(executionEntity11);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity21.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList24 = executionEntity21.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList25 = executionEntity21.getEventSubscriptionsInternal();
        java.lang.String str26 = executionEntity21.getActivityId();
        boolean boolean27 = executionEntity21.isProcessInstanceType();
        boolean boolean28 = executionEntity21.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity29.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity32.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList35 = executionEntity32.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList36 = executionEntity32.getEventSubscriptionsInternal();
        java.lang.String str37 = executionEntity32.getActivityId();
        boolean boolean38 = executionEntity32.isProcessInstanceType();
        executionEntity29.setSuperExecution(executionEntity32);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices41 = executionEntity40.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity42.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity45 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity45.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList48 = executionEntity45.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList49 = executionEntity45.getEventSubscriptionsInternal();
        java.lang.String str50 = executionEntity45.getActivityId();
        boolean boolean51 = executionEntity45.isProcessInstanceType();
        executionEntity42.setSuperExecution(executionEntity45);
        executionEntity40.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity45);
        java.util.Map<java.lang.String, java.lang.Object> strMap54 = executionEntity40.getProcessVariables();
        executionEntity32.setVariablesLocal(strMap54);
        executionEntity21.setVariables(strMap54);
        executionEntity11.setVariablesLocal(strMap54);
        java.lang.String str58 = executionEntity11.toString();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl59 = executionEntity11.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity60 = executionEntity11.getSubProcessInstance();
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity0.getTransition();
        java.lang.String str13 = executionEntity0.getCurrentActivityId();
        java.lang.String str14 = executionEntity0.getCurrentActivityName();
        executionEntity0.setEventScope(true);
        java.lang.String str17 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = executionEntity0.getActivity();
        int int19 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = executionEntity0.updateProcessBusinessKey("hi!");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl12 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setSuperExecution(executionEntity14);
        boolean boolean16 = executionEntity13.isEventScope();
        executionEntity13.inactivate();
        boolean boolean18 = executionEntity13.isEventScope();
        java.lang.String str19 = executionEntity13.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity13.getSuperExecution();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        int int22 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        java.lang.String str5 = executionEntity0.getDeleteReason();
        boolean boolean6 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.updateProcessBusinessKey("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity1.getActivity();
        java.lang.String str7 = executionEntity1.getBusinessKey();
        executionEntity1.setEventName("ProcessInstance[null]");
        executionEntity1.setId("hi!");
        executionEntity1.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList13 = executionEntity1.getJobs();
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        boolean boolean7 = executionEntity0.isEventScope();
        executionEntity0.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str10 = executionEntity0.getParentId();
        java.lang.String str11 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        boolean boolean7 = executionEntity0.isEventScope();
        boolean boolean8 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity2.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        executionEntity2.setSuperExecution(executionEntity5);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity15.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity15.getEventSubscriptionsInternal();
        executionEntity15.setConcurrent(true);
        executionEntity15.setDeleteReason("");
        executionEntity0.setSuperExecution(executionEntity15);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = executionEntity15.getActivity();
        executionEntity15.setScope(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList28 = executionEntity15.getEventSubscriptions();
        boolean boolean29 = executionEntity15.isActive();
        executionEntity15.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = executionEntity15.createExecution();
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isEventScope();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        java.lang.String str6 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList7 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        boolean boolean7 = executionEntity0.isEventScope();
        executionEntity0.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = executionEntity0.getActivity();
        executionEntity0.setEventName("ProcessInstance[null]");
        java.lang.String str13 = executionEntity0.getActivityId();
        executionEntity0.setSuspensionState((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        executionEntity0.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setSuperExecution(executionEntity9);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str12 = executionEntity11.getEventName();
        executionEntity9.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        executionEntity0.setEventScope(true);
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        executionEntity0.setParentId("hi!");
        int int7 = executionEntity0.getRevisionNext();
        boolean boolean8 = executionEntity0.isScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList9 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        executionEntity0.setConcurrent(true);
        boolean boolean10 = executionEntity0.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.getProcessInstance();
        java.lang.Integer int12 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = executionEntity0.isActive("");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        java.lang.String str8 = executionEntity3.getActivityId();
        boolean boolean9 = executionEntity3.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity3);
        executionEntity0.setActive(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList1 = executionEntity0.getQueryVariables();
        org.activiti.engine.EngineServices engineServices2 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        executionEntity3.setConcurrent(true);
        java.lang.Object obj10 = executionEntity3.getPersistentState();
        boolean boolean11 = executionEntity3.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity3.getCompensateEventSubscriptions("hi!");
        executionEntity3.setParentId("ProcessInstance[ProcessInstance[null]]");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        boolean boolean18 = executionEntity0.isSuspended();
        executionEntity0.setRevision(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        java.lang.String str2 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.createExecution();
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setActive(false);
        executionEntity0.setSuspensionState(0);
        executionEntity0.setRevision(10);
        java.lang.String str13 = executionEntity0.getDeleteReason();
        boolean boolean14 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList18 = executionEntity0.getExecutions();
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        java.lang.String str8 = executionEntity3.getActivityId();
        boolean boolean9 = executionEntity3.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity3);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices12 = executionEntity11.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity16.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList19 = executionEntity16.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList20 = executionEntity16.getEventSubscriptionsInternal();
        java.lang.String str21 = executionEntity16.getActivityId();
        boolean boolean22 = executionEntity16.isProcessInstanceType();
        executionEntity13.setSuperExecution(executionEntity16);
        executionEntity11.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = executionEntity11.getProcessVariables();
        executionEntity3.setVariablesLocal(strMap25);
        org.activiti.engine.EngineServices engineServices27 = executionEntity3.getEngineServices();
        boolean boolean28 = executionEntity3.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity3.removeIdentityLinks();
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl5 = executionEntity0.getProcessDefinition();
        java.lang.String str6 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.updateProcessBusinessKey("");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str10 = executionEntity0.getProcessDefinitionId();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList11 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean12 = executionEntity0.isEnded();
        int int13 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        boolean boolean6 = executionEntity0.isActive();
        executionEntity0.setEventName("hi!");
        boolean boolean9 = executionEntity0.isScope();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[]");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        executionEntity0.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setSuperExecution(executionEntity9);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str12 = executionEntity11.getEventName();
        executionEntity9.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        executionEntity11.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList17 = executionEntity11.getExecutions();
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl4 = executionEntity0.getProcessDefinition();
        executionEntity0.setRevision((int) 'a');
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = executionEntity0.getActivity();
        java.lang.String str9 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = executionEntity0.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setBusinessKey("");
        int int7 = executionEntity4.getRevisionNext();
        boolean boolean8 = executionEntity4.isProcessInstanceType();
        executionEntity4.setScope(false);
        executionEntity4.setRevision((int) (byte) 10);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        int int14 = executionEntity0.getRevisionNext();
        executionEntity0.setParentId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList17 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity2.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        executionEntity2.setSuperExecution(executionEntity5);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity0.getProcessVariables();
        java.lang.String str15 = executionEntity0.getProcessBusinessKey();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str18 = executionEntity17.getCurrentActivityName();
        int int19 = executionEntity17.getCachedEntityState();
        int int20 = executionEntity17.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = executionEntity17.getProcessVariables();
        executionEntity0.createVariablesLocal(strMap21);
        java.lang.String str23 = executionEntity0.getEventName();
        executionEntity0.setRevision((int) ' ');
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement26 = executionEntity0.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList29 = executionEntity28.getQueryVariables();
        org.activiti.engine.EngineServices engineServices30 = executionEntity28.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity31.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList34 = executionEntity31.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList35 = executionEntity31.getEventSubscriptionsInternal();
        executionEntity31.setConcurrent(true);
        java.lang.Object obj38 = executionEntity31.getPersistentState();
        boolean boolean39 = executionEntity31.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList40 = executionEntity31.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList42 = executionEntity31.getCompensateEventSubscriptions("hi!");
        executionEntity31.setParentId("ProcessInstance[ProcessInstance[null]]");
        executionEntity28.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("ProcessInstance[hi!]", (java.lang.Object) executionEntity28);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        executionEntity1.disposeStartingExecution();
        executionEntity1.setSuspensionState((int) ' ');
        int int7 = executionEntity1.getCachedEntityState();
        executionEntity1.setId("ProcessInstance[null]");
        executionEntity1.setEventName("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.end();
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity4.getCompensateEventSubscriptions();
        boolean boolean8 = executionEntity4.isEventScope();
        org.activiti.engine.EngineServices engineServices9 = executionEntity4.getEngineServices();
        java.lang.String str10 = executionEntity4.getId();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        org.activiti.engine.EngineServices engineServices12 = executionEntity4.getEngineServices();
        java.lang.String str13 = executionEntity4.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList14 = executionEntity4.getJobs();
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        boolean boolean6 = executionEntity0.isEventScope();
        java.lang.String str7 = executionEntity0.getId();
        executionEntity0.inactivate();
        org.activiti.engine.EngineServices engineServices9 = executionEntity0.getEngineServices();
        executionEntity0.setScope(false);
        boolean boolean12 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList1 = executionEntity0.getQueryVariables();
        org.activiti.engine.EngineServices engineServices2 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        executionEntity3.setConcurrent(true);
        java.lang.Object obj10 = executionEntity3.getPersistentState();
        boolean boolean11 = executionEntity3.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity3.getCompensateEventSubscriptions("hi!");
        executionEntity3.setParentId("ProcessInstance[ProcessInstance[null]]");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices19 = executionEntity18.getEngineServices();
        int int20 = executionEntity18.getRevision();
        java.lang.String str21 = executionEntity18.getActivityId();
        java.lang.String str22 = executionEntity18.getActivityId();
        executionEntity0.setSuperExecution(executionEntity18);
        int int24 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList25 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setSuperExecution(executionEntity4);
        boolean boolean6 = executionEntity3.isEventScope();
        boolean boolean7 = executionEntity3.isEnded();
        boolean boolean8 = executionEntity3.isEnded();
        java.lang.String str9 = executionEntity3.getActivityId();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        java.lang.String str11 = executionEntity0.getCurrentActivityName();
        boolean boolean12 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[]");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = executionEntity0.getCachedElContext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity6.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution9 = executionEntity6.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity6.getEventSubscriptions();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement12 = executionEntity0.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity0.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList14 = executionEntity0.getExecutions();
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl12 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setSuperExecution(executionEntity14);
        boolean boolean16 = executionEntity13.isEventScope();
        executionEntity13.inactivate();
        boolean boolean18 = executionEntity13.isEventScope();
        java.lang.String str19 = executionEntity13.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity13.getSuperExecution();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity0.setSuspensionState((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setId("");
        java.lang.Integer int4 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity0.getDeleteReason();
        executionEntity0.setDeleteReason("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.String str8 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity9.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity9.getEventSubscriptionsInternal();
        java.lang.String str14 = executionEntity9.getActivityId();
        boolean boolean15 = executionEntity9.isProcessInstanceType();
        boolean boolean16 = executionEntity9.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList23 = executionEntity20.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList24 = executionEntity20.getEventSubscriptionsInternal();
        java.lang.String str25 = executionEntity20.getActivityId();
        boolean boolean26 = executionEntity20.isProcessInstanceType();
        executionEntity17.setSuperExecution(executionEntity20);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices29 = executionEntity28.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity30.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity33.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList36 = executionEntity33.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList37 = executionEntity33.getEventSubscriptionsInternal();
        java.lang.String str38 = executionEntity33.getActivityId();
        boolean boolean39 = executionEntity33.isProcessInstanceType();
        executionEntity30.setSuperExecution(executionEntity33);
        executionEntity28.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity33);
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = executionEntity28.getProcessVariables();
        executionEntity20.setVariablesLocal(strMap42);
        executionEntity9.setVariables(strMap42);
        executionEntity0.setVariables(strMap42);
        executionEntity0.setParentId("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement48 = executionEntity0.getEventSource();
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList49 = executionEntity0.getTasks();
        boolean boolean50 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getParent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 4);
        boolean boolean7 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        java.lang.Object obj6 = executionEntity3.getPersistentState();
        java.lang.String str7 = executionEntity3.getProcessInstanceId();
        executionEntity3.setEventScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution13 = executionEntity10.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList14 = executionEntity10.getEventSubscriptions();
        org.activiti.engine.impl.javax.el.ELContext eLContext15 = executionEntity10.getCachedElContext();
        java.lang.String str16 = executionEntity10.getParentId();
        executionEntity3.setSuperExecution(executionEntity10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity18.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = executionEntity18.getActivity();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution21 = executionEntity18.getStartingExecution();
        java.lang.String str22 = executionEntity18.getBusinessKey();
        executionEntity18.setEventName("ProcessInstance[ProcessInstance[null]]");
        executionEntity3.setSuperExecution(executionEntity18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = executionEntity18.createExecution();
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getParent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        boolean boolean7 = executionEntity0.isDeleteRoot();
        java.lang.String str8 = executionEntity0.getId();
        executionEntity0.setId("ProcessInstance[]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean12 = executionEntity11.isEnded();
        boolean boolean13 = executionEntity11.isProcessInstanceType();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = executionEntity11.getTransitionBeingTaken();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity19 = executionEntity0.addIdentityLink("ConcurrentScopeExecution[null]", "");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setSuperExecution(executionEntity9);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = executionEntity8.getTransition();
        org.activiti.engine.EngineServices engineServices12 = executionEntity8.getEngineServices();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity8.setEventName("ProcessInstance[hi!]");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl16 = executionEntity8.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList17 = executionEntity8.getJobs();
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        java.lang.String str8 = executionEntity3.getActivityId();
        boolean boolean9 = executionEntity3.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity3);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices12 = executionEntity11.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity16.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList19 = executionEntity16.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList20 = executionEntity16.getEventSubscriptionsInternal();
        java.lang.String str21 = executionEntity16.getActivityId();
        boolean boolean22 = executionEntity16.isProcessInstanceType();
        executionEntity13.setSuperExecution(executionEntity16);
        executionEntity11.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = executionEntity11.getProcessVariables();
        executionEntity3.setVariablesLocal(strMap25);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity27.setSuperExecution(executionEntity28);
        boolean boolean30 = executionEntity27.isEventScope();
        boolean boolean31 = executionEntity27.isEnded();
        executionEntity27.disposeStartingExecution();
        boolean boolean33 = executionEntity27.isActive();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl34 = executionEntity27.getTransitionBeingTaken();
        boolean boolean35 = executionEntity27.isScope();
        executionEntity27.setBusinessKey("");
        int int38 = executionEntity27.getCachedEntityState();
        executionEntity3.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity27);
        executionEntity27.setDeleteReason("ProcessInstance[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList42 = executionEntity27.getTasks();
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity7.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity7.getEventSubscriptionsInternal();
        java.lang.String str12 = executionEntity7.getActivityId();
        int int13 = executionEntity7.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity7.getProcessInstance();
        executionEntity7.setDeleteReason("");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity7.getProcessVariables();
        executionEntity0.createVariablesLocal(strMap17);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = executionEntity0.getTransition();
        java.lang.String str20 = executionEntity0.getCurrentActivityName();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList21 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList22 = executionEntity0.getEventSubscriptions();
        executionEntity0.setParentId("ProcessInstance[ProcessInstance[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity27 = executionEntity0.involveUser("ProcessInstance[ProcessInstance[null]]", "ScopeExecution[null]");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        java.lang.Object obj9 = executionEntity0.getPersistentState();
        int int10 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setSuperExecution(executionEntity12);
        boolean boolean14 = executionEntity11.isEnded();
        java.lang.Object obj15 = executionEntity11.getPersistentState();
        executionEntity11.setParentId("hi!");
        boolean boolean18 = executionEntity11.isDeleteRoot();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity23.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList26 = executionEntity23.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList27 = executionEntity23.getEventSubscriptionsInternal();
        java.lang.String str28 = executionEntity23.getActivityId();
        boolean boolean29 = executionEntity23.isProcessInstanceType();
        executionEntity20.setSuperExecution(executionEntity23);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity31.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl34 = executionEntity31.getActivity();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray35 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList36 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList36, variableInstanceEntityArray35);
        executionEntity31.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList36);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement39 = executionEntity31.getEventSource();
        executionEntity23.setSuperExecution(executionEntity31);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity41.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList44 = executionEntity41.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList45 = executionEntity41.getEventSubscriptionsInternal();
        java.lang.String str46 = executionEntity41.getActivityId();
        boolean boolean47 = executionEntity41.isProcessInstanceType();
        boolean boolean48 = executionEntity41.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity49 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity49.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity52 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity52.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList55 = executionEntity52.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList56 = executionEntity52.getEventSubscriptionsInternal();
        java.lang.String str57 = executionEntity52.getActivityId();
        boolean boolean58 = executionEntity52.isProcessInstanceType();
        executionEntity49.setSuperExecution(executionEntity52);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity60 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices61 = executionEntity60.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity62 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity62.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity65 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity65.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList68 = executionEntity65.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList69 = executionEntity65.getEventSubscriptionsInternal();
        java.lang.String str70 = executionEntity65.getActivityId();
        boolean boolean71 = executionEntity65.isProcessInstanceType();
        executionEntity62.setSuperExecution(executionEntity65);
        executionEntity60.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity65);
        java.util.Map<java.lang.String, java.lang.Object> strMap74 = executionEntity60.getProcessVariables();
        executionEntity52.setVariablesLocal(strMap74);
        executionEntity41.setVariables(strMap74);
        executionEntity31.setVariablesLocal(strMap74);
        executionEntity11.setVariables(strMap74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList79 = executionEntity11.getExecutions();
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        boolean boolean7 = executionEntity0.isEventScope();
        executionEntity0.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = executionEntity0.getActivity();
        boolean boolean11 = executionEntity0.isScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList13 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[hi!]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement14 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = executionEntity0.updateProcessBusinessKey("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        boolean boolean2 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getSuperExecution();
        boolean boolean4 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.findExecution("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        executionEntity0.setDeleteReason("");
        boolean boolean6 = executionEntity0.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity7.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity7.getEventSubscriptionsInternal();
        executionEntity7.setConcurrent(true);
        executionEntity7.setActive(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution16 = executionEntity7.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setCachedEntityState((int) (short) 100);
        executionEntity17.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = executionEntity17.getProcessVariables();
        executionEntity7.setVariables(strMap22);
        executionEntity7.setEventScope(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = executionEntity7.getProcessVariables();
        int int27 = executionEntity7.getRevision();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList28 = executionEntity7.getCompensateEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setBusinessKey("ProcessInstance[ProcessInstance[null]]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = executionEntity0.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setBusinessKey("");
        int int7 = executionEntity4.getRevisionNext();
        boolean boolean8 = executionEntity4.isProcessInstanceType();
        executionEntity4.setScope(false);
        executionEntity4.setRevision((int) (byte) 10);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement14 = executionEntity0.getEventSource();
        java.lang.String str15 = executionEntity0.getActivityId();
        java.lang.String str16 = executionEntity0.getId();
        java.lang.String str17 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setDeleteReason("");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity0.getEventSubscriptionsInternal();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices11 = executionEntity10.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity15.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity15.getEventSubscriptionsInternal();
        java.lang.String str20 = executionEntity15.getActivityId();
        boolean boolean21 = executionEntity15.isProcessInstanceType();
        executionEntity12.setSuperExecution(executionEntity15);
        executionEntity10.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = executionEntity10.getProcessVariables();
        executionEntity0.setVariables(strMap24);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl26 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setDeleteReason("");
        executionEntity0.setEventName("hi!");
        java.lang.String str11 = executionEntity0.getParentId();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str13 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity16 = executionEntity0.addIdentityLink("ProcessInstance[hi!]", "ProcessInstance[hi!]");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList1 = executionEntity0.getQueryVariables();
        org.activiti.engine.EngineServices engineServices2 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        executionEntity3.setConcurrent(true);
        java.lang.Object obj10 = executionEntity3.getPersistentState();
        boolean boolean11 = executionEntity3.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity3.getCompensateEventSubscriptions("hi!");
        executionEntity3.setParentId("ProcessInstance[ProcessInstance[null]]");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices19 = executionEntity18.getEngineServices();
        int int20 = executionEntity18.getRevision();
        java.lang.String str21 = executionEntity18.getActivityId();
        java.lang.String str22 = executionEntity18.getActivityId();
        executionEntity0.setSuperExecution(executionEntity18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getCurrentActivityName();
        java.lang.String str6 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList7 = executionEntity0.getExecutions();
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        java.lang.String str8 = executionEntity3.getActivityId();
        boolean boolean9 = executionEntity3.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity3);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = executionEntity11.getActivity();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray15 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList16 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList16, variableInstanceEntityArray15);
        executionEntity11.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList16);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement19 = executionEntity11.getEventSource();
        executionEntity3.setSuperExecution(executionEntity11);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity21.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList24 = executionEntity21.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList25 = executionEntity21.getEventSubscriptionsInternal();
        java.lang.String str26 = executionEntity21.getActivityId();
        boolean boolean27 = executionEntity21.isProcessInstanceType();
        boolean boolean28 = executionEntity21.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity29.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity32.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList35 = executionEntity32.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList36 = executionEntity32.getEventSubscriptionsInternal();
        java.lang.String str37 = executionEntity32.getActivityId();
        boolean boolean38 = executionEntity32.isProcessInstanceType();
        executionEntity29.setSuperExecution(executionEntity32);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices41 = executionEntity40.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity42.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity45 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity45.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList48 = executionEntity45.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList49 = executionEntity45.getEventSubscriptionsInternal();
        java.lang.String str50 = executionEntity45.getActivityId();
        boolean boolean51 = executionEntity45.isProcessInstanceType();
        executionEntity42.setSuperExecution(executionEntity45);
        executionEntity40.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity45);
        java.util.Map<java.lang.String, java.lang.Object> strMap54 = executionEntity40.getProcessVariables();
        executionEntity32.setVariablesLocal(strMap54);
        executionEntity21.setVariables(strMap54);
        executionEntity11.setVariablesLocal(strMap54);
        java.lang.String str58 = executionEntity11.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity11.start();
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setActive(false);
        executionEntity0.setActive(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList11 = executionEntity0.getJobs();
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = executionEntity0.getActivity();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList4 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        java.lang.String str8 = executionEntity3.getActivityId();
        boolean boolean9 = executionEntity3.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity3);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = executionEntity11.getActivity();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray15 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList16 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList16, variableInstanceEntityArray15);
        executionEntity11.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList16);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement19 = executionEntity11.getEventSource();
        executionEntity3.setSuperExecution(executionEntity11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = executionEntity3.getProcessBusinessKey();
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        java.lang.String str8 = executionEntity3.getActivityId();
        boolean boolean9 = executionEntity3.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity3);
        executionEntity0.setActive(false);
        boolean boolean13 = executionEntity0.isSuspended();
        org.activiti.engine.impl.javax.el.ELContext eLContext14 = executionEntity0.getCachedElContext();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement15 = executionEntity0.getEventSource();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution16 = executionEntity0.getStartingExecution();
        java.lang.String str17 = executionEntity0.getBusinessKey();
        boolean boolean18 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList19 = executionEntity0.getExecutions();
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        java.lang.String str5 = executionEntity1.getProcessDefinitionId();
        java.lang.String str6 = executionEntity1.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str8 = executionEntity7.getCurrentActivityName();
        executionEntity7.setId("");
        int int11 = executionEntity7.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = executionEntity7.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap12);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl14 = executionEntity1.getProcessDefinition();
        executionEntity1.setSuspensionState((-1));
        executionEntity1.setProcessDefinitionId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity1.getProcessInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = executionEntity1.getProcessVariables();
        java.lang.String str21 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity22.setCachedEntityState((int) (short) 100);
        java.lang.String str25 = executionEntity22.getBusinessKey();
        executionEntity22.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity22);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getProcessInstance();
        executionEntity0.setDeleteReason("");
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity14.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList17 = executionEntity14.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList18 = executionEntity14.getEventSubscriptionsInternal();
        java.lang.String str19 = executionEntity14.getActivityId();
        boolean boolean20 = executionEntity14.isProcessInstanceType();
        executionEntity11.setSuperExecution(executionEntity14);
        executionEntity11.setActive(false);
        executionEntity11.disposeStartingExecution();
        boolean boolean25 = executionEntity11.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity11);
        executionEntity11.setProcessDefinitionId("hi!");
        java.lang.String str29 = executionEntity11.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = executionEntity11.updateProcessBusinessKey("ProcessInstance[]");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl12 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setSuperExecution(executionEntity14);
        boolean boolean16 = executionEntity13.isEventScope();
        executionEntity13.inactivate();
        boolean boolean18 = executionEntity13.isEventScope();
        java.lang.String str19 = executionEntity13.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity13.getSuperExecution();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        java.lang.String str22 = executionEntity13.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity13.insert();
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        java.lang.String str3 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = executionEntity0.updateProcessBusinessKey("ScopeExecution[null]");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = executionEntity0.getCachedElContext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity6.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution9 = executionEntity6.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity6.getEventSubscriptions();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity0.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[]");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.involveUser("ProcessInstance[null]", "ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        executionEntity0.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setSuperExecution(executionEntity9);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str12 = executionEntity11.getEventName();
        executionEntity9.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        boolean boolean15 = executionEntity0.isEventScope();
        executionEntity0.setId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList18 = executionEntity0.getTasks();
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity2.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        executionEntity2.setSuperExecution(executionEntity5);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity15.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity15.getEventSubscriptionsInternal();
        executionEntity15.setConcurrent(true);
        executionEntity15.setDeleteReason("");
        executionEntity0.setSuperExecution(executionEntity15);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = executionEntity15.getActivity();
        executionEntity15.setScope(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList28 = executionEntity15.getEventSubscriptions();
        boolean boolean29 = executionEntity15.isActive();
        executionEntity15.setExecutionListenerIndex((java.lang.Integer) 7);
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = executionEntity15.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity15.start();
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 7);
        executionEntity0.setParentId("ProcessInstance[null]");
        boolean boolean6 = executionEntity0.isDeleteRoot();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        boolean boolean6 = executionEntity0.isActive();
        executionEntity0.setActive(false);
        org.activiti.engine.EngineServices engineServices9 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution10 = executionEntity0.getStartingExecution();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = executionEntity0.getActivity();
        boolean boolean6 = executionEntity0.isEventScope();
        boolean boolean7 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        java.lang.String str5 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement6 = executionEntity1.getEventSource();
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = executionEntity1.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.insert();
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        executionEntity0.setProcessDefinitionId("");
        boolean boolean8 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList11 = executionEntity0.getCompensateEventSubscriptions("hi!");
        executionEntity0.setParentId("ProcessInstance[ProcessInstance[null]]");
        java.lang.String str14 = executionEntity0.getSuperExecutionId();
        executionEntity0.setEventName("ScopeExecution[null]");
        executionEntity0.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        executionEntity0.setDeleteReason("hi!");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution14 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = executionEntity0.getActivity();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray4 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5, variableInstanceEntityArray4);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5);
        java.lang.String str8 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.involveUser("ConcurrentScopeExecution[null]", "ProcessInstance[]");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.Integer int8 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.setTenantId("ProcessInstance[null]");
        executionEntity0.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = executionEntity0.isActive("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        java.lang.String str6 = executionEntity0.getActivityId();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        boolean boolean8 = executionEntity0.isEnded();
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity0.setBusinessKey("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity0.getSuperExecution();
        executionEntity0.setTenantId("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution16 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList17 = executionEntity0.getJobs();
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity2.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        executionEntity2.setSuperExecution(executionEntity5);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity15.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity15.getEventSubscriptionsInternal();
        executionEntity15.setConcurrent(true);
        executionEntity15.setDeleteReason("");
        executionEntity0.setSuperExecution(executionEntity15);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = executionEntity15.getActivity();
        executionEntity15.setScope(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList28 = executionEntity15.getEventSubscriptions();
        executionEntity15.setRevision((int) (byte) 10);
        java.lang.String str31 = executionEntity15.getEventName();
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = executionEntity15.getProcessVariables();
        executionEntity15.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity15.removeIdentityLinks();
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity2.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        executionEntity2.setSuperExecution(executionEntity5);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity0.getProcessVariables();
        java.lang.String str15 = executionEntity0.getProcessBusinessKey();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = executionEntity0.getProcessVariables();
        java.lang.Object obj17 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setDeleteReason("");
        executionEntity0.setEventName("hi!");
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList11 = executionEntity0.getTasks();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement12 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity0.createExecution();
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        int int6 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        boolean boolean6 = executionEntity0.isActive();
        executionEntity0.setActive(false);
        org.activiti.engine.EngineServices engineServices9 = executionEntity0.getEngineServices();
        boolean boolean10 = executionEntity0.isConcurrent();
        java.lang.String str11 = executionEntity0.getSuperExecutionId();
        executionEntity0.setEventName("ProcessInstance[ProcessInstance[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[hi!]");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isScope();
        executionEntity0.setId("");
        boolean boolean11 = executionEntity0.isSuspended();
        executionEntity0.setTenantId("ConcurrentScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        boolean boolean6 = executionEntity0.isActive();
        executionEntity0.setActive(false);
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = executionEntity0.updateProcessBusinessKey("ProcessInstance[hi!]");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getParent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        boolean boolean7 = executionEntity0.isDeleteRoot();
        java.lang.String str8 = executionEntity0.getId();
        executionEntity0.setId("ProcessInstance[]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean12 = executionEntity11.isEnded();
        boolean boolean13 = executionEntity11.isProcessInstanceType();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = executionEntity11.getTransitionBeingTaken();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList17 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isSuspended();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransition();
        java.lang.String str9 = executionEntity0.getEventName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices11 = executionEntity10.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity15.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity15.getEventSubscriptionsInternal();
        java.lang.String str20 = executionEntity15.getActivityId();
        boolean boolean21 = executionEntity15.isProcessInstanceType();
        executionEntity12.setSuperExecution(executionEntity15);
        executionEntity10.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = executionEntity10.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity25.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList28 = executionEntity25.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList29 = executionEntity25.getEventSubscriptionsInternal();
        executionEntity25.setConcurrent(true);
        executionEntity25.setDeleteReason("");
        executionEntity10.setSuperExecution(executionEntity25);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl35 = executionEntity25.getActivity();
        boolean boolean36 = executionEntity25.isActive();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity37 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity37.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList40 = executionEntity37.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList41 = executionEntity37.getEventSubscriptionsInternal();
        java.lang.String str42 = executionEntity37.getActivityId();
        boolean boolean43 = executionEntity37.isProcessInstanceType();
        boolean boolean44 = executionEntity37.isEventScope();
        executionEntity37.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList46 = executionEntity37.getCompensateEventSubscriptions();
        java.lang.String str47 = executionEntity37.getParentId();
        java.lang.String str48 = executionEntity37.toString();
        executionEntity25.setSuperExecution(executionEntity37);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity50 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity50.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList53 = executionEntity50.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList54 = executionEntity50.getEventSubscriptionsInternal();
        java.lang.String str55 = executionEntity50.getCurrentActivityName();
        boolean boolean56 = executionEntity50.isConcurrent();
        java.util.Map<java.lang.String, java.lang.Object> strMap57 = executionEntity50.getProcessVariables();
        boolean boolean58 = executionEntity50.isActive();
        executionEntity37.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity50);
        executionEntity0.setSuperExecution(executionEntity37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity62 = executionEntity0.findExecution("ProcessInstance[]");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.String str8 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity9.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity9.getEventSubscriptionsInternal();
        java.lang.String str14 = executionEntity9.getActivityId();
        boolean boolean15 = executionEntity9.isProcessInstanceType();
        boolean boolean16 = executionEntity9.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList23 = executionEntity20.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList24 = executionEntity20.getEventSubscriptionsInternal();
        java.lang.String str25 = executionEntity20.getActivityId();
        boolean boolean26 = executionEntity20.isProcessInstanceType();
        executionEntity17.setSuperExecution(executionEntity20);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices29 = executionEntity28.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity30.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity33.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList36 = executionEntity33.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList37 = executionEntity33.getEventSubscriptionsInternal();
        java.lang.String str38 = executionEntity33.getActivityId();
        boolean boolean39 = executionEntity33.isProcessInstanceType();
        executionEntity30.setSuperExecution(executionEntity33);
        executionEntity28.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity33);
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = executionEntity28.getProcessVariables();
        executionEntity20.setVariablesLocal(strMap42);
        executionEntity9.setVariables(strMap42);
        executionEntity0.setVariables(strMap42);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList46 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str47 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setScope(true);
        boolean boolean50 = executionEntity0.isProcessInstanceType();
        java.lang.String str51 = executionEntity0.getDeleteReason();
        java.lang.String str52 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isEnded();
        boolean boolean2 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity5 = executionEntity0.addIdentityLink("", "ProcessInstance[hi!]");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        boolean boolean7 = executionEntity0.isEnded();
        executionEntity0.setDeleteReason("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity11.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList15 = executionEntity11.getEventSubscriptionsInternal();
        executionEntity11.setConcurrent(true);
        executionEntity11.setActive(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution20 = executionEntity11.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity11.getProcessInstance();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = executionEntity11.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("ProcessInstance[]", (java.lang.Object) executionEntity11);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getParent();
        int int9 = executionEntity1.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getSubProcessInstance();
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        java.lang.String str8 = executionEntity3.getActivityId();
        boolean boolean9 = executionEntity3.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity3);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices12 = executionEntity11.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity16.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList19 = executionEntity16.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList20 = executionEntity16.getEventSubscriptionsInternal();
        java.lang.String str21 = executionEntity16.getActivityId();
        boolean boolean22 = executionEntity16.isProcessInstanceType();
        executionEntity13.setSuperExecution(executionEntity16);
        executionEntity11.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = executionEntity11.getProcessVariables();
        executionEntity3.setVariablesLocal(strMap25);
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = executionEntity3.getProcessVariables();
        java.lang.String str28 = executionEntity3.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity3.end();
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        java.lang.String str3 = executionEntity0.getDeleteReason();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity4.getStartingExecution();
        executionEntity4.setActive(true);
        executionEntity4.setScope(false);
        boolean boolean12 = executionEntity4.isScope();
        executionEntity4.setId("");
        executionEntity4.setId("");
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        java.lang.String str18 = executionEntity4.getEventName();
        java.lang.String str19 = executionEntity4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = executionEntity4.getProcessBusinessKey();
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        java.lang.String str6 = executionEntity0.getActivityId();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        boolean boolean8 = executionEntity0.isEnded();
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity0.findExecution("ProcessInstance[null]");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        java.lang.String str3 = executionEntity0.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        boolean boolean5 = executionEntity0.isDeleteRoot();
        executionEntity0.setActive(true);
        int int8 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setSuperExecution(executionEntity10);
        boolean boolean12 = executionEntity9.isEventScope();
        boolean boolean13 = executionEntity9.isEnded();
        boolean boolean14 = executionEntity9.isEnded();
        java.lang.String str15 = executionEntity9.getActivityId();
        executionEntity9.setEventScope(false);
        executionEntity9.setEventName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        boolean boolean7 = executionEntity0.isEventScope();
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        int int10 = executionEntity0.getRevision();
        boolean boolean11 = executionEntity0.isEventScope();
        java.lang.String str12 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList13 = executionEntity0.getJobs();
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        executionEntity0.inactivate();
        java.lang.String str6 = executionEntity0.getActivityId();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity0.getEventSubscriptions();
        executionEntity0.setParentId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getParent();
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        int int5 = executionEntity0.getRevision();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList9 = executionEntity0.getExecutions();
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransition();
        java.lang.String str5 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity8 = executionEntity0.involveUser("", "hi!");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        int int3 = executionEntity0.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        java.lang.String str6 = executionEntity0.getActivityId();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.findExecution("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        boolean boolean7 = executionEntity0.isEnded();
        executionEntity0.setEventScope(false);
        java.lang.String str10 = executionEntity0.toString();
        int int11 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isEventScope();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList8 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = executionEntity0.getActivity();
        int int13 = executionEntity0.getRevisionNext();
        boolean boolean14 = executionEntity0.isProcessInstanceType();
        java.lang.String str15 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[null]");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = executionEntity0.getActivity();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.lang.String str4 = executionEntity0.getBusinessKey();
        executionEntity0.setEventName("ProcessInstance[ProcessInstance[null]]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str8 = executionEntity7.getCurrentActivityName();
        int int9 = executionEntity7.getCachedEntityState();
        int int10 = executionEntity7.getSuspensionState();
        java.lang.String str11 = executionEntity7.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setSuperExecution(executionEntity13);
        boolean boolean15 = executionEntity12.isEventScope();
        executionEntity12.inactivate();
        executionEntity7.setSuperExecution(executionEntity12);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity18.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity21.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList24 = executionEntity21.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList25 = executionEntity21.getEventSubscriptionsInternal();
        java.lang.String str26 = executionEntity21.getActivityId();
        boolean boolean27 = executionEntity21.isProcessInstanceType();
        executionEntity18.setSuperExecution(executionEntity21);
        executionEntity12.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
        executionEntity12.setExecutionListenerIndex((java.lang.Integer) 6);
        executionEntity12.setParentId("ProcessInstance[null]");
        executionEntity0.setSuperExecution(executionEntity12);
        executionEntity12.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity12.removeIdentityLinks();
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 7);
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList5 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        java.lang.String str8 = executionEntity0.getId();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[null]");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setActive(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution9 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getProcessInstance();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.getProcessInstance();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList13 = executionEntity0.getCompensateEventSubscriptions("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = executionEntity0.getTransition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl15 = executionEntity0.getProcessDefinition();
        boolean boolean16 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = executionEntity0.updateProcessBusinessKey("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        java.lang.String str2 = executionEntity0.getProcessInstanceId();
        executionEntity0.setRevision((int) (short) -1);
        executionEntity0.setBusinessKey("ProcessInstance[hi!]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity2.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        executionEntity2.setSuperExecution(executionEntity5);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl14 = executionEntity0.getProcessDefinition();
        int int15 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList16 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1235");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        executionEntity0.setParentId("hi!");
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        java.lang.String str8 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1236");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution10 = executionEntity0.getStartingExecution();
        boolean boolean11 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1237");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.String str8 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList15 = executionEntity12.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList16 = executionEntity12.getEventSubscriptionsInternal();
        java.lang.String str17 = executionEntity12.getActivityId();
        boolean boolean18 = executionEntity12.isProcessInstanceType();
        executionEntity9.setSuperExecution(executionEntity12);
        executionEntity9.setActive(false);
        executionEntity9.disposeStartingExecution();
        java.lang.String str23 = executionEntity9.getParentId();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.lang.String str25 = executionEntity9.toString();
        executionEntity9.setTenantId("");
        executionEntity9.setParentId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList30 = executionEntity9.getExecutions();
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1238");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isEventScope();
        executionEntity0.setDeleteReason("hi!");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity0.getQueryVariables();
        executionEntity0.setEventName("hi!");
        int int10 = executionEntity0.getRevisionNext();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity0.getEventSubscriptions();
        boolean boolean12 = executionEntity0.isDeleteRoot();
        executionEntity0.setParentId("ProcessInstance[hi!]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity0.createExecution();
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1239");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = executionEntity0.getActivity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setSuperExecution(executionEntity14);
        boolean boolean16 = executionEntity13.isEventScope();
        boolean boolean17 = executionEntity13.isEnded();
        executionEntity13.disposeStartingExecution();
        boolean boolean19 = executionEntity13.isActive();
        executionEntity13.setActive(false);
        org.activiti.engine.EngineServices engineServices22 = executionEntity13.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity23.setSuperExecution(executionEntity24);
        org.activiti.engine.impl.javax.el.ELContext eLContext26 = executionEntity24.getCachedElContext();
        boolean boolean27 = executionEntity24.isActive();
        java.lang.String str28 = executionEntity24.getProcessDefinitionId();
        java.lang.String str29 = executionEntity24.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str31 = executionEntity30.getCurrentActivityName();
        executionEntity30.setId("");
        int int34 = executionEntity30.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = executionEntity30.getProcessVariables();
        executionEntity24.setVariablesLocal(strMap35);
        executionEntity13.setVariables(strMap35);
        executionEntity0.createVariablesLocal(strMap35);
        executionEntity0.setParentId("ProcessInstance[]");
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList41 = executionEntity0.getCompensateEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity44 = executionEntity0.involveUser("ProcessInstance[null]", "ProcessInstance[hi!]");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1240");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getEventName();
        boolean boolean2 = executionEntity0.isConcurrent();
        java.lang.String str3 = executionEntity0.getActivityId();
        executionEntity0.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.updateProcessBusinessKey("");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1241");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = executionEntity0.getActivity();
        int int13 = executionEntity0.getRevisionNext();
        int int14 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = executionEntity0.isActive("ProcessInstance[null]");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1242");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        executionEntity0.setActive(false);
        int int7 = executionEntity0.getRevisionNext();
        boolean boolean8 = executionEntity0.isDeleteRoot();
        int int9 = executionEntity0.getRevisionNext();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1243");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity2.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        executionEntity2.setSuperExecution(executionEntity5);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity15.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity15.getEventSubscriptionsInternal();
        executionEntity15.setConcurrent(true);
        executionEntity15.setDeleteReason("");
        executionEntity0.setSuperExecution(executionEntity15);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = executionEntity15.getActivity();
        boolean boolean26 = executionEntity15.isActive();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity27.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList30 = executionEntity27.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList31 = executionEntity27.getEventSubscriptionsInternal();
        java.lang.String str32 = executionEntity27.getActivityId();
        boolean boolean33 = executionEntity27.isProcessInstanceType();
        boolean boolean34 = executionEntity27.isEventScope();
        executionEntity27.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList36 = executionEntity27.getCompensateEventSubscriptions();
        java.lang.String str37 = executionEntity27.getParentId();
        java.lang.String str38 = executionEntity27.toString();
        executionEntity15.setSuperExecution(executionEntity27);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity40.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList43 = executionEntity40.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList44 = executionEntity40.getEventSubscriptionsInternal();
        java.lang.String str45 = executionEntity40.getCurrentActivityName();
        boolean boolean46 = executionEntity40.isConcurrent();
        java.util.Map<java.lang.String, java.lang.Object> strMap47 = executionEntity40.getProcessVariables();
        boolean boolean48 = executionEntity40.isActive();
        executionEntity27.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity40);
        executionEntity27.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity51 = executionEntity27.getSubProcessInstance();
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1244");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        int int7 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.createExecution();
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1245");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getEventName();
        boolean boolean2 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList3 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1246");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = executionEntity0.getActivity();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        boolean boolean4 = executionEntity0.isEventScope();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.updateProcessBusinessKey("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1247");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution2 = executionEntity0.getStartingExecution();
        boolean boolean3 = executionEntity0.isProcessInstanceType();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.findExecution("ProcessInstance[hi!]");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1248");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = executionEntity0.getActivity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setSuperExecution(executionEntity14);
        boolean boolean16 = executionEntity13.isEventScope();
        boolean boolean17 = executionEntity13.isEnded();
        executionEntity13.disposeStartingExecution();
        boolean boolean19 = executionEntity13.isActive();
        executionEntity13.setActive(false);
        org.activiti.engine.EngineServices engineServices22 = executionEntity13.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity23.setSuperExecution(executionEntity24);
        org.activiti.engine.impl.javax.el.ELContext eLContext26 = executionEntity24.getCachedElContext();
        boolean boolean27 = executionEntity24.isActive();
        java.lang.String str28 = executionEntity24.getProcessDefinitionId();
        java.lang.String str29 = executionEntity24.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str31 = executionEntity30.getCurrentActivityName();
        executionEntity30.setId("");
        int int34 = executionEntity30.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = executionEntity30.getProcessVariables();
        executionEntity24.setVariablesLocal(strMap35);
        executionEntity13.setVariables(strMap35);
        executionEntity0.createVariablesLocal(strMap35);
        boolean boolean39 = executionEntity0.isEventScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList40 = executionEntity0.getQueryVariables();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity45 = executionEntity0.involveUser("ProcessInstance[ProcessInstance[null]]", "ScopeExecution[null]");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1249");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl12 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setSuperExecution(executionEntity14);
        boolean boolean16 = executionEntity13.isEventScope();
        executionEntity13.inactivate();
        boolean boolean18 = executionEntity13.isEventScope();
        java.lang.String str19 = executionEntity13.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity13.getSuperExecution();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = executionEntity13.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity23.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList26 = executionEntity23.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList27 = executionEntity23.getEventSubscriptionsInternal();
        executionEntity23.setConcurrent(true);
        java.lang.Object obj30 = executionEntity23.getPersistentState();
        executionEntity23.setBusinessKey("");
        executionEntity23.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl35 = executionEntity23.getTransition();
        java.lang.String str36 = executionEntity23.getCurrentActivityId();
        boolean boolean37 = executionEntity23.isProcessInstanceType();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList38 = executionEntity23.getQueryVariables();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl39 = executionEntity23.getProcessDefinition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity40.setCachedEntityState((int) (short) 100);
        executionEntity40.setActive(false);
        executionEntity40.setActive(false);
        int int47 = executionEntity40.getRevisionNext();
        java.lang.String str48 = executionEntity40.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity49 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity49.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList52 = executionEntity49.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList53 = executionEntity49.getEventSubscriptionsInternal();
        executionEntity49.setConcurrent(true);
        java.lang.Object obj56 = executionEntity49.getPersistentState();
        executionEntity49.setBusinessKey("");
        executionEntity49.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl61 = executionEntity49.getTransition();
        java.lang.String str62 = executionEntity49.getCurrentActivityId();
        boolean boolean63 = executionEntity49.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity64 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices65 = executionEntity64.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity66 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity66.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity69 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity69.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList72 = executionEntity69.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList73 = executionEntity69.getEventSubscriptionsInternal();
        java.lang.String str74 = executionEntity69.getActivityId();
        boolean boolean75 = executionEntity69.isProcessInstanceType();
        executionEntity66.setSuperExecution(executionEntity69);
        executionEntity64.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity69);
        java.util.Map<java.lang.String, java.lang.Object> strMap78 = executionEntity64.getProcessVariables();
        executionEntity49.createVariablesLocal(strMap78);
        executionEntity40.createVariablesLocal(strMap78);
        executionEntity23.setVariablesLocal(strMap78);
        executionEntity22.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity22.deleteCascade("hi!");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1250");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        boolean boolean7 = executionEntity0.isEventScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList8 = executionEntity0.getQueryVariables();
        executionEntity0.setRevision((int) '#');
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.getSuperExecution();
        java.lang.String str12 = executionEntity0.toString();
        executionEntity0.setScope(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList15 = executionEntity0.getTasks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1251");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        java.lang.Object obj9 = executionEntity0.getPersistentState();
        int int10 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setSuperExecution(executionEntity12);
        boolean boolean14 = executionEntity11.isEnded();
        java.lang.Object obj15 = executionEntity11.getPersistentState();
        executionEntity11.setParentId("hi!");
        boolean boolean18 = executionEntity11.isDeleteRoot();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList20 = executionEntity11.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity21.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList24 = executionEntity21.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList25 = executionEntity21.getEventSubscriptionsInternal();
        executionEntity21.setConcurrent(true);
        executionEntity21.setActive(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution30 = executionEntity21.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray31 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList32 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList32, variableInstanceEntityArray31);
        executionEntity21.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList32);
        executionEntity11.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = executionEntity11.getSubProcessInstance();
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1252");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        executionEntity1.setEventScope(false);
        executionEntity1.setRevision((int) (byte) -1);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 100);
        executionEntity1.setProcessDefinitionId("ConcurrentScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity15 = executionEntity1.involveUser("", "");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1253");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        java.lang.String str8 = executionEntity0.getId();
        int int9 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1254");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices6 = executionEntity5.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList13 = executionEntity10.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList14 = executionEntity10.getEventSubscriptionsInternal();
        java.lang.String str15 = executionEntity10.getActivityId();
        boolean boolean16 = executionEntity10.isProcessInstanceType();
        executionEntity7.setSuperExecution(executionEntity10);
        executionEntity5.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = executionEntity5.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList23 = executionEntity20.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList24 = executionEntity20.getEventSubscriptionsInternal();
        executionEntity20.setConcurrent(true);
        executionEntity20.setDeleteReason("");
        executionEntity5.setSuperExecution(executionEntity20);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl30 = executionEntity20.getActivity();
        executionEntity20.setScope(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList33 = executionEntity20.getEventSubscriptions();
        executionEntity20.setRevision((int) (byte) 10);
        java.lang.String str36 = executionEntity20.getEventName();
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = executionEntity20.getProcessVariables();
        executionEntity1.setVariables(strMap37);
        executionEntity1.setEventName("ProcessInstance[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.start();
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1255");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        int int2 = executionEntity0.getRevision();
        java.lang.String str3 = executionEntity0.getActivityId();
        java.lang.String str4 = executionEntity0.getActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setProcessDefinitionId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.involveUser("hi!", "ProcessInstance[hi!]");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1256");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl5 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[null]");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1257");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        java.lang.String str3 = executionEntity0.getDeleteReason();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity4.getStartingExecution();
        executionEntity4.setActive(true);
        executionEntity4.setScope(false);
        boolean boolean12 = executionEntity4.isScope();
        executionEntity4.setId("");
        executionEntity4.setId("");
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        java.lang.String str18 = executionEntity4.getEventName();
        int int19 = executionEntity4.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList20 = executionEntity4.findActiveActivityIds();
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1258");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity2.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        executionEntity2.setSuperExecution(executionEntity5);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity0.getProcessVariables();
        executionEntity0.setRevision((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity0.createExecution();
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1259");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList1 = executionEntity0.getQueryVariables();
        org.activiti.engine.EngineServices engineServices2 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        executionEntity3.setConcurrent(true);
        java.lang.Object obj10 = executionEntity3.getPersistentState();
        boolean boolean11 = executionEntity3.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity3.getCompensateEventSubscriptions("hi!");
        executionEntity3.setParentId("ProcessInstance[ProcessInstance[null]]");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        java.lang.String str18 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray19 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList20 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList20, variableInstanceEntityArray19);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = executionEntity0.findExecution("ProcessInstance[hi!]");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1260");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        executionEntity0.setScope(false);
        boolean boolean7 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.createExecution();
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1261");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = executionEntity0.getActivity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setSuperExecution(executionEntity14);
        boolean boolean16 = executionEntity13.isEventScope();
        boolean boolean17 = executionEntity13.isEnded();
        executionEntity13.disposeStartingExecution();
        boolean boolean19 = executionEntity13.isActive();
        executionEntity13.setActive(false);
        org.activiti.engine.EngineServices engineServices22 = executionEntity13.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity23.setSuperExecution(executionEntity24);
        org.activiti.engine.impl.javax.el.ELContext eLContext26 = executionEntity24.getCachedElContext();
        boolean boolean27 = executionEntity24.isActive();
        java.lang.String str28 = executionEntity24.getProcessDefinitionId();
        java.lang.String str29 = executionEntity24.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str31 = executionEntity30.getCurrentActivityName();
        executionEntity30.setId("");
        int int34 = executionEntity30.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = executionEntity30.getProcessVariables();
        executionEntity24.setVariablesLocal(strMap35);
        executionEntity13.setVariables(strMap35);
        executionEntity0.createVariablesLocal(strMap35);
        boolean boolean39 = executionEntity0.isEventScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList40 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList41 = executionEntity0.getExecutions();
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1262");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        java.lang.String str5 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList7 = executionEntity0.getExecutions();
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1263");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setDeleteReason("");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity0.getEventSubscriptionsInternal();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices11 = executionEntity10.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity15.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity15.getEventSubscriptionsInternal();
        java.lang.String str20 = executionEntity15.getActivityId();
        boolean boolean21 = executionEntity15.isProcessInstanceType();
        executionEntity12.setSuperExecution(executionEntity15);
        executionEntity10.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = executionEntity10.getProcessVariables();
        executionEntity0.setVariables(strMap24);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl26 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setScope(true);
        int int29 = executionEntity0.getRevisionNext();
        java.lang.String str30 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList31 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1264");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity2.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        executionEntity2.setSuperExecution(executionEntity5);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity15.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity15.getEventSubscriptionsInternal();
        executionEntity15.setConcurrent(true);
        executionEntity15.setDeleteReason("");
        executionEntity0.setSuperExecution(executionEntity15);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = executionEntity15.getActivity();
        boolean boolean26 = executionEntity15.isActive();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity27.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList30 = executionEntity27.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList31 = executionEntity27.getEventSubscriptionsInternal();
        java.lang.String str32 = executionEntity27.getActivityId();
        boolean boolean33 = executionEntity27.isProcessInstanceType();
        boolean boolean34 = executionEntity27.isEventScope();
        executionEntity27.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList36 = executionEntity27.getCompensateEventSubscriptions();
        java.lang.String str37 = executionEntity27.getParentId();
        java.lang.String str38 = executionEntity27.toString();
        executionEntity15.setSuperExecution(executionEntity27);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution40 = executionEntity27.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean42 = executionEntity27.isActive("ProcessInstance[hi!]");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1265");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = executionEntity0.isActive("ProcessInstance[null]");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1266");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        java.lang.Object obj9 = executionEntity0.getPersistentState();
        int int10 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setSuperExecution(executionEntity12);
        boolean boolean14 = executionEntity11.isEnded();
        java.lang.Object obj15 = executionEntity11.getPersistentState();
        executionEntity11.setParentId("hi!");
        boolean boolean18 = executionEntity11.isDeleteRoot();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity23.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList26 = executionEntity23.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList27 = executionEntity23.getEventSubscriptionsInternal();
        java.lang.String str28 = executionEntity23.getActivityId();
        boolean boolean29 = executionEntity23.isProcessInstanceType();
        executionEntity20.setSuperExecution(executionEntity23);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity31.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl34 = executionEntity31.getActivity();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray35 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList36 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList36, variableInstanceEntityArray35);
        executionEntity31.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList36);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement39 = executionEntity31.getEventSource();
        executionEntity23.setSuperExecution(executionEntity31);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity41.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList44 = executionEntity41.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList45 = executionEntity41.getEventSubscriptionsInternal();
        java.lang.String str46 = executionEntity41.getActivityId();
        boolean boolean47 = executionEntity41.isProcessInstanceType();
        boolean boolean48 = executionEntity41.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity49 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity49.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity52 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity52.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList55 = executionEntity52.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList56 = executionEntity52.getEventSubscriptionsInternal();
        java.lang.String str57 = executionEntity52.getActivityId();
        boolean boolean58 = executionEntity52.isProcessInstanceType();
        executionEntity49.setSuperExecution(executionEntity52);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity60 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices61 = executionEntity60.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity62 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity62.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity65 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity65.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList68 = executionEntity65.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList69 = executionEntity65.getEventSubscriptionsInternal();
        java.lang.String str70 = executionEntity65.getActivityId();
        boolean boolean71 = executionEntity65.isProcessInstanceType();
        executionEntity62.setSuperExecution(executionEntity65);
        executionEntity60.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity65);
        java.util.Map<java.lang.String, java.lang.Object> strMap74 = executionEntity60.getProcessVariables();
        executionEntity52.setVariablesLocal(strMap74);
        executionEntity41.setVariables(strMap74);
        executionEntity31.setVariablesLocal(strMap74);
        executionEntity11.setVariables(strMap74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity79 = executionEntity11.getSubProcessInstance();
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1267");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        executionEntity0.setConcurrent(true);
        int int11 = executionEntity0.getRevision();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1268");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        executionEntity0.setSuspensionState((-1));
        executionEntity0.setActive(false);
        boolean boolean10 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity13 = executionEntity0.addIdentityLink("ProcessInstance[ProcessInstance[null]]", "");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1269");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        int int11 = executionEntity5.getSuspensionState();
        java.lang.String str12 = executionEntity5.getDeleteReason();
        executionEntity5.setSuspensionState(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity5.deleteCascade("");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1270");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.String str8 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity9.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity9.getEventSubscriptionsInternal();
        java.lang.String str14 = executionEntity9.getActivityId();
        boolean boolean15 = executionEntity9.isProcessInstanceType();
        boolean boolean16 = executionEntity9.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList23 = executionEntity20.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList24 = executionEntity20.getEventSubscriptionsInternal();
        java.lang.String str25 = executionEntity20.getActivityId();
        boolean boolean26 = executionEntity20.isProcessInstanceType();
        executionEntity17.setSuperExecution(executionEntity20);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices29 = executionEntity28.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity30.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity33.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList36 = executionEntity33.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList37 = executionEntity33.getEventSubscriptionsInternal();
        java.lang.String str38 = executionEntity33.getActivityId();
        boolean boolean39 = executionEntity33.isProcessInstanceType();
        executionEntity30.setSuperExecution(executionEntity33);
        executionEntity28.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity33);
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = executionEntity28.getProcessVariables();
        executionEntity20.setVariablesLocal(strMap42);
        executionEntity9.setVariables(strMap42);
        executionEntity0.setVariables(strMap42);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList46 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str47 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setScope(true);
        boolean boolean50 = executionEntity0.isProcessInstanceType();
        java.lang.String str51 = executionEntity0.getDeleteReason();
        int int52 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity53 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1271");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.javax.el.ELContext eLContext1 = executionEntity0.getCachedElContext();
        executionEntity0.setCachedEntityState(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList4 = executionEntity0.getExecutions();
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1272");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.disposeStartingExecution();
        boolean boolean5 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1273");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        executionEntity0.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setSuperExecution(executionEntity9);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str12 = executionEntity11.getEventName();
        executionEntity9.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        java.lang.Integer int15 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str16 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity19 = executionEntity0.addIdentityLink("", "ProcessInstance[null]");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1274");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(false);
        java.lang.String str9 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setSuperExecution(executionEntity11);
        boolean boolean13 = executionEntity10.isEnded();
        java.lang.Object obj14 = executionEntity10.getPersistentState();
        boolean boolean15 = executionEntity10.isProcessInstanceType();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices18 = executionEntity17.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity19.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity22.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList25 = executionEntity22.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList26 = executionEntity22.getEventSubscriptionsInternal();
        java.lang.String str27 = executionEntity22.getActivityId();
        boolean boolean28 = executionEntity22.isProcessInstanceType();
        executionEntity19.setSuperExecution(executionEntity22);
        executionEntity17.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity22);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = executionEntity17.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity32.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList35 = executionEntity32.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList36 = executionEntity32.getEventSubscriptionsInternal();
        executionEntity32.setConcurrent(true);
        executionEntity32.setDeleteReason("");
        executionEntity17.setSuperExecution(executionEntity32);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl42 = executionEntity32.getActivity();
        executionEntity32.setScope(false);
        executionEntity0.setSuperExecution(executionEntity32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1275");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setId("");
        java.lang.Integer int4 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity0.getDeleteReason();
        executionEntity0.setDeleteReason("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.updateProcessBusinessKey("");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1276");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        java.lang.String str8 = executionEntity3.getActivityId();
        boolean boolean9 = executionEntity3.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity3);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices12 = executionEntity11.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity16.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList19 = executionEntity16.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList20 = executionEntity16.getEventSubscriptionsInternal();
        java.lang.String str21 = executionEntity16.getActivityId();
        boolean boolean22 = executionEntity16.isProcessInstanceType();
        executionEntity13.setSuperExecution(executionEntity16);
        executionEntity11.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = executionEntity11.getProcessVariables();
        executionEntity3.setVariablesLocal(strMap25);
        org.activiti.engine.EngineServices engineServices27 = executionEntity3.getEngineServices();
        executionEntity3.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList29 = executionEntity3.getIdentityLinks();
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1277");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        executionEntity0.forceUpdate();
        java.lang.String str5 = executionEntity0.getCurrentActivityId();
        java.lang.String str6 = executionEntity0.getEventName();
        executionEntity0.setTenantId("hi!");
        java.lang.String str9 = executionEntity0.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setSuperExecution(executionEntity11);
        org.activiti.engine.impl.javax.el.ELContext eLContext13 = executionEntity11.getCachedElContext();
        boolean boolean14 = executionEntity11.isActive();
        java.lang.String str15 = executionEntity11.getProcessDefinitionId();
        java.lang.String str16 = executionEntity11.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str18 = executionEntity17.getCurrentActivityName();
        executionEntity17.setId("");
        int int21 = executionEntity17.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = executionEntity17.getProcessVariables();
        executionEntity11.setVariablesLocal(strMap22);
        executionEntity0.createVariablesLocal(strMap22);
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 5);
        boolean boolean27 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1278");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.Integer int8 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = executionEntity0.isActive("ProcessInstance[null]");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1279");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isActive();
        boolean boolean9 = executionEntity0.isEventScope();
        boolean boolean10 = executionEntity0.isActive();
        java.lang.String str11 = executionEntity0.toString();
        boolean boolean12 = executionEntity0.isActive();
        java.lang.String str13 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity0.createExecution();
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1280");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        java.lang.String str8 = executionEntity3.getActivityId();
        boolean boolean9 = executionEntity3.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity3);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices12 = executionEntity11.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity16.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList19 = executionEntity16.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList20 = executionEntity16.getEventSubscriptionsInternal();
        java.lang.String str21 = executionEntity16.getActivityId();
        boolean boolean22 = executionEntity16.isProcessInstanceType();
        executionEntity13.setSuperExecution(executionEntity16);
        executionEntity11.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = executionEntity11.getProcessVariables();
        executionEntity3.setVariablesLocal(strMap25);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity27.setSuperExecution(executionEntity28);
        boolean boolean30 = executionEntity27.isEventScope();
        boolean boolean31 = executionEntity27.isEnded();
        executionEntity27.disposeStartingExecution();
        boolean boolean33 = executionEntity27.isActive();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl34 = executionEntity27.getTransitionBeingTaken();
        boolean boolean35 = executionEntity27.isScope();
        executionEntity27.setBusinessKey("");
        int int38 = executionEntity27.getCachedEntityState();
        executionEntity3.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity27);
        java.lang.String str40 = executionEntity27.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList42 = executionEntity27.getCompensateEventSubscriptions("ProcessInstance[]");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1281");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        java.lang.String str5 = executionEntity1.getProcessDefinitionId();
        java.lang.String str6 = executionEntity1.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str8 = executionEntity7.getCurrentActivityName();
        executionEntity7.setId("");
        int int11 = executionEntity7.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = executionEntity7.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap12);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl14 = executionEntity1.getProcessDefinition();
        executionEntity1.setSuspensionState((-1));
        executionEntity1.setProcessDefinitionId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity1.getProcessInstance();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity21.setSuperExecution(executionEntity22);
        boolean boolean24 = executionEntity21.isEventScope();
        boolean boolean25 = executionEntity21.isEnded();
        executionEntity21.disposeStartingExecution();
        boolean boolean27 = executionEntity21.isActive();
        executionEntity21.setActive(false);
        org.activiti.engine.EngineServices engineServices30 = executionEntity21.getEngineServices();
        boolean boolean31 = executionEntity21.isConcurrent();
        boolean boolean32 = executionEntity21.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.signal("ProcessInstance[]", (java.lang.Object) executionEntity21);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1282");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = executionEntity0.getActivity();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray4 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5, variableInstanceEntityArray4);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5);
        java.lang.String str8 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.involveUser("ProcessInstance[hi!]", "hi!");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1283");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = executionEntity0.getActivity();
        boolean boolean6 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = executionEntity0.isActive("ProcessInstance[hi!]");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1284");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1285");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        executionEntity0.setActive(false);
        int int7 = executionEntity0.getRevisionNext();
        java.lang.String str8 = executionEntity0.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityName();
        executionEntity9.setId("");
        int int13 = executionEntity9.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity9.getProcessVariables();
        executionEntity9.setScope(true);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity9.getProcessVariables();
        executionEntity0.setVariablesLocal(strMap17);
        java.lang.String str19 = executionEntity0.getBusinessKey();
        java.lang.Integer int20 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.setEventName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity25 = executionEntity0.involveUser("hi!", "ProcessInstance[]");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1286");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        boolean boolean6 = executionEntity0.isActive();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity0.getTransitionBeingTaken();
        boolean boolean8 = executionEntity0.isScope();
        executionEntity0.setBusinessKey("");
        int int11 = executionEntity0.getCachedEntityState();
        java.lang.String str12 = executionEntity0.toString();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity0.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList20 = executionEntity17.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList21 = executionEntity17.getEventSubscriptionsInternal();
        java.lang.String str22 = executionEntity17.getActivityId();
        boolean boolean23 = executionEntity17.isProcessInstanceType();
        boolean boolean24 = executionEntity17.isEventScope();
        executionEntity17.setBusinessKey("ProcessInstance[null]");
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl28 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList29 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1287");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        executionEntity0.setConcurrent(true);
        boolean boolean10 = executionEntity0.isEventScope();
        org.activiti.engine.EngineServices engineServices11 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1288");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.String str8 = executionEntity0.getBusinessKey();
        java.lang.String str9 = executionEntity0.getEventName();
        boolean boolean10 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1289");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getProcessInstance();
        int int2 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1290");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = executionEntity0.getActivity();
        executionEntity0.setScope(false);
        java.lang.String str6 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList7 = executionEntity0.getExecutions();
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1291");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isScope();
        executionEntity0.setId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity13 = executionEntity0.involveUser("", "ProcessInstance[]");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1292");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setActive(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution9 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getProcessInstance();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.getProcessInstance();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList13 = executionEntity0.getCompensateEventSubscriptions("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = executionEntity0.getTransition();
        executionEntity0.setId("hi!");
        executionEntity0.setTenantId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1293");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        java.lang.String str8 = executionEntity3.getActivityId();
        boolean boolean9 = executionEntity3.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity3);
        executionEntity0.setActive(false);
        boolean boolean13 = executionEntity0.isSuspended();
        org.activiti.engine.impl.javax.el.ELContext eLContext14 = executionEntity0.getCachedElContext();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement15 = executionEntity0.getEventSource();
        executionEntity0.setId("ProcessInstance[ProcessInstance[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList18 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1294");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isSuspended();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.addIdentityLink("", "");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1295");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isEventScope();
        executionEntity0.setDeleteReason("hi!");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity0.getQueryVariables();
        executionEntity0.setEventName("hi!");
        int int10 = executionEntity0.getRevisionNext();
        executionEntity0.setEventScope(true);
        executionEntity0.setEventScope(false);
        java.lang.String str15 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1296");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList8 = executionEntity0.getExecutions();
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1297");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransition();
        java.lang.String str5 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.findExecution("");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1298");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity1.getActivity();
        java.lang.String str7 = executionEntity1.getBusinessKey();
        executionEntity1.setId("ProcessInstance[null]");
        java.lang.String str10 = executionEntity1.getSuperExecutionId();
        boolean boolean11 = executionEntity1.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = executionEntity1.getProcessBusinessKey();
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1299");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity0.getTransition();
        java.lang.String str13 = executionEntity0.getCurrentActivityId();
        java.lang.String str14 = executionEntity0.getCurrentActivityName();
        executionEntity0.forceUpdate();
        executionEntity0.setEventName("");
        java.lang.String str18 = executionEntity0.getParentId();
        boolean boolean19 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity22 = executionEntity0.addIdentityLink("ProcessInstance[hi!]", "");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1300");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        executionEntity0.setEventName("ProcessInstance[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList6 = executionEntity0.getExecutions();
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1301");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isScope();
        executionEntity0.setId("");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity0.getEventSubscriptions();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity0.getParent();
        java.lang.String str15 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = executionEntity0.isActive("hi!");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1302");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ScopeExecution[null]");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1303");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        executionEntity0.inactivate();
        java.lang.String str6 = executionEntity0.getActivityId();
        java.lang.String str7 = executionEntity0.getActivityId();
        boolean boolean8 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[null]");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1304");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        executionEntity0.inactivate();
        boolean boolean5 = executionEntity0.isEventScope();
        java.lang.String str6 = executionEntity0.getProcessDefinitionId();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setDeleteReason("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1305");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        executionEntity0.setConcurrent(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity0.getEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList11 = executionEntity0.getExecutions();
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1306");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = executionEntity0.getCachedElContext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity6.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution9 = executionEntity6.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity6.getEventSubscriptions();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity0.setScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity14.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList17 = executionEntity14.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList18 = executionEntity14.getEventSubscriptionsInternal();
        executionEntity14.setConcurrent(true);
        java.lang.Object obj21 = executionEntity14.getPersistentState();
        executionEntity14.setBusinessKey("");
        executionEntity14.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl26 = executionEntity14.getTransition();
        java.lang.String str27 = executionEntity14.getCurrentActivityId();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = executionEntity14.getProcessVariables();
        executionEntity0.setVariablesLocal(strMap28);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList30 = executionEntity0.getCompensateEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList31 = executionEntity0.getJobs();
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1307");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        boolean boolean7 = executionEntity0.isEnded();
        executionEntity0.setDeleteReason("hi!");
        java.lang.String str10 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity0.findExecution("");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1308");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity1.updateProcessBusinessKey("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1309");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity4.getCompensateEventSubscriptions();
        boolean boolean8 = executionEntity4.isEventScope();
        org.activiti.engine.EngineServices engineServices9 = executionEntity4.getEngineServices();
        java.lang.String str10 = executionEntity4.getId();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        org.activiti.engine.EngineServices engineServices12 = executionEntity4.getEngineServices();
        java.lang.String str13 = executionEntity4.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.start();
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1310");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getParent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        boolean boolean7 = executionEntity0.isDeleteRoot();
        java.lang.String str8 = executionEntity0.getId();
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity13 = executionEntity0.involveUser("ProcessInstance[]", "hi!");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1311");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity0.getTransition();
        java.lang.String str13 = executionEntity0.getCurrentActivityId();
        java.lang.String str14 = executionEntity0.getCurrentActivityName();
        executionEntity0.setEventScope(true);
        java.lang.String str17 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = executionEntity0.getActivity();
        java.lang.String str19 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1312");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        boolean boolean7 = executionEntity0.isEnded();
        java.lang.String str8 = executionEntity0.getProcessDefinitionId();
        java.lang.String str9 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1313");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.disposeStartingExecution();
        boolean boolean5 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.createExecution();
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1314");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        int int4 = executionEntity0.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setProcessDefinitionId("ProcessInstance[hi!]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1315");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        java.lang.String str5 = executionEntity0.getDeleteReason();
        java.lang.String str6 = executionEntity0.getBusinessKey();
        executionEntity0.setTenantId("ConcurrentScopeExecution[null]");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.createExecution();
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1316");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl12 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setSuperExecution(executionEntity14);
        boolean boolean16 = executionEntity13.isEventScope();
        executionEntity13.inactivate();
        boolean boolean18 = executionEntity13.isEventScope();
        java.lang.String str19 = executionEntity13.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity13.getSuperExecution();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = executionEntity13.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList23 = executionEntity22.getEventSubscriptions();
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1317");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        boolean boolean6 = executionEntity0.isActive();
        executionEntity0.setProcessDefinitionId("ProcessInstance[ProcessInstance[null]]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity9.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity9.getEventSubscriptionsInternal();
        executionEntity9.setConcurrent(true);
        executionEntity9.setDeleteReason("");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList18 = executionEntity9.getEventSubscriptionsInternal();
        executionEntity9.setSuspensionState((int) (short) -1);
        java.lang.String str21 = executionEntity9.getCurrentActivityId();
        executionEntity9.inactivate();
        executionEntity9.setEventScope(true);
        int int25 = executionEntity9.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = executionEntity9.getParent();
        java.lang.String str27 = executionEntity9.getDeleteReason();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList29 = executionEntity0.getTasks();
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1318");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        java.lang.String str4 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList5 = executionEntity0.getJobs();
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1319");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        executionEntity0.setSuspensionState((-1));
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity0.getEventSource();
        java.lang.String str9 = executionEntity0.getSuperExecutionId();
        executionEntity0.setConcurrent(true);
        java.lang.String str12 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity0.createExecution();
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1320");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        boolean boolean6 = executionEntity0.isActive();
        executionEntity0.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity0.getTransition();
        java.lang.String str10 = executionEntity0.getParentId();
        executionEntity0.setProcessDefinitionId("ProcessInstance[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1321");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        executionEntity0.setConcurrent(true);
        boolean boolean10 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList11 = executionEntity0.getExecutions();
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1322");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getSubProcessInstance();
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1323");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement3 = executionEntity1.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices5 = executionEntity4.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity6.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity9.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity9.getEventSubscriptionsInternal();
        java.lang.String str14 = executionEntity9.getActivityId();
        boolean boolean15 = executionEntity9.isProcessInstanceType();
        executionEntity6.setSuperExecution(executionEntity9);
        executionEntity4.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = executionEntity4.getProcessVariables();
        java.lang.String str19 = executionEntity4.getProcessBusinessKey();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        int int21 = executionEntity4.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.removeIdentityLinks();
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1324");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 4);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str12 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList13 = executionEntity0.getJobs();
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1325");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        java.lang.String str6 = executionEntity0.getActivityId();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1326");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        int int2 = executionEntity0.getRevision();
        java.lang.String str3 = executionEntity0.getActivityId();
        java.lang.String str4 = executionEntity0.getActivityId();
        executionEntity0.setProcessDefinitionId("ProcessInstance[]");
        java.lang.String str7 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1327");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        java.lang.String str3 = executionEntity0.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList5 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1328");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        executionEntity0.inactivate();
        java.lang.String str6 = executionEntity0.getActivityId();
        boolean boolean7 = executionEntity0.isScope();
        boolean boolean8 = executionEntity0.isConcurrent();
        boolean boolean9 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1329");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        java.lang.String str8 = executionEntity3.getActivityId();
        boolean boolean9 = executionEntity3.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity3);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = executionEntity11.getActivity();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray15 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList16 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList16, variableInstanceEntityArray15);
        executionEntity11.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList16);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement19 = executionEntity11.getEventSource();
        executionEntity3.setSuperExecution(executionEntity11);
        executionEntity3.setCachedEntityState((int) (short) 10);
        boolean boolean23 = executionEntity3.isScope();
        executionEntity3.setCachedEntityState((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = executionEntity3.findExecution("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1330");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setTenantId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1331");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getProcessInstance();
        executionEntity0.setDeleteReason("");
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity14.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList17 = executionEntity14.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList18 = executionEntity14.getEventSubscriptionsInternal();
        java.lang.String str19 = executionEntity14.getActivityId();
        boolean boolean20 = executionEntity14.isProcessInstanceType();
        executionEntity11.setSuperExecution(executionEntity14);
        executionEntity11.setActive(false);
        executionEntity11.disposeStartingExecution();
        boolean boolean25 = executionEntity11.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity11);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity27.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList30 = executionEntity27.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList31 = executionEntity27.getEventSubscriptionsInternal();
        executionEntity27.setConcurrent(true);
        java.lang.Object obj34 = executionEntity27.getPersistentState();
        executionEntity27.setBusinessKey("");
        executionEntity27.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl39 = executionEntity27.getTransition();
        java.lang.String str40 = executionEntity27.getCurrentActivityId();
        boolean boolean41 = executionEntity27.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices43 = executionEntity42.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity44 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity44.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity47 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity47.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList50 = executionEntity47.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList51 = executionEntity47.getEventSubscriptionsInternal();
        java.lang.String str52 = executionEntity47.getActivityId();
        boolean boolean53 = executionEntity47.isProcessInstanceType();
        executionEntity44.setSuperExecution(executionEntity47);
        executionEntity42.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity47);
        java.util.Map<java.lang.String, java.lang.Object> strMap56 = executionEntity42.getProcessVariables();
        executionEntity27.createVariablesLocal(strMap56);
        java.lang.Object obj58 = executionEntity27.getPersistentState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl59 = executionEntity27.getActivity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity60 = executionEntity27.getReplacedBy();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1332");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        java.lang.String str10 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList11 = executionEntity0.getJobs();
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1333");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        boolean boolean6 = executionEntity0.isActive();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity0.getTransitionBeingTaken();
        boolean boolean8 = executionEntity0.isScope();
        executionEntity0.setBusinessKey("");
        int int11 = executionEntity0.getCachedEntityState();
        java.lang.String str12 = executionEntity0.toString();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity0.setActive(true);
        java.lang.String str17 = executionEntity0.getBusinessKey();
        java.lang.String str18 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1334");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        int int2 = executionEntity0.getRevision();
        java.lang.String str3 = executionEntity0.getActivityId();
        java.lang.String str4 = executionEntity0.getActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1335");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = executionEntity0.getActivity();
        boolean boolean6 = executionEntity0.isEventScope();
        java.lang.String str7 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList8 = executionEntity0.getTasks();
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1336");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = executionEntity0.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setBusinessKey("");
        int int7 = executionEntity4.getRevisionNext();
        boolean boolean8 = executionEntity4.isProcessInstanceType();
        executionEntity4.setScope(false);
        executionEntity4.setRevision((int) (byte) 10);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement14 = executionEntity0.getEventSource();
        java.lang.String str15 = executionEntity0.getActivityId();
        java.lang.String str16 = executionEntity0.getId();
        java.lang.String str17 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList18 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1337");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList1 = executionEntity0.getQueryVariables();
        org.activiti.engine.EngineServices engineServices2 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        executionEntity3.setConcurrent(true);
        java.lang.Object obj10 = executionEntity3.getPersistentState();
        boolean boolean11 = executionEntity3.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity3.getCompensateEventSubscriptions("hi!");
        executionEntity3.setParentId("ProcessInstance[ProcessInstance[null]]");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        executionEntity0.setCachedEntityState((int) (byte) 0);
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 100);
        boolean boolean22 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("hi!");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1338");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setSuperExecution(executionEntity9);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = executionEntity8.getTransition();
        org.activiti.engine.EngineServices engineServices12 = executionEntity8.getEngineServices();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity1.getSubProcessInstance();
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1339");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isEnded();
        boolean boolean2 = executionEntity0.isProcessInstanceType();
        java.lang.String str3 = executionEntity0.getCurrentActivityId();
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1340");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = executionEntity0.getActivity();
        int int13 = executionEntity0.getRevisionNext();
        executionEntity0.setDeleteReason("");
        executionEntity0.setId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity0.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity0.findExecution("hi!");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1341");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        boolean boolean7 = executionEntity0.isEnded();
        executionEntity0.setDeleteReason("hi!");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = executionEntity0.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1342");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str10 = executionEntity0.getProcessDefinitionId();
        executionEntity0.inactivate();
        executionEntity0.setDeleteReason("hi!");
        executionEntity0.setEventName("ProcessInstance[]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity16.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList19 = executionEntity16.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList20 = executionEntity16.getEventSubscriptionsInternal();
        executionEntity16.setConcurrent(true);
        java.lang.Object obj23 = executionEntity16.getPersistentState();
        executionEntity16.setBusinessKey("");
        executionEntity16.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl28 = executionEntity16.getTransition();
        java.lang.String str29 = executionEntity16.getCurrentActivityId();
        boolean boolean30 = executionEntity16.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices32 = executionEntity31.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity33.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity36.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList39 = executionEntity36.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList40 = executionEntity36.getEventSubscriptionsInternal();
        java.lang.String str41 = executionEntity36.getActivityId();
        boolean boolean42 = executionEntity36.isProcessInstanceType();
        executionEntity33.setSuperExecution(executionEntity36);
        executionEntity31.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity36);
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = executionEntity31.getProcessVariables();
        executionEntity16.createVariablesLocal(strMap45);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity47 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity47.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList50 = executionEntity47.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList51 = executionEntity47.getEventSubscriptionsInternal();
        java.lang.String str52 = executionEntity47.getActivityId();
        boolean boolean53 = executionEntity47.isProcessInstanceType();
        boolean boolean54 = executionEntity47.isEventScope();
        executionEntity16.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity47);
        boolean boolean56 = executionEntity47.isDeleteRoot();
        executionEntity47.setEventScope(true);
        boolean boolean59 = executionEntity47.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity60 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity61 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity60.setSuperExecution(executionEntity61);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity63 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str64 = executionEntity63.getEventName();
        executionEntity61.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity63);
        java.lang.Object obj66 = executionEntity63.getPersistentState();
        java.lang.String str67 = executionEntity63.getProcessInstanceId();
        executionEntity47.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity47);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1343");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        boolean boolean6 = executionEntity0.isActive();
        executionEntity0.setActive(false);
        executionEntity0.inactivate();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray10 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList11 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList11, variableInstanceEntityArray10);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity0.createExecution();
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1344");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setDeleteReason("");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setSuspensionState((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = executionEntity0.updateProcessBusinessKey("ProcessInstance[hi!]");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1345");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        executionEntity0.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setSuperExecution(executionEntity9);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str12 = executionEntity11.getEventName();
        executionEntity9.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        java.lang.String str15 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList16 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1346");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getParent();
        executionEntity0.setTenantId("hi!");
        java.lang.String str12 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1347");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isEventScope();
        executionEntity0.setDeleteReason("hi!");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity0.getQueryVariables();
        executionEntity0.setEventName("hi!");
        int int10 = executionEntity0.getRevisionNext();
        executionEntity0.setEventScope(true);
        java.lang.String str13 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("hi!");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1348");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        org.activiti.engine.EngineServices engineServices2 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1349");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getParent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        boolean boolean7 = executionEntity0.isDeleteRoot();
        java.lang.String str8 = executionEntity0.getId();
        executionEntity0.setId("ProcessInstance[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = executionEntity0.updateProcessBusinessKey("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1350");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setBusinessKey("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity1.getEventSubscriptions();
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1351");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        int int3 = executionEntity0.getSuspensionState();
        executionEntity0.setEventScope(true);
        java.lang.String str6 = executionEntity0.getEventName();
        java.lang.String str7 = executionEntity0.getBusinessKey();
        boolean boolean8 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.addIdentityLink("ProcessInstance[ProcessInstance[null]]", "");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1352");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        int int3 = executionEntity0.getSuspensionState();
        java.lang.String str4 = executionEntity0.getProcessInstanceId();
        java.lang.String str5 = executionEntity0.getDeleteReason();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1353");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isSuspended();
        int int8 = executionEntity0.getRevision();
        boolean boolean9 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = executionEntity0.getTransition();
        boolean boolean11 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity14 = executionEntity0.involveUser("ScopeExecution[null]", "hi!");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1354");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList1 = executionEntity0.getQueryVariables();
        org.activiti.engine.EngineServices engineServices2 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        executionEntity3.setConcurrent(true);
        java.lang.Object obj10 = executionEntity3.getPersistentState();
        boolean boolean11 = executionEntity3.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity3.getCompensateEventSubscriptions("hi!");
        executionEntity3.setParentId("ProcessInstance[ProcessInstance[null]]");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        boolean boolean18 = executionEntity0.isSuspended();
        executionEntity0.setRevision(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1355");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setBusinessKey("ProcessInstance[ProcessInstance[null]]");
        java.lang.String str11 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1356");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList7 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1357");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity2.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        executionEntity2.setSuperExecution(executionEntity5);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity15.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity15.getEventSubscriptionsInternal();
        executionEntity15.setConcurrent(true);
        executionEntity15.setDeleteReason("");
        executionEntity0.setSuperExecution(executionEntity15);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = executionEntity15.getActivity();
        boolean boolean26 = executionEntity15.isActive();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity27.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList30 = executionEntity27.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList31 = executionEntity27.getEventSubscriptionsInternal();
        java.lang.String str32 = executionEntity27.getActivityId();
        boolean boolean33 = executionEntity27.isProcessInstanceType();
        boolean boolean34 = executionEntity27.isEventScope();
        executionEntity27.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList36 = executionEntity27.getCompensateEventSubscriptions();
        java.lang.String str37 = executionEntity27.getParentId();
        java.lang.String str38 = executionEntity27.toString();
        executionEntity15.setSuperExecution(executionEntity27);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity40.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList43 = executionEntity40.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList44 = executionEntity40.getEventSubscriptionsInternal();
        java.lang.String str45 = executionEntity40.getCurrentActivityName();
        boolean boolean46 = executionEntity40.isConcurrent();
        java.util.Map<java.lang.String, java.lang.Object> strMap47 = executionEntity40.getProcessVariables();
        boolean boolean48 = executionEntity40.isActive();
        executionEntity27.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity40);
        java.lang.String str50 = executionEntity40.getSuperExecutionId();
        java.lang.String str51 = executionEntity40.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean53 = executionEntity40.isActive("ProcessInstance[hi!]");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1358");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity1.getActivity();
        java.lang.String str7 = executionEntity1.getBusinessKey();
        executionEntity1.setEventName("ProcessInstance[null]");
        boolean boolean10 = executionEntity1.isEventScope();
        boolean boolean11 = executionEntity1.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity1.getCompensateEventSubscriptions();
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1359");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        int int4 = executionEntity0.getRevisionNext();
        executionEntity0.setEventScope(false);
        java.lang.String str7 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1360");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        executionEntity0.setParentId("ScopeExecution[null]");
        executionEntity0.setCachedEntityState(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getParent();
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1361");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        java.lang.String str8 = executionEntity3.getActivityId();
        boolean boolean9 = executionEntity3.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity3);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = executionEntity11.getActivity();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray15 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList16 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList16, variableInstanceEntityArray15);
        executionEntity11.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList16);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement19 = executionEntity11.getEventSource();
        executionEntity3.setSuperExecution(executionEntity11);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity21.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList24 = executionEntity21.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList25 = executionEntity21.getEventSubscriptionsInternal();
        java.lang.String str26 = executionEntity21.getActivityId();
        boolean boolean27 = executionEntity21.isProcessInstanceType();
        boolean boolean28 = executionEntity21.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity29.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity32.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList35 = executionEntity32.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList36 = executionEntity32.getEventSubscriptionsInternal();
        java.lang.String str37 = executionEntity32.getActivityId();
        boolean boolean38 = executionEntity32.isProcessInstanceType();
        executionEntity29.setSuperExecution(executionEntity32);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices41 = executionEntity40.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity42.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity45 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity45.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList48 = executionEntity45.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList49 = executionEntity45.getEventSubscriptionsInternal();
        java.lang.String str50 = executionEntity45.getActivityId();
        boolean boolean51 = executionEntity45.isProcessInstanceType();
        executionEntity42.setSuperExecution(executionEntity45);
        executionEntity40.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity45);
        java.util.Map<java.lang.String, java.lang.Object> strMap54 = executionEntity40.getProcessVariables();
        executionEntity32.setVariablesLocal(strMap54);
        executionEntity21.setVariables(strMap54);
        executionEntity11.setVariablesLocal(strMap54);
        java.lang.String str58 = executionEntity11.toString();
        java.lang.String str59 = executionEntity11.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity60 = executionEntity11.createExecution();
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1362");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        int int3 = executionEntity0.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity8 = executionEntity0.involveUser("", "");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1363");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getProcessInstance();
        executionEntity0.setDeleteReason("");
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity14.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList17 = executionEntity14.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList18 = executionEntity14.getEventSubscriptionsInternal();
        java.lang.String str19 = executionEntity14.getActivityId();
        boolean boolean20 = executionEntity14.isProcessInstanceType();
        executionEntity11.setSuperExecution(executionEntity14);
        executionEntity11.setActive(false);
        executionEntity11.disposeStartingExecution();
        boolean boolean25 = executionEntity11.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity11);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity27.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList30 = executionEntity27.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList31 = executionEntity27.getEventSubscriptionsInternal();
        executionEntity27.setConcurrent(true);
        java.lang.Object obj34 = executionEntity27.getPersistentState();
        executionEntity27.setBusinessKey("");
        executionEntity27.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl39 = executionEntity27.getTransition();
        java.lang.String str40 = executionEntity27.getCurrentActivityId();
        boolean boolean41 = executionEntity27.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices43 = executionEntity42.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity44 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity44.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity47 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity47.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList50 = executionEntity47.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList51 = executionEntity47.getEventSubscriptionsInternal();
        java.lang.String str52 = executionEntity47.getActivityId();
        boolean boolean53 = executionEntity47.isProcessInstanceType();
        executionEntity44.setSuperExecution(executionEntity47);
        executionEntity42.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity47);
        java.util.Map<java.lang.String, java.lang.Object> strMap56 = executionEntity42.getProcessVariables();
        executionEntity27.createVariablesLocal(strMap56);
        java.lang.Object obj58 = executionEntity27.getPersistentState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl59 = executionEntity27.getActivity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity60 = executionEntity27.getReplacedBy();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity27.insert();
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1364");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isScope();
        executionEntity0.setId("");
        executionEntity0.setId("");
        executionEntity0.setActive(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList15 = executionEntity0.getJobs();
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1365");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isActive();
        boolean boolean9 = executionEntity0.isEnded();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = executionEntity0.getActivity();
        executionEntity0.setEventScope(true);
        java.lang.String str13 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1366");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        executionEntity0.setDeleteReason("");
        boolean boolean6 = executionEntity0.isScope();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.addIdentityLink("ProcessInstance[ProcessInstance[null]]", "hi!");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1367");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setDeleteReason("");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setSuspensionState((int) (short) -1);
        java.lang.String str12 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[hi!]");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1368");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList11 = executionEntity0.getCompensateEventSubscriptions("hi!");
        executionEntity0.setActive(false);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement14 = executionEntity0.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity18.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList21 = executionEntity18.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList22 = executionEntity18.getEventSubscriptionsInternal();
        java.lang.String str23 = executionEntity18.getActivityId();
        boolean boolean24 = executionEntity18.isProcessInstanceType();
        executionEntity15.setSuperExecution(executionEntity18);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices27 = executionEntity26.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity28.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity31.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList34 = executionEntity31.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList35 = executionEntity31.getEventSubscriptionsInternal();
        java.lang.String str36 = executionEntity31.getActivityId();
        boolean boolean37 = executionEntity31.isProcessInstanceType();
        executionEntity28.setSuperExecution(executionEntity31);
        executionEntity26.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity31);
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = executionEntity26.getProcessVariables();
        executionEntity18.setVariablesLocal(strMap40);
        executionEntity0.setVariables(strMap40);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity43.setCachedEntityState((int) (short) 100);
        java.lang.String str46 = executionEntity43.getBusinessKey();
        java.lang.String str47 = executionEntity43.getTenantId();
        java.lang.String str48 = executionEntity43.getEventName();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList49 = executionEntity43.getCompensateEventSubscriptions();
        java.lang.String str50 = executionEntity43.getSuperExecutionId();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity43);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution52 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1369");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = executionEntity0.getActivity();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.lang.String str4 = executionEntity0.getBusinessKey();
        executionEntity0.setEventName("ProcessInstance[ProcessInstance[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList7 = executionEntity0.getExecutions();
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1370");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setDeleteReason("");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 4);
        java.lang.String str11 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1371");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = executionEntity0.getActivity();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1372");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList11 = executionEntity0.getCompensateEventSubscriptions("");
        java.lang.Object obj12 = executionEntity0.getPersistentState();
        java.lang.String str13 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1373");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity4.getCompensateEventSubscriptions();
        boolean boolean8 = executionEntity4.isEventScope();
        org.activiti.engine.EngineServices engineServices9 = executionEntity4.getEngineServices();
        java.lang.String str10 = executionEntity4.getId();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        org.activiti.engine.EngineServices engineServices12 = executionEntity4.getEngineServices();
        java.lang.String str13 = executionEntity4.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity4.getSubProcessInstance();
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1374");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setDeleteReason("ProcessInstance[ProcessInstance[null]]");
        int int8 = executionEntity1.getRevisionNext();
        executionEntity1.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl11 = executionEntity1.getProcessDefinition();
        boolean boolean12 = executionEntity1.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.initialize();
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1375");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        boolean boolean6 = executionEntity0.isEventScope();
        java.lang.String str7 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList8 = executionEntity0.getExecutions();
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1376");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isSuspended();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransition();
        boolean boolean9 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[null]");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1377");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        int int4 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getBusinessKey();
        java.lang.String str8 = executionEntity0.getCurrentActivityId();
        executionEntity0.setConcurrent(false);
        java.lang.Integer int11 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity0.findExecution("ProcessInstance[hi!]");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1378");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        executionEntity1.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity1.getProcessBusinessKey();
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1379");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.findExecution("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1380");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement7 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1381");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.Integer int8 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1382");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        int int7 = executionEntity0.getRevision();
        java.lang.Integer int8 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = executionEntity0.updateProcessBusinessKey("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1383");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        boolean boolean12 = executionEntity5.isEventScope();
        executionEntity5.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity5.getCompensateEventSubscriptions();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity16.setSuperExecution(executionEntity17);
        boolean boolean19 = executionEntity16.isEventScope();
        boolean boolean20 = executionEntity16.isEnded();
        executionEntity16.disposeStartingExecution();
        boolean boolean22 = executionEntity16.isActive();
        executionEntity16.setActive(false);
        org.activiti.engine.EngineServices engineServices25 = executionEntity16.getEngineServices();
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        java.lang.String str27 = executionEntity16.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList28 = executionEntity16.findActiveActivityIds();
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1384");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        executionEntity0.setActive(false);
        int int7 = executionEntity0.getRevisionNext();
        java.lang.String str8 = executionEntity0.getId();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity0.getProcessDefinition();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList11 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[hi!]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.createExecution();
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1385");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setActive(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution9 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setCachedEntityState((int) (short) 100);
        executionEntity10.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity10.getProcessVariables();
        executionEntity0.setVariables(strMap15);
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[hi!]");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1386");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        java.lang.String str5 = executionEntity0.getActivityId();
        java.lang.String str6 = executionEntity0.getParentId();
        int int7 = executionEntity0.getRevision();
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList8 = executionEntity0.getTasks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList9 = executionEntity0.getJobs();
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1387");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ScopeExecution[null]");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1388");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.Integer int8 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.setTenantId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList11 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1389");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        java.lang.String str4 = executionEntity0.getTenantId();
        java.lang.String str5 = executionEntity0.getEventName();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.setProcessDefinitionId("");
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList9 = executionEntity0.getTasks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1390");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.String str8 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity9.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity9.getEventSubscriptionsInternal();
        java.lang.String str14 = executionEntity9.getActivityId();
        boolean boolean15 = executionEntity9.isProcessInstanceType();
        boolean boolean16 = executionEntity9.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList23 = executionEntity20.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList24 = executionEntity20.getEventSubscriptionsInternal();
        java.lang.String str25 = executionEntity20.getActivityId();
        boolean boolean26 = executionEntity20.isProcessInstanceType();
        executionEntity17.setSuperExecution(executionEntity20);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices29 = executionEntity28.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity30.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity33.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList36 = executionEntity33.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList37 = executionEntity33.getEventSubscriptionsInternal();
        java.lang.String str38 = executionEntity33.getActivityId();
        boolean boolean39 = executionEntity33.isProcessInstanceType();
        executionEntity30.setSuperExecution(executionEntity33);
        executionEntity28.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity33);
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = executionEntity28.getProcessVariables();
        executionEntity20.setVariablesLocal(strMap42);
        executionEntity9.setVariables(strMap42);
        executionEntity0.setVariables(strMap42);
        executionEntity0.setParentId("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement48 = executionEntity0.getEventSource();
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList49 = executionEntity0.getTasks();
        boolean boolean50 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1391");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        java.lang.String str5 = executionEntity1.getParentId();
        java.lang.String str6 = executionEntity1.getBusinessKey();
        executionEntity1.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = executionEntity1.findActiveActivityIds();
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1392");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        executionEntity0.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setSuperExecution(executionEntity9);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str12 = executionEntity11.getEventName();
        executionEntity9.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        java.lang.String str15 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1393");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setDeleteReason("");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setSuspensionState((int) (short) -1);
        java.lang.String str12 = executionEntity0.getCurrentActivityId();
        executionEntity0.inactivate();
        executionEntity0.setEventScope(true);
        int int16 = executionEntity0.getSuspensionState();
        executionEntity0.setParentId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1394");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity2.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        executionEntity2.setSuperExecution(executionEntity5);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setParentId("");
        executionEntity5.setSuspensionState(7);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = executionEntity5.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity21 = executionEntity5.involveUser("ProcessInstance[null]", "ProcessInstance[]");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1395");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList1 = executionEntity0.getQueryVariables();
        org.activiti.engine.EngineServices engineServices2 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        executionEntity3.setConcurrent(true);
        java.lang.Object obj10 = executionEntity3.getPersistentState();
        boolean boolean11 = executionEntity3.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity3.getCompensateEventSubscriptions("hi!");
        executionEntity3.setParentId("ProcessInstance[ProcessInstance[null]]");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        executionEntity0.setCachedEntityState((int) (byte) 0);
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 100);
        boolean boolean22 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1396");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList1 = executionEntity0.getQueryVariables();
        org.activiti.engine.EngineServices engineServices2 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        executionEntity3.setConcurrent(true);
        java.lang.Object obj10 = executionEntity3.getPersistentState();
        boolean boolean11 = executionEntity3.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity3.getCompensateEventSubscriptions("hi!");
        executionEntity3.setParentId("ProcessInstance[ProcessInstance[null]]");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        executionEntity0.setCachedEntityState((int) (byte) 0);
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = executionEntity0.createExecution();
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1397");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl12 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setSuperExecution(executionEntity14);
        boolean boolean16 = executionEntity13.isEventScope();
        executionEntity13.inactivate();
        boolean boolean18 = executionEntity13.isEventScope();
        java.lang.String str19 = executionEntity13.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity13.getSuperExecution();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = executionEntity13.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity22.deleteCascade("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1398");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setSuperExecution(executionEntity4);
        boolean boolean6 = executionEntity3.isEventScope();
        boolean boolean7 = executionEntity3.isEnded();
        boolean boolean8 = executionEntity3.isEnded();
        java.lang.String str9 = executionEntity3.getActivityId();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1399");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity1.getActivity();
        java.lang.String str7 = executionEntity1.getBusinessKey();
        executionEntity1.setId("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getParent();
        executionEntity1.setEventScope(false);
        java.lang.String str13 = executionEntity1.getDeleteReason();
        executionEntity1.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList15 = executionEntity1.getExecutions();
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1400");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isEventScope();
        executionEntity0.setDeleteReason("hi!");
        boolean boolean7 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1401");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        boolean boolean12 = executionEntity5.isEventScope();
        executionEntity5.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity5.getCompensateEventSubscriptions();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity16.setSuperExecution(executionEntity17);
        boolean boolean19 = executionEntity16.isEventScope();
        boolean boolean20 = executionEntity16.isEnded();
        executionEntity16.disposeStartingExecution();
        boolean boolean22 = executionEntity16.isActive();
        executionEntity16.setActive(false);
        org.activiti.engine.EngineServices engineServices25 = executionEntity16.getEngineServices();
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        executionEntity16.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity16.removeIdentityLinks();
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1402");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.String str8 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList15 = executionEntity12.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList16 = executionEntity12.getEventSubscriptionsInternal();
        java.lang.String str17 = executionEntity12.getActivityId();
        boolean boolean18 = executionEntity12.isProcessInstanceType();
        executionEntity9.setSuperExecution(executionEntity12);
        executionEntity9.setActive(false);
        executionEntity9.disposeStartingExecution();
        java.lang.String str23 = executionEntity9.getParentId();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.lang.String str25 = executionEntity9.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity26.setSuperExecution(executionEntity27);
        boolean boolean29 = executionEntity26.isEventScope();
        boolean boolean30 = executionEntity26.isEnded();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity31.setCachedEntityState((int) (short) 100);
        executionEntity31.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = executionEntity31.getProcessVariables();
        executionEntity26.setVariablesLocal(strMap36);
        executionEntity9.setVariables(strMap36);
        executionEntity9.setRevision(5);
        executionEntity9.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList43 = executionEntity9.getJobs();
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1403");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setBusinessKey("ProcessInstance[ProcessInstance[null]]");
        java.lang.String str11 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity14 = executionEntity0.involveUser("ProcessInstance[hi!]", "");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1404");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        executionEntity0.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setSuperExecution(executionEntity9);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str12 = executionEntity11.getEventName();
        executionEntity9.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        java.lang.String str15 = executionEntity0.getSuperExecutionId();
        java.lang.String str16 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1405");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        java.lang.String str5 = executionEntity0.getDeleteReason();
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList6 = executionEntity0.getTasks();
        java.lang.String str7 = executionEntity0.getId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.findExecution("ProcessInstance[]");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1406");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        boolean boolean12 = executionEntity5.isEventScope();
        executionEntity5.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity5.getCompensateEventSubscriptions();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution16 = executionEntity0.getStartingExecution();
        java.lang.String str17 = executionEntity0.getTenantId();
        boolean boolean18 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1407");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList7 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1408");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        boolean boolean6 = executionEntity0.isEventScope();
        java.lang.String str7 = executionEntity0.getId();
        executionEntity0.inactivate();
        org.activiti.engine.EngineServices engineServices9 = executionEntity0.getEngineServices();
        executionEntity0.setScope(false);
        boolean boolean12 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1409");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = executionEntity0.getQueryVariables();
        java.lang.String str6 = executionEntity0.getTenantId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("hi!");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1410");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl12 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList13 = executionEntity0.getExecutions();
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1411");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setActive(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution9 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setCachedEntityState((int) (short) 100);
        executionEntity10.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity10.getProcessVariables();
        executionEntity0.setVariables(strMap15);
        executionEntity0.setEventScope(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = executionEntity0.getProcessVariables();
        int int20 = executionEntity0.getRevision();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList21 = executionEntity0.getCompensateEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1412");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        executionEntity0.setTenantId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1413");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity4.getCompensateEventSubscriptions();
        boolean boolean8 = executionEntity4.isEventScope();
        org.activiti.engine.EngineServices engineServices9 = executionEntity4.getEngineServices();
        java.lang.String str10 = executionEntity4.getId();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1414");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getParent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        int int8 = executionEntity0.getRevisionNext();
        boolean boolean9 = executionEntity0.isEventScope();
        org.activiti.engine.EngineServices engineServices10 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1415");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity2.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        executionEntity2.setSuperExecution(executionEntity5);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        int int14 = executionEntity5.getCachedEntityState();
        java.lang.String str15 = executionEntity5.getProcessInstanceId();
        boolean boolean16 = executionEntity5.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = executionEntity5.updateProcessBusinessKey("ProcessInstance[]");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1416");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        java.lang.String str5 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement6 = executionEntity1.getEventSource();
        executionEntity1.setProcessDefinitionId("ProcessInstance[ProcessInstance[null]]");
        int int9 = executionEntity1.getRevision();
        java.lang.String str10 = executionEntity1.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList11 = executionEntity1.getExecutions();
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1417");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = executionEntity0.getCachedElContext();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1418");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.String str8 = executionEntity0.getEventName();
        executionEntity0.setDeleteReason("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl11 = executionEntity0.getProcessDefinition();
        int int12 = executionEntity0.getRevisionNext();
        java.lang.String str13 = executionEntity0.getDeleteReason();
        java.lang.String str14 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = executionEntity0.updateProcessBusinessKey("");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1419");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        boolean boolean12 = executionEntity5.isEventScope();
        executionEntity5.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity5.getCompensateEventSubscriptions();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str16 = executionEntity5.toString();
        executionEntity5.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = executionEntity5.isActive("ProcessInstance[]");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1420");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.updateProcessBusinessKey("ProcessInstance[hi!]");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1421");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.String str8 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList15 = executionEntity12.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList16 = executionEntity12.getEventSubscriptionsInternal();
        java.lang.String str17 = executionEntity12.getActivityId();
        boolean boolean18 = executionEntity12.isProcessInstanceType();
        executionEntity9.setSuperExecution(executionEntity12);
        executionEntity9.setActive(false);
        executionEntity9.disposeStartingExecution();
        java.lang.String str23 = executionEntity9.getParentId();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.lang.String str25 = executionEntity9.toString();
        executionEntity9.setTenantId("");
        executionEntity9.setParentId("hi!");
        java.lang.String str30 = executionEntity9.getCurrentActivityName();
        executionEntity9.setExecutionListenerIndex((java.lang.Integer) 7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity9.initialize();
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1422");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        java.lang.String str5 = executionEntity0.getDeleteReason();
        java.lang.String str6 = executionEntity0.getDeleteReason();
        java.lang.String str7 = executionEntity0.getBusinessKey();
        executionEntity0.setScope(false);
        executionEntity0.setId("");
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1423");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = executionEntity0.getActivity();
        boolean boolean6 = executionEntity0.isEventScope();
        boolean boolean7 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ScopeExecution[null]");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1424");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity7.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity7.getEventSubscriptionsInternal();
        java.lang.String str12 = executionEntity7.getActivityId();
        int int13 = executionEntity7.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity7.getProcessInstance();
        executionEntity7.setDeleteReason("");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity7.getProcessVariables();
        executionEntity0.createVariablesLocal(strMap17);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = executionEntity0.getTransition();
        java.lang.String str20 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1425");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        int int10 = executionEntity0.getRevision();
        executionEntity0.setEventName("hi!");
        executionEntity0.setTenantId("ProcessInstance[]");
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList15 = executionEntity0.getTasks();
        executionEntity0.setRevision(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[hi!]");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1426");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList1 = executionEntity0.getQueryVariables();
        executionEntity0.setActive(false);
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1427");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        java.lang.String str5 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement6 = executionEntity1.getEventSource();
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.javax.el.ELContext eLContext8 = executionEntity1.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList9 = executionEntity1.getExecutions();
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1428");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        executionEntity0.setActive(false);
        int int7 = executionEntity0.getRevisionNext();
        boolean boolean8 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1429");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity2.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        executionEntity2.setSuperExecution(executionEntity5);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        executionEntity5.setRevision(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity5.initialize();
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1430");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isScope();
        executionEntity0.setId("");
        executionEntity0.setId("");
        java.lang.String str13 = executionEntity0.getProcessInstanceId();
        int int14 = executionEntity0.getRevisionNext();
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = executionEntity0.isActive("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1431");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setDeleteReason("");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setSuspensionState((int) (short) -1);
        java.lang.String str12 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList13 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1432");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        executionEntity0.forceUpdate();
        java.lang.String str5 = executionEntity0.getCurrentActivityId();
        java.lang.String str6 = executionEntity0.getEventName();
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[hi!]");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1433");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        executionEntity0.setTenantId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.updateProcessBusinessKey("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1434");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransition();
        java.lang.String str5 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity8 = executionEntity0.involveUser("ProcessInstance[ProcessInstance[null]]", "ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1435");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = executionEntity0.getCachedElContext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity6.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution9 = executionEntity6.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity6.getEventSubscriptions();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str12 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1436");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        executionEntity0.setConcurrent(true);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = executionEntity0.getProcessVariables();
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity16 = executionEntity0.involveUser("ScopeExecution[null]", "");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1437");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity7.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity7.getEventSubscriptionsInternal();
        java.lang.String str12 = executionEntity7.getActivityId();
        int int13 = executionEntity7.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity7.getProcessInstance();
        executionEntity7.setDeleteReason("");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity7.getProcessVariables();
        executionEntity0.createVariablesLocal(strMap17);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = executionEntity0.getTransition();
        java.lang.String str20 = executionEntity0.getCurrentActivityName();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1438");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.String str8 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity9.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity9.getEventSubscriptionsInternal();
        java.lang.String str14 = executionEntity9.getActivityId();
        boolean boolean15 = executionEntity9.isProcessInstanceType();
        boolean boolean16 = executionEntity9.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList23 = executionEntity20.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList24 = executionEntity20.getEventSubscriptionsInternal();
        java.lang.String str25 = executionEntity20.getActivityId();
        boolean boolean26 = executionEntity20.isProcessInstanceType();
        executionEntity17.setSuperExecution(executionEntity20);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices29 = executionEntity28.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity30.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity33.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList36 = executionEntity33.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList37 = executionEntity33.getEventSubscriptionsInternal();
        java.lang.String str38 = executionEntity33.getActivityId();
        boolean boolean39 = executionEntity33.isProcessInstanceType();
        executionEntity30.setSuperExecution(executionEntity33);
        executionEntity28.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity33);
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = executionEntity28.getProcessVariables();
        executionEntity20.setVariablesLocal(strMap42);
        executionEntity9.setVariables(strMap42);
        executionEntity0.setVariables(strMap42);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList46 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str47 = executionEntity0.getProcessDefinitionId();
        java.lang.String str48 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1439");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        java.lang.String str6 = executionEntity0.getActivityId();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        boolean boolean8 = executionEntity0.isEnded();
        java.lang.String str9 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setCachedEntityState((-1));
        java.lang.Object obj12 = executionEntity0.getPersistentState();
        java.lang.String str13 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity16 = executionEntity0.addIdentityLink("hi!", "ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1440");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransition();
        int int5 = executionEntity0.getRevision();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity0.getProcessVariables();
        java.lang.String str7 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1441");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        boolean boolean6 = executionEntity0.isEventScope();
        java.lang.String str7 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1442");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        java.lang.String str2 = executionEntity0.getEventName();
        java.lang.Object obj3 = executionEntity0.getPersistentState();
        java.lang.String str4 = executionEntity0.getProcessInstanceId();
        executionEntity0.setParentId("ProcessInstance[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList7 = executionEntity0.getExecutions();
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1443");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity7.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity7.getEventSubscriptionsInternal();
        java.lang.String str12 = executionEntity7.getActivityId();
        int int13 = executionEntity7.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity7.getProcessInstance();
        executionEntity7.setDeleteReason("");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity7.getProcessVariables();
        executionEntity0.createVariablesLocal(strMap17);
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = executionEntity0.getProcessInstance();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity23.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList26 = executionEntity23.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList27 = executionEntity23.getEventSubscriptionsInternal();
        executionEntity23.setConcurrent(true);
        executionEntity23.setActive(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution32 = executionEntity23.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = executionEntity23.getProcessInstance();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = executionEntity23.getProcessInstance();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList36 = executionEntity23.getCompensateEventSubscriptions("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl37 = executionEntity23.getTransition();
        boolean boolean38 = executionEntity23.isEventScope();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity23);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = executionEntity0.getParent();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity44 = executionEntity0.findExecution("ProcessInstance[hi!]");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1444");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity2.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        executionEntity2.setSuperExecution(executionEntity5);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity0.getProcessVariables();
        java.lang.String str15 = executionEntity0.getProcessBusinessKey();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = executionEntity0.getProcessVariables();
        int int17 = executionEntity0.getSuspensionState();
        boolean boolean18 = executionEntity0.isEnded();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity19.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution22 = executionEntity19.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList23 = executionEntity19.getEventSubscriptions();
        org.activiti.engine.impl.javax.el.ELContext eLContext24 = executionEntity19.getCachedElContext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity25.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution28 = executionEntity25.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList29 = executionEntity25.getEventSubscriptions();
        executionEntity19.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity25);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement31 = executionEntity19.getEventSource();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl32 = executionEntity19.getTransition();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1445");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        boolean boolean6 = executionEntity0.isActive();
        executionEntity0.setActive(false);
        org.activiti.engine.EngineServices engineServices9 = executionEntity0.getEngineServices();
        boolean boolean10 = executionEntity0.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1446");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        executionEntity0.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setSuperExecution(executionEntity9);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str12 = executionEntity11.getEventName();
        executionEntity9.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        boolean boolean15 = executionEntity0.isEventScope();
        executionEntity0.setId("hi!");
        java.lang.String str18 = executionEntity0.toString();
        boolean boolean19 = executionEntity0.isConcurrent();
        boolean boolean20 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList22 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[]");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1447");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        executionEntity0.setScope(false);
        executionEntity0.setRevision((int) (byte) 10);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setSuperExecution(executionEntity11);
        boolean boolean13 = executionEntity10.isEventScope();
        boolean boolean14 = executionEntity10.isEnded();
        boolean boolean15 = executionEntity10.isEnded();
        executionEntity10.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity18.setSuperExecution(executionEntity19);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str22 = executionEntity21.getEventName();
        executionEntity19.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
        executionEntity10.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices26 = executionEntity25.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity27.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity30.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList33 = executionEntity30.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList34 = executionEntity30.getEventSubscriptionsInternal();
        java.lang.String str35 = executionEntity30.getActivityId();
        boolean boolean36 = executionEntity30.isProcessInstanceType();
        executionEntity27.setSuperExecution(executionEntity30);
        executionEntity25.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity30);
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = executionEntity25.getProcessVariables();
        java.lang.String str40 = executionEntity25.getProcessBusinessKey();
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = executionEntity25.getProcessVariables();
        executionEntity21.setVariables(strMap41);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement43 = executionEntity21.getEventSource();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList45 = executionEntity21.findActiveActivityIds();
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1448");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.String str8 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList15 = executionEntity12.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList16 = executionEntity12.getEventSubscriptionsInternal();
        java.lang.String str17 = executionEntity12.getActivityId();
        boolean boolean18 = executionEntity12.isProcessInstanceType();
        executionEntity9.setSuperExecution(executionEntity12);
        executionEntity9.setActive(false);
        executionEntity9.disposeStartingExecution();
        java.lang.String str23 = executionEntity9.getParentId();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.lang.String str25 = executionEntity9.toString();
        executionEntity9.setTenantId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity9.end();
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1449");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        executionEntity0.setEventName("ProcessInstance[null]");
        java.lang.String str8 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[hi!]");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1450");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        java.lang.String str8 = executionEntity3.getActivityId();
        boolean boolean9 = executionEntity3.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity3);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices12 = executionEntity11.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity16.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList19 = executionEntity16.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList20 = executionEntity16.getEventSubscriptionsInternal();
        java.lang.String str21 = executionEntity16.getActivityId();
        boolean boolean22 = executionEntity16.isProcessInstanceType();
        executionEntity13.setSuperExecution(executionEntity16);
        executionEntity11.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = executionEntity11.getProcessVariables();
        executionEntity3.setVariablesLocal(strMap25);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = executionEntity3.getParent();
        java.lang.String str28 = executionEntity3.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity30.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList33 = executionEntity30.getCompensateEventSubscriptions();
        java.lang.String str34 = executionEntity30.getCurrentActivityId();
        java.lang.String str35 = executionEntity30.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext36 = executionEntity30.getCachedElContext();
        java.lang.String str37 = executionEntity30.getCurrentActivityName();
        executionEntity30.setProcessDefinitionId("ProcessInstance[null]");
        executionEntity30.setBusinessKey("hi!");
        java.lang.String str42 = executionEntity30.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity3.signal("hi!", (java.lang.Object) executionEntity30);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1451");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        int int7 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList8 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1452");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        boolean boolean6 = executionEntity0.isConcurrent();
        int int7 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.updateProcessBusinessKey("hi!");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1453");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        int int3 = executionEntity0.getSuspensionState();
        java.lang.String str4 = executionEntity0.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setSuperExecution(executionEntity6);
        boolean boolean8 = executionEntity5.isEventScope();
        executionEntity5.inactivate();
        executionEntity0.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity14.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList17 = executionEntity14.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList18 = executionEntity14.getEventSubscriptionsInternal();
        java.lang.String str19 = executionEntity14.getActivityId();
        boolean boolean20 = executionEntity14.isProcessInstanceType();
        executionEntity11.setSuperExecution(executionEntity14);
        executionEntity5.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        executionEntity14.setCachedEntityState(101);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity14.createExecution();
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1454");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement3 = executionEntity1.getEventSource();
        int int4 = executionEntity1.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.destroyScope("ScopeExecution[null]");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1455");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setActive(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution9 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setCachedEntityState((int) (short) 100);
        executionEntity10.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity10.getProcessVariables();
        executionEntity0.setVariables(strMap15);
        executionEntity0.setEventScope(false);
        boolean boolean19 = executionEntity0.isSuspended();
        executionEntity0.setCachedEntityState(5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1456");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.String str8 = executionEntity0.getEventName();
        java.lang.String str9 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.createExecution();
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1457");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        java.lang.String str2 = executionEntity0.getEventName();
        executionEntity0.setRevision(1);
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList7 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1458");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        java.lang.Object obj9 = executionEntity0.getPersistentState();
        int int10 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setSuperExecution(executionEntity12);
        boolean boolean14 = executionEntity11.isEnded();
        java.lang.Object obj15 = executionEntity11.getPersistentState();
        executionEntity11.setParentId("hi!");
        boolean boolean18 = executionEntity11.isDeleteRoot();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList20 = executionEntity11.getQueryVariables();
        java.lang.String str21 = executionEntity11.getCurrentActivityId();
        executionEntity11.setSuspensionState(7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = executionEntity11.createExecution();
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1459");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        java.lang.String str5 = executionEntity1.getProcessDefinitionId();
        boolean boolean6 = executionEntity1.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str8 = executionEntity7.getCurrentActivityName();
        executionEntity7.setId("");
        int int11 = executionEntity7.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = executionEntity7.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList15 = executionEntity1.getCompensateEventSubscriptions("ProcessInstance[null]");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1460");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        int int3 = executionEntity0.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        java.lang.String str6 = executionEntity0.getActivityId();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity9.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity9.getEventSubscriptionsInternal();
        executionEntity9.setConcurrent(true);
        executionEntity9.setDeleteReason("");
        executionEntity9.setEventName("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity9.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("ProcessInstance[null]", (java.lang.Object) executionEntity9);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1461");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity2.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        executionEntity2.setSuperExecution(executionEntity5);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl14 = executionEntity0.getProcessDefinition();
        executionEntity0.setCachedEntityState((int) (byte) 1);
        executionEntity0.setSuspensionState(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1462");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        java.lang.String str6 = executionEntity0.getActivityId();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        boolean boolean8 = executionEntity0.isEnded();
        java.lang.String str9 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1463");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl4 = executionEntity0.getProcessDefinition();
        executionEntity0.setRevision((int) 'a');
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1464");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        java.lang.String str5 = executionEntity0.getCurrentActivityName();
        boolean boolean6 = executionEntity0.isSuspended();
        java.lang.String str7 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList8 = executionEntity0.getJobs();
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1465");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        executionEntity0.setScope(false);
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1466");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        executionEntity0.setProcessDefinitionId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.updateProcessBusinessKey("ProcessInstance[hi!]");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1467");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        java.lang.String str10 = executionEntity0.getEventName();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 7);
        java.lang.Object obj13 = executionEntity0.getPersistentState();
        int int14 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement15 = executionEntity0.getEventSource();
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList18 = executionEntity0.getExecutions();
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1468");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setSuperExecution(executionEntity4);
        boolean boolean6 = executionEntity3.isEventScope();
        boolean boolean7 = executionEntity3.isEnded();
        boolean boolean8 = executionEntity3.isEnded();
        java.lang.String str9 = executionEntity3.getActivityId();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        executionEntity0.setActive(false);
        executionEntity0.setScope(true);
        executionEntity0.setActive(false);
        int int17 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1469");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = executionEntity0.getActivity();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray4 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5, variableInstanceEntityArray4);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5);
        java.lang.String str8 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getProcessInstance();
        java.lang.String str10 = executionEntity0.toString();
        executionEntity0.setScope(false);
        executionEntity0.setTenantId("ProcessInstance[ProcessInstance[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1470");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isScope();
        executionEntity0.setId("");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity0.getEventSubscriptions();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        boolean boolean14 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList15 = executionEntity0.getExecutions();
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1471");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        java.lang.String str3 = executionEntity0.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        boolean boolean5 = executionEntity0.isDeleteRoot();
        java.lang.Object obj6 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl7 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[null]");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1472");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity1.getActivity();
        java.lang.String str7 = executionEntity1.getBusinessKey();
        executionEntity1.setId("ProcessInstance[null]");
        java.lang.String str10 = executionEntity1.getSuperExecutionId();
        boolean boolean11 = executionEntity1.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.initialize();
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1473");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isScope();
        executionEntity0.setId("");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity0.getEventSubscriptions();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        int int14 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1474");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = executionEntity0.getActivity();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.lang.String str4 = executionEntity0.getBusinessKey();
        executionEntity0.setEventName("ProcessInstance[ProcessInstance[null]]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str8 = executionEntity7.getCurrentActivityName();
        int int9 = executionEntity7.getCachedEntityState();
        int int10 = executionEntity7.getSuspensionState();
        java.lang.String str11 = executionEntity7.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setSuperExecution(executionEntity13);
        boolean boolean15 = executionEntity12.isEventScope();
        executionEntity12.inactivate();
        executionEntity7.setSuperExecution(executionEntity12);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity18.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity21.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList24 = executionEntity21.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList25 = executionEntity21.getEventSubscriptionsInternal();
        java.lang.String str26 = executionEntity21.getActivityId();
        boolean boolean27 = executionEntity21.isProcessInstanceType();
        executionEntity18.setSuperExecution(executionEntity21);
        executionEntity12.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
        executionEntity12.setExecutionListenerIndex((java.lang.Integer) 6);
        executionEntity12.setParentId("ProcessInstance[null]");
        executionEntity0.setSuperExecution(executionEntity12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1475");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = executionEntity0.getQueryVariables();
        java.lang.String str6 = executionEntity0.getTenantId();
        boolean boolean7 = executionEntity0.isEventScope();
        executionEntity0.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity12 = executionEntity0.addIdentityLink("ProcessInstance[ProcessInstance[null]]", "ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1476");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity0.getTransition();
        java.lang.String str13 = executionEntity0.getCurrentActivityId();
        java.lang.String str14 = executionEntity0.getCurrentActivityName();
        executionEntity0.setConcurrent(true);
        java.lang.String str17 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity0.findExecution("ProcessInstance[null]");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1477");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = executionEntity5.getCachedElContext();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity5.getProcessVariables();
        executionEntity1.setSuperExecution(executionEntity5);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity5.getSuperExecution();
        java.lang.Integer int11 = executionEntity5.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList13 = executionEntity5.getCompensateEventSubscriptions("ProcessInstance[hi!]");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1478");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.EngineServices engineServices2 = executionEntity0.getEngineServices();
        java.lang.Object obj3 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.findExecution("");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1479");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        executionEntity0.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setSuperExecution(executionEntity9);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str12 = executionEntity11.getEventName();
        executionEntity9.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        java.lang.String str15 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1480");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        java.util.List<java.lang.String> strList2 = userTaskActivityBehavior0.extractCandidates("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        executionEntity3.setConcurrent(true);
        executionEntity3.setDeleteReason("");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList12 = executionEntity3.getEventSubscriptionsInternal();
        executionEntity3.setSuspensionState((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userTaskActivityBehavior0.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity3);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1481");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity0.getTransition();
        java.lang.String str13 = executionEntity0.getCurrentActivityId();
        executionEntity0.setConcurrent(true);
        boolean boolean16 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = executionEntity0.updateProcessBusinessKey("ScopeExecution[null]");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1482");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement3 = executionEntity1.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices5 = executionEntity4.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity6.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity9.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity9.getEventSubscriptionsInternal();
        java.lang.String str14 = executionEntity9.getActivityId();
        boolean boolean15 = executionEntity9.isProcessInstanceType();
        executionEntity6.setSuperExecution(executionEntity9);
        executionEntity4.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = executionEntity4.getProcessVariables();
        java.lang.String str19 = executionEntity4.getProcessBusinessKey();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = executionEntity4.isActive("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1483");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.String str8 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity9.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity9.getEventSubscriptionsInternal();
        java.lang.String str14 = executionEntity9.getActivityId();
        boolean boolean15 = executionEntity9.isProcessInstanceType();
        boolean boolean16 = executionEntity9.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList23 = executionEntity20.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList24 = executionEntity20.getEventSubscriptionsInternal();
        java.lang.String str25 = executionEntity20.getActivityId();
        boolean boolean26 = executionEntity20.isProcessInstanceType();
        executionEntity17.setSuperExecution(executionEntity20);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices29 = executionEntity28.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity30.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity33.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList36 = executionEntity33.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList37 = executionEntity33.getEventSubscriptionsInternal();
        java.lang.String str38 = executionEntity33.getActivityId();
        boolean boolean39 = executionEntity33.isProcessInstanceType();
        executionEntity30.setSuperExecution(executionEntity33);
        executionEntity28.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity33);
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = executionEntity28.getProcessVariables();
        executionEntity20.setVariablesLocal(strMap42);
        executionEntity9.setVariables(strMap42);
        executionEntity0.setVariables(strMap42);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList46 = executionEntity0.getEventSubscriptionsInternal();
        org.activiti.engine.EngineServices engineServices47 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity50 = executionEntity0.addIdentityLink("ConcurrentScopeExecution[null]", "ProcessInstance[null]");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1484");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuspensionState((int) '#');
        executionEntity0.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList5 = executionEntity0.getExecutions();
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1485");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity3.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
        java.lang.String str8 = executionEntity3.getActivityId();
        boolean boolean9 = executionEntity3.isProcessInstanceType();
        executionEntity0.setSuperExecution(executionEntity3);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices12 = executionEntity11.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity16.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList19 = executionEntity16.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList20 = executionEntity16.getEventSubscriptionsInternal();
        java.lang.String str21 = executionEntity16.getActivityId();
        boolean boolean22 = executionEntity16.isProcessInstanceType();
        executionEntity13.setSuperExecution(executionEntity16);
        executionEntity11.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = executionEntity11.getProcessVariables();
        executionEntity3.setVariablesLocal(strMap25);
        executionEntity3.setActive(false);
        executionEntity3.setRevision((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity3.initialize();
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1486");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isEnded();
        boolean boolean2 = executionEntity0.isProcessInstanceType();
        java.lang.String str3 = executionEntity0.getCurrentActivityId();
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1487");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        java.lang.String str8 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = executionEntity0.updateProcessBusinessKey("");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1488");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity2.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        boolean boolean11 = executionEntity5.isProcessInstanceType();
        executionEntity2.setSuperExecution(executionEntity5);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity15.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity15.getEventSubscriptionsInternal();
        executionEntity15.setConcurrent(true);
        executionEntity15.setDeleteReason("");
        executionEntity0.setSuperExecution(executionEntity15);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList25 = executionEntity15.getCompensateEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = executionEntity15.getSubProcessInstance();
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1489");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement6 = executionEntity0.getEventSource();
        boolean boolean7 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1490");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        executionEntity0.forceUpdate();
        java.lang.String str5 = executionEntity0.getCurrentActivityId();
        executionEntity0.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("hi!");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1491");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList11 = executionEntity0.getCompensateEventSubscriptions("hi!");
        executionEntity0.setEventScope(false);
        executionEntity0.setId("ScopeExecution[null]");
        java.lang.String str16 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1492");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        boolean boolean6 = executionEntity0.isActive();
        executionEntity0.setActive(false);
        org.activiti.engine.EngineServices engineServices9 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution10 = executionEntity0.getStartingExecution();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        boolean boolean13 = executionEntity0.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity15.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity15.getEventSubscriptionsInternal();
        executionEntity15.setConcurrent(true);
        java.lang.Object obj22 = executionEntity15.getPersistentState();
        executionEntity15.setBusinessKey("");
        executionEntity15.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl27 = executionEntity15.getTransition();
        java.lang.String str28 = executionEntity15.getCurrentActivityId();
        java.lang.String str29 = executionEntity15.getCurrentActivityName();
        executionEntity15.setConcurrent(true);
        java.lang.String str32 = executionEntity15.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("ProcessInstance[null]", (java.lang.Object) str32);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1493");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(false);
        java.lang.String str9 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setSuperExecution(executionEntity11);
        boolean boolean13 = executionEntity10.isEnded();
        java.lang.Object obj14 = executionEntity10.getPersistentState();
        boolean boolean15 = executionEntity10.isProcessInstanceType();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList17 = executionEntity10.getExecutions();
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1494");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setSuspensionState((int) (short) 0);
        executionEntity1.setParentId("");
        boolean boolean10 = executionEntity1.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList11 = executionEntity1.getJobs();
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1495");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        executionEntity0.setTenantId("hi!");
        executionEntity0.setTenantId("");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity0.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList10 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1496");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity7.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity7.getEventSubscriptionsInternal();
        java.lang.String str12 = executionEntity7.getActivityId();
        int int13 = executionEntity7.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity7.getProcessInstance();
        executionEntity7.setDeleteReason("");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity7.getProcessVariables();
        executionEntity0.createVariablesLocal(strMap17);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = executionEntity0.getTransition();
        java.lang.String str20 = executionEntity0.getCurrentActivityName();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList21 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList22 = executionEntity0.getEventSubscriptions();
        executionEntity0.setParentId("ProcessInstance[ProcessInstance[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity27 = executionEntity0.involveUser("", "ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1497");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        executionEntity0.setDeleteReason("");
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList9 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1498");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        executionEntity0.setEventName("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setSuperExecution(executionEntity9);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str12 = executionEntity11.getEventName();
        executionEntity9.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices16 = executionEntity15.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList23 = executionEntity20.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList24 = executionEntity20.getEventSubscriptionsInternal();
        java.lang.String str25 = executionEntity20.getActivityId();
        boolean boolean26 = executionEntity20.isProcessInstanceType();
        executionEntity17.setSuperExecution(executionEntity20);
        executionEntity15.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = executionEntity15.getProcessVariables();
        java.lang.String str30 = executionEntity15.getProcessBusinessKey();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = executionEntity15.getProcessVariables();
        executionEntity11.setVariables(strMap31);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement33 = executionEntity11.getEventSource();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement34 = executionEntity11.getEventSource();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = executionEntity11.getProcessVariables();
        executionEntity11.setCachedEntityState((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity11.initialize();
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1499");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isEventScope();
        executionEntity0.inactivate();
        boolean boolean8 = executionEntity0.isActive();
        java.lang.String str9 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1500");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setDeleteReason("");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement9 = executionEntity0.getEventSource();
        java.lang.String str10 = executionEntity0.getId();
        executionEntity0.setTenantId("ProcessInstance[hi!]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity15 = executionEntity0.addIdentityLink("ScopeExecution[null]", "ProcessInstance[null]");
    }
}

