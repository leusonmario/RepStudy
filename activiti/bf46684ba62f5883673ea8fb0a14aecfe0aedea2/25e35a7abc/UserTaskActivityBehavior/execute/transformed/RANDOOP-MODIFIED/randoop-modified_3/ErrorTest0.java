import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0001");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList4 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList6 = executionEntity0.getJobs();
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList1 = executionEntity0.getTasks();
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.findExecution("");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        java.util.List<java.lang.String> strList2 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        executionEntity3.setBusinessKey("");
        java.lang.Integer int8 = executionEntity3.getExecutionListenerIndex();
        executionEntity3.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        java.lang.String str14 = executionEntity11.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity11.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userTaskActivityBehavior0.signal((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity3, "hi!", (java.lang.Object) strMap15);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity2);
        executionEntity1.setBusinessKey("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userTaskActivityBehavior0.signal((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity1, "hi!", (java.lang.Object) (-1.0f));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.createExecution();
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList4 = executionEntity0.getJobs();
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList6 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = executionEntity0.isActive("");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList6 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.insert();
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.findExecution("");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity6 = executionEntity0.addIdentityLink("hi!", "ProcessInstance[null]");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        executionEntity1.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList7 = executionEntity1.getExecutions();
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        java.util.List<java.lang.String> strList2 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        executionEntity3.setBusinessKey("");
        java.lang.Integer int8 = executionEntity3.getExecutionListenerIndex();
        executionEntity3.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        executionEntity3.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userTaskActivityBehavior0.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity11);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity8 = executionEntity0.involveUser("hi!", "ProcessInstance[null]");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = executionEntity0.updateProcessBusinessKey("ScopeExecution[null]");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity7 = executionEntity0.involveUser("ScopeExecution[null]", "ScopeExecution[null]");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ScopeExecution[null]");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setBusinessKey("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("hi!");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ScopeExecution[null]");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity1.findExecution("hi!");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList7 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity1.getSubProcessInstance();
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        executionEntity0.setTenantId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList6 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList4 = executionEntity0.getTasks();
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList3 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        boolean boolean6 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        java.lang.String str7 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.involveUser("ProcessInstance[null]", "ProcessInstance[null]");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getSuperExecution();
        java.lang.String str4 = executionEntity1.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.insert();
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList7 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity7 = executionEntity0.addIdentityLink("ProcessInstance[null]", "");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        java.lang.String str6 = executionEntity0.getCurrentActivityId();
        executionEntity0.setDeleteReason("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList9 = executionEntity0.getTasks();
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity1.getCompensateEventSubscriptions();
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList4 = executionEntity0.getExecutions();
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList7 = executionEntity0.getTasks();
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList15 = executionEntity0.getCompensateEventSubscriptions("ScopeExecution[null]");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        executionEntity1.setScope(false);
        int int7 = executionEntity1.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.removeIdentityLinks();
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        executionEntity1.setScope(false);
        int int7 = executionEntity1.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity1.getProcessBusinessKey();
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        boolean boolean6 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList4 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity1.getCompensateEventSubscriptions();
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        boolean boolean11 = executionEntity0.isEventScope();
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
        java.lang.String str23 = executionEntity12.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList14 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList5 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.setRevision(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.findExecution("ScopeExecution[null]");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.setConcurrent(true);
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ScopeExecution[null]");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        java.lang.String str5 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getSuperExecution();
        boolean boolean4 = executionEntity1.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = executionEntity1.getProcessBusinessKey();
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.setRevision(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        java.lang.String str8 = executionEntity1.getBusinessKey();
        java.lang.String str9 = executionEntity1.getId();
        org.activiti.engine.EngineServices engineServices10 = executionEntity1.getEngineServices();
        executionEntity1.setEventName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity1.getEventSubscriptions();
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        executionEntity0.setConcurrent(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        int int13 = executionEntity11.getRevisionNext();
        org.activiti.engine.EngineServices engineServices14 = executionEntity11.getEngineServices();
        boolean boolean15 = executionEntity11.isEventScope();
        executionEntity11.setParentId("");
        java.lang.String str19 = executionEntity11.updateProcessBusinessKey("");
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray20 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList21 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList21, variableInstanceEntityArray20);
        executionEntity11.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("ProcessInstance[null]", (java.lang.Object) executionEntity11);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList7 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        boolean boolean6 = executionEntity0.isEventScope();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        boolean boolean4 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        boolean boolean6 = executionEntity0.isEventScope();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = executionEntity0.isActive("");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList7 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList6 = executionEntity0.getTasks();
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList4 = executionEntity1.getCompensateEventSubscriptions("");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity1.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.insert();
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ScopeExecution[null]");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setBusinessKey("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList6 = executionEntity0.getJobs();
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList22 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.destroyScope("");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        java.lang.String str7 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList8 = executionEntity0.getJobs();
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList12 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.findExecution("ProcessInstance[null]");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        java.util.List<java.lang.String> strList2 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        boolean boolean10 = executionEntity7.isConcurrent();
        executionEntity7.setEventScope(true);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity7.getReplacedBy();
        executionEntity7.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity16.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        int int19 = executionEntity17.getRevisionNext();
        org.activiti.engine.EngineServices engineServices20 = executionEntity17.getEngineServices();
        boolean boolean21 = executionEntity17.isEventScope();
        executionEntity17.setParentId("");
        java.lang.String str25 = executionEntity17.updateProcessBusinessKey("");
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray26 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList27 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList27, variableInstanceEntityArray26);
        executionEntity17.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList27);
        executionEntity17.setId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userTaskActivityBehavior0.signal((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity7, "hi!", (java.lang.Object) executionEntity17);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        boolean boolean6 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = executionEntity0.isActive("hi!");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity8.deleteCascade("ProcessInstance[null]");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("", (java.lang.Object) (byte) -1);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity10.start();
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        executionEntity0.setTenantId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.setConcurrent(true);
        executionEntity0.setConcurrent(false);
        int int9 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = executionEntity0.updateProcessBusinessKey("ScopeExecution[null]");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.createExecution();
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity0.createExecution();
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = executionEntity0.updateProcessBusinessKey("");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity0.findExecution("ProcessInstance[null]");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList20 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
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
        boolean boolean20 = executionEntity9.isActive("ProcessInstance[null]");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        java.lang.String str7 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.findExecution("");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        boolean boolean4 = executionEntity0.isDeleteRoot();
        executionEntity0.setCachedEntityState(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList7 = executionEntity0.getExecutions();
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        java.lang.String str5 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList20 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList14 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        boolean boolean4 = executionEntity0.isDeleteRoot();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList6 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList10 = executionEntity0.getExecutions();
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList3 = executionEntity1.getEventSubscriptionsInternal();
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = executionEntity1.getProcessBusinessKey();
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        java.lang.String str8 = executionEntity1.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList9 = executionEntity1.getIdentityLinks();
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        boolean boolean6 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.updateProcessBusinessKey("");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList14 = executionEntity1.getTasks();
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = executionEntity0.isActive("hi!");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        java.lang.String str6 = executionEntity0.getCurrentActivityId();
        executionEntity0.setParentId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        boolean boolean11 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
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
        executionEntity0.start();
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList16 = executionEntity0.getTasks();
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.setConcurrent(true);
        java.lang.String str7 = executionEntity0.getId();
        java.lang.String str8 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
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
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity12 = executionEntity0.involveUser("hi!", "ScopeExecution[null]");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
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
        executionEntity8.end();
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("");
        java.lang.String str10 = executionEntity1.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.start();
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity0.findExecution("ProcessInstance[null]");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.findExecution("hi!");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
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
        executionEntity10.deleteCascade("ProcessInstance[null]");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity5 = executionEntity1.involveUser("hi!", "ProcessInstance[null]");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        boolean boolean4 = executionEntity0.isDeleteRoot();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList6 = executionEntity0.getJobs();
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity1.findExecution("ScopeExecution[null]");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity1.findExecution("ScopeExecution[null]");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity0.findExecution("ScopeExecution[null]");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        executionEntity1.setScope(false);
        int int7 = executionEntity1.getRevision();
        boolean boolean8 = executionEntity1.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList9 = executionEntity1.getExecutions();
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList14 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.deleteCascade("ProcessInstance[null]");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setCachedEntityState((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList7 = executionEntity0.getExecutions();
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution5 = executionEntity1.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList6 = executionEntity1.findActiveActivityIds();
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList5 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        java.util.List<java.lang.String> strList2 = userTaskActivityBehavior0.extractCandidates("");
        java.util.List<java.lang.String> strList4 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity5.setBusinessKey("");
        java.lang.Integer int10 = executionEntity5.getExecutionListenerIndex();
        executionEntity5.forceUpdate();
        executionEntity5.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity14.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        int int17 = executionEntity15.getRevisionNext();
        executionEntity5.setSuperExecution(executionEntity15);
        executionEntity15.setDeleteReason("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userTaskActivityBehavior0.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity15);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity1.addIdentityLink("ProcessInstance[null]", "hi!");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setEventScope(true);
        int int7 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setTenantId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("hi!");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
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
        executionEntity1.destroy();
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
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
        java.lang.String str20 = executionEntity0.updateProcessBusinessKey("hi!");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.String str5 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList6 = executionEntity0.getExecutions();
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity0.getActivity();
        executionEntity0.setTenantId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.involveUser("hi!", "ScopeExecution[null]");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList14 = executionEntity10.getJobs();
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        boolean boolean6 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
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
        java.lang.Object obj15 = executionEntity14.getPersistentState();
        executionEntity14.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement18 = executionEntity14.getEventSource();
        executionEntity14.setProcessDefinitionId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity10.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setName("hi!");
        java.lang.String str6 = executionEntity0.toString();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        executionEntity0.setTenantId("");
        executionEntity0.setBusinessKey("ScopeExecution[null]");
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.createExecution();
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        java.lang.String str6 = executionEntity0.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.findExecution("ProcessInstance[null]");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList3 = executionEntity1.getExecutions();
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity0.getActivity();
        executionEntity0.setTenantId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = executionEntity0.updateProcessBusinessKey("ScopeExecution[null]");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setProcessDefinitionId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransitionBeingTaken();
        boolean boolean9 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        org.activiti.engine.EngineServices engineServices6 = executionEntity0.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setEventScope(true);
        int int11 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList5 = executionEntity0.getTasks();
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
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
        executionEntity0.end();
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setName("hi!");
        boolean boolean6 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList4 = executionEntity0.getTasks();
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setEventScope(true);
        int int7 = executionEntity0.getSuspensionState();
        java.lang.String str8 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList9 = executionEntity0.getExecutions();
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.setConcurrent(true);
        java.lang.String str7 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = executionEntity0.isActive("hi!");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        java.lang.Integer int8 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.findExecution("ProcessInstance[null]");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        java.util.List<java.lang.String> strList2 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        executionEntity7.setBusinessKey("");
        java.lang.String str12 = executionEntity7.getEventName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity14.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        java.lang.String str17 = executionEntity14.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = executionEntity14.getProcessVariables();
        boolean boolean19 = executionEntity14.isProcessInstanceType();
        java.lang.String str20 = executionEntity14.getSuperExecutionId();
        boolean boolean21 = executionEntity14.isConcurrent();
        java.lang.String str22 = executionEntity14.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userTaskActivityBehavior0.signal((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity7, "", (java.lang.Object) executionEntity14);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        executionEntity0.setTenantId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.addIdentityLink("hi!", "hi!");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity0.findExecution("hi!");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setName("hi!");
        boolean boolean6 = executionEntity0.isEventScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.findExecution("ProcessInstance[null]");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList7 = executionEntity0.getJobs();
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setEventScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[null]");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList15 = executionEntity0.getJobs();
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        java.lang.String str7 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = executionEntity0.isActive("ProcessInstance[null]");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        java.lang.String str2 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity5 = executionEntity0.involveUser("ScopeExecution[null]", "ScopeExecution[null]");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution2 = executionEntity0.getStartingExecution();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity6 = executionEntity0.addIdentityLink("ScopeExecution[null]", "ProcessInstance[null]");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.String str5 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity8 = executionEntity0.involveUser("ProcessInstance[ScopeExecution[null]]", "ScopeExecution[null]");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList6 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        java.lang.String str7 = executionEntity0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList8 = executionEntity0.getExecutions();
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        java.lang.Object obj6 = executionEntity1.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity1.getCompensateEventSubscriptions("ScopeExecution[null]");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity1.createExecution();
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.String str6 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions("");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.start();
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.String str5 = executionEntity0.getEventName();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity9 = executionEntity0.involveUser("", "ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str9 = executionEntity0.getEventName();
        executionEntity0.setEventName("ProcessInstance[ScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList5 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.setConcurrent(true);
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.involveUser("", "");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList5 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity0.getQueryVariables();
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity6 = executionEntity0.addIdentityLink("", "ScopeExecution[null]");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.updateProcessBusinessKey("");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.createExecution();
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setProcessDefinitionId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getProcessInstance();
        boolean boolean7 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList9 = executionEntity0.getCompensateEventSubscriptions("");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        java.lang.String str7 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.findExecution("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList5 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.createExecution();
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setProcessDefinitionId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        boolean boolean5 = executionEntity0.isDeleteRoot();
        java.lang.String str6 = executionEntity0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList7 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = executionEntity0.isActive("");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        boolean boolean4 = executionEntity0.isDeleteRoot();
        boolean boolean5 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList6 = executionEntity0.getTasks();
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
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
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        boolean boolean5 = executionEntity0.isConcurrent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = executionEntity5.updateProcessBusinessKey("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isProcessInstanceType();
        java.lang.Object obj2 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.setConcurrent(true);
        java.lang.String str7 = executionEntity0.getId();
        java.lang.String str8 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isProcessInstanceType();
        java.lang.Object obj2 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        boolean boolean5 = executionEntity0.isConcurrent();
        boolean boolean6 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ScopeExecution[null]");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setEventScope(true);
        executionEntity0.setActive(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        boolean boolean5 = executionEntity0.isConcurrent();
        boolean boolean6 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList7 = executionEntity0.getTasks();
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        java.lang.String str6 = executionEntity0.getCurrentActivityId();
        executionEntity0.setParentId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions("hi!");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.inactivate();
        java.lang.String str8 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
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
        java.lang.String str20 = executionEntity11.updateProcessBusinessKey("");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        java.lang.String str5 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 2);
        int int8 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.addIdentityLink("ScopeExecution[null]", "ProcessInstance[null]");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList9 = executionEntity3.getJobs();
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        java.lang.String str2 = executionEntity0.getDeleteReason();
        boolean boolean3 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList13 = executionEntity0.getTasks();
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList14 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.setConcurrent(true);
        executionEntity0.setConcurrent(false);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        executionEntity0.setConcurrent(true);
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        java.lang.String str8 = executionEntity0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        executionEntity1.setScope(false);
        int int7 = executionEntity1.getRevision();
        boolean boolean8 = executionEntity1.isScope();
        executionEntity1.setActive(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList12 = executionEntity1.getExecutions();
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        boolean boolean4 = executionEntity0.isDeleteRoot();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList5 = executionEntity0.getQueryVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str5 = executionEntity0.getDeleteReason();
        java.lang.String str6 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList8 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        executionEntity1.setScope(false);
        int int7 = executionEntity1.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.initialize();
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        java.lang.String str7 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList8 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
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
        executionEntity10.initialize();
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        java.lang.String str5 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList6 = executionEntity0.getExecutions();
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList8 = executionEntity0.getExecutions();
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList8 = executionEntity0.getTasks();
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        java.lang.String str7 = executionEntity0.toString();
        int int8 = executionEntity0.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        boolean boolean6 = executionEntity0.isEnded();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setTenantId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.deleteCascade("hi!");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        executionEntity0.setTenantId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList5 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        java.util.List<java.lang.String> strList2 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
        executionEntity5.setBusinessKey("");
        java.lang.Integer int10 = executionEntity5.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity5.getReplacedBy();
        boolean boolean12 = executionEntity5.isEventScope();
        int int13 = executionEntity5.getSuspensionState();
        executionEntity5.setBusinessKey("ProcessInstance[ScopeExecution[null]]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl20 = executionEntity18.getTransition();
        java.lang.Integer int21 = executionEntity18.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userTaskActivityBehavior0.signal((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity5, "ScopeExecution[null]", (java.lang.Object) executionEntity18);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getParent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getSuperExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.Integer int9 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[null]");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str7 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        java.lang.String str2 = executionEntity0.getDeleteReason();
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getSuperExecution();
        java.lang.String str4 = executionEntity1.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.initialize();
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("");
        java.lang.String str10 = executionEntity1.getCurrentActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getSubProcessInstance();
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        boolean boolean1 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = executionEntity0.isActive("ProcessInstance[null]");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList15 = executionEntity1.getIdentityLinks();
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setCachedEntityState(0);
        java.lang.String str5 = executionEntity0.getSuperExecutionId();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        int int7 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.involveUser("ProcessInstance[ScopeExecution[null]]", "ProcessInstance[null]");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        boolean boolean4 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[null]");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity1.getEventSubscriptions();
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
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
        executionEntity0.end();
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.createExecution();
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList22 = executionEntity1.getEventSubscriptionsInternal();
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setEventScope(true);
        int int7 = executionEntity0.getSuspensionState();
        java.lang.String str8 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.addIdentityLink("ScopeExecution[null]", "");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity1.getEventSubscriptionsInternal();
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        executionEntity0.setTenantId("ScopeExecution[null]");
        executionEntity0.setTenantId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.String str4 = executionEntity1.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity1.getSubProcessInstance();
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.createExecution();
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement7 = executionEntity0.getEventSource();
        java.lang.String str8 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity22 = executionEntity5.involveUser("ProcessInstance[null]", "");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
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
        executionEntity5.initialize();
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
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
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.addIdentityLink("ProcessInstance[ScopeExecution[null]]", "");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str5 = executionEntity0.getDeleteReason();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity7.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        int int10 = executionEntity8.getRevisionNext();
        org.activiti.engine.EngineServices engineServices11 = executionEntity8.getEngineServices();
        boolean boolean12 = executionEntity8.isEventScope();
        executionEntity8.setParentId("");
        java.lang.String str16 = executionEntity8.updateProcessBusinessKey("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity17.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity18);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl20 = executionEntity18.getTransition();
        executionEntity8.setSuperExecution(executionEntity18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("", (java.lang.Object) executionEntity18);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity5.getProcessVariables();
        executionEntity0.setVariables(strMap6);
        java.lang.String str8 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.createExecution();
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity0.findExecution("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions("");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        executionEntity0.setConcurrent(true);
        java.lang.String str7 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList17 = executionEntity10.getEventSubscriptionsInternal();
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        java.lang.String str6 = executionEntity0.getCurrentActivityId();
        executionEntity0.setParentId("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity10.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        executionEntity10.setBusinessKey("");
        java.lang.Integer int15 = executionEntity10.getExecutionListenerIndex();
        java.lang.String str16 = executionEntity10.getProcessInstanceId();
        executionEntity10.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.signal("ScopeExecution[null]", (java.lang.Object) true);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList21 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity5.getProcessVariables();
        executionEntity0.setVariables(strMap6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = executionEntity0.isActive("ProcessInstance[null]");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
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
        executionEntity0.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        java.lang.Integer int8 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str9 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("hi!");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("");
        java.lang.String str10 = executionEntity1.getBusinessKey();
        executionEntity1.setDeleteReason("");
        int int13 = executionEntity1.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity1.getSubProcessInstance();
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
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
        java.lang.String str15 = executionEntity0.updateProcessBusinessKey("");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        boolean boolean4 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList6 = executionEntity0.getCompensateEventSubscriptions("hi!");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        executionEntity0.setTenantId("");
        executionEntity0.setBusinessKey("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        boolean boolean4 = executionEntity0.isDeleteRoot();
        boolean boolean5 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.findExecution("ScopeExecution[null]");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
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
        executionEntity0.setCachedEntityState((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = executionEntity0.isActive("ProcessInstance[null]");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        executionEntity1.setScope(false);
        int int7 = executionEntity1.getRevision();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList8 = executionEntity1.getJobs();
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        executionEntity0.setBusinessKey("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList9 = executionEntity0.getJobs();
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        org.activiti.engine.EngineServices engineServices6 = executionEntity0.getEngineServices();
        executionEntity0.setCachedEntityState((int) '4');
        int int9 = executionEntity0.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList9 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        executionEntity0.setTenantId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.findExecution("");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        executionEntity1.setScope(false);
        int int7 = executionEntity1.getRevision();
        boolean boolean8 = executionEntity1.isScope();
        executionEntity1.setActive(false);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity1.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList12 = executionEntity1.getEventSubscriptions();
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setProcessDefinitionId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList10 = executionEntity0.getExecutions();
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        java.lang.String str5 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList6 = executionEntity0.getTasks();
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = executionEntity0.updateProcessBusinessKey("hi!");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList20 = executionEntity11.getTasks();
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity7 = executionEntity0.addIdentityLink("", "ProcessInstance[null]");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        java.lang.String str5 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList6 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList11 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        boolean boolean4 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        java.lang.String str5 = executionEntity0.getCurrentActivityName();
        java.lang.String str6 = executionEntity0.getCurrentActivityName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList33 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList10 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        boolean boolean5 = executionEntity0.isDeleteRoot();
        java.lang.String str6 = executionEntity0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
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
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution25 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList26 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.createExecution();
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution6 = executionEntity1.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList7 = executionEntity1.getEventSubscriptions();
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.end();
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList16 = executionEntity0.getTasks();
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        executionEntity0.setConcurrent(true);
        executionEntity0.setName("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList9 = executionEntity0.getJobs();
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        java.lang.String str5 = executionEntity0.getParentId();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 2);
        boolean boolean8 = executionEntity0.isEnded();
        int int9 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = executionEntity0.updateProcessBusinessKey("ScopeExecution[null]");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement7 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList8 = executionEntity0.getTasks();
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        java.lang.Object obj6 = executionEntity1.getPersistentState();
        boolean boolean7 = executionEntity1.isScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = executionEntity1.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = executionEntity1.findActiveActivityIds();
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getActivityId();
        java.lang.String str6 = executionEntity0.getDeleteReason();
        java.lang.String str7 = executionEntity0.getParentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity0.getQueryVariables();
        boolean boolean7 = executionEntity0.isScope();
        boolean boolean8 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList9 = executionEntity0.getTasks();
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        boolean boolean8 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.addIdentityLink("ScopeExecution[null]", "ScopeExecution[null]");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        executionEntity0.disposeStartingExecution();
        java.lang.String str7 = executionEntity0.toString();
        java.lang.String str8 = executionEntity0.getParentId();
        int int9 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
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
        executionEntity0.destroyScope("ScopeExecution[null]");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setProcessDefinitionId("hi!");
        boolean boolean8 = executionEntity0.isProcessInstanceType();
        executionEntity0.setDeleteReason("ProcessInstance[ScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity1.getTransitionBeingTaken();
        int int6 = executionEntity1.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity1.createExecution();
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
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
        java.lang.String str12 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        java.lang.String str8 = executionEntity1.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = executionEntity1.updateProcessBusinessKey("");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity1.getParent();
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str6 = executionEntity0.getParentId();
        java.lang.String str7 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList8 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setTenantId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("");
        java.lang.String str10 = executionEntity1.getBusinessKey();
        executionEntity1.setDeleteReason("");
        int int13 = executionEntity1.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = executionEntity1.createExecution();
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
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
        java.lang.String str20 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.setConcurrent(true);
        java.lang.String str7 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = executionEntity0.isActive("");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        java.lang.String str7 = executionEntity0.getSuperExecutionId();
        boolean boolean8 = executionEntity0.isSuspended();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        executionEntity1.setScope(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity1.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.initialize();
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getSuperExecution();
        boolean boolean4 = executionEntity1.isConcurrent();
        org.activiti.engine.EngineServices engineServices5 = executionEntity1.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.initialize();
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList12 = executionEntity0.getTasks();
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
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
        executionEntity10.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList16 = executionEntity10.getEventSubscriptionsInternal();
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
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
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.setConcurrent(true);
        java.lang.String str7 = executionEntity0.getId();
        java.lang.String str8 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        executionEntity1.setScope(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution8 = executionEntity1.getStartingExecution();
        int int9 = executionEntity1.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList10 = executionEntity1.getJobs();
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.String str5 = executionEntity0.getActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
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
        executionEntity1.setDeleteReason("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity1.findExecution("hi!");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        executionEntity0.setRevision((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.involveUser("ProcessInstance[ScopeExecution[null]]", "");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList4 = executionEntity1.getEventSubscriptions();
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        boolean boolean4 = executionEntity0.isDeleteRoot();
        java.lang.String str5 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setProcessDefinitionId("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity0.getTransitionBeingTaken();
        boolean boolean9 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList10 = executionEntity0.getExecutions();
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
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
        int int12 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList13 = executionEntity0.getTasks();
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.createExecution();
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setTenantId("");
        executionEntity1.disposeStartingExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity9.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity10);
        java.lang.String str12 = executionEntity9.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = executionEntity9.getProcessVariables();
        boolean boolean14 = executionEntity9.isProcessInstanceType();
        java.lang.String str15 = executionEntity9.getSuperExecutionId();
        java.lang.String str16 = executionEntity9.getSuperExecutionId();
        executionEntity9.setDeleteReason("hi!");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity9.getProcessInstance();
        org.activiti.engine.impl.javax.el.ELContext eLContext20 = executionEntity9.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList11 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setProcessDefinitionId("ProcessInstance[null]");
        executionEntity0.setParentId("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ScopeExecution[null]");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement7 = executionEntity0.getEventSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[null]");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList24 = executionEntity0.getEventSubscriptionsInternal();
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = executionEntity0.getProcessVariables();
        java.lang.String str2 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList3 = executionEntity0.getJobs();
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        java.lang.String str8 = executionEntity1.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = executionEntity1.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
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
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity15 = executionEntity0.addIdentityLink("ProcessInstance[null]", "hi!");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        java.util.List<java.lang.String> strList2 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity6.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity7);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = executionEntity7.getTransition();
        java.lang.Integer int10 = executionEntity7.getExecutionListenerIndex();
        java.lang.String str11 = executionEntity7.getName();
        executionEntity7.setProcessDefinitionId("ProcessInstance[null]");
        java.lang.String str14 = executionEntity7.getBusinessKey();
        java.lang.String str15 = executionEntity7.getId();
        org.activiti.engine.EngineServices engineServices16 = executionEntity7.getEngineServices();
        executionEntity7.setEventName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userTaskActivityBehavior0.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity7);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
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
        executionEntity10.setName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList18 = executionEntity10.getCompensateEventSubscriptions("ProcessInstance[null]");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity15 = executionEntity0.addIdentityLink("ProcessInstance[null]", "ProcessInstance[null]");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity10.deleteCascade("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity0.findExecution("ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        org.activiti.engine.EngineServices engineServices4 = executionEntity1.getEngineServices();
        boolean boolean5 = executionEntity1.isEventScope();
        executionEntity1.setParentId("");
        java.lang.String str9 = executionEntity1.updateProcessBusinessKey("");
        java.lang.String str10 = executionEntity1.getBusinessKey();
        executionEntity1.setDeleteReason("");
        int int13 = executionEntity1.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.remove();
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = executionEntity12.getProcessBusinessKey();
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.inactivate();
        java.lang.String str8 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList9 = executionEntity0.getExecutions();
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[null]");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getProcessInstance();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity0.getTransition();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl8 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList9 = executionEntity0.getExecutions();
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
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
        executionEntity10.end();
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setEventScope(true);
        java.lang.String str5 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setRevision((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[null]");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity3.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        boolean boolean6 = executionEntity3.isConcurrent();
        java.lang.String str7 = executionEntity3.getId();
        executionEntity0.setSuperExecution(executionEntity3);
        java.lang.String str9 = executionEntity0.getActivityId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        boolean boolean5 = executionEntity0.isDeleteRoot();
        java.lang.String str6 = executionEntity0.getName();
        executionEntity0.disposeStartingExecution();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl8 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList9 = executionEntity0.getTasks();
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
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
        executionEntity1.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList16 = executionEntity1.getIdentityLinks();
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 7);
        executionEntity0.setDeleteReason("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        boolean boolean7 = executionEntity0.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        boolean boolean6 = executionEntity0.isEventScope();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = executionEntity0.getProcessVariables();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList12 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        boolean boolean7 = executionEntity0.isDeleteRoot();
        executionEntity0.setTenantId("ProcessInstance[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList10 = executionEntity0.getExecutions();
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl5 = executionEntity0.getActivity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj7 = executionEntity6.getPersistentState();
        executionEntity6.setScope(true);
        int int10 = executionEntity6.getCachedEntityState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity11.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        executionEntity11.setBusinessKey("");
        java.lang.Integer int16 = executionEntity11.getExecutionListenerIndex();
        executionEntity11.forceUpdate();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity18.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        executionEntity11.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        executionEntity6.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity11);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement23 = executionEntity6.getEventSource();
        java.lang.String str24 = executionEntity6.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity6);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity12 = executionEntity0.addIdentityLink("ProcessInstance[ScopeExecution[null]]", "");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        boolean boolean5 = executionEntity0.isEventScope();
        executionEntity0.setScope(false);
        int int8 = executionEntity0.getCachedEntityState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = executionEntity0.updateProcessBusinessKey("hi!");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList7 = executionEntity0.getJobs();
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
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
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity17 = executionEntity0.involveUser("ScopeExecution[null]", "");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setProcessDefinitionId("hi!");
        boolean boolean8 = executionEntity0.isProcessInstanceType();
        executionEntity0.setProcessDefinitionId("ProcessInstance[ScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.setRevision(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        boolean boolean6 = executionEntity0.isEnded();
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution2 = executionEntity0.getStartingExecution();
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList12 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity13 = executionEntity0.addIdentityLink("ProcessInstance[null]", "ProcessInstance[ScopeExecution[null]]");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList22 = executionEntity11.getTasks();
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
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
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        java.lang.Object obj5 = executionEntity0.getPersistentState();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        executionEntity0.inactivate();
        java.lang.Object obj8 = executionEntity0.getPersistentState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList27 = executionEntity0.getCompensateEventSubscriptions("ScopeExecution[null]");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
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
        executionEntity0.start();
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setSuspensionState(0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getParent();
        executionEntity0.setSuspensionState(2);
        boolean boolean11 = executionEntity0.isActive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = executionEntity0.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setCachedEntityState(0);
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.String str5 = executionEntity0.getEventName();
        java.lang.String str6 = executionEntity0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity0.getActivity();
        java.lang.String str8 = executionEntity0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("hi!");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList13 = executionEntity8.getIdentityLinks();
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity0.getActivity();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions("ProcessInstance[null]");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str6 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        java.lang.String str8 = executionEntity1.getBusinessKey();
        java.lang.String str9 = executionEntity1.getId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.removeIdentityLinks();
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
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
        executionEntity0.destroyScope("");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
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
        executionEntity0.setConcurrent(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        boolean boolean4 = executionEntity0.isDeleteRoot();
        java.lang.String str5 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.findExecution("");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.setConcurrent(true);
        executionEntity0.setName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList10 = executionEntity0.getCompensateEventSubscriptions("hi!");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ProcessInstance[null]");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        java.lang.String str5 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = executionEntity0.getActivity();
        executionEntity0.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity0.getCachedElContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity1.initialize();
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
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
        executionEntity1.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity17 = executionEntity1.involveUser("hi!", "ScopeExecution[null]");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList17 = executionEntity11.getEventSubscriptions();
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
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
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity25 = executionEntity0.involveUser("", "ScopeExecution[null]");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.String str5 = executionEntity0.getEventName();
        java.lang.String str6 = executionEntity0.getName();
        int int7 = executionEntity0.getCachedEntityState();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity0.addIdentityLink("hi!", "");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str9 = executionEntity0.getEventName();
        executionEntity0.setEventName("ProcessInstance[ScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity0.createExecution();
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) (-1));
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList8 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setEventScope(true);
        java.lang.String str5 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setRevision((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity0.addIdentityLink("", "ProcessInstance[null]");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity11.start();
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getSuperExecution();
        java.lang.String str4 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity1.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = executionEntity1.isActive("hi!");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        executionEntity0.forceUpdate();
        boolean boolean7 = executionEntity0.isScope();
        java.lang.Integer int8 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str9 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = executionEntity0.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList12 = executionEntity0.getCompensateEventSubscriptions("hi!");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = executionEntity7.updateProcessBusinessKey("hi!");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        java.lang.String str6 = executionEntity0.getSuperExecutionId();
        boolean boolean7 = executionEntity0.isConcurrent();
        java.lang.String str8 = executionEntity0.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
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
        executionEntity0.setId("ProcessInstance[ScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.remove();
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setCachedEntityState(0);
        java.lang.String str5 = executionEntity0.getSuperExecutionId();
        org.activiti.engine.impl.javax.el.ELContext eLContext6 = executionEntity0.getCachedElContext();
        int int7 = executionEntity0.getSuspensionState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
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
        executionEntity1.setDeleteReason("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity1.findExecution("ProcessInstance[null]");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity0.createExecution();
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setSuspensionState(0);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity0.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity8.getSubProcessInstance();
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        org.activiti.engine.EngineServices engineServices6 = executionEntity0.getEngineServices();
        executionEntity0.setCachedEntityState((int) '4');
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl9 = executionEntity0.getProcessDefinition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
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
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution10 = executionEntity0.getStartingExecution();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        java.lang.String str5 = executionEntity1.getName();
        executionEntity1.setProcessDefinitionId("ProcessInstance[null]");
        java.lang.String str8 = executionEntity1.getBusinessKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList9 = executionEntity1.getExecutions();
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity13.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        boolean boolean16 = executionEntity13.isConcurrent();
        java.lang.String str17 = executionEntity13.getId();
        java.lang.String str18 = executionEntity13.getCurrentActivityName();
        java.lang.String str19 = executionEntity13.getCurrentActivityName();
        executionEntity13.setName("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
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
        executionEntity0.end();
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        boolean boolean6 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl3 = executionEntity1.getTransition();
        java.lang.Integer int4 = executionEntity1.getExecutionListenerIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity7 = executionEntity1.addIdentityLink("ScopeExecution[null]", "hi!");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str6 = executionEntity0.getParentId();
        java.lang.String str7 = executionEntity0.getProcessInstanceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.start();
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList16 = executionEntity1.getCompensateEventSubscriptions("ScopeExecution[null]");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray5 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList6, variableInstanceEntityArray5);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList6);
        java.lang.String str9 = executionEntity0.getTenantId();
        java.lang.String str10 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("hi!");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getSuperExecution();
        boolean boolean4 = executionEntity1.isConcurrent();
        org.activiti.engine.EngineServices engineServices5 = executionEntity1.getEngineServices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList6 = executionEntity1.getEventSubscriptionsInternal();
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = executionEntity0.getTransitionBeingTaken();
        java.lang.String str5 = executionEntity0.getDeleteReason();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity0.getSubProcessInstance();
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.forceUpdate();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity0.getTransitionBeingTaken();
        executionEntity0.setSuspensionState(0);
        boolean boolean8 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = executionEntity0.findActiveActivityIds();
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setId("");
        executionEntity0.setEventScope(true);
        executionEntity0.setActive(true);
        boolean boolean7 = executionEntity0.isScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        int int3 = executionEntity1.getRevisionNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity1.createExecution();
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
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
        boolean boolean19 = executionEntity11.isDeleteRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList20 = executionEntity11.getEventSubscriptionsInternal();
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
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
        java.lang.String str18 = executionEntity5.getProcessBusinessKey();
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = executionEntity5.createExecution();
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setBusinessKey("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList20 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getId();
        executionEntity0.setConcurrent(true);
        java.lang.String str7 = executionEntity0.getId();
        java.lang.String str8 = executionEntity0.getSuperExecutionId();
        java.lang.String str9 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getReplacedBy();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity0.getProcessVariables();
        executionEntity0.setConcurrent(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList10 = executionEntity0.getTasks();
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
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
        java.lang.String str20 = executionEntity0.getProcessInstanceId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity0.getReplacedBy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = executionEntity0.getProcessVariables();
        boolean boolean5 = executionEntity0.isProcessInstanceType();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity0.getProcessInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ScopeExecution[null]");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
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
        executionEntity0.setScope(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.deleteCascade("ScopeExecution[null]");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setScope(false);
        java.lang.String str8 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = executionEntity0.isActive("");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setProcessDefinitionId("hi!");
        boolean boolean8 = executionEntity0.isProcessInstanceType();
        executionEntity0.setDeleteReason("ProcessInstance[ScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity13 = executionEntity0.involveUser("ScopeExecution[null]", "ScopeExecution[null]");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray5 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList6, variableInstanceEntityArray5);
        executionEntity0.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = executionEntity0.isActive("ScopeExecution[null]");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = executionEntity0.getProcessVariables();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList4 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
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
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity21 = executionEntity0.addIdentityLink("", "hi!");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        java.lang.Integer int6 = executionEntity0.getExecutionListenerIndex();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity0.getActivity();
        java.lang.String str8 = executionEntity0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity0.setDeleteReason("ScopeExecution[null]");
        executionEntity0.setDeleteReason("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        java.lang.String str6 = executionEntity0.getCurrentActivityId();
        executionEntity0.setDeleteReason("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = executionEntity0.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        executionEntity0.setProcessDefinitionId("ScopeExecution[null]");
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 10);
        java.lang.String str9 = executionEntity0.getEventName();
        executionEntity0.setEventName("ProcessInstance[ScopeExecution[null]]");
        java.lang.String str12 = executionEntity0.getProcessDefinitionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity15 = executionEntity0.addIdentityLink("ProcessInstance[null]", "");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList22 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = executionEntity1.getSuperExecution();
        java.lang.String str4 = executionEntity1.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity1.getTransitionBeingTaken();
        int int6 = executionEntity1.getRevision();
        java.lang.String str7 = executionEntity1.getSuperExecutionId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList8 = executionEntity1.getIdentityLinks();
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = executionEntity0.getProcessVariables();
        java.lang.String str2 = executionEntity0.getTenantId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList3 = executionEntity0.getTasks();
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity18 = executionEntity10.involveUser("ScopeExecution[null]", "ProcessInstance[null]");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
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
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList13 = executionEntity12.getEventSubscriptions();
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        boolean boolean6 = executionEntity0.isEventScope();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("ProcessInstance[null]");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessInstanceId();
        int int4 = executionEntity0.getRevision();
        java.lang.String str5 = executionEntity0.getParentId();
        executionEntity0.setEventName("");
        java.lang.String str8 = executionEntity0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        java.lang.String str6 = executionEntity0.getCurrentActivityId();
        executionEntity0.setParentId("hi!");
        java.lang.String str9 = executionEntity0.getParentId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = executionEntity0.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity0.createExecution();
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setName("hi!");
        java.lang.String str6 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList7 = executionEntity0.getCompensateEventSubscriptions();
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity9.findExecution("ProcessInstance[null]");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        java.lang.String str5 = executionEntity0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList6 = executionEntity0.getEventSubscriptions();
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity0.getEventSource();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity5.getProcessVariables();
        executionEntity0.setVariables(strMap6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = executionEntity0.isActive("hi!");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        java.lang.String str3 = executionEntity0.getProcessDefinitionId();
        boolean boolean4 = executionEntity0.isDeleteRoot();
        java.lang.String str5 = executionEntity0.getEventName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList6 = executionEntity0.getIdentityLinks();
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        executionEntity0.setExecutionListenerIndex((java.lang.Integer) (-1));
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = executionEntity0.getProcessBusinessKey();
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity0.getQueryVariables();
        executionEntity0.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.destroyScope("");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
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
        boolean boolean14 = executionEntity0.isEnded();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity15.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        java.lang.String str18 = executionEntity15.getProcessDefinitionId();
        boolean boolean19 = executionEntity15.isDeleteRoot();
        executionEntity15.setCachedEntityState(100);
        executionEntity0.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity15);
        executionEntity0.forceUpdate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList27 = executionEntity5.getEventSubscriptions();
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        java.lang.Object obj1 = executionEntity0.getPersistentState();
        executionEntity0.setScope(true);
        int int4 = executionEntity0.getCachedEntityState();
        int int5 = executionEntity0.getRevisionNext();
        executionEntity0.setId("ProcessInstance[ScopeExecution[null]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.end();
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity0.getProcessInstance();
        boolean boolean6 = executionEntity0.isProcessInstanceType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.insert();
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        executionEntity0.setBusinessKey("");
        java.lang.Integer int5 = executionEntity0.getExecutionListenerIndex();
        java.lang.String str6 = executionEntity0.getProcessInstanceId();
        executionEntity0.setConcurrent(true);
        java.lang.String str9 = executionEntity0.getParentId();
        executionEntity0.setRevision((int) (short) 100);
        boolean boolean12 = executionEntity0.isEnded();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.removeIdentityLinks();
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        executionEntity0.setEventScope(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = executionEntity0.updateProcessBusinessKey("ProcessInstance[null]");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity0.createExecution();
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity19 = executionEntity0.involveUser("hi!", "hi!");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity0 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity();
        executionEntity0.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity1);
        boolean boolean3 = executionEntity0.isConcurrent();
        java.lang.String str4 = executionEntity0.getProcessDefinitionId();
        executionEntity0.setEventName("ScopeExecution[null]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity0.initialize();
    }
}

