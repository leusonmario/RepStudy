import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1501");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        java.lang.String str5 = executionEntity0.getActivityId();
        java.lang.String str6 = executionEntity0.getParentId();
        int int7 = executionEntity0.getRevision();
        java.lang.String str8 = executionEntity0.getCurrentActivityName();
        executionEntity0.setDeleteReason("ProcessInstance[]");
        java.lang.Object obj11 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity14 = executionEntity0.involveUser("", "hi!");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1502");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        boolean boolean6 = executionEntity0.isEventScope();
        java.lang.String str7 = executionEntity0.getId();
        executionEntity0.inactivate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity9.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity9.getEventSubscriptionsInternal();
        java.lang.String str14 = executionEntity9.getActivityId();
        int int15 = executionEntity9.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity9.getProcessInstance();
        executionEntity9.setDeleteReason("");
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = executionEntity9.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity23.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList26 = executionEntity23.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList27 = executionEntity23.getEventSubscriptionsInternal();
        java.lang.String str28 = executionEntity23.getActivityId();
        boolean boolean29 = executionEntity23.isProcessInstanceType();
        executionEntity20.setSuperExecution(executionEntity23);
        executionEntity20.setActive(false);
        executionEntity20.disposeStartingExecution();
        boolean boolean34 = executionEntity20.isProcessInstanceType();
        executionEntity9.setSuperExecution(executionEntity20);
        java.lang.String str36 = executionEntity9.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl37 = executionEntity9.getActivity();
        executionEntity0.setSuperExecution(executionEntity9);
        int int39 = executionEntity9.getRevision();
        boolean boolean40 = executionEntity9.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = executionEntity9.createExecution();
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1503");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isEventScope();
        executionEntity0.setDeleteReason("hi!");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity0.getQueryVariables();
        executionEntity0.setEventName("hi!");
        java.lang.String str10 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = executionEntity0.isActive("ProcessInstance[null]");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1504");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        java.lang.Object obj6 = executionEntity3.getPersistentState();
        executionEntity3.setParentId("ProcessInstance[]");
        java.lang.String str9 = executionEntity3.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = executionEntity3.isActive("ProcessInstance[null]");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1505");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        java.lang.String str2 = executionEntity0.getEventName();
        java.lang.Object obj3 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1506");
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
        java.lang.String str16 = executionEntity5.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity5.end();
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1507");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = executionEntity0.isActive("");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1508");
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
        java.lang.String str19 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList20 = executionEntity0.getJobs();
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1509");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        executionEntity0.disposeStartingExecution();
        boolean boolean7 = executionEntity0.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setSuperExecution(executionEntity9);
        boolean boolean11 = executionEntity8.isEnded();
        java.lang.Object obj12 = executionEntity8.getPersistentState();
        executionEntity8.setTenantId("");
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
        executionEntity26.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl29 = executionEntity26.getActivity();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray30 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList31 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList31, variableInstanceEntityArray30);
        executionEntity26.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList31);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement34 = executionEntity26.getEventSource();
        executionEntity18.setSuperExecution(executionEntity26);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity36.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList39 = executionEntity36.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList40 = executionEntity36.getEventSubscriptionsInternal();
        java.lang.String str41 = executionEntity36.getActivityId();
        boolean boolean42 = executionEntity36.isProcessInstanceType();
        boolean boolean43 = executionEntity36.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity44 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity44.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity47 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity47.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList50 = executionEntity47.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList51 = executionEntity47.getEventSubscriptionsInternal();
        java.lang.String str52 = executionEntity47.getActivityId();
        boolean boolean53 = executionEntity47.isProcessInstanceType();
        executionEntity44.setSuperExecution(executionEntity47);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity55 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices56 = executionEntity55.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity57 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity57.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity60 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity60.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList63 = executionEntity60.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList64 = executionEntity60.getEventSubscriptionsInternal();
        java.lang.String str65 = executionEntity60.getActivityId();
        boolean boolean66 = executionEntity60.isProcessInstanceType();
        executionEntity57.setSuperExecution(executionEntity60);
        executionEntity55.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity60);
        java.util.Map<java.lang.String, java.lang.Object> strMap69 = executionEntity55.getProcessVariables();
        executionEntity47.setVariablesLocal(strMap69);
        executionEntity36.setVariables(strMap69);
        executionEntity26.setVariablesLocal(strMap69);
        executionEntity8.setVariables(strMap69);
        executionEntity0.createVariablesLocal(strMap69);
        executionEntity0.setBusinessKey("ProcessInstance[]");
        boolean boolean77 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1510");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity1.getProcessVariables();
        executionEntity1.setBusinessKey("");
        executionEntity1.setActive(true);
        executionEntity1.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity1.getEventSubscriptionsInternal();
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1511");
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
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity19 = executionEntity0.addIdentityLink("ProcessInstance[hi!]", "");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1512");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        int int2 = executionEntity0.getRevision();
        java.lang.String str3 = executionEntity0.getActivityId();
        java.lang.String str4 = executionEntity0.getActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setProcessDefinitionId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1513");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity4.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity4.getEventSubscriptionsInternal();
        executionEntity4.setConcurrent(true);
        executionEntity4.setActive(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution13 = executionEntity4.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity14.setCachedEntityState((int) (short) 100);
        executionEntity14.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = executionEntity14.getProcessVariables();
        executionEntity4.setVariables(strMap19);
        executionEntity0.createVariablesLocal(strMap19);
        executionEntity0.setEventName("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList24 = executionEntity0.getJobs();
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1514");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        executionEntity0.forceUpdate();
        java.lang.String str5 = executionEntity0.getCurrentActivityId();
        executionEntity0.setEventName("ConcurrentScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.addIdentityLink("ProcessInstance[]", "ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1515");
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
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution17 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList20 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1516");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isConcurrent();
        executionEntity0.setActive(false);
        int int9 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1517");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        int int7 = executionEntity0.getRevision();
        java.lang.Integer int8 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices11 = executionEntity10.getEngineServices();
        java.lang.String str12 = executionEntity10.getEventName();
        executionEntity10.setConcurrent(false);
        executionEntity10.setCachedEntityState((int) (short) 1);
        java.lang.String str17 = executionEntity10.getProcessInstanceId();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement19 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1518");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = executionEntity0.getActivity();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        boolean boolean4 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl5 = executionEntity0.getProcessDefinition();
        executionEntity0.setActive(false);
        boolean boolean8 = executionEntity0.isEventScope();
        java.lang.String str9 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = executionEntity0.updateProcessBusinessKey("ProcessInstance[]");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1519");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        java.lang.String str6 = executionEntity0.getActivityId();
        executionEntity0.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1520");
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
        java.lang.String str26 = executionEntity0.getEventName();
        java.lang.String str27 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList28 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1521");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList45 = executionEntity21.getJobs();
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1522");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.toString();
        executionEntity0.setSuspensionState((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.involveUser("ProcessInstance[]", "ProcessInstance[]");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1523");
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
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl15 = executionEntity0.getProcessDefinition();
        int int16 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1524");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        boolean boolean6 = executionEntity0.isActive();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity0.getTransitionBeingTaken();
        java.lang.Object obj8 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.involveUser("ProcessInstance[null]", "hi!");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1525");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        executionEntity0.setActive(false);
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[]");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1526");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setDeleteReason("");
        executionEntity0.setEventName("hi!");
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList11 = executionEntity0.getTasks();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.getProcessInstance();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList13 = executionEntity0.getQueryVariables();
        executionEntity0.setCachedEntityState((int) (byte) 1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity0.getParent();
        boolean boolean17 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity0.findExecution("hi!");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1527");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        java.lang.String str5 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement6 = executionEntity1.getEventSource();
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = executionEntity1.getCachedElContext();
        int int8 = executionEntity1.getSuspensionState();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList9 = executionEntity1.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.deleteCascade("hi!");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1528");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        java.lang.String str5 = executionEntity0.getActivityId();
        java.lang.String str6 = executionEntity0.getParentId();
        int int7 = executionEntity0.getRevision();
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList8 = executionEntity0.getTasks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = executionEntity0.isActive("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1529");
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
        executionEntity0.setEventScope(true);
        executionEntity0.setConcurrent(false);
        java.lang.String str47 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[null]");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1530");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getParent();
        executionEntity0.setEventName("");
        java.lang.String str9 = executionEntity0.getProcessDefinitionId();
        java.lang.Integer int10 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity13 = executionEntity0.involveUser("ProcessInstance[hi!]", "");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1531");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        executionEntity0.inactivate();
        boolean boolean5 = executionEntity0.isEventScope();
        java.lang.String str6 = executionEntity0.getProcessDefinitionId();
        executionEntity0.forceUpdate();
        boolean boolean8 = executionEntity0.isConcurrent();
        int int9 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1532");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity1.getStartingExecution();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getSubProcessInstance();
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1533");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        executionEntity0.disposeStartingExecution();
        boolean boolean7 = executionEntity0.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setSuperExecution(executionEntity9);
        boolean boolean11 = executionEntity8.isEnded();
        java.lang.Object obj12 = executionEntity8.getPersistentState();
        executionEntity8.setTenantId("");
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
        executionEntity26.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl29 = executionEntity26.getActivity();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray30 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList31 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList31, variableInstanceEntityArray30);
        executionEntity26.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList31);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement34 = executionEntity26.getEventSource();
        executionEntity18.setSuperExecution(executionEntity26);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity36.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList39 = executionEntity36.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList40 = executionEntity36.getEventSubscriptionsInternal();
        java.lang.String str41 = executionEntity36.getActivityId();
        boolean boolean42 = executionEntity36.isProcessInstanceType();
        boolean boolean43 = executionEntity36.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity44 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity44.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity47 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity47.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList50 = executionEntity47.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList51 = executionEntity47.getEventSubscriptionsInternal();
        java.lang.String str52 = executionEntity47.getActivityId();
        boolean boolean53 = executionEntity47.isProcessInstanceType();
        executionEntity44.setSuperExecution(executionEntity47);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity55 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices56 = executionEntity55.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity57 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity57.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity60 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity60.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList63 = executionEntity60.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList64 = executionEntity60.getEventSubscriptionsInternal();
        java.lang.String str65 = executionEntity60.getActivityId();
        boolean boolean66 = executionEntity60.isProcessInstanceType();
        executionEntity57.setSuperExecution(executionEntity60);
        executionEntity55.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity60);
        java.util.Map<java.lang.String, java.lang.Object> strMap69 = executionEntity55.getProcessVariables();
        executionEntity47.setVariablesLocal(strMap69);
        executionEntity36.setVariables(strMap69);
        executionEntity26.setVariablesLocal(strMap69);
        executionEntity8.setVariables(strMap69);
        executionEntity0.createVariablesLocal(strMap69);
        java.lang.String str75 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity77 = executionEntity0.findExecution("ProcessInstance[]");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1534");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        int int5 = executionEntity0.getRevision();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity9 = executionEntity0.addIdentityLink("ConcurrentScopeExecution[null]", "");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1535");
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
        java.lang.String str15 = executionEntity0.getDeleteReason();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity0.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1536");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1537");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        executionEntity0.disposeStartingExecution();
        boolean boolean7 = executionEntity0.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setSuperExecution(executionEntity9);
        boolean boolean11 = executionEntity8.isEnded();
        java.lang.Object obj12 = executionEntity8.getPersistentState();
        executionEntity8.setTenantId("");
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
        executionEntity26.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl29 = executionEntity26.getActivity();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray30 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList31 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList31, variableInstanceEntityArray30);
        executionEntity26.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList31);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement34 = executionEntity26.getEventSource();
        executionEntity18.setSuperExecution(executionEntity26);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity36.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList39 = executionEntity36.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList40 = executionEntity36.getEventSubscriptionsInternal();
        java.lang.String str41 = executionEntity36.getActivityId();
        boolean boolean42 = executionEntity36.isProcessInstanceType();
        boolean boolean43 = executionEntity36.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity44 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity44.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity47 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity47.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList50 = executionEntity47.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList51 = executionEntity47.getEventSubscriptionsInternal();
        java.lang.String str52 = executionEntity47.getActivityId();
        boolean boolean53 = executionEntity47.isProcessInstanceType();
        executionEntity44.setSuperExecution(executionEntity47);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity55 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices56 = executionEntity55.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity57 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity57.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity60 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity60.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList63 = executionEntity60.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList64 = executionEntity60.getEventSubscriptionsInternal();
        java.lang.String str65 = executionEntity60.getActivityId();
        boolean boolean66 = executionEntity60.isProcessInstanceType();
        executionEntity57.setSuperExecution(executionEntity60);
        executionEntity55.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity60);
        java.util.Map<java.lang.String, java.lang.Object> strMap69 = executionEntity55.getProcessVariables();
        executionEntity47.setVariablesLocal(strMap69);
        executionEntity36.setVariables(strMap69);
        executionEntity26.setVariablesLocal(strMap69);
        executionEntity8.setVariables(strMap69);
        executionEntity0.createVariablesLocal(strMap69);
        java.lang.String str75 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity78 = executionEntity0.involveUser("", "ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1538");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        java.lang.Object obj6 = executionEntity3.getPersistentState();
        java.lang.String str7 = executionEntity3.getProcessInstanceId();
        java.lang.String str8 = executionEntity3.getProcessInstanceId();
        executionEntity3.setSuspensionState(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity3.destroyScope("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1539");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.Integer int8 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str9 = executionEntity0.getDeleteReason();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        executionEntity0.forceUpdate();
        boolean boolean13 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity17 = executionEntity0.involveUser("ProcessInstance[hi!]", "");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1540");
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
        boolean boolean17 = executionEntity0.isActive("ProcessInstance[null]");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1541");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setId("");
        java.lang.Integer int4 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity0.getDeleteReason();
        java.lang.String str6 = executionEntity0.toString();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        java.lang.String str8 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.involveUser("ProcessInstance[null]", "ProcessInstance[]");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1542");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroy();
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1543");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList30 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1544");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = executionEntity0.getActivity();
        boolean boolean6 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        java.lang.Object obj8 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        boolean boolean11 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList12 = executionEntity0.getJobs();
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1545");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(false);
        boolean boolean9 = executionEntity0.isDeleteRoot();
        executionEntity0.setDeleteReason("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList15 = executionEntity12.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList16 = executionEntity12.getEventSubscriptionsInternal();
        java.lang.String str17 = executionEntity12.getActivityId();
        boolean boolean18 = executionEntity12.isProcessInstanceType();
        boolean boolean19 = executionEntity12.isEventScope();
        executionEntity12.forceUpdate();
        java.lang.String str21 = executionEntity12.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1546");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = executionEntity0.getActivity();
        java.lang.String str4 = executionEntity0.getDeleteReason();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[null]");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1547");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        java.util.List<java.lang.String> strList2 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior0.getTaskDefinition();
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
        boolean boolean34 = executionEntity20.isActive();
        java.lang.String str35 = executionEntity20.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userTaskActivityBehavior0.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity20);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1548");
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
        executionEntity27.deleteCascade("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1549");
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
        boolean boolean15 = executionEntity0.isScope();
        boolean boolean16 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1550");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        executionEntity0.setActive(false);
        int int7 = executionEntity0.getRevisionNext();
        boolean boolean8 = executionEntity0.isDeleteRoot();
        int int9 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList10 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1551");
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
        executionEntity0.setSuspensionState(0);
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList29 = executionEntity0.getTasks();
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1552");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = executionEntity0.getCachedElContext();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[null]");
        executionEntity0.disposeStartingExecution();
        java.lang.String str9 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[null]");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1553");
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
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity15 = executionEntity0.involveUser("ProcessInstance[hi!]", "hi!");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1554");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        boolean boolean2 = executionEntity0.isDeleteRoot();
        java.lang.Object obj3 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.findExecution("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1555");
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
        org.activiti.engine.EngineServices engineServices49 = executionEntity0.getEngineServices();
        executionEntity0.setConcurrent(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl52 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1556");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setBusinessKey("");
        int int8 = executionEntity5.getCachedEntityState();
        executionEntity5.setCachedEntityState((int) '4');
        java.lang.String str11 = executionEntity5.getCurrentActivityName();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1557");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isActive();
        boolean boolean9 = executionEntity0.isEnded();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = executionEntity0.getActivity();
        org.activiti.engine.EngineServices engineServices11 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList13 = executionEntity12.getQueryVariables();
        org.activiti.engine.EngineServices engineServices14 = executionEntity12.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity15.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity15.getEventSubscriptionsInternal();
        executionEntity15.setConcurrent(true);
        java.lang.Object obj22 = executionEntity15.getPersistentState();
        boolean boolean23 = executionEntity15.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList24 = executionEntity15.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList26 = executionEntity15.getCompensateEventSubscriptions("hi!");
        executionEntity15.setParentId("ProcessInstance[ProcessInstance[null]]");
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        java.lang.String str30 = executionEntity12.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray31 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList32 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList32, variableInstanceEntityArray31);
        executionEntity12.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1558");
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
        int int28 = executionEntity15.getRevision();
        executionEntity15.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity15.initialize();
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1559");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isEventScope();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList7 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1560");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        int int4 = executionEntity0.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        executionEntity0.setScope(true);
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1561");
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
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = executionEntity5.getEventSource();
        org.activiti.engine.EngineServices engineServices12 = executionEntity5.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity15 = executionEntity5.involveUser("ScopeExecution[null]", "ProcessInstance[]");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1562");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity1.getTransition();
        java.lang.String str5 = executionEntity1.getId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity1.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList7 = executionEntity1.getJobs();
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1563");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        java.lang.String str2 = executionEntity0.getEventName();
        executionEntity0.inactivate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setBusinessKey("");
        int int7 = executionEntity4.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity4.getTransition();
        int int9 = executionEntity4.getRevision();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = executionEntity4.getProcessVariables();
        executionEntity0.setVariables(strMap10);
        int int12 = executionEntity0.getRevisionNext();
        java.lang.String str13 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity0.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1564");
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
        java.lang.String str15 = executionEntity0.getProcessDefinitionId();
        java.lang.String str16 = executionEntity0.getDeleteReason();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList20 = executionEntity17.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList21 = executionEntity17.getEventSubscriptionsInternal();
        executionEntity17.setConcurrent(true);
        java.lang.Object obj24 = executionEntity17.getPersistentState();
        executionEntity17.setBusinessKey("");
        executionEntity17.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl29 = executionEntity17.getTransition();
        executionEntity17.setEventScope(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList32 = executionEntity17.getQueryVariables();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement33 = executionEntity17.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1565");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        int int7 = executionEntity0.getRevision();
        java.lang.Integer int8 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList10 = executionEntity0.getExecutions();
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1566");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity0.getTransition();
        java.lang.String str13 = executionEntity0.getTenantId();
        java.lang.String str14 = executionEntity0.getDeleteReason();
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1567");
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
        java.lang.Object obj16 = executionEntity0.getPersistentState();
        java.lang.String str17 = executionEntity0.getBusinessKey();
        java.lang.String str18 = executionEntity0.getTenantId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean20 = executionEntity19.isEnded();
        boolean boolean21 = executionEntity19.isProcessInstanceType();
        java.lang.String str22 = executionEntity19.getCurrentActivityId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList23 = executionEntity19.getQueryVariables();
        java.lang.String str24 = executionEntity19.getEventName();
        executionEntity19.setCachedEntityState((int) (short) 0);
        executionEntity19.setSuspensionState(2);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean31 = executionEntity0.isActive("");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1568");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        int int5 = executionEntity0.getRevision();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.setConcurrent(true);
        boolean boolean9 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = executionEntity0.isActive("");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1569");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        executionEntity0.setSuspensionState((-1));
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList9 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1570");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1571");
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
        boolean boolean16 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[hi!]");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1572");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList22 = executionEntity0.getTasks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = executionEntity0.findExecution("hi!");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1573");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = executionEntity0.getReplacedBy();
        int int23 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1574");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        executionEntity0.setTenantId("hi!");
        executionEntity0.setTenantId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1575");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isEventScope();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        int int6 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl7 = executionEntity0.getProcessDefinition();
        executionEntity0.setScope(false);
        executionEntity0.setId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList12 = executionEntity0.getExecutions();
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1576");
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
        executionEntity0.setRevision((int) (short) 10);
        boolean boolean17 = executionEntity0.isScope();
        java.lang.String str18 = executionEntity0.getActivityId();
        org.activiti.engine.impl.javax.el.ELContext eLContext19 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1577");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        executionEntity0.setBusinessKey("hi!");
        boolean boolean12 = executionEntity0.isEventScope();
        executionEntity0.setCachedEntityState((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1578");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        executionEntity0.setActive(false);
        int int7 = executionEntity0.getRevisionNext();
        boolean boolean8 = executionEntity0.isDeleteRoot();
        executionEntity0.setId("ProcessInstance[ProcessInstance[null]]");
        executionEntity0.setRevision(0);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = executionEntity0.getTransition();
        java.lang.String str14 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity0.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1579");
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
        boolean boolean11 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1580");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement3 = executionEntity1.getEventSource();
        executionEntity1.disposeStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = executionEntity1.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.destroyScope("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1581");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1582");
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
        executionEntity23.setId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean43 = executionEntity23.isActive("ScopeExecution[null]");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1583");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        java.lang.String str2 = executionEntity0.getEventName();
        executionEntity0.inactivate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setBusinessKey("");
        int int7 = executionEntity4.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity4.getTransition();
        int int9 = executionEntity4.getRevision();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = executionEntity4.getProcessVariables();
        executionEntity0.setVariables(strMap10);
        int int12 = executionEntity0.getRevisionNext();
        int int13 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity16 = executionEntity0.addIdentityLink("ProcessInstance[ProcessInstance[null]]", "");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1584");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        executionEntity0.setActive(false);
        java.lang.Integer int7 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.updateProcessBusinessKey("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1585");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList24 = executionEntity0.getExecutions();
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1586");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        executionEntity0.setParentId("hi!");
        int int7 = executionEntity0.getRevisionNext();
        boolean boolean8 = executionEntity0.isScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList9 = executionEntity0.getQueryVariables();
        boolean boolean10 = executionEntity0.isDeleteRoot();
        java.lang.Object obj11 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroy();
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1587");
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
        java.lang.String str21 = executionEntity11.getEventName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity22.setBusinessKey("");
        int int25 = executionEntity22.getRevisionNext();
        boolean boolean26 = executionEntity22.isProcessInstanceType();
        java.lang.String str27 = executionEntity22.getCurrentActivityName();
        executionEntity11.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity22);
        java.lang.String str29 = executionEntity22.getProcessDefinitionId();
        org.activiti.engine.impl.javax.el.ELContext eLContext30 = executionEntity22.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList32 = executionEntity22.getCompensateEventSubscriptions("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1588");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuspensionState((int) '#');
        executionEntity0.setEventScope(false);
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 6);
        executionEntity0.setDeleteReason("ProcessInstance[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[]");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1589");
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
        executionEntity5.setExecutionListenerIndex((java.lang.Integer) 6);
        executionEntity5.setParentId("ProcessInstance[null]");
        int int27 = executionEntity5.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = executionEntity5.createExecution();
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1590");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuspensionState((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList3 = executionEntity0.getTasks();
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1591");
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
        boolean boolean49 = executionEntity0.isEnded();
        boolean boolean50 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroy();
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1592");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList25 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1593");
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
        java.lang.String str28 = executionEntity3.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl29 = executionEntity3.getActivity();
        java.lang.String str30 = executionEntity3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity33 = executionEntity3.involveUser("hi!", "ScopeExecution[null]");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1594");
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
        executionEntity0.setProcessDefinitionId("ProcessInstance[ProcessInstance[null]]");
        int int15 = executionEntity0.getSuspensionState();
        boolean boolean16 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = executionEntity0.isActive("ProcessInstance[hi!]");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1595");
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
        java.lang.String str16 = executionEntity5.getId();
        int int17 = executionEntity5.getCachedEntityState();
        java.lang.String str18 = executionEntity5.getCurrentActivityId();
        java.lang.String str19 = executionEntity5.getId();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList20 = executionEntity5.getCompensateEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity5.insert();
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1596");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = executionEntity0.getActivity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setSuperExecution(executionEntity5);
        boolean boolean7 = executionEntity4.isEventScope();
        executionEntity4.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = executionEntity4.getActivity();
        boolean boolean10 = executionEntity4.isEventScope();
        java.lang.String str11 = executionEntity4.getBusinessKey();
        boolean boolean12 = executionEntity4.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1597");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuspensionState((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1598");
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
        java.lang.String str35 = executionEntity15.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity15.initialize();
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1599");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = executionEntity0.getCachedElContext();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[null]");
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[ProcessInstance[null]]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList13 = executionEntity10.getCompensateEventSubscriptions();
        boolean boolean14 = executionEntity10.isProcessInstanceType();
        executionEntity10.inactivate();
        java.lang.String str16 = executionEntity10.getActivityId();
        boolean boolean17 = executionEntity10.isScope();
        boolean boolean18 = executionEntity10.isConcurrent();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        java.lang.String str20 = executionEntity10.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity10.removeIdentityLinks();
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1600");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = executionEntity0.getProcessVariables();
        boolean boolean13 = executionEntity0.isProcessInstanceType();
        java.lang.String str14 = executionEntity0.getProcessInstanceId();
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity30.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList33 = executionEntity30.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList34 = executionEntity30.getEventSubscriptionsInternal();
        executionEntity30.setConcurrent(true);
        executionEntity30.setDeleteReason("");
        executionEntity15.setSuperExecution(executionEntity30);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = executionEntity30.getActivity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices42 = executionEntity41.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity43.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity46 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity46.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList49 = executionEntity46.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList50 = executionEntity46.getEventSubscriptionsInternal();
        java.lang.String str51 = executionEntity46.getActivityId();
        boolean boolean52 = executionEntity46.isProcessInstanceType();
        executionEntity43.setSuperExecution(executionEntity46);
        executionEntity41.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity46);
        java.util.Map<java.lang.String, java.lang.Object> strMap55 = executionEntity41.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity56 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity56.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList59 = executionEntity56.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList60 = executionEntity56.getEventSubscriptionsInternal();
        executionEntity56.setConcurrent(true);
        executionEntity56.setDeleteReason("");
        executionEntity41.setSuperExecution(executionEntity56);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl66 = executionEntity56.getActivity();
        executionEntity56.setScope(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList69 = executionEntity56.getEventSubscriptions();
        executionEntity56.setRevision((int) (byte) 10);
        java.lang.String str72 = executionEntity56.getEventName();
        java.util.Map<java.lang.String, java.lang.Object> strMap73 = executionEntity56.getProcessVariables();
        executionEntity56.setEventScope(false);
        java.lang.String str76 = executionEntity56.getDeleteReason();
        java.util.Map<java.lang.String, java.lang.Object> strMap77 = executionEntity56.getProcessVariables();
        executionEntity30.createVariablesLocal(strMap77);
        executionEntity0.setVariables(strMap77);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str81 = executionEntity0.updateProcessBusinessKey("");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1601");
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
        java.lang.String str17 = executionEntity0.getParentId();
        boolean boolean18 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = executionEntity0.getTransitionBeingTaken();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = executionEntity0.getActivity();
        int int21 = executionEntity0.getSuspensionState();
        java.lang.String str22 = executionEntity0.getTenantId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices24 = executionEntity23.getEngineServices();
        boolean boolean25 = executionEntity23.isDeleteRoot();
        java.lang.Object obj26 = executionEntity23.getPersistentState();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity23.initialize();
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1602");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        executionEntity0.inactivate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setSuspensionState((int) '#');
        executionEntity5.setEventScope(false);
        java.lang.String str10 = executionEntity5.getSuperExecutionId();
        executionEntity0.setSuperExecution(executionEntity5);
        executionEntity5.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity5.removeIdentityLinks();
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1603");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getProcessInstance();
        executionEntity0.setDeleteReason("");
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = executionEntity0.getProcessVariables();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity0.getEventSubscriptions();
        executionEntity0.setParentId("ProcessInstance[ProcessInstance[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList14 = executionEntity0.getExecutions();
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1604");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.Integer int8 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.inactivate();
        executionEntity0.setActive(true);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution12 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1605");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getParent();
        executionEntity0.setTenantId("hi!");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList12 = executionEntity0.getEventSubscriptionsInternal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity0.findExecution("hi!");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1606");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setEventScope(false);
        executionEntity1.setProcessDefinitionId("ScopeExecution[null]");
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
        java.lang.String str25 = executionEntity10.getProcessBusinessKey();
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = executionEntity10.getProcessVariables();
        int int27 = executionEntity10.getSuspensionState();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        java.lang.String str29 = executionEntity10.getCurrentActivityName();
        org.activiti.engine.impl.javax.el.ELContext eLContext30 = executionEntity10.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList31 = executionEntity10.findActiveActivityIds();
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1607");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        boolean boolean2 = executionEntity0.isDeleteRoot();
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList5 = executionEntity0.getCompensateEventSubscriptions("");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1608");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity42.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList45 = executionEntity42.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList46 = executionEntity42.getEventSubscriptionsInternal();
        executionEntity42.setConcurrent(true);
        executionEntity42.setDeleteReason("");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList51 = executionEntity42.getEventSubscriptionsInternal();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity52 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices53 = executionEntity52.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity54 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity54.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity57 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity57.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList60 = executionEntity57.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList61 = executionEntity57.getEventSubscriptionsInternal();
        java.lang.String str62 = executionEntity57.getActivityId();
        boolean boolean63 = executionEntity57.isProcessInstanceType();
        executionEntity54.setSuperExecution(executionEntity57);
        executionEntity52.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity57);
        java.util.Map<java.lang.String, java.lang.Object> strMap66 = executionEntity52.getProcessVariables();
        executionEntity42.setVariables(strMap66);
        boolean boolean68 = executionEntity42.isEnded();
        executionEntity42.setBusinessKey("");
        executionEntity42.setActive(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity73 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean74 = executionEntity73.isEnded();
        executionEntity42.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity73);
        executionEntity73.setSuspensionState((int) (short) 100);
        executionEntity27.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity73);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity27.insert();
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1609");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution2 = executionEntity0.getStartingExecution();
        boolean boolean3 = executionEntity0.isProcessInstanceType();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 5);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1610");
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
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = executionEntity0.getActivity();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList16 = executionEntity0.getCompensateEventSubscriptions("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1611");
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
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1612");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        boolean boolean6 = executionEntity0.isActive();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity0.getTransitionBeingTaken();
        boolean boolean8 = executionEntity0.isScope();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1613");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList14 = executionEntity1.getTasks();
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1614");
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
        boolean boolean36 = executionEntity11.isScope();
        java.lang.String str37 = executionEntity11.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str38 = executionEntity11.getProcessBusinessKey();
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1615");
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
        executionEntity0.setProcessDefinitionId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity38 = executionEntity0.createExecution();
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1616");
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
        java.lang.String str21 = executionEntity11.getEventName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity22.setBusinessKey("");
        int int25 = executionEntity22.getRevisionNext();
        boolean boolean26 = executionEntity22.isProcessInstanceType();
        java.lang.String str27 = executionEntity22.getCurrentActivityName();
        executionEntity11.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity22.insert();
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1617");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = executionEntity0.getActivity();
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1618");
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
        java.lang.String str14 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl15 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = executionEntity0.getCachedElContext();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList17 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList18 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1619");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        executionEntity0.setEventName("ProcessInstance[null]");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity12 = executionEntity0.involveUser("", "ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1620");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl4 = executionEntity0.getProcessDefinition();
        executionEntity0.setRevision((int) 'a');
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = executionEntity0.getActivity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = executionEntity0.getActivity();
        java.lang.String str10 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList11 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1621");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        executionEntity0.inactivate();
        java.lang.String str6 = executionEntity0.getActivityId();
        boolean boolean7 = executionEntity0.isScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptions();
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1622");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        java.lang.String str5 = executionEntity1.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.insert();
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1623");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = executionEntity0.getActivity();
        boolean boolean6 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        java.lang.Object obj8 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        boolean boolean11 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList12 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1624");
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
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1625");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity11.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList15 = executionEntity11.getEventSubscriptionsInternal();
        java.lang.String str16 = executionEntity11.getActivityId();
        boolean boolean17 = executionEntity11.isProcessInstanceType();
        boolean boolean18 = executionEntity11.isEventScope();
        executionEntity11.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList20 = executionEntity11.getCompensateEventSubscriptions();
        executionEntity11.setExecutionListenerIndex((java.lang.Integer) 7);
        executionEntity11.setExecutionListenerIndex((java.lang.Integer) 1);
        java.lang.String str25 = executionEntity11.getActivityId();
        executionEntity11.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userTaskActivityBehavior0.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity11);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1626");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        executionEntity0.setConcurrent(true);
        boolean boolean10 = executionEntity0.isEventScope();
        executionEntity0.setActive(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = executionEntity0.updateProcessBusinessKey("ProcessInstance[]");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1627");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = executionEntity0.getActivity();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity9.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity9.getEventSubscriptionsInternal();
        executionEntity9.setConcurrent(true);
        java.lang.Object obj16 = executionEntity9.getPersistentState();
        boolean boolean17 = executionEntity9.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity9.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList20 = executionEntity9.getCompensateEventSubscriptions("hi!");
        executionEntity9.setParentId("ProcessInstance[ProcessInstance[null]]");
        java.lang.String str23 = executionEntity9.getCurrentActivityId();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList25 = executionEntity9.getCompensateEventSubscriptions("ProcessInstance[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("ProcessInstance[hi!]", (java.lang.Object) executionEntity9);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1628");
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
        executionEntity9.removeIdentityLinks();
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1629");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        java.lang.String str8 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.findExecution("ProcessInstance[null]");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1630");
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
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl16 = executionEntity0.getProcessDefinition();
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity0.findExecution("");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1631");
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
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl27 = executionEntity3.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList28 = executionEntity3.getExecutions();
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1632");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        boolean boolean4 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList5 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1633");
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
        java.lang.String str11 = executionEntity1.getProcessBusinessKey();
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1634");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement3 = executionEntity1.getEventSource();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity7 = executionEntity1.addIdentityLink("", "ProcessInstance[null]");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1635");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(false);
        boolean boolean9 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.javax.el.ELContext eLContext10 = executionEntity0.getCachedElContext();
        java.lang.String str11 = executionEntity0.getDeleteReason();
        int int12 = executionEntity0.getRevision();
        boolean boolean13 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList15 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[]");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1636");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 7);
        executionEntity0.setProcessDefinitionId("ProcessInstance[]");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[hi!]");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1637");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        java.lang.String str2 = executionEntity0.getEventName();
        executionEntity0.setConcurrent(false);
        executionEntity0.setParentId("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity7.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity7.getEventSubscriptionsInternal();
        executionEntity7.setConcurrent(true);
        executionEntity7.setDeleteReason("");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList16 = executionEntity7.getEventSubscriptionsInternal();
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
        executionEntity7.setVariables(strMap31);
        boolean boolean33 = executionEntity7.isEnded();
        java.lang.String str34 = executionEntity7.getBusinessKey();
        java.lang.Object obj35 = executionEntity7.getPersistentState();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList36 = executionEntity7.getEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1638");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        int int4 = executionEntity0.getRevisionNext();
        executionEntity0.setEventScope(false);
        java.lang.String str7 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1639");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        executionEntity0.setActive(false);
        int int7 = executionEntity0.getRevisionNext();
        boolean boolean8 = executionEntity0.isDeleteRoot();
        int int9 = executionEntity0.getRevisionNext();
        executionEntity0.setTenantId("hi!");
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1640");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.Integer int8 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str9 = executionEntity0.getDeleteReason();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        executionEntity0.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList13 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean14 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1641");
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
        int int46 = executionEntity0.getCachedEntityState();
        int int47 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str49 = executionEntity0.updateProcessBusinessKey("");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1642");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        boolean boolean7 = executionEntity0.isEventScope();
        boolean boolean8 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1643");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean30 = executionEntity11.isActive("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1644");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity23.setBusinessKey("");
        int int26 = executionEntity23.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl27 = executionEntity23.getTransition();
        int int28 = executionEntity23.getRevision();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = executionEntity23.getProcessVariables();
        executionEntity3.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity23);
        boolean boolean31 = executionEntity23.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity23.insert();
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1645");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        executionEntity0.setParentId("hi!");
        int int7 = executionEntity0.getRevisionNext();
        boolean boolean8 = executionEntity0.isScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList9 = executionEntity0.getQueryVariables();
        boolean boolean10 = executionEntity0.isDeleteRoot();
        java.lang.Object obj11 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity0.findExecution("");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1646");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices13 = executionEntity12.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity14.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList20 = executionEntity17.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList21 = executionEntity17.getEventSubscriptionsInternal();
        java.lang.String str22 = executionEntity17.getActivityId();
        boolean boolean23 = executionEntity17.isProcessInstanceType();
        executionEntity14.setSuperExecution(executionEntity17);
        executionEntity12.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = executionEntity12.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity27.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList30 = executionEntity27.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList31 = executionEntity27.getEventSubscriptionsInternal();
        executionEntity27.setConcurrent(true);
        executionEntity27.setDeleteReason("");
        executionEntity12.setSuperExecution(executionEntity27);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl37 = executionEntity27.getActivity();
        executionEntity27.setScope(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList40 = executionEntity27.getEventSubscriptions();
        executionEntity27.setRevision((int) (byte) 10);
        java.lang.String str43 = executionEntity27.getEventName();
        java.util.Map<java.lang.String, java.lang.Object> strMap44 = executionEntity27.getProcessVariables();
        executionEntity0.setVariablesLocal(strMap44);
        executionEntity0.setCachedEntityState((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1647");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        boolean boolean4 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.findExecution("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1648");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        executionEntity0.setSuspensionState((-1));
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1649");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1650");
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
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl18 = executionEntity0.getTransition();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList20 = executionEntity0.getTasks();
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1651");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices25 = executionEntity24.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity26.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity29.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList32 = executionEntity29.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList33 = executionEntity29.getEventSubscriptionsInternal();
        java.lang.String str34 = executionEntity29.getActivityId();
        boolean boolean35 = executionEntity29.isProcessInstanceType();
        executionEntity26.setSuperExecution(executionEntity29);
        executionEntity24.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity29);
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = executionEntity24.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity39 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity39.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList42 = executionEntity39.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList43 = executionEntity39.getEventSubscriptionsInternal();
        executionEntity39.setConcurrent(true);
        executionEntity39.setDeleteReason("");
        executionEntity24.setSuperExecution(executionEntity39);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl49 = executionEntity39.getActivity();
        boolean boolean50 = executionEntity39.isActive();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity51 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity51.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList54 = executionEntity51.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList55 = executionEntity51.getEventSubscriptionsInternal();
        java.lang.String str56 = executionEntity51.getActivityId();
        boolean boolean57 = executionEntity51.isProcessInstanceType();
        boolean boolean58 = executionEntity51.isEventScope();
        executionEntity51.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList60 = executionEntity51.getCompensateEventSubscriptions();
        java.lang.String str61 = executionEntity51.getParentId();
        java.lang.String str62 = executionEntity51.toString();
        executionEntity39.setSuperExecution(executionEntity51);
        java.lang.String str64 = executionEntity51.getId();
        java.lang.Integer int65 = executionEntity51.getExecutionListenerIndex();
        executionEntity51.disposeStartingExecution();
        executionEntity3.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList68 = executionEntity51.findActiveActivityIds();
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1652");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement3 = executionEntity1.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity4.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity4.getEventSubscriptions();
        java.lang.String str9 = executionEntity4.getActivityId();
        java.lang.String str10 = executionEntity4.getParentId();
        int int11 = executionEntity4.getRevision();
        java.lang.String str12 = executionEntity4.getCurrentActivityName();
        executionEntity4.setDeleteReason("ProcessInstance[]");
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList15 = executionEntity4.getTasks();
        int int16 = executionEntity4.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1653");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1654");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList17 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1655");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = executionEntity0.getActivity();
        executionEntity0.inactivate();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList5 = executionEntity0.getExecutions();
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1656");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        java.lang.String str5 = executionEntity1.getProcessDefinitionId();
        java.lang.String str6 = executionEntity1.getProcessDefinitionId();
        org.activiti.engine.EngineServices engineServices7 = executionEntity1.getEngineServices();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement9 = executionEntity1.getEventSource();
        boolean boolean10 = executionEntity1.isConcurrent();
        executionEntity1.setEventName("ProcessInstance[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity15 = executionEntity1.addIdentityLink("ProcessInstance[hi!]", "ProcessInstance[null]");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1657");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity18 = executionEntity0.involveUser("ProcessInstance[ProcessInstance[null]]", "");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1658");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity20 = executionEntity0.addIdentityLink("hi!", "ProcessInstance[null]");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1659");
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
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity16 = executionEntity0.addIdentityLink("ScopeExecution[null]", "ScopeExecution[null]");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1660");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getProcessInstance();
        executionEntity0.setDeleteReason("");
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = executionEntity0.getProcessVariables();
        java.lang.String str11 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity0.findExecution("hi!");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1661");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList5 = executionEntity0.getEventSubscriptions();
        boolean boolean6 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList7 = executionEntity0.getJobs();
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1662");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        java.lang.String str4 = executionEntity0.getTenantId();
        java.lang.String str5 = executionEntity0.getEventName();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        executionEntity0.setSuspensionState(2);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setSuperExecution(executionEntity13);
        boolean boolean15 = executionEntity12.isEventScope();
        executionEntity12.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = executionEntity12.getActivity();
        boolean boolean18 = executionEntity12.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("ConcurrentScopeExecution[null]", (java.lang.Object) boolean18);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1663");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList12 = executionEntity0.getEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList13 = executionEntity0.getJobs();
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1664");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = executionEntity0.getActivity();
        executionEntity0.setScope(false);
        boolean boolean6 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1665");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setSuperExecution(executionEntity18);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl20 = executionEntity17.getTransition();
        executionEntity0.setSuperExecution(executionEntity17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList22 = executionEntity17.getJobs();
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1666");
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
        java.lang.String str14 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1667");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = executionEntity22.createExecution();
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1668");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        boolean boolean6 = executionEntity0.isActive();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity0.getTransitionBeingTaken();
        java.lang.Integer int8 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str9 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1669");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        boolean boolean7 = executionEntity0.isEventScope();
        executionEntity0.forceUpdate();
        java.lang.String str9 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1670");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        executionEntity0.setEventName("ProcessInstance[null]");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity12 = executionEntity0.addIdentityLink("ConcurrentScopeExecution[null]", "ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1671");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getRevision();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl7 = executionEntity0.getProcessDefinition();
        java.lang.String str8 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1672");
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
        org.activiti.engine.impl.javax.el.ELContext eLContext17 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1673");
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
        executionEntity11.setParentId("");
        executionEntity11.setExecutionListenerIndex((java.lang.Integer) 5);
        boolean boolean37 = executionEntity11.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity38 = executionEntity11.createExecution();
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1674");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 4);
        java.lang.String str11 = executionEntity0.getEventName();
        executionEntity0.setTenantId("ProcessInstance[null]");
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
        executionEntity26.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl29 = executionEntity26.getActivity();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray30 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList31 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList31, variableInstanceEntityArray30);
        executionEntity26.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList31);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement34 = executionEntity26.getEventSource();
        executionEntity18.setSuperExecution(executionEntity26);
        executionEntity18.setCachedEntityState((int) (short) 10);
        boolean boolean38 = executionEntity18.isScope();
        executionEntity18.setCachedEntityState((int) (byte) -1);
        executionEntity18.setScope(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList43 = executionEntity18.getTasks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("ProcessInstance[]", (java.lang.Object) taskEntityList43);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1675");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        executionEntity0.setParentId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1676");
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
        executionEntity11.setEventName("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean39 = executionEntity11.isActive("hi!");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1677");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        int int4 = executionEntity0.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setProcessDefinitionId("ProcessInstance[hi!]");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList11 = executionEntity0.getQueryVariables();
        java.lang.String str12 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1678");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        java.lang.String str5 = executionEntity0.getActivityId();
        java.lang.String str6 = executionEntity0.getParentId();
        int int7 = executionEntity0.getRevision();
        java.lang.String str8 = executionEntity0.getCurrentActivityName();
        java.lang.String str9 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList10 = executionEntity0.getExecutions();
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1679");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        executionEntity0.forceUpdate();
        java.lang.String str5 = executionEntity0.getCurrentActivityId();
        java.lang.String str6 = executionEntity0.getEventName();
        executionEntity0.setTenantId("hi!");
        java.lang.String str9 = executionEntity0.getId();
        boolean boolean10 = executionEntity0.isActive();
        executionEntity0.forceUpdate();
        executionEntity0.setSuspensionState(0);
        int int14 = executionEntity0.getSuspensionState();
        executionEntity0.setParentId("ConcurrentScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList17 = executionEntity0.getExecutions();
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1680");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.removeIdentityLinks();
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1681");
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
        boolean boolean14 = executionEntity8.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity8.deleteCascade("hi!");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1682");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = executionEntity0.getActivity();
        executionEntity0.disposeStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList15 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[]");
        java.lang.Object obj16 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1683");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = executionEntity16.findExecution("ProcessInstance[hi!]");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1684");
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
        executionEntity0.setId("ConcurrentScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = executionEntity0.updateProcessBusinessKey("ProcessInstance[]");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1685");
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
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl27 = executionEntity16.getTransitionBeingTaken();
        executionEntity16.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList30 = executionEntity16.getIdentityLinks();
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1686");
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
        boolean boolean26 = executionEntity0.isEnded();
        java.lang.String str27 = executionEntity0.getBusinessKey();
        executionEntity0.setRevision((int) 'a');
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList30 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList31 = executionEntity0.getTasks();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl32 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1687");
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
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl17 = executionEntity0.getTransitionBeingTaken();
        int int18 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList20 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1688");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        executionEntity0.setTenantId("hi!");
        boolean boolean6 = executionEntity0.isConcurrent();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement7 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1689");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuspensionState((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ScopeExecution[null]");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1690");
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
        boolean boolean29 = executionEntity3.isConcurrent();
        org.activiti.engine.EngineServices engineServices30 = executionEntity3.getEngineServices();
        boolean boolean31 = executionEntity3.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList32 = executionEntity3.getIdentityLinks();
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1691");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.Integer int8 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str9 = executionEntity0.getDeleteReason();
        boolean boolean10 = executionEntity0.isActive();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity0.getEventSubscriptionsInternal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.createExecution();
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1692");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity1.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList4 = executionEntity1.getExecutions();
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1693");
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
        executionEntity5.setEventScope(false);
        boolean boolean19 = executionEntity5.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity5.destroyScope("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1694");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        boolean boolean7 = executionEntity0.isEventScope();
        executionEntity0.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(false);
        java.lang.String str12 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setId("ProcessInstance[ProcessInstance[null]]");
        java.lang.String str15 = executionEntity0.getActivityId();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity0.createExecution();
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1695");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        int int3 = executionEntity0.getSuspensionState();
        executionEntity0.setEventScope(true);
        java.lang.String str6 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.createExecution();
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1696");
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
        java.lang.String str41 = executionEntity27.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity27.insert();
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1697");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setActive(false);
        executionEntity0.setSuspensionState(0);
        executionEntity0.setRevision(10);
        java.lang.String str13 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity16 = executionEntity0.involveUser("ProcessInstance[]", "ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1698");
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
        java.lang.String str14 = executionEntity0.toString();
        executionEntity0.setParentId("ProcessInstance[null]");
        java.lang.String str17 = executionEntity0.getActivityId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement18 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity0.findExecution("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1699");
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
        boolean boolean15 = executionEntity0.isEventScope();
        executionEntity0.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1700");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        executionEntity0.setTenantId("hi!");
        boolean boolean6 = executionEntity0.isConcurrent();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity0.getQueryVariables();
        boolean boolean8 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.involveUser("hi!", "");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1701");
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
        boolean boolean29 = executionEntity3.isConcurrent();
        org.activiti.engine.EngineServices engineServices30 = executionEntity3.getEngineServices();
        boolean boolean31 = executionEntity3.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity3.deleteCascade("");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1702");
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
        java.lang.String str19 = executionEntity0.getTenantId();
        int int20 = executionEntity0.getCachedEntityState();
        java.lang.String str21 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("hi!");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1703");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.findExecution("");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1704");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity31.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList34 = executionEntity31.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList35 = executionEntity31.getEventSubscriptionsInternal();
        java.lang.String str36 = executionEntity31.getActivityId();
        boolean boolean37 = executionEntity31.isProcessInstanceType();
        boolean boolean38 = executionEntity31.isEventScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity31);
        boolean boolean40 = executionEntity31.isDeleteRoot();
        executionEntity31.setEventScope(true);
        java.lang.String str43 = executionEntity31.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity31.deleteCascade("ProcessInstance[hi!]");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1705");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        executionEntity0.setSuspensionState((-1));
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity0.getEventSource();
        java.lang.String str9 = executionEntity0.getSuperExecutionId();
        java.lang.Integer int10 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList11 = executionEntity0.getExecutions();
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1706");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        java.lang.String str5 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement6 = executionEntity1.getEventSource();
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = executionEntity1.getCachedElContext();
        int int8 = executionEntity1.getSuspensionState();
        boolean boolean9 = executionEntity1.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.start();
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1707");
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
        boolean boolean15 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1708");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList25 = executionEntity14.getExecutions();
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1709");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        java.lang.String str5 = executionEntity1.getProcessDefinitionId();
        java.lang.String str6 = executionEntity1.getProcessDefinitionId();
        int int7 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity1.getStartingExecution();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity1.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.end();
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1710");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList19 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean20 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[null]");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1711");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransition();
        java.lang.String str5 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.findExecution("ScopeExecution[null]");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1712");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        executionEntity0.inactivate();
        java.lang.String str6 = executionEntity0.getActivityId();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity0.getEventSubscriptions();
        executionEntity0.setParentId("ProcessInstance[null]");
        boolean boolean10 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1713");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isActive();
        boolean boolean9 = executionEntity0.isEnded();
        java.lang.String str10 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1714");
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
        java.lang.String str15 = executionEntity0.getProcessDefinitionId();
        boolean boolean16 = executionEntity0.isEnded();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setSuperExecution(executionEntity18);
        org.activiti.engine.impl.javax.el.ELContext eLContext20 = executionEntity18.getCachedElContext();
        int int21 = executionEntity18.getCachedEntityState();
        boolean boolean22 = executionEntity18.isEventScope();
        executionEntity18.setDeleteReason("ProcessInstance[ProcessInstance[null]]");
        java.lang.Integer int25 = executionEntity18.getExecutionListenerIndex();
        executionEntity0.setSuperExecution(executionEntity18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity29 = executionEntity18.addIdentityLink("ConcurrentScopeExecution[null]", "ProcessInstance[null]");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1715");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        java.lang.String str5 = executionEntity0.getDeleteReason();
        java.lang.String str6 = executionEntity0.getDeleteReason();
        java.lang.String str7 = executionEntity0.getBusinessKey();
        executionEntity0.setScope(false);
        executionEntity0.setId("");
        executionEntity0.setTenantId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1716");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = executionEntity0.getActivity();
        executionEntity0.setActive(true);
        java.lang.String str6 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1717");
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
        executionEntity15.setId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean28 = executionEntity15.isActive("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1718");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity4 = executionEntity0.involveUser("", "ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1719");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        java.lang.String str6 = executionEntity0.getProcessDefinitionId();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[null]");
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity0.getCachedElContext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity11.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList15 = executionEntity11.getEventSubscriptionsInternal();
        executionEntity11.setConcurrent(true);
        executionEntity11.setActive(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution20 = executionEntity11.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray21 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList22 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList22, variableInstanceEntityArray21);
        executionEntity11.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList22);
        boolean boolean25 = executionEntity11.isConcurrent();
        boolean boolean26 = executionEntity11.isProcessInstanceType();
        java.lang.Object obj27 = executionEntity11.getPersistentState();
        executionEntity11.setExecutionListenerIndex((java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("ProcessInstance[hi!]", (java.lang.Object) (-1));
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1720");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = executionEntity0.getActivity();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        boolean boolean4 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl5 = executionEntity0.getProcessDefinition();
        executionEntity0.setActive(false);
        boolean boolean8 = executionEntity0.isEventScope();
        java.lang.String str9 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList10 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1721");
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
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl32 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str33 = executionEntity0.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl34 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList35 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1722");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        int int4 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getBusinessKey();
        java.lang.String str8 = executionEntity0.getCurrentActivityId();
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1723");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity30 = executionEntity17.addIdentityLink("ProcessInstance[null]", "hi!");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1724");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1725");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        executionEntity0.setActive(false);
        int int7 = executionEntity0.getRevisionNext();
        boolean boolean8 = executionEntity0.isDeleteRoot();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1726");
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
        org.activiti.engine.impl.javax.el.ELContext eLContext19 = executionEntity5.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity5.destroy();
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1727");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        boolean boolean6 = executionEntity0.isActive();
        executionEntity0.setActive(false);
        org.activiti.engine.EngineServices engineServices9 = executionEntity0.getEngineServices();
        java.lang.String str10 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1728");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        boolean boolean4 = executionEntity0.isScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = executionEntity0.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str7 = executionEntity6.getCurrentActivityName();
        executionEntity6.setId("");
        int int10 = executionEntity6.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = executionEntity6.getProcessVariables();
        executionEntity6.setScope(true);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = executionEntity6.getProcessVariables();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity6.findExecution("ProcessInstance[]");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1729");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList23 = executionEntity20.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList24 = executionEntity20.getEventSubscriptionsInternal();
        executionEntity20.setConcurrent(true);
        executionEntity20.setActive(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution29 = executionEntity20.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl30 = executionEntity20.getActivity();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = executionEntity20.getProcessVariables();
        executionEntity0.setVariables(strMap31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1730");
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
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity45 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1731");
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
        boolean boolean26 = executionEntity0.isEnded();
        java.lang.String str27 = executionEntity0.getBusinessKey();
        executionEntity0.setRevision((int) 'a');
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList30 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList31 = executionEntity0.getTasks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1732");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList14 = executionEntity0.getExecutions();
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1733");
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
        executionEntity0.setRevision((int) (short) 10);
        boolean boolean17 = executionEntity0.isScope();
        java.lang.String str18 = executionEntity0.getActivityId();
        java.lang.Integer int19 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList23 = executionEntity20.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList24 = executionEntity20.getEventSubscriptionsInternal();
        executionEntity20.setConcurrent(true);
        executionEntity20.setActive(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution29 = executionEntity20.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = executionEntity20.getProcessInstance();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = executionEntity20.getProcessInstance();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList33 = executionEntity20.getCompensateEventSubscriptions("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1734");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        executionEntity0.disposeStartingExecution();
        boolean boolean7 = executionEntity0.isProcessInstanceType();
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity35.setSuperExecution(executionEntity36);
        boolean boolean38 = executionEntity35.isEventScope();
        boolean boolean39 = executionEntity35.isEnded();
        executionEntity35.disposeStartingExecution();
        boolean boolean41 = executionEntity35.isActive();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl42 = executionEntity35.getTransitionBeingTaken();
        boolean boolean43 = executionEntity35.isScope();
        executionEntity35.setBusinessKey("");
        int int46 = executionEntity35.getCachedEntityState();
        executionEntity11.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity35);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity48 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices49 = executionEntity48.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity50 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity50.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity53 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity53.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList56 = executionEntity53.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList57 = executionEntity53.getEventSubscriptionsInternal();
        java.lang.String str58 = executionEntity53.getActivityId();
        boolean boolean59 = executionEntity53.isProcessInstanceType();
        executionEntity50.setSuperExecution(executionEntity53);
        executionEntity48.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity53);
        java.util.Map<java.lang.String, java.lang.Object> strMap62 = executionEntity48.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity63 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity63.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList66 = executionEntity63.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList67 = executionEntity63.getEventSubscriptionsInternal();
        executionEntity63.setConcurrent(true);
        executionEntity63.setDeleteReason("");
        executionEntity48.setSuperExecution(executionEntity63);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl73 = executionEntity63.getActivity();
        executionEntity63.setScope(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList76 = executionEntity63.getEventSubscriptions();
        executionEntity63.setRevision((int) (byte) 10);
        java.lang.String str79 = executionEntity63.getEventName();
        java.util.Map<java.lang.String, java.lang.Object> strMap80 = executionEntity63.getProcessVariables();
        executionEntity11.createVariablesLocal(strMap80);
        executionEntity0.setSuperExecution(executionEntity11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList83 = executionEntity11.findActiveActivityIds();
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1735");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList6 = executionEntity0.getTasks();
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1736");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        boolean boolean6 = executionEntity0.isConcurrent();
        boolean boolean7 = executionEntity0.isActive();
        org.activiti.engine.impl.javax.el.ELContext eLContext8 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[hi!]");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1737");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getProcessInstance();
        executionEntity0.setDeleteReason("");
        boolean boolean10 = executionEntity0.isProcessInstanceType();
        boolean boolean11 = executionEntity0.isEventScope();
        executionEntity0.setBusinessKey("ProcessInstance[ProcessInstance[null]]");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = executionEntity0.getTransitionBeingTaken();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity16.setCachedEntityState((int) (short) 100);
        executionEntity16.setActive(false);
        executionEntity16.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("ScopeExecution[null]", (java.lang.Object) executionEntity16);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1738");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isEventScope();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity7.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity7.getEventSubscriptionsInternal();
        executionEntity7.setConcurrent(true);
        java.lang.Object obj14 = executionEntity7.getPersistentState();
        executionEntity7.setBusinessKey("");
        executionEntity7.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = executionEntity7.getTransition();
        java.lang.String str20 = executionEntity7.getCurrentActivityId();
        boolean boolean21 = executionEntity7.isProcessInstanceType();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList22 = executionEntity7.getQueryVariables();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl23 = executionEntity7.getProcessDefinition();
        java.lang.String str24 = executionEntity7.getTenantId();
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = executionEntity7.getProcessVariables();
        executionEntity0.setVariablesLocal(strMap25);
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList28 = executionEntity0.getJobs();
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1739");
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
        executionEntity3.removeIdentityLinks();
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1740");
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
        executionEntity0.end();
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1741");
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
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1742");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity55 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity55.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList58 = executionEntity55.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList59 = executionEntity55.getEventSubscriptionsInternal();
        executionEntity55.setConcurrent(true);
        executionEntity55.setDeleteReason("");
        executionEntity40.setSuperExecution(executionEntity55);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl65 = executionEntity55.getActivity();
        executionEntity55.setScope(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList68 = executionEntity55.getEventSubscriptions();
        executionEntity55.setRevision((int) (byte) 10);
        java.lang.String str71 = executionEntity55.getEventName();
        java.util.Map<java.lang.String, java.lang.Object> strMap72 = executionEntity55.getProcessVariables();
        executionEntity3.createVariablesLocal(strMap72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean75 = executionEntity3.isActive("");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1743");
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
        java.lang.String str37 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity38 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity38.setCachedEntityState((int) (short) 100);
        executionEntity38.setActive(false);
        executionEntity38.setActive(false);
        int int45 = executionEntity38.getRevisionNext();
        java.lang.String str46 = executionEntity38.getId();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl47 = executionEntity38.getProcessDefinition();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity38);
        org.activiti.engine.EngineServices engineServices49 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity52 = executionEntity0.addIdentityLink("ProcessInstance[]", "");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1744");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroy();
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1745");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isSuspended();
        executionEntity0.setDeleteReason("ProcessInstance[]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity12 = executionEntity0.addIdentityLink("ConcurrentScopeExecution[null]", "");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1746");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        boolean boolean7 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.addIdentityLink("", "ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1747");
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
        executionEntity3.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList30 = executionEntity3.getJobs();
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1748");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        executionEntity0.forceUpdate();
        java.lang.String str5 = executionEntity0.getCurrentActivityId();
        java.lang.String str6 = executionEntity0.getEventName();
        executionEntity0.setTenantId("hi!");
        java.lang.String str9 = executionEntity0.getId();
        boolean boolean10 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.createExecution();
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1749");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isEventScope();
        executionEntity0.setDeleteReason("hi!");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity0.getQueryVariables();
        executionEntity0.setEventName("hi!");
        java.lang.String str10 = executionEntity0.getProcessInstanceId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList11 = executionEntity0.getQueryVariables();
        int int12 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1750");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList19 = executionEntity0.getExecutions();
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1751");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = executionEntity0.getCachedElContext();
        java.lang.String str6 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList8 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1752");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getReplacedBy();
        java.lang.String str6 = executionEntity1.getId();
        java.lang.String str7 = executionEntity1.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = executionEntity1.isActive("hi!");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1753");
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
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl15 = executionEntity0.getProcessDefinition();
        boolean boolean16 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1754");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList6 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1755");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        executionEntity0.setParentId("hi!");
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getProcessInstance();
        java.lang.String str10 = executionEntity0.updateProcessBusinessKey("ProcessInstance[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.findExecution("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1756");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity15.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity15.getEventSubscriptionsInternal();
        executionEntity15.setConcurrent(true);
        executionEntity15.setDeleteReason("");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList24 = executionEntity15.getEventSubscriptionsInternal();
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
        executionEntity15.setVariables(strMap39);
        executionEntity0.setVariables(strMap39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = executionEntity0.findExecution("hi!");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1757");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        executionEntity0.setSuspensionState((-1));
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity0.getEventSource();
        executionEntity0.setScope(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList11 = executionEntity0.getTasks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ScopeExecution[null]");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1758");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        executionEntity0.setActive(false);
        executionEntity0.inactivate();
        java.lang.String str8 = executionEntity0.getEventName();
        executionEntity0.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setCachedEntityState((int) (short) 100);
        java.lang.String str14 = executionEntity11.getBusinessKey();
        executionEntity11.disposeStartingExecution();
        boolean boolean16 = executionEntity11.isDeleteRoot();
        executionEntity11.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1759");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        executionEntity0.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity9 = executionEntity0.involveUser("ProcessInstance[null]", "ProcessInstance[hi!]");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1760");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity16 = executionEntity4.involveUser("ScopeExecution[null]", "");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1761");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        java.lang.String str2 = executionEntity0.getEventName();
        executionEntity0.inactivate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setBusinessKey("");
        int int7 = executionEntity4.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity4.getTransition();
        int int9 = executionEntity4.getRevision();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = executionEntity4.getProcessVariables();
        executionEntity0.setVariables(strMap10);
        int int12 = executionEntity0.getRevisionNext();
        int int13 = executionEntity0.getRevisionNext();
        int int14 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement15 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1762");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity0.getEventSubscriptionsInternal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ScopeExecution[null]");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1763");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList15 = executionEntity1.getCompensateEventSubscriptions("ProcessInstance[hi!]");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1764");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        boolean boolean6 = executionEntity0.isActive();
        executionEntity0.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.createExecution();
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1765");
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
        executionEntity0.setId("ProcessInstance[]");
        java.lang.Integer int17 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity0.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1766");
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
        executionEntity0.end();
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1767");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList23 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str24 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1768");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = executionEntity0.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setSuperExecution(executionEntity5);
        java.lang.String str7 = executionEntity4.getTenantId();
        boolean boolean8 = executionEntity4.isScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        int int10 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.createExecution();
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1769");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        java.lang.String str5 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement6 = executionEntity1.getEventSource();
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = executionEntity1.getCachedElContext();
        int int8 = executionEntity1.getSuspensionState();
        boolean boolean9 = executionEntity1.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity1.getEventSubscriptionsInternal();
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1770");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = userTaskActivityBehavior0.taskDefinition;
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        executionEntity5.setConcurrent(true);
        executionEntity5.setDeleteReason("");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList14 = executionEntity5.getEventSubscriptionsInternal();
        executionEntity5.setSuspensionState((int) (short) -1);
        java.lang.String str17 = executionEntity5.getCurrentActivityId();
        executionEntity5.inactivate();
        executionEntity5.setEventScope(true);
        int int21 = executionEntity5.getSuspensionState();
        executionEntity5.setParentId("ScopeExecution[null]");
        executionEntity5.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userTaskActivityBehavior0.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity5);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1771");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        java.lang.String str4 = executionEntity0.getEventName();
        boolean boolean5 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1772");
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
        boolean boolean15 = executionEntity0.isProcessInstanceType();
        java.lang.Object obj16 = executionEntity0.getPersistentState();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = executionEntity0.updateProcessBusinessKey("ProcessInstance[]");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1773");
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
        java.lang.String str28 = executionEntity3.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl29 = executionEntity3.getActivity();
        java.lang.String str30 = executionEntity3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList31 = executionEntity3.getExecutions();
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1774");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        java.lang.String str6 = executionEntity0.getProcessDefinitionId();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[null]");
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1775");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isActive();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList2 = executionEntity0.getQueryVariables();
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1776");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isSuspended();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransition();
        java.lang.Integer int9 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str10 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1777");
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
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl18 = executionEntity0.getTransition();
        executionEntity0.setSuspensionState((int) (short) -1);
        executionEntity0.setConcurrent(false);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement23 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity0.findExecution("hi!");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1778");
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
        executionEntity14.setExecutionListenerIndex((java.lang.Integer) (-1));
        java.lang.String str25 = executionEntity14.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity14.removeIdentityLinks();
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1779");
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
        executionEntity0.setProcessDefinitionId("ProcessInstance[ProcessInstance[null]]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity34.setSuperExecution(executionEntity35);
        org.activiti.engine.impl.javax.el.ELContext eLContext37 = executionEntity35.getCachedElContext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity38 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity39 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity38.setSuperExecution(executionEntity39);
        org.activiti.engine.impl.javax.el.ELContext eLContext41 = executionEntity39.getCachedElContext();
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = executionEntity39.getProcessVariables();
        executionEntity35.setSuperExecution(executionEntity39);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity44 = executionEntity35.getReplacedBy();
        executionEntity35.forceUpdate();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity35.destroyScope("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1780");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransition();
        int int5 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions("ScopeExecution[null]");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1781");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        java.lang.String str5 = executionEntity1.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.getSubProcessInstance();
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1782");
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
        boolean boolean19 = executionEntity0.isEnded();
        boolean boolean20 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1783");
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
        org.activiti.engine.impl.javax.el.ELContext eLContext12 = executionEntity0.getCachedElContext();
        boolean boolean13 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1784");
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
        executionEntity0.setDeleteReason("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity0.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList17 = executionEntity0.getJobs();
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1785");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        executionEntity5.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = executionEntity5.getProcessVariables();
        executionEntity0.setVariablesLocal(strMap10);
        java.lang.Object obj12 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1786");
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
        executionEntity27.end();
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1787");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        executionEntity0.setConcurrent(true);
        boolean boolean11 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1788");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        executionEntity0.setConcurrent(true);
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ScopeExecution[null]");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1789");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList37 = executionEntity12.getJobs();
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1790");
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
        java.lang.String str13 = executionEntity0.getSuperExecutionId();
        java.lang.Integer int14 = executionEntity0.getExecutionListenerIndex();
        boolean boolean15 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1791");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        boolean boolean7 = executionEntity0.isEnded();
        executionEntity0.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList10 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1792");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = executionEntity0.getActivity();
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.createExecution();
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1793");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.setEventScope(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices12 = executionEntity11.getEngineServices();
        boolean boolean13 = executionEntity11.isDeleteRoot();
        java.lang.Object obj14 = executionEntity11.getPersistentState();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity11.getTransitionBeingTaken();
        java.lang.String str16 = executionEntity11.getTenantId();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList18 = executionEntity11.getJobs();
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1794");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.disposeStartingExecution();
        boolean boolean5 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setBusinessKey("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1795");
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
        org.activiti.engine.EngineServices engineServices11 = executionEntity0.getEngineServices();
        boolean boolean12 = executionEntity0.isScope();
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity16 = executionEntity0.addIdentityLink("ProcessInstance[hi!]", "ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1796");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1797");
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
        java.lang.Object obj16 = executionEntity0.getPersistentState();
        java.lang.String str17 = executionEntity0.getBusinessKey();
        java.lang.String str18 = executionEntity0.getTenantId();
        executionEntity0.setEventName("ProcessInstance[ProcessInstance[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1798");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        executionEntity0.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.addIdentityLink("ProcessInstance[hi!]", "hi!");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1799");
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
        executionEntity0.setTenantId("ProcessInstance[]");
        executionEntity0.forceUpdate();
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
        java.lang.String str32 = executionEntity17.getProcessBusinessKey();
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = executionEntity17.getProcessVariables();
        int int34 = executionEntity17.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = executionEntity17.getProcessVariables();
        executionEntity0.setVariablesLocal(strMap35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1800");
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
        executionEntity0.end();
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1801");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        java.lang.String str4 = executionEntity0.getTenantId();
        java.lang.String str5 = executionEntity0.getEventName();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity0.getCompensateEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity9 = executionEntity0.addIdentityLink("", "ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1802");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isActive();
        boolean boolean9 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1803");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setActive(false);
        executionEntity0.setSuspensionState(0);
        executionEntity0.setProcessDefinitionId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1804");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setSuperExecution(executionEntity18);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl20 = executionEntity17.getTransition();
        executionEntity0.setSuperExecution(executionEntity17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList22 = executionEntity17.getTasks();
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1805");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        executionEntity0.setConcurrent(true);
        boolean boolean10 = executionEntity0.isEventScope();
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
        executionEntity0.createVariablesLocal(strMap25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1806");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        executionEntity0.setParentId("hi!");
        int int7 = executionEntity0.getRevisionNext();
        boolean boolean8 = executionEntity0.isScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList9 = executionEntity0.getQueryVariables();
        boolean boolean10 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl11 = executionEntity0.getProcessDefinition();
        boolean boolean12 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1807");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isEnded();
        boolean boolean2 = executionEntity0.isProcessInstanceType();
        java.lang.String str3 = executionEntity0.getCurrentActivityId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList4 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.createExecution();
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1808");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setEventScope(false);
        executionEntity1.setProcessDefinitionId("ScopeExecution[null]");
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
        java.lang.String str25 = executionEntity10.getProcessBusinessKey();
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = executionEntity10.getProcessVariables();
        int int27 = executionEntity10.getSuspensionState();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl29 = executionEntity1.getTransitionBeingTaken();
        boolean boolean30 = executionEntity1.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList31 = executionEntity1.getEventSubscriptions();
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1809");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getReplacedBy();
        java.lang.String str6 = executionEntity1.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity1.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1810");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setEventScope(false);
        executionEntity1.setProcessDefinitionId("ScopeExecution[null]");
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
        java.lang.String str25 = executionEntity10.getProcessBusinessKey();
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = executionEntity10.getProcessVariables();
        int int27 = executionEntity10.getSuspensionState();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        boolean boolean29 = executionEntity10.isEventScope();
        executionEntity10.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean33 = executionEntity10.isActive("");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1811");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity15.removeIdentityLinks();
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1812");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        boolean boolean2 = executionEntity0.isDeleteRoot();
        java.lang.Object obj3 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1813");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = executionEntity1.isActive("ProcessInstance[null]");
    }
}

