import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = executionEntity0.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList1 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        executionEntity0.setTenantId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = executionEntity0.updateProcessBusinessKey("ProcessInstance[]");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isConcurrent();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = executionEntity0.isActive("ProcessInstance[]");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isSuspended();
        boolean boolean4 = executionEntity0.isSuspended();
        executionEntity0.setRevision(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions("");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isConcurrent();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.createExecution();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isSuspended();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setTenantId("ProcessInstance[null]");
        executionEntity0.setDeleteReason("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isSuspended();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setTenantId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions("ScopeExecution[null]");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isSuspended();
        boolean boolean4 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getProcessInstanceId();
        boolean boolean5 = executionEntity3.isConcurrent();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity3.getProcessVariables();
        executionEntity0.setVariables(strMap6);
        executionEntity0.setCachedEntityState((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity12 = executionEntity0.involveUser("ScopeExecution[null]", "ScopeExecution[null]");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = executionEntity0.isActive("");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isSuspended();
        boolean boolean4 = executionEntity0.isSuspended();
        executionEntity0.setRevision(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        executionEntity0.setTenantId("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[]");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList2 = executionEntity0.getQueryVariables();
        executionEntity0.setId("ProcessInstance[hi!]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        java.lang.String str3 = executionEntity0.getActivityId();
        executionEntity0.setRevision((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[hi!]");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isEnded();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList4 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = executionEntity0.updateProcessBusinessKey("ScopeExecution[null]");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getProcessInstance();
        executionEntity0.setId("ScopeExecution[null]");
        executionEntity0.setSuspensionState(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        executionEntity0.setEventName("ProcessInstance[hi!]");
        executionEntity0.setId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.updateProcessBusinessKey("hi!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList2 = executionEntity0.getQueryVariables();
        java.lang.Object obj3 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.findExecution("ProcessInstance[hi!]");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isSuspended();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setTenantId("ProcessInstance[null]");
        java.lang.String str7 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.involveUser("", "hi!");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isEnded();
        int int3 = executionEntity0.getCachedEntityState();
        java.lang.String str4 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList5 = executionEntity0.getExecutions();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.toString();
        java.lang.String str2 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList3 = executionEntity0.getExecutions();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = executionEntity0.isActive("");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isSuspended();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setTenantId("ProcessInstance[null]");
        java.lang.String str7 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[null]");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isEnded();
        int int3 = executionEntity0.getCachedEntityState();
        executionEntity0.setEventName("ProcessInstance[null]");
        executionEntity0.setActive(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList8 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isConcurrent();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = executionEntity0.getProcessVariables();
        java.lang.String str4 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList5 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isConcurrent();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = executionEntity0.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        executionEntity0.setTenantId("");
        executionEntity0.setParentId("hi!");
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[null]");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isEnded();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setProcessDefinitionId("hi!");
        executionEntity0.setProcessDefinitionId("ProcessInstance[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList8 = executionEntity0.getTasks();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList4 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isEnded();
        int int3 = executionEntity0.getCachedEntityState();
        java.lang.String str4 = executionEntity0.getId();
        boolean boolean5 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isEnded();
        int int3 = executionEntity0.getCachedEntityState();
        executionEntity0.setEventName("ProcessInstance[null]");
        executionEntity0.setActive(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        java.lang.String str3 = executionEntity0.getActivityId();
        executionEntity0.setActive(false);
        java.lang.String str6 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList7 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        executionEntity0.setTenantId("");
        java.lang.String str4 = executionEntity0.getEventName();
        java.lang.String str5 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isEnded();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList4 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getProcessInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList4 = executionEntity0.getJobs();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getProcessInstance();
        executionEntity0.setId("ScopeExecution[null]");
        executionEntity0.setTenantId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isConcurrent();
        boolean boolean4 = executionEntity0.isConcurrent();
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getProcessInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        java.lang.String str3 = executionEntity0.getSuperExecutionId();
        executionEntity0.setProcessDefinitionId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.toString();
        boolean boolean2 = executionEntity0.isConcurrent();
        boolean boolean3 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.findExecution("ProcessInstance[hi!]");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isSuspended();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setTenantId("ProcessInstance[null]");
        executionEntity0.setBusinessKey("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isSuspended();
        boolean boolean4 = executionEntity0.isSuspended();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList7 = executionEntity0.getJobs();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getProcessInstance();
        executionEntity0.setId("ScopeExecution[null]");
        executionEntity0.setTenantId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isConcurrent();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = executionEntity0.getProcessVariables();
        java.lang.String str4 = executionEntity0.getDeleteReason();
        boolean boolean5 = executionEntity0.isActive();
        java.lang.String str6 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity9 = executionEntity0.addIdentityLink("hi!", "");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isConcurrent();
        boolean boolean4 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity7 = executionEntity0.involveUser("hi!", "ScopeExecution[]");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isEnded();
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isConcurrent();
        boolean boolean4 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList5 = executionEntity0.getJobs();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isEnded();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList4 = executionEntity0.getQueryVariables();
        java.lang.String str5 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isConcurrent();
        boolean boolean3 = executionEntity0.isSuspended();
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.toString();
        boolean boolean2 = executionEntity0.isConcurrent();
        boolean boolean3 = executionEntity0.isEventScope();
        executionEntity0.setDeleteReason("");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.updateProcessBusinessKey("hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.toString();
        boolean boolean2 = executionEntity0.isConcurrent();
        boolean boolean3 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity6 = executionEntity0.involveUser("ScopeExecution[]", "ScopeExecution[]");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        int int4 = executionEntity0.getRevision();
        java.lang.String str5 = executionEntity0.getCurrentActivityName();
        boolean boolean6 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity9 = executionEntity0.involveUser("ProcessInstance[null]", "ProcessInstance[hi!]");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isSuspended();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setTenantId("ProcessInstance[null]");
        java.lang.String str7 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.findExecution("ProcessInstance[null]");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList2 = executionEntity0.getExecutions();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        java.lang.String str3 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList4 = executionEntity0.getJobs();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        executionEntity0.setTenantId("");
        executionEntity0.setParentId("hi!");
        int int6 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        int int4 = executionEntity0.getRevision();
        java.lang.String str5 = executionEntity0.getCurrentActivityName();
        boolean boolean6 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.updateProcessBusinessKey("");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isSuspended();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setTenantId("ProcessInstance[null]");
        executionEntity0.setBusinessKey("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        java.lang.String str3 = executionEntity0.getActivityId();
        executionEntity0.setRevision((int) 'a');
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement6 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isSuspended();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setTenantId("ProcessInstance[null]");
        java.lang.String str7 = executionEntity0.getProcessInstanceId();
        java.lang.String str8 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getProcessInstance();
        executionEntity0.setId("ScopeExecution[null]");
        executionEntity0.setTenantId("ProcessInstance[null]");
        executionEntity0.setDeleteReason("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.involveUser("ProcessInstance[]", "ConcurrentScopeExecution[null]");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isEnded();
        int int3 = executionEntity0.getCachedEntityState();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        executionEntity0.setTenantId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isEnded();
        int int3 = executionEntity0.getCachedEntityState();
        java.lang.String str4 = executionEntity0.getId();
        boolean boolean5 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isEnded();
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        java.lang.String str3 = executionEntity0.getActivityId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        java.lang.String str3 = executionEntity0.getActivityId();
        executionEntity0.setActive(false);
        java.lang.String str6 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isEnded();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setProcessDefinitionId("hi!");
        executionEntity0.setProcessDefinitionId("ProcessInstance[]");
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.involveUser("ScopeExecution[]", "ProcessInstance[null]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.toString();
        java.lang.String str2 = executionEntity0.getParentId();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = executionEntity0.isActive("ProcessInstance[ProcessInstance[]]");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.toString();
        java.lang.String str2 = executionEntity0.getParentId();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity0.getCompensateEventSubscriptions("ScopeExecution[ProcessInstance[hi!]]");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isSuspended();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setEventScope(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity0.getQueryVariables();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList9 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList2 = executionEntity0.getQueryVariables();
        java.lang.Object obj3 = executionEntity0.getPersistentState();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        java.lang.String str5 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getProcessInstance();
        executionEntity0.setId("ScopeExecution[null]");
        executionEntity0.setSuspensionState(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = executionEntity0.isActive("ProcessInstance[hi!]");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isConcurrent();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList6 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isConcurrent();
        boolean boolean4 = executionEntity0.isConcurrent();
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.findExecution("ScopeExecution[null]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList1 = executionEntity0.getQueryVariables();
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        executionEntity0.setTenantId("");
        java.lang.String str4 = executionEntity0.getEventName();
        java.lang.String str5 = executionEntity0.getCurrentActivityId();
        boolean boolean6 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = executionEntity0.isActive("ProcessInstance[null]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        java.lang.String str3 = executionEntity0.getActivityId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        boolean boolean5 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList6 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        int int4 = executionEntity0.getRevision();
        int int5 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = executionEntity0.updateProcessBusinessKey("ProcessInstance[ProcessInstance[]]");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        executionEntity0.setTenantId("");
        java.lang.String str4 = executionEntity0.getEventName();
        java.lang.String str5 = executionEntity0.getCurrentActivityId();
        boolean boolean6 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getProcessInstance();
        executionEntity0.setId("ScopeExecution[null]");
        executionEntity0.setTenantId("ProcessInstance[null]");
        executionEntity0.setDeleteReason("ScopeExecution[null]");
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList10 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        executionEntity0.setEventName("ProcessInstance[hi!]");
        java.lang.String str4 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList5 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.toString();
        java.lang.String str2 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList3 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isEventScope();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        boolean boolean6 = executionEntity0.isEnded();
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ScopeExecution[]");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isSuspended();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setTenantId("ProcessInstance[null]");
        executionEntity0.setBusinessKey("ScopeExecution[null]");
        int int9 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        int int4 = executionEntity0.getRevision();
        java.lang.String str5 = executionEntity0.getCurrentActivityName();
        java.lang.String str6 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList2 = executionEntity0.getQueryVariables();
        java.lang.Object obj3 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        java.lang.String str3 = executionEntity0.getSuperExecutionId();
        executionEntity0.setProcessDefinitionId("");
        executionEntity0.setSuspensionState(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList8 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isEnded();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setProcessDefinitionId("hi!");
        executionEntity0.setProcessDefinitionId("ProcessInstance[]");
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity0.getProcessVariables();
        boolean boolean9 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isSuspended();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setTenantId("ProcessInstance[null]");
        executionEntity0.setDeleteReason("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.createExecution();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isEnded();
        int int3 = executionEntity0.getCachedEntityState();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isEnded();
        int int3 = executionEntity0.getCachedEntityState();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.setConcurrent(true);
        boolean boolean7 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.involveUser("ConcurrentScopeExecution[null]", "ProcessInstance[ProcessInstance[]]");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isSuspended();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        executionEntity0.setEventName("ProcessInstance[hi!]");
        java.lang.String str4 = executionEntity0.getEventName();
        boolean boolean5 = executionEntity0.isDeleteRoot();
        executionEntity0.setBusinessKey("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.addIdentityLink("hi!", "ScopeExecution[]");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isConcurrent();
        boolean boolean3 = executionEntity0.isSuspended();
        executionEntity0.setActive(false);
        boolean boolean6 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList1 = executionEntity0.getQueryVariables();
        executionEntity0.setDeleteReason("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        executionEntity0.setTenantId("");
        executionEntity0.setParentId("hi!");
        java.lang.String str6 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getProcessInstance();
        executionEntity0.setId("ScopeExecution[null]");
        executionEntity0.setSuspensionState(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList7 = executionEntity0.getExecutions();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isSuspended();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.toString();
        boolean boolean2 = executionEntity0.isConcurrent();
        boolean boolean3 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        int int4 = executionEntity0.getRevision();
        java.lang.String str5 = executionEntity0.getCurrentActivityName();
        boolean boolean6 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList2 = executionEntity0.getQueryVariables();
        executionEntity0.setId("ProcessInstance[hi!]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[null]");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isConcurrent();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = executionEntity0.getProcessVariables();
        java.lang.String str4 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getCurrentActivityName();
        java.lang.String str3 = executionEntity0.getSuperExecutionId();
        java.lang.String str4 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[hi!]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isEnded();
        boolean boolean3 = executionEntity0.isEventScope();
        boolean boolean4 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = executionEntity0.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isSuspended();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setTenantId("ProcessInstance[null]");
        executionEntity0.setDeleteReason("hi!");
        java.lang.Integer int9 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.setId("ProcessInstance[hi!]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList2 = executionEntity0.getQueryVariables();
        java.lang.Object obj3 = executionEntity0.getPersistentState();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        executionEntity0.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.addIdentityLink("ProcessInstance[ProcessInstance[]]", "ProcessInstance[null]");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isSuspended();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setTenantId("ProcessInstance[null]");
        java.lang.String str7 = executionEntity0.getProcessInstanceId();
        int int8 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isEnded();
        int int3 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList4 = executionEntity0.getTasks();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        boolean boolean3 = executionEntity0.isConcurrent();
        boolean boolean4 = executionEntity0.isConcurrent();
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        java.lang.String str8 = executionEntity0.getBusinessKey();
        java.lang.String str9 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList10 = executionEntity0.getJobs();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        executionEntity0.setTenantId("");
        java.lang.String str4 = executionEntity0.getEventName();
        java.lang.String str5 = executionEntity0.getCurrentActivityId();
        java.lang.String str6 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        executionEntity0.setTenantId("");
        java.lang.String str4 = executionEntity0.getEventName();
        java.lang.String str5 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isEnded();
        int int3 = executionEntity0.getCachedEntityState();
        executionEntity0.setEventName("ProcessInstance[null]");
        int int6 = executionEntity0.getCachedEntityState();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList8 = executionEntity0.getExecutions();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList4 = executionEntity0.getCompensateEventSubscriptions("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.toString();
        boolean boolean2 = executionEntity0.isConcurrent();
        boolean boolean3 = executionEntity0.isEventScope();
        executionEntity0.setDeleteReason("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList6 = executionEntity0.getExecutions();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        java.lang.String str2 = executionEntity0.getEventName();
        java.lang.String str3 = executionEntity0.getActivityId();
        executionEntity0.setActive(false);
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.createExecution();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        boolean boolean2 = executionEntity0.isEnded();
        int int3 = executionEntity0.getCachedEntityState();
        java.lang.String str4 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isSuspended();
        executionEntity0.setEventName("ProcessInstance[hi!]");
        java.lang.String str4 = executionEntity0.getEventName();
        boolean boolean5 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getProcessInstanceId();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = executionEntity0.getProcessBusinessKey();
    }
}

