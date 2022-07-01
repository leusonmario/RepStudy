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
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        java.lang.String str3 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("", (java.lang.Object) (short) 0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList3 = executionEntity0.getExecutions();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.createExecution();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList3 = executionEntity0.getTasks();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList4 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.findExecution("hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        int int8 = executionEntity6.getRevisionNext();
        java.lang.Integer int9 = executionEntity6.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
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
        java.lang.String str16 = executionEntity0.updateProcessBusinessKey("");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList4 = executionEntity0.getTasks();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList15 = executionEntity9.getTasks();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList17 = executionEntity9.getJobs();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        java.lang.String str5 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        boolean boolean7 = executionEntity4.isActive();
        executionEntity4.setTenantId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList10 = executionEntity4.findActiveActivityIds();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity4.getCompensateEventSubscriptions();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.deleteCascade("hi!");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = executionEntity4.updateProcessBusinessKey("ScopeExecution[null]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        boolean boolean5 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        java.lang.String str3 = executionEntity0.getDeleteReason();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity0.getCompensateEventSubscriptions("");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity0.getCompensateEventSubscriptions("ScopeExecution[null]");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        executionEntity0.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getCurrentActivityId();
        boolean boolean5 = executionEntity3.isScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity3.insert();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        java.lang.String str4 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity4.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity4.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = executionEntity4.isActive("");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity9.insert();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        boolean boolean7 = executionEntity0.isConcurrent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList5 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions("hi!");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.setScope(true);
        executionEntity0.setCachedEntityState((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        executionEntity0.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.findExecution("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        boolean boolean5 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("hi!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList21 = executionEntity6.getJobs();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList12 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList3 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        boolean boolean7 = executionEntity0.isConcurrent();
        executionEntity0.setScope(true);
        boolean boolean10 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        java.lang.String str8 = executionEntity6.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str10 = executionEntity9.getCurrentActivityId();
        boolean boolean11 = executionEntity9.isScope();
        executionEntity6.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        boolean boolean6 = executionEntity0.isConcurrent();
        executionEntity0.setCachedEntityState(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        boolean boolean8 = executionEntity4.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.deleteCascade("ScopeExecution[null]");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList4 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.Integer int3 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        boolean boolean5 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        executionEntity4.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.start();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.createExecution();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        boolean boolean7 = executionEntity0.isConcurrent();
        executionEntity0.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getParent();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = executionEntity4.isActive("");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getCurrentActivityId();
        boolean boolean5 = executionEntity3.isScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity3.getEventSubscriptionsInternal();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl8 = executionEntity6.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity6.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("ConcurrentScopeExecution[null]", (java.lang.Object) executionEntity6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        executionEntity0.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.Integer int3 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity0.getProcessDefinition();
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.createExecution();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity1.getSuperExecution();
        executionEntity1.disposeStartingExecution();
        executionEntity1.setEventName("");
        executionEntity1.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userTaskActivityBehavior0.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = executionEntity4.updateProcessBusinessKey("ScopeExecution[null]");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        java.lang.String str3 = executionEntity0.getDeleteReason();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList5 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList4 = executionEntity0.getJobs();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity4.findExecution("ProcessInstance[null]");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = executionEntity0.isActive("ProcessInstance[null]");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.findExecution("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity23 = executionEntity0.addIdentityLink("ProcessInstance[ConcurrentScopeExecution[null]]", "ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity4.getCompensateEventSubscriptions();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = executionEntity4.getSubProcessInstance();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.setScope(true);
        java.lang.String str6 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        boolean boolean7 = executionEntity0.isConcurrent();
        executionEntity0.setScope(true);
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        java.lang.String str8 = executionEntity4.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity4.getCompensateEventSubscriptions("ProcessInstance[null]");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        executionEntity0.setId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = executionEntity0.isActive("hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        java.lang.String str8 = executionEntity4.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = executionEntity4.isActive("ScopeExecution[null]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList4 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList20 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity7 = executionEntity0.addIdentityLink("hi!", "hi!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList8 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        java.lang.String str4 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList5 = executionEntity0.getJobs();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList8 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.createExecution();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        java.lang.Object obj7 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList8 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        boolean boolean5 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList6 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.end();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        java.lang.String str3 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = executionEntity4.isActive("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.createExecution();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity0.getProcessDefinition();
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        executionEntity0.setScope(true);
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList8 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setParentId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList21 = executionEntity6.getCompensateEventSubscriptions();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        boolean boolean7 = executionEntity4.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.start();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.forceUpdate();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        boolean boolean6 = executionEntity0.isSuspended();
        org.activiti.engine.EngineServices engineServices7 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        boolean boolean5 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str8 = executionEntity0.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement9 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.findExecution("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList21 = executionEntity0.getJobs();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        boolean boolean6 = executionEntity0.isConcurrent();
        executionEntity0.setCachedEntityState(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity6.createExecution();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        executionEntity0.setTenantId("ConcurrentScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.involveUser("hi!", "ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.lang.String str6 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        java.lang.String str5 = executionEntity0.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getParent();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        executionEntity0.setRevision((int) (short) 1);
        java.lang.String str7 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList5 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity4.findExecution("ProcessInstance[null]");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList29 = executionEntity4.getEventSubscriptions();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList10 = executionEntity4.getIdentityLinks();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        java.lang.String str5 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList6 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        boolean boolean7 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList8 = executionEntity0.getExecutions();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.setScope(true);
        executionEntity0.setCachedEntityState((int) (byte) -1);
        java.lang.String str8 = executionEntity0.getCurrentActivityName();
        java.lang.String str9 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList11 = executionEntity4.getTasks();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        boolean boolean6 = executionEntity0.isConcurrent();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getProcessInstance();
        executionEntity0.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList7 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList7 = executionEntity0.getJobs();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        boolean boolean6 = executionEntity0.isConcurrent();
        executionEntity0.setCachedEntityState(10);
        java.lang.String str9 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList10 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setParentId("ScopeExecution[null]");
        executionEntity0.setParentId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        java.lang.String str3 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity4.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity4.getProcessDefinition();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.end();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        boolean boolean7 = executionEntity0.isConcurrent();
        executionEntity0.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        java.lang.String str5 = executionEntity0.getCurrentActivityId();
        executionEntity0.setParentId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = executionEntity0.isActive("hi!");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        java.lang.String str5 = executionEntity0.getParentId();
        executionEntity0.setParentId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = executionEntity6.isActive("");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity7 = executionEntity0.addIdentityLink("ScopeExecution[null]", "ProcessInstance[null]");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        java.lang.Object obj2 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity5 = executionEntity0.addIdentityLink("", "ScopeExecution[null]");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList7 = executionEntity0.getTasks();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getCurrentActivityId();
        boolean boolean5 = executionEntity3.isScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity3.getActivity();
        java.lang.String str8 = executionEntity3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity3.getEventSubscriptions();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        java.lang.String str8 = executionEntity0.getId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement9 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.forceUpdate();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        boolean boolean6 = executionEntity0.isSuspended();
        boolean boolean7 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList8 = executionEntity0.getJobs();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        boolean boolean8 = executionEntity4.isEventScope();
        executionEntity4.setParentId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList11 = executionEntity4.getCompensateEventSubscriptions();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity6.getCompensateEventSubscriptions("");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList4 = executionEntity0.getTasks();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        java.lang.String str5 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList6 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity16 = executionEntity0.addIdentityLink("ProcessInstance[null]", "");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = executionEntity0.updateProcessBusinessKey("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.createExecution();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.updateProcessBusinessKey("hi!");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList6 = executionEntity0.getTasks();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.end();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        java.lang.String str5 = executionEntity0.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getParent();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.involveUser("ConcurrentScopeExecution[null]", "ConcurrentScopeExecution[null]");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        executionEntity0.setActive(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList8 = executionEntity0.getExecutions();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity5 = executionEntity0.involveUser("ProcessInstance[ConcurrentScopeExecution[null]]", "");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList4 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        java.lang.String str5 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList7 = executionEntity0.getJobs();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getProcessInstance();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        java.lang.String str5 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList6 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = executionEntity0.isActive("ProcessInstance[null]");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        java.lang.String str3 = executionEntity0.getCurrentActivityName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity4.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity4.getProcessDefinition();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        executionEntity4.setParentId("ProcessInstance[ConcurrentScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList10 = executionEntity4.getJobs();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        boolean boolean5 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
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
        boolean boolean11 = executionEntity4.isDeleteRoot();
        int int12 = executionEntity4.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.destroyScope("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.end();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        java.lang.String str5 = executionEntity0.getActivityId();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.findExecution("ProcessInstance[null]");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        int int6 = executionEntity0.getSuspensionState();
        java.lang.String str7 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.addIdentityLink("ProcessInstance[ConcurrentScopeExecution[null]]", "");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        int int5 = executionEntity0.getRevision();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        java.lang.String str7 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList8 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity0.getStartingExecution();
        java.lang.String str5 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
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
        executionEntity4.deleteCascade("ScopeExecution[null]");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList19 = executionEntity0.getCompensateEventSubscriptions("hi!");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = executionEntity4.updateProcessBusinessKey("hi!");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList16 = executionEntity6.getIdentityLinks();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        executionEntity0.setId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        boolean boolean7 = executionEntity4.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList8 = executionEntity4.getIdentityLinks();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        boolean boolean5 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        boolean boolean7 = executionEntity4.isActive();
        boolean boolean8 = executionEntity4.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList9 = executionEntity4.getExecutions();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        java.lang.String str4 = executionEntity0.getBusinessKey();
        java.lang.String str5 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.createExecution();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList8 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
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
        executionEntity0.setSuspensionState((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        executionEntity0.setTenantId("ConcurrentScopeExecution[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity0.getEventSource();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList10 = executionEntity0.getJobs();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        java.lang.String str4 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        int int4 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        java.lang.String str5 = executionEntity0.getId();
        java.lang.String str6 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList23 = executionEntity6.getCompensateEventSubscriptions("hi!");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        executionEntity0.setId("");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution5 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList6 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList5 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        boolean boolean7 = executionEntity4.isActive();
        java.lang.String str8 = executionEntity4.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity4.involveUser("ScopeExecution[null]", "hi!");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = executionEntity18.findExecution("ScopeExecution[null]");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList13 = executionEntity4.getIdentityLinks();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setEventName("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList5 = executionEntity0.getJobs();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setParentId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getReplacedBy();
        java.lang.String str8 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList10 = executionEntity0.getTasks();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
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
        executionEntity6.initialize();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        executionEntity0.setScope(true);
        executionEntity0.setEventName("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList6 = executionEntity0.getJobs();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList3 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity0.getProcessVariables();
        boolean boolean7 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList8 = executionEntity0.getExecutions();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        boolean boolean7 = executionEntity0.isConcurrent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        boolean boolean10 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        java.lang.String str8 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
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
        executionEntity4.setConcurrent(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList14 = executionEntity4.getQueryVariables();
        java.lang.String str15 = executionEntity4.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList16 = executionEntity4.getEventSubscriptionsInternal();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        executionEntity0.setRevision((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        int int8 = executionEntity4.getSuspensionState();
        boolean boolean9 = executionEntity4.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity12 = executionEntity4.involveUser("", "ScopeExecution[null]");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.updateProcessBusinessKey("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        int int6 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        int int5 = executionEntity0.getRevision();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        java.lang.String str7 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.involveUser("ProcessInstance[ConcurrentScopeExecution[null]]", "");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        boolean boolean5 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str8 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("hi!");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList20 = executionEntity9.getCompensateEventSubscriptions("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        executionEntity0.setRevision((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        boolean boolean7 = executionEntity0.isConcurrent();
        executionEntity0.setScope(true);
        boolean boolean10 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList11 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.setScope(true);
        executionEntity0.setCachedEntityState((int) (byte) -1);
        java.lang.String str8 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList9 = executionEntity0.getExecutions();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = executionEntity0.isActive("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = executionEntity6.findActiveActivityIds();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList8 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity0.getStartingExecution();
        java.lang.String str9 = executionEntity0.getSuperExecutionId();
        org.activiti.engine.impl.javax.el.ELContext eLContext10 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.findExecution("ScopeExecution[null]");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        java.lang.String str5 = executionEntity0.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity14 = executionEntity4.addIdentityLink("ProcessInstance[null]", "");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList16 = executionEntity4.getJobs();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        executionEntity0.setTenantId("ConcurrentScopeExecution[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.involveUser("ProcessInstance[null]", "ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        executionEntity0.setActive(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getCurrentActivityId();
        boolean boolean5 = executionEntity3.isScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        executionEntity0.setSuspensionState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity0.getActivity();
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[null]");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.forceUpdate();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        boolean boolean6 = executionEntity0.isSuspended();
        org.activiti.engine.EngineServices engineServices7 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList8 = executionEntity0.getTasks();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList4 = executionEntity0.getExecutions();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        java.lang.String str3 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList4 = executionEntity0.getJobs();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        int int6 = executionEntity0.getSuspensionState();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 7);
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
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
        executionEntity4.end();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList3 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
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
        executionEntity0.insert();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        boolean boolean5 = executionEntity0.isEventScope();
        boolean boolean6 = executionEntity0.isEventScope();
        executionEntity0.setEventName("hi!");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution9 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity6.removeIdentityLinks();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        java.lang.String str4 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        int int4 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = executionEntity0.updateProcessBusinessKey("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        executionEntity0.setRevision(10);
        java.lang.String str10 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        executionEntity0.setRevision((int) (short) 1);
        java.lang.String str7 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        executionEntity0.setId("");
        executionEntity0.setActive(false);
        boolean boolean7 = executionEntity0.isScope();
        executionEntity0.setParentId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroy();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        java.lang.Object obj3 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = executionEntity0.updateProcessBusinessKey("hi!");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        java.lang.String str5 = executionEntity0.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getParent();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        executionEntity0.setEventName("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = executionEntity0.getEventSource();
        executionEntity0.setEventScope(false);
        org.activiti.engine.impl.javax.el.ELContext eLContext8 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.involveUser("ScopeExecution[null]", "ProcessInstance[null]");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = executionEntity4.getSubProcessInstance();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        boolean boolean5 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str8 = executionEntity0.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement9 = executionEntity0.getEventSource();
        java.lang.String str10 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity0.getProcessDefinition();
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        executionEntity0.setScope(true);
        executionEntity0.setActive(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("hi!");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList2 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        executionEntity0.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
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
        executionEntity6.setEventName("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity18 = executionEntity6.addIdentityLink("ProcessInstance[ConcurrentScopeExecution[null]]", "ProcessInstance[null]");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        boolean boolean5 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        java.lang.String str5 = executionEntity0.getActivityId();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity0.getProcessVariables();
        java.lang.String str7 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.findExecution("hi!");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
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
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = executionEntity0.getActivity();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.String str4 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = executionEntity0.isActive("");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = executionEntity4.findActiveActivityIds();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        executionEntity0.setId("");
        executionEntity0.setActive(false);
        boolean boolean7 = executionEntity0.isScope();
        executionEntity0.setParentId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        java.lang.String str5 = executionEntity0.getEventName();
        java.lang.String str6 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getProcessInstance();
        java.lang.String str8 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList9 = executionEntity0.getExecutions();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        executionEntity0.setSuspensionState((int) (short) 100);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity0.getActivity();
        org.activiti.engine.impl.javax.el.ELContext eLContext7 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        java.lang.Object obj3 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        boolean boolean7 = executionEntity0.isConcurrent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity0.setActive(true);
        executionEntity0.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity0.getProcessVariables();
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.forceUpdate();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[null]");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        executionEntity0.setCachedEntityState(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        boolean boolean5 = executionEntity0.isEventScope();
        boolean boolean6 = executionEntity0.isEventScope();
        executionEntity0.setEventName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.addIdentityLink("ConcurrentScopeExecution[null]", "hi!");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
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
        java.lang.String str12 = executionEntity4.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList13 = executionEntity4.getExecutions();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        java.lang.String str3 = executionEntity0.getDeleteReason();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity0.getStartingExecution();
        java.lang.String str5 = executionEntity0.getBusinessKey();
        java.lang.String str6 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList7 = executionEntity0.getExecutions();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        executionEntity0.setRevision((int) (short) 1);
        java.lang.String str7 = executionEntity0.toString();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        boolean boolean10 = executionEntity0.isEventScope();
        java.lang.String str11 = executionEntity0.toString();
        int int12 = executionEntity0.getRevisionNext();
        boolean boolean13 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList15 = executionEntity0.getCompensateEventSubscriptions("hi!");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[]");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        boolean boolean5 = executionEntity0.isEventScope();
        executionEntity0.setProcessDefinitionId("");
        boolean boolean8 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
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
        java.lang.String str13 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity16 = executionEntity0.involveUser("hi!", "");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        executionEntity0.setSuspensionState((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList5 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        int int8 = executionEntity4.getSuspensionState();
        executionEntity4.setSuspensionState((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity4.getEventSubscriptionsInternal();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList7 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
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
        java.lang.String str20 = executionEntity6.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = executionEntity21.getSuperExecution();
        java.lang.String str23 = executionEntity21.toString();
        boolean boolean24 = executionEntity21.isDeleteRoot();
        java.lang.String str25 = executionEntity21.getParentId();
        executionEntity21.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity6.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity9.removeIdentityLinks();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = executionEntity0.getEventSource();
        executionEntity0.setEventScope(false);
        org.activiti.engine.impl.javax.el.ELContext eLContext8 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions("");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity9.getSubProcessInstance();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        boolean boolean7 = executionEntity4.isActive();
        executionEntity4.setTenantId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity4.getEventSubscriptions();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        java.lang.String str3 = executionEntity0.getCurrentActivityName();
        java.lang.String str4 = executionEntity0.getParentId();
        java.lang.String str5 = executionEntity0.getSuperExecutionId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement6 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions("");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
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
        executionEntity6.start();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        boolean boolean4 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList20 = executionEntity6.findActiveActivityIds();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = executionEntity0.getEventSource();
        java.lang.String str6 = executionEntity0.toString();
        java.lang.String str7 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.addIdentityLink("ProcessInstance[ConcurrentScopeExecution[null]]", "ProcessInstance[]");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        int int5 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.findExecution("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity0.getProcessDefinition();
        executionEntity0.setCachedEntityState((-1));
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList10 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        boolean boolean5 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str8 = executionEntity0.getEventName();
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList10 = executionEntity0.getJobs();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity0.getCompensateEventSubscriptions("ConcurrentScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList15 = executionEntity0.getTasks();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isProcessInstanceType();
        executionEntity0.setEventName("ConcurrentScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        java.lang.String str5 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
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
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity24 = executionEntity0.involveUser("hi!", "ProcessInstance[]");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList24 = executionEntity0.getJobs();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.forceUpdate();
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        executionEntity0.setRevision((int) (short) 1);
        java.lang.String str7 = executionEntity0.toString();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        boolean boolean10 = executionEntity0.isEventScope();
        java.lang.String str11 = executionEntity0.toString();
        int int12 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = executionEntity0.updateProcessBusinessKey("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList8 = executionEntity0.getQueryVariables();
        java.lang.String str9 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.createExecution();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        boolean boolean5 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        java.lang.String str8 = executionEntity0.getEventName();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement9 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[null]");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.start();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setParentId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.createExecution();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        boolean boolean6 = executionEntity0.isConcurrent();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        boolean boolean6 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str6 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.updateProcessBusinessKey("hi!");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getCurrentActivityId();
        boolean boolean5 = executionEntity3.isScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity3.getActivity();
        java.lang.String str8 = executionEntity3.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity3.deleteCascade("ProcessInstance[null]");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        int int3 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList4 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList21 = executionEntity0.getTasks();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setSuspensionState((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        java.lang.String str5 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = executionEntity0.isActive("ProcessInstance[null]");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext4 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        executionEntity0.setActive(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.findExecution("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity6.getCompensateEventSubscriptions();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList18 = executionEntity9.getTasks();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList17 = executionEntity9.getEventSubscriptionsInternal();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
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
        executionEntity18.destroyScope("");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        java.lang.String str4 = executionEntity0.getParentId();
        java.lang.String str5 = executionEntity0.getCurrentActivityName();
        java.lang.String str6 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity9 = executionEntity0.involveUser("ProcessInstance[null]", "hi!");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList13 = executionEntity6.getCompensateEventSubscriptions("ScopeExecution[null]");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getCurrentActivityId();
        boolean boolean5 = executionEntity3.isScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        executionEntity0.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        java.lang.String str4 = executionEntity0.getParentId();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.String str4 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = executionEntity0.getEventSource();
        executionEntity0.setEventScope(false);
        org.activiti.engine.impl.javax.el.ELContext eLContext8 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList9 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity4.findExecution("ProcessInstance[]");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList5 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        boolean boolean4 = executionEntity0.isScope();
        executionEntity0.setDeleteReason("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        int int9 = executionEntity7.getRevisionNext();
        java.lang.String str10 = executionEntity7.getBusinessKey();
        org.activiti.engine.EngineServices engineServices11 = executionEntity7.getEngineServices();
        executionEntity7.setParentId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity7.getReplacedBy();
        java.lang.String str15 = executionEntity7.getCurrentActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl16 = executionEntity7.getTransition();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList18 = executionEntity7.getTasks();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setEventName("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setEventName("ScopeExecution[null]");
        boolean boolean5 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity8 = executionEntity0.addIdentityLink("", "ProcessInstance[]");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
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
        executionEntity4.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.start();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        int int4 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[]");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = executionEntity4.getProcessBusinessKey();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
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
        java.lang.String str21 = executionEntity6.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity6.deleteCascade("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        org.activiti.engine.EngineServices engineServices7 = executionEntity4.getEngineServices();
        int int8 = executionEntity4.getSuspensionState();
        boolean boolean9 = executionEntity4.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity4.getEventSubscriptions();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        java.lang.Object obj3 = executionEntity0.getPersistentState();
        executionEntity0.setBusinessKey("hi!");
        boolean boolean6 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
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
        executionEntity0.setSuspensionState((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = executionEntity0.isActive("ProcessInstance[]");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity7 = executionEntity0.involveUser("ScopeExecution[null]", "ConcurrentScopeExecution[null]");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        int int5 = executionEntity0.getRevision();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        java.lang.String str7 = executionEntity0.getId();
        executionEntity0.setProcessDefinitionId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList10 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        java.lang.String str4 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = executionEntity0.isActive("hi!");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
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
        executionEntity6.setBusinessKey("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList18 = executionEntity6.getIdentityLinks();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        executionEntity0.setRevision((int) (short) 1);
        boolean boolean7 = executionEntity0.isScope();
        boolean boolean8 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.findExecution("hi!");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        boolean boolean7 = executionEntity4.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.deleteCascade("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity0.getProcessDefinition();
        executionEntity0.setCachedEntityState((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        boolean boolean3 = executionEntity0.isEnded();
        java.lang.String str4 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[]");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList6 = executionEntity0.getJobs();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        boolean boolean5 = executionEntity0.isEventScope();
        boolean boolean6 = executionEntity0.isEventScope();
        executionEntity0.setEventName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
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
        java.lang.String str16 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        java.lang.Object obj8 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution9 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = executionEntity0.updateProcessBusinessKey("ProcessInstance[]");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getCurrentActivityId();
        boolean boolean5 = executionEntity3.isScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        executionEntity0.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
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
        java.lang.String str16 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        boolean boolean7 = executionEntity0.isConcurrent();
        executionEntity0.setScope(true);
        boolean boolean10 = executionEntity0.isActive();
        java.lang.String str11 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement12 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity18.createExecution();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.findExecution("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        java.lang.String str5 = executionEntity0.getEventName();
        java.lang.String str6 = executionEntity0.getBusinessKey();
        boolean boolean7 = executionEntity0.isSuspended();
        java.lang.String str8 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
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
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement13 = executionEntity4.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList14 = executionEntity4.getEventSubscriptions();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = executionEntity0.isActive("ProcessInstance[null]");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        boolean boolean7 = executionEntity0.isConcurrent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        executionEntity0.setActive(true);
        executionEntity0.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList14 = executionEntity0.getExecutions();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity4.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.insert();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.createExecution();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity0.getProcessVariables();
        java.lang.String str9 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList10 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions("");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList20 = executionEntity6.getIdentityLinks();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.updateProcessBusinessKey("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity0.getCompensateEventSubscriptions("ConcurrentScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
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
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl22 = executionEntity6.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList23 = executionEntity6.getEventSubscriptions();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        executionEntity0.setRevision((int) (short) 1);
        boolean boolean7 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList8 = executionEntity0.getExecutions();
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = executionEntity0.updateProcessBusinessKey("ScopeExecution[null]");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str5 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList6 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        java.lang.String str5 = executionEntity0.getId();
        java.lang.String str6 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList7 = executionEntity0.getJobs();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        java.lang.String str3 = executionEntity0.getDeleteReason();
        boolean boolean4 = executionEntity0.isDeleteRoot();
        executionEntity0.setParentId("ProcessInstance[ConcurrentScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getParent();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
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
        executionEntity4.insert();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity4.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.start();
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.deleteCascade("");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        executionEntity0.setId("");
        executionEntity0.setActive(false);
        java.lang.String str7 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity15.getSuperExecution();
        executionEntity15.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity15.getProcessInstance();
        executionEntity15.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = executionEntity15.getParent();
        boolean boolean21 = executionEntity15.isConcurrent();
        executionEntity15.setCachedEntityState(10);
        java.lang.String str24 = executionEntity15.getCurrentActivityId();
        boolean boolean25 = executionEntity15.isSuspended();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList27 = executionEntity15.getCompensateEventSubscriptions("ConcurrentScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("ProcessInstance[null]", (java.lang.Object) executionEntity15);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getProcessInstance();
        java.lang.Object obj6 = executionEntity0.getPersistentState();
        int int7 = executionEntity0.getCachedEntityState();
        boolean boolean8 = executionEntity0.isDeleteRoot();
        java.lang.String str9 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        java.lang.String str4 = executionEntity0.toString();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = executionEntity0.getQueryVariables();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement7 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = executionEntity0.isActive("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity0.getProcessVariables();
        java.lang.Integer int7 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList8 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity19 = executionEntity4.involveUser("", "ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
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
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution20 = executionEntity6.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = executionEntity6.getProcessBusinessKey();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity4.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList16 = executionEntity4.getIdentityLinks();
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList15 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
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
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl15 = executionEntity9.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList16 = executionEntity9.getTasks();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
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
        boolean boolean29 = executionEntity4.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList30 = executionEntity4.getJobs();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        executionEntity0.setRevision((int) (short) 1);
        java.lang.String str7 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.createExecution();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        java.lang.String str5 = executionEntity0.getId();
        java.lang.String str6 = executionEntity0.getActivityId();
        boolean boolean7 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        int int4 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList5 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        executionEntity0.setActive(true);
        int int6 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setParentId("ScopeExecution[null]");
        executionEntity0.setParentId("ProcessInstance[null]");
        int int9 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.findExecution("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity9.end();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
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
        java.util.List<java.lang.String> strList19 = executionEntity9.findActiveActivityIds();
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        boolean boolean4 = executionEntity0.isScope();
        executionEntity0.setDeleteReason("hi!");
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList8 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        boolean boolean5 = executionEntity0.isDeleteRoot();
        executionEntity0.setProcessDefinitionId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.involveUser("", "ScopeExecution[null]");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isDeleteRoot();
        java.lang.String str4 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity7 = executionEntity0.addIdentityLink("ProcessInstance[null]", "ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        int int4 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = executionEntity0.isActive("");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        java.lang.String str8 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setId("ProcessInstance[ConcurrentScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList11 = executionEntity4.getCompensateEventSubscriptions("");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
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
        executionEntity4.setConcurrent(false);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList14 = executionEntity4.getQueryVariables();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl15 = executionEntity4.getTransition();
        java.lang.String str16 = executionEntity4.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity4.findExecution("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getId();
        boolean boolean8 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.addIdentityLink("", "hi!");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity6.createExecution();
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
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
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement10 = executionEntity3.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList11 = executionEntity3.getIdentityLinks();
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        boolean boolean3 = executionEntity0.isEnded();
        executionEntity0.setDeleteReason("ProcessInstance[ConcurrentScopeExecution[null]]");
        executionEntity0.setParentId("ConcurrentScopeExecution[null]");
        java.lang.String str8 = executionEntity0.getParentId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity9.getSuperExecution();
        java.lang.String str11 = executionEntity9.toString();
        boolean boolean12 = executionEntity9.isDeleteRoot();
        java.lang.String str13 = executionEntity9.getParentId();
        executionEntity9.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.createExecution();
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
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
        executionEntity6.setEventName("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity6.createExecution();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        boolean boolean3 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = executionEntity0.isActive("ProcessInstance[]");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        executionEntity0.forceUpdate();
        int int6 = executionEntity0.getCachedEntityState();
        executionEntity0.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.addIdentityLink("ConcurrentScopeExecution[null]", "ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setParentId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getReplacedBy();
        java.lang.String str8 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
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
        java.lang.String str12 = executionEntity4.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList13 = executionEntity4.getTasks();
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        boolean boolean5 = executionEntity0.isDeleteRoot();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        java.lang.String str7 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList13 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[]");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.Integer int3 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.setParentId("ScopeExecution[null]");
        executionEntity0.setSuspensionState((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroy();
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
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
        java.lang.String str21 = executionEntity6.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = executionEntity6.createExecution();
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        java.lang.String str5 = executionEntity0.getActivityId();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList7 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        executionEntity0.setRevision((int) (short) 1);
        java.lang.String str7 = executionEntity0.toString();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        executionEntity0.setTenantId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = executionEntity0.updateProcessBusinessKey("ProcessInstance[]");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity4.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity4.getProcessDefinition();
        executionEntity4.setEventName("hi!");
        executionEntity4.setId("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = executionEntity4.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity17 = executionEntity4.addIdentityLink("ProcessInstance[null]", "ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        boolean boolean6 = executionEntity0.isConcurrent();
        executionEntity0.forceUpdate();
        org.activiti.engine.EngineServices engineServices8 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.findExecution("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = executionEntity4.getSubProcessInstance();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
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
        java.lang.String str22 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList23 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        executionEntity0.setTenantId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity0.getProcessVariables();
        boolean boolean7 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = executionEntity0.getStartingExecution();
        java.lang.String str8 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList9 = executionEntity0.getTasks();
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.EngineServices engineServices1 = executionEntity0.getEngineServices();
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setTenantId("ProcessInstance[ConcurrentScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList7 = executionEntity0.getTasks();
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.initialize();
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        boolean boolean7 = executionEntity4.isActive();
        java.lang.String str8 = executionEntity4.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.destroyScope("hi!");
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        executionEntity0.setEventScope(true);
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[ConcurrentScopeExecution[null]]");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
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
        java.lang.String str23 = executionEntity0.getProcessInstanceId();
        java.lang.String str24 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList10 = executionEntity4.getJobs();
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getId();
        boolean boolean8 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
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
        java.lang.String str16 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = executionEntity0.findExecution("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity0.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        executionEntity0.setRevision((int) (short) 1);
        java.lang.String str7 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList8 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
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
        executionEntity0.start();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        executionEntity0.setCachedEntityState((int) (byte) 10);
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        executionEntity0.setRevision(10);
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
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
        executionEntity0.insert();
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
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
        java.lang.String str15 = executionEntity0.updateProcessBusinessKey("");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        java.lang.String str5 = executionEntity0.getId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str8 = executionEntity0.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
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
        java.lang.String str23 = executionEntity0.getProcessInstanceId();
        java.lang.String str24 = executionEntity0.getCurrentActivityName();
        executionEntity0.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = executionEntity0.findExecution("ProcessInstance[null]");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
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
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution13 = executionEntity4.getStartingExecution();
        java.lang.String str14 = executionEntity4.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.deleteCascade("ProcessInstance[hi!]");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isSuspended();
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList7 = executionEntity0.getJobs();
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
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
        executionEntity0.initialize();
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.setScope(true);
        executionEntity0.setCachedEntityState((int) (byte) -1);
        executionEntity0.setEventName("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = executionEntity0.isActive("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setCachedEntityState((int) ' ');
        executionEntity0.setDeleteReason("ProcessInstance[ConcurrentScopeExecution[null]]");
        boolean boolean7 = executionEntity0.isEventScope();
        executionEntity0.setEventName("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ConcurrentScopeExecution[null]");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity0.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        boolean boolean4 = executionEntity0.isEnded();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity5.getSuperExecution();
        java.lang.String str7 = executionEntity5.toString();
        boolean boolean8 = executionEntity5.isDeleteRoot();
        java.lang.String str9 = executionEntity5.getParentId();
        int int10 = executionEntity5.getRevisionNext();
        executionEntity5.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl14 = executionEntity5.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity5.getSubProcessInstance();
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        executionEntity0.disposeStartingExecution();
        java.lang.String str8 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList9 = executionEntity0.getExecutions();
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
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
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = executionEntity4.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList17 = executionEntity4.getEventSubscriptions();
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
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
        executionEntity4.setProcessDefinitionId("ConcurrentScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl12 = executionEntity4.getProcessDefinition();
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        java.lang.String str8 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        java.lang.String str5 = executionEntity0.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity9 = executionEntity0.addIdentityLink("ProcessInstance[hi!]", "ConcurrentScopeExecution[null]");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        java.lang.String str5 = executionEntity0.getEventName();
        java.lang.String str6 = executionEntity0.getBusinessKey();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getProcessInstance();
        java.lang.String str8 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.involveUser("hi!", "");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        java.lang.Object obj3 = executionEntity0.getPersistentState();
        executionEntity0.setCachedEntityState((int) '4');
        executionEntity0.disposeStartingExecution();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.disposeStartingExecution();
        boolean boolean7 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList8 = executionEntity0.getExecutions();
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList14 = executionEntity0.getCompensateEventSubscriptions("ConcurrentScopeExecution[null]");
        java.lang.String str15 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList16 = executionEntity0.getExecutions();
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity4.createExecution();
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        java.lang.String str6 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = executionEntity0.isActive("ProcessInstance[]");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
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
        executionEntity4.setActive(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity4.getTransition();
        executionEntity4.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity4.findExecution("ProcessInstance[hi!]");
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        executionEntity0.setId("");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl5 = executionEntity0.getProcessDefinition();
        boolean boolean6 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList7 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        boolean boolean5 = executionEntity0.isDeleteRoot();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = executionEntity0.isActive("hi!");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setParentId("ScopeExecution[null]");
        executionEntity0.setParentId("ProcessInstance[null]");
        int int9 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.findExecution("");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
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
        executionEntity0.setSuspensionState((int) (byte) 100);
        executionEntity0.setId("ProcessInstance[ConcurrentScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity22 = executionEntity0.addIdentityLink("ProcessInstance[ProcessInstance[null]]", "ScopeExecution[null]");
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        executionEntity0.setConcurrent(true);
        java.lang.String str6 = executionEntity0.getProcessDefinitionId();
        boolean boolean7 = executionEntity0.isActive();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.createExecution();
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList21 = executionEntity6.getIdentityLinks();
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        java.lang.Object obj3 = executionEntity0.getPersistentState();
        executionEntity0.setCachedEntityState((int) '4');
        executionEntity0.disposeStartingExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity0.getEventSource();
        java.lang.String str9 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.findExecution("ScopeExecution[null]");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity4.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity4.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.insert();
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity6.start();
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        int int5 = executionEntity0.getRevision();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getSuperExecution();
        java.lang.String str9 = executionEntity7.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str11 = executionEntity10.getCurrentActivityId();
        boolean boolean12 = executionEntity10.isScope();
        executionEntity7.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        executionEntity7.setScope(false);
        executionEntity7.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.setParentId("ProcessInstance[null]");
        java.lang.Integer int9 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroy();
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getParent();
        boolean boolean6 = executionEntity0.isConcurrent();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getProcessInstance();
        executionEntity0.setEventScope(false);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = executionEntity0.getTransition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList12 = executionEntity0.getJobs();
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
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
        java.lang.String str18 = executionEntity4.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.removeIdentityLinks();
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity0.getStartingExecution();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        java.lang.String str6 = executionEntity0.getParentId();
        java.lang.String str7 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.addIdentityLink("ProcessInstance[null]", "ProcessInstance[]");
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity4.findExecution("");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList19 = executionEntity6.getEventSubscriptions();
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl3 = executionEntity0.getProcessDefinition();
        java.lang.String str4 = executionEntity0.toString();
        executionEntity0.setCachedEntityState((int) (byte) 0);
        executionEntity0.inactivate();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getParent();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity0.getEventSubscriptions();
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.forceUpdate();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        boolean boolean6 = executionEntity0.isSuspended();
        java.lang.String str7 = executionEntity0.getCurrentActivityId();
        executionEntity0.setCachedEntityState((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity0.getProcessDefinition();
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        executionEntity0.setScope(true);
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = executionEntity0.isActive("hi!");
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setConcurrent(false);
        executionEntity0.forceUpdate();
        java.lang.Object obj4 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = executionEntity0.isActive("ProcessInstance[ProcessInstance[null]]");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        boolean boolean7 = executionEntity0.isConcurrent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        int int10 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[hi!]");
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str5 = executionEntity4.getCurrentActivityId();
        executionEntity0.setSuperExecution(executionEntity4);
        java.lang.String str7 = executionEntity4.getProcessInstanceId();
        executionEntity4.setActive(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.destroyScope("Execution[null]");
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList17 = executionEntity9.getTasks();
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = executionEntity0.getEventSource();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        org.activiti.engine.EngineServices engineServices7 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getProcessInstance();
        executionEntity0.forceUpdate();
        org.activiti.engine.EngineServices engineServices5 = executionEntity0.getEngineServices();
        boolean boolean6 = executionEntity0.isSuspended();
        org.activiti.engine.EngineServices engineServices7 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        executionEntity0.setId("");
        executionEntity0.setActive(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        boolean boolean2 = executionEntity0.isScope();
        executionEntity0.setId("");
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl5 = executionEntity0.getProcessDefinition();
        boolean boolean6 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList7 = executionEntity0.getExecutions();
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getBusinessKey();
        org.activiti.engine.EngineServices engineServices4 = executionEntity0.getEngineServices();
        executionEntity0.setParentId("ScopeExecution[null]");
        executionEntity0.setParentId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity0.getStartingExecution();
        java.lang.String str9 = executionEntity0.getSuperExecutionId();
        org.activiti.engine.impl.javax.el.ELContext eLContext10 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str4 = executionEntity3.getCurrentActivityId();
        boolean boolean5 = executionEntity3.isScope();
        executionEntity0.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity3);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity3.getActivity();
        java.lang.String str8 = executionEntity3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity3.getEventSubscriptionsInternal();
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        boolean boolean5 = executionEntity0.isDeleteRoot();
        java.lang.String str6 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList7 = executionEntity0.getTasks();
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        int int2 = executionEntity0.getRevisionNext();
        java.lang.String str3 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        int int6 = executionEntity0.getSuspensionState();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        java.lang.Object obj8 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution9 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
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
        boolean boolean15 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = executionEntity0.updateProcessBusinessKey("");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setParentId("hi!");
        executionEntity0.setConcurrent(true);
        boolean boolean7 = executionEntity0.isConcurrent();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 0);
        int int10 = executionEntity0.getSuspensionState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList12 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        executionEntity0.disposeStartingExecution();
        executionEntity0.setEventName("");
        java.lang.String str5 = executionEntity0.getActivityId();
        java.lang.Object obj6 = executionEntity0.getPersistentState();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransition();
        java.lang.String str9 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
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
        executionEntity6.setParentId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = executionEntity6.getProcessBusinessKey();
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setEventName("ScopeExecution[null]");
        boolean boolean5 = executionEntity0.isConcurrent();
        java.lang.String str6 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSuperExecution();
        java.lang.String str2 = executionEntity0.toString();
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        int int5 = executionEntity0.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl6 = executionEntity0.getProcessDefinition();
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        java.lang.String str8 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.involveUser("ProcessInstance[ScopeExecution[null]]", "ConcurrentScopeExecution[null]");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.String str1 = executionEntity0.getCurrentActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = executionEntity0.getReplacedBy();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity0.getTransition();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity0.getStartingExecution();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity0.getProcessVariables();
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = executionEntity0.isActive("ProcessInstance[ScopeExecution[null]]");
    }
}

