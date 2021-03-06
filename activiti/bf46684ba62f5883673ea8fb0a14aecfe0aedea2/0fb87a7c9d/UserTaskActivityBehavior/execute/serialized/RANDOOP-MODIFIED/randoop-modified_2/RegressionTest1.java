import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior381();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity750();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity866();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior523();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity367();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior133();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior126();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior121();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity776();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior825();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior605();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity617();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity39();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition346();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity751();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition67();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior133();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity826();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior133();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior506();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior686();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity870();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity581();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition68();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior220();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity232();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity703();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior280();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity742();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity589();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior454();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity589();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition238();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior58();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior121();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior343();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior134();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition346();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition67();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior19();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior32();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior743();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition135();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity405();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity92();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior480();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity538();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior766();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity781();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior223();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity823();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition229();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity421();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior460();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior458();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition43();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior586();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior237();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity110();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity518();
        org.activiti.engine.impl.persistence.entity.VariableScopeImpl variableScopeImpl3 = executionEntity2.getParentVariableScope();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter4 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter4.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter4.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter4.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter4.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter4.deserializeObjectUserTaskActivityBehavior100();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter4.deserializeObjectExecutionEntity688();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter4.deserializeObjectTaskDefinition202();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter4.deserializeObjectExecutionEntity485();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = executionEntity12.activity;
        executionEntity2.setEventSource((org.activiti.engine.impl.pvm.PvmProcessElement) activityImpl13);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = executionEntity2.findExecution("");
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(variableScopeImpl3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(taskDefinition11);
        org.junit.Assert.assertNotNull(executionEntity12);
        org.junit.Assert.assertNotNull(activityImpl13);
        org.junit.Assert.assertNull(executionEntity16);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition9();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity786();
        java.lang.String str8 = executionEntity7.processDefinitionId;
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "oneTaskProcess:1:5802" + "'", str8, "oneTaskProcess:1:5802");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity632();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity225();
        executionEntity6.forceUpdate();
        executionEntity6.removeVariable("5771");
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior549();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior692();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior662();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition44();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior208();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity809();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior743();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition135();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity382();
        boolean boolean7 = executionEntity6.deleteRoot;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior26();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior266();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior151();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior705();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity581();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior862();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior797();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior109();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity97();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity82();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity311();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior458();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior203();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity797();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior274();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior133();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity98();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior410();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior455();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity518();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior686();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity769();
        executionEntity4.activityName = "hi!";
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity689();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity650();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition63();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior393();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior51();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior452();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior612();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior337();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior633();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity633();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior45();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior765();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity619();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior41();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior438();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition97();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior344();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition325();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity29();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity665();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity58();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior197();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior634();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior480();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity538();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior16();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity804();
        java.lang.String str8 = executionEntity7.businessKey;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior343();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior134();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition346();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior690();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity744();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition245();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity845();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior147();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior659();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior576();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity80();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        executionEntity5.setParentId("ProcessInstance[6318]");
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity257();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity222();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior429();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior746();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition265();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition192();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity587();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior423();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior389();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition199();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior136();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior743();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition135();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity405();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior186();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity257();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition278();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity750();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition35();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior48();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior152();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior847();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior26();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity232();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior706();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior227();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior595();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior137();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior786();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity669();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior100();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity688();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition204();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition304();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition113();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity91();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition50();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity820();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity635();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity564();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior710();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity825();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity570();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior83();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition94();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity460();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity624();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior449();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition157();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior819();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior819();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity375();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity716();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior106();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition52();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior857();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity779();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior845();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition205();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity21();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter6 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter6.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter6.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter6.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter6.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter6.deserializeObjectUserTaskActivityBehavior100();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter6.deserializeObjectExecutionEntity688();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = serializedObjectSupporter6.deserializeObjectTaskDefinition202();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = serializedObjectSupporter6.deserializeObjectExecutionEntity485();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = executionEntity14.activity;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList16 = executionEntity5.findInactiveConcurrentExecutions((org.activiti.engine.impl.pvm.PvmActivity) activityImpl15);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(executionEntity12);
        org.junit.Assert.assertNotNull(taskDefinition13);
        org.junit.Assert.assertNotNull(executionEntity14);
        org.junit.Assert.assertNotNull(activityImpl15);
        org.junit.Assert.assertNotNull(activityExecutionList16);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior121();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity637();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior793();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity641();
        executionEntity5.setisEventScope(false);
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter8 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter8.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter8.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter8.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter8.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter8.deserializeObjectUserTaskActivityBehavior133();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = serializedObjectSupporter8.deserializeObjectExecutionEntity98();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = serializedObjectSupporter8.deserializeObjectUserTaskActivityBehavior621();
        java.util.List<java.lang.String> strList17 = userTaskActivityBehavior15.extractCandidates("receivePayment");
        executionEntity5.removeVariablesLocal((java.util.Collection<java.lang.String>) strList17);
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior13);
        org.junit.Assert.assertNotNull(executionEntity14);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior15);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior100();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior14();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior491();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity113();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior210();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior273();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior155();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior51();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity664();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition294();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior101();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity704();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior57();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity518();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity401();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior368();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition172();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior815();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition232();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity633();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior45();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior765();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity296();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity717();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity8.subProcessInstance;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNull(executionEntity9);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior284();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior470();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior846();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity769();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity778();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior106();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition52();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior857();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity779();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior547();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior617();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity675();
        java.lang.String str9 = executionEntity8.getId();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5190" + "'", str9, "5190");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity730();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition259();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior584();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity828();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity330();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity506();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity691();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior133();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity98();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior299();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior141();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior106();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior539();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior771();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior721();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior254();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior100();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity688();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition204();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior233();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior358();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity617();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity39();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition346();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity507();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior709();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior770();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity231();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity257();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity222();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity419();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity468();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior386();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior166();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity796();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior82();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity689();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity650();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition63();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior651();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity421();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior668();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior53();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior811();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior78();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity268();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity82();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior754();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior512();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior189();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity9();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior750();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity106();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement4 = executionEntity3.eventSource;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNull(pvmProcessElement4);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity425();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity107();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior17();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition237();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity644();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior17();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity221();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior480();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity538();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior721();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior619();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior806();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity750();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior128();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior467();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition227();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity689();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity650();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior638();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior331();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity421();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior460();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior621();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity799();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior417();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior154();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition339();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior555();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity792();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity531();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity821();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior274();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity750();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity811();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior575();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior26();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity232();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior706();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition98();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition2();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity818();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity707();
        java.lang.String str5 = executionEntity4.getProcessBusinessKey();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3" + "'", str5, "3");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior151();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity585();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity799();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior417();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior154();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior531();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition356();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior480();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity538();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity20();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity82();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity311();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior458();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity549();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior313();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior136();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior816();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity113();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior858();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity421();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior668();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior109();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior62();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition352();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity633();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior45();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity593();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior875();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition30();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity100();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior14();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity82();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior754();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior512();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior189();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity9();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity406();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior480();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior350();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior619();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior654();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior739();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity255();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity524();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior576();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity518();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior44();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity433();
        java.lang.String str5 = executionEntity4.getSuperExecutionId();
        executionEntity4.setCachedEntityState((int) '#');
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior80();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity421();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior668();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior397();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior681();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity863();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity581();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior862();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior832();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior631();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity703();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter6 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter6.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter6.deserializeObjectUserTaskActivityBehavior343();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter6.deserializeObjectUserTaskActivityBehavior134();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter6.deserializeObjectExecutionEntity405();
        executionEntity5.superExecution = executionEntity10;
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity257();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior133();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition332();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity689();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior696();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity810();
        boolean boolean8 = executionEntity7.getdeleteRoot();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity633();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior45();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior765();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior10();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity750();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition35();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior754();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior623();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior442();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity78();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity755();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity421();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior460();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior458();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition232();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior101();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity689();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior739();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior611();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity825();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity570();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior158();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior405();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior654();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior836();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity703();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior280();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity720();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior776();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity270();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity10 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity9.addTask(taskEntity10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity257();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior486();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior637();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition266();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior480();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity538();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior766();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity781();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity660();
        executionEntity8.setEventScope(true);
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior718();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition194();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition3();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior595();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior137();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior786();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior511();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior715();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity82();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior754();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior221();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition188();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity632();
        org.activiti.engine.impl.persistence.entity.VariableScopeImpl variableScopeImpl6 = executionEntity5.getParentVariableScope();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNull(variableScopeImpl6);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior197();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior660();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity39();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior121();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity776();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior472();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity196();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity245();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity703();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior280();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior217();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior798();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity632();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity225();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior620();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity703();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition213();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior836();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior197();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity518();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity643();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior364();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior614();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter6 = userTaskActivityBehavior5.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity689();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity650();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition63();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity715();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter10 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter10.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter10.deserializeObjectExecutionEntity518();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter10.deserializeObjectExecutionEntity483();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter14 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = serializedObjectSupporter14.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior16 = serializedObjectSupporter14.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = serializedObjectSupporter14.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = serializedObjectSupporter14.deserializeObjectExecutionEntity82();
        executionEntity13.replacedBy = executionEntity18;
        executionEntity9.processInstance = executionEntity18;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(executionEntity12);
        org.junit.Assert.assertNotNull(executionEntity13);
        org.junit.Assert.assertNotNull(executionEntity15);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior16);
        org.junit.Assert.assertNotNull(taskDefinition17);
        org.junit.Assert.assertNotNull(executionEntity18);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior197();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity62();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition324();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity196();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior26();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity342();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior547();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity737();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity421();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior439();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior61();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior113();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior423();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior389();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior130();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior458();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity792();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity531();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity821();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity794();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior599();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior623();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity626();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior202();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity52();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition360();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition50();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior839();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition117();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity679();
        java.lang.String str10 = executionEntity9.getCurrentActivityName();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "my task" + "'", str10, "my task");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior564();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition79();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity689();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior696();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior503();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition104();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity366();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior777();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition237();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity349();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior266();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition163();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity39();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity40();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior508();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition237();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity349();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior266();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition163();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior175();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity785();
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList10 = executionEntity9.getJobsInternal();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(jobEntityList10);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity633();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior45();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity593();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior875();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior765();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior52();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior147();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity518();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior44();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity835();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity82();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition242();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior289();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior133();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity836();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition14();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior767();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior683();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity703();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity371();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity433();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior172();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity663();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior302();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity730();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition259();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior584();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity828();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity485();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity767();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior337();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition107();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity435();
        executionEntity4.processDefinitionId = "hi!";
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity257();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior486();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior637();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior463();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity399();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior409();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior106();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition52();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior857();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity779();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior547();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior617();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity675();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity618();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList3 = executionEntity1.getCompensateEventSubscriptions("my task");
        int int4 = executionEntity1.cachedEntityState;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(compensateEventSubscriptionEntityList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity421();
        int int4 = executionEntity3.getRevisionNext();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = executionEntity3.getCachedElContext();
        boolean boolean6 = executionEntity3.deleteRoot;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNull(eLContext5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity750();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity811();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity298();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior451();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity633();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity367();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity40();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior718();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition143();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior531();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity106();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior293();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior820();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity728();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior472();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity717();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity99();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity794();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity792();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity531();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity821();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior804();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior90();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity825();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior436();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity234();
        executionEntity6.setTenantId("Receive Payment");
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition75();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition183();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity632();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior258();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior372();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity346();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity698();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity752();
        java.util.Set<java.lang.String> strSet8 = executionEntity7.getVariableNamesLocal();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior328();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior20();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition181();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity53();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity617();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity39();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition346();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior100();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity447();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity451();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior439();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior705();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity786();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity229();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior121();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity776();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior472();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity196();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior866();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity703();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior280();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity720();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior776();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity270();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity71();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity853();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity108();
        executionEntity6.setConcurrent(true);
        executionEntity6.activityId = "receivePayment";
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior106();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior539();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior771();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior721();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition102();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior600();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior76();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition78();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity4();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity689();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity650();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity235();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior307();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity838();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity421();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior439();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior61();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity764();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior289();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity470();
        java.lang.String str6 = executionEntity5.getEventName();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior100();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity688();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition202();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior122();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior288();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior480();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity538();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior766();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity781();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity417();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior47();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior273();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior313();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition96();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity750();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior679();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity718();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition242();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition228();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior423();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior389();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition199();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity487();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior100();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity688();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition204();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity86();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity703();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior280();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity742();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior184();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition300();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity703();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition213();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition297();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior209();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition258();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior480();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter7 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter7.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter7.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter7.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter7.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter7.deserializeObjectExecutionEntity703();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter7.deserializeObjectUserTaskActivityBehavior280();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = serializedObjectSupporter7.deserializeObjectExecutionEntity742();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = serializedObjectSupporter7.deserializeObjectExecutionEntity441();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = serializedObjectSupporter7.deserializeObjectExecutionEntity795();
        userTaskActivityBehavior6.serializedObjectSupporter = serializedObjectSupporter7;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(taskDefinition11);
        org.junit.Assert.assertNotNull(executionEntity12);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior13);
        org.junit.Assert.assertNotNull(executionEntity14);
        org.junit.Assert.assertNotNull(executionEntity15);
        org.junit.Assert.assertNotNull(executionEntity16);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior121();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity776();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior472();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity196();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity845();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior581();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior26();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity654();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity633();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior45();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior765();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition121();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior367();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior100();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition180();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity841();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity296();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior671();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity423();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity518();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity401();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior368();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition172();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity527();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior290();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity257();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity222();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity419();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity468();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity203();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity5.replacedBy;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNull(executionEntity6);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition97();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior103();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior575();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity605();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition23();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition113();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity91();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity55();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior100();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity688();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition204();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity448();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior121();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity637();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity619();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior197();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity62();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity629();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition107();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition174();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity792();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior845();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior131();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior787();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior133();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior439();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition361();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior79();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity257();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity222();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior429();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior746();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition265();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition192();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity30();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior106();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior539();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior840();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior351();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity703();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition213();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition297();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition96();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior664();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior350();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity726();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity516();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity448();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition12();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior595();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior137();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior786();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior511();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity467();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity633();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity836();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity558();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior805();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition205();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior842();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity875();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior415();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition139();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior7();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior439();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity60();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior582();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior445();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior76();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition78();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior92();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter5 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter5.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter5.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter5.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter5.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter5.deserializeObjectUserTaskActivityBehavior197();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter5.deserializeObjectUserTaskActivityBehavior660();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter5.deserializeObjectTaskDefinition276();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = serializedObjectSupporter5.deserializeObjectTaskDefinition38();
        userTaskActivityBehavior4.taskDefinition = taskDefinition13;
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(taskDefinition12);
        org.junit.Assert.assertNotNull(taskDefinition13);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition360();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition50();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior308();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition231();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition97();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior110();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity618();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity844();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior572();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity241();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity796();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition64();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity820();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior341();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity777();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity511();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity612();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior618();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity335();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity823();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity851();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior550();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior718();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition143();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity32();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior571();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity840();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity421();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior668();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior397();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior681();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior96();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity750();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity811();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity298();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior451();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity633();
        executionEntity7.removeVariableLocal("receivePayment");
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior346();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity292();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior26();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity232();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior706();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition98();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition2();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition269();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior472();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity717();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity99();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition59();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior607();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior455();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior300();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity794();
        java.lang.String str8 = executionEntity7.activityId;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "theTask" + "'", str8, "theTask");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior197();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity62();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition324();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition311();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior267();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior746();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity703();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity371();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity433();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior172();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity93();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity825();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior259();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior505();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity851();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior510();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity449();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition38();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity793();
        int int9 = executionEntity8.getCachedEntityState();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition9();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity786();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition360();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition50();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior839();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition117();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity679();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition21();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior351();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior549();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior571();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior583();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior4.taskDefinition;
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition97();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior344();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition325();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity29();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior340();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity414();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity421();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior460();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior458();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition232();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition321();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior368();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior718();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition143();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity32();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior721();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity69();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNull(executionEntity7);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity703();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior280();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity742();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity648();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior20();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity197();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter0.deserializeObjectTaskDefinition157();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior135();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = serializedObjectSupporter0.deserializeObjectExecutionEntity760();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(taskDefinition12);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior13);
        org.junit.Assert.assertNotNull(executionEntity14);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity421();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior460();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior458();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition232();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior72();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior623();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity626();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity661();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity520();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity617();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity39();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition346();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior415();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition230();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition2();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(taskDefinition10);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition97();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior143();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior30();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior197();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior660();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition276();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior816();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition12();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity257();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity222();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity419();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity468();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition207();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior543();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition199();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity723();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior743();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition135();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity405();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior186();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity36();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior151();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior553();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity689();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior739();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior379();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior820();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity104();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior28();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity305();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity689();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity650();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition63();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior751();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior682();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition237();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity644();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior723();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity417();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity749();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity846();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior106();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition52();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior857();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity779();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior547();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior617();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity675();
        boolean boolean9 = executionEntity8.hasVariables();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior156();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior722();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity13();
        executionEntity5.setConcurrent(false);
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior472();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity717();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity99();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior549();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior317();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter0.deserializeObjectTaskDefinition104();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(taskDefinition11);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior313();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior136();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior239();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior343();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior134();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition346();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior690();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity744();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl8 = executionEntity7.getProcessDefinition();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(processDefinitionImpl8);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition258();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior480();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition269();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior449();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition247();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity317();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition9();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior331();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity53();
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList9 = executionEntity8.getJobsInternal();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(jobEntityList9);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity346();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition306();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity632();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity225();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity628();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior624();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior521();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior343();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior134();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition346();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior690();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior459();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity795();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity82();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity829();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition165();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity730();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior56();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition179();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior308();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior809();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior469();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity518();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity643();
        java.lang.String str4 = executionEntity3.getParentId();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray5 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList6, variableInstanceEntityArray5);
        executionEntity3.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList6);
        boolean boolean10 = executionEntity3.isActive("5771");
        executionEntity3.setBusinessKey("");
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity257();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity222();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity419();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity468();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior300();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior686();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition360();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition50();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior839();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition117();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity679();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition104();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity255();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition237();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior27();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition264();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior217();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity401();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior868();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity108();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity679();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition298();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity237();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition360();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition50();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior839();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity291();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior8();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity707();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition189();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior213();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior840();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior406();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition197();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior197();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior660();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition276();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior4();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior718();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition143();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior791();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior227();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior423();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior389();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior130();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior824();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity397();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior483();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior100();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior14();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior239();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior112();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition301();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior81();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity730();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity23();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity689();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList8 = executionEntity7.getCompensateEventSubscriptions();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(compensateEventSubscriptionEntityList8);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity632();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity225();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior620();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition109();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity534();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity762();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior350();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity216();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior829();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior106();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition52();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity306();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity369();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior763();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity581();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior862();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity34();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition26();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior337();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition107();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior745();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity315();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior549();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior692();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition252();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity369();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior309();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior159();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior137();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior212();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior766();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior147();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity703();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior296();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior450();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity711();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior670();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity518();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity643();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior364();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition118();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior133();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity98();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior299();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity653();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior728();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior231();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior471();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior133();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity836();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition14();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior767();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity579();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior100();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition91();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior840();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity688();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior634();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior121();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity637();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior204();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition305();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior624();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior480();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity538();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter6 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter6.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter6.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter6.deserializeObjectExecutionEntity750();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter6.deserializeObjectTaskDefinition35();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter6.deserializeObjectUserTaskActivityBehavior48();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter6.deserializeObjectUserTaskActivityBehavior152();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter6.deserializeObjectExecutionEntity42();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = serializedObjectSupporter6.deserializeObjectExecutionEntity758();
        executionEntity5.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
        org.junit.Assert.assertNotNull(executionEntity13);
        org.junit.Assert.assertNotNull(executionEntity14);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity825();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior436();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity110();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior172();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition337();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior822();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition360();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition50();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior478();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior549();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior571();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior812();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity633();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior45();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior242();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior249();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity730();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition259();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior584();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior765();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity665();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition148();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity849();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity707();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior214();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior5.getMultiInstanceActivityBehavior();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition237();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity349();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior118();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity704();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior391();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior157();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity729();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior203();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity797();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior274();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior782();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity246();
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity variableInstanceEntity9 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity8.initializeVariableInstanceBackPointer(variableInstanceEntity9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity106();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior869();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity216();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior570();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior343();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior134();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition346();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior690();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity371();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition113();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior394();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition130();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior502();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity257();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior160();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior483();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition262();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity108();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity794();
        executionEntity7.setExecutionListenerIndex((java.lang.Integer) 3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior549();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior692();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior662();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition44();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior77();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior47();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity386();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior857();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior197();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior34();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior81();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior551();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity730();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity23();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity713();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity780();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity518();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity401();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior368();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition172();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity527();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition310();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior623();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity626();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity661();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior605();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior504();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior313();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior459();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity311();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior149();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior546();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior350();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity682();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity77();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior121();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity776();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition43();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity837();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior133();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity98();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior621();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior682();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior647();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity730();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition259();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior584();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity828();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity485();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior847();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity730();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition259();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior584();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity325();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior14();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity108();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity679();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior224();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity237();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        executionEntity3.setEventScope(false);
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior718();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition143();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity202();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior601();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity581();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity290();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior455();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity790();
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity7 = null;
        executionEntity6.removeEventSubscription(eventSubscriptionEntity7);
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior549();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior692();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition252();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity369();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior750();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition24();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior718();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition143();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior791();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition346();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior133();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity98();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior410();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior251();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior873();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition48();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity633();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior45();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior765();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity619();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior841();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior699();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity689();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior739();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior379();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior820();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity104();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior374();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior93();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter0.deserializeObjectExecutionEntity382();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(executionEntity12);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior245();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity291();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity831();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity617();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity39();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition346();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity507();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior709();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition177();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity106();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity3.superExecution;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = executionEntity4.isScope();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNull(executionEntity4);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity703();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior280();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity742();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity441();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior648();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior475();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter0.deserializeObjectTaskDefinition35();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(taskDefinition11);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity730();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition259();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior584();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior765();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity665();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition148();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior824();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity421();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior66();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior153();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity706();
        java.lang.String str7 = executionEntity6.getDeleteReason();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity421();
        int int4 = executionEntity3.getRevisionNext();
        boolean boolean5 = executionEntity3.isActivityIdUsedForDetails();
        boolean boolean6 = executionEntity3.getisEnded();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior718();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior607();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior835();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity518();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity401();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior368();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition172();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior815();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity31();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior121();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity776();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior472();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity30();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior705();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity658();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior723();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior472();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity717();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity99();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior618();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition321();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity633();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior45();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior645();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity298();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior196();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior52();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity680();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity4();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior52();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity680();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity268();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior328();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior20();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior823();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior791();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior659();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior576();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity80();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition87();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior302();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior3();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior245();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity259();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition288();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior284();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior313();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior459();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior524();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior687();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior17();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior100();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity688();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior811();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior580();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior484();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition77();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity756();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity633();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior45();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity593();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity460();
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity7.performOperationSync(atomicOperation8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior718();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior706();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition118();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition109();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior718();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition143();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity202();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior601();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity699();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior202();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior217();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition308();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity730();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior293();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity642();
        boolean boolean8 = executionEntity7.getisActive();
        executionEntity7.ensureParentInitialized();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition360();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition50();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior839();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition117();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity679();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition21();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior600();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity750();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior679();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity718();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior420();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity82();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior754();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity371();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity689();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior739();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior379();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior820();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity104();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior58();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity730();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity637();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity335();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior603();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior480();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity538();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior766();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity781();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior223();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity852();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity633();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior45();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior645();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition85();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior350();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior667();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior743();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition135();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity405();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity377();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition237();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior27();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition264();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior449();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior664();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior111();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity10 = null;
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter11 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter11.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter11.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior14 = serializedObjectSupporter11.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = serializedObjectSupporter11.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior16 = serializedObjectSupporter11.deserializeObjectUserTaskActivityBehavior284();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = serializedObjectSupporter11.deserializeObjectExecutionEntity700();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = serializedObjectSupporter11.deserializeObjectExecutionEntity268();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior9.handleAssignments(taskEntity10, (org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity12);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior13);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior14);
        org.junit.Assert.assertNotNull(executionEntity15);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior16);
        org.junit.Assert.assertNotNull(executionEntity17);
        org.junit.Assert.assertNotNull(executionEntity18);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior472();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity717();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity99();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior549();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior317();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior673();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity792();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity531();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity821();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity794();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior537();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity364();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition237();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity349();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior266();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity37();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior87();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity633();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior45();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior242();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior208();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior254();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior479();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior343();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior134();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity277();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior350();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity726();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity382();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter5 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter5.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter5.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter5.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter5.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter5.deserializeObjectExecutionEntity730();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter5.deserializeObjectExecutionEntity637();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter5.deserializeObjectExecutionEntity524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter5.deserializeObjectExecutionEntity88();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList14 = executionEntity13.getEventSubscriptions();
        executionEntity4.eventSubscriptions = eventSubscriptionEntityList14;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(executionEntity12);
        org.junit.Assert.assertNotNull(executionEntity13);
        org.junit.Assert.assertNotNull(eventSubscriptionEntityList14);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior197();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior660();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity822();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity515();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity542();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior121();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity637();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior793();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition178();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior818();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity851();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior510();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity449();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior75();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition268();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity377();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity82();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity311();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity441();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior534();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity703();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity371();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity433();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior172();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity93();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity239();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity689();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior739();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior379();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior820();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity104();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity389();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior133();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity826();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior133();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition47();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition196();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity425();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity107();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior205();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior284();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity616();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior537();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition295();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity825();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity570();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior139();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity397();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity194();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition113();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity758();
        boolean boolean4 = executionEntity3.isActivityIdUsedForDetails();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition237();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity349();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior118();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity704();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior52();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity680();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList6 = executionEntity5.getEventSubscriptionsInternal();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(eventSubscriptionEntityList6);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior480();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior350();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition256();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity797();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity751();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior106();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition52();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity306();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity369();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior379();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior239();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior133();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity98();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior299();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity715();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity421();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior66();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior157();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition238();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior58();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity95();
        java.lang.String str5 = executionEntity4.getProcessDefinitionId();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "concurrent:1:1087" + "'", str5, "concurrent:1:1087");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior341();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior250();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior858();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity483();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition164();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior743();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior249();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity518();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior44();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior730();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity572();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity425();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity107();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior190();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity716();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity838();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior549();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity802();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity750();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition35();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior48();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior152();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity42();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity758();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity802();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior121();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity776();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior825();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity613();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior203();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity378();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity701();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior51();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity664();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition294();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior772();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity382();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior526();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity617();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity39();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition346();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity751();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity807();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior313();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior459();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior134();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior341();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity777();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity511();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity612();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity293();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity439();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior439();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior705();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity786();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity604();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior659();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior576();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity80();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition87();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior302();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition348();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior428();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior203();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity797();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior274();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity284();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior301();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity581();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior862();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior832();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity94();
        executionEntity7.setActive(true);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior343();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior134();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition346();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior9();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity638();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity69();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNull(executionEntity8);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity750();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition35();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior402();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition285();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior181();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior228();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity810();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity676();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity470();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter0.deserializeObjectExecutionEntity721();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(executionEntity12);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity689();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior99();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity100();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity810();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior840();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior271();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior653();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity864();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior203();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity797();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity25();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior218();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior337();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition107();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity238();
        executionEntity4.isConcurrent = true;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity796();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition185();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity302();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity421();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition300();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity108();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity59();
        java.lang.String str7 = executionEntity6.superExecutionId;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior51();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior288();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity851();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior510();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition210();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior122();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior480();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity538();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior16();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity804();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity834();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior100();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity688();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition202();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity485();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity268();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior106();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition52();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity306();
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList5 = null;
        executionEntity4.executions = executionEntityList5;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior618();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior847();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition221();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity457();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior549();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior692();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition252();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity369();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior216();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity518();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity401();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior368();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition172();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior815();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior383();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity757();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior743();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity527();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity684();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity584();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition237();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity644();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior723();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity97();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior284();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity700();
        boolean boolean7 = executionEntity6.getisScope();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity8 = null;
        executionEntity6.addJob(jobEntity8);
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition237();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity349();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior118();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity704();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity115();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior873();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity703();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition213();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity864();
        java.lang.String str8 = executionEntity7.processInstanceId;
        boolean boolean9 = executionEntity7.getforcedUpdate();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "6268" + "'", str8, "6268");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior100();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity671();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition12();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity421();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior668();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior53();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition161();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior210();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition40();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior343();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior134();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity65();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition184();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity703();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior280();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity720();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior776();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity270();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity71();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior480();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity257();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior486();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior637();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity54();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior549();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior692();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity115();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity656();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition192();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity108();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity679();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior224();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior237();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior171();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity824();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity689();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity650();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition63();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior77();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity257();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity222();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity419();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity468();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition207();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior629();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior100();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity688();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior811();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior580();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior751();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity626();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity687();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity633();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior45();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity593();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior875();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition30();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity100();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior77();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior760();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity730();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity23();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity689();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity612();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior816();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity634();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior158();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior718();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior607();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity82();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity774();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior121();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity776();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior825();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior834();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior100();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition180();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity810();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity497();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior842();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity875();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior415();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity231();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior602();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition237();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity349();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior266();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition163();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity39();
        executionEntity8.deleteRoot = true;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity421();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior668();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior673();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition292();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior196();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior718();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior706();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior855();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity208();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior743();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior338();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior602();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity731();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior831();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity431();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior743();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition135();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity197();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior152();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity689();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior739();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior202();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity307();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior851();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition258();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior480();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition269();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior449();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity91();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior106();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition52();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity306();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity369();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior59();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior197();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity62();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition324();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity196();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity421();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior549();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior692();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior662();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior41();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition86();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity518();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior572();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior16();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity624();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior449();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition157();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior486();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity689();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior696();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior660();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition140();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition237();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity644();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity770();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity668();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior223();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior26();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity342();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior547();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior350();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition237();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity644();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior723();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity417();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity749();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition353();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity421();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior460();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior458();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition43();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior586();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity98();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity613();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity792();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior845();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition238();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior718();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition143();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity32();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior500();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior818();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity203();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior156();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition96();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior434();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior596();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior774();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity758();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition184();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity792();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity531();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter5 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter5.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter5.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter5.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter5.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter5.deserializeObjectUserTaskActivityBehavior284();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter5.deserializeObjectExecutionEntity700();
        executionEntity4.superExecution = executionEntity11;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity858();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior284();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior470();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior846();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior237();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior544();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity703();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior280();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity720();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior776();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity270();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior501();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity570();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior381();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior220();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity633();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior45();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity593();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition255();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity425();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity107();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior190();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity412();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity689();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior739();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior379();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity679();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior128();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior121();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity776();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior825();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity613();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior203();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity378();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition250();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity230();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity257();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior160();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior658();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior133();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity98();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior621();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior751();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior527();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior549();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior692();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition252();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity369();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity812();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior834();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior360();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity825();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior108();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity123();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior822();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity328();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior346();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity9();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity699();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior21();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity750();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior679();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity718();
        long long6 = executionEntity5.getserialVersionUID();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior572();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity664();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity63();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior121();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity776();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior825();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior834();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior13();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior47();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity386();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior519();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior829();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity257();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior743();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior106();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition52();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity306();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity369();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior265();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition250();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior439();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity60();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior582();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior114();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity619();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity54();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = null;
        executionEntity11.setTransitionBeingTaken(transitionImpl12);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior350();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity726();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity516();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity448();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition124();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity451();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior528();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity633();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior45();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior655();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity474();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior106();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior604();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior413();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity344();
        java.lang.String str6 = executionEntity5.superExecutionId;
        executionEntity5.setisConcurrent(true);
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity730();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition259();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity292();
        org.slf4j.Logger logger8 = executionEntity7.getlog();
        executionEntity7.setSuspensionState((int) (short) 0);
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(logger8);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition360();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition50();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior839();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity291();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition7();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior106();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior539();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior771();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior721();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity652();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition97();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior765();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior26();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior334();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition293();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity703();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior280();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity742();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity441();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior648();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior746();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior343();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior134();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition346();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition178();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior153();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior637();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior549();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior692();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition252();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity369();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior216();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior609();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior313();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity666();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity707();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior550();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior754();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity591();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior480();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity538();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior766();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity781();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior729();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity257();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity222();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior429();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity761();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior106();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition52();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior857();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity106();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity534();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition75();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity726();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior870();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity733();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior121();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity637();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior443();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior608();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity627();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity851();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior510();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity829();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior87();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity839();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior596();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior718();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition143();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity111();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity772();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity781();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior284();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior197();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity62();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition324();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition226();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior227();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity851();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity815();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior681();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior281();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior236();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior325();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior490();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition113();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity91();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition255();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior833();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity797();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity689();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity650();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition63();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity243();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity236();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior175();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter0.deserializeObjectTaskDefinition23();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter0.deserializeObjectExecutionEntity453();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior484();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(taskDefinition11);
        org.junit.Assert.assertNotNull(executionEntity12);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior13);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition58();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity703();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition213();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition297();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition96();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior629();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior337();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior712();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior506();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition152();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior560();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior480();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity538();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior16();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition195();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior439();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity492();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity623();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior836();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity759();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity219();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity633();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity836();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity649();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity257();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior486();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity677();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity241();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior541();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior541();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior121();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior5();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition201();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity625();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity645();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition113();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity529();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity288();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior343();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior134();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition346();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior690();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior154();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity538();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior307();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity222();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior598();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity632();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior258();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity468();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior659();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior576();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity80();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition87();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior302();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior459();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity579();
        org.junit.Assert.assertNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior513();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition155();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition111();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity702();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior313();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition96();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity765();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity793();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior356();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity518();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity401();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior368();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior780();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity545();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }
}

