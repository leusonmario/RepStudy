import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isActive();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = executionEntity2.getActivity();
        java.lang.String str4 = executionEntity2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuspensionState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getId();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList7 = executionEntity0.getExecutions();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl1 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity0.getCompensateEventSubscriptions("hi!");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList2 = executionEntity0.getExecutions();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isActive();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl2 = executionEntity0.getTransition();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isActive();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl2 = executionEntity0.getTransition();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList5 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuspensionState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getId();
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList5 = executionEntity0.getJobs();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuspensionState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getId();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList6 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuspensionState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getId();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList6 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl1 = executionEntity0.getActivity();
        java.lang.String str2 = executionEntity0.toString();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList4 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuspensionState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getId();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl1 = executionEntity0.getActivity();
        java.lang.String str2 = executionEntity0.toString();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.createExecution();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuspensionState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getId();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl1 = executionEntity0.getActivity();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setParentId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList5 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuspensionState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = executionEntity0.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuspensionState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getId();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuspensionState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getId();
        java.lang.String str4 = executionEntity0.getCurrentActivityName();
        executionEntity0.setBusinessKey("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isActive();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl2 = executionEntity0.getTransition();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList4 = executionEntity0.getJobs();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuspensionState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getProcessInstance();
        executionEntity0.setEventName("ProcessInstance[ScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setBusinessKey("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.findExecution("ScopeExecution[null]");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuspensionState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getId();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList5 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isActive();
        executionEntity0.setBusinessKey("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList4 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuspensionState((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity5 = executionEntity0.addIdentityLink("", "ProcessInstance[]");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl1 = executionEntity0.getActivity();
        java.lang.String str2 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList3 = executionEntity0.getJobs();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuspensionState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getId();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isActive();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl2 = executionEntity0.getTransition();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isActive();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl2 = executionEntity0.getTransition();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement3 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity6 = executionEntity0.addIdentityLink("hi!", "ScopeExecution[ProcessInstance[null]]");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getProcessInstance();
        executionEntity0.setTenantId("ProcessInstance[null]");
        executionEntity0.setSuspensionState(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isActive();
        int int2 = executionEntity0.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList4 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isActive();
        int int2 = executionEntity0.getCachedEntityState();
        executionEntity0.setParentId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList5 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isActive();
        executionEntity0.setBusinessKey("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuspensionState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getId();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList5 = executionEntity0.getTasks();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isActive();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl2 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity5 = executionEntity0.addIdentityLink("ProcessInstance[hi!]", "hi!");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isActive();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl2 = executionEntity0.getTransition();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity0.setProcessDefinitionId("ProcessInstance[hi!]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setSuspensionState((int) (short) 100);
        java.lang.String str3 = executionEntity0.getId();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isActive();
        int int2 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = executionEntity0.isActive("ScopeExecution[ProcessInstance[null]]");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isActive();
        executionEntity0.setEventName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isActive();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl2 = executionEntity0.getTransition();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl1 = executionEntity0.getActivity();
        java.lang.String str2 = executionEntity0.toString();
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity0.getCachedElContext();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList5 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl1 = executionEntity0.getActivity();
        java.lang.String str2 = executionEntity0.toString();
        org.activiti.engine.impl.javax.el.ELContext eLContext3 = executionEntity0.getCachedElContext();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList5 = executionEntity0.getIdentityLinks();
    }
}

