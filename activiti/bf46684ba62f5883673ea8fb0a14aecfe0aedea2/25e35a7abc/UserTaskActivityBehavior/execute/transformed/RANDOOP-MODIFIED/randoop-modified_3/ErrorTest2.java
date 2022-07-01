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
        int int14 = executionEntity1.getRevisionNext();
        executionEntity1.setId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.deleteCascade("");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        java.lang.String str6 = executionEntity0.getCurrentActivityId();
        executionEntity0.setParentId("hi!");
        java.lang.String str9 = executionEntity0.getParentId();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList11 = executionEntity0.getJobs();
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isProcessInstanceType();
        executionEntity0.setParentId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList4 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        executionEntity0.setRevision((int) '#');
        executionEntity0.setName("ProcessInstance[ScopeExecution[null]]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.createExecution();
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity5.getProcessVariables();
        executionEntity0.setVariables(strMap6);
        java.lang.String str8 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = executionEntity0.getProcessVariables();
        java.lang.String str2 = executionEntity0.getProcessDefinitionId();
        java.lang.String str3 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        executionEntity0.setSuspensionState((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        boolean boolean5 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList6 = executionEntity0.getJobs();
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        java.lang.String str8 = executionEntity1.getBusinessKey();
        boolean boolean9 = executionEntity1.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.removeIdentityLinks();
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
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
        executionEntity0.setParentId("ConcurrentScopeExecution[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList8 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList6 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getSuperExecution();
        boolean boolean4 = executionEntity1.isConcurrent();
        org.activiti.engine.EngineServices engineServices5 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity1.getActivity();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity1.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList8 = executionEntity1.getExecutions();
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getActivityId();
        java.lang.String str6 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList7 = executionEntity0.getExecutions();
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        executionEntity0.setTenantId("");
        executionEntity0.setBusinessKey("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity12 = executionEntity0.involveUser("ConcurrentScopeExecution[]", "ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.setConcurrent(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity0.getActivity();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isProcessInstanceType();
        java.lang.Object obj2 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str6 = executionEntity0.getId();
        boolean boolean7 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = executionEntity0.isActive("ConcurrentScopeExecution[]");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        executionEntity0.setEventName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList9 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
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
        executionEntity8.remove();
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("");
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = executionEntity1.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.removeIdentityLinks();
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity1.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getSubProcessInstance();
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
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
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl21 = executionEntity0.getTransition();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList23 = executionEntity0.getJobs();
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setProcessDefinitionId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.forceUpdate();
        executionEntity0.setRevision((-1));
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        java.lang.String str14 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = executionEntity0.updateProcessBusinessKey("hi!");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
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
        executionEntity0.setCachedEntityState((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity0.getActivity();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransition();
        boolean boolean9 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList10 = executionEntity0.getExecutions();
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isEventScope();
        executionEntity0.setCachedEntityState((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
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
        int int17 = executionEntity15.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = executionEntity15.findActiveActivityIds();
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
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
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = executionEntity8.getTransition();
        int int14 = executionEntity8.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList15 = executionEntity8.getTasks();
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
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
        executionEntity1.setName("");
        boolean boolean17 = executionEntity1.isConcurrent();
        java.lang.String str18 = executionEntity1.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList19 = executionEntity1.getCompensateEventSubscriptions();
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = executionEntity5.findExecution("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str6 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList7 = executionEntity0.getExecutions();
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setEventScope(true);
        executionEntity0.setActive(true);
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        executionEntity0.setRevision((int) '4');
        executionEntity0.forceUpdate();
        boolean boolean11 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ConcurrentScopeExecution[]");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.setConcurrent(true);
        executionEntity0.setName("hi!");
        executionEntity0.setEventName("ProcessInstance[null]");
        boolean boolean11 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList12 = executionEntity0.getTasks();
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        int int16 = executionEntity14.getRevisionNext();
        org.activiti.engine.EngineServices engineServices17 = executionEntity14.getEngineServices();
        executionEntity14.setScope(false);
        int int20 = executionEntity14.getRevision();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        java.lang.String str22 = executionEntity0.getActivityId();
        java.lang.String str23 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList24 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        java.lang.String str8 = executionEntity0.getCurrentActivityName();
        boolean boolean9 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList10 = executionEntity0.getTasks();
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
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
        executionEntity0.setEventName("hi!");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution16 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList17 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
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
        java.lang.String str16 = executionEntity0.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity10.initialize();
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        java.lang.String str8 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
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
        java.lang.String str12 = executionEntity0.updateProcessBusinessKey("ConcurrentScopeExecution[]");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        boolean boolean7 = executionEntity0.isEventScope();
        java.lang.String str8 = executionEntity0.getParentId();
        java.lang.String str9 = executionEntity0.getCurrentActivityId();
        executionEntity0.setCachedEntityState((-1));
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList13 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getProcessInstance();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        org.activiti.engine.EngineServices engineServices6 = executionEntity0.getEngineServices();
        java.lang.String str7 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.addIdentityLink("ProcessInstance[ScopeExecution[null]]", "");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
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
        executionEntity5.setId("ScopeExecution[null]");
        java.lang.String str20 = executionEntity5.toString();
        java.lang.Integer int21 = executionEntity5.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = executionEntity5.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity25 = executionEntity5.involveUser("Execution[null]", "ScopeExecution[null]");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
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
        executionEntity5.setCachedEntityState((int) 'a');
        java.lang.String str21 = executionEntity5.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity5.initialize();
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity10.getSuperExecution();
        java.lang.String str17 = executionEntity10.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity20 = executionEntity10.addIdentityLink("Execution[null]", "ConcurrentScopeExecution[]");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity11.end();
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str7 = executionEntity0.getEventName();
        boolean boolean8 = executionEntity0.isEventScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
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
        executionEntity0.initialize();
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        executionEntity0.setRevision((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList8 = executionEntity0.getJobs();
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
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
        java.lang.String str16 = executionEntity10.getBusinessKey();
        executionEntity10.setDeleteReason("ScopeExecution[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity10.removeIdentityLinks();
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
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
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl33 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
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
        executionEntity1.setName("");
        java.lang.String str17 = executionEntity1.getEventName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity1.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity1.getParent();
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setEventScope(true);
        int int7 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        java.lang.String str5 = executionEntity1.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.insert();
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
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
        java.lang.String str12 = executionEntity0.getTenantId();
        executionEntity0.setConcurrent(false);
        boolean boolean15 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList16 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
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
        java.lang.String str23 = executionEntity0.getBusinessKey();
        executionEntity0.setName("ProcessInstance[ScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList26 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity10.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = executionEntity10.updateProcessBusinessKey("Execution[null]");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setEventScope(true);
        executionEntity0.setActive(true);
        boolean boolean7 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        boolean boolean5 = executionEntity0.isConcurrent();
        boolean boolean6 = executionEntity0.isEnded();
        java.lang.String str7 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.updateProcessBusinessKey("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str7 = executionEntity0.getEventName();
        boolean boolean8 = executionEntity0.isEventScope();
        int int9 = executionEntity0.getRevisionNext();
        java.lang.String str10 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity0.getSubProcessInstance();
        boolean boolean26 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList27 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getProcessInstance();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions("ScopeExecution[null]");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
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
        executionEntity0.setName("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
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
        java.lang.String str26 = executionEntity12.updateProcessBusinessKey("ProcessInstance[]");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
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
        executionEntity10.setRevision((-1));
        boolean boolean23 = executionEntity10.isProcessInstanceType();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl24 = executionEntity10.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity27 = executionEntity10.involveUser("hi!", "hi!");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        executionEntity1.setScope(false);
        executionEntity1.setParentId("ProcessInstance[null]");
        java.lang.String str9 = executionEntity1.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        executionEntity10.setBusinessKey("");
        java.lang.Integer int15 = executionEntity10.getExecutionListenerIndex();
        executionEntity10.forceUpdate();
        executionEntity10.setTenantId("ScopeExecution[null]");
        executionEntity10.setEventScope(true);
        boolean boolean21 = executionEntity10.isEventScope();
        executionEntity10.setEventName("");
        org.activiti.engine.EngineServices engineServices24 = executionEntity10.getEngineServices();
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = executionEntity10.getProcessVariables();
        executionEntity1.createVariablesLocal(strMap25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.destroy();
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList22 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setEventName("ScopeExecution[null]");
        executionEntity0.setId("ProcessInstance[ScopeExecution[null]]");
        boolean boolean9 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = executionEntity0.isActive("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setScope(false);
        int int8 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setScope(false);
        int int8 = executionEntity0.getSuspensionState();
        java.lang.Object obj9 = executionEntity0.getPersistentState();
        executionEntity0.setConcurrent(true);
        boolean boolean12 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList13 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        executionEntity1.setDeleteReason("ProcessInstance[null]");
        java.lang.String str6 = executionEntity1.getName();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity1.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity1.findExecution("hi!");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
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
        boolean boolean12 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList13 = executionEntity0.getJobs();
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.inactivate();
        java.lang.Object obj8 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getSuperExecution();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
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
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = executionEntity8.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList15 = executionEntity8.getCompensateEventSubscriptions("hi!");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        java.lang.String str6 = executionEntity0.getCurrentActivityId();
        executionEntity0.setParentId("hi!");
        java.lang.String str9 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = executionEntity0.getActivity();
        int int11 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity0.setRevision((int) (byte) 100);
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = executionEntity0.updateProcessBusinessKey("ScopeExecution[]");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getParent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.addIdentityLink("hi!", "ConcurrentScopeExecution[]");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
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
        executionEntity0.insert();
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("");
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = executionEntity1.getProcessVariables();
        executionEntity1.setId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.removeIdentityLinks();
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
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
        boolean boolean18 = executionEntity8.isEventScope();
        java.lang.String str19 = executionEntity8.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity8.start();
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setScope(false);
        int int8 = executionEntity0.getSuspensionState();
        java.lang.Object obj9 = executionEntity0.getPersistentState();
        executionEntity0.setConcurrent(true);
        boolean boolean12 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        java.lang.String str8 = executionEntity1.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity1.getEventSubscriptions();
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
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
        executionEntity0.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
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
        executionEntity0.initialize();
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
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
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getProcessInstance();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity0.getTransition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl8 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ScopeExecution[null]");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.String str5 = executionEntity0.getEventName();
        java.lang.String str6 = executionEntity0.getName();
        int int7 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
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
        java.lang.Object obj22 = executionEntity12.getPersistentState();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl23 = executionEntity12.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity26 = executionEntity12.involveUser("ProcessInstance[]", "hi!");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution2 = executionEntity0.getStartingExecution();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        boolean boolean5 = executionEntity0.isSuspended();
        executionEntity0.setProcessDefinitionId("");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList8 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ScopeExecution[]");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setEventScope(true);
        java.lang.String str5 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setRevision((int) (byte) 100);
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList10 = executionEntity0.getExecutions();
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        boolean boolean7 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = executionEntity0.isActive("");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution2 = executionEntity0.getStartingExecution();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.createExecution();
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        java.lang.String str8 = executionEntity0.getCurrentActivityName();
        executionEntity0.setActive(true);
        boolean boolean11 = executionEntity0.isEventScope();
        executionEntity0.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList14 = executionEntity0.getJobs();
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
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
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 7);
        java.lang.String str21 = executionEntity8.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity8.deleteCascade("ScopeExecution[]");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
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
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl21 = executionEntity11.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList22 = executionEntity11.getEventSubscriptionsInternal();
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        boolean boolean6 = executionEntity3.isConcurrent();
        java.lang.String str7 = executionEntity3.getId();
        executionEntity0.setSuperExecution(executionEntity3);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setActive(true);
        executionEntity0.setProcessDefinitionId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList14 = executionEntity0.getExecutions();
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
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
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl21 = executionEntity11.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = executionEntity11.getProcessBusinessKey();
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
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
        executionEntity10.disposeStartingExecution();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = executionEntity10.getProcessVariables();
        executionEntity10.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = executionEntity10.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getName();
        java.lang.String str8 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
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
        executionEntity0.setDeleteReason("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
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
        int int18 = executionEntity5.getRevisionNext();
        java.lang.String str19 = executionEntity5.getProcessDefinitionId();
        executionEntity5.setSuspensionState((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = executionEntity5.findExecution("");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setCachedEntityState(0);
        java.lang.String str5 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str7 = executionEntity0.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList9 = executionEntity0.getExecutions();
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.String str5 = executionEntity0.getEventName();
        java.lang.String str6 = executionEntity0.getName();
        int int7 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getProcessInstance();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity0.getTransition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl8 = executionEntity0.getProcessDefinition();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList11 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity0.findExecution("ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setProcessDefinitionId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.forceUpdate();
        executionEntity0.setRevision((-1));
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        java.lang.String str14 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setEventScope(true);
        executionEntity0.setActive(true);
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        boolean boolean8 = executionEntity0.isActive();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList8 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList16 = executionEntity1.getCompensateEventSubscriptions("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        executionEntity0.setParentId("ScopeExecution[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.createExecution();
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity14.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        boolean boolean17 = executionEntity14.isConcurrent();
        executionEntity14.setEventScope(true);
        executionEntity14.setTenantId("");
        executionEntity14.setBusinessKey("ScopeExecution[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = executionEntity14.getProcessVariables();
        executionEntity0.setVariablesLocal(strMap24);
        executionEntity0.setConcurrent(true);
        boolean boolean28 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = executionEntity0.createExecution();
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList11 = executionEntity1.getExecutions();
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList11 = executionEntity0.getQueryVariables();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
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
        java.util.List<java.lang.String> strList9 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
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
        executionEntity19.setBusinessKey("ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity33 = executionEntity19.addIdentityLink("ProcessInstance[ScopeExecution[null]]", "ConcurrentScopeExecution[]");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        executionEntity0.setConcurrent(false);
        java.lang.String str5 = executionEntity0.getProcessDefinitionId();
        boolean boolean6 = executionEntity0.isActive();
        executionEntity0.setRevision((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = executionEntity0.updateProcessBusinessKey("ScopeExecution[]");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        java.lang.String str7 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str9 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList10 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        boolean boolean7 = executionEntity0.isConcurrent();
        java.lang.String str8 = executionEntity0.getSuperExecutionId();
        executionEntity0.setName("hi!");
        java.lang.String str11 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity14 = executionEntity0.involveUser("hi!", "ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
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
        boolean boolean20 = executionEntity11.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = executionEntity11.updateProcessBusinessKey("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        java.lang.String str11 = executionEntity0.toString();
        int int12 = executionEntity0.getRevisionNext();
        boolean boolean13 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        int int16 = executionEntity14.getRevisionNext();
        org.activiti.engine.EngineServices engineServices17 = executionEntity14.getEngineServices();
        executionEntity14.setScope(false);
        int int20 = executionEntity14.getRevision();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        executionEntity14.setEventName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity14.insert();
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        java.lang.String str11 = executionEntity0.toString();
        boolean boolean12 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity0.createExecution();
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        java.lang.String str5 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList3 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setBusinessKey("hi!");
        executionEntity0.setBusinessKey("");
        executionEntity0.setEventScope(false);
        boolean boolean11 = executionEntity0.isScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList12 = executionEntity0.getQueryVariables();
        executionEntity0.setId("ProcessInstance[ScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
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
        boolean boolean17 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity0.createExecution();
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
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
        executionEntity0.setDeleteReason("");
        java.lang.String str16 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("Execution[null]");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
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
        java.lang.String str14 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity0.getStartingExecution();
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        java.lang.String str8 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
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
        executionEntity1.setId("");
        boolean boolean16 = executionEntity1.isSuspended();
        executionEntity1.setTenantId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = executionEntity1.isActive("Execution[null]");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
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
        boolean boolean26 = executionEntity9.isEventScope();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement27 = executionEntity9.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList28 = executionEntity9.findActiveActivityIds();
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity0.getActivity();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity0.getCachedElContext();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList7 = executionEntity1.getExecutions();
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
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
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = executionEntity0.getActivity();
        boolean boolean24 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList25 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
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
        java.lang.Integer int11 = executionEntity0.getExecutionListenerIndex();
        int int12 = executionEntity0.getSuspensionState();
        boolean boolean13 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement7 = executionEntity0.getEventSource();
        java.lang.Integer int8 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        int int10 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = executionEntity0.getProcessBusinessKey();
    }
}

