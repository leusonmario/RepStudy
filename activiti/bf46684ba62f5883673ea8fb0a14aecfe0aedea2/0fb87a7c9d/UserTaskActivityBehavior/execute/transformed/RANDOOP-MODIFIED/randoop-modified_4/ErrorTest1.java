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
        int int43 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList44 = executionEntity0.getExecutions();
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
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
        executionEntity11.end();
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        executionEntity0.disposeStartingExecution();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[null]");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity42 = executionEntity9.involveUser("ScopeExecution[null]", "ProcessInstance[]");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = executionEntity5.updateProcessBusinessKey("hi!");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        executionEntity0.setActive(false);
        java.lang.Integer int7 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.setBusinessKey("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity12 = executionEntity0.involveUser("", "ProcessInstance[null]");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
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
        org.activiti.engine.impl.javax.el.ELContext eLContext25 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList26 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(false);
        java.lang.String str9 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        executionEntity0.setScope(false);
        executionEntity0.setRevision((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        boolean boolean7 = executionEntity0.isEventScope();
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        int int10 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
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
        java.lang.String str17 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        boolean boolean7 = executionEntity0.isEventScope();
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = executionEntity0.isActive("hi!");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.Integer int8 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getParent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        executionEntity0.forceUpdate();
        java.lang.String str5 = executionEntity0.getCurrentActivityId();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        executionEntity0.forceUpdate();
        java.lang.String str5 = executionEntity0.getCurrentActivityId();
        java.lang.String str6 = executionEntity0.getEventName();
        executionEntity0.setTenantId("hi!");
        executionEntity0.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList11 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList2 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        boolean boolean6 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        int int5 = executionEntity0.getRevision();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList7 = executionEntity0.getJobs();
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity13 = executionEntity3.involveUser("ProcessInstance[ProcessInstance[null]]", "ScopeExecution[null]");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        java.lang.String str5 = executionEntity1.getProcessDefinitionId();
        java.lang.String str6 = executionEntity1.getProcessDefinitionId();
        int int7 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity1.getCompensateEventSubscriptions();
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = executionEntity0.getActivity();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isSuspended();
        int int8 = executionEntity0.getRevision();
        boolean boolean9 = executionEntity0.isEnded();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution13 = executionEntity10.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList14 = executionEntity10.getEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList15 = executionEntity10.getEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[]");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity49 = executionEntity0.addIdentityLink("ProcessInstance[null]", "ProcessInstance[null]");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity31.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList34 = executionEntity31.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList35 = executionEntity31.getEventSubscriptionsInternal();
        java.lang.String str36 = executionEntity31.getActivityId();
        boolean boolean37 = executionEntity31.isProcessInstanceType();
        java.lang.String str38 = executionEntity31.getDeleteReason();
        java.lang.String str39 = executionEntity31.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity40.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList43 = executionEntity40.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList44 = executionEntity40.getEventSubscriptionsInternal();
        java.lang.String str45 = executionEntity40.getActivityId();
        boolean boolean46 = executionEntity40.isProcessInstanceType();
        boolean boolean47 = executionEntity40.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity48 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity48.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity51 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity51.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList54 = executionEntity51.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList55 = executionEntity51.getEventSubscriptionsInternal();
        java.lang.String str56 = executionEntity51.getActivityId();
        boolean boolean57 = executionEntity51.isProcessInstanceType();
        executionEntity48.setSuperExecution(executionEntity51);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity59 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices60 = executionEntity59.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity61 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity61.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity64 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity64.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList67 = executionEntity64.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList68 = executionEntity64.getEventSubscriptionsInternal();
        java.lang.String str69 = executionEntity64.getActivityId();
        boolean boolean70 = executionEntity64.isProcessInstanceType();
        executionEntity61.setSuperExecution(executionEntity64);
        executionEntity59.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity64);
        java.util.Map<java.lang.String, java.lang.Object> strMap73 = executionEntity59.getProcessVariables();
        executionEntity51.setVariablesLocal(strMap73);
        executionEntity40.setVariables(strMap73);
        executionEntity31.setVariables(strMap73);
        executionEntity15.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity31.deleteCascade("");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        int int5 = executionEntity0.getRevision();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        java.lang.String str5 = executionEntity1.getProcessDefinitionId();
        java.lang.String str6 = executionEntity1.getProcessDefinitionId();
        int int7 = executionEntity1.getSuspensionState();
        java.lang.String str8 = executionEntity1.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.deleteCascade("ProcessInstance[null]");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getParent();
        boolean boolean10 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.createExecution();
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getCurrentActivityName();
        boolean boolean6 = executionEntity0.isConcurrent();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
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
        java.lang.String str16 = executionEntity0.getParentId();
        executionEntity0.setDeleteReason("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity21 = executionEntity0.addIdentityLink("hi!", "ScopeExecution[null]");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = executionEntity0.getActivity();
        java.lang.String str4 = executionEntity0.getDeleteReason();
        int int5 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList6 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList12 = executionEntity1.getEventSubscriptions();
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = executionEntity0.isActive("ProcessInstance[]");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        int int3 = executionEntity0.getSuspensionState();
        java.lang.String str4 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        java.lang.String str3 = executionEntity0.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        executionEntity0.setRevision((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.createExecution();
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        java.lang.String str4 = executionEntity0.getTenantId();
        java.lang.String str5 = executionEntity0.getEventName();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity0.getCompensateEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
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
        java.lang.String str14 = executionEntity4.getProcessBusinessKey();
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
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
        executionEntity0.setTenantId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        executionEntity0.setActive(false);
        int int7 = executionEntity0.getRevisionNext();
        java.lang.String str8 = executionEntity0.getId();
        java.lang.String str9 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList10 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        java.lang.String str4 = executionEntity0.getTenantId();
        java.lang.String str5 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = executionEntity0.isActive("ProcessInstance[]");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
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
        java.lang.String str13 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList14 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
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
        java.lang.String str14 = executionEntity0.getParentId();
        java.lang.String str15 = executionEntity0.getBusinessKey();
        int int16 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList21 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
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
        java.lang.String str12 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity15.start();
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransition();
        executionEntity0.setDeleteReason("ProcessInstance[]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity8.setCachedEntityState((int) (short) 100);
        java.lang.String str11 = executionEntity8.getBusinessKey();
        java.lang.String str12 = executionEntity8.getActivityId();
        java.lang.String str13 = executionEntity8.toString();
        boolean boolean14 = executionEntity8.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("ProcessInstance[null]", (java.lang.Object) boolean14);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        executionEntity0.setActive(false);
        int int7 = executionEntity0.getRevisionNext();
        boolean boolean8 = executionEntity0.isDeleteRoot();
        int int9 = executionEntity0.getRevisionNext();
        executionEntity0.setTenantId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityName();
        executionEntity4.setId("");
        int int8 = executionEntity4.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity4.getProcessVariables();
        executionEntity4.setScope(true);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = executionEntity4.getProcessVariables();
        executionEntity0.setVariablesLocal(strMap12);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
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
        java.util.List<java.lang.String> strList74 = executionEntity3.findActiveActivityIds();
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity4.getCompensateEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.removeIdentityLinks();
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        executionEntity0.setScope(false);
        executionEntity0.setRevision((int) (byte) 10);
        java.lang.String str9 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransition();
        int int5 = executionEntity0.getRevision();
        boolean boolean6 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransition();
        executionEntity0.setDeleteReason("ProcessInstance[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
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
        java.lang.String str30 = executionEntity15.getDeleteReason();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList31 = executionEntity15.getEventSubscriptions();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = executionEntity15.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity35 = executionEntity15.involveUser("ProcessInstance[ProcessInstance[null]]", "ProcessInstance[null]");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
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
        executionEntity0.setEventName("ProcessInstance[null]");
        java.lang.Object obj19 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity0.findExecution("ScopeExecution[null]");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        boolean boolean7 = executionEntity0.isEventScope();
        executionEntity0.setDeleteReason("ScopeExecution[null]");
        java.lang.String str10 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = executionEntity0.updateProcessBusinessKey("hi!");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList12 = executionEntity1.getEventSubscriptionsInternal();
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        java.lang.String str2 = executionEntity0.getEventName();
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setTenantId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = executionEntity0.isActive("hi!");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        java.lang.String str2 = executionEntity0.getEventName();
        executionEntity0.setRevision(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList5 = executionEntity0.getJobs();
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
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
        executionEntity0.start();
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
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
        executionEntity0.end();
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str17 = executionEntity16.getCurrentActivityName();
        int int18 = executionEntity16.getCachedEntityState();
        boolean boolean19 = executionEntity16.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList23 = executionEntity20.getCompensateEventSubscriptions();
        boolean boolean24 = executionEntity20.isEventScope();
        org.activiti.engine.EngineServices engineServices25 = executionEntity20.getEngineServices();
        java.lang.String str26 = executionEntity20.getId();
        executionEntity16.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        boolean boolean2 = executionEntity0.isDeleteRoot();
        java.lang.Object obj3 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.javax.el.ELContext eLContext1 = executionEntity0.getCachedElContext();
        executionEntity0.setCachedEntityState(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.createExecution();
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = executionEntity0.getActivity();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray4 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5, variableInstanceEntityArray4);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5);
        java.lang.String str8 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getProcessInstance();
        executionEntity0.setParentId("ProcessInstance[null]");
        java.lang.String str12 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isSuspended();
        int int8 = executionEntity0.getRevision();
        boolean boolean9 = executionEntity0.isEventScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList11 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[null]");
        boolean boolean12 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
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
        java.lang.String str34 = executionEntity0.updateProcessBusinessKey("ProcessInstance[]");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setActive(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution9 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList13 = executionEntity10.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList14 = executionEntity10.getEventSubscriptionsInternal();
        executionEntity10.setConcurrent(true);
        executionEntity10.setActive(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution19 = executionEntity10.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity10.getProcessInstance();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList21 = executionEntity10.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("hi!", (java.lang.Object) executionEntity10);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList11 = executionEntity0.getCompensateEventSubscriptions("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = executionEntity0.updateProcessBusinessKey("hi!");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        executionEntity0.setEventScope(true);
        boolean boolean10 = executionEntity0.isDeleteRoot();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity0.getEventSubscriptions();
        java.lang.String str12 = executionEntity0.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity14.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution17 = executionEntity14.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList18 = executionEntity14.getEventSubscriptions();
        org.activiti.engine.impl.javax.el.ELContext eLContext19 = executionEntity14.getCachedElContext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution23 = executionEntity20.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList24 = executionEntity20.getEventSubscriptions();
        executionEntity14.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
        executionEntity14.setScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity28.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList31 = executionEntity28.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList32 = executionEntity28.getEventSubscriptionsInternal();
        executionEntity28.setConcurrent(true);
        java.lang.Object obj35 = executionEntity28.getPersistentState();
        executionEntity28.setBusinessKey("");
        executionEntity28.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl40 = executionEntity28.getTransition();
        java.lang.String str41 = executionEntity28.getCurrentActivityId();
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = executionEntity28.getProcessVariables();
        executionEntity14.setVariablesLocal(strMap42);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList44 = executionEntity14.getCompensateEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("hi!", (java.lang.Object) executionEntity14);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.updateProcessBusinessKey("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = executionEntity1.getProcessBusinessKey();
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getCurrentActivityName();
        boolean boolean6 = executionEntity0.isConcurrent();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        boolean boolean8 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.involveUser("ProcessInstance[ProcessInstance[null]]", "");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        executionEntity0.inactivate();
        java.lang.String str6 = executionEntity0.getActivityId();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity0.getEventSubscriptions();
        executionEntity0.setParentId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity12 = executionEntity0.addIdentityLink("", "");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(false);
        int int9 = executionEntity0.getCachedEntityState();
        executionEntity0.setActive(false);
        boolean boolean12 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList18 = executionEntity0.getExecutions();
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
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
        executionEntity0.setId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = executionEntity0.getActivity();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray4 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5, variableInstanceEntityArray4);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList9 = executionEntity0.getJobs();
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList11 = executionEntity0.getCompensateEventSubscriptions("hi!");
        executionEntity0.setTenantId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        java.lang.String str4 = executionEntity0.getTenantId();
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
        executionEntity5.setSuspensionState(0);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList33 = executionEntity0.getExecutions();
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList25 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        executionEntity0.forceUpdate();
        java.lang.String str5 = executionEntity0.getCurrentActivityId();
        java.lang.String str6 = executionEntity0.getEventName();
        executionEntity0.setTenantId("hi!");
        java.lang.String str9 = executionEntity0.getId();
        boolean boolean10 = executionEntity0.isActive();
        boolean boolean11 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = executionEntity0.isActive("ProcessInstance[]");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        int int3 = executionEntity0.getSuspensionState();
        java.lang.String str4 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        boolean boolean6 = executionEntity0.isActive();
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList14 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = executionEntity0.updateProcessBusinessKey("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        java.lang.Object obj6 = executionEntity3.getPersistentState();
        java.lang.String str7 = executionEntity3.getEventName();
        java.lang.String str8 = executionEntity3.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity3.getEventSubscriptionsInternal();
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        java.lang.Object obj6 = executionEntity3.getPersistentState();
        executionEntity3.setParentId("ProcessInstance[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList9 = executionEntity3.getTasks();
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
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
        java.lang.String str17 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity0.createExecution();
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        executionEntity0.setTenantId("hi!");
        boolean boolean6 = executionEntity0.isConcurrent();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement7 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.updateProcessBusinessKey("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
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
        java.lang.String str17 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList18 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
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
        executionEntity0.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity1.getProcessVariables();
        executionEntity1.setActive(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList7 = executionEntity1.getJobs();
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement3 = executionEntity1.getEventSource();
        int int4 = executionEntity1.getCachedEntityState();
        org.activiti.engine.EngineServices engineServices5 = executionEntity1.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList6 = executionEntity1.getIdentityLinks();
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setActive(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution9 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = executionEntity0.updateProcessBusinessKey("ScopeExecution[null]");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
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
        java.lang.String str14 = executionEntity0.getParentId();
        java.lang.String str15 = executionEntity0.getBusinessKey();
        int int16 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity0.createExecution();
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
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
        java.lang.String str17 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity0.findExecution("");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity75 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity75.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList78 = executionEntity75.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList79 = executionEntity75.getEventSubscriptionsInternal();
        java.lang.String str80 = executionEntity75.getActivityId();
        boolean boolean81 = executionEntity75.isProcessInstanceType();
        boolean boolean82 = executionEntity75.isEventScope();
        executionEntity75.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity84 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity84.setBusinessKey("");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList87 = executionEntity84.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity88 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity88.setBusinessKey("");
        int int91 = executionEntity88.getRevisionNext();
        boolean boolean92 = executionEntity88.isProcessInstanceType();
        executionEntity88.setScope(false);
        executionEntity88.setRevision((int) (byte) 10);
        executionEntity84.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity88);
        executionEntity75.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity3.signal("ProcessInstance[]", (java.lang.Object) executionEntity75);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        boolean boolean7 = executionEntity0.isEventScope();
        executionEntity0.forceUpdate();
        java.lang.String str9 = executionEntity0.getActivityId();
        executionEntity0.setTenantId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.createExecution();
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
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
        java.lang.String str14 = executionEntity4.getTenantId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setCachedEntityState((int) (short) 100);
        java.lang.String str18 = executionEntity15.getProcessInstanceId();
        java.lang.String str19 = executionEntity15.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity20.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList23 = executionEntity20.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList24 = executionEntity20.getEventSubscriptionsInternal();
        java.lang.String str25 = executionEntity20.getActivityId();
        boolean boolean26 = executionEntity20.isProcessInstanceType();
        boolean boolean27 = executionEntity20.isEventScope();
        executionEntity20.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList29 = executionEntity20.getCompensateEventSubscriptions();
        executionEntity15.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
        java.lang.String str31 = executionEntity20.toString();
        java.lang.String str32 = executionEntity20.getCurrentActivityId();
        executionEntity4.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.removeIdentityLinks();
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean24 = executionEntity0.isActive("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList2 = executionEntity0.getJobs();
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isActive();
        boolean boolean9 = executionEntity0.isEnded();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = executionEntity0.getActivity();
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList12 = executionEntity0.getJobs();
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        executionEntity0.inactivate();
        boolean boolean5 = executionEntity0.isEventScope();
        java.lang.String str6 = executionEntity0.getProcessDefinitionId();
        boolean boolean7 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity18 = executionEntity0.addIdentityLink("ScopeExecution[null]", "");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        java.lang.String str5 = executionEntity0.getActivityId();
        java.lang.String str6 = executionEntity0.getParentId();
        int int7 = executionEntity0.getRevision();
        java.lang.String str8 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setSuperExecution(executionEntity10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str13 = executionEntity12.getEventName();
        executionEntity10.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        java.lang.Object obj15 = executionEntity12.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        java.lang.String str2 = executionEntity0.getEventName();
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.createExecution();
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        executionEntity0.setParentId("");
        boolean boolean7 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList8 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
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
        java.lang.String str15 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        java.lang.Object obj6 = executionEntity3.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList7 = executionEntity3.findActiveActivityIds();
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isEventScope();
        executionEntity0.setDeleteReason("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.createExecution();
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isEventScope();
        executionEntity0.setDeleteReason("hi!");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity0.getQueryVariables();
        executionEntity0.setEventName("hi!");
        int int10 = executionEntity0.getRevisionNext();
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity0.createExecution();
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isSuspended();
        int int8 = executionEntity0.getRevision();
        java.lang.String str9 = executionEntity0.getCurrentActivityId();
        executionEntity0.setProcessDefinitionId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
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
        boolean boolean26 = executionEntity9.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity29 = executionEntity9.involveUser("hi!", "ProcessInstance[null]");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity32 = executionEntity0.addIdentityLink("", "ProcessInstance[]");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl4 = executionEntity0.getProcessDefinition();
        executionEntity0.setRevision((int) 'a');
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        java.lang.String str8 = executionEntity0.getCurrentActivityName();
        java.lang.Integer int9 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity12 = executionEntity0.addIdentityLink("ProcessInstance[]", "ScopeExecution[null]");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
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
        java.lang.String str12 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList13 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        java.lang.String str3 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList4 = executionEntity0.getExecutions();
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str56 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
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
        java.lang.String str28 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.lang.Integer int4 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.createExecution();
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
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
        boolean boolean14 = executionEntity0.isProcessInstanceType();
        executionEntity0.setParentId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = executionEntity3.getProcessBusinessKey();
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
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
        java.lang.String str11 = executionEntity0.updateProcessBusinessKey("hi!");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(false);
        int int9 = executionEntity0.getCachedEntityState();
        executionEntity0.setSuspensionState((int) (byte) -1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList16 = executionEntity13.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList17 = executionEntity13.getEventSubscriptionsInternal();
        java.lang.String str18 = executionEntity13.getActivityId();
        int int19 = executionEntity13.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity13.getProcessInstance();
        executionEntity13.setDeleteReason("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("hi!", (java.lang.Object) executionEntity13);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
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
        java.lang.String str12 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        executionEntity0.setActive(false);
        int int7 = executionEntity0.getRevisionNext();
        boolean boolean8 = executionEntity0.isDeleteRoot();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList12 = executionEntity0.getExecutions();
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = executionEntity0.getProcessVariables();
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList20 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getParent();
        executionEntity0.setEventName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.addIdentityLink("ProcessInstance[ProcessInstance[null]]", "ProcessInstance[]");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = executionEntity0.getActivity();
        boolean boolean6 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
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
        executionEntity8.deleteCascade("ProcessInstance[]");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity9 = executionEntity0.involveUser("ProcessInstance[null]", "");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
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
        boolean boolean25 = executionEntity9.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = executionEntity9.getProcessBusinessKey();
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.String str8 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution9 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        executionEntity0.setConcurrent(true);
        int int11 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[]");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
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
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        executionEntity0.setActive(false);
        int int7 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity0.createExecution();
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        boolean boolean6 = executionEntity0.isActive();
        executionEntity0.setActive(false);
        org.activiti.engine.EngineServices engineServices9 = executionEntity0.getEngineServices();
        executionEntity0.setProcessDefinitionId("ProcessInstance[ProcessInstance[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList11 = executionEntity0.getCompensateEventSubscriptions("hi!");
        executionEntity0.setTenantId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList14 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        java.lang.String str10 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        int int4 = executionEntity0.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        executionEntity0.setScope(true);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity0.getProcessVariables();
        java.lang.String str9 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity0.getTransition();
        int int13 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity16 = executionEntity0.addIdentityLink("hi!", "");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
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
        java.lang.String str30 = executionEntity15.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity15.removeIdentityLinks();
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        executionEntity0.setParentId("hi!");
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
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
        executionEntity0.destroyScope("ProcessInstance[hi!]");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
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
        java.lang.String str58 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ScopeExecution[null]");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        boolean boolean6 = executionEntity0.isEventScope();
        java.lang.String str7 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList8 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
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
        executionEntity0.setEventName("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList14 = executionEntity0.getExecutions();
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setBusinessKey("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList20 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        boolean boolean6 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList7 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransition();
        int int5 = executionEntity0.getRevision();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransition();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList8 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
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
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity21 = executionEntity0.involveUser("hi!", "ScopeExecution[null]");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        executionEntity0.setParentId("hi!");
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        executionEntity0.setBusinessKey("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList10 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions();
        executionEntity0.setActive(true);
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(false);
        int int9 = executionEntity0.getCachedEntityState();
        executionEntity0.setActive(false);
        boolean boolean12 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[]");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        executionEntity0.inactivate();
        java.lang.String str6 = executionEntity0.getActivityId();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity0.getEventSubscriptions();
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        boolean boolean8 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        boolean boolean7 = executionEntity0.isEnded();
        java.lang.String str8 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        java.lang.String str5 = executionEntity0.getActivityId();
        java.lang.String str6 = executionEntity0.getParentId();
        executionEntity0.setEventName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = executionEntity0.getActivity();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray4 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5, variableInstanceEntityArray4);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        executionEntity0.setParentId("hi!");
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        executionEntity0.setBusinessKey("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[null]");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getParent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions("ScopeExecution[null]");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean41 = executionEntity27.isActive("ProcessInstance[null]");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setDeleteReason("");
        executionEntity0.setEventName("hi!");
        java.lang.String str11 = executionEntity0.getEventName();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl12 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("hi!");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isActive();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList2 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList3 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList10 = executionEntity0.getJobs();
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement3 = executionEntity1.getEventSource();
        int int4 = executionEntity1.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList5 = executionEntity1.getIdentityLinks();
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        java.lang.String str3 = executionEntity0.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        executionEntity0.setRevision((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[hi!]");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList40 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        executionEntity0.inactivate();
        java.lang.String str6 = executionEntity0.getActivityId();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity0.getEventSubscriptions();
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList10 = executionEntity0.getExecutions();
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList10 = executionEntity1.getExecutions();
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity3.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity3.getCompensateEventSubscriptions();
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        java.lang.String str6 = executionEntity0.getActivityId();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        java.lang.String str8 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
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
        java.lang.String str18 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = executionEntity0.isActive("");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = executionEntity0.findExecution("");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity11.removeIdentityLinks();
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
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
        java.lang.String str30 = executionEntity15.getDeleteReason();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList31 = executionEntity15.getEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList32 = executionEntity15.getEventSubscriptionsInternal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList33 = executionEntity15.findActiveActivityIds();
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        int int2 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList3 = executionEntity0.getExecutions();
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
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
        boolean boolean12 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity15 = executionEntity0.addIdentityLink("ProcessInstance[hi!]", "");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = userTaskActivityBehavior0.taskDefinition;
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity4.getActivity();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity4.getStartingExecution();
        executionEntity4.setProcessDefinitionId("ProcessInstance[ProcessInstance[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userTaskActivityBehavior0.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity4);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = executionEntity3.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity3.start();
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = executionEntity0.getCachedElContext();
        java.lang.String str6 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.createExecution();
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
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
        executionEntity1.start();
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        executionEntity0.disposeStartingExecution();
        boolean boolean7 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList8 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isSuspended();
        int int8 = executionEntity0.getRevision();
        boolean boolean9 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        int int5 = executionEntity0.getRevision();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        java.lang.String str4 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList5 = executionEntity0.getJobs();
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setDeleteReason("");
        executionEntity0.setEventName("hi!");
        java.lang.String str11 = executionEntity0.getEventName();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl12 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity15 = executionEntity0.involveUser("ProcessInstance[ProcessInstance[null]]", "ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
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
        boolean boolean26 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        boolean boolean6 = executionEntity0.isActive();
        executionEntity0.setActive(false);
        executionEntity0.inactivate();
        boolean boolean10 = executionEntity0.isSuspended();
        executionEntity0.setActive(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
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
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isSuspended();
        int int8 = executionEntity0.getRevision();
        boolean boolean9 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = executionEntity0.isActive("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        int int7 = executionEntity0.getRevision();
        java.lang.Integer int8 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
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
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = executionEntity0.getTransition();
        executionEntity0.setCachedEntityState(5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[hi!]");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = executionEntity0.getActivity();
        executionEntity0.inactivate();
        executionEntity0.setBusinessKey("ProcessInstance[]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement6 = executionEntity0.getEventSource();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[null]");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList16 = executionEntity0.getExecutions();
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList12 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList28 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
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
        java.util.List<java.lang.String> strList19 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransition();
        int int5 = executionEntity0.getRevision();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransition();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity0.getTransitionBeingTaken();
        boolean boolean8 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getEventName();
        boolean boolean2 = executionEntity0.isConcurrent();
        java.lang.String str3 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.createExecution();
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        int int9 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[hi!]");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
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
        executionEntity0.deleteCascade("ProcessInstance[hi!]");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity0.findExecution("hi!");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity7 = executionEntity0.involveUser("ProcessInstance[]", "ProcessInstance[]");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution2 = executionEntity0.getStartingExecution();
        boolean boolean3 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = executionEntity0.isActive("ProcessInstance[hi!]");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        executionEntity1.setEventScope(false);
        boolean boolean7 = executionEntity1.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.start();
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
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
        java.lang.String str19 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl4 = executionEntity0.getProcessDefinition();
        executionEntity0.setRevision((int) 'a');
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.updateProcessBusinessKey("ProcessInstance[]");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        java.lang.String str10 = executionEntity0.getEventName();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 7);
        boolean boolean13 = executionEntity0.isProcessInstanceType();
        java.lang.String str14 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getParent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        int int8 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity0.findExecution("hi!");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution2 = executionEntity0.getStartingExecution();
        boolean boolean3 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("hi!");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity1.getActivity();
        java.lang.String str7 = executionEntity1.getBusinessKey();
        executionEntity1.setId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList10 = executionEntity1.getIdentityLinks();
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = executionEntity0.updateProcessBusinessKey("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isEnded();
        boolean boolean2 = executionEntity0.isProcessInstanceType();
        java.lang.String str3 = executionEntity0.getCurrentActivityId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList4 = executionEntity0.getQueryVariables();
        java.lang.String str5 = executionEntity0.getEventName();
        executionEntity0.setCachedEntityState((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean41 = executionEntity27.isActive("ProcessInstance[hi!]");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList24 = executionEntity3.findActiveActivityIds();
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
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
        java.lang.String str12 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity0.findExecution("");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        executionEntity0.inactivate();
        executionEntity0.setBusinessKey("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        int int7 = executionEntity0.getRevision();
        java.lang.Integer int8 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isEventScope();
        executionEntity0.setDeleteReason("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList7 = executionEntity0.getExecutions();
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
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
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList20 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
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
        executionEntity0.deleteCascade("");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
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
        executionEntity0.setBusinessKey("");
        executionEntity0.setActive(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
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
        boolean boolean27 = executionEntity5.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity5.end();
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        executionEntity1.disposeStartingExecution();
        executionEntity1.setSuspensionState((int) ' ');
        int int7 = executionEntity1.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.destroyScope("ProcessInstance[hi!]");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getCachedEntityState();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
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
        boolean boolean14 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        java.lang.String str5 = executionEntity0.getActivityId();
        java.lang.String str6 = executionEntity0.getParentId();
        int int7 = executionEntity0.getRevision();
        java.lang.String str8 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
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
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl32 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 7);
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList6 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getParent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        boolean boolean7 = executionEntity0.isDeleteRoot();
        java.lang.String str8 = executionEntity0.getId();
        executionEntity0.setId("ProcessInstance[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity13 = executionEntity0.involveUser("ProcessInstance[]", "");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = executionEntity0.isActive("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        int int2 = executionEntity0.getCachedEntityState();
        int int3 = executionEntity0.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        java.lang.String str6 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList7 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList12 = executionEntity0.getEventSubscriptions();
        executionEntity0.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
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
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity14 = executionEntity0.involveUser("hi!", "ProcessInstance[]");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList11 = executionEntity0.getCompensateEventSubscriptions("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[hi!]");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        java.lang.Integer int4 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = executionEntity11.updateProcessBusinessKey("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
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
        executionEntity0.end();
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
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
        executionEntity1.start();
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
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
        executionEntity0.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity0.findExecution("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution10 = executionEntity0.getStartingExecution();
        java.lang.String str11 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity0.findExecution("");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
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
        executionEntity10.deleteCascade("ProcessInstance[hi!]");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
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
        java.lang.String str13 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        executionEntity0.inactivate();
        boolean boolean5 = executionEntity0.isEventScope();
        java.lang.String str6 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.updateProcessBusinessKey("ProcessInstance[]");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl4 = executionEntity0.getProcessDefinition();
        executionEntity0.setRevision((int) 'a');
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        java.lang.String str8 = executionEntity0.getCurrentActivityName();
        java.lang.Integer int9 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 7);
        executionEntity0.setBusinessKey("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        int int5 = executionEntity0.getRevision();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.setConcurrent(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setCachedEntityState((int) (short) 100);
        java.lang.String str12 = executionEntity9.getBusinessKey();
        executionEntity9.disposeStartingExecution();
        executionEntity9.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        executionEntity0.inactivate();
        executionEntity0.setBusinessKey("");
        executionEntity0.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = executionEntity0.isActive("hi!");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity31 = executionEntity0.addIdentityLink("ProcessInstance[]", "ScopeExecution[null]");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = executionEntity0.getActivity();
        executionEntity0.inactivate();
        executionEntity0.setBusinessKey("ProcessInstance[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity0.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity19 = executionEntity0.involveUser("ProcessInstance[]", "ProcessInstance[hi!]");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity11.getParent();
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        executionEntity0.setRevision((int) (byte) 100);
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) (-1));
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity6.setBusinessKey("");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList9 = executionEntity6.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setBusinessKey("");
        int int13 = executionEntity10.getRevisionNext();
        boolean boolean14 = executionEntity10.isProcessInstanceType();
        executionEntity10.setScope(false);
        executionEntity10.setRevision((int) (byte) 10);
        executionEntity6.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        java.lang.String str20 = executionEntity6.getParentId();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl21 = executionEntity6.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
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
        executionEntity1.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity1.getCompensateEventSubscriptions("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = executionEntity0.getActivity();
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices10 = executionEntity9.getEngineServices();
        int int11 = executionEntity9.getCachedEntityState();
        executionEntity0.setSuperExecution(executionEntity9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity9.initialize();
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
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
        java.lang.String str14 = executionEntity0.getBusinessKey();
        boolean boolean15 = executionEntity0.isProcessInstanceType();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList17 = executionEntity0.getCompensateEventSubscriptions("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList18 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        boolean boolean7 = executionEntity0.isEventScope();
        executionEntity0.setDeleteReason("ScopeExecution[null]");
        java.lang.String str10 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = executionEntity0.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity4.setSuperExecution(executionEntity5);
        java.lang.String str7 = executionEntity4.getTenantId();
        boolean boolean8 = executionEntity4.isScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        java.lang.String str10 = executionEntity4.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity13 = executionEntity4.involveUser("ProcessInstance[null]", "ConcurrentScopeExecution[null]");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isActive();
        boolean boolean9 = executionEntity0.isEventScope();
        java.lang.Object obj10 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity13 = executionEntity0.involveUser("ProcessInstance[hi!]", "ConcurrentScopeExecution[null]");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        java.lang.String str5 = executionEntity1.getProcessDefinitionId();
        java.lang.String str6 = executionEntity1.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.getSuperExecution();
        java.lang.String str8 = executionEntity1.getProcessInstanceId();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity1.findExecution("ScopeExecution[null]");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
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
        executionEntity0.deleteCascade("ProcessInstance[]");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
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
        java.lang.Integer int11 = executionEntity1.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.removeIdentityLinks();
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        java.lang.String str5 = executionEntity0.getDeleteReason();
        java.lang.String str6 = executionEntity0.getDeleteReason();
        java.lang.String str7 = executionEntity0.getBusinessKey();
        executionEntity0.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList10 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
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
        int int12 = executionEntity0.getSuspensionState();
        boolean boolean13 = executionEntity0.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity15.getProcessInstance();
        boolean boolean17 = executionEntity15.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("hi!", (java.lang.Object) executionEntity15);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        executionEntity1.setEventScope(false);
        executionEntity1.setRevision((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity1.getEventSubscriptions();
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = executionEntity0.isActive("ProcessInstance[hi!]");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity9.deleteCascade("ProcessInstance[]");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
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
        executionEntity0.setCachedEntityState((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getEventName();
        boolean boolean2 = executionEntity0.isConcurrent();
        java.lang.String str3 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = executionEntity0.isActive("");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity0.findExecution("hi!");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        boolean boolean6 = executionEntity0.isEventScope();
        int int7 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
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
        int int41 = executionEntity9.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList42 = executionEntity9.getIdentityLinks();
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = executionEntity0.getActivity();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        boolean boolean4 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl5 = executionEntity0.getProcessDefinition();
        executionEntity0.setActive(false);
        boolean boolean8 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.createExecution();
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement3 = executionEntity1.getEventSource();
        int int4 = executionEntity1.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity1.getCompensateEventSubscriptions("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
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
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity0.createExecution();
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
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
        executionEntity0.deleteCascade("ProcessInstance[]");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityName();
        executionEntity4.setId("");
        int int8 = executionEntity4.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity4.getProcessVariables();
        executionEntity4.setScope(true);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = executionEntity4.getProcessVariables();
        executionEntity0.setVariablesLocal(strMap12);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("hi!");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList49 = executionEntity0.getJobs();
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setSuperExecution(executionEntity18);
        boolean boolean20 = executionEntity17.isEventScope();
        boolean boolean21 = executionEntity17.isEnded();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity22.setCachedEntityState((int) (short) 100);
        executionEntity22.setActive(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = executionEntity22.getProcessVariables();
        executionEntity17.setVariablesLocal(strMap27);
        executionEntity0.setVariablesLocal(strMap27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList1 = executionEntity0.getQueryVariables();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setSuspensionState(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList5 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList5 = executionEntity0.getEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        executionEntity0.inactivate();
        boolean boolean5 = executionEntity0.isEventScope();
        java.lang.String str6 = executionEntity0.getProcessDefinitionId();
        executionEntity0.forceUpdate();
        boolean boolean8 = executionEntity0.isConcurrent();
        java.lang.Integer int9 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity13 = executionEntity0.involveUser("ConcurrentScopeExecution[null]", "ProcessInstance[]");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList12 = executionEntity0.getJobs();
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isSuspended();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList9 = executionEntity0.getJobs();
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList15 = executionEntity0.getQueryVariables();
        executionEntity0.setDeleteReason("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList18 = executionEntity0.getJobs();
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList18 = executionEntity0.getJobs();
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = executionEntity0.getActivity();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.lang.String str4 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList5 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList9 = executionEntity0.getExecutions();
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        java.lang.String str5 = executionEntity0.getDeleteReason();
        java.lang.String str6 = executionEntity0.getDeleteReason();
        java.lang.String str7 = executionEntity0.getBusinessKey();
        executionEntity0.setScope(false);
        java.lang.String str10 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList11 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = executionEntity0.getActivity();
        java.lang.String str13 = executionEntity0.getDeleteReason();
        java.lang.String str14 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList15 = executionEntity0.getJobs();
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl4 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.lang.String str8 = executionEntity5.getProcessInstanceId();
        java.lang.String str9 = executionEntity5.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList13 = executionEntity10.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList14 = executionEntity10.getEventSubscriptionsInternal();
        java.lang.String str15 = executionEntity10.getActivityId();
        boolean boolean16 = executionEntity10.isProcessInstanceType();
        boolean boolean17 = executionEntity10.isEventScope();
        executionEntity10.forceUpdate();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList19 = executionEntity10.getCompensateEventSubscriptions();
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        java.lang.String str21 = executionEntity10.toString();
        executionEntity0.setSuperExecution(executionEntity10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList23 = executionEntity10.getExecutions();
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
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
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity14 = executionEntity0.addIdentityLink("", "ProcessInstance[null]");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str10 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
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
        java.lang.String str50 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        executionEntity0.setActive(false);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution9 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getProcessInstance();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList11 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList5 = executionEntity0.getEventSubscriptions();
        boolean boolean6 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity9 = executionEntity0.involveUser("ProcessInstance[]", "ProcessInstance[hi!]");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
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
        int int12 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[]");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        boolean boolean7 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = executionEntity0.getActivity();
        java.lang.String str9 = executionEntity0.toString();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList11 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = executionEntity0.updateProcessBusinessKey("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
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
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity17 = executionEntity0.addIdentityLink("ProcessInstance[]", "");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        java.lang.Object obj6 = executionEntity3.getPersistentState();
        java.lang.String str7 = executionEntity3.getProcessInstanceId();
        java.lang.String str8 = executionEntity3.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity3.getEventSubscriptionsInternal();
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        executionEntity0.inactivate();
        boolean boolean5 = executionEntity0.isEventScope();
        java.lang.String str6 = executionEntity0.getProcessDefinitionId();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
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
        boolean boolean19 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList20 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
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
        executionEntity15.setSuspensionState(1);
        boolean boolean32 = executionEntity15.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity35 = executionEntity15.involveUser("", "");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
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
        int int19 = executionEntity0.getRevisionNext();
        boolean boolean20 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        java.lang.String str5 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList6 = executionEntity0.getJobs();
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity10.initialize();
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = executionEntity0.getActivity();
        executionEntity0.setScope(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[null]");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
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
        java.lang.String str12 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isEnded();
        boolean boolean2 = executionEntity0.isProcessInstanceType();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList4 = executionEntity0.getExecutions();
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        executionEntity0.setDeleteReason("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList7 = executionEntity0.getExecutions();
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = executionEntity0.getActivity();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getSuperExecution();
        boolean boolean7 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl4 = executionEntity0.getProcessDefinition();
        executionEntity0.setRevision((int) 'a');
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        java.lang.String str8 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        java.lang.String str5 = executionEntity1.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity1.updateProcessBusinessKey("ProcessInstance[hi!]");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[null]");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity37 = executionEntity15.findExecution("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList17 = executionEntity0.getExecutions();
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        executionEntity0.setRevision((int) '#');
        executionEntity0.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ScopeExecution[null]");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
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
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList15 = executionEntity0.getJobs();
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
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
        executionEntity0.setDeleteReason("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList27 = executionEntity16.getEventSubscriptionsInternal();
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
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
        executionEntity0.deleteCascade("ProcessInstance[null]");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
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
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl11 = executionEntity0.getProcessDefinition();
        executionEntity0.inactivate();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[hi!]");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList15 = executionEntity0.getEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = executionEntity0.updateProcessBusinessKey("ProcessInstance[]");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = userTaskActivityBehavior0.taskDefinition;
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity5.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity5.getEventSubscriptionsInternal();
        java.lang.String str10 = executionEntity5.getActivityId();
        int int11 = executionEntity5.getSuspensionState();
        boolean boolean12 = executionEntity5.isSuspended();
        int int13 = executionEntity5.getRevision();
        boolean boolean14 = executionEntity5.isEventScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList16 = executionEntity5.getCompensateEventSubscriptions("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userTaskActivityBehavior0.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity5);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
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
        java.lang.String str19 = executionEntity0.getProcessInstanceId();
        java.lang.String str20 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList21 = executionEntity0.getExecutions();
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.findExecution("ProcessInstance[null]");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList15 = executionEntity0.getTasks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity0.createExecution();
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        executionEntity0.setActive(false);
        executionEntity0.setActive(false);
        int int7 = executionEntity0.getRevisionNext();
        boolean boolean8 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(false);
        int int9 = executionEntity0.getCachedEntityState();
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.getParent();
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity49 = executionEntity0.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity51 = executionEntity0.findExecution("ScopeExecution[null]");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.disposeStartingExecution();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = executionEntity0.isActive("ProcessInstance[null]");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList3 = executionEntity0.getQueryVariables();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = executionEntity0.getActivity();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.lang.String str4 = executionEntity0.getBusinessKey();
        executionEntity0.setEventName("ProcessInstance[ProcessInstance[null]]");
        java.lang.String str7 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList8 = executionEntity0.getJobs();
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        int int4 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        executionEntity0.setEventScope(false);
        executionEntity0.setScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution14 = executionEntity11.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList15 = executionEntity11.getEventSubscriptions();
        java.lang.String str16 = executionEntity11.getActivityId();
        java.lang.String str17 = executionEntity11.getParentId();
        executionEntity11.setEventName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
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
        java.lang.String str33 = executionEntity15.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
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
        boolean boolean17 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        java.lang.String str10 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = executionEntity0.isActive("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        executionEntity0.setEventName("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList8 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
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
        java.lang.String str29 = executionEntity15.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity15.start();
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
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
        boolean boolean16 = executionEntity0.isActive("ProcessInstance[null]");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList25 = executionEntity0.getJobs();
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        executionEntity0.setTenantId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList13 = executionEntity10.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList14 = executionEntity10.getEventSubscriptionsInternal();
        java.lang.String str15 = executionEntity10.getActivityId();
        boolean boolean16 = executionEntity10.isProcessInstanceType();
        executionEntity7.setSuperExecution(executionEntity10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity18.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl21 = executionEntity18.getActivity();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray22 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList23 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList23, variableInstanceEntityArray22);
        executionEntity18.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList23);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement26 = executionEntity18.getEventSource();
        executionEntity10.setSuperExecution(executionEntity18);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity28.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList31 = executionEntity28.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList32 = executionEntity28.getEventSubscriptionsInternal();
        java.lang.String str33 = executionEntity28.getActivityId();
        boolean boolean34 = executionEntity28.isProcessInstanceType();
        boolean boolean35 = executionEntity28.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity36.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity39 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity39.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList42 = executionEntity39.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList43 = executionEntity39.getEventSubscriptionsInternal();
        java.lang.String str44 = executionEntity39.getActivityId();
        boolean boolean45 = executionEntity39.isProcessInstanceType();
        executionEntity36.setSuperExecution(executionEntity39);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity47 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices48 = executionEntity47.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity49 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity49.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity52 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity52.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList55 = executionEntity52.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList56 = executionEntity52.getEventSubscriptionsInternal();
        java.lang.String str57 = executionEntity52.getActivityId();
        boolean boolean58 = executionEntity52.isProcessInstanceType();
        executionEntity49.setSuperExecution(executionEntity52);
        executionEntity47.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity52);
        java.util.Map<java.lang.String, java.lang.Object> strMap61 = executionEntity47.getProcessVariables();
        executionEntity39.setVariablesLocal(strMap61);
        executionEntity28.setVariables(strMap61);
        executionEntity18.setVariablesLocal(strMap61);
        executionEntity0.setVariables(strMap61);
        executionEntity0.setDeleteReason("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        boolean boolean6 = executionEntity0.isActive();
        executionEntity0.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity0.getTransition();
        int int10 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity13 = executionEntity0.addIdentityLink("ConcurrentScopeExecution[null]", "ProcessInstance[]");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList16 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[]");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[]");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        int int6 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = executionEntity0.isActive("");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList22 = executionEntity0.getExecutions();
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isEnded();
        boolean boolean2 = executionEntity0.isProcessInstanceType();
        java.lang.String str3 = executionEntity0.getCurrentActivityId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList4 = executionEntity0.getQueryVariables();
        java.lang.String str5 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.findExecution("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.lang.String str4 = executionEntity0.toString();
        int int5 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("hi!");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = executionEntity0.getActivity();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        boolean boolean4 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl5 = executionEntity0.getProcessDefinition();
        executionEntity0.setActive(false);
        java.lang.String str8 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setSuperExecution(executionEntity6);
        org.activiti.engine.impl.javax.el.ELContext eLContext8 = executionEntity6.getCachedElContext();
        boolean boolean9 = executionEntity6.isActive();
        java.lang.String str10 = executionEntity6.getProcessDefinitionId();
        java.lang.String str11 = executionEntity6.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity12.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList15 = executionEntity12.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList16 = executionEntity12.getEventSubscriptionsInternal();
        executionEntity12.setConcurrent(true);
        executionEntity12.setDeleteReason("");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList21 = executionEntity12.getEventSubscriptionsInternal();
        executionEntity12.setSuspensionState((int) (short) -1);
        java.lang.String str24 = executionEntity12.getCurrentActivityId();
        executionEntity6.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity27.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList30 = executionEntity27.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList31 = executionEntity27.getEventSubscriptionsInternal();
        executionEntity27.setConcurrent(true);
        java.lang.Object obj34 = executionEntity27.getPersistentState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl35 = executionEntity27.getActivity();
        executionEntity27.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity27.setTenantId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userTaskActivityBehavior0.signal((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity12, "ProcessInstance[hi!]", (java.lang.Object) "");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList48 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
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
        executionEntity0.setTenantId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = executionEntity0.updateProcessBusinessKey("ScopeExecution[null]");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList17 = executionEntity1.getIdentityLinks();
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        executionEntity0.disposeStartingExecution();
        java.lang.String str5 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = executionEntity0.getActivity();
        org.activiti.engine.EngineServices engineServices6 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = executionEntity0.isActive("hi!");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
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
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl32 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = executionEntity0.createExecution();
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = executionEntity0.getActivity();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = executionEntity0.isActive("ProcessInstance[hi!]");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
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
        executionEntity1.setId("ProcessInstance[ProcessInstance[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = executionEntity1.findActiveActivityIds();
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str10 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
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
        int int19 = executionEntity0.getRevisionNext();
        boolean boolean20 = executionEntity0.isDeleteRoot();
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList21 = executionEntity0.getTasks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity24 = executionEntity0.involveUser("hi!", "ProcessInstance[hi!]");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isSuspended();
        java.lang.String str9 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList10 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.updateProcessBusinessKey("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList34 = executionEntity11.getJobs();
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
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
        boolean boolean31 = executionEntity15.isSuspended();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str34 = executionEntity33.getProcessDefinitionId();
        executionEntity33.setId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity15.signal("hi!", (java.lang.Object) "");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = executionEntity0.getActivity();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        boolean boolean4 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity0.getCompensateEventSubscriptions("hi!");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        int int4 = executionEntity0.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        executionEntity0.setTenantId("hi!");
        boolean boolean8 = executionEntity0.isProcessInstanceType();
        java.lang.String str9 = executionEntity0.getCurrentActivityName();
        java.lang.String str10 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList11 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        executionEntity0.setEventName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.createExecution();
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        boolean boolean6 = executionEntity0.isActive();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = executionEntity0.isActive("hi!");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList6 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = executionEntity0.getActivity();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.lang.String str4 = executionEntity0.getBusinessKey();
        executionEntity0.setEventName("ProcessInstance[ProcessInstance[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList7 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
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
        java.lang.String str17 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList4 = executionEntity0.getJobs();
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
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
        java.lang.String str14 = executionEntity0.getBusinessKey();
        boolean boolean15 = executionEntity0.isProcessInstanceType();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList17 = executionEntity0.getCompensateEventSubscriptions("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 7);
        executionEntity0.setBusinessKey("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity5.findExecution("ProcessInstance[]");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        executionEntity0.setRevision((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
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
        boolean boolean15 = executionEntity0.isEventScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList17 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[ProcessInstance[null]]");
        java.lang.String str18 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        executionEntity0.setTenantId("hi!");
        boolean boolean7 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        java.lang.String str5 = executionEntity0.getActivityId();
        java.lang.String str6 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity9 = executionEntity0.involveUser("ScopeExecution[null]", "");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        java.lang.String str2 = executionEntity0.getEventName();
        executionEntity0.inactivate();
        executionEntity0.setDeleteReason("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.findExecution("hi!");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList24 = executionEntity14.getCompensateEventSubscriptions("ProcessInstance[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity14.getSubProcessInstance();
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        executionEntity0.setTenantId("hi!");
        executionEntity0.setRevision((int) (byte) -1);
        java.lang.String str8 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[null]");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        java.lang.String str3 = executionEntity0.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        boolean boolean5 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList6 = executionEntity0.getJobs();
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        executionEntity0.setTenantId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList13 = executionEntity10.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList14 = executionEntity10.getEventSubscriptionsInternal();
        java.lang.String str15 = executionEntity10.getActivityId();
        boolean boolean16 = executionEntity10.isProcessInstanceType();
        executionEntity7.setSuperExecution(executionEntity10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity18.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl21 = executionEntity18.getActivity();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray22 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList23 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList23, variableInstanceEntityArray22);
        executionEntity18.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList23);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement26 = executionEntity18.getEventSource();
        executionEntity10.setSuperExecution(executionEntity18);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity28.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList31 = executionEntity28.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList32 = executionEntity28.getEventSubscriptionsInternal();
        java.lang.String str33 = executionEntity28.getActivityId();
        boolean boolean34 = executionEntity28.isProcessInstanceType();
        boolean boolean35 = executionEntity28.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity36.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity39 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity39.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList42 = executionEntity39.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList43 = executionEntity39.getEventSubscriptionsInternal();
        java.lang.String str44 = executionEntity39.getActivityId();
        boolean boolean45 = executionEntity39.isProcessInstanceType();
        executionEntity36.setSuperExecution(executionEntity39);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity47 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices48 = executionEntity47.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity49 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity49.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity52 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity52.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList55 = executionEntity52.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList56 = executionEntity52.getEventSubscriptionsInternal();
        java.lang.String str57 = executionEntity52.getActivityId();
        boolean boolean58 = executionEntity52.isProcessInstanceType();
        executionEntity49.setSuperExecution(executionEntity52);
        executionEntity47.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity52);
        java.util.Map<java.lang.String, java.lang.Object> strMap61 = executionEntity47.getProcessVariables();
        executionEntity39.setVariablesLocal(strMap61);
        executionEntity28.setVariables(strMap61);
        executionEntity18.setVariablesLocal(strMap61);
        executionEntity0.setVariables(strMap61);
        executionEntity0.setDeleteReason("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList68 = executionEntity0.getTasks();
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
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
        java.util.List<java.lang.String> strList11 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isConcurrent();
        executionEntity0.setActive(false);
        int int9 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityName();
        executionEntity0.setId("");
        int int4 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getBusinessKey();
        java.lang.String str8 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList13 = executionEntity10.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList14 = executionEntity10.getEventSubscriptionsInternal();
        executionEntity10.setConcurrent(true);
        java.lang.Object obj17 = executionEntity10.getPersistentState();
        executionEntity10.setBusinessKey("");
        executionEntity10.setTenantId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl22 = executionEntity10.getTransition();
        java.lang.String str23 = executionEntity10.getTenantId();
        java.lang.String str24 = executionEntity10.getDeleteReason();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList25 = executionEntity10.getEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList26 = executionEntity10.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
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
        boolean boolean14 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity17 = executionEntity0.addIdentityLink("ProcessInstance[ProcessInstance[null]]", "ScopeExecution[null]");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList40 = executionEntity15.getIdentityLinks();
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
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
        java.lang.String str11 = executionEntity0.updateProcessBusinessKey("hi!");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
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
        executionEntity15.setSuspensionState(1);
        boolean boolean32 = executionEntity15.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = executionEntity15.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity15.start();
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getProcessInstance();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity11.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList15 = executionEntity11.getEventSubscriptionsInternal();
        executionEntity11.setConcurrent(true);
        executionEntity11.setDeleteReason("");
        executionEntity11.setEventName("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = executionEntity11.getProcessInstance();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity24.setSuperExecution(executionEntity25);
        boolean boolean27 = executionEntity24.isEventScope();
        executionEntity24.inactivate();
        boolean boolean29 = executionEntity24.isEventScope();
        java.lang.String str30 = executionEntity24.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = executionEntity24.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
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
        java.lang.String str20 = executionEntity17.getBusinessKey();
        executionEntity17.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
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
        executionEntity0.setCachedEntityState((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getProcessInstance();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity11.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList15 = executionEntity11.getEventSubscriptionsInternal();
        executionEntity11.setConcurrent(true);
        executionEntity11.setDeleteReason("");
        executionEntity11.setEventName("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = executionEntity11.getProcessInstance();
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = executionEntity11.updateProcessBusinessKey("ProcessInstance[hi!]");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setRevision((int) (byte) 0);
        executionEntity0.setCachedEntityState((int) (short) 0);
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[null]");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
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
        org.activiti.engine.EngineServices engineServices45 = executionEntity0.getEngineServices();
        int int46 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList47 = executionEntity0.getJobs();
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = executionEntity0.isActive("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.Integer int8 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList9 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isActive();
        boolean boolean9 = executionEntity0.isEventScope();
        java.lang.Object obj10 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity5.getSubProcessInstance();
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("");
        executionEntity0.setTenantId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = executionEntity0.isActive("");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = executionEntity0.getQueryVariables();
        java.lang.String str6 = executionEntity0.getTenantId();
        java.lang.String str7 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        java.lang.Integer int8 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str9 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        java.lang.String str5 = executionEntity1.getProcessDefinitionId();
        java.lang.String str6 = executionEntity1.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity7.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity7.getEventSubscriptionsInternal();
        executionEntity7.setConcurrent(true);
        executionEntity7.setDeleteReason("");
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList16 = executionEntity7.getEventSubscriptionsInternal();
        executionEntity7.setSuspensionState((int) (short) -1);
        java.lang.String str19 = executionEntity7.getCurrentActivityId();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        int int21 = executionEntity7.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity7.destroyScope("ScopeExecution[null]");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity0.getEventSubscriptionsInternal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity22 = executionEntity0.addIdentityLink("hi!", "ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity78 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity78.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList81 = executionEntity78.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList82 = executionEntity78.getEventSubscriptionsInternal();
        java.lang.String str83 = executionEntity78.getActivityId();
        boolean boolean84 = executionEntity78.isProcessInstanceType();
        boolean boolean85 = executionEntity78.isEventScope();
        executionEntity78.forceUpdate();
        boolean boolean87 = executionEntity78.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("", (java.lang.Object) executionEntity78);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        executionEntity0.inactivate();
        java.lang.String str6 = executionEntity0.getActivityId();
        boolean boolean7 = executionEntity0.isScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptions();
        java.lang.String str9 = executionEntity0.getProcessInstanceId();
        java.lang.String str10 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        executionEntity0.inactivate();
        executionEntity0.setBusinessKey("");
        executionEntity0.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
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
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity13 = executionEntity0.involveUser("ScopeExecution[null]", "ConcurrentScopeExecution[null]");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isSuspended();
        java.lang.String str9 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList10 = executionEntity0.getJobs();
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList16 = executionEntity11.getCompensateEventSubscriptions();
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        executionEntity0.setProcessDefinitionId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setBusinessKey("ProcessInstance[ProcessInstance[null]]");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList11 = executionEntity0.getQueryVariables();
        boolean boolean12 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[null]");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        int int2 = executionEntity0.getRevision();
        java.lang.String str3 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity6 = executionEntity0.involveUser("hi!", "hi!");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        java.lang.String str4 = executionEntity0.getTenantId();
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
        executionEntity5.setSuspensionState(0);
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str33 = executionEntity5.getProcessBusinessKey();
        java.lang.String str34 = executionEntity5.getSuperExecutionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices36 = executionEntity35.getEngineServices();
        java.lang.String str37 = executionEntity35.getEventName();
        executionEntity35.inactivate();
        executionEntity35.setDeleteReason("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = executionEntity35.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity5.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity35);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList35 = executionEntity11.getEventSubscriptionsInternal();
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        boolean boolean4 = executionEntity1.isActive();
        java.lang.String str5 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement6 = executionEntity1.getEventSource();
        executionEntity1.setProcessDefinitionId("ProcessInstance[ProcessInstance[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity1.getProcessBusinessKey();
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setEventScope(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getSuperExecution();
        java.lang.String str9 = executionEntity1.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.insert();
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity25.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList28 = executionEntity25.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList29 = executionEntity25.getEventSubscriptionsInternal();
        java.lang.String str30 = executionEntity25.getActivityId();
        boolean boolean31 = executionEntity25.isProcessInstanceType();
        java.lang.String str32 = executionEntity25.getDeleteReason();
        java.lang.String str33 = executionEntity25.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity34.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList37 = executionEntity34.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList38 = executionEntity34.getEventSubscriptionsInternal();
        java.lang.String str39 = executionEntity34.getActivityId();
        boolean boolean40 = executionEntity34.isProcessInstanceType();
        boolean boolean41 = executionEntity34.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity42.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity45 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity45.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList48 = executionEntity45.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList49 = executionEntity45.getEventSubscriptionsInternal();
        java.lang.String str50 = executionEntity45.getActivityId();
        boolean boolean51 = executionEntity45.isProcessInstanceType();
        executionEntity42.setSuperExecution(executionEntity45);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity53 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices54 = executionEntity53.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity55 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity55.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity58 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity58.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList61 = executionEntity58.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList62 = executionEntity58.getEventSubscriptionsInternal();
        java.lang.String str63 = executionEntity58.getActivityId();
        boolean boolean64 = executionEntity58.isProcessInstanceType();
        executionEntity55.setSuperExecution(executionEntity58);
        executionEntity53.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity58);
        java.util.Map<java.lang.String, java.lang.Object> strMap67 = executionEntity53.getProcessVariables();
        executionEntity45.setVariablesLocal(strMap67);
        executionEntity34.setVariables(strMap67);
        executionEntity25.setVariables(strMap67);
        executionEntity0.setVariables(strMap67);
        executionEntity0.setParentId("ProcessInstance[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList75 = executionEntity0.getCompensateEventSubscriptions("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
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
        boolean boolean15 = executionEntity0.isActive("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = executionEntity0.getActivity();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray4 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5, variableInstanceEntityArray4);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList5);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.inactivate();
        org.activiti.engine.EngineServices engineServices2 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = executionEntity0.isActive("ProcessInstance[]");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
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
        java.lang.String str13 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList5 = executionEntity0.getJobs();
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList21 = executionEntity11.getJobs();
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity5.findExecution("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
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
        boolean boolean18 = executionEntity0.isActive("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
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
        boolean boolean15 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement16 = executionEntity0.getEventSource();
        executionEntity0.setParentId("ProcessInstance[hi!]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList19 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getEventName();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        executionEntity1.setRevision((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity1.getCompensateEventSubscriptions();
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean41 = executionEntity15.isActive("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        boolean boolean8 = executionEntity0.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList11 = executionEntity0.getCompensateEventSubscriptions("hi!");
        org.activiti.engine.impl.javax.el.ELContext eLContext12 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
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
        java.lang.String str49 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        boolean boolean5 = executionEntity0.isEnded();
        executionEntity0.setEventName("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.addIdentityLink("ScopeExecution[null]", "ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.disposeStartingExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getParent();
        java.lang.String str8 = executionEntity0.getBusinessKey();
        java.lang.String str9 = executionEntity0.getProcessInstanceId();
        int int10 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList11 = executionEntity0.getJobs();
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
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
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity31 = executionEntity11.addIdentityLink("hi!", "ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        java.lang.String str4 = executionEntity0.getTenantId();
        java.lang.String str5 = executionEntity0.getEventName();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.setProcessDefinitionId("");
        org.activiti.engine.EngineServices engineServices9 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList10 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransition();
        int int5 = executionEntity0.getRevision();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransition();
        java.lang.String str7 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[hi!]");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        executionEntity0.setActive(true);
        executionEntity0.setScope(false);
        boolean boolean8 = executionEntity0.isSuspended();
        java.lang.String str9 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList9 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuperExecution(executionEntity1);
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity1.getCachedElContext();
        int int4 = executionEntity1.getCachedEntityState();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setSuspensionState((int) (short) 0);
        executionEntity1.setParentId("");
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 100);
        java.lang.String str12 = executionEntity1.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.destroyScope("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        executionEntity0.setConcurrent(true);
        int int7 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isSuspended();
        int int8 = executionEntity0.getRevision();
        java.lang.String str9 = executionEntity0.getCurrentActivityId();
        executionEntity0.setProcessDefinitionId("hi!");
        int int12 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[null]");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
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
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl12 = executionEntity5.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity5.destroyScope("ProcessInstance[hi!]");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("");
        int int3 = executionEntity0.getRevisionNext();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        executionEntity0.setScope(false);
        executionEntity0.setRevision((int) (byte) 10);
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
        boolean boolean22 = executionEntity9.isSuspended();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity23.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList26 = executionEntity23.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList27 = executionEntity23.getEventSubscriptionsInternal();
        java.lang.String str28 = executionEntity23.getActivityId();
        boolean boolean29 = executionEntity23.isProcessInstanceType();
        boolean boolean30 = executionEntity23.isEventScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity31.setCachedEntityState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity34.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList37 = executionEntity34.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList38 = executionEntity34.getEventSubscriptionsInternal();
        java.lang.String str39 = executionEntity34.getActivityId();
        boolean boolean40 = executionEntity34.isProcessInstanceType();
        executionEntity31.setSuperExecution(executionEntity34);
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
        executionEntity34.setVariablesLocal(strMap56);
        executionEntity23.setVariables(strMap56);
        executionEntity9.setVariablesLocal(strMap56);
        executionEntity0.createVariablesLocal(strMap56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList61 = executionEntity0.getExecutions();
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
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
        java.lang.String str19 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setCachedEntityState((int) (short) 100);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptionsInternal();
        java.lang.String str5 = executionEntity0.getActivityId();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        boolean boolean7 = executionEntity0.isEventScope();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setBusinessKey("");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList12 = executionEntity9.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setBusinessKey("");
        int int16 = executionEntity13.getRevisionNext();
        boolean boolean17 = executionEntity13.isProcessInstanceType();
        executionEntity13.setScope(false);
        executionEntity13.setRevision((int) (byte) 10);
        executionEntity9.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity9.start();
    }
}

